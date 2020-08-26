package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgResponsiveContainer
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * The time between two resize checks in milliseconds.
    */
  var pollingInterval: js.UndefOr[Double] = js.native
}

object IgResponsiveContainer {
  @scala.inline
  def apply(): IgResponsiveContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgResponsiveContainer]
  }
  @scala.inline
  implicit class IgResponsiveContainerOps[Self <: IgResponsiveContainer] (val x: Self) extends AnyVal {
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
    def setPollingInterval(value: Double): Self = this.set("pollingInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePollingInterval: Self = this.set("pollingInterval", js.undefined)
  }
  
}

