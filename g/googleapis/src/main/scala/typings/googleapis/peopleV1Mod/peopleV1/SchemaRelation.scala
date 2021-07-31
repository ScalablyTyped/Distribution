package typings.googleapis.peopleV1Mod.peopleV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A person&#39;s relation to another person.
  */
trait SchemaRelation extends StObject {
  
  /**
    * The type of the relation translated and formatted in the viewer&#39;s
    * account locale or the locale specified in the Accept-Language HTTP
    * header.
    */
  var formattedType: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata about the relation.
    */
  var metadata: js.UndefOr[SchemaFieldMetadata] = js.undefined
  
  /**
    * The name of the other person this relation refers to.
    */
  var person: js.UndefOr[String] = js.undefined
  
  /**
    * The person&#39;s relation to the other person. The type can be custom or
    * one of these predefined values:  * `spouse` * `child` * `mother` *
    * `father` * `parent` * `brother` * `sister` * `friend` * `relative` *
    * `domesticPartner` * `manager` * `assistant` * `referredBy` * `partner`
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object SchemaRelation {
  
  @scala.inline
  def apply(): SchemaRelation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRelation]
  }
  
  @scala.inline
  implicit class SchemaRelationMutableBuilder[Self <: SchemaRelation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormattedType(value: String): Self = StObject.set(x, "formattedType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormattedTypeUndefined: Self = StObject.set(x, "formattedType", js.undefined)
    
    @scala.inline
    def setMetadata(value: SchemaFieldMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setPerson(value: String): Self = StObject.set(x, "person", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersonUndefined: Self = StObject.set(x, "person", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
