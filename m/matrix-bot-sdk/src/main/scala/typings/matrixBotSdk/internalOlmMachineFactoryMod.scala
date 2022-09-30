package typings.matrixBotSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object internalOlmMachineFactoryMod {
  
  @JSImport("matrix-bot-sdk/lib/e2ee/InternalOlmMachineFactory", "InternalOlmMachineFactory")
  @js.native
  open class InternalOlmMachineFactory protected () extends StObject {
    def this(
      userId: String,
      deviceId: String,
      engine: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OlmEngine */ Any,
      storagePath: String
    ) = this()
    
    def build(): Any = js.native
    
    /* private */ var deviceId: Any = js.native
    
    /* private */ var engine: Any = js.native
    
    /* private */ var storagePath: Any = js.native
    
    /* private */ var userId: Any = js.native
  }
  /* static members */
  object InternalOlmMachineFactory {
    
    @JSImport("matrix-bot-sdk/lib/e2ee/InternalOlmMachineFactory", "InternalOlmMachineFactory")
    @js.native
    val ^ : js.Any = js.native
    
    inline def FACTORY_OVERRIDE(
      userId: String,
      deviceId: String,
      engine: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OlmEngine */ Any,
      storagePath: String
    ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("FACTORY_OVERRIDE")(userId.asInstanceOf[js.Any], deviceId.asInstanceOf[js.Any], engine.asInstanceOf[js.Any], storagePath.asInstanceOf[js.Any])).asInstanceOf[Any]
  }
}
