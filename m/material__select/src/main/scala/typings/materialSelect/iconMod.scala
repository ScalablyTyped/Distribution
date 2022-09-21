package typings.materialSelect

import typings.materialBase.Element
import typings.materialSelect.anon.PartialMDCSelectIconAdapt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iconMod {
  
  @JSImport("@material/select/icon", "MDCSelectIcon")
  @js.native
  open class MDCSelectIcon protected ()
    extends typings.materialSelect.iconComponentMod.MDCSelectIcon {
    def this(root: Element, foundation: Unit, args: Any*) = this()
    def this(
      root: Element,
      foundation: typings.materialSelect.iconFoundationMod.MDCSelectIconFoundation,
      args: Any*
    ) = this()
  }
  /* static members */
  object MDCSelectIcon {
    
    @JSImport("@material/select/icon", "MDCSelectIcon")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: typings.std.Element): typings.materialSelect.iconComponentMod.MDCSelectIcon = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[typings.materialSelect.iconComponentMod.MDCSelectIcon]
  }
  
  @JSImport("@material/select/icon", "MDCSelectIconFoundation")
  @js.native
  open class MDCSelectIconFoundation ()
    extends typings.materialSelect.iconFoundationMod.MDCSelectIconFoundation {
    def this(adapter: PartialMDCSelectIconAdapt) = this()
  }
  
  object iconStrings {
    
    @JSImport("@material/select/icon", "iconStrings")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/select/icon", "iconStrings.ICON_EVENT")
    @js.native
    def ICON_EVENT: String = js.native
    inline def ICON_EVENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ICON_EVENT")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/select/icon", "iconStrings.ICON_ROLE")
    @js.native
    def ICON_ROLE: String = js.native
    inline def ICON_ROLE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ICON_ROLE")(x.asInstanceOf[js.Any])
  }
}
