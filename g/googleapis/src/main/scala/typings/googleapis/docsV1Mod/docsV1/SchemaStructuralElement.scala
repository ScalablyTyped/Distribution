package typings.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    endIndex: Int | Double = null,
    paragraph: SchemaParagraph = null,
    sectionBreak: SchemaSectionBreak = null,
    startIndex: Int | Double = null,
    table: SchemaTable = null,
    tableOfContents: SchemaTableOfContents = null
  ): SchemaStructuralElement = {
    val __obj = js.Dynamic.literal()
    if (endIndex != null) __obj.updateDynamic("endIndex")(endIndex.asInstanceOf[js.Any])
    if (paragraph != null) __obj.updateDynamic("paragraph")(paragraph.asInstanceOf[js.Any])
    if (sectionBreak != null) __obj.updateDynamic("sectionBreak")(sectionBreak.asInstanceOf[js.Any])
    if (startIndex != null) __obj.updateDynamic("startIndex")(startIndex.asInstanceOf[js.Any])
    if (table != null) __obj.updateDynamic("table")(table.asInstanceOf[js.Any])
    if (tableOfContents != null) __obj.updateDynamic("tableOfContents")(tableOfContents.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaStructuralElement]
  }
}

