package typings.krakenJs

import org.scalablytyped.runtime.StringDictionary
import typings.express.mod.Express
import typings.expressServeStaticCore.mod.Application
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): Express = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Express]
  inline def apply(options: String): Express = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Express]
  inline def apply(options: Options): Express = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Express]
  
  @JSImport("kraken-js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait Kraken
    extends typings.expressServeStaticCore.mod.Express {
    
    def kraken(): Application = js.native
    @JSName("kraken")
    var kraken_Original: Kraken = js.native
  }
  
  trait Options extends StObject {
    
    var basedir: js.UndefOr[String] = js.undefined
    
    var configdir: js.UndefOr[String] = js.undefined
    
    var inheritViews: js.UndefOr[Boolean] = js.undefined
    
    var mountpath: js.UndefOr[String] = js.undefined
    
    var onconfig: js.UndefOr[
        js.Function2[
          /* config */ Map[String, Any], 
          /* next */ js.Function2[/* err */ js.Error | Null, /* config */ js.UndefOr[js.Object], Any], 
          Any
        ]
      ] = js.undefined
    
    var protocols: js.UndefOr[js.Object] = js.undefined
    
    var startupHeaders: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var uncaughtException: js.UndefOr[js.Function1[/* err */ js.Error, Any]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setBasedir(value: String): Self = StObject.set(x, "basedir", value.asInstanceOf[js.Any])
      
      inline def setBasedirUndefined: Self = StObject.set(x, "basedir", js.undefined)
      
      inline def setConfigdir(value: String): Self = StObject.set(x, "configdir", value.asInstanceOf[js.Any])
      
      inline def setConfigdirUndefined: Self = StObject.set(x, "configdir", js.undefined)
      
      inline def setInheritViews(value: Boolean): Self = StObject.set(x, "inheritViews", value.asInstanceOf[js.Any])
      
      inline def setInheritViewsUndefined: Self = StObject.set(x, "inheritViews", js.undefined)
      
      inline def setMountpath(value: String): Self = StObject.set(x, "mountpath", value.asInstanceOf[js.Any])
      
      inline def setMountpathUndefined: Self = StObject.set(x, "mountpath", js.undefined)
      
      inline def setOnconfig(
        value: (/* config */ Map[String, Any], /* next */ js.Function2[/* err */ js.Error | Null, /* config */ js.UndefOr[js.Object], Any]) => Any
      ): Self = StObject.set(x, "onconfig", js.Any.fromFunction2(value))
      
      inline def setOnconfigUndefined: Self = StObject.set(x, "onconfig", js.undefined)
      
      inline def setProtocols(value: js.Object): Self = StObject.set(x, "protocols", value.asInstanceOf[js.Any])
      
      inline def setProtocolsUndefined: Self = StObject.set(x, "protocols", js.undefined)
      
      inline def setStartupHeaders(value: StringDictionary[String]): Self = StObject.set(x, "startupHeaders", value.asInstanceOf[js.Any])
      
      inline def setStartupHeadersUndefined: Self = StObject.set(x, "startupHeaders", js.undefined)
      
      inline def setUncaughtException(value: /* err */ js.Error => Any): Self = StObject.set(x, "uncaughtException", js.Any.fromFunction1(value))
      
      inline def setUncaughtExceptionUndefined: Self = StObject.set(x, "uncaughtException", js.undefined)
    }
  }
}
