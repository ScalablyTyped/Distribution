package typings.graphql

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MaxErrors extends js.Object {
  var maxErrors: js.UndefOr[Double] = js.undefined
}

object Anon_MaxErrors {
  @scala.inline
  def apply(maxErrors: Int | Double = null): Anon_MaxErrors = {
    val __obj = js.Dynamic.literal()
    if (maxErrors != null) __obj.updateDynamic("maxErrors")(maxErrors.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_MaxErrors]
  }
}

