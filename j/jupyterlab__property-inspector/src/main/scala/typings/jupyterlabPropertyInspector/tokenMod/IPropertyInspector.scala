package typings.jupyterlabPropertyInspector.tokenMod

import typings.luminoDisposable.mod.IDisposable
import typings.luminoWidgets.mod.Widget
import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPropertyInspector extends IDisposable {
  def render(content: Widget): Unit = js.native
  def render(content: ReactElement): Unit = js.native
  /**
    * Show the property inspector panel.
    *
    * If the owner widget is not the most recently focused,
    * this is a no-op.  It should be triggered by a user
    * action.
    */
  def showPanel(): Unit = js.native
}

