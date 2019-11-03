package typings.atMaterialIconDashButton

import typings.atMaterialBase.foundationMod.MDCFoundation
import typings.atMaterialIconDashButton.adapterMod.MDCIconButtonToggleAdapter
import typings.atMaterialIconDashButton.foundationMod.MDCIconButtonToggleFoundation
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/icon-button/foundation", JSImport.Namespace)
@js.native
object foundationMod extends js.Object {
  @js.native
  class MDCIconButtonToggleFoundation () extends MDCFoundation[MDCIconButtonToggleAdapter] {
    def this(adapter: Partial[MDCIconButtonToggleAdapter]) = this()
    // Subclasses should override this method to perform de-initialization routines (de-registering events, etc.)
    /* CompleteClass */
    override def destroy(): Unit = js.native
    def handleClick(): Unit = js.native
    // Subclasses should override this method to perform initialization routines (registering events, etc.)
    /* CompleteClass */
    override def init(): Unit = js.native
    def isOn(): Boolean = js.native
    def toggle(): Unit = js.native
    def toggle(isOn: Boolean): Unit = js.native
  }
  
  @js.native
  class default () extends MDCIconButtonToggleFoundation {
    def this(adapter: Partial[MDCIconButtonToggleAdapter]) = this()
  }
  
  /* static members */
  @js.native
  object MDCIconButtonToggleFoundation extends js.Object {
    val cssClasses: Anon_ICONBUTTONON = js.native
    val defaultAdapter: MDCIconButtonToggleAdapter = js.native
    val strings: Anon_ARIAPRESSED = js.native
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    val cssClasses: Anon_ICONBUTTONON = js.native
    val defaultAdapter: MDCIconButtonToggleAdapter = js.native
    val strings: Anon_ARIAPRESSED = js.native
  }
  
}

