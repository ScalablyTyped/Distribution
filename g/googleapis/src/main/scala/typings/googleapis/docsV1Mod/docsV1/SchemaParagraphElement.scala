package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaParagraphElement extends StObject {
  
  /**
    * An auto text paragraph element.
    */
  var autoText: js.UndefOr[SchemaAutoText] = js.undefined
  
  /**
    * A column break paragraph element.
    */
  var columnBreak: js.UndefOr[SchemaColumnBreak] = js.undefined
  
  /**
    * The zero-base end index of this paragraph element, exclusive, in UTF-16 code units.
    */
  var endIndex: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * An equation paragraph element.
    */
  var equation: js.UndefOr[SchemaEquation] = js.undefined
  
  /**
    * A footnote reference paragraph element.
    */
  var footnoteReference: js.UndefOr[SchemaFootnoteReference] = js.undefined
  
  /**
    * A horizontal rule paragraph element.
    */
  var horizontalRule: js.UndefOr[SchemaHorizontalRule] = js.undefined
  
  /**
    * An inline object paragraph element.
    */
  var inlineObjectElement: js.UndefOr[SchemaInlineObjectElement] = js.undefined
  
  /**
    * A page break paragraph element.
    */
  var pageBreak: js.UndefOr[SchemaPageBreak] = js.undefined
  
  /**
    * A paragraph element that links to a person or email address.
    */
  var person: js.UndefOr[SchemaPerson] = js.undefined
  
  /**
    * A paragraph element that links to a Google resource (such as a file in Drive, a Youtube video, a Calendar event, etc.)
    */
  var richLink: js.UndefOr[SchemaRichLink] = js.undefined
  
  /**
    * The zero-based start index of this paragraph element, in UTF-16 code units.
    */
  var startIndex: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * A text run paragraph element.
    */
  var textRun: js.UndefOr[SchemaTextRun] = js.undefined
}
object SchemaParagraphElement {
  
  inline def apply(): SchemaParagraphElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaParagraphElement]
  }
  
  extension [Self <: SchemaParagraphElement](x: Self) {
    
    inline def setAutoText(value: SchemaAutoText): Self = StObject.set(x, "autoText", value.asInstanceOf[js.Any])
    
    inline def setAutoTextUndefined: Self = StObject.set(x, "autoText", js.undefined)
    
    inline def setColumnBreak(value: SchemaColumnBreak): Self = StObject.set(x, "columnBreak", value.asInstanceOf[js.Any])
    
    inline def setColumnBreakUndefined: Self = StObject.set(x, "columnBreak", js.undefined)
    
    inline def setEndIndex(value: Double): Self = StObject.set(x, "endIndex", value.asInstanceOf[js.Any])
    
    inline def setEndIndexNull: Self = StObject.set(x, "endIndex", null)
    
    inline def setEndIndexUndefined: Self = StObject.set(x, "endIndex", js.undefined)
    
    inline def setEquation(value: SchemaEquation): Self = StObject.set(x, "equation", value.asInstanceOf[js.Any])
    
    inline def setEquationUndefined: Self = StObject.set(x, "equation", js.undefined)
    
    inline def setFootnoteReference(value: SchemaFootnoteReference): Self = StObject.set(x, "footnoteReference", value.asInstanceOf[js.Any])
    
    inline def setFootnoteReferenceUndefined: Self = StObject.set(x, "footnoteReference", js.undefined)
    
    inline def setHorizontalRule(value: SchemaHorizontalRule): Self = StObject.set(x, "horizontalRule", value.asInstanceOf[js.Any])
    
    inline def setHorizontalRuleUndefined: Self = StObject.set(x, "horizontalRule", js.undefined)
    
    inline def setInlineObjectElement(value: SchemaInlineObjectElement): Self = StObject.set(x, "inlineObjectElement", value.asInstanceOf[js.Any])
    
    inline def setInlineObjectElementUndefined: Self = StObject.set(x, "inlineObjectElement", js.undefined)
    
    inline def setPageBreak(value: SchemaPageBreak): Self = StObject.set(x, "pageBreak", value.asInstanceOf[js.Any])
    
    inline def setPageBreakUndefined: Self = StObject.set(x, "pageBreak", js.undefined)
    
    inline def setPerson(value: SchemaPerson): Self = StObject.set(x, "person", value.asInstanceOf[js.Any])
    
    inline def setPersonUndefined: Self = StObject.set(x, "person", js.undefined)
    
    inline def setRichLink(value: SchemaRichLink): Self = StObject.set(x, "richLink", value.asInstanceOf[js.Any])
    
    inline def setRichLinkUndefined: Self = StObject.set(x, "richLink", js.undefined)
    
    inline def setStartIndex(value: Double): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
    
    inline def setStartIndexNull: Self = StObject.set(x, "startIndex", null)
    
    inline def setStartIndexUndefined: Self = StObject.set(x, "startIndex", js.undefined)
    
    inline def setTextRun(value: SchemaTextRun): Self = StObject.set(x, "textRun", value.asInstanceOf[js.Any])
    
    inline def setTextRunUndefined: Self = StObject.set(x, "textRun", js.undefined)
  }
}
