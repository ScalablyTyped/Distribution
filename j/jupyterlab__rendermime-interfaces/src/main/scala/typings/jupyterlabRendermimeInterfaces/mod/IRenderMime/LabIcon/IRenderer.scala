package typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.LabIcon

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for generic renderer.
  */
@js.native
trait IRenderer extends js.Object {
  
  def render(container: HTMLElement): Unit = js.native
  def render(container: HTMLElement, options: js.Any): Unit = js.native
  
  def unrender(container: HTMLElement): Unit = js.native
}
