package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The positioning of a PositionedObject. The positioned object is positioned
  * relative to the beginning of the Paragraph it is tethered to.
  */
@js.native
trait SchemaPositionedObjectPositioning extends StObject {
  
  /**
    * The layout of this positioned object.
    */
  var layout: js.UndefOr[String] = js.native
  
  /**
    * The offset of the left edge of the positioned object relative to the
    * beginning of the Paragraph it is tethered to. The exact positioning of
    * the object can depend on other content in the document and the
    * document&#39;s styling.
    */
  var leftOffset: js.UndefOr[SchemaDimension] = js.native
  
  /**
    * The offset of the top edge of the positioned object relative to the
    * beginning of the Paragraph it is tethered to. The exact positioning of
    * the object can depend on other content in the document and the
    * document&#39;s styling.
    */
  var topOffset: js.UndefOr[SchemaDimension] = js.native
}
object SchemaPositionedObjectPositioning {
  
  @scala.inline
  def apply(): SchemaPositionedObjectPositioning = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPositionedObjectPositioning]
  }
  
  @scala.inline
  implicit class SchemaPositionedObjectPositioningMutableBuilder[Self <: SchemaPositionedObjectPositioning] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLayout(value: String): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    @scala.inline
    def setLeftOffset(value: SchemaDimension): Self = StObject.set(x, "leftOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftOffsetUndefined: Self = StObject.set(x, "leftOffset", js.undefined)
    
    @scala.inline
    def setTopOffset(value: SchemaDimension): Self = StObject.set(x, "topOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopOffsetUndefined: Self = StObject.set(x, "topOffset", js.undefined)
  }
}
