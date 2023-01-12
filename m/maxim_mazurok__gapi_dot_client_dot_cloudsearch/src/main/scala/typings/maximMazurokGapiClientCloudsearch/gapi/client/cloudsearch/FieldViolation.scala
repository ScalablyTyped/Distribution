package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldViolation extends StObject {
  
  /** The description of the error. */
  var description: js.UndefOr[String] = js.undefined
  
  /** Path of field with violation. */
  var field: js.UndefOr[String] = js.undefined
}
object FieldViolation {
  
  inline def apply(): FieldViolation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FieldViolation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FieldViolation] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
  }
}
