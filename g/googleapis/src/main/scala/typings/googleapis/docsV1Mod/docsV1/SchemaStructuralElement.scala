package typings.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A StructuralElement describes content that provides structure to the
  * document.
  */
@js.native
trait SchemaStructuralElement extends js.Object {
  
  /**
    * The zero-based end index of this structural element, exclusive, in UTF-16
    * code units.
    */
  var endIndex: js.UndefOr[Double] = js.native
  
  /**
    * A paragraph type of structural element.
    */
  var paragraph: js.UndefOr[SchemaParagraph] = js.native
  
  /**
    * A section break type of structural element.
    */
  var sectionBreak: js.UndefOr[SchemaSectionBreak] = js.native
  
  /**
    * The zero-based start index of this structural element, in UTF-16 code
    * units.
    */
  var startIndex: js.UndefOr[Double] = js.native
  
  /**
    * A table type of structural element.
    */
  var table: js.UndefOr[SchemaTable] = js.native
  
  /**
    * A table of contents type of structural element.
    */
  var tableOfContents: js.UndefOr[SchemaTableOfContents] = js.native
}
object SchemaStructuralElement {
  
  @scala.inline
  def apply(): SchemaStructuralElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStructuralElement]
  }
  
  @scala.inline
  implicit class SchemaStructuralElementOps[Self <: SchemaStructuralElement] (val x: Self) extends AnyVal {
    
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
    def setEndIndex(value: Double): Self = this.set("endIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndIndex: Self = this.set("endIndex", js.undefined)
    
    @scala.inline
    def setParagraph(value: SchemaParagraph): Self = this.set("paragraph", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParagraph: Self = this.set("paragraph", js.undefined)
    
    @scala.inline
    def setSectionBreak(value: SchemaSectionBreak): Self = this.set("sectionBreak", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSectionBreak: Self = this.set("sectionBreak", js.undefined)
    
    @scala.inline
    def setStartIndex(value: Double): Self = this.set("startIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartIndex: Self = this.set("startIndex", js.undefined)
    
    @scala.inline
    def setTable(value: SchemaTable): Self = this.set("table", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTable: Self = this.set("table", js.undefined)
    
    @scala.inline
    def setTableOfContents(value: SchemaTableOfContents): Self = this.set("tableOfContents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableOfContents: Self = this.set("tableOfContents", js.undefined)
  }
}
