package typings.materialBanner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object constantsMod {
  
  @js.native
  sealed trait CloseReason extends StObject
  @JSImport("@material/banner/constants", "CloseReason")
  @js.native
  object CloseReason extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[CloseReason & Double] = js.native
    
    @js.native
    sealed trait PRIMARY
      extends StObject
         with CloseReason
    /* 0 */ val PRIMARY: typings.materialBanner.constantsMod.CloseReason.PRIMARY & Double = js.native
    
    @js.native
    sealed trait SECONDARY
      extends StObject
         with CloseReason
    /* 1 */ val SECONDARY: typings.materialBanner.constantsMod.CloseReason.SECONDARY & Double = js.native
    
    @js.native
    sealed trait UNSPECIFIED
      extends StObject
         with CloseReason
    /* 2 */ val UNSPECIFIED: typings.materialBanner.constantsMod.CloseReason.UNSPECIFIED & Double = js.native
  }
  
  object cssClasses {
    
    @JSImport("@material/banner/constants", "cssClasses")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/banner/constants", "cssClasses.CLOSING")
    @js.native
    def CLOSING: String = js.native
    inline def CLOSING_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLOSING")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/banner/constants", "cssClasses.OPEN")
    @js.native
    def OPEN: String = js.native
    
    @JSImport("@material/banner/constants", "cssClasses.OPENING")
    @js.native
    def OPENING: String = js.native
    inline def OPENING_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OPENING")(x.asInstanceOf[js.Any])
    
    inline def OPEN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OPEN")(x.asInstanceOf[js.Any])
  }
  
  object events {
    
    @JSImport("@material/banner/constants", "events")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/banner/constants", "events.CLOSED")
    @js.native
    def CLOSED: String = js.native
    inline def CLOSED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLOSED")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/banner/constants", "events.CLOSING")
    @js.native
    def CLOSING: String = js.native
    inline def CLOSING_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLOSING")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/banner/constants", "events.OPENED")
    @js.native
    def OPENED: String = js.native
    inline def OPENED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OPENED")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/banner/constants", "events.OPENING")
    @js.native
    def OPENING: String = js.native
    inline def OPENING_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OPENING")(x.asInstanceOf[js.Any])
  }
  
  object numbers {
    
    @JSImport("@material/banner/constants", "numbers")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/banner/constants", "numbers.BANNER_ANIMATION_CLOSE_TIME_MS")
    @js.native
    def BANNER_ANIMATION_CLOSE_TIME_MS: Double = js.native
    inline def BANNER_ANIMATION_CLOSE_TIME_MS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BANNER_ANIMATION_CLOSE_TIME_MS")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/banner/constants", "numbers.BANNER_ANIMATION_OPEN_TIME_MS")
    @js.native
    def BANNER_ANIMATION_OPEN_TIME_MS: Double = js.native
    inline def BANNER_ANIMATION_OPEN_TIME_MS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BANNER_ANIMATION_OPEN_TIME_MS")(x.asInstanceOf[js.Any])
  }
  
  object selectors {
    
    @JSImport("@material/banner/constants", "selectors")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/banner/constants", "selectors.CONTENT")
    @js.native
    def CONTENT: String = js.native
    inline def CONTENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CONTENT")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/banner/constants", "selectors.PRIMARY_ACTION")
    @js.native
    def PRIMARY_ACTION: String = js.native
    inline def PRIMARY_ACTION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PRIMARY_ACTION")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/banner/constants", "selectors.SECONDARY_ACTION")
    @js.native
    def SECONDARY_ACTION: String = js.native
    inline def SECONDARY_ACTION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SECONDARY_ACTION")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/banner/constants", "selectors.TEXT")
    @js.native
    def TEXT: String = js.native
    inline def TEXT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TEXT")(x.asInstanceOf[js.Any])
  }
  
  trait MDCBannerCloseEventDetail extends StObject {
    
    var reason: CloseReason
  }
  object MDCBannerCloseEventDetail {
    
    inline def apply(reason: CloseReason): MDCBannerCloseEventDetail = {
      val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any])
      __obj.asInstanceOf[MDCBannerCloseEventDetail]
    }
    
    extension [Self <: MDCBannerCloseEventDetail](x: Self) {
      
      inline def setReason(value: CloseReason): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    }
  }
}
