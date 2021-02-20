package typings.launchpad

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("launchpad", "browserstack")
  @js.native
  def browserstack(authCreds: BrowserstackAuth, cb: js.Function2[/* err */ js.Any, /* browserstack */ Launcher, Unit]): Unit = js.native
  
  object local {
    
    @JSImport("launchpad", "local")
    @js.native
    def apply(cb: js.Function2[/* err */ js.Any, /* localBrowsers */ Launcher, Unit]): Unit = js.native
    
    object platform {
      
      @JSImport("launchpad", "local.platform")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("launchpad", "local.platform.aurora")
      @js.native
      def aurora: js.UndefOr[BrowserPlatformDetails] = js.native
      @scala.inline
      def aurora_=(x: js.UndefOr[BrowserPlatformDetails]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("aurora")(x.asInstanceOf[js.Any])
      
      @JSImport("launchpad", "local.platform.canary")
      @js.native
      def canary: js.UndefOr[BrowserPlatformDetails] = js.native
      @scala.inline
      def canary_=(x: js.UndefOr[BrowserPlatformDetails]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("canary")(x.asInstanceOf[js.Any])
      
      @JSImport("launchpad", "local.platform.chrome")
      @js.native
      def chrome: js.UndefOr[BrowserPlatformDetails] = js.native
      @scala.inline
      def chrome_=(x: js.UndefOr[BrowserPlatformDetails]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("chrome")(x.asInstanceOf[js.Any])
      
      @JSImport("launchpad", "local.platform.chromium")
      @js.native
      def chromium: js.UndefOr[BrowserPlatformDetails] = js.native
      @scala.inline
      def chromium_=(x: js.UndefOr[BrowserPlatformDetails]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("chromium")(x.asInstanceOf[js.Any])
      
      @JSImport("launchpad", "local.platform.edge")
      @js.native
      def edge: js.UndefOr[BrowserPlatformDetails] = js.native
      @scala.inline
      def edge_=(x: js.UndefOr[BrowserPlatformDetails]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("edge")(x.asInstanceOf[js.Any])
      
      @JSImport("launchpad", "local.platform.firefox")
      @js.native
      def firefox: js.UndefOr[BrowserPlatformDetails] = js.native
      @scala.inline
      def firefox_=(x: js.UndefOr[BrowserPlatformDetails]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("firefox")(x.asInstanceOf[js.Any])
      
      @JSImport("launchpad", "local.platform.ie")
      @js.native
      def ie: js.UndefOr[BrowserPlatformDetails] = js.native
      @scala.inline
      def ie_=(x: js.UndefOr[BrowserPlatformDetails]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ie")(x.asInstanceOf[js.Any])
      
      @JSImport("launchpad", "local.platform.nodeWebkit")
      @js.native
      def nodeWebkit: js.UndefOr[BrowserPlatformDetails] = js.native
      @scala.inline
      def nodeWebkit_=(x: js.UndefOr[BrowserPlatformDetails]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nodeWebkit")(x.asInstanceOf[js.Any])
      
      @JSImport("launchpad", "local.platform.opera")
      @js.native
      def opera: js.UndefOr[BrowserPlatformDetails] = js.native
      @scala.inline
      def opera_=(x: js.UndefOr[BrowserPlatformDetails]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("opera")(x.asInstanceOf[js.Any])
      
      @JSImport("launchpad", "local.platform.phantom")
      @js.native
      def phantom: js.UndefOr[BrowserPlatformDetails] = js.native
      @scala.inline
      def phantom_=(x: js.UndefOr[BrowserPlatformDetails]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("phantom")(x.asInstanceOf[js.Any])
      
      @JSImport("launchpad", "local.platform.safari")
      @js.native
      def safari: js.UndefOr[BrowserPlatformDetails] = js.native
      @scala.inline
      def safari_=(x: js.UndefOr[BrowserPlatformDetails]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("safari")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Browser extends StObject {
    
    var binPath: String = js.native
    
    var name: String = js.native
    
    var version: String = js.native
  }
  object Browser {
    
    @scala.inline
    def apply(binPath: String, name: String, version: String): Browser = {
      val __obj = js.Dynamic.literal(binPath = binPath.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Browser]
    }
    
    @scala.inline
    implicit class BrowserMutableBuilder[Self <: Browser] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBinPath(value: String): Self = StObject.set(x, "binPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  type BrowserFunction = js.Function2[
    /* url */ String, 
    /* callback */ js.Function2[/* err */ js.Any, /* instance */ Instance, Unit], 
    Unit
  ]
  
  @js.native
  trait BrowserPlatformDetails extends StObject {
    
    var args: js.UndefOr[js.Array[String]] = js.native
    
    var command: js.UndefOr[String] = js.native
    
    var cwd: js.UndefOr[String] = js.native
    
    var defaultLocation: js.UndefOr[String] = js.native
    
    var getCommand: js.UndefOr[
        js.Function3[/* browser */ this.type, /* url */ String, /* args */ js.Array[String], String]
      ] = js.native
    
    var imageName: js.UndefOr[String] = js.native
    
    var multi: js.UndefOr[Boolean] = js.native
    
    var opensTab: js.UndefOr[Boolean] = js.native
    
    var pathQuery: js.UndefOr[String] = js.native
    
    var plistPath: js.UndefOr[String] = js.native
    
    var process: js.UndefOr[String] = js.native
    
    var versionKey: js.UndefOr[String] = js.native
  }
  object BrowserPlatformDetails {
    
    @scala.inline
    def apply(): BrowserPlatformDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BrowserPlatformDetails]
    }
    
    @scala.inline
    implicit class BrowserPlatformDetailsMutableBuilder[Self <: BrowserPlatformDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      @scala.inline
      def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value :_*))
      
      @scala.inline
      def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommandUndefined: Self = StObject.set(x, "command", js.undefined)
      
      @scala.inline
      def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      @scala.inline
      def setDefaultLocation(value: String): Self = StObject.set(x, "defaultLocation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultLocationUndefined: Self = StObject.set(x, "defaultLocation", js.undefined)
      
      @scala.inline
      def setGetCommand(value: (BrowserPlatformDetails, /* url */ String, /* args */ js.Array[String]) => String): Self = StObject.set(x, "getCommand", js.Any.fromFunction3(value))
      
      @scala.inline
      def setGetCommandUndefined: Self = StObject.set(x, "getCommand", js.undefined)
      
      @scala.inline
      def setImageName(value: String): Self = StObject.set(x, "imageName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageNameUndefined: Self = StObject.set(x, "imageName", js.undefined)
      
      @scala.inline
      def setMulti(value: Boolean): Self = StObject.set(x, "multi", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultiUndefined: Self = StObject.set(x, "multi", js.undefined)
      
      @scala.inline
      def setOpensTab(value: Boolean): Self = StObject.set(x, "opensTab", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpensTabUndefined: Self = StObject.set(x, "opensTab", js.undefined)
      
      @scala.inline
      def setPathQuery(value: String): Self = StObject.set(x, "pathQuery", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathQueryUndefined: Self = StObject.set(x, "pathQuery", js.undefined)
      
      @scala.inline
      def setPlistPath(value: String): Self = StObject.set(x, "plistPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlistPathUndefined: Self = StObject.set(x, "plistPath", js.undefined)
      
      @scala.inline
      def setProcess(value: String): Self = StObject.set(x, "process", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProcessUndefined: Self = StObject.set(x, "process", js.undefined)
      
      @scala.inline
      def setVersionKey(value: String): Self = StObject.set(x, "versionKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionKeyUndefined: Self = StObject.set(x, "versionKey", js.undefined)
    }
  }
  
  @js.native
  trait BrowserstackAuth extends StObject {
    
    var password: String = js.native
    
    var username: String = js.native
  }
  object BrowserstackAuth {
    
    @scala.inline
    def apply(password: String, username: String): BrowserstackAuth = {
      val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[BrowserstackAuth]
    }
    
    @scala.inline
    implicit class BrowserstackAuthMutableBuilder[Self <: BrowserstackAuth] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Instance extends StObject {
    
    def addListener(event: String, listener: js.Function): this.type = js.native
    
    def emit(event: String, args: js.Any*): Boolean = js.native
    
    var id: String = js.native
    
    def listeners(event: String): js.Array[js.Function] = js.native
    
    def on(event: String, listener: js.Function): this.type = js.native
    
    def once(event: String, listener: js.Function): this.type = js.native
    
    def removeAllListeners(): this.type = js.native
    def removeAllListeners(event: String): this.type = js.native
    
    def removeListener(event: String, listener: js.Function): this.type = js.native
    
    def setMaxListeners(n: Double): Unit = js.native
    
    def status(cb: js.Function2[/* err */ js.Any, /* status */ js.Any, Unit]): Unit = js.native
    
    def stop(cb: js.Function1[/* err */ js.Any, Unit]): Unit = js.native
  }
  
  @js.native
  trait LaunchOptions extends StObject {
    
    var browser: String = js.native
    
    var version: js.UndefOr[String] = js.native
  }
  object LaunchOptions {
    
    @scala.inline
    def apply(browser: String): LaunchOptions = {
      val __obj = js.Dynamic.literal(browser = browser.asInstanceOf[js.Any])
      __obj.asInstanceOf[LaunchOptions]
    }
    
    @scala.inline
    implicit class LaunchOptionsMutableBuilder[Self <: LaunchOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBrowser(value: String): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  @js.native
  trait Launcher extends StObject {
    
    def apply(
      url: String,
      options: LaunchOptions,
      callback: js.Function2[/* err */ js.Any, /* instance */ Instance, Unit]
    ): Unit = js.native
    
    def aurora(url: String, callback: js.Function2[/* err */ js.Any, /* instance */ Instance, Unit]): Unit = js.native
    @JSName("aurora")
    var aurora_Original: BrowserFunction = js.native
    
    def browsers(cb: js.Function2[/* error */ js.Any, /* browsers */ js.UndefOr[js.Array[Browser]], Unit]): Unit = js.native
    
    def canary(url: String, callback: js.Function2[/* err */ js.Any, /* instance */ Instance, Unit]): Unit = js.native
    @JSName("canary")
    var canary_Original: BrowserFunction = js.native
    
    def chrome(url: String, callback: js.Function2[/* err */ js.Any, /* instance */ Instance, Unit]): Unit = js.native
    @JSName("chrome")
    var chrome_Original: BrowserFunction = js.native
    
    def chromium(url: String, callback: js.Function2[/* err */ js.Any, /* instance */ Instance, Unit]): Unit = js.native
    @JSName("chromium")
    var chromium_Original: BrowserFunction = js.native
    
    def edge(url: String, callback: js.Function2[/* err */ js.Any, /* instance */ Instance, Unit]): Unit = js.native
    @JSName("edge")
    var edge_Original: BrowserFunction = js.native
    
    def firefox(url: String, callback: js.Function2[/* err */ js.Any, /* instance */ Instance, Unit]): Unit = js.native
    @JSName("firefox")
    var firefox_Original: BrowserFunction = js.native
    
    def ie(url: String, callback: js.Function2[/* err */ js.Any, /* instance */ Instance, Unit]): Unit = js.native
    @JSName("ie")
    var ie_Original: BrowserFunction = js.native
    
    def nodeWebkit(url: String, callback: js.Function2[/* err */ js.Any, /* instance */ Instance, Unit]): Unit = js.native
    @JSName("nodeWebkit")
    var nodeWebkit_Original: BrowserFunction = js.native
    
    def opera(url: String, callback: js.Function2[/* err */ js.Any, /* instance */ Instance, Unit]): Unit = js.native
    @JSName("opera")
    var opera_Original: BrowserFunction = js.native
    
    def phantom(url: String, callback: js.Function2[/* err */ js.Any, /* instance */ Instance, Unit]): Unit = js.native
    @JSName("phantom")
    var phantom_Original: BrowserFunction = js.native
    
    def safari(url: String, callback: js.Function2[/* err */ js.Any, /* instance */ Instance, Unit]): Unit = js.native
    @JSName("safari")
    var safari_Original: BrowserFunction = js.native
  }
}
