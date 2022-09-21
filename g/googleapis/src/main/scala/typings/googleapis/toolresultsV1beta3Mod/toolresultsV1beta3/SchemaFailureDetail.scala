package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFailureDetail extends StObject {
  
  /**
    * If the failure was severe because the system (app) under test crashed.
    */
  var crashed: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * If the device ran out of memory during a test, causing the test to crash.
    */
  var deviceOutOfMemory: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * If the Roboscript failed to complete successfully, e.g., because a Roboscript action or assertion failed or a Roboscript action could not be matched during the entire crawl.
    */
  var failedRoboscript: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * If an app is not installed and thus no test can be run with the app. This might be caused by trying to run a test on an unsupported platform.
    */
  var notInstalled: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * If a native process (including any other than the app) crashed.
    */
  var otherNativeCrash: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * If the test overran some time limit, and that is why it failed.
    */
  var timedOut: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * If the robo was unable to crawl the app; perhaps because the app did not start.
    */
  var unableToCrawl: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaFailureDetail {
  
  inline def apply(): SchemaFailureDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFailureDetail]
  }
  
  extension [Self <: SchemaFailureDetail](x: Self) {
    
    inline def setCrashed(value: Boolean): Self = StObject.set(x, "crashed", value.asInstanceOf[js.Any])
    
    inline def setCrashedNull: Self = StObject.set(x, "crashed", null)
    
    inline def setCrashedUndefined: Self = StObject.set(x, "crashed", js.undefined)
    
    inline def setDeviceOutOfMemory(value: Boolean): Self = StObject.set(x, "deviceOutOfMemory", value.asInstanceOf[js.Any])
    
    inline def setDeviceOutOfMemoryNull: Self = StObject.set(x, "deviceOutOfMemory", null)
    
    inline def setDeviceOutOfMemoryUndefined: Self = StObject.set(x, "deviceOutOfMemory", js.undefined)
    
    inline def setFailedRoboscript(value: Boolean): Self = StObject.set(x, "failedRoboscript", value.asInstanceOf[js.Any])
    
    inline def setFailedRoboscriptNull: Self = StObject.set(x, "failedRoboscript", null)
    
    inline def setFailedRoboscriptUndefined: Self = StObject.set(x, "failedRoboscript", js.undefined)
    
    inline def setNotInstalled(value: Boolean): Self = StObject.set(x, "notInstalled", value.asInstanceOf[js.Any])
    
    inline def setNotInstalledNull: Self = StObject.set(x, "notInstalled", null)
    
    inline def setNotInstalledUndefined: Self = StObject.set(x, "notInstalled", js.undefined)
    
    inline def setOtherNativeCrash(value: Boolean): Self = StObject.set(x, "otherNativeCrash", value.asInstanceOf[js.Any])
    
    inline def setOtherNativeCrashNull: Self = StObject.set(x, "otherNativeCrash", null)
    
    inline def setOtherNativeCrashUndefined: Self = StObject.set(x, "otherNativeCrash", js.undefined)
    
    inline def setTimedOut(value: Boolean): Self = StObject.set(x, "timedOut", value.asInstanceOf[js.Any])
    
    inline def setTimedOutNull: Self = StObject.set(x, "timedOut", null)
    
    inline def setTimedOutUndefined: Self = StObject.set(x, "timedOut", js.undefined)
    
    inline def setUnableToCrawl(value: Boolean): Self = StObject.set(x, "unableToCrawl", value.asInstanceOf[js.Any])
    
    inline def setUnableToCrawlNull: Self = StObject.set(x, "unableToCrawl", null)
    
    inline def setUnableToCrawlUndefined: Self = StObject.set(x, "unableToCrawl", js.undefined)
  }
}
