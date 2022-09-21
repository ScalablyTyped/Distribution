package typings.imageSize

import typings.imageSize.typesMod.imageType
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object detectorMod {
  
  @JSImport("image-size/dist/detector", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def detector(buffer: Buffer): js.UndefOr[imageType] = ^.asInstanceOf[js.Dynamic].applyDynamic("detector")(buffer.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[imageType]]
}
