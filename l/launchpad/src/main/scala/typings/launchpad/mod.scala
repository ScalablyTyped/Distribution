package typings.launchpad

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("launchpad", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def browserstack(authCreds: BrowserstackAuth, cb: js.Function2[/* err */ Any, /* browserstack */ Launcher, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("browserstack")(authCreds.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  object local {
    
    inline def apply(cb: js.Function2[/* err */ Any, /* localBrowsers */ Launcher, Unit]): Unit = ^.asInstanceOf[js.Dynamic].apply(cb.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSImport("launchpad", "local")
    @js.native
    val ^ : js.Any = js.native
    
    object platform {
      
      @JSImport("launchpad", "local.platform")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("launchpad", "local.platform.aurora")
      @js.native
      def aurora: js.UndefOr[BrowserPlatformDetails] = js.native
      inline def aurora_=(x: js.UndefOr[BrowserPlatformDetails]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("aurora")(x.asInstanceOf[js.Any])
      
      @JSImport("launchpad", "local.platform.canary")
      @js.native
      def canary: js.UndefOr[BrowserPlatformDetails] = js.native
      inline def canary_=(x: js.UndefOr[BrowserPlatformDetails]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("canary")(x.asInstanceOf[js.Any])
      
      @JSImport("launchpad", "local.platform.chrome")
      @js.native
      def chrome: js.UndefOr[BrowserPlatformDetails] = js.native
      inline def chrome_=(x: js.UndefOr[BrowserPlatformDetails]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("chrome")(x.asInstanceOf[js.Any])
      
      @JSImport("launchpad", "local.platform.chromium")
      @js.native
      def chromium: js.UndefOr[BrowserPlatformDetails] = js.native
      inline def chromium_=(x: js.UndefOr[BrowserPlatformDetails]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("chromium")(x.asInstanceOf[js.Any])
      
      @JSImport("launchpad", "local.platform.edge")
      @js.native
      def edge: js.UndefOr[BrowserPlatformDetails] = js.native
      inline def edge_=(x: js.UndefOr[BrowserPlatformDetails]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("edge")(x.asInstanceOf[js.Any])
      
      @JSImport("launchpad", "local.platform.firefox")
      @js.native
      def firefox: js.UndefOr[BrowserPlatformDetails] = js.native
      inline def firefox_=(x: js.UndefOr[BrowserPlatformDetails]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("firefox")(x.asInstanceOf[js.Any])
      
      @JSImport("launchpad", "local.platform.ie")
      @js.native
      def ie: js.UndefOr[BrowserPlatformDetails] = js.native
      inline def ie_=(x: js.UndefOr[BrowserPlatformDetails]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ie")(x.asInstanceOf[js.Any])
      
      @JSImport("launchpad", "local.platform.nodeWebkit")
      @js.native
      def nodeWebkit: js.UndefOr[BrowserPlatformDetails] = js.native
      inline def nodeWebkit_=(x: js.UndefOr[BrowserPlatformDetails]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nodeWebkit")(x.asInstanceOf[js.Any])
      
      @JSImport("launchpad", "local.platform.opera")
      @js.native
      def opera: js.UndefOr[BrowserPlatformDetails] = js.native
      inline def opera_=(x: js.UndefOr[BrowserPlatformDetails]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("opera")(x.asInstanceOf[js.Any])
      
      @JSImport("launchpad", "local.platform.phantom")
      @js.native
      def phantom: js.UndefOr[BrowserPlatformDetails] = js.native
      inline def phantom_=(x: js.UndefOr[BrowserPlatformDetails]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("phantom")(x.asInstanceOf[js.Any])
      
      @JSImport("launchpad", "local.platform.safari")
      @js.native
      def safari: js.UndefOr[BrowserPlatformDetails] = js.native
      inline def safari_=(x: js.UndefOr[BrowserPlatformDetails]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("safari")(x.asInstanceOf[js.Any])
    }
  }
  
  trait Browser extends StObject {
    
    var binPath: String
    
    var name: String
    
    var version: String
  }
  object Browser {
    
    inline def apply(binPath: String, name: String, version: String): Browser = {
      val __obj = js.Dynamic.literal(binPath = binPath.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Browser]
    }
    
    extension [Self <: Browser](x: Self) {
      
      inline def setBinPath(value: String): Self = StObject.set(x, "binPath", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  type BrowserFunction = js.Function2[
    /* url */ String, 
    /* callback */ js.Function2[/* err */ Any, /* instance */ Instance, Unit], 
    Unit
  ]
  
  trait BrowserPlatformDetails extends StObject {
    
    var args: js.UndefOr[js.Array[String]] = js.undefined
    
    var command: js.UndefOr[String] = js.undefined
    
    var cwd: js.UndefOr[String] = js.undefined
    
    var defaultLocation: js.UndefOr[String] = js.undefined
    
    var getCommand: js.UndefOr[
        js.Function3[/* browser */ this.type, /* url */ String, /* args */ js.Array[String], String]
      ] = js.undefined
    
    var imageName: js.UndefOr[String] = js.undefined
    
    var multi: js.UndefOr[Boolean] = js.undefined
    
    var opensTab: js.UndefOr[Boolean] = js.undefined
    
    var pathQuery: js.UndefOr[String] = js.undefined
    
    var plistPath: js.UndefOr[String] = js.undefined
    
    var process: js.UndefOr[String] = js.undefined
    
    var versionKey: js.UndefOr[String] = js.undefined
  }
  object BrowserPlatformDetails {
    
    inline def apply(): BrowserPlatformDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BrowserPlatformDetails]
    }
    
    extension [Self <: BrowserPlatformDetails](x: Self) {
      
      inline def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      inline def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value*))
      
      inline def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
      
      inline def setCommandUndefined: Self = StObject.set(x, "command", js.undefined)
      
      inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      inline def setDefaultLocation(value: String): Self = StObject.set(x, "defaultLocation", value.asInstanceOf[js.Any])
      
      inline def setDefaultLocationUndefined: Self = StObject.set(x, "defaultLocation", js.undefined)
      
      inline def setGetCommand(value: (BrowserPlatformDetails, /* url */ String, /* args */ js.Array[String]) => String): Self = StObject.set(x, "getCommand", js.Any.fromFunction3(value))
      
      inline def setGetCommandUndefined: Self = StObject.set(x, "getCommand", js.undefined)
      
      inline def setImageName(value: String): Self = StObject.set(x, "imageName", value.asInstanceOf[js.Any])
      
      inline def setImageNameUndefined: Self = StObject.set(x, "imageName", js.undefined)
      
      inline def setMulti(value: Boolean): Self = StObject.set(x, "multi", value.asInstanceOf[js.Any])
      
      inline def setMultiUndefined: Self = StObject.set(x, "multi", js.undefined)
      
      inline def setOpensTab(value: Boolean): Self = StObject.set(x, "opensTab", value.asInstanceOf[js.Any])
      
      inline def setOpensTabUndefined: Self = StObject.set(x, "opensTab", js.undefined)
      
      inline def setPathQuery(value: String): Self = StObject.set(x, "pathQuery", value.asInstanceOf[js.Any])
      
      inline def setPathQueryUndefined: Self = StObject.set(x, "pathQuery", js.undefined)
      
      inline def setPlistPath(value: String): Self = StObject.set(x, "plistPath", value.asInstanceOf[js.Any])
      
      inline def setPlistPathUndefined: Self = StObject.set(x, "plistPath", js.undefined)
      
      inline def setProcess(value: String): Self = StObject.set(x, "process", value.asInstanceOf[js.Any])
      
      inline def setProcessUndefined: Self = StObject.set(x, "process", js.undefined)
      
      inline def setVersionKey(value: String): Self = StObject.set(x, "versionKey", value.asInstanceOf[js.Any])
      
      inline def setVersionKeyUndefined: Self = StObject.set(x, "versionKey", js.undefined)
    }
  }
  
  trait BrowserstackAuth extends StObject {
    
    var password: String
    
    var username: String
  }
  object BrowserstackAuth {
    
    inline def apply(password: String, username: String): BrowserstackAuth = {
      val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[BrowserstackAuth]
    }
    
    extension [Self <: BrowserstackAuth](x: Self) {
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Instance extends StObject {
    
    def addListener(event: String, listener: js.Function): this.type = js.native
    
    def emit(event: String, args: Any*): Boolean = js.native
    
    var id: String = js.native
    
    def listeners(event: String): js.Array[js.Function] = js.native
    
    def on(event: String, listener: js.Function): this.type = js.native
    
    def once(event: String, listener: js.Function): this.type = js.native
    
    def removeAllListeners(): this.type = js.native
    def removeAllListeners(event: String): this.type = js.native
    
    def removeListener(event: String, listener: js.Function): this.type = js.native
    
    def setMaxListeners(n: Double): Unit = js.native
    
    def status(cb: js.Function2[/* err */ Any, /* status */ Any, Unit]): Unit = js.native
    
    def stop(cb: js.Function1[/* err */ Any, Unit]): Unit = js.native
  }
  
  trait LaunchOptions extends StObject {
    
    var browser: String
    
    var version: js.UndefOr[String] = js.undefined
  }
  object LaunchOptions {
    
    inline def apply(browser: String): LaunchOptions = {
      val __obj = js.Dynamic.literal(browser = browser.asInstanceOf[js.Any])
      __obj.asInstanceOf[LaunchOptions]
    }
    
    extension [Self <: LaunchOptions](x: Self) {
      
      inline def setBrowser(value: String): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  @js.native
  trait Launcher extends StObject {
    
    def apply(
      url: String,
      options: LaunchOptions,
      callback: js.Function2[/* err */ Any, /* instance */ Instance, Unit]
    ): Unit = js.native
    
    def aurora(url: String, callback: js.Function2[/* err */ Any, /* instance */ Instance, Unit]): Unit = js.native
    @JSName("aurora")
    var aurora_Original: BrowserFunction = js.native
    
    def browsers(cb: js.Function2[/* error */ Any, /* browsers */ js.UndefOr[js.Array[Browser]], Unit]): Unit = js.native
    
    def canary(url: String, callback: js.Function2[/* err */ Any, /* instance */ Instance, Unit]): Unit = js.native
    @JSName("canary")
    var canary_Original: BrowserFunction = js.native
    
    def chrome(url: String, callback: js.Function2[/* err */ Any, /* instance */ Instance, Unit]): Unit = js.native
    @JSName("chrome")
    var chrome_Original: BrowserFunction = js.native
    
    def chromium(url: String, callback: js.Function2[/* err */ Any, /* instance */ Instance, Unit]): Unit = js.native
    @JSName("chromium")
    var chromium_Original: BrowserFunction = js.native
    
    def edge(url: String, callback: js.Function2[/* err */ Any, /* instance */ Instance, Unit]): Unit = js.native
    @JSName("edge")
    var edge_Original: BrowserFunction = js.native
    
    def firefox(url: String, callback: js.Function2[/* err */ Any, /* instance */ Instance, Unit]): Unit = js.native
    @JSName("firefox")
    var firefox_Original: BrowserFunction = js.native
    
    def ie(url: String, callback: js.Function2[/* err */ Any, /* instance */ Instance, Unit]): Unit = js.native
    @JSName("ie")
    var ie_Original: BrowserFunction = js.native
    
    def nodeWebkit(url: String, callback: js.Function2[/* err */ Any, /* instance */ Instance, Unit]): Unit = js.native
    @JSName("nodeWebkit")
    var nodeWebkit_Original: BrowserFunction = js.native
    
    def opera(url: String, callback: js.Function2[/* err */ Any, /* instance */ Instance, Unit]): Unit = js.native
    @JSName("opera")
    var opera_Original: BrowserFunction = js.native
    
    def phantom(url: String, callback: js.Function2[/* err */ Any, /* instance */ Instance, Unit]): Unit = js.native
    @JSName("phantom")
    var phantom_Original: BrowserFunction = js.native
    
    def safari(url: String, callback: js.Function2[/* err */ Any, /* instance */ Instance, Unit]): Unit = js.native
    @JSName("safari")
    var safari_Original: BrowserFunction = js.native
  }
}
