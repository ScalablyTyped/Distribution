package typings.luxon.luxonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.luxon.luxonStrings.casual
  - typings.luxon.luxonStrings.longterm
*/
trait ConversionAccuracy extends js.Object

object ConversionAccuracy {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def casual: typings.luxon.luxonStrings.casual = this.cast("casual")
  @scala.inline
  def longterm: typings.luxon.luxonStrings.longterm = this.cast("longterm")
}

