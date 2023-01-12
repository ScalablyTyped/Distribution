package typings.mangopay2NodejsSdk.typingsBaseMod.base

import typings.mangopay2NodejsSdk.typingsModelsMod.Models.Model
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DependsObject extends StObject {
  
  var dependsPropertyName: String
  
  var propertyName: String
  
  var propertyValueMapping: Record[String, Model[Any]]
}
object DependsObject {
  
  inline def apply(
    dependsPropertyName: String,
    propertyName: String,
    propertyValueMapping: Record[String, Model[Any]]
  ): DependsObject = {
    val __obj = js.Dynamic.literal(dependsPropertyName = dependsPropertyName.asInstanceOf[js.Any], propertyName = propertyName.asInstanceOf[js.Any], propertyValueMapping = propertyValueMapping.asInstanceOf[js.Any])
    __obj.asInstanceOf[DependsObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DependsObject] (val x: Self) extends AnyVal {
    
    inline def setDependsPropertyName(value: String): Self = StObject.set(x, "dependsPropertyName", value.asInstanceOf[js.Any])
    
    inline def setPropertyName(value: String): Self = StObject.set(x, "propertyName", value.asInstanceOf[js.Any])
    
    inline def setPropertyValueMapping(value: Record[String, Model[Any]]): Self = StObject.set(x, "propertyValueMapping", value.asInstanceOf[js.Any])
  }
}
