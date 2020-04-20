package typings.googlepay.google.payments.api

import typings.googlepay.googlepayStrings.default_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Supported colors for the Google Pay button.
  *
  * Options:
  *
  * - `default`:
  *   A Google-selected default value. Currently black but it may change
  *   over time.
  *
  * - `black`:
  *   A black button suitable for use on white or light backgrounds.
  *
  * - `white`:
  *   A white button suitable for use on colorful backgrounds.
  */
/* Rewritten from type alias, can be one of: 
  - typings.googlepay.googlepayStrings.default_
  - typings.googlepay.googlepayStrings.black
  - typings.googlepay.googlepayStrings.white
*/
trait ButtonColor extends js.Object

object ButtonColor {
  @scala.inline
  def black: typings.googlepay.googlepayStrings.black = "black".asInstanceOf[typings.googlepay.googlepayStrings.black]
  @scala.inline
  def default: default_ = "default".asInstanceOf[default_]
  @scala.inline
  def white: typings.googlepay.googlepayStrings.white = "white".asInstanceOf[typings.googlepay.googlepayStrings.white]
}

