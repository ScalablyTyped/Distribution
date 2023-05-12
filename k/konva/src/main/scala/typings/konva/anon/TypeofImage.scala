package typings.konva.anon

import org.scalablytyped.runtime.Instantiable1
import typings.konva.libShapesImageMod.Image
import typings.konva.libShapesImageMod.ImageConfig
import typings.std.OnErrorEventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofImage
  extends StObject
     with Instantiable1[/* attrs */ ImageConfig, Image] {
  
  def fromURL(url: String, callback: js.Function1[/* img */ Image, Unit]): Unit = js.native
  def fromURL(url: String, callback: js.Function1[/* img */ Image, Unit], onError: OnErrorEventHandler): Unit = js.native
}
