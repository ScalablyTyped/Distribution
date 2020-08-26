package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgComboLoadOnDemandSettings
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * Gets/Sets option to enable load on demand.
    *
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * Gets/Sets number of records loaded on each request.
    *
    */
  var pageSize: js.UndefOr[Double] = js.native
}

object IgComboLoadOnDemandSettings {
  @scala.inline
  def apply(): IgComboLoadOnDemandSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgComboLoadOnDemandSettings]
  }
  @scala.inline
  implicit class IgComboLoadOnDemandSettingsOps[Self <: IgComboLoadOnDemandSettings] (val x: Self) extends AnyVal {
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
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setPageSize(value: Double): Self = this.set("pageSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageSize: Self = this.set("pageSize", js.undefined)
  }
  
}

