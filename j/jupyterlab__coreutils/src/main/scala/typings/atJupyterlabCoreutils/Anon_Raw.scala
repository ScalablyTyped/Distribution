package typings.atJupyterlabCoreutils

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Raw extends js.Object {
  var raw: String
  var rule: RegExp
}

object Anon_Raw {
  @scala.inline
  def apply(raw: String, rule: RegExp): Anon_Raw = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], rule = rule.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Raw]
  }
}

