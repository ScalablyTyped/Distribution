package typings.lambdaPhi.pathParamModelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PathParamModel extends js.Object {
  
  var _defaultValue: js.Any = js.native
  
  var _index: js.Any = js.native
  
  var _methodName: js.Any = js.native
  
  var _name: js.Any = js.native
  
  var defaultValue: js.Any = js.native
  
  var index: Double = js.native
  
  var methodName: String = js.native
  
  var name: String = js.native
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
  
  @scala.inline
  implicit class PathParamModelOps[Self <: PathParamModel] (val x: Self) extends AnyVal {
    
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
    def set_defaultValue(value: js.Any): Self = this.set("_defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_index(value: js.Any): Self = this.set("_index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_methodName(value: js.Any): Self = this.set("_methodName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_name(value: js.Any): Self = this.set("_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValue(value: js.Any): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodName(value: String): Self = this.set("methodName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
