package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A StructuralElement describes content that provides structure to the
  * document.
  */
trait SchemaStructuralElement extends StObject {
  
  /**
    * The zero-based end index of this structural element, exclusive, in UTF-16
    * code units.
    */
  var endIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * A paragraph type of structural element.
    */
  var paragraph: js.UndefOr[SchemaParagraph] = js.undefined
  
  /**
    * A section break type of structural element.
    */
  var sectionBreak: js.UndefOr[SchemaSectionBreak] = js.undefined
  
  /**
    * The zero-based start index of this structural element, in UTF-16 code
    * units.
    */
  var startIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * A table type of structural element.
    */
  var table: js.UndefOr[SchemaTable] = js.undefined
  
  /**
    * A table of contents type of structural element.
    */
  var tableOfContents: js.UndefOr[SchemaTableOfContents] = js.undefined
}
object SchemaStructuralElement {
  
  @scala.inline
  def apply(): SchemaStructuralElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStructuralElement]
  }
  
  @scala.inline
  implicit class SchemaStructuralElementMutableBuilder[Self <: SchemaStructuralElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndIndex(value: Double): Self = StObject.set(x, "endIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndIndexUndefined: Self = StObject.set(x, "endIndex", js.undefined)
    
    @scala.inline
    def setParagraph(value: SchemaParagraph): Self = StObject.set(x, "paragraph", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParagraphUndefined: Self = StObject.set(x, "paragraph", js.undefined)
    
    @scala.inline
    def setSectionBreak(value: SchemaSectionBreak): Self = StObject.set(x, "sectionBreak", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSectionBreakUndefined: Self = StObject.set(x, "sectionBreak", js.undefined)
    
    @scala.inline
    def setStartIndex(value: Double): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartIndexUndefined: Self = StObject.set(x, "startIndex", js.undefined)
    
    @scala.inline
    def setTable(value: SchemaTable): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableOfContents(value: SchemaTableOfContents): Self = StObject.set(x, "tableOfContents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableOfContentsUndefined: Self = StObject.set(x, "tableOfContents", js.undefined)
    
    @scala.inline
    def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
  }
}
