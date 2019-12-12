package typings.inversifyDashExpressDashUtils

import org.scalablytyped.runtime.TopLevel
import typings.inversifyDashExpressDashUtils.dtsConstantsMod.PARAMETER_TYPE
import typings.inversifyDashExpressDashUtils.dtsConstantsMod.PARAMETER_TYPE.BODY
import typings.inversifyDashExpressDashUtils.dtsConstantsMod.PARAMETER_TYPE.COOKIES
import typings.inversifyDashExpressDashUtils.dtsConstantsMod.PARAMETER_TYPE.HEADERS
import typings.inversifyDashExpressDashUtils.dtsConstantsMod.PARAMETER_TYPE.NEXT
import typings.inversifyDashExpressDashUtils.dtsConstantsMod.PARAMETER_TYPE.PARAMS
import typings.inversifyDashExpressDashUtils.dtsConstantsMod.PARAMETER_TYPE.PRINCIPAL
import typings.inversifyDashExpressDashUtils.dtsConstantsMod.PARAMETER_TYPE.QUERY
import typings.inversifyDashExpressDashUtils.dtsConstantsMod.PARAMETER_TYPE.REQUEST
import typings.inversifyDashExpressDashUtils.dtsConstantsMod.PARAMETER_TYPE.RESPONSE
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
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[PARAMETER_TYPE with Double] = js.native
    /* 4 */ @js.native
    object BODY extends TopLevel[BODY with Double]
    
    /* 6 */ @js.native
    object COOKIES extends TopLevel[COOKIES with Double]
    
    /* 5 */ @js.native
    object HEADERS extends TopLevel[HEADERS with Double]
    
    /* 7 */ @js.native
    object NEXT extends TopLevel[NEXT with Double]
    
    /* 2 */ @js.native
    object PARAMS extends TopLevel[PARAMS with Double]
    
    /* 8 */ @js.native
    object PRINCIPAL extends TopLevel[PRINCIPAL with Double]
    
    /* 3 */ @js.native
    object QUERY extends TopLevel[QUERY with Double]
    
    /* 0 */ @js.native
    object REQUEST extends TopLevel[REQUEST with Double]
    
    /* 1 */ @js.native
    object RESPONSE extends TopLevel[RESPONSE with Double]
    
  }
  
  @js.native
  object TYPE extends js.Object {
    var AuthProvider: js.Symbol = js.native
    var Controller: js.Symbol = js.native
    var HttpContext: js.Symbol = js.native
  }
  
}

