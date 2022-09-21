package typings.httpProxyMiddleware

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorsMod {
  
  @js.native
  sealed trait ERRORS extends StObject
  @JSImport("http-proxy-middleware/dist/errors", "ERRORS")
  @js.native
  object ERRORS extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ERRORS & String] = js.native
    
    @js.native
    sealed trait ERR_CONFIG_FACTORY_TARGET_MISSING
      extends StObject
         with ERRORS
    /* "[HPM] Missing \"target\" option. Example: {target: \"http://www.example.org\"}" */ val ERR_CONFIG_FACTORY_TARGET_MISSING: typings.httpProxyMiddleware.errorsMod.ERRORS.ERR_CONFIG_FACTORY_TARGET_MISSING & String = js.native
    
    @js.native
    sealed trait ERR_CONTEXT_MATCHER_GENERIC
      extends StObject
         with ERRORS
    /* "[HPM] Invalid context. Expecting something like: \"/api\" or [\"/api\", \"/ajax\"]" */ val ERR_CONTEXT_MATCHER_GENERIC: typings.httpProxyMiddleware.errorsMod.ERRORS.ERR_CONTEXT_MATCHER_GENERIC & String = js.native
    
    @js.native
    sealed trait ERR_CONTEXT_MATCHER_INVALID_ARRAY
      extends StObject
         with ERRORS
    /* "[HPM] Invalid context. Expecting something like: [\"/api\", \"/ajax\"] or [\"/api/ **\", \"!**.html\"]" */ val ERR_CONTEXT_MATCHER_INVALID_ARRAY: typings.httpProxyMiddleware.errorsMod.ERRORS.ERR_CONTEXT_MATCHER_INVALID_ARRAY & String = js.native
    
    @js.native
    sealed trait ERR_PATH_REWRITER_CONFIG
      extends StObject
         with ERRORS
    /* "[HPM] Invalid pathRewrite config. Expecting object with pathRewrite config or a rewrite function" */ val ERR_PATH_REWRITER_CONFIG: typings.httpProxyMiddleware.errorsMod.ERRORS.ERR_PATH_REWRITER_CONFIG & String = js.native
  }
}
