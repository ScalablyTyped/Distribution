package typings.lesgo

import typings.lesgo.servicesJwtserviceMod.Config
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object servicesMod {
  
  @JSImport("lesgo/services", JSImport.Default)
  @js.native
  open class default[TDecoded /* <: js.Object | String */] protected ()
    extends typings.lesgo.servicesJwtserviceMod.default[TDecoded] {
    def this(token: String, config: Config[TDecoded]) = this()
  }
  
  @JSImport("lesgo/services", "LogLevels")
  @js.native
  object LogLevels extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.lesgo.servicesLoggerServiceMod.LogLevels & Double] = js.native
    
    /* 3 */ val debug: typings.lesgo.servicesLoggerServiceMod.LogLevels.debug & Double = js.native
    
    /* 0 */ val error: typings.lesgo.servicesLoggerServiceMod.LogLevels.error & Double = js.native
    
    /* 2 */ val info: typings.lesgo.servicesLoggerServiceMod.LogLevels.info & Double = js.native
    
    /* 1 */ val warn: typings.lesgo.servicesLoggerServiceMod.LogLevels.warn & Double = js.native
  }
}
