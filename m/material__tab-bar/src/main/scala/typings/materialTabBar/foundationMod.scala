package typings.materialTabBar

import typings.materialBase.foundationMod.MDCFoundation
import typings.materialTabBar.adapterMod.MDCTabBarAdapter
import typings.std.KeyboardEvent
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/tab-bar/foundation", JSImport.Namespace)
@js.native
object foundationMod extends js.Object {
  @js.native
  class MDCTabBarFoundation () extends MDCFoundation[MDCTabBarAdapter] {
    def this(adapter: Partial[MDCTabBarAdapter]) = this()
    def activateTab(index: Double): Unit = js.native
    // Subclasses should override this method to perform de-initialization routines (de-registering events, etc.)
    /* CompleteClass */
    override def destroy(): Unit = js.native
    def handleKeyDown(evt: KeyboardEvent): Unit = js.native
    /**
      * Handles the MDCTab:interacted event
      */
    def handleTabInteraction(
      evt: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MDCTabInteractionEvent */ js.Any
    ): Unit = js.native
    // Subclasses should override this method to perform initialization routines (registering events, etc.)
    /* CompleteClass */
    override def init(): Unit = js.native
    /**
      * Scrolls the tab at the given index into view
      * @param index The tab index to make visible
      */
    def scrollIntoView(index: Double): Unit = js.native
    /**
      * Switches between automatic and manual activation modes.
      * See https://www.w3.org/TR/wai-aria-practices/#tabpanel for examples.
      */
    def setUseAutomaticActivation(useAutomaticActivation: Boolean): Unit = js.native
  }
  
  @js.native
  class default () extends MDCTabBarFoundation {
    def this(adapter: Partial[MDCTabBarAdapter]) = this()
  }
  
  /* static members */
  @js.native
  object MDCTabBarFoundation extends js.Object {
    val defaultAdapter: MDCTabBarAdapter = js.native
    val numbers: AnonARROWLEFTKEYCODE = js.native
    val strings: AnonARROWLEFTKEY = js.native
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    val defaultAdapter: MDCTabBarAdapter = js.native
    val numbers: AnonARROWLEFTKEYCODE = js.native
    val strings: AnonARROWLEFTKEY = js.native
  }
  
}

