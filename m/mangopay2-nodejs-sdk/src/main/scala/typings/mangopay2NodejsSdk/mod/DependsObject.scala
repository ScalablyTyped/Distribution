package typings.mangopay2NodejsSdk.mod

import typings.mangopay2NodejsSdk.mod.models.Model
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DependsObject extends StObject {
  
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
  implicit class DependsObjectMutableBuilder[Self <: DependsObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDependsPropertyName(value: String): Self = StObject.set(x, "dependsPropertyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyName(value: String): Self = StObject.set(x, "propertyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyValueMapping(value: Record[String, Model[_]]): Self = StObject.set(x, "propertyValueMapping", value.asInstanceOf[js.Any])
  }
}
