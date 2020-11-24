package typings.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The positioning of a PositionedObject. The positioned object is positioned
  * relative to the beginning of the Paragraph it is tethered to.
  */
@js.native
trait SchemaPositionedObjectPositioning extends js.Object {
  
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
  implicit class SchemaPositionedObjectPositioningOps[Self <: SchemaPositionedObjectPositioning] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLayout(value: String): Self = this.set("layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayout: Self = this.set("layout", js.undefined)
    
    @scala.inline
    def setLeftOffset(value: SchemaDimension): Self = this.set("leftOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeftOffset: Self = this.set("leftOffset", js.undefined)
    
    @scala.inline
    def setTopOffset(value: SchemaDimension): Self = this.set("topOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopOffset: Self = this.set("topOffset", js.undefined)
  }
}
