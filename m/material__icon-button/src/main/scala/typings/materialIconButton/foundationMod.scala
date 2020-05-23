package typings.materialIconButton

import typings.materialBase.foundationMod.MDCFoundation
import typings.materialIconButton.adapterMod.MDCIconButtonToggleAdapter
import typings.materialIconButton.anon.ARIAPRESSED
import typings.materialIconButton.anon.ICONBUTTONON
import typings.materialIconButton.anon.PartialMDCIconButtonToggl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/icon-button/foundation", JSImport.Namespace)
@js.native
object foundationMod extends js.Object {
  @js.native
  class MDCIconButtonToggleFoundation () extends MDCFoundation[MDCIconButtonToggleAdapter] {
    def this(adapter: PartialMDCIconButtonToggl) = this()
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
    def this(adapter: PartialMDCIconButtonToggl) = this()
  }
  
  /* static members */
  @js.native
  object MDCIconButtonToggleFoundation extends js.Object {
    val cssClasses: ICONBUTTONON = js.native
    val defaultAdapter: MDCIconButtonToggleAdapter = js.native
    val strings: ARIAPRESSED = js.native
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    val cssClasses: ICONBUTTONON = js.native
    val defaultAdapter: MDCIconButtonToggleAdapter = js.native
    val strings: ARIAPRESSED = js.native
  }
  
}

