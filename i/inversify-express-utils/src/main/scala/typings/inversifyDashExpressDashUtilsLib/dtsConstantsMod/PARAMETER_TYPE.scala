package typings
package inversifyDashExpressDashUtilsLib.dtsConstantsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PARAMETER_TYPE extends js.Object

@JSImport("inversify-express-utils/dts/constants", "PARAMETER_TYPE")
@js.native
object PARAMETER_TYPE extends js.Object {
  @js.native
  sealed trait BODY
    extends inversifyDashExpressDashUtilsLib.dtsConstantsMod.PARAMETER_TYPE
  
  @js.native
  sealed trait COOKIES
    extends inversifyDashExpressDashUtilsLib.dtsConstantsMod.PARAMETER_TYPE
  
  @js.native
  sealed trait HEADERS
    extends inversifyDashExpressDashUtilsLib.dtsConstantsMod.PARAMETER_TYPE
  
  @js.native
  sealed trait NEXT
    extends inversifyDashExpressDashUtilsLib.dtsConstantsMod.PARAMETER_TYPE
  
  @js.native
  sealed trait PARAMS
    extends inversifyDashExpressDashUtilsLib.dtsConstantsMod.PARAMETER_TYPE
  
  @js.native
  sealed trait PRINCIPAL
    extends inversifyDashExpressDashUtilsLib.dtsConstantsMod.PARAMETER_TYPE
  
  @js.native
  sealed trait QUERY
    extends inversifyDashExpressDashUtilsLib.dtsConstantsMod.PARAMETER_TYPE
  
  @js.native
  sealed trait REQUEST
    extends inversifyDashExpressDashUtilsLib.dtsConstantsMod.PARAMETER_TYPE
  
  @js.native
  sealed trait RESPONSE
    extends inversifyDashExpressDashUtilsLib.dtsConstantsMod.PARAMETER_TYPE
  
  /* 4 */ val BODY: BODY with scala.Double = js.native
  /* 6 */ val COOKIES: COOKIES with scala.Double = js.native
  /* 5 */ val HEADERS: HEADERS with scala.Double = js.native
  /* 7 */ val NEXT: NEXT with scala.Double = js.native
  /* 2 */ val PARAMS: PARAMS with scala.Double = js.native
  /* 8 */ val PRINCIPAL: PRINCIPAL with scala.Double = js.native
  /* 3 */ val QUERY: QUERY with scala.Double = js.native
  /* 0 */ val REQUEST: REQUEST with scala.Double = js.native
  /* 1 */ val RESPONSE: RESPONSE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    inversifyDashExpressDashUtilsLib.dtsConstantsMod.PARAMETER_TYPE with scala.Double
  ] = js.native
}

