package typings.inversifyDashExpressDashUtils

import typings.inversifyDashExpressDashUtils.dtsConstantsMod.PARAMETER_TYPE
import typings.inversifyDashExpressDashUtils.inversifyDashExpressDashUtilsStrings.`/`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify-express-utils/dts/constants", JSImport.Namespace)
@js.native
object dtsConstantsMod extends js.Object {
  @js.native
  sealed trait PARAMETER_TYPE extends js.Object
  
  val DEFAULT_ROUTING_ROOT_PATH: `/` = js.native
  val NO_CONTROLLERS_FOUND: String = js.native
  def DUPLICATED_CONTROLLER_NAME(name: String): String = js.native
  @js.native
  object METADATA_KEY extends js.Object {
    var controller: String = js.native
    var controllerMethod: String = js.native
    var controllerParameter: String = js.native
    var httpContext: String = js.native
  }
  
  @js.native
  object PARAMETER_TYPE extends js.Object {
    @js.native
    sealed trait BODY extends PARAMETER_TYPE
    
    @js.native
    sealed trait COOKIES extends PARAMETER_TYPE
    
    @js.native
    sealed trait HEADERS extends PARAMETER_TYPE
    
    @js.native
    sealed trait NEXT extends PARAMETER_TYPE
    
    @js.native
    sealed trait PARAMS extends PARAMETER_TYPE
    
    @js.native
    sealed trait PRINCIPAL extends PARAMETER_TYPE
    
    @js.native
    sealed trait QUERY extends PARAMETER_TYPE
    
    @js.native
    sealed trait REQUEST extends PARAMETER_TYPE
    
    @js.native
    sealed trait RESPONSE extends PARAMETER_TYPE
    
    /* 4 */ val BODY: typings.inversifyDashExpressDashUtils.dtsConstantsMod.PARAMETER_TYPE.BODY with Double = js.native
    /* 6 */ val COOKIES: typings.inversifyDashExpressDashUtils.dtsConstantsMod.PARAMETER_TYPE.COOKIES with Double = js.native
    /* 5 */ val HEADERS: typings.inversifyDashExpressDashUtils.dtsConstantsMod.PARAMETER_TYPE.HEADERS with Double = js.native
    /* 7 */ val NEXT: typings.inversifyDashExpressDashUtils.dtsConstantsMod.PARAMETER_TYPE.NEXT with Double = js.native
    /* 2 */ val PARAMS: typings.inversifyDashExpressDashUtils.dtsConstantsMod.PARAMETER_TYPE.PARAMS with Double = js.native
    /* 8 */ val PRINCIPAL: typings.inversifyDashExpressDashUtils.dtsConstantsMod.PARAMETER_TYPE.PRINCIPAL with Double = js.native
    /* 3 */ val QUERY: typings.inversifyDashExpressDashUtils.dtsConstantsMod.PARAMETER_TYPE.QUERY with Double = js.native
    /* 0 */ val REQUEST: typings.inversifyDashExpressDashUtils.dtsConstantsMod.PARAMETER_TYPE.REQUEST with Double = js.native
    /* 1 */ val RESPONSE: typings.inversifyDashExpressDashUtils.dtsConstantsMod.PARAMETER_TYPE.RESPONSE with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[PARAMETER_TYPE with Double] = js.native
  }
  
  @js.native
  object TYPE extends js.Object {
    var AuthProvider: js.Symbol = js.native
    var Controller: js.Symbol = js.native
    var HttpContext: js.Symbol = js.native
  }
  
}

