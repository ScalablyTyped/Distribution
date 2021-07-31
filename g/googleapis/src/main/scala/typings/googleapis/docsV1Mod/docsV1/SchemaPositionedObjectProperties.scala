package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Properties of a PositionedObject.
  */
trait SchemaPositionedObjectProperties extends StObject {
  
  /**
    * The embedded object of this positioned object.
    */
  var embeddedObject: js.UndefOr[SchemaEmbeddedObject] = js.undefined
  
  /**
    * The positioning of this positioned object relative to the newline of the
    * Paragraph that references this positioned object.
    */
  var positioning: js.UndefOr[SchemaPositionedObjectPositioning] = js.undefined
}
object SchemaPositionedObjectProperties {
  
  @scala.inline
  def apply(): SchemaPositionedObjectProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPositionedObjectProperties]
  }
  
  @scala.inline
  implicit class SchemaPositionedObjectPropertiesMutableBuilder[Self <: SchemaPositionedObjectProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmbeddedObject(value: SchemaEmbeddedObject): Self = StObject.set(x, "embeddedObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmbeddedObjectUndefined: Self = StObject.set(x, "embeddedObject", js.undefined)
    
    @scala.inline
    def setPositioning(value: SchemaPositionedObjectPositioning): Self = StObject.set(x, "positioning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositioningUndefined: Self = StObject.set(x, "positioning", js.undefined)
  }
}
