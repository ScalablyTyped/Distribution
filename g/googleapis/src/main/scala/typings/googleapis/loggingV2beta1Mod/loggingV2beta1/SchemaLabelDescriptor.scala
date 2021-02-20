package typings.googleapis.loggingV2beta1Mod.loggingV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A description of a label.
  */
@js.native
trait SchemaLabelDescriptor extends StObject {
  
  /**
    * A human-readable description for the label.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * The label key.
    */
  var key: js.UndefOr[String] = js.native
  
  /**
    * The type of data that can be assigned to the label.
    */
  var valueType: js.UndefOr[String] = js.native
}
object SchemaLabelDescriptor {
  
  @scala.inline
  def apply(): SchemaLabelDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLabelDescriptor]
  }
  
  @scala.inline
  implicit class SchemaLabelDescriptorMutableBuilder[Self <: SchemaLabelDescriptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setValueType(value: String): Self = StObject.set(x, "valueType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueTypeUndefined: Self = StObject.set(x, "valueType", js.undefined)
  }
}
