package typings.mangopay2NodejsSdk.mod

import typings.mangopay2NodejsSdk.mod.models.Model
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DependsObject extends js.Object {
  
  var dependsPropertyName: String = js.native
  
  var propertyName: String = js.native
  
  var propertyValueMapping: Record[String, Model[_]] = js.native
}
object DependsObject {
  
  @scala.inline
  def apply(dependsPropertyName: String, propertyName: String, propertyValueMapping: Record[String, Model[_]]): DependsObject = {
    val __obj = js.Dynamic.literal(dependsPropertyName = dependsPropertyName.asInstanceOf[js.Any], propertyName = propertyName.asInstanceOf[js.Any], propertyValueMapping = propertyValueMapping.asInstanceOf[js.Any])
    __obj.asInstanceOf[DependsObject]
  }
  
  @scala.inline
  implicit class DependsObjectOps[Self <: DependsObject] (val x: Self) extends AnyVal {
    
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
    def setDependsPropertyName(value: String): Self = this.set("dependsPropertyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyName(value: String): Self = this.set("propertyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyValueMapping(value: Record[String, Model[_]]): Self = this.set("propertyValueMapping", value.asInstanceOf[js.Any])
  }
}
