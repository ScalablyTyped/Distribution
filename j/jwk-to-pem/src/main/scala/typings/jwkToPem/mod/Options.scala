package typings.jwkToPem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var `private`: Boolean
}

object Options {
  @scala.inline
  def apply(`private`: Boolean): Options = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("private")(`private`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

