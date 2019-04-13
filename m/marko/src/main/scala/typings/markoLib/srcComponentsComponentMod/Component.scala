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
  /* InferMemberOverrides */
  override def addListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def addListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  def destroy(): scala.Unit = js.native
  def elId(key: java.lang.String): java.lang.String = js.native
  def elId(key: java.lang.String, index: scala.Double): java.lang.String = js.native
  /* InferMemberOverrides */
  override def emit(event: java.lang.String, args: js.Any*): scala.Boolean = js.native
  /* InferMemberOverrides */
  override def emit(event: js.Symbol, args: js.Any*): scala.Boolean = js.native
  /* InferMemberOverrides */
  override def eventNames(): js.Array[java.lang.String | js.Symbol] = js.native
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
  /* InferMemberOverrides */
  override def getMaxListeners(): scala.Double = js.native
  def isDestroyed(): scala.Boolean = js.native
  /* InferMemberOverrides */
  override def listenerCount(`type`: java.lang.String): scala.Double = js.native
  /* InferMemberOverrides */
  override def listenerCount(`type`: js.Symbol): scala.Double = js.native
  /* InferMemberOverrides */
  override def listeners(event: java.lang.String): js.Array[js.Function] = js.native
  /* InferMemberOverrides */
  override def listeners(event: js.Symbol): js.Array[js.Function] = js.native
  /* InferMemberOverrides */
  override def off(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def off(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def on(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def on(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def once(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def once(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  // Added in Node 6...
  /* InferMemberOverrides */
  override def prependListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def prependListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def prependOnceListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def prependOnceListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def rawListeners(event: java.lang.String): js.Array[js.Function] = js.native
  /* InferMemberOverrides */
  override def rawListeners(event: js.Symbol): js.Array[js.Function] = js.native
  /* InferMemberOverrides */
  override def removeAllListeners(): this.type = js.native
  /* InferMemberOverrides */
  override def removeAllListeners(event: java.lang.String): this.type = js.native
  /* InferMemberOverrides */
  override def removeAllListeners(event: js.Symbol): this.type = js.native
  /* InferMemberOverrides */
  override def removeListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def removeListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  def replaceState(newState: js.Any): scala.Unit = js.native
  /* InferMemberOverrides */
  override def setMaxListeners(n: scala.Double): this.type = js.native
  def setState(name: java.lang.String, value: js.Any): scala.Unit = js.native
  def setState(name: js.Any): scala.Unit = js.native
  def setStateDirty(name: java.lang.String): scala.Unit = js.native
  def setStateDirty(name: java.lang.String, value: js.Any): scala.Unit = js.native
  def shouldUpdate(newState: js.Any, newProps: js.Any): scala.Boolean = js.native
  def update(): scala.Unit = js.native
}

