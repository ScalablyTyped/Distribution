package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A ParagraphElement representing a footnote reference. A footnote reference
  * is the inline content rendered with a number and is used to identify the
  * footnote.
  */
@js.native
trait SchemaFootnoteReference extends js.Object {
  /**
    * The ID of the footnote that contains the content of this footnote
    * reference.
    */
  var footnoteId: js.UndefOr[String] = js.native
  /**
    * The rendered number of this footnote.
    */
  var footnoteNumber: js.UndefOr[String] = js.native
  /**
    * The suggested deletion IDs. If empty, then there are no suggested
    * deletions of this content.
    */
  var suggestedDeletionIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * The suggested insertion IDs. A FootnoteReference may have multiple
    * insertion IDs if it is a nested suggested change. If empty, then this is
    * not a suggested insertion.
    */
  var suggestedInsertionIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * The suggested text style changes to this FootnoteReference, keyed by
    * suggestion ID.
    */
  var suggestedTextStyleChanges: js.UndefOr[StringDictionary[SchemaSuggestedTextStyle]] = js.native
  /**
    * The text style of this FootnoteReference.
    */
  var textStyle: js.UndefOr[SchemaTextStyle] = js.native
}

object SchemaFootnoteReference {
  @scala.inline
  def apply(
    footnoteId: String = null,
    footnoteNumber: String = null,
    suggestedDeletionIds: js.Array[String] = null,
    suggestedInsertionIds: js.Array[String] = null,
    suggestedTextStyleChanges: StringDictionary[SchemaSuggestedTextStyle] = null,
    textStyle: SchemaTextStyle = null
  ): SchemaFootnoteReference = {
    val __obj = js.Dynamic.literal()
    if (footnoteId != null) __obj.updateDynamic("footnoteId")(footnoteId.asInstanceOf[js.Any])
    if (footnoteNumber != null) __obj.updateDynamic("footnoteNumber")(footnoteNumber.asInstanceOf[js.Any])
    if (suggestedDeletionIds != null) __obj.updateDynamic("suggestedDeletionIds")(suggestedDeletionIds.asInstanceOf[js.Any])
    if (suggestedInsertionIds != null) __obj.updateDynamic("suggestedInsertionIds")(suggestedInsertionIds.asInstanceOf[js.Any])
    if (suggestedTextStyleChanges != null) __obj.updateDynamic("suggestedTextStyleChanges")(suggestedTextStyleChanges.asInstanceOf[js.Any])
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaFootnoteReference]
  }
}

