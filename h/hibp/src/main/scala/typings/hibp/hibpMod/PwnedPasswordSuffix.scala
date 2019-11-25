package typings.hibp.hibpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PwnedPasswordSuffix extends js.Object {
  var count: Double
  var suffix: String
}

object PwnedPasswordSuffix {
  @scala.inline
  def apply(count: Double, suffix: String): PwnedPasswordSuffix = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], suffix = suffix.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PwnedPasswordSuffix]
  }
}

