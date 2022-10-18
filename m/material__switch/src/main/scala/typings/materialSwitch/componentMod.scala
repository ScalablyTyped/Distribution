package typings.materialSwitch

import typings.materialBase.componentMod.MDCComponent
import typings.materialRipple.adapterMod.MDCRippleAdapter
import typings.materialRipple.componentMod.MDCRipple
import typings.materialRipple.foundationMod.MDCRippleFoundation
import typings.materialSwitch.adapterMod.MDCSwitchRenderAdapter
import typings.materialSwitch.adapterMod.MDCSwitchState
import typings.materialSwitch.foundationMod.MDCSwitchRenderFoundation
import typings.std.HTMLButtonElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.materialRipple.typesMod.MDCRippleCapableSurface because var conflicts: disabled, root. Inlined unbounded */ @JSImport("@material/switch/component", "MDCSwitch")
  @js.native
  open class MDCSwitch protected ()
    extends MDCComponent[MDCSwitchRenderFoundation]
       with MDCSwitchState {
    def this(root: HTMLButtonElement) = this()
    def this(root: HTMLButtonElement, foundation: MDCSwitchRenderFoundation) = this()
    
    /* protected */ def createAdapter(): MDCSwitchRenderAdapter = js.native
    
    /* protected */ def createRippleAdapter(): MDCRippleAdapter = js.native
    
    /* protected */ def createRippleFoundation(): MDCRippleFoundation = js.native
    
    /**
      * Indicates whether or not the switch is disabled.
      */
    /* CompleteClass */
    var disabled: Boolean = js.native
    
    def initialize(): Unit = js.native
    
    /**
      * Indicates whether or not the switch is processing and showing a loading
      * indicator. A disabled switch cannot be processing.
      */
    /* CompleteClass */
    var processing: Boolean = js.native
    
    var ripple: MDCRipple = js.native
    
    /* private */ var rippleElement: Any = js.native
    
    @JSName("root")
    var root_MDCSwitch: HTMLButtonElement = js.native
    
    /**
      * If true, the switch is on. If false, the switch is off.
      */
    /* CompleteClass */
    var selected: Boolean = js.native
    
    var unbounded: js.UndefOr[Boolean] = js.native
  }
  /* static members */
  object MDCSwitch {
    
    @JSImport("@material/switch/component", "MDCSwitch")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new `MDCSwitch` and attaches it to the given root element.
      * @param root The root to attach to.
      * @return the new component instance.
      */
    inline def attachTo(root: HTMLButtonElement): MDCSwitch = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[MDCSwitch]
  }
}
