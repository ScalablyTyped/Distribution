package typings.googleapis.peopleV1Mod.peopleV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A person&#39;s age range.
  */
@js.native
trait SchemaAgeRangeType extends StObject {
  
  /**
    * The age range.
    */
  var ageRange: js.UndefOr[String] = js.native
  
  /**
    * Metadata about the age range.
    */
  var metadata: js.UndefOr[SchemaFieldMetadata] = js.native
}
object SchemaAgeRangeType {
  
  @scala.inline
  def apply(): SchemaAgeRangeType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAgeRangeType]
  }
  
  @scala.inline
  implicit class SchemaAgeRangeTypeMutableBuilder[Self <: SchemaAgeRangeType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAgeRange(value: String): Self = StObject.set(x, "ageRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgeRangeUndefined: Self = StObject.set(x, "ageRange", js.undefined)
    
    @scala.inline
    def setMetadata(value: SchemaFieldMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
  }
}
