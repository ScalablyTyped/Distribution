package typings.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A mask that indicates which of the fields on the base Shading have been
  * changed in this suggested change. For any field set to true, there is a new
  * suggested value.
  */
@js.native
trait SchemaShadingSuggestionState extends js.Object {
  /**
    * Indicates if there was a suggested change to the Shading.
    */
  var backgroundColorSuggested: js.UndefOr[Boolean] = js.native
}

object SchemaShadingSuggestionState {
  @scala.inline
  def apply(): SchemaShadingSuggestionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaShadingSuggestionState]
  }
  @scala.inline
  implicit class SchemaShadingSuggestionStateOps[Self <: SchemaShadingSuggestionState] (val x: Self) extends AnyVal {
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
    def setBackgroundColorSuggested(value: Boolean): Self = this.set("backgroundColorSuggested", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundColorSuggested: Self = this.set("backgroundColorSuggested", js.undefined)
  }
  
}

