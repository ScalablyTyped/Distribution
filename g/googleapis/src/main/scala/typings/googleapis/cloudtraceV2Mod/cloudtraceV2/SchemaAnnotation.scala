package typings.googleapis.cloudtraceV2Mod.cloudtraceV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Text annotation with a set of attributes.
  */
trait SchemaAnnotation extends StObject {
  
  /**
    * A set of attributes on the annotation. You can have up to 4 attributes
    * per Annotation.
    */
  var attributes: js.UndefOr[SchemaAttributes] = js.undefined
  
  /**
    * A user-supplied message describing the event. The maximum length for the
    * description is 256 bytes.
    */
  var description: js.UndefOr[SchemaTruncatableString] = js.undefined
}
object SchemaAnnotation {
  
  @scala.inline
  def apply(): SchemaAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAnnotation]
  }
  
  @scala.inline
  implicit class SchemaAnnotationMutableBuilder[Self <: SchemaAnnotation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: SchemaAttributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    @scala.inline
    def setDescription(value: SchemaTruncatableString): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
  }
}
