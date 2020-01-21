package typings.graphqlCompose

import typings.graphqlCompose.definitionsMod.Extensions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGqcExtensions extends js.Object {
  var _gqcExtensions: js.UndefOr[Extensions] = js.undefined
}

object AnonGqcExtensions {
  @scala.inline
  def apply(_gqcExtensions: Extensions = null): AnonGqcExtensions = {
    val __obj = js.Dynamic.literal()
    if (_gqcExtensions != null) __obj.updateDynamic("_gqcExtensions")(_gqcExtensions.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGqcExtensions]
  }
}

