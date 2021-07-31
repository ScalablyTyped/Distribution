package typings.googleapis.peopleV1Mod.peopleV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A read-only brief one-line description of the person.
  */
trait SchemaTagline extends StObject {
  
  /**
    * Metadata about the tagline.
    */
  var metadata: js.UndefOr[SchemaFieldMetadata] = js.undefined
  
  /**
    * The tagline.
    */
  var value: js.UndefOr[String] = js.undefined
}
object SchemaTagline {
  
  @scala.inline
  def apply(): SchemaTagline = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTagline]
  }
  
  @scala.inline
  implicit class SchemaTaglineMutableBuilder[Self <: SchemaTagline] (val x: Self) extends AnyVal {
    
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
