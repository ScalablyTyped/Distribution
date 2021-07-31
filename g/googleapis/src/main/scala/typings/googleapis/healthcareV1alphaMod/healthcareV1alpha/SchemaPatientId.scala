package typings.googleapis.healthcareV1alphaMod.healthcareV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A patient identifier and associated type.
  */
trait SchemaPatientId extends StObject {
  
  /**
    * ID type, e.g. MRN or NHS.
    */
  var `type`: js.UndefOr[String] = js.undefined
  
  /**
    * The patient&#39;s unique identifier.
    */
  var value: js.UndefOr[String] = js.undefined
}
object SchemaPatientId {
  
  @scala.inline
  def apply(): SchemaPatientId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPatientId]
  }
  
  @scala.inline
  implicit class SchemaPatientIdMutableBuilder[Self <: SchemaPatientId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
