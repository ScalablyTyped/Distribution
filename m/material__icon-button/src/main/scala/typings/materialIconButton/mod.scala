package typings.materialIconButton

import typings.materialBase.Element
import typings.materialIconButton.anon.PartialMDCIconButtonToggl
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@material/icon-button", "MDCIconButtonToggle")
  @js.native
  open class MDCIconButtonToggle protected ()
    extends typings.materialIconButton.componentMod.MDCIconButtonToggle {
    def this(root: Element, foundation: Unit, args: Any*) = this()
    def this(
      root: Element,
      foundation: typings.materialIconButton.foundationMod.MDCIconButtonToggleFoundation,
      args: Any*
    ) = this()
  }
  /* static members */
  object MDCIconButtonToggle {
    
    @JSImport("@material/icon-button", "MDCIconButtonToggle")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: HTMLElement): typings.materialIconButton.componentMod.MDCIconButtonToggle = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[typings.materialIconButton.componentMod.MDCIconButtonToggle]
  }
  
  @JSImport("@material/icon-button", "MDCIconButtonToggleFoundation")
  @js.native
  open class MDCIconButtonToggleFoundation ()
    extends typings.materialIconButton.foundationMod.MDCIconButtonToggleFoundation {
    def this(adapter: PartialMDCIconButtonToggl) = this()
  }
  
  object cssClasses {
    
    @JSImport("@material/icon-button", "cssClasses")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/icon-button", "cssClasses.ICON_BUTTON_ON")
    @js.native
    def ICON_BUTTON_ON: String = js.native
    inline def ICON_BUTTON_ON_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ICON_BUTTON_ON")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/icon-button", "cssClasses.ROOT")
    @js.native
    def ROOT: String = js.native
    inline def ROOT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ROOT")(x.asInstanceOf[js.Any])
  }
  
  object strings {
    
    @JSImport("@material/icon-button", "strings")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/icon-button", "strings.ARIA_LABEL")
    @js.native
    def ARIA_LABEL: String = js.native
    inline def ARIA_LABEL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARIA_LABEL")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/icon-button", "strings.ARIA_PRESSED")
    @js.native
    def ARIA_PRESSED: String = js.native
    inline def ARIA_PRESSED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARIA_PRESSED")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/icon-button", "strings.CHANGE_EVENT")
    @js.native
    def CHANGE_EVENT: String = js.native
    inline def CHANGE_EVENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHANGE_EVENT")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/icon-button", "strings.DATA_ARIA_LABEL_OFF")
    @js.native
    def DATA_ARIA_LABEL_OFF: String = js.native
    inline def DATA_ARIA_LABEL_OFF_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DATA_ARIA_LABEL_OFF")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/icon-button", "strings.DATA_ARIA_LABEL_ON")
    @js.native
    def DATA_ARIA_LABEL_ON: String = js.native
    inline def DATA_ARIA_LABEL_ON_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DATA_ARIA_LABEL_ON")(x.asInstanceOf[js.Any])
  }
}
