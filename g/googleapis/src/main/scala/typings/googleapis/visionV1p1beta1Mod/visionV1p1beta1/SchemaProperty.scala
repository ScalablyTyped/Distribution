package typings.googleapis.visionV1p1beta1Mod.visionV1p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A `Property` consists of a user-supplied name/value pair.
  */
trait SchemaProperty extends StObject {
  
  /**
    * Name of the property.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Value of numeric properties.
    */
  var uint64Value: js.UndefOr[String] = js.undefined
  
  /**
    * Value of the property.
    */
  var value: js.UndefOr[String] = js.undefined
}
object SchemaProperty {
  
  @scala.inline
  def apply(): SchemaProperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProperty]
  }
  
  @scala.inline
  implicit class SchemaPropertyMutableBuilder[Self <: SchemaProperty] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setUint64Value(value: String): Self = StObject.set(x, "uint64Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUint64ValueUndefined: Self = StObject.set(x, "uint64Value", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
