package typings.ionicReact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ios extends js.Object {
  var ios: String
  var md: String
}

object Ios {
  @scala.inline
  def apply(ios: String, md: String): Ios = {
    val __obj = js.Dynamic.literal(ios = ios.asInstanceOf[js.Any], md = md.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ios]
  }
}

