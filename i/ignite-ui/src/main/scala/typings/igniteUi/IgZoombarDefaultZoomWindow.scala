package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgZoombarDefaultZoomWindow
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * The left component of the zoom window in percentages.
    *
    */
  var left: js.UndefOr[Double] = js.native
  /**
    * The width of the zoom window in percentages.
    *
    */
  var width: js.UndefOr[String] = js.native
}

object IgZoombarDefaultZoomWindow {
  @scala.inline
  def apply(): IgZoombarDefaultZoomWindow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgZoombarDefaultZoomWindow]
  }
  @scala.inline
  implicit class IgZoombarDefaultZoomWindowOps[Self <: IgZoombarDefaultZoomWindow] (val x: Self) extends AnyVal {
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
    def setLeft(value: Double): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeft: Self = this.set("left", js.undefined)
    @scala.inline
    def setWidth(value: String): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

