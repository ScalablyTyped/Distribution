package typings.jqueryTools

import typings.jqueryTools.JQueryTools.overlay.Overlay
import typings.jqueryTools.JQueryTools.overlay.OverlayOptions
import typings.jqueryTools.jqueryToolsStrings.overlay
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuery extends StObject {
  
  @JSName("data")
  def data_overlay(key: overlay): Overlay = js.native
  
  def overlay(): JQuery = js.native
  def overlay(opts: OverlayOptions): JQuery = js.native
  @JSName("overlay")
  def overlay_T_Overlay_T[T /* <: Overlay */](): T = js.native
  @JSName("overlay")
  def overlay_T_Overlay_T[T /* <: Overlay */](opts: OverlayOptions): T = js.native
}
