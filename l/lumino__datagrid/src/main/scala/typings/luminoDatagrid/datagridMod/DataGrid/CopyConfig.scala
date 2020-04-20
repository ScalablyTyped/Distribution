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
trait CopyConfig extends js.Object {
  /**
    * The headers to included in the copied output.
    */
  val headers: none | row | column | all
  /**
    * The separator to use between values.
    */
  val separator: String
  /**
    * The cell count threshold for a copy to be considered "large".
    */
  val warningThreshold: Double
  /**
    * The function for formatting the data values.
    */
  def format(args: CopyFormatArgs): String
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
}

