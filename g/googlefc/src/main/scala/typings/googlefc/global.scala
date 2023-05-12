package typings.googlefc

import typings.googlefc.anon.Proceed
import typings.googlefc.googlefc.CallbackQueueArray
import typings.googlefc.googlefcInts.`0`
import typings.googlefc.googlefcInts.`1`
import typings.googlefc.googlefcInts.`2`
import typings.googlefc.googlefcInts.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object googlefc {
    
    @JSGlobal("googlefc")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * An enum to represent the user's ad blocker state.
      */
    object AdBlockerStatusEnum {
      
      @JSGlobal("googlefc.AdBlockerStatusEnum")
      @js.native
      val ^ : js.Any = js.native
      
      /** The user was running an extension level ad blocker. */
      @JSGlobal("googlefc.AdBlockerStatusEnum.EXTENSION_LEVEL_AD_BLOCKER")
      @js.native
      def EXTENSION_LEVEL_AD_BLOCKER: `1` = js.native
      inline def EXTENSION_LEVEL_AD_BLOCKER_=(x: `1`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EXTENSION_LEVEL_AD_BLOCKER")(x.asInstanceOf[js.Any])
      
      /** The user was running a network level ad blocker. */
      @JSGlobal("googlefc.AdBlockerStatusEnum.NETWORK_LEVEL_AD_BLOCKER")
      @js.native
      def NETWORK_LEVEL_AD_BLOCKER: `2` = js.native
      inline def NETWORK_LEVEL_AD_BLOCKER_=(x: `2`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NETWORK_LEVEL_AD_BLOCKER")(x.asInstanceOf[js.Any])
      
      /** The user was not blocking ads. */
      @JSGlobal("googlefc.AdBlockerStatusEnum.NO_AD_BLOCKER")
      @js.native
      def NO_AD_BLOCKER: `3` = js.native
      inline def NO_AD_BLOCKER_=(x: `3`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NO_AD_BLOCKER")(x.asInstanceOf[js.Any])
      
      /** Something failed, in an unknown state. */
      @JSGlobal("googlefc.AdBlockerStatusEnum.UNKNOWN")
      @js.native
      def UNKNOWN: `0` = js.native
      inline def UNKNOWN_=(x: `0`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNKNOWN")(x.asInstanceOf[js.Any])
    }
    
    /**
      * An enum to represent the user's allow-ads state.
      */
    object AllowAdsStatusEnum {
      
      @JSGlobal("googlefc.AllowAdsStatusEnum")
      @js.native
      val ^ : js.Any = js.native
      
      /** User is no longer using an ad blocker after seeing the ad blocking message. */
      @JSGlobal("googlefc.AllowAdsStatusEnum.ADS_ALLOWED")
      @js.native
      def ADS_ALLOWED: `2` = js.native
      inline def ADS_ALLOWED_=(x: `2`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ADS_ALLOWED")(x.asInstanceOf[js.Any])
      
      /**
        * User is currently using an ad blocker, was never using an ad blocker, or
        * allowed ads, but not because they saw the Funding Choices messaging.
        */
      @JSGlobal("googlefc.AllowAdsStatusEnum.ADS_NOT_ALLOWED")
      @js.native
      def ADS_NOT_ALLOWED: `1` = js.native
      inline def ADS_NOT_ALLOWED_=(x: `1`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ADS_NOT_ALLOWED")(x.asInstanceOf[js.Any])
      
      /** Something failed, in an unknown state. */
      @JSGlobal("googlefc.AllowAdsStatusEnum.UNKNOWN")
      @js.native
      def UNKNOWN: `0` = js.native
      inline def UNKNOWN_=(x: `0`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNKNOWN")(x.asInstanceOf[js.Any])
    }
    
    /**
      * Reference to the callback queue for asynchronous execution of consent and ad blocking related queries.
      */
    @JSGlobal("googlefc.callbackQueue")
    @js.native
    val callbackQueue: CallbackQueueArray = js.native
    
    object ccpa {
      
      @JSGlobal("googlefc.ccpa")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * An enum to represent the user initial CCPA status.
        */
      object InitialCcpaStatusEnum {
        
        @JSGlobal("googlefc.ccpa.InitialCcpaStatusEnum")
        @js.native
        val ^ : js.Any = js.native
        
        /** CCPA does not apply to this user. */
        @JSGlobal("googlefc.ccpa.InitialCcpaStatusEnum.CCPA_DOES_NOT_APPLY")
        @js.native
        def CCPA_DOES_NOT_APPLY: `1` = js.native
        inline def CCPA_DOES_NOT_APPLY_=(x: `1`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CCPA_DOES_NOT_APPLY")(x.asInstanceOf[js.Any])
        
        /** CPPA applies to this user, and the user has not opted out yet. */
        @JSGlobal("googlefc.ccpa.InitialCcpaStatusEnum.NOT_OPTED_OUT")
        @js.native
        def NOT_OPTED_OUT: `2` = js.native
        inline def NOT_OPTED_OUT_=(x: `2`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NOT_OPTED_OUT")(x.asInstanceOf[js.Any])
        
        /** CPPA applies to this user, and the user has opted out. */
        @JSGlobal("googlefc.ccpa.InitialCcpaStatusEnum.OPTED_OUT")
        @js.native
        def OPTED_OUT: `3` = js.native
        inline def OPTED_OUT_=(x: `3`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OPTED_OUT")(x.asInstanceOf[js.Any])
        
        /** Something failed, in an unknown state. */
        @JSGlobal("googlefc.ccpa.InitialCcpaStatusEnum.UNKNOWN")
        @js.native
        def UNKNOWN: `0` = js.native
        inline def UNKNOWN_=(x: `0`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNKNOWN")(x.asInstanceOf[js.Any])
      }
      
      /**
        * Returns a value in the InitialCcpaStatusEnum depending on the CCPA status of the user.
        * The key that should be specified for this function is INITIAL_CCPA_DATA_READY.
        * Note that any subsequent request for CCPA data should be obtained by directly calling the US Privacy API (__uspapi).
        */
      inline def getInitialCcpaStatus(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialCcpaStatus")().asInstanceOf[Double]
      
      /**
        * Opens the CCPA confirmation dialog if the default Do Not Sell link is overridden.
        * Once the user interacts with the confirmation dialog, the provided callback function
        * will be called with true if the user decides to opt-out, and false otherwise.
        */
      inline def openConfirmationDialog(callback: js.Function1[/* userOptedOut */ Boolean, Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("openConfirmationDialog")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      /**
        * A boolean which can be set to true to use a custom Do Not Sell link.
        */
      @JSGlobal("googlefc.ccpa.overrideDnsLink")
      @js.native
      def overrideDnsLink: Boolean = js.native
      inline def overrideDnsLink_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("overrideDnsLink")(x.asInstanceOf[js.Any])
    }
    
    /**
      * A function that determines whether to proceed with Funding Choices messaging. This functionality is supported for all message types.
      */
    @JSGlobal("googlefc.controlledMessagingFunction")
    @js.native
    def controlledMessagingFunction: js.UndefOr[js.Function1[/* message */ Proceed, Any]] = js.native
    inline def controlledMessagingFunction_=(x: js.UndefOr[js.Function1[/* message */ Proceed, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("controlledMessagingFunction")(x.asInstanceOf[js.Any])
    
    /**
      * Returns a value in the AdBlockerStatusEnum depending on the ad blocking status of the user. The key that should be specified for this function is AD_BLOCK_DATA_READY.
      */
    inline def getAdBlockerStatus(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getAdBlockerStatus")().asInstanceOf[Double]
    
    /**
      * Returns a value in the AllowAdsStatusEnum depending on the allow-ads status of the user. The key that should be specified for this function is AD_BLOCK_DATA_READY.
      */
    inline def getAllowAdsStatus(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllowAdsStatus")().asInstanceOf[Double]
    
    /**
      * Clears the consent record and reloads the googlefc script to show the consent message applicable to the user.
      */
    inline def showRevocationMessage(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("showRevocationMessage")().asInstanceOf[Unit]
  }
}
