package typings.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A ParagraphElement describes content within a Paragraph.
  */
@js.native
trait SchemaParagraphElement extends js.Object {
  
  /**
    * An auto text paragraph element.
    */
  var autoText: js.UndefOr[SchemaAutoText] = js.native
  
  /**
    * A column break paragraph element.
    */
  var columnBreak: js.UndefOr[SchemaColumnBreak] = js.native
  
  /**
    * The zero-base end index of this paragraph element, exclusive, in UTF-16
    * code units.
    */
  var endIndex: js.UndefOr[Double] = js.native
  
  /**
    * An equation paragraph element.
    */
  var equation: js.UndefOr[SchemaEquation] = js.native
  
  /**
    * A footnote reference paragraph element.
    */
  var footnoteReference: js.UndefOr[SchemaFootnoteReference] = js.native
  
  /**
    * A horizontal rule paragraph element.
    */
  var horizontalRule: js.UndefOr[SchemaHorizontalRule] = js.native
  
  /**
    * An inline object paragraph element.
    */
  var inlineObjectElement: js.UndefOr[SchemaInlineObjectElement] = js.native
  
  /**
    * A page break paragraph element.
    */
  var pageBreak: js.UndefOr[SchemaPageBreak] = js.native
  
  /**
    * The zero-based start index of this paragraph element, in UTF-16 code
    * units.
    */
  var startIndex: js.UndefOr[Double] = js.native
  
  /**
    * A text run paragraph element.
    */
  var textRun: js.UndefOr[SchemaTextRun] = js.native
}
object SchemaParagraphElement {
  
  @scala.inline
  def apply(): SchemaParagraphElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaParagraphElement]
  }
  
  @scala.inline
  implicit class SchemaParagraphElementOps[Self <: SchemaParagraphElement] (val x: Self) extends AnyVal {
    
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
    def setAutoText(value: SchemaAutoText): Self = this.set("autoText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoText: Self = this.set("autoText", js.undefined)
    
    @scala.inline
    def setColumnBreak(value: SchemaColumnBreak): Self = this.set("columnBreak", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnBreak: Self = this.set("columnBreak", js.undefined)
    
    @scala.inline
    def setEndIndex(value: Double): Self = this.set("endIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndIndex: Self = this.set("endIndex", js.undefined)
    
    @scala.inline
    def setEquation(value: SchemaEquation): Self = this.set("equation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEquation: Self = this.set("equation", js.undefined)
    
    @scala.inline
    def setFootnoteReference(value: SchemaFootnoteReference): Self = this.set("footnoteReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFootnoteReference: Self = this.set("footnoteReference", js.undefined)
    
    @scala.inline
    def setHorizontalRule(value: SchemaHorizontalRule): Self = this.set("horizontalRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHorizontalRule: Self = this.set("horizontalRule", js.undefined)
    
    @scala.inline
    def setInlineObjectElement(value: SchemaInlineObjectElement): Self = this.set("inlineObjectElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInlineObjectElement: Self = this.set("inlineObjectElement", js.undefined)
    
    @scala.inline
    def setPageBreak(value: SchemaPageBreak): Self = this.set("pageBreak", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageBreak: Self = this.set("pageBreak", js.undefined)
    
    @scala.inline
    def setStartIndex(value: Double): Self = this.set("startIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartIndex: Self = this.set("startIndex", js.undefined)
    
    @scala.inline
    def setTextRun(value: SchemaTextRun): Self = this.set("textRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextRun: Self = this.set("textRun", js.undefined)
  }
}
