package typings.inversifyExpressUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object constantsMod {
  
  @JSImport("inversify-express-utils/dts/constants", "DEFAULT_ROUTING_ROOT_PATH")
  @js.native
  val DEFAULT_ROUTING_ROOT_PATH: /* "/" */ String = js.native
  
  @JSImport("inversify-express-utils/dts/constants", "DUPLICATED_CONTROLLER_NAME")
  @js.native
  def DUPLICATED_CONTROLLER_NAME(name: String): String = js.native
  
  object METADATA_KEY {
    
    @JSImport("inversify-express-utils/dts/constants", "METADATA_KEY")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("inversify-express-utils/dts/constants", "METADATA_KEY.controller")
    @js.native
    def controller: String = js.native
    
    @JSImport("inversify-express-utils/dts/constants", "METADATA_KEY.controllerMethod")
    @js.native
    def controllerMethod: String = js.native
    @scala.inline
    def controllerMethod_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("controllerMethod")(x.asInstanceOf[js.Any])
    
    @JSImport("inversify-express-utils/dts/constants", "METADATA_KEY.controllerParameter")
    @js.native
    def controllerParameter: String = js.native
    @scala.inline
    def controllerParameter_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("controllerParameter")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def controller_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("controller")(x.asInstanceOf[js.Any])
    
    @JSImport("inversify-express-utils/dts/constants", "METADATA_KEY.httpContext")
    @js.native
    def httpContext: String = js.native
    @scala.inline
    def httpContext_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("httpContext")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("inversify-express-utils/dts/constants", "NO_CONTROLLERS_FOUND")
  @js.native
  val NO_CONTROLLERS_FOUND: String = js.native
  
  @js.native
  sealed trait PARAMETER_TYPE extends StObject
  @JSImport("inversify-express-utils/dts/constants", "PARAMETER_TYPE")
  @js.native
  object PARAMETER_TYPE extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[PARAMETER_TYPE with Double] = js.native
    
    @js.native
    sealed trait BODY extends PARAMETER_TYPE
    /* 4 */ val BODY: typings.inversifyExpressUtils.constantsMod.PARAMETER_TYPE.BODY with Double = js.native
    
    @js.native
    sealed trait COOKIES extends PARAMETER_TYPE
    /* 6 */ val COOKIES: typings.inversifyExpressUtils.constantsMod.PARAMETER_TYPE.COOKIES with Double = js.native
    
    @js.native
    sealed trait HEADERS extends PARAMETER_TYPE
    /* 5 */ val HEADERS: typings.inversifyExpressUtils.constantsMod.PARAMETER_TYPE.HEADERS with Double = js.native
    
    @js.native
    sealed trait NEXT extends PARAMETER_TYPE
    /* 7 */ val NEXT: typings.inversifyExpressUtils.constantsMod.PARAMETER_TYPE.NEXT with Double = js.native
    
    @js.native
    sealed trait PARAMS extends PARAMETER_TYPE
    /* 2 */ val PARAMS: typings.inversifyExpressUtils.constantsMod.PARAMETER_TYPE.PARAMS with Double = js.native
    
    @js.native
    sealed trait PRINCIPAL extends PARAMETER_TYPE
    /* 8 */ val PRINCIPAL: typings.inversifyExpressUtils.constantsMod.PARAMETER_TYPE.PRINCIPAL with Double = js.native
    
    @js.native
    sealed trait QUERY extends PARAMETER_TYPE
    /* 3 */ val QUERY: typings.inversifyExpressUtils.constantsMod.PARAMETER_TYPE.QUERY with Double = js.native
    
    @js.native
    sealed trait REQUEST extends PARAMETER_TYPE
    /* 0 */ val REQUEST: typings.inversifyExpressUtils.constantsMod.PARAMETER_TYPE.REQUEST with Double = js.native
    
    @js.native
    sealed trait RESPONSE extends PARAMETER_TYPE
    /* 1 */ val RESPONSE: typings.inversifyExpressUtils.constantsMod.PARAMETER_TYPE.RESPONSE with Double = js.native
  }
  
  object TYPE {
    
    @JSImport("inversify-express-utils/dts/constants", "TYPE")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("inversify-express-utils/dts/constants", "TYPE.AuthProvider")
    @js.native
    def AuthProvider: js.Symbol = js.native
    @scala.inline
    def AuthProvider_=(x: js.Symbol): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AuthProvider")(x.asInstanceOf[js.Any])
    
    @JSImport("inversify-express-utils/dts/constants", "TYPE.Controller")
    @js.native
    def Controller: js.Symbol = js.native
    @scala.inline
    def Controller_=(x: js.Symbol): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Controller")(x.asInstanceOf[js.Any])
    
    @JSImport("inversify-express-utils/dts/constants", "TYPE.HttpContext")
    @js.native
    def HttpContext: js.Symbol = js.native
    @scala.inline
    def HttpContext_=(x: js.Symbol): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HttpContext")(x.asInstanceOf[js.Any])
  }
}
