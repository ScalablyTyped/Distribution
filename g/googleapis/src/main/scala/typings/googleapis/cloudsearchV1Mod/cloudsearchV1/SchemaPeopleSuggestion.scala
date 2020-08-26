package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A people suggestion.
  */
@js.native
trait SchemaPeopleSuggestion extends js.Object {
  /**
    * Suggested person. All fields of the person object might not be populated.
    */
  var person: js.UndefOr[SchemaPerson] = js.native
}

object SchemaPeopleSuggestion {
  @scala.inline
  def apply(): SchemaPeopleSuggestion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPeopleSuggestion]
  }
  @scala.inline
  implicit class SchemaPeopleSuggestionOps[Self <: SchemaPeopleSuggestion] (val x: Self) extends AnyVal {
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
    def setPerson(value: SchemaPerson): Self = this.set("person", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePerson: Self = this.set("person", js.undefined)
  }
  
}

