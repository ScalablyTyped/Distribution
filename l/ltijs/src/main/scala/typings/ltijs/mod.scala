package typings.ltijs

import typings.ltijs.anon.Context
import typings.ltijs.databaseMod.DatabaseOptions
import typings.ltijs.providerMod.ProviderOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ltijs", "Provider")
  @js.native
  class Provider protected ()
    extends typings.ltijs.providerMod.Provider {
    def this(encryptionKey: String, database: DatabaseOptions) = this()
    def this(encryptionKey: String, database: DatabaseOptions, options: ProviderOptions) = this()
  }
  
  object expressAugmentingMod {
    
    trait Response extends StObject {
      
      var locals: Context
    }
    object Response {
      
      inline def apply(locals: Context): Response = {
        val __obj = js.Dynamic.literal(locals = locals.asInstanceOf[js.Any])
        __obj.asInstanceOf[Response]
      }
      
      extension [Self <: Response](x: Self) {
        
        inline def setLocals(value: Context): Self = StObject.set(x, "locals", value.asInstanceOf[js.Any])
      }
    }
  }
}
