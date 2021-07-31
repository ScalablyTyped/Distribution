package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Properties of an InlineObject.
  */
trait SchemaInlineObjectProperties extends StObject {
  
  /**
    * The embedded object of this inline object.
    */
  var embeddedObject: js.UndefOr[SchemaEmbeddedObject] = js.undefined
}
object SchemaInlineObjectProperties {
  
  @scala.inline
  def apply(): SchemaInlineObjectProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInlineObjectProperties]
  }
  
  @scala.inline
  implicit class SchemaInlineObjectPropertiesMutableBuilder[Self <: SchemaInlineObjectProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmbeddedObject(value: SchemaEmbeddedObject): Self = StObject.set(x, "embeddedObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmbeddedObjectUndefined: Self = StObject.set(x, "embeddedObject", js.undefined)
  }
}
