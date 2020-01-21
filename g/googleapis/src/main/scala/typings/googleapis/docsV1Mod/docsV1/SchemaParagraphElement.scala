package typings.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    autoText: SchemaAutoText = null,
    columnBreak: SchemaColumnBreak = null,
    endIndex: Int | Double = null,
    equation: SchemaEquation = null,
    footnoteReference: SchemaFootnoteReference = null,
    horizontalRule: SchemaHorizontalRule = null,
    inlineObjectElement: SchemaInlineObjectElement = null,
    pageBreak: SchemaPageBreak = null,
    startIndex: Int | Double = null,
    textRun: SchemaTextRun = null
  ): SchemaParagraphElement = {
    val __obj = js.Dynamic.literal()
    if (autoText != null) __obj.updateDynamic("autoText")(autoText.asInstanceOf[js.Any])
    if (columnBreak != null) __obj.updateDynamic("columnBreak")(columnBreak.asInstanceOf[js.Any])
    if (endIndex != null) __obj.updateDynamic("endIndex")(endIndex.asInstanceOf[js.Any])
    if (equation != null) __obj.updateDynamic("equation")(equation.asInstanceOf[js.Any])
    if (footnoteReference != null) __obj.updateDynamic("footnoteReference")(footnoteReference.asInstanceOf[js.Any])
    if (horizontalRule != null) __obj.updateDynamic("horizontalRule")(horizontalRule.asInstanceOf[js.Any])
    if (inlineObjectElement != null) __obj.updateDynamic("inlineObjectElement")(inlineObjectElement.asInstanceOf[js.Any])
    if (pageBreak != null) __obj.updateDynamic("pageBreak")(pageBreak.asInstanceOf[js.Any])
    if (startIndex != null) __obj.updateDynamic("startIndex")(startIndex.asInstanceOf[js.Any])
    if (textRun != null) __obj.updateDynamic("textRun")(textRun.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaParagraphElement]
  }
}

