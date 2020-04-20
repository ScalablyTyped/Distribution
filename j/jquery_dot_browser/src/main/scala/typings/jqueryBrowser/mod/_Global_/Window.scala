package typings.jqueryBrowser.mod._Global_

import typings.jqueryBrowser.mod.Matchs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Window extends js.Object {
  var jQBrowser: Matchs
}

object Window {
  @scala.inline
  def apply(jQBrowser: Matchs): Window = {
    val __obj = js.Dynamic.literal(jQBrowser = jQBrowser.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
}

