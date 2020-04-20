package typings.lambdaPhi.httpVerbModelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpVerbModel extends js.Object {
  var _methodName: js.Any
  var _name: js.Any
  var methodName: String
  var name: String
}

object HttpVerbModel {
  @scala.inline
  def apply(_methodName: js.Any, _name: js.Any, methodName: String, name: String): HttpVerbModel = {
    val __obj = js.Dynamic.literal(_methodName = _methodName.asInstanceOf[js.Any], _name = _name.asInstanceOf[js.Any], methodName = methodName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpVerbModel]
  }
}

