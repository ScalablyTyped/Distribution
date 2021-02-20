package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.zoomZoomMod.ZoomProps
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object zoomMod extends Shortcut {
  
  @JSImport("@material-ui/core/Zoom", JSImport.Default)
  @js.native
  val default: ComponentType[ZoomProps] = js.native
  
  type _To = ComponentType[ZoomProps]
  
  /* This means you don't have to write `default`, but can instead just say `zoomMod.foo` */
  override def _to: ComponentType[ZoomProps] = default
}
