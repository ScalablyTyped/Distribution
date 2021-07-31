package typings.ldclientJs

import typings.ldclientJsCommon.mod.LDClientBase
import typings.ldclientJsCommon.mod.LDLogger
import typings.ldclientJsCommon.mod.LDOptionsBase
import typings.ldclientJsCommon.mod.LDUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ldclient-js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  // This is @ignored because TypeDoc does not show default exports correctly. We'll just explain
  // the export situation in the comment for initialize().
  /** @ignore */
  object default {
    
    @JSImport("ldclient-js", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def initialize(envKey: String, user: LDUser): LDClient = (^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(envKey.asInstanceOf[js.Any], user.asInstanceOf[js.Any])).asInstanceOf[LDClient]
    @scala.inline
    def initialize(envKey: String, user: LDUser, options: LDOptions): LDClient = (^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(envKey.asInstanceOf[js.Any], user.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[LDClient]
    
    @JSImport("ldclient-js", "default.version")
    @js.native
    def version: String = js.native
    @scala.inline
    def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
  }
  
  @scala.inline
  def createConsoleLogger(minimumLevel: String): LDLogger = ^.asInstanceOf[js.Dynamic].applyDynamic("createConsoleLogger")(minimumLevel.asInstanceOf[js.Any]).asInstanceOf[LDLogger]
  
  @scala.inline
  def initialize(envKey: String, user: LDUser): LDClient = (^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(envKey.asInstanceOf[js.Any], user.asInstanceOf[js.Any])).asInstanceOf[LDClient]
  @scala.inline
  def initialize(envKey: String, user: LDUser, options: LDOptions): LDClient = (^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(envKey.asInstanceOf[js.Any], user.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[LDClient]
  
  @JSImport("ldclient-js", "version")
  @js.native
  val version: String = js.native
  
  @js.native
  trait LDClient
    extends StObject
       with LDClientBase {
    
    /**
      * Allows you to wait until the client has received goals data from LaunchDarkly.
      *
      * This is only relevant if you are using A/B testing features like click events and
      * pageview events; until the client has received the configuration for these (which
      * happens immediately after the initial request for feature flags), click events and
      * pageview events will not work, so you may wish to wait using this method before
      * doing anything that you expect to generate those events.
      *
      * The returned Promise will be resolved once the client has received goals data. If
      * you prefer to use event handlers rather than Promises, you can listen on the client
      * for a `"goalsReady"` event instead.
      * 
      * @returns
      *   A Promise containing the initialization state of the client.
      */
    def waitUntilGoalsReady(): js.Promise[Unit] = js.native
  }
  
  trait LDOptions
    extends StObject
       with LDOptionsBase {
    
    /**
      * Whether the client should make a request to LaunchDarkly for A/B testing goals.
      *
      * This is true by default, meaning that this request will be made on every page load.
      * Set it to false if you are not using A/B testing and want to skip the request.
      */
    var fetchGoals: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The signed user key for Secure Mode.
      *
      * For more information, see the JavaScript SDK Reference Guide on
      * [Secure mode](https://github.com/launchdarkly/js-client#secure-mode).
      */
    var hash: js.UndefOr[String] = js.undefined
  }
  object LDOptions {
    
    @scala.inline
    def apply(): LDOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LDOptions]
    }
    
    @scala.inline
    implicit class LDOptionsMutableBuilder[Self <: LDOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFetchGoals(value: Boolean): Self = StObject.set(x, "fetchGoals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFetchGoalsUndefined: Self = StObject.set(x, "fetchGoals", js.undefined)
      
      @scala.inline
      def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
    }
  }
}
