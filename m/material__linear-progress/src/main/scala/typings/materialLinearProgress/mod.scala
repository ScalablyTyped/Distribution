package typings.materialLinearProgress

import typings.materialBase.Element
import typings.materialLinearProgress.anon.PartialMDCLinearProgressA
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@material/linear-progress", "MDCLinearProgress")
  @js.native
  open class MDCLinearProgress protected ()
    extends typings.materialLinearProgress.componentMod.MDCLinearProgress {
    def this(root: Element, foundation: Unit, args: Any*) = this()
    def this(
      root: Element,
      foundation: typings.materialLinearProgress.foundationMod.MDCLinearProgressFoundation,
      args: Any*
    ) = this()
  }
  /* static members */
  object MDCLinearProgress {
    
    @JSImport("@material/linear-progress", "MDCLinearProgress")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: typings.std.Element): typings.materialLinearProgress.componentMod.MDCLinearProgress = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[typings.materialLinearProgress.componentMod.MDCLinearProgress]
  }
  
  @JSImport("@material/linear-progress", "MDCLinearProgressFoundation")
  @js.native
  open class MDCLinearProgressFoundation ()
    extends typings.materialLinearProgress.foundationMod.MDCLinearProgressFoundation {
    def this(adapter: PartialMDCLinearProgressA) = this()
  }
  
  object animationDimensionPercentages {
    
    @JSImport("@material/linear-progress", "animationDimensionPercentages")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/linear-progress", "animationDimensionPercentages.PRIMARY_FULL")
    @js.native
    def PRIMARY_FULL: Double = js.native
    inline def PRIMARY_FULL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PRIMARY_FULL")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/linear-progress", "animationDimensionPercentages.PRIMARY_HALF")
    @js.native
    def PRIMARY_HALF: Double = js.native
    inline def PRIMARY_HALF_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PRIMARY_HALF")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/linear-progress", "animationDimensionPercentages.SECONDARY_FULL")
    @js.native
    def SECONDARY_FULL: Double = js.native
    inline def SECONDARY_FULL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SECONDARY_FULL")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/linear-progress", "animationDimensionPercentages.SECONDARY_HALF")
    @js.native
    def SECONDARY_HALF: Double = js.native
    inline def SECONDARY_HALF_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SECONDARY_HALF")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/linear-progress", "animationDimensionPercentages.SECONDARY_QUARTER")
    @js.native
    def SECONDARY_QUARTER: Double = js.native
    inline def SECONDARY_QUARTER_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SECONDARY_QUARTER")(x.asInstanceOf[js.Any])
  }
  
  object cssClasses {
    
    @JSImport("@material/linear-progress", "cssClasses")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/linear-progress", "cssClasses.ANIMATION_READY_CLASS")
    @js.native
    def ANIMATION_READY_CLASS: String = js.native
    inline def ANIMATION_READY_CLASS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ANIMATION_READY_CLASS")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/linear-progress", "cssClasses.CLOSED_ANIMATION_OFF_CLASS")
    @js.native
    def CLOSED_ANIMATION_OFF_CLASS: String = js.native
    inline def CLOSED_ANIMATION_OFF_CLASS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLOSED_ANIMATION_OFF_CLASS")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/linear-progress", "cssClasses.CLOSED_CLASS")
    @js.native
    def CLOSED_CLASS: String = js.native
    inline def CLOSED_CLASS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLOSED_CLASS")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/linear-progress", "cssClasses.INDETERMINATE_CLASS")
    @js.native
    def INDETERMINATE_CLASS: String = js.native
    inline def INDETERMINATE_CLASS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INDETERMINATE_CLASS")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/linear-progress", "cssClasses.REVERSED_CLASS")
    @js.native
    def REVERSED_CLASS: String = js.native
    inline def REVERSED_CLASS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REVERSED_CLASS")(x.asInstanceOf[js.Any])
  }
  
  object strings {
    
    @JSImport("@material/linear-progress", "strings")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/linear-progress", "strings.ARIA_HIDDEN")
    @js.native
    def ARIA_HIDDEN: String = js.native
    inline def ARIA_HIDDEN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARIA_HIDDEN")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/linear-progress", "strings.ARIA_VALUEMAX")
    @js.native
    def ARIA_VALUEMAX: String = js.native
    inline def ARIA_VALUEMAX_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARIA_VALUEMAX")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/linear-progress", "strings.ARIA_VALUEMIN")
    @js.native
    def ARIA_VALUEMIN: String = js.native
    inline def ARIA_VALUEMIN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARIA_VALUEMIN")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/linear-progress", "strings.ARIA_VALUENOW")
    @js.native
    def ARIA_VALUENOW: String = js.native
    inline def ARIA_VALUENOW_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARIA_VALUENOW")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/linear-progress", "strings.BUFFER_BAR_SELECTOR")
    @js.native
    def BUFFER_BAR_SELECTOR: String = js.native
    inline def BUFFER_BAR_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BUFFER_BAR_SELECTOR")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/linear-progress", "strings.FLEX_BASIS")
    @js.native
    def FLEX_BASIS: String = js.native
    inline def FLEX_BASIS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FLEX_BASIS")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/linear-progress", "strings.PRIMARY_BAR_SELECTOR")
    @js.native
    def PRIMARY_BAR_SELECTOR: String = js.native
    inline def PRIMARY_BAR_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PRIMARY_BAR_SELECTOR")(x.asInstanceOf[js.Any])
  }
}
