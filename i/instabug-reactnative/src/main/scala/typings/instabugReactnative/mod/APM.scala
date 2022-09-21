package typings.instabugReactnative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object APM {
  
  @JSImport("instabug-reactnative", "APM")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Ends the current session’s App Launch. Calling this API is optional, App Launches will still be captured and ended automatically by the SDK;
    * this API just allows you to change when an App Launch actually ends.
    */
  inline def endAppLaunch(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("endAppLaunch")().asInstanceOf[Unit]
  
  /**
    * Starts a custom trace
    * @param {string} name 
    */
  inline def endUITrace(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("endUITrace")().asInstanceOf[Unit]
  
  @js.native
  sealed trait logLevel extends StObject
  /**
    * APM Log Level.
    * @readonly
    * @enum {number}
    */
  @JSImport("instabug-reactnative", "APM.logLevel")
  @js.native
  object logLevel extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[logLevel & Double] = js.native
    
    @js.native
    sealed trait debug
      extends StObject
         with logLevel
    /* 4 */ val debug: typings.instabugReactnative.mod.APM.logLevel.debug & Double = js.native
    
    @js.native
    sealed trait error
      extends StObject
         with logLevel
    /* 1 */ val error: typings.instabugReactnative.mod.APM.logLevel.error & Double = js.native
    
    @js.native
    sealed trait info
      extends StObject
         with logLevel
    /* 3 */ val info: typings.instabugReactnative.mod.APM.logLevel.info & Double = js.native
    
    @js.native
    sealed trait none
      extends StObject
         with logLevel
    /* 0 */ val none: typings.instabugReactnative.mod.APM.logLevel.none & Double = js.native
    
    @js.native
    sealed trait verbose
      extends StObject
         with logLevel
    /* 5 */ val verbose: typings.instabugReactnative.mod.APM.logLevel.verbose & Double = js.native
    
    @js.native
    sealed trait warning
      extends StObject
         with logLevel
    /* 2 */ val warning: typings.instabugReactnative.mod.APM.logLevel.warning & Double = js.native
  }
  
  /**
    * Enables or disables APM App Launch
    * @param {boolean} isEnabled 
    */
  inline def setAppLaunchEnabled(isEnabled: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setAppLaunchEnabled")(isEnabled.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Enables or disables APM UI Responsivenes tracking feature
    * @param {boolean} isEnabled 
    */
  inline def setAutoUITraceEnabled(isEnabled: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setAutoUITraceEnabled")(isEnabled.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Enables or disables APM
    * @param {boolean} isEnabled 
    */
  inline def setEnabled(isEnabled: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setEnabled")(isEnabled.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Sets the printed logs priority. Filter to one of the following levels:
    *
    * - logLevelNone disables all APM SDK console logs.
    *
    * - logLevelError prints errors only, we use this level to let you know if something goes wrong.
    *
    * - logLevelWarning displays warnings that will not necessarily lead to errors but should be addressed nonetheless.
    *
    * - logLevelInfo (default) logs information that we think is useful without being too verbose.
    *
    * - logLevelDebug use this in case you are debugging an issue. Not recommended for production use.
    *
    * - logLevelVerbose use this only if logLevelDebug was not enough and you need more visibility
    * on what is going on under the hood.
    *
    * Similar to the logLevelDebug level, this is not meant to be used on production environments.
    *
    * Each log level will also include logs from all the levels above it. For instance,
    * logLevelInfo will include logLevelInfo logs as well as logLevelWarning
    * and logLevelError logs.
    * @param {logLevel} logLevel the printed logs priority.
    */
  inline def setLogLevel(logLevel: logLevel): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLogLevel")(logLevel.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Enables or disables APM Network Metric
    * @param {boolean} isEnabled 
    */
  inline def setNetworkEnabledIOS(isEnabled: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setNetworkEnabledIOS")(isEnabled.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Starts a custom trace
    * Returns a promise, the promise delivers the trace reference if APM is enabled, otherwise it gets rejected
    * @param {string} name 
    */
  inline def startExecutionTrace(name: String): js.Promise[Trace] = ^.asInstanceOf[js.Dynamic].applyDynamic("startExecutionTrace")(name.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Trace]]
  
  /**
    * Starts a custom trace
    * @param {string} name 
    */
  inline def startUITrace(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("startUITrace")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
