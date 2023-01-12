package typings.latestVersion

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("latest-version", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(packageName: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(packageName.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def default(packageName: String, options: Options): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(packageName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  trait Options extends StObject {
    
    /**
    	A semver range or [dist-tag](https://docs.npmjs.com/cli/dist-tag).
    	*/
    val version: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
}
