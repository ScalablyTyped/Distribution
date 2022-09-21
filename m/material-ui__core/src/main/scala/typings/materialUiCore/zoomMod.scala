package typings.materialUiCore

import typings.materialUiCore.zoomZoomMod.ZoomProps
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object zoomMod {
  
  @JSImport("@material-ui/core/Zoom", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: ZoomProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
}
