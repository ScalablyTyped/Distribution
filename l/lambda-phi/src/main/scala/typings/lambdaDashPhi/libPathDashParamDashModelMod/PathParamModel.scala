package typings.lambdaDashPhi.libPathDashParamDashModelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PathParamModel extends js.Object {
  var _defaultValue: js.Any
  var _index: js.Any
  var _methodName: js.Any
  var _name: js.Any
  var defaultValue: js.Any
  var index: Double
  var methodName: String
  var name: String
}

object PathParamModel {
  @scala.inline
  def apply(
    _defaultValue: js.Any,
    _index: js.Any,
    _methodName: js.Any,
    _name: js.Any,
    defaultValue: js.Any,
    index: Double,
    methodName: String,
    name: String
  ): PathParamModel = {
    val __obj = js.Dynamic.literal(_defaultValue = _defaultValue.asInstanceOf[js.Any], _index = _index.asInstanceOf[js.Any], _methodName = _methodName.asInstanceOf[js.Any], _name = _name.asInstanceOf[js.Any], defaultValue = defaultValue.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], methodName = methodName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PathParamModel]
  }
}

