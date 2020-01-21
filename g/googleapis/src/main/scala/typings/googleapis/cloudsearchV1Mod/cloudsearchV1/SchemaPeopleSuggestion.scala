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
  def apply(person: SchemaPerson = null): SchemaPeopleSuggestion = {
    val __obj = js.Dynamic.literal()
    if (person != null) __obj.updateDynamic("person")(person.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPeopleSuggestion]
  }
}

