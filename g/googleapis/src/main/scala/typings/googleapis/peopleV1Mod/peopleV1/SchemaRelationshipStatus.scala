package typings.googleapis.peopleV1Mod.peopleV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A person&#39;s read-only relationship status.
  */
trait SchemaRelationshipStatus extends StObject {
  
  /**
    * The read-only value of the relationship status translated and formatted
    * in the viewer&#39;s account locale or the `Accept-Language` HTTP header
    * locale.
    */
  var formattedValue: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata about the relationship status.
    */
  var metadata: js.UndefOr[SchemaFieldMetadata] = js.undefined
  
  /**
    * The relationship status. The value can be custom or one of these
    * predefined values:  * `single` * `inARelationship` * `engaged` *
    * `married` * `itsComplicated` * `openRelationship` * `widowed` *
    * `inDomesticPartnership` * `inCivilUnion`
    */
  var value: js.UndefOr[String] = js.undefined
}
object SchemaRelationshipStatus {
  
  @scala.inline
  def apply(): SchemaRelationshipStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRelationshipStatus]
  }
  
  @scala.inline
  implicit class SchemaRelationshipStatusMutableBuilder[Self <: SchemaRelationshipStatus] (val x: Self) extends AnyVal {
    
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
