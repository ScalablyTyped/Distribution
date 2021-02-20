package typings.googleapis.peopleV1Mod.peopleV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A person&#39;s gender.
  */
@js.native
trait SchemaGender extends StObject {
  
  /**
    * The read-only value of the gender translated and formatted in the
    * viewer&#39;s account locale or the `Accept-Language` HTTP header locale.
    */
  var formattedValue: js.UndefOr[String] = js.native
  
  /**
    * Metadata about the gender.
    */
  var metadata: js.UndefOr[SchemaFieldMetadata] = js.native
  
  /**
    * The gender for the person. The gender can be custom or one of these
    * predefined values:  * `male` * `female` * `other` * `unknown`
    */
  var value: js.UndefOr[String] = js.native
}
object SchemaGender {
  
  @scala.inline
  def apply(): SchemaGender = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGender]
  }
  
  @scala.inline
  implicit class SchemaGenderMutableBuilder[Self <: SchemaGender] (val x: Self) extends AnyVal {
    
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
