package typings.googleapis.peopleV1Mod.peopleV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A person&#39;s read-only relationship interest .
  */
trait SchemaRelationshipInterest extends StObject {
  
  /**
    * The value of the relationship interest translated and formatted in the
    * viewer&#39;s account locale or the locale specified in the
    * Accept-Language HTTP header.
    */
  var formattedValue: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata about the relationship interest.
    */
  var metadata: js.UndefOr[SchemaFieldMetadata] = js.undefined
  
  /**
    * The kind of relationship the person is looking for. The value can be
    * custom or one of these predefined values:  * `friend` * `date` *
    * `relationship` * `networking`
    */
  var value: js.UndefOr[String] = js.undefined
}
object SchemaRelationshipInterest {
  
  @scala.inline
  def apply(): SchemaRelationshipInterest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRelationshipInterest]
  }
  
  @scala.inline
  implicit class SchemaRelationshipInterestMutableBuilder[Self <: SchemaRelationshipInterest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormattedValue(value: String): Self = StObject.set(x, "formattedValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormattedValueUndefined: Self = StObject.set(x, "formattedValue", js.undefined)
    
    @scala.inline
    def setMetadata(value: SchemaFieldMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
