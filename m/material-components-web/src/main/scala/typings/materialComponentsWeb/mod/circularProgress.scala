package typings.materialComponentsWeb.mod

import typings.materialBase.Element
import typings.materialCircularProgress.anon.PartialMDCCircularProgres
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object circularProgress {
  
  @JSImport("material-components-web", "circularProgress.MDCCircularProgress")
  @js.native
  open class MDCCircularProgress protected ()
    extends typings.materialCircularProgress.mod.MDCCircularProgress {
    def this(root: Element, foundation: Unit, args: Any*) = this()
    def this(
      root: Element,
      foundation: typings.materialCircularProgress.foundationMod.MDCCircularProgressFoundation,
      args: Any*
    ) = this()
  }
  /* static members */
  object MDCCircularProgress {
    
    @JSImport("material-components-web", "circularProgress.MDCCircularProgress")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: typings.std.Element): typings.materialCircularProgress.componentMod.MDCCircularProgress = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[typings.materialCircularProgress.componentMod.MDCCircularProgress]
  }
  
  @JSImport("material-components-web", "circularProgress.MDCCircularProgressFoundation")
  @js.native
  open class MDCCircularProgressFoundation ()
    extends typings.materialCircularProgress.mod.MDCCircularProgressFoundation {
    def this(adapter: PartialMDCCircularProgres) = this()
  }
  
  object cssClasses {
    
    @JSImport("material-components-web", "circularProgress.cssClasses")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("material-components-web", "circularProgress.cssClasses.CLOSED_CLASS")
    @js.native
    def CLOSED_CLASS: String = js.native
    inline def CLOSED_CLASS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLOSED_CLASS")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "circularProgress.cssClasses.INDETERMINATE_CLASS")
    @js.native
    def INDETERMINATE_CLASS: String = js.native
    inline def INDETERMINATE_CLASS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INDETERMINATE_CLASS")(x.asInstanceOf[js.Any])
  }
  
  object strings {
    
    @JSImport("material-components-web", "circularProgress.strings")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("material-components-web", "circularProgress.strings.ARIA_HIDDEN")
    @js.native
    def ARIA_HIDDEN: String = js.native
    inline def ARIA_HIDDEN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARIA_HIDDEN")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "circularProgress.strings.ARIA_VALUENOW")
    @js.native
    def ARIA_VALUENOW: String = js.native
    inline def ARIA_VALUENOW_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARIA_VALUENOW")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "circularProgress.strings.DETERMINATE_CIRCLE_SELECTOR")
    @js.native
    def DETERMINATE_CIRCLE_SELECTOR: String = js.native
    inline def DETERMINATE_CIRCLE_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DETERMINATE_CIRCLE_SELECTOR")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "circularProgress.strings.RADIUS")
    @js.native
    def RADIUS: String = js.native
    inline def RADIUS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RADIUS")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "circularProgress.strings.STROKE_DASHOFFSET")
    @js.native
    def STROKE_DASHOFFSET: String = js.native
    inline def STROKE_DASHOFFSET_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STROKE_DASHOFFSET")(x.asInstanceOf[js.Any])
  }
}
