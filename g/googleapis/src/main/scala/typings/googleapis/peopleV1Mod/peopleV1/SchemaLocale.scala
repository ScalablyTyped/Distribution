package typings.googleapis.peopleV1Mod.peopleV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A person&#39;s locale preference.
  */
trait SchemaLocale extends StObject {
  
  /**
    * Metadata about the locale.
    */
  var metadata: js.UndefOr[SchemaFieldMetadata] = js.undefined
  
  /**
    * The well-formed [IETF BCP 47](https://tools.ietf.org/html/bcp47) language
    * tag representing the locale.
    */
  var value: js.UndefOr[String] = js.undefined
}
object SchemaLocale {
  
  @scala.inline
  def apply(): SchemaLocale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLocale]
  }
  
  @scala.inline
  implicit class SchemaLocaleMutableBuilder[Self <: SchemaLocale] (val x: Self) extends AnyVal {
    
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
