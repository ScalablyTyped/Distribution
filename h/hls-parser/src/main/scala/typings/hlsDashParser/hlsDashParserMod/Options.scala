package typings.hlsDashParser.hlsDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var strictMode: Boolean
}

object Options {
  @scala.inline
  def apply(strictMode: Boolean): Options = {
    val __obj = js.Dynamic.literal(strictMode = strictMode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Options]
  }
}

