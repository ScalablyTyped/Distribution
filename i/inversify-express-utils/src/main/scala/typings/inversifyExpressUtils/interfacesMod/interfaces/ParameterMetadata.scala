package typings.inversifyExpressUtils.interfacesMod.interfaces

import typings.inversifyExpressUtils.constantsMod.PARAMETER_TYPE
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
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], injectRoot = injectRoot.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (parameterName != null) __obj.updateDynamic("parameterName")(parameterName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParameterMetadata]
  }
}

