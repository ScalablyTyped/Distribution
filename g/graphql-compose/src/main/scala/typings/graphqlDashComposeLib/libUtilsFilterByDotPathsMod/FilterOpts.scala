package typings
package graphqlDashComposeLib.libUtilsFilterByDotPathsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterOpts extends js.Object {
  var hideFields: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var hideFieldsNote: js.UndefOr[java.lang.String] = js.undefined
}

object FilterOpts {
  @scala.inline
  def apply(
    hideFields: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    hideFieldsNote: java.lang.String = null
  ): FilterOpts = {
    val __obj = js.Dynamic.literal(hideFields = hideFields)
    if (hideFieldsNote != null) __obj.updateDynamic("hideFieldsNote")(hideFieldsNote)
    __obj.asInstanceOf[FilterOpts]
  }
}

