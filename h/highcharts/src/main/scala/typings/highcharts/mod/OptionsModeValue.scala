package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.highcharts.highchartsStrings.normal
  - typings.highcharts.highchartsStrings.serialize
*/
trait OptionsModeValue extends js.Object

object OptionsModeValue {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def normal: typings.highcharts.highchartsStrings.normal = this.cast("normal")
  @scala.inline
  def serialize: typings.highcharts.highchartsStrings.serialize = this.cast("serialize")
}

