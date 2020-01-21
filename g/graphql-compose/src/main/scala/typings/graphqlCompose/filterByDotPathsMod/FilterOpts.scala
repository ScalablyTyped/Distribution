package typings.graphqlCompose.filterByDotPathsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterOpts extends js.Object {
  var hideFields: StringDictionary[String]
  var hideFieldsNote: js.UndefOr[String] = js.undefined
}

object FilterOpts {
  @scala.inline
  def apply(hideFields: StringDictionary[String], hideFieldsNote: String = null): FilterOpts = {
    val __obj = js.Dynamic.literal(hideFields = hideFields.asInstanceOf[js.Any])
    if (hideFieldsNote != null) __obj.updateDynamic("hideFieldsNote")(hideFieldsNote.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterOpts]
  }
}

