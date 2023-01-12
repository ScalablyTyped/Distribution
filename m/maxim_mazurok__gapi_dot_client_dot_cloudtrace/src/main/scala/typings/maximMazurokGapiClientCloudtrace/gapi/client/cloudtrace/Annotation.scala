package typings.maximMazurokGapiClientCloudtrace.gapi.client.cloudtrace

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Annotation extends StObject {
  
  /** A set of attributes on the annotation. You can have up to 4 attributes per Annotation. */
  var attributes: js.UndefOr[Attributes] = js.undefined
  
  /** A user-supplied message describing the event. The maximum length for the description is 256 bytes. */
  var description: js.UndefOr[TruncatableString] = js.undefined
}
object Annotation {
  
  inline def apply(): Annotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Annotation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Annotation] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: Attributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setDescription(value: TruncatableString): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
  }
}
