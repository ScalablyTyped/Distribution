package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Structured results that are returned as part of search request.
  */
@js.native
trait SchemaStructuredResult extends js.Object {
  /**
    * Representation of a person
    */
  var person: js.UndefOr[SchemaPerson] = js.native
}

object SchemaStructuredResult {
  @scala.inline
  def apply(person: SchemaPerson = null): SchemaStructuredResult = {
    val __obj = js.Dynamic.literal()
    if (person != null) __obj.updateDynamic("person")(person.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaStructuredResult]
  }
}

