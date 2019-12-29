package typings.atMaterialTabDashIndicator

import typings.atMaterialBase.foundationMod.MDCFoundation
import typings.atMaterialTabDashIndicator.adapterMod.MDCTabIndicatorAdapter
import typings.std.ClientRect
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/tab-indicator/foundation", JSImport.Namespace)
@js.native
object foundationMod extends js.Object {
  @js.native
  abstract class MDCTabIndicatorFoundation () extends MDCFoundation[MDCTabIndicatorAdapter] {
    def this(adapter: Partial[MDCTabIndicatorAdapter]) = this()
    def activate(): Unit = js.native
    def activate(previousIndicatorClientRect: ClientRect): Unit = js.native
    def computeContentClientRect(): ClientRect = js.native
    def deactivate(): Unit = js.native
    // Subclasses should override this method to perform de-initialization routines (de-registering events, etc.)
    /* CompleteClass */
    override def destroy(): Unit = js.native
    // Subclasses should override this method to perform initialization routines (registering events, etc.)
    /* CompleteClass */
    override def init(): Unit = js.native
  }
  
  @js.native
  abstract class default () extends MDCTabIndicatorFoundation {
    def this(adapter: Partial[MDCTabIndicatorAdapter]) = this()
  }
  
  /* static members */
  @js.native
  object MDCTabIndicatorFoundation extends js.Object {
    val cssClasses: Anon_ACTIVE = js.native
    val defaultAdapter: MDCTabIndicatorAdapter = js.native
    val strings: Anon_CONTENTSELECTOR = js.native
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    val cssClasses: Anon_ACTIVE = js.native
    val defaultAdapter: MDCTabIndicatorAdapter = js.native
    val strings: Anon_CONTENTSELECTOR = js.native
  }
  
}

