package typings.grumblerScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object configConstantsMod {
  
  @js.native
  sealed trait ENV extends StObject
  @JSImport("grumbler-scripts/config/constants", "ENV")
  @js.native
  object ENV extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ENV & String] = js.native
    
    @js.native
    sealed trait DEMO
      extends StObject
         with ENV
    /* "demo" */ val DEMO: typings.grumblerScripts.configConstantsMod.ENV.DEMO & String = js.native
    
    @js.native
    sealed trait LOCAL
      extends StObject
         with ENV
    /* "local" */ val LOCAL: typings.grumblerScripts.configConstantsMod.ENV.LOCAL & String = js.native
    
    @js.native
    sealed trait PRODUCTION
      extends StObject
         with ENV
    /* "production" */ val PRODUCTION: typings.grumblerScripts.configConstantsMod.ENV.PRODUCTION & String = js.native
    
    @js.native
    sealed trait SANDBOX
      extends StObject
         with ENV
    /* "sandbox" */ val SANDBOX: typings.grumblerScripts.configConstantsMod.ENV.SANDBOX & String = js.native
    
    @js.native
    sealed trait STAGE
      extends StObject
         with ENV
    /* "stage" */ val STAGE: typings.grumblerScripts.configConstantsMod.ENV.STAGE & String = js.native
    
    @js.native
    sealed trait TEST
      extends StObject
         with ENV
    /* "test" */ val TEST: typings.grumblerScripts.configConstantsMod.ENV.TEST & String = js.native
  }
}
