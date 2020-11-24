package typings.htmlWebpackTemplate.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options
  extends typings.htmlWebpackPlugin.mod.Options {
  
  /** The <div> element id on which you plan to mount a JavaScript app. */
  var appMountId: js.UndefOr[String] = js.native
  
  /** An array of application element ids. */
  var appMountIds: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Adjust the URL for relative URLs in the document (MDN).
    * https://developer.mozilla.org/en/docs/Web/HTML/Element/base
    */
  var baseHref: js.UndefOr[String] = js.native
  
  /** Insert the webpack-dev-server hot reload script at this host:port/path; e.g., http://localhost:3000. */
  var devServer: js.UndefOr[String] = js.native
  
  /** Track usage of your site via Google Analytics. */
  var googleAnalytics: js.UndefOr[GoogleAnalyticsOptions] = js.native
  
  /**
    * For use with inline-manifest-webpack-plugin.
    * https://github.com/szrenwei/inline-manifest-webpack-plugin
    */
  var inlineManifestWebpackName: js.UndefOr[String] = js.native
  
  /** Array of <link> elements. */
  var links: js.UndefOr[js.Array[Link]] = js.native
  
  /** Sets appropriate meta tag for page scaling. */
  var mobile: js.UndefOr[Boolean] = js.native
  
  /** Array of external script imports to include on page. */
  var scripts: js.UndefOr[js.Array[Script]] = js.native
  
  /** Object that defines data you need to bootstrap a JavaScript app. */
  var window: js.UndefOr[js.Object] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setAppMountId(value: String): Self = this.set("appMountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppMountId: Self = this.set("appMountId", js.undefined)
    
    @scala.inline
    def setAppMountIdsVarargs(value: String*): Self = this.set("appMountIds", js.Array(value :_*))
    
    @scala.inline
    def setAppMountIds(value: js.Array[String]): Self = this.set("appMountIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppMountIds: Self = this.set("appMountIds", js.undefined)
    
    @scala.inline
    def setBaseHref(value: String): Self = this.set("baseHref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaseHref: Self = this.set("baseHref", js.undefined)
    
    @scala.inline
    def setDevServer(value: String): Self = this.set("devServer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDevServer: Self = this.set("devServer", js.undefined)
    
    @scala.inline
    def setGoogleAnalytics(value: GoogleAnalyticsOptions): Self = this.set("googleAnalytics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGoogleAnalytics: Self = this.set("googleAnalytics", js.undefined)
    
    @scala.inline
    def setInlineManifestWebpackName(value: String): Self = this.set("inlineManifestWebpackName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInlineManifestWebpackName: Self = this.set("inlineManifestWebpackName", js.undefined)
    
    @scala.inline
    def setLinksVarargs(value: Link*): Self = this.set("links", js.Array(value :_*))
    
    @scala.inline
    def setLinks(value: js.Array[Link]): Self = this.set("links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinks: Self = this.set("links", js.undefined)
    
    @scala.inline
    def setMobile(value: Boolean): Self = this.set("mobile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMobile: Self = this.set("mobile", js.undefined)
    
    @scala.inline
    def setScriptsVarargs(value: Script*): Self = this.set("scripts", js.Array(value :_*))
    
    @scala.inline
    def setScripts(value: js.Array[Script]): Self = this.set("scripts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScripts: Self = this.set("scripts", js.undefined)
    
    @scala.inline
    def setWindow(value: js.Object): Self = this.set("window", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWindow: Self = this.set("window", js.undefined)
  }
}
