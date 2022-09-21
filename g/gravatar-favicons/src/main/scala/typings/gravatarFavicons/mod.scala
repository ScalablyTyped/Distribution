package typings.gravatarFavicons

import typings.gravatarFavicons.anon.PartialFaviconOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Generate favicons from a gravatar email.
    */
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  inline def apply(config: Unit, logger: Unit, cb: Callback): Unit = (^.asInstanceOf[js.Dynamic].apply(config.asInstanceOf[js.Any], logger.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(config: Unit, logger: Logger): Unit = (^.asInstanceOf[js.Dynamic].apply(config.asInstanceOf[js.Any], logger.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(config: Unit, logger: Logger, cb: Callback): Unit = (^.asInstanceOf[js.Dynamic].apply(config.asInstanceOf[js.Any], logger.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(config: Options): Unit = ^.asInstanceOf[js.Dynamic].apply(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def apply(config: Options, logger: Unit, cb: Callback): Unit = (^.asInstanceOf[js.Dynamic].apply(config.asInstanceOf[js.Any], logger.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(config: Options, logger: Logger): Unit = (^.asInstanceOf[js.Dynamic].apply(config.asInstanceOf[js.Any], logger.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(config: Options, logger: Logger, cb: Callback): Unit = (^.asInstanceOf[js.Dynamic].apply(config.asInstanceOf[js.Any], logger.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("gravatar-favicons", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Callback = js.Function2[/* err */ js.Error | Null, /* files */ js.Array[String], Unit]
  
  // console.log compatible contract
  @js.native
  trait Logger extends StObject {
    
    def apply(message: Any, optionalParams: Any*): Unit = js.native
    def apply(message: Unit, optionalParams: Any*): Unit = js.native
  }
  
  trait Options extends StObject {
    
    var dest: String
    
    var email: String
    
    /**
      * The `faviconConfig` field is the same options that can be passed to `favicons`.
      */
    var faviconConfig: PartialFaviconOptions
  }
  object Options {
    
    inline def apply(dest: String, email: String, faviconConfig: PartialFaviconOptions): Options = {
      val __obj = js.Dynamic.literal(dest = dest.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], faviconConfig = faviconConfig.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setDest(value: String): Self = StObject.set(x, "dest", value.asInstanceOf[js.Any])
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setFaviconConfig(value: PartialFaviconOptions): Self = StObject.set(x, "faviconConfig", value.asInstanceOf[js.Any])
    }
  }
}
