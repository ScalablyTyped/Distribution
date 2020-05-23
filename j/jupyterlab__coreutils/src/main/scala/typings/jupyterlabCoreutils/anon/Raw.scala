package typings.jupyterlabCoreutils.anon

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Raw extends js.Object {
  var raw: String
  var rule: RegExp
}

object Raw {
  @scala.inline
  def apply(raw: String, rule: RegExp): Raw = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], rule = rule.asInstanceOf[js.Any])
    __obj.asInstanceOf[Raw]
  }
}

