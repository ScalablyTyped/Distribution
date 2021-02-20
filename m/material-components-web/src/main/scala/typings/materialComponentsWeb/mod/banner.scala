package typings.materialComponentsWeb.mod

import typings.materialBanner.anon.PartialMDCBannerAdapter
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object banner {
  
  @JSImport("material-components-web", "banner.CloseReason")
  @js.native
  object CloseReason extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.materialBanner.constantsMod.CloseReason with Double] = js.native
    
    /* 0 */ val PRIMARY: typings.materialBanner.constantsMod.CloseReason.PRIMARY with Double = js.native
    
    /* 1 */ val SECONDARY: typings.materialBanner.constantsMod.CloseReason.SECONDARY with Double = js.native
    
    /* 2 */ val UNSPECIFIED: typings.materialBanner.constantsMod.CloseReason.UNSPECIFIED with Double = js.native
  }
  
  @JSImport("material-components-web", "banner.MDCBanner")
  @js.native
  class MDCBanner protected ()
    extends typings.materialBanner.mod.MDCBanner {
    def this(root: Element, foundation: js.UndefOr[scala.Nothing], args: js.Any*) = this()
    def this(root: Element, foundation: typings.materialBanner.foundationMod.MDCBannerFoundation, args: js.Any*) = this()
  }
  /* static members */
  object MDCBanner {
    
    @JSImport("material-components-web", "banner.MDCBanner.attachTo")
    @js.native
    def attachTo(root: Element): typings.materialBanner.componentMod.MDCBanner = js.native
  }
  
  @JSImport("material-components-web", "banner.MDCBannerFoundation")
  @js.native
  class MDCBannerFoundation ()
    extends typings.materialBanner.mod.MDCBannerFoundation {
    def this(adapter: PartialMDCBannerAdapter) = this()
  }
  
  object cssClasses {
    
    @JSImport("material-components-web", "banner.cssClasses")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("material-components-web", "banner.cssClasses.CLOSING")
    @js.native
    def CLOSING: String = js.native
    @scala.inline
    def CLOSING_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLOSING")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "banner.cssClasses.OPEN")
    @js.native
    def OPEN: String = js.native
    
    @JSImport("material-components-web", "banner.cssClasses.OPENING")
    @js.native
    def OPENING: String = js.native
    @scala.inline
    def OPENING_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OPENING")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def OPEN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OPEN")(x.asInstanceOf[js.Any])
  }
  
  object events {
    
    @JSImport("material-components-web", "banner.events")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("material-components-web", "banner.events.CLOSED")
    @js.native
    def CLOSED: String = js.native
    @scala.inline
    def CLOSED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLOSED")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "banner.events.CLOSING")
    @js.native
    def CLOSING: String = js.native
    @scala.inline
    def CLOSING_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLOSING")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "banner.events.OPENED")
    @js.native
    def OPENED: String = js.native
    @scala.inline
    def OPENED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OPENED")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "banner.events.OPENING")
    @js.native
    def OPENING: String = js.native
    @scala.inline
    def OPENING_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OPENING")(x.asInstanceOf[js.Any])
  }
  
  object numbers {
    
    @JSImport("material-components-web", "banner.numbers")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("material-components-web", "banner.numbers.BANNER_ANIMATION_CLOSE_TIME_MS")
    @js.native
    def BANNER_ANIMATION_CLOSE_TIME_MS: Double = js.native
    @scala.inline
    def BANNER_ANIMATION_CLOSE_TIME_MS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BANNER_ANIMATION_CLOSE_TIME_MS")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "banner.numbers.BANNER_ANIMATION_OPEN_TIME_MS")
    @js.native
    def BANNER_ANIMATION_OPEN_TIME_MS: Double = js.native
    @scala.inline
    def BANNER_ANIMATION_OPEN_TIME_MS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BANNER_ANIMATION_OPEN_TIME_MS")(x.asInstanceOf[js.Any])
  }
  
  object selectors {
    
    @JSImport("material-components-web", "banner.selectors")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("material-components-web", "banner.selectors.CONTENT")
    @js.native
    def CONTENT: String = js.native
    @scala.inline
    def CONTENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CONTENT")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "banner.selectors.PRIMARY_ACTION")
    @js.native
    def PRIMARY_ACTION: String = js.native
    @scala.inline
    def PRIMARY_ACTION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PRIMARY_ACTION")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "banner.selectors.SECONDARY_ACTION")
    @js.native
    def SECONDARY_ACTION: String = js.native
    @scala.inline
    def SECONDARY_ACTION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SECONDARY_ACTION")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "banner.selectors.TEXT")
    @js.native
    def TEXT: String = js.native
    @scala.inline
    def TEXT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TEXT")(x.asInstanceOf[js.Any])
  }
}
