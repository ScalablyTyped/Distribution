package typings.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A mask that indicates which of the fields on the base CropProperties have
  * been changed in this suggestion. For any field set to true, there is a new
  * suggested value.
  */
@js.native
trait SchemaCropPropertiesSuggestionState extends js.Object {
  /**
    * Indicates if there was a suggested change to angle.
    */
  var angleSuggested: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if there was a suggested change to offset_bottom.
    */
  var offsetBottomSuggested: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if there was a suggested change to offset_left.
    */
  var offsetLeftSuggested: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if there was a suggested change to offset_right.
    */
  var offsetRightSuggested: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if there was a suggested change to offset_top.
    */
  var offsetTopSuggested: js.UndefOr[Boolean] = js.native
}

object SchemaCropPropertiesSuggestionState {
  @scala.inline
  def apply(): SchemaCropPropertiesSuggestionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCropPropertiesSuggestionState]
  }
  @scala.inline
  implicit class SchemaCropPropertiesSuggestionStateOps[Self <: SchemaCropPropertiesSuggestionState] (val x: Self) extends AnyVal {
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
    def setAngleSuggested(value: Boolean): Self = this.set("angleSuggested", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAngleSuggested: Self = this.set("angleSuggested", js.undefined)
    @scala.inline
    def setOffsetBottomSuggested(value: Boolean): Self = this.set("offsetBottomSuggested", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffsetBottomSuggested: Self = this.set("offsetBottomSuggested", js.undefined)
    @scala.inline
    def setOffsetLeftSuggested(value: Boolean): Self = this.set("offsetLeftSuggested", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffsetLeftSuggested: Self = this.set("offsetLeftSuggested", js.undefined)
    @scala.inline
    def setOffsetRightSuggested(value: Boolean): Self = this.set("offsetRightSuggested", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffsetRightSuggested: Self = this.set("offsetRightSuggested", js.undefined)
    @scala.inline
    def setOffsetTopSuggested(value: Boolean): Self = this.set("offsetTopSuggested", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffsetTopSuggested: Self = this.set("offsetTopSuggested", js.undefined)
  }
  
}

