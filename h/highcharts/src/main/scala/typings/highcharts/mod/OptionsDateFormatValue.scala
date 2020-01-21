package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.highcharts.highchartsStrings.ddSlashmmSlashYY
  - typings.highcharts.highchartsStrings.ddSlashmmSlashYYYY
  - typings.highcharts.highchartsStrings.mmSlashddSlashYY
  - typings.highcharts.highchartsStrings.mmSlashddSlashYYYY
  - typings.highcharts.highchartsStrings.YYYYSlashmmSlashdd
*/
trait OptionsDateFormatValue extends js.Object

object OptionsDateFormatValue {
  @scala.inline
  def YYYYSlashmmSlashdd: typings.highcharts.highchartsStrings.YYYYSlashmmSlashdd = this.cast("YYYY/mm/dd")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def ddSlashmmSlashYY: typings.highcharts.highchartsStrings.ddSlashmmSlashYY = this.cast("dd/mm/YY")
  @scala.inline
  def ddSlashmmSlashYYYY: typings.highcharts.highchartsStrings.ddSlashmmSlashYYYY = this.cast("dd/mm/YYYY")
  @scala.inline
  def mmSlashddSlashYY: typings.highcharts.highchartsStrings.mmSlashddSlashYY = this.cast("mm/dd/YY")
  @scala.inline
  def mmSlashddSlashYYYY: typings.highcharts.highchartsStrings.mmSlashddSlashYYYY = this.cast("mm/dd/YYYY")
}

