package typings.lambdaPhi.pathModelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PathModel extends js.Object {
  var _httpMethods: js.Any
  var _methodName: js.Any
  var _pattern: js.Any
  var httpMethods: js.Array[String]
  var methodName: String
  var pattern: String
}

object PathModel {
  @scala.inline
  def apply(
    _httpMethods: js.Any,
    _methodName: js.Any,
    _pattern: js.Any,
    httpMethods: js.Array[String],
    methodName: String,
    pattern: String
  ): PathModel = {
    val __obj = js.Dynamic.literal(_httpMethods = _httpMethods.asInstanceOf[js.Any], _methodName = _methodName.asInstanceOf[js.Any], _pattern = _pattern.asInstanceOf[js.Any], httpMethods = httpMethods.asInstanceOf[js.Any], methodName = methodName.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathModel]
  }
}

