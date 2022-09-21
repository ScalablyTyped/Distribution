package typings.googleapis.cloudtraceV2Mod.cloudtraceV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAnnotation extends StObject {
  
  /**
    * A set of attributes on the annotation. You can have up to 4 attributes per Annotation.
    */
  var attributes: js.UndefOr[SchemaAttributes] = js.undefined
  
  /**
    * A user-supplied message describing the event. The maximum length for the description is 256 bytes.
    */
  var description: js.UndefOr[SchemaTruncatableString] = js.undefined
}
object SchemaAnnotation {
  
  inline def apply(): SchemaAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAnnotation]
  }
  
  extension [Self <: SchemaAnnotation](x: Self) {
    
    inline def setAttributes(value: SchemaAttributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setDescription(value: SchemaTruncatableString): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
  }
}
