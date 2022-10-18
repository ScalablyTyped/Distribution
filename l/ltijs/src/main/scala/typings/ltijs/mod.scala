package typings.ltijs

import typings.ltijs.anon.Context
import typings.ltijs.libProviderProviderMod.ProviderOptions
import typings.ltijs.libUtilsDatabaseMod.DatabaseOptions
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ltijs", "Provider")
  @js.native
  open class Provider protected ()
    extends typings.ltijs.libProviderProviderMod.Provider {
    def this(encryptionKey: String, database: DatabaseOptions) = this()
    def this(encryptionKey: String, database: DatabaseOptions, options: ProviderOptions) = this()
  }
  
  /* augmented module */
  object expressAugmentingMod {
    
    trait Response[ResBody, Locals /* <: Record[String, Any] */] extends StObject {
      
      var locals: Locals & Context
    }
    object Response {
      
      inline def apply[ResBody, Locals /* <: Record[String, Any] */](locals: Locals & Context): Response[ResBody, Locals] = {
        val __obj = js.Dynamic.literal(locals = locals.asInstanceOf[js.Any])
        __obj.asInstanceOf[Response[ResBody, Locals]]
      }
      
      extension [Self <: Response[?, ?], ResBody, Locals /* <: Record[String, Any] */](x: Self & (Response[ResBody, Locals])) {
        
        inline def setLocals(value: Locals & Context): Self = StObject.set(x, "locals", value.asInstanceOf[js.Any])
      }
    }
  }
}
