package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OlapTableViewOptions
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * Optional="false" a value indicating whether the result has one or more hierarchies in the columns.
    */
  var hasColumns: js.UndefOr[Boolean] = js.native
  /**
    * Optional="false" a value indicating whether the result has one or more hierarchies in the rows.
    */
  var hasRows: js.UndefOr[Boolean] = js.native
  /**
    * Optional="false" an object of type $.ig.OlapResult.
    */
  var result: js.UndefOr[js.Any] = js.native
  /**
    * Optional="false" an object containing the table view configuration options as properties.
    */
  var viewSettings: js.UndefOr[OlapTableViewOptionsViewSettings] = js.native
}

object OlapTableViewOptions {
  @scala.inline
  def apply(): OlapTableViewOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OlapTableViewOptions]
  }
  @scala.inline
  implicit class OlapTableViewOptionsOps[Self <: OlapTableViewOptions] (val x: Self) extends AnyVal {
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
    def setHasColumns(value: Boolean): Self = this.set("hasColumns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasColumns: Self = this.set("hasColumns", js.undefined)
    @scala.inline
    def setHasRows(value: Boolean): Self = this.set("hasRows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasRows: Self = this.set("hasRows", js.undefined)
    @scala.inline
    def setResult(value: js.Any): Self = this.set("result", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResult: Self = this.set("result", js.undefined)
    @scala.inline
    def setViewSettings(value: OlapTableViewOptionsViewSettings): Self = this.set("viewSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViewSettings: Self = this.set("viewSettings", js.undefined)
  }
  
}

