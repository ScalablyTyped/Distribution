package typings
package markoLib.srcComponentsComponentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Component
  extends nodeLib.eventsMod.EventEmitter
     with markoLib.srcRuntimeDomElementMod.DomElement {
  /** @deprecated */
  var el: stdLib.HTMLElement = js.native
  /** @deprecated */
  var els: js.Array[stdLib.HTMLElement] = js.native
  var id: java.lang.String = js.native
  var input: js.Any = js.native
  var state: js.Any = js.native
  def apply(id: java.lang.String): this.type = js.native
  def destroy(): scala.Unit = js.native
  def elId(key: java.lang.String): java.lang.String = js.native
  def elId(key: java.lang.String, index: scala.Double): java.lang.String = js.native
  def forceUpdate(): scala.Unit = js.native
  def getComponent(key: java.lang.String): Component = js.native
  def getComponent(key: java.lang.String, index: scala.Double): Component = js.native
  def getComponents(key: java.lang.String): js.Array[Component] = js.native
  def getEl(): stdLib.HTMLElement = js.native
  def getEl(key: java.lang.String): stdLib.HTMLElement = js.native
  def getEl(key: java.lang.String, index: scala.Double): stdLib.HTMLElement = js.native
  def getElId(key: java.lang.String): java.lang.String = js.native
  def getElId(key: java.lang.String, index: scala.Double): java.lang.String = js.native
  def getEls(): js.Array[stdLib.HTMLElement] = js.native
  def getEls(key: java.lang.String): js.Array[stdLib.HTMLElement] = js.native
  def isDestroyed(): scala.Boolean = js.native
  def replaceState(newState: js.Any): scala.Unit = js.native
  def setState(name: java.lang.String, value: js.Any): scala.Unit = js.native
  def setState(name: js.Any): scala.Unit = js.native
  def setStateDirty(name: java.lang.String): scala.Unit = js.native
  def setStateDirty(name: java.lang.String, value: js.Any): scala.Unit = js.native
  def shouldUpdate(newState: js.Any, newProps: js.Any): scala.Boolean = js.native
  def update(): scala.Unit = js.native
}

