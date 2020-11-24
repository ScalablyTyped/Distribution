package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaFailureDetail extends js.Object {
  
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
  implicit class SchemaFailureDetailOps[Self <: SchemaFailureDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCrashed(value: Boolean): Self = this.set("crashed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrashed: Self = this.set("crashed", js.undefined)
    
    @scala.inline
    def setNotInstalled(value: Boolean): Self = this.set("notInstalled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotInstalled: Self = this.set("notInstalled", js.undefined)
    
    @scala.inline
    def setOtherNativeCrash(value: Boolean): Self = this.set("otherNativeCrash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOtherNativeCrash: Self = this.set("otherNativeCrash", js.undefined)
    
    @scala.inline
    def setTimedOut(value: Boolean): Self = this.set("timedOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimedOut: Self = this.set("timedOut", js.undefined)
    
    @scala.inline
    def setUnableToCrawl(value: Boolean): Self = this.set("unableToCrawl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnableToCrawl: Self = this.set("unableToCrawl", js.undefined)
  }
}
