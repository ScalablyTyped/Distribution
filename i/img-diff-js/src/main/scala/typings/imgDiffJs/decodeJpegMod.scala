package typings.imgDiffJs

import typings.imgDiffJs.typesMod.ImageData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object decodeJpegMod {
  
  @JSImport("img-diff-js/lib/decode-jpeg", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(filename: String): js.Promise[ImageData] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(filename.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ImageData]]
}
