package typings.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A mask that indicates which of the fields on the base
  * PositionedObjectPositioning have been changed in this suggestion. For any
  * field set to true, there is a new suggested value.
  */
@js.native
trait SchemaPositionedObjectPositioningSuggestionState extends js.Object {
  /**
    * Indicates if there was a suggested change to layout.
    */
  var layoutSuggested: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if there was a suggested change to left_offset.
    */
  var leftOffsetSuggested: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if there was a suggested change to top_offset.
    */
  var topOffsetSuggested: js.UndefOr[Boolean] = js.native
}

object SchemaPositionedObjectPositioningSuggestionState {
  @scala.inline
  def apply(): SchemaPositionedObjectPositioningSuggestionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPositionedObjectPositioningSuggestionState]
  }
  @scala.inline
  implicit class SchemaPositionedObjectPositioningSuggestionStateOps[Self <: SchemaPositionedObjectPositioningSuggestionState] (val x: Self) extends AnyVal {
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
    def setLayoutSuggested(value: Boolean): Self = this.set("layoutSuggested", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayoutSuggested: Self = this.set("layoutSuggested", js.undefined)
    @scala.inline
    def setLeftOffsetSuggested(value: Boolean): Self = this.set("leftOffsetSuggested", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeftOffsetSuggested: Self = this.set("leftOffsetSuggested", js.undefined)
    @scala.inline
    def setTopOffsetSuggested(value: Boolean): Self = this.set("topOffsetSuggested", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTopOffsetSuggested: Self = this.set("topOffsetSuggested", js.undefined)
  }
  
}

