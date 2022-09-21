package typings.gulpConnectPhp

import typings.gulpConnectPhp.gulpConnectPhpStrings.php_args
import typings.gulpConnectPhp.gulpConnectPhpStrings.spawn
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("gulp-connect-php", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with PhpDevelopmentServerConnection {
    def this(opts: Options) = this()
  }
  @JSImport("gulp-connect-php", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("gulp-connect-php", "OPTIONS_PHP_CLI_ARR")
  @js.native
  def OPTIONS_PHP_CLI_ARR: php_args = js.native
  inline def OPTIONS_PHP_CLI_ARR_=(x: php_args): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OPTIONS_PHP_CLI_ARR")(x.asInstanceOf[js.Any])
  
  @JSImport("gulp-connect-php", "OPTIONS_SPAWN_OBJ")
  @js.native
  def OPTIONS_SPAWN_OBJ: spawn = js.native
  inline def OPTIONS_SPAWN_OBJ_=(x: spawn): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OPTIONS_SPAWN_OBJ")(x.asInstanceOf[js.Any])
  
  /**
    * Close/Shutdown the PHP development server
    * @param callback Optional callback, passed the return of `ChildProcess.kill(...)` or nothing if not started
    */
  @JSImport("gulp-connect-php", "closeServer")
  @js.native
  def closeServer: js.Function1[
    /* callback */ js.UndefOr[js.Function1[/* killResult */ js.UndefOr[Boolean], Unit]], 
    Unit
  ] = js.native
  inline def closeServer_=(
    x: js.Function1[
      /* callback */ js.UndefOr[js.Function1[/* killResult */ js.UndefOr[Boolean], Unit]], 
      Unit
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("closeServer")(x.asInstanceOf[js.Any])
  
  /**
    * @deprecated Used only to create static server and closeServer functions
    */
  /* Inlined gulp-connect-php.gulp-connect-php.PhpDevelopmentServerConnection & {  OPTIONS_SPAWN_OBJ :'spawn',   OPTIONS_PHP_CLI_ARR :'php_args'} */
  object compat {
    
    @JSImport("gulp-connect-php", "compat")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("gulp-connect-php", "compat.OPTIONS_PHP_CLI_ARR")
    @js.native
    def OPTIONS_PHP_CLI_ARR: php_args = js.native
    inline def OPTIONS_PHP_CLI_ARR_=(x: php_args): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OPTIONS_PHP_CLI_ARR")(x.asInstanceOf[js.Any])
    
    @JSImport("gulp-connect-php", "compat.OPTIONS_SPAWN_OBJ")
    @js.native
    def OPTIONS_SPAWN_OBJ: spawn = js.native
    inline def OPTIONS_SPAWN_OBJ_=(x: spawn): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OPTIONS_SPAWN_OBJ")(x.asInstanceOf[js.Any])
    
    /**
      * Close/Shutdown the PHP development server
      * @param callback Optional callback, passed the return of `ChildProcess.kill(...)` or nothing if not started
      */
    inline def closeServer(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("closeServer")().asInstanceOf[Unit]
    inline def closeServer(callback: js.Function1[/* killResult */ js.UndefOr[Boolean], Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("closeServer")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * @param options Options to override ones set in the constructor
      * @param callback Called when the sever is connected. May be passed an error
      */
    inline def server(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("server")().asInstanceOf[Unit]
    inline def server(options: Unit, callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("server")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def server(options: Options): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("server")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def server(options: Options, callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("server")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  /**
    * @param options Options
    * @param callback Called when the sever is connected. May be passed an error
    */
  @JSImport("gulp-connect-php", "server")
  @js.native
  def server: js.Function2[
    /* options */ js.UndefOr[Options], 
    /* callback */ js.UndefOr[js.Function1[/* err */ js.UndefOr[js.Error], Unit]], 
    Unit
  ] = js.native
  inline def server_=(
    x: js.Function2[
      /* options */ js.UndefOr[Options], 
      /* callback */ js.UndefOr[js.Function1[/* err */ js.UndefOr[js.Error], Unit]], 
      Unit
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("server")(x.asInstanceOf[js.Any])
  
  type ConfigCallback = js.Function2[
    /* type */ ConfigCallbackType, 
    /* collection */ (Record[String, Any]) & js.Array[String], 
    (Record[String, Any]) | js.Array[String]
  ]
  
  /* Rewritten from type alias, can be one of: 
    - typings.gulpConnectPhp.gulpConnectPhpStrings.spawn
    - typings.gulpConnectPhp.gulpConnectPhpStrings.php_args
  */
  trait ConfigCallbackType extends StObject
  object ConfigCallbackType {
    
    inline def php_args: typings.gulpConnectPhp.gulpConnectPhpStrings.php_args = "php_args".asInstanceOf[typings.gulpConnectPhp.gulpConnectPhpStrings.php_args]
    
    inline def spawn: typings.gulpConnectPhp.gulpConnectPhpStrings.spawn = "spawn".asInstanceOf[typings.gulpConnectPhp.gulpConnectPhpStrings.spawn]
  }
  
  trait Options extends StObject {
    
    /**
      * @default "."
      */
    var base: js.UndefOr[String] = js.undefined
    
    /**
      * The PHP binary
      * @default "php"
      */
    var bin: js.UndefOr[String] = js.undefined
    
    /**
      * Callback to modify config options
      * @param type Either OPTIONS_SPAWN_OBJ or OPTIONS_PHP_CLI_ARR
      * @param collection An object if type is OPTIONS_SPAWN_OBJ,
      * or an array if type is OPTIONS_PHP_CLI_ARR
      * @returns Possibly modified version of collection to use instead of original
      */
    var configCallback: js.UndefOr[ConfigCallback | Null] = js.undefined
    
    var debug: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The hostname to run on
      * @default "127.0.0.1"
      */
    var hostname: js.UndefOr[String] = js.undefined
    
    /**
      * Passed with `-c` flag
      */
    var ini: js.UndefOr[String] = js.undefined
    
    /**
      * @default false
      */
    var open: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The port to run on
      * @default 8000
      */
    var port: js.UndefOr[Double] = js.undefined
    
    var root: js.UndefOr[String] = js.undefined
    
    var router: js.UndefOr[String] = js.undefined
    
    var stdio: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setBase(value: String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      inline def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
      
      inline def setBin(value: String): Self = StObject.set(x, "bin", value.asInstanceOf[js.Any])
      
      inline def setBinUndefined: Self = StObject.set(x, "bin", js.undefined)
      
      inline def setConfigCallback(
        value: (/* type */ ConfigCallbackType, /* collection */ (Record[String, Any]) & js.Array[String]) => (Record[String, Any]) | js.Array[String]
      ): Self = StObject.set(x, "configCallback", js.Any.fromFunction2(value))
      
      inline def setConfigCallbackNull: Self = StObject.set(x, "configCallback", null)
      
      inline def setConfigCallbackUndefined: Self = StObject.set(x, "configCallback", js.undefined)
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      inline def setIni(value: String): Self = StObject.set(x, "ini", value.asInstanceOf[js.Any])
      
      inline def setIniUndefined: Self = StObject.set(x, "ini", js.undefined)
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      inline def setRouter(value: String): Self = StObject.set(x, "router", value.asInstanceOf[js.Any])
      
      inline def setRouterUndefined: Self = StObject.set(x, "router", js.undefined)
      
      inline def setStdio(value: String): Self = StObject.set(x, "stdio", value.asInstanceOf[js.Any])
      
      inline def setStdioUndefined: Self = StObject.set(x, "stdio", js.undefined)
    }
  }
  
  @js.native
  trait PhpDevelopmentServerConnection extends StObject {
    
    /**
      * Close/Shutdown the PHP development server
      * @param callback Optional callback, passed the return of `ChildProcess.kill(...)` or nothing if not started
      */
    def closeServer(): Unit = js.native
    def closeServer(callback: js.Function1[/* killResult */ js.UndefOr[Boolean], Unit]): Unit = js.native
    
    /**
      * The port the server is running on
      */
    def port: Double = js.native
    
    /**
      * @param options Options to override ones set in the constructor
      * @param callback Called when the sever is connected. May be passed an error
      */
    def server(): Unit = js.native
    def server(options: Unit, callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Unit = js.native
    def server(options: Options): Unit = js.native
    def server(options: Options, callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Unit = js.native
  }
}
