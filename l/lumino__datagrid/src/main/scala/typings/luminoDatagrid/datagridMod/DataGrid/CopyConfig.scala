package typings.luminoDatagrid.datagridMod.DataGrid

import typings.luminoDatagrid.luminoDatagridStrings.all
import typings.luminoDatagrid.luminoDatagridStrings.column
import typings.luminoDatagrid.luminoDatagridStrings.none
import typings.luminoDatagrid.luminoDatagridStrings.row
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A type alias for the data grid copy config.
  */
@js.native
trait CopyConfig extends js.Object {
  /**
    * The headers to included in the copied output.
    */
  val headers: none | row | column | all = js.native
  /**
    * The separator to use between values.
    */
  val separator: String = js.native
  /**
    * The cell count threshold for a copy to be considered "large".
    */
  val warningThreshold: Double = js.native
  /**
    * The function for formatting the data values.
    */
  def format(args: CopyFormatArgs): String = js.native
}

object CopyConfig {
  @scala.inline
  def apply(
    format: CopyFormatArgs => String,
    headers: none | row | column | all,
    separator: String,
    warningThreshold: Double
  ): CopyConfig = {
    val __obj = js.Dynamic.literal(format = js.Any.fromFunction1(format), headers = headers.asInstanceOf[js.Any], separator = separator.asInstanceOf[js.Any], warningThreshold = warningThreshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyConfig]
  }
  @scala.inline
  implicit class CopyConfigOps[Self <: CopyConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFormat(value: CopyFormatArgs => String): Self = this.set("format", js.Any.fromFunction1(value))
    @scala.inline
    def setHeaders(value: none | row | column | all): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def setSeparator(value: String): Self = this.set("separator", value.asInstanceOf[js.Any])
    @scala.inline
    def setWarningThreshold(value: Double): Self = this.set("warningThreshold", value.asInstanceOf[js.Any])
  }
  
}

