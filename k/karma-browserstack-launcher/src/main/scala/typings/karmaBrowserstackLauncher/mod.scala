package typings.karmaBrowserstackLauncher

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object mod {
  
  trait BrowserStackOptions extends StObject {
    
    /**  BS access key, you can also use BROWSERSTACK_ACCESS_KEY env variable */
    var accessKey: String
    
    /** the BS worker build name */
    var build: js.UndefOr[String] = js.undefined
    
    /** the browser capture timeout */
    var captureTimeout: js.UndefOr[Double] = js.undefined
    
    /** force traffic through the local BrowserStack tunnel, passes flag through to BrowserStackTunnel */
    var forcelocal: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @alias tunnelIdentifier
      */
    var localIdentifier: js.UndefOr[String] = js.undefined
    
    /** the BS worker name  */
    var name: js.UndefOr[String] = js.undefined
    
    /** the BS worker project name */
    var project: js.UndefOr[String] = js.undefined
    
    /** the host of your proxy for communicating with BrowserStack REST API and BrowserStackLocal */
    var proxyHost: js.UndefOr[String] = js.undefined
    
    /** the password used for authentication with your proxy */
    var proxyPass: js.UndefOr[String] = js.undefined
    
    /** the port of your proxy */
    var proxyPort: js.UndefOr[Double] = js.undefined
    
    /** the protocol of your proxy (optional. default: http. valid: http or https) */
    var proxyProtocol: js.UndefOr[String] = js.undefined
    
    /** the username used for authentication with your proxy */
    var proxyUser: js.UndefOr[String] = js.undefined
    
    /** how many times do you want to retry to capture the browser */
    var retryLimit: js.UndefOr[Double] = js.undefined
    
    /** do you wanna establish the BrowserStack tunnel */
    var startTunnel: js.UndefOr[Boolean] = js.undefined
    
    /** the BS worker timeout */
    var timeout: js.UndefOr[Double] = js.undefined
    
    /**
      * in case you want to start the BrowserStack tunnel outside `karma` by setting `startTunnel` to `false`,
      * set the identifier passed to the `-localIdentifier` option here
      */
    var tunnelIdentifier: js.UndefOr[String] = js.undefined
    
    /** BS username, you can also use BROWSERSTACK_USERNAME env variable */
    var username: String
    
    /** enable video recording of session on BrowserStack */
    var video: js.UndefOr[Boolean] = js.undefined
  }
  object BrowserStackOptions {
    
    @scala.inline
    def apply(accessKey: String, username: String): BrowserStackOptions = {
      val __obj = js.Dynamic.literal(accessKey = accessKey.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[BrowserStackOptions]
    }
    
    @scala.inline
    implicit class BrowserStackOptionsMutableBuilder[Self <: BrowserStackOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessKey(value: String): Self = StObject.set(x, "accessKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBuild(value: String): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBuildUndefined: Self = StObject.set(x, "build", js.undefined)
      
      @scala.inline
      def setCaptureTimeout(value: Double): Self = StObject.set(x, "captureTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaptureTimeoutUndefined: Self = StObject.set(x, "captureTimeout", js.undefined)
      
      @scala.inline
      def setForcelocal(value: Boolean): Self = StObject.set(x, "forcelocal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForcelocalUndefined: Self = StObject.set(x, "forcelocal", js.undefined)
      
      @scala.inline
      def setLocalIdentifier(value: String): Self = StObject.set(x, "localIdentifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalIdentifierUndefined: Self = StObject.set(x, "localIdentifier", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
      
      @scala.inline
      def setProxyHost(value: String): Self = StObject.set(x, "proxyHost", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProxyHostUndefined: Self = StObject.set(x, "proxyHost", js.undefined)
      
      @scala.inline
      def setProxyPass(value: String): Self = StObject.set(x, "proxyPass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProxyPassUndefined: Self = StObject.set(x, "proxyPass", js.undefined)
      
      @scala.inline
      def setProxyPort(value: Double): Self = StObject.set(x, "proxyPort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProxyPortUndefined: Self = StObject.set(x, "proxyPort", js.undefined)
      
      @scala.inline
      def setProxyProtocol(value: String): Self = StObject.set(x, "proxyProtocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProxyProtocolUndefined: Self = StObject.set(x, "proxyProtocol", js.undefined)
      
      @scala.inline
      def setProxyUser(value: String): Self = StObject.set(x, "proxyUser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProxyUserUndefined: Self = StObject.set(x, "proxyUser", js.undefined)
      
      @scala.inline
      def setRetryLimit(value: Double): Self = StObject.set(x, "retryLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetryLimitUndefined: Self = StObject.set(x, "retryLimit", js.undefined)
      
      @scala.inline
      def setStartTunnel(value: Boolean): Self = StObject.set(x, "startTunnel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartTunnelUndefined: Self = StObject.set(x, "startTunnel", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setTunnelIdentifier(value: String): Self = StObject.set(x, "tunnelIdentifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTunnelIdentifierUndefined: Self = StObject.set(x, "tunnelIdentifier", js.undefined)
      
      @scala.inline
      def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVideo(value: Boolean): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVideoUndefined: Self = StObject.set(x, "video", js.undefined)
    }
  }
  
  trait ConfigOptions extends StObject {
    
    /**
      * {@link https://github.com/karma-runner/karma-browserstack-launcher#global-options}
      */
    var browserStack: js.UndefOr[BrowserStackOptions] = js.undefined
  }
  object ConfigOptions {
    
    @scala.inline
    def apply(): ConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigOptions]
    }
    
    @scala.inline
    implicit class ConfigOptionsMutableBuilder[Self <: ConfigOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBrowserStack(value: BrowserStackOptions): Self = StObject.set(x, "browserStack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBrowserStackUndefined: Self = StObject.set(x, "browserStack", js.undefined)
    }
  }
  
  trait CustomLauncher
    extends StObject
       with /**
    * you can also pass through any additional options supported by browserstack. (EG. `url`, `resolution`, etc.)
    * See {@link browserstack.com/automate/capabilities} for a full list of supported options.
    */
  /* option */ StringDictionary[js.Any] {
    
    /** name of the browser */
    var browser: js.UndefOr[String | Null] = js.undefined
    
    /** version of the browser */
    var browser_version: js.UndefOr[String | Null] = js.undefined
    
    /** the BS worker build name (optional, defaults to global) */
    var build: js.UndefOr[String] = js.undefined
    
    /** name of the device */
    var device: js.UndefOr[String | Null] = js.undefined
    
    /** the BS worker name (optional, defaults to global) */
    var name: js.UndefOr[String] = js.undefined
    
    /** which platform */
    var os: js.UndefOr[String | Null] = js.undefined
    
    /** version of the platform */
    var os_version: js.UndefOr[String | Null] = js.undefined
    
    /** the BS worker project name (optional, defaults to global) */
    var project: js.UndefOr[String] = js.undefined
    
    /** allows the session to run on a real mobile device instead of an emulator / simulator */
    var realMobile: js.UndefOr[Boolean] = js.undefined
    
    /** allows the session to run on a real mobile device instead of an emulator / simulator */
    var real_mobile: js.UndefOr[Boolean] = js.undefined
  }
  object CustomLauncher {
    
    @scala.inline
    def apply(): CustomLauncher = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CustomLauncher]
    }
    
    @scala.inline
    implicit class CustomLauncherMutableBuilder[Self <: CustomLauncher] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBrowser(value: String): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBrowserNull: Self = StObject.set(x, "browser", null)
      
      @scala.inline
      def setBrowserUndefined: Self = StObject.set(x, "browser", js.undefined)
      
      @scala.inline
      def setBrowser_version(value: String): Self = StObject.set(x, "browser_version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBrowser_versionNull: Self = StObject.set(x, "browser_version", null)
      
      @scala.inline
      def setBrowser_versionUndefined: Self = StObject.set(x, "browser_version", js.undefined)
      
      @scala.inline
      def setBuild(value: String): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBuildUndefined: Self = StObject.set(x, "build", js.undefined)
      
      @scala.inline
      def setDevice(value: String): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeviceNull: Self = StObject.set(x, "device", null)
      
      @scala.inline
      def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOs(value: String): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOsNull: Self = StObject.set(x, "os", null)
      
      @scala.inline
      def setOsUndefined: Self = StObject.set(x, "os", js.undefined)
      
      @scala.inline
      def setOs_version(value: String): Self = StObject.set(x, "os_version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOs_versionNull: Self = StObject.set(x, "os_version", null)
      
      @scala.inline
      def setOs_versionUndefined: Self = StObject.set(x, "os_version", js.undefined)
      
      @scala.inline
      def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
      
      @scala.inline
      def setRealMobile(value: Boolean): Self = StObject.set(x, "realMobile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRealMobileUndefined: Self = StObject.set(x, "realMobile", js.undefined)
      
      @scala.inline
      def setReal_mobile(value: Boolean): Self = StObject.set(x, "real_mobile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReal_mobileUndefined: Self = StObject.set(x, "real_mobile", js.undefined)
    }
  }
}
