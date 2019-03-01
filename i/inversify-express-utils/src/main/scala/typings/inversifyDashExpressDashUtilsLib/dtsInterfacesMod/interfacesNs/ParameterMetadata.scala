package typings
package inversifyDashExpressDashUtilsLib.dtsInterfacesMod.interfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParameterMetadata extends js.Object {
  var index: scala.Double
  var injectRoot: scala.Boolean
  var parameterName: js.UndefOr[java.lang.String] = js.undefined
  var `type`: inversifyDashExpressDashUtilsLib.dtsConstantsMod.PARAMETER_TYPE
}

object ParameterMetadata {
  @scala.inline
  def apply(
    index: scala.Double,
    injectRoot: scala.Boolean,
    `type`: inversifyDashExpressDashUtilsLib.dtsConstantsMod.PARAMETER_TYPE,
    parameterName: java.lang.String = null
  ): ParameterMetadata = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("index")(index)
    __obj.updateDynamic("injectRoot")(injectRoot)
    if (parameterName != null) __obj.updateDynamic("parameterName")(parameterName)
    __obj.asInstanceOf[ParameterMetadata]
  }
}

