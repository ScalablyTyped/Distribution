package typings.karmaHtmlDetailedReporter.mod.karmaAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * see {@link https://github.com/a11smiles/karma-html-detailed-reporter#options}
  */
@js.native
trait HtmlDetailedOptions extends js.Object {
  
  /**
    * Enables/disables the refresh to start automatically
    * @default true
    */
  var autoReload: js.UndefOr[Boolean] = js.native
  
  /**
    * Sets the reports output base path
    * @default './_reports'
    */
  var dir: js.UndefOr[String] = js.native
  
  /**
    * Sets the refresh timeout (in milliseconds) for the page
    * @default 1000
    */
  var refreshTimeout: js.UndefOr[Double] = js.native
  
  /**
    * Determines whether the detailed results of the failed tests are default shown or hidden in the browser (you are able to toggle live in the browser)
    * @default true
    */
  var showFailed: js.UndefOr[Boolean] = js.native
  
  /**
    * Determines whether the detailed results of the skipped tests are default shown or hidden in the browser (you are able to toggle live in the browser)
    * @default true
    */
  var showSkipped: js.UndefOr[Boolean] = js.native
  
  /**
    * Determines whether the detailed results of the successfull tests are default shown or hidden in the browser (you are able to toggle live in the browser)
    * @default true
    */
  var showSuccess: js.UndefOr[Boolean] = js.native
  
  /**
    * Determines whether the results are split into a separate file for each browser
    * @default true
    */
  var splitResults: js.UndefOr[Boolean] = js.native
  
  /**
    * Determines whether to use the hosted versions of Boostrap and jQuery. If testing within a CI build (e.g. TFS, Jenkins, TeamCity),
    * setting this to true would allow you to see the reports while the builders do not maintain node modules.
    * @default false
    */
  var useHostedBootstrap: js.UndefOr[Boolean] = js.native
}
object HtmlDetailedOptions {
  
  @scala.inline
  def apply(): HtmlDetailedOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HtmlDetailedOptions]
  }
  
  @scala.inline
  implicit class HtmlDetailedOptionsOps[Self <: HtmlDetailedOptions] (val x: Self) extends AnyVal {
    
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
    def setAutoReload(value: Boolean): Self = this.set("autoReload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoReload: Self = this.set("autoReload", js.undefined)
    
    @scala.inline
    def setDir(value: String): Self = this.set("dir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDir: Self = this.set("dir", js.undefined)
    
    @scala.inline
    def setRefreshTimeout(value: Double): Self = this.set("refreshTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefreshTimeout: Self = this.set("refreshTimeout", js.undefined)
    
    @scala.inline
    def setShowFailed(value: Boolean): Self = this.set("showFailed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowFailed: Self = this.set("showFailed", js.undefined)
    
    @scala.inline
    def setShowSkipped(value: Boolean): Self = this.set("showSkipped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowSkipped: Self = this.set("showSkipped", js.undefined)
    
    @scala.inline
    def setShowSuccess(value: Boolean): Self = this.set("showSuccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowSuccess: Self = this.set("showSuccess", js.undefined)
    
    @scala.inline
    def setSplitResults(value: Boolean): Self = this.set("splitResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSplitResults: Self = this.set("splitResults", js.undefined)
    
    @scala.inline
    def setUseHostedBootstrap(value: Boolean): Self = this.set("useHostedBootstrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseHostedBootstrap: Self = this.set("useHostedBootstrap", js.undefined)
  }
}
