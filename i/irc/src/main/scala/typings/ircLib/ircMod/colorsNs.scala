package typings
package ircLib.ircMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Colors */
@JSImport("irc", "colors")
@js.native
object colorsNs extends js.Object {
  def wrap(color: java.lang.String, text: java.lang.String): java.lang.String = js.native
  def wrap(color: java.lang.String, text: java.lang.String, reset_color: java.lang.String): java.lang.String = js.native
  @js.native
  object codes
    extends /* index */ ScalablyTyped.runtime.StringDictionary[java.lang.String]
  
}

