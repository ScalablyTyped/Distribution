package typings.marko

import typings.marko.srcComponentsComponentMod.Component
import typings.marko.srcRuntimeDomElementMod.DomElement
import typings.node.eventsMod.EventEmitter
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("marko/src/components/Component", JSImport.Namespace)
@js.native
object srcComponentsComponentMod extends js.Object {
  @js.native
  trait Component
    extends EventEmitter
       with DomElement {
    /** @deprecated */
    var el: HTMLElement = js.native
    /** @deprecated */
    var els: js.Array[HTMLElement] = js.native
    var id: String = js.native
    var input: js.Any = js.native
    var state: js.Any = js.native
    def apply(id: String): this.type = js.native
    /* InferMemberOverrides */
    override def addListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    /* InferMemberOverrides */
    override def addListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def destroy(): Unit = js.native
    def elId(key: String): String = js.native
    def elId(key: String, index: Double): String = js.native
    /* InferMemberOverrides */
    override def emit(event: String, args: js.Any*): Boolean = js.native
    /* InferMemberOverrides */
    override def emit(event: js.Symbol, args: js.Any*): Boolean = js.native
    /* InferMemberOverrides */
    override def eventNames(): js.Array[String | js.Symbol] = js.native
    def forceUpdate(): Unit = js.native
    def getComponent(key: String): Component = js.native
    def getComponent(key: String, index: Double): Component = js.native
    def getComponents(key: String): js.Array[Component] = js.native
    def getEl(): HTMLElement = js.native
    def getEl(key: String): HTMLElement = js.native
    def getEl(key: String, index: Double): HTMLElement = js.native
    def getElId(key: String): String = js.native
    def getElId(key: String, index: Double): String = js.native
    def getEls(): js.Array[HTMLElement] = js.native
    def getEls(key: String): js.Array[HTMLElement] = js.native
    /* InferMemberOverrides */
    override def getMaxListeners(): Double = js.native
    def isDestroyed(): Boolean = js.native
    /* InferMemberOverrides */
    override def listenerCount(`type`: String): Double = js.native
    /* InferMemberOverrides */
    override def listenerCount(`type`: js.Symbol): Double = js.native
    /* InferMemberOverrides */
    override def listeners(event: String): js.Array[js.Function] = js.native
    /* InferMemberOverrides */
    override def listeners(event: js.Symbol): js.Array[js.Function] = js.native
    /* InferMemberOverrides */
    override def off(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    /* InferMemberOverrides */
    override def off(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    /* InferMemberOverrides */
    override def on(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    /* InferMemberOverrides */
    override def on(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    /* InferMemberOverrides */
    override def once(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    /* InferMemberOverrides */
    override def once(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    // Added in Node 6...
    /* InferMemberOverrides */
    override def prependListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    /* InferMemberOverrides */
    override def prependListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    /* InferMemberOverrides */
    override def prependOnceListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    /* InferMemberOverrides */
    override def prependOnceListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    /* InferMemberOverrides */
    override def rawListeners(event: String): js.Array[js.Function] = js.native
    /* InferMemberOverrides */
    override def rawListeners(event: js.Symbol): js.Array[js.Function] = js.native
    /* InferMemberOverrides */
    override def removeAllListeners(): this.type = js.native
    /* InferMemberOverrides */
    override def removeAllListeners(event: String): this.type = js.native
    /* InferMemberOverrides */
    override def removeAllListeners(event: js.Symbol): this.type = js.native
    /* InferMemberOverrides */
    override def removeListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    /* InferMemberOverrides */
    override def removeListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def replaceState(newState: js.Any): Unit = js.native
    /* InferMemberOverrides */
    override def setMaxListeners(n: Double): this.type = js.native
    def setState(name: String, value: js.Any): Unit = js.native
    def setState(name: js.Any): Unit = js.native
    def setStateDirty(name: String): Unit = js.native
    def setStateDirty(name: String, value: js.Any): Unit = js.native
    def shouldUpdate(newState: js.Any, newProps: js.Any): Boolean = js.native
    def update(): Unit = js.native
  }
  
}

