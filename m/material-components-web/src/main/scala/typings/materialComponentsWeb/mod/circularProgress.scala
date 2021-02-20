package typings.materialComponentsWeb.mod

import typings.materialCircularProgress.anon.PartialMDCCircularProgres
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object circularProgress {
  
  @JSImport("material-components-web", "circularProgress.MDCCircularProgress")
  @js.native
  class MDCCircularProgress protected ()
    extends typings.materialCircularProgress.mod.MDCCircularProgress {
    def this(root: Element, foundation: js.UndefOr[scala.Nothing], args: js.Any*) = this()
    def this(
      root: Element,
      foundation: typings.materialCircularProgress.foundationMod.MDCCircularProgressFoundation,
      args: js.Any*
    ) = this()
  }
  /* static members */
  object MDCCircularProgress {
    
    @JSImport("material-components-web", "circularProgress.MDCCircularProgress.attachTo")
    @js.native
    def attachTo(root: Element): typings.materialCircularProgress.componentMod.MDCCircularProgress = js.native
  }
  
  @JSImport("material-components-web", "circularProgress.MDCCircularProgressFoundation")
  @js.native
  class MDCCircularProgressFoundation ()
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
    @scala.inline
    def CLOSED_CLASS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLOSED_CLASS")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "circularProgress.cssClasses.INDETERMINATE_CLASS")
    @js.native
    def INDETERMINATE_CLASS: String = js.native
    @scala.inline
    def INDETERMINATE_CLASS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INDETERMINATE_CLASS")(x.asInstanceOf[js.Any])
  }
  
  object strings {
    
    @JSImport("material-components-web", "circularProgress.strings")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("material-components-web", "circularProgress.strings.ARIA_VALUENOW")
    @js.native
    def ARIA_VALUENOW: String = js.native
    @scala.inline
    def ARIA_VALUENOW_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARIA_VALUENOW")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "circularProgress.strings.DETERMINATE_CIRCLE_SELECTOR")
    @js.native
    def DETERMINATE_CIRCLE_SELECTOR: String = js.native
    @scala.inline
    def DETERMINATE_CIRCLE_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DETERMINATE_CIRCLE_SELECTOR")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "circularProgress.strings.RADIUS")
    @js.native
    def RADIUS: String = js.native
    @scala.inline
    def RADIUS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RADIUS")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "circularProgress.strings.STROKE_DASHOFFSET")
    @js.native
    def STROKE_DASHOFFSET: String = js.native
    @scala.inline
    def STROKE_DASHOFFSET_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STROKE_DASHOFFSET")(x.asInstanceOf[js.Any])
  }
}
