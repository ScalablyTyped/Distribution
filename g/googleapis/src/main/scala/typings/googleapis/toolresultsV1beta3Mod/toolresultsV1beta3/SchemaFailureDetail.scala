package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaFailureDetail extends StObject {
  
  /**
    * If the failure was severe because the system (app) under test crashed.
    */
  var crashed: js.UndefOr[Boolean] = js.native
  
  /**
    * If an app is not installed and thus no test can be run with the app. This
    * might be caused by trying to run a test on an unsupported platform.
    */
  var notInstalled: js.UndefOr[Boolean] = js.native
  
  /**
    * If a native process (including any other than the app) crashed.
    */
  var otherNativeCrash: js.UndefOr[Boolean] = js.native
  
  /**
    * If the test overran some time limit, and that is why it failed.
    */
  var timedOut: js.UndefOr[Boolean] = js.native
  
  /**
    * If the robo was unable to crawl the app; perhaps because the app did not
    * start.
    */
  var unableToCrawl: js.UndefOr[Boolean] = js.native
}
object SchemaFailureDetail {
  
  @scala.inline
  def apply(): SchemaFailureDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFailureDetail]
  }
  
  @scala.inline
  implicit class SchemaFailureDetailMutableBuilder[Self <: SchemaFailureDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCrashed(value: Boolean): Self = StObject.set(x, "crashed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrashedUndefined: Self = StObject.set(x, "crashed", js.undefined)
    
    @scala.inline
    def setNotInstalled(value: Boolean): Self = StObject.set(x, "notInstalled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotInstalledUndefined: Self = StObject.set(x, "notInstalled", js.undefined)
    
    @scala.inline
    def setOtherNativeCrash(value: Boolean): Self = StObject.set(x, "otherNativeCrash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOtherNativeCrashUndefined: Self = StObject.set(x, "otherNativeCrash", js.undefined)
    
    @scala.inline
    def setTimedOut(value: Boolean): Self = StObject.set(x, "timedOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimedOutUndefined: Self = StObject.set(x, "timedOut", js.undefined)
    
    @scala.inline
    def setUnableToCrawl(value: Boolean): Self = StObject.set(x, "unableToCrawl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnableToCrawlUndefined: Self = StObject.set(x, "unableToCrawl", js.undefined)
  }
}
