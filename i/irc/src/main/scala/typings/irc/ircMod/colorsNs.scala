package typings.irc.ircMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Colors */
@JSImport("irc", "colors")
@js.native
object colorsNs extends js.Object {
  def wrap(color: String, text: String): String = js.native
  def wrap(color: String, text: String, reset_color: String): String = js.native
  @js.native
  object codes extends /* index */ StringDictionary[String]
  
}

