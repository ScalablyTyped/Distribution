package typings.lodashDecorators.commonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceChainData extends js.Object {
  
  var fns: js.Array[js.Function] = js.native
  
  var isGetter: Boolean = js.native
  
  var isMethod: Boolean = js.native
  
  var isProperty: Boolean = js.native
  
  var isSetter: Boolean = js.native
  
  var properties: js.Array[String] = js.native
}
object InstanceChainData {
  
  @scala.inline
  def apply(
    fns: js.Array[js.Function],
    isGetter: Boolean,
    isMethod: Boolean,
    isProperty: Boolean,
    isSetter: Boolean,
    properties: js.Array[String]
  ): InstanceChainData = {
    val __obj = js.Dynamic.literal(fns = fns.asInstanceOf[js.Any], isGetter = isGetter.asInstanceOf[js.Any], isMethod = isMethod.asInstanceOf[js.Any], isProperty = isProperty.asInstanceOf[js.Any], isSetter = isSetter.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceChainData]
  }
  
  @scala.inline
  implicit class InstanceChainDataOps[Self <: InstanceChainData] (val x: Self) extends AnyVal {
    
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
    def setFnsVarargs(value: js.Function*): Self = this.set("fns", js.Array(value :_*))
    
    @scala.inline
    def setFns(value: js.Array[js.Function]): Self = this.set("fns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsGetter(value: Boolean): Self = this.set("isGetter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsMethod(value: Boolean): Self = this.set("isMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsProperty(value: Boolean): Self = this.set("isProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSetter(value: Boolean): Self = this.set("isSetter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesVarargs(value: String*): Self = this.set("properties", js.Array(value :_*))
    
    @scala.inline
    def setProperties(value: js.Array[String]): Self = this.set("properties", value.asInstanceOf[js.Any])
  }
}
