package typings.graphqlDashBinding.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FragmentReplacement extends js.Object {
  var field: String
  var fragment: String
}

object FragmentReplacement {
  @scala.inline
  def apply(field: String, fragment: String): FragmentReplacement = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], fragment = fragment.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FragmentReplacement]
  }
}

