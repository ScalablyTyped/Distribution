package typings.initPackageJson

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(dir: String, input: String, cb: js.Function2[/* err */ js.Any, /* data */ js.Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].apply(dir.asInstanceOf[js.Any], input.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(
    dir: String,
    input: String,
    config: js.Object,
    cb: js.Function2[/* err */ js.Any, /* data */ js.Any, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(dir.asInstanceOf[js.Any], input.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(
    dir: String,
    input: String,
    config: Config,
    cb: js.Function2[/* err */ js.Any, /* data */ js.Any, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(dir.asInstanceOf[js.Any], input.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("init-package-json", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def yes(conf: Config): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("yes")(conf.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  trait Config
    extends StObject
       with /* key */ StringDictionary[js.Any] {
    
    def get(k: String): js.Any
  }
  object Config {
    
    inline def apply(get: String => js.Any): Config = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
      __obj.asInstanceOf[Config]
    }
    
    extension [Self <: Config](x: Self) {
      
      inline def setGet(value: String => js.Any): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    }
  }
}
