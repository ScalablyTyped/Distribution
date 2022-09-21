package typings.html2canvas

import typings.html2canvas.boundsMod.Bounds
import typings.html2canvas.elementContainerMod.ElementContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object boxSizingMod {
  
  @JSImport("html2canvas/dist/types/render/box-sizing", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def contentBox(element: ElementContainer): Bounds = ^.asInstanceOf[js.Dynamic].applyDynamic("contentBox")(element.asInstanceOf[js.Any]).asInstanceOf[Bounds]
  
  inline def paddingBox(element: ElementContainer): Bounds = ^.asInstanceOf[js.Dynamic].applyDynamic("paddingBox")(element.asInstanceOf[js.Any]).asInstanceOf[Bounds]
}
