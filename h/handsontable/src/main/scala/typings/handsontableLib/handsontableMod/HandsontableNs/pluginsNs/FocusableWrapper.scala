package typings
package handsontableLib.handsontableMod.HandsontableNs.pluginsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait FocusableWrapper extends js.Object {
  var eventManager: EventManager
  var listenersCount: stdLib.WeakSet[stdLib.HTMLElement]
  var mainElement: stdLib.HTMLElement
  def focus(): scala.Unit
  def getFocusableElement(): stdLib.HTMLElement
  def setFocusableElement(element: stdLib.HTMLElement): scala.Unit
  def useSecondaryElement(): scala.Unit
}

