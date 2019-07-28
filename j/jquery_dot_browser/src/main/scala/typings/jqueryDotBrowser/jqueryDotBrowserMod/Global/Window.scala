package typings.jqueryDotBrowser.jqueryDotBrowserMod.Global

import typings.jqueryDotBrowser.jqueryDotBrowserMod.Matchs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Window extends js.Object {
  var jQBrowser: Matchs
}

object Window {
  @scala.inline
  def apply(jQBrowser: Matchs): Window = {
    val __obj = js.Dynamic.literal(jQBrowser = jQBrowser)
  
    __obj.asInstanceOf[Window]
  }
}

