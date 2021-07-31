package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldViolation extends StObject {
  
  /** Description of the error. */
  var description: js.UndefOr[String] = js.undefined
  
  /** Path of field with violation. */
  var field: js.UndefOr[String] = js.undefined
}
object FieldViolation {
  
  @scala.inline
  def apply(): FieldViolation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FieldViolation]
  }
  
  @scala.inline
  implicit class FieldViolationMutableBuilder[Self <: FieldViolation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
  }
}
