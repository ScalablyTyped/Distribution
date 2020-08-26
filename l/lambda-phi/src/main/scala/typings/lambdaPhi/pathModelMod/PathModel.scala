package typings.lambdaPhi.pathModelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PathModel extends js.Object {
  var _httpMethods: js.Any = js.native
  var _methodName: js.Any = js.native
  var _pattern: js.Any = js.native
  var httpMethods: js.Array[String] = js.native
  var methodName: String = js.native
  var pattern: String = js.native
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
  @scala.inline
  implicit class PathModelOps[Self <: PathModel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set_httpMethods(value: js.Any): Self = this.set("_httpMethods", value.asInstanceOf[js.Any])
    @scala.inline
    def set_methodName(value: js.Any): Self = this.set("_methodName", value.asInstanceOf[js.Any])
    @scala.inline
    def set_pattern(value: js.Any): Self = this.set("_pattern", value.asInstanceOf[js.Any])
    @scala.inline
    def setHttpMethodsVarargs(value: String*): Self = this.set("httpMethods", js.Array(value :_*))
    @scala.inline
    def setHttpMethods(value: js.Array[String]): Self = this.set("httpMethods", value.asInstanceOf[js.Any])
    @scala.inline
    def setMethodName(value: String): Self = this.set("methodName", value.asInstanceOf[js.Any])
    @scala.inline
    def setPattern(value: String): Self = this.set("pattern", value.asInstanceOf[js.Any])
  }
  
}

