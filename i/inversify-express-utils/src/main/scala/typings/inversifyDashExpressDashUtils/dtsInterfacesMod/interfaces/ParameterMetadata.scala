package typings.inversifyDashExpressDashUtils.dtsInterfacesMod.interfaces

import typings.inversifyDashExpressDashUtils.dtsConstantsMod.PARAMETER_TYPE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParameterMetadata extends js.Object {
  var index: Double
  var injectRoot: Boolean
  var parameterName: js.UndefOr[String] = js.undefined
  var `type`: PARAMETER_TYPE
}

object ParameterMetadata {
  @scala.inline
  def apply(index: Double, injectRoot: Boolean, `type`: PARAMETER_TYPE, parameterName: String = null): ParameterMetadata = {
    val __obj = js.Dynamic.literal(index = index, injectRoot = injectRoot)
    __obj.updateDynamic("type")(`type`)
    if (parameterName != null) __obj.updateDynamic("parameterName")(parameterName)
    __obj.asInstanceOf[ParameterMetadata]
  }
}

