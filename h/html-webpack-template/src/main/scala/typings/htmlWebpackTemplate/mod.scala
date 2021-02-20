package typings.htmlWebpackTemplate

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("html-webpack-template", JSImport.Namespace)
  @js.native
  val ^ : String = js.native
  
  type Attributes = StringDictionary[js.Any]
  
  /** @deprecated use Options */
  type Config = Options
  
  /** @deprecated use GoogleAnalyticsOptions */
  type GoogleAnalyticsConfig = GoogleAnalyticsOptions
  
  @js.native
  trait GoogleAnalyticsOptions extends StObject {
    
    /** Log a pageview event after the analytics code loads. */
    var pageViewOnLoad: js.UndefOr[Boolean] = js.native
    
    var trackingId: String = js.native
  }
  object GoogleAnalyticsOptions {
    
    @scala.inline
    def apply(trackingId: String): GoogleAnalyticsOptions = {
      val __obj = js.Dynamic.literal(trackingId = trackingId.asInstanceOf[js.Any])
      __obj.asInstanceOf[GoogleAnalyticsOptions]
    }
    
    @scala.inline
    implicit class GoogleAnalyticsOptionsMutableBuilder[Self <: GoogleAnalyticsOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPageViewOnLoad(value: Boolean): Self = StObject.set(x, "pageViewOnLoad", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageViewOnLoadUndefined: Self = StObject.set(x, "pageViewOnLoad", js.undefined)
      
      @scala.inline
      def setTrackingId(value: String): Self = StObject.set(x, "trackingId", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * string: value is assigned to the href attribute and the rel attribute is set to "stylesheet"
    * object: properties and values are used as the attribute names and values, respectively.
    */
  type Link = Resource
  
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
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppMountId(value: String): Self = StObject.set(x, "appMountId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppMountIdUndefined: Self = StObject.set(x, "appMountId", js.undefined)
      
      @scala.inline
      def setAppMountIds(value: js.Array[String]): Self = StObject.set(x, "appMountIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppMountIdsUndefined: Self = StObject.set(x, "appMountIds", js.undefined)
      
      @scala.inline
      def setAppMountIdsVarargs(value: String*): Self = StObject.set(x, "appMountIds", js.Array(value :_*))
      
      @scala.inline
      def setBaseHref(value: String): Self = StObject.set(x, "baseHref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseHrefUndefined: Self = StObject.set(x, "baseHref", js.undefined)
      
      @scala.inline
      def setDevServer(value: String): Self = StObject.set(x, "devServer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDevServerUndefined: Self = StObject.set(x, "devServer", js.undefined)
      
      @scala.inline
      def setGoogleAnalytics(value: GoogleAnalyticsOptions): Self = StObject.set(x, "googleAnalytics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGoogleAnalyticsUndefined: Self = StObject.set(x, "googleAnalytics", js.undefined)
      
      @scala.inline
      def setInlineManifestWebpackName(value: String): Self = StObject.set(x, "inlineManifestWebpackName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInlineManifestWebpackNameUndefined: Self = StObject.set(x, "inlineManifestWebpackName", js.undefined)
      
      @scala.inline
      def setLinks(value: js.Array[Link]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinksUndefined: Self = StObject.set(x, "links", js.undefined)
      
      @scala.inline
      def setLinksVarargs(value: Link*): Self = StObject.set(x, "links", js.Array(value :_*))
      
      @scala.inline
      def setMobile(value: Boolean): Self = StObject.set(x, "mobile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMobileUndefined: Self = StObject.set(x, "mobile", js.undefined)
      
      @scala.inline
      def setScripts(value: js.Array[Script]): Self = StObject.set(x, "scripts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScriptsUndefined: Self = StObject.set(x, "scripts", js.undefined)
      
      @scala.inline
      def setScriptsVarargs(value: Script*): Self = StObject.set(x, "scripts", js.Array(value :_*))
      
      @scala.inline
      def setWindow(value: js.Object): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowUndefined: Self = StObject.set(x, "window", js.undefined)
    }
  }
  
  type Resource = String | Attributes
  
  /**
    * string: value is assigned to the src attribute and the type attribute is set to "text/javascript".
    * object: properties and values are used as the attribute names and values, respectively.
    */
  type Script = Resource
  
  type _To = String
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: String = ^
}
