package typings.initPackageJson

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("init-package-json", JSImport.Namespace)
  @js.native
  def apply(dir: String, input: String, cb: js.Function2[/* err */ js.Any, /* data */ js.Any, Unit]): Unit = js.native
  @JSImport("init-package-json", JSImport.Namespace)
  @js.native
  def apply(
    dir: String,
    input: String,
    config: js.Object,
    cb: js.Function2[/* err */ js.Any, /* data */ js.Any, Unit]
  ): Unit = js.native
  @JSImport("init-package-json", JSImport.Namespace)
  @js.native
  def apply(
    dir: String,
    input: String,
    config: Config,
    cb: js.Function2[/* err */ js.Any, /* data */ js.Any, Unit]
  ): Unit = js.native
  
  @JSImport("init-package-json", "yes")
  @js.native
  def yes(conf: Config): Boolean = js.native
  
  @js.native
  trait Config
    extends /* key */ StringDictionary[js.Any] {
    
    def get(k: String): js.Any = js.native
  }
  object Config {
    
    @scala.inline
    def apply(get: String => js.Any): Config = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
      __obj.asInstanceOf[Config]
    }
    
    @scala.inline
    implicit class ConfigMutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGet(value: String => js.Any): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    }
  }
}
