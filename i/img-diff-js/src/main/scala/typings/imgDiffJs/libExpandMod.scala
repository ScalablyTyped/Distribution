package typings.imgDiffJs

import typings.imgDiffJs.anon.DataList
import typings.imgDiffJs.libTypesMod.ImageData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libExpandMod {
  
  @JSImport("img-diff-js/lib/expand", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(img1: ImageData, img2: ImageData): DataList = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(img1.asInstanceOf[js.Any], img2.asInstanceOf[js.Any])).asInstanceOf[DataList]
}
