package typings.googleapis.peopleV1Mod.peopleV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A person&#39;s short biography.
  */
@js.native
trait SchemaBiography extends StObject {
  
  /**
    * The content type of the biography.
    */
  var contentType: js.UndefOr[String] = js.native
  
  /**
    * Metadata about the biography.
    */
  var metadata: js.UndefOr[SchemaFieldMetadata] = js.native
  
  /**
    * The short biography.
    */
  var value: js.UndefOr[String] = js.native
}
object SchemaBiography {
  
  @scala.inline
  def apply(): SchemaBiography = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBiography]
  }
  
  @scala.inline
  implicit class SchemaBiographyMutableBuilder[Self <: SchemaBiography] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
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
