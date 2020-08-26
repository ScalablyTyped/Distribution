package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgBrowseButton
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  var autoselect: js.UndefOr[Boolean] = js.native
  /**
    * M.H. 13 Feb 2014 Fix for bug #164347: Move input  from document body to the upload container
    */
  var container: js.UndefOr[js.Any] = js.native
  var multipleFiles: js.UndefOr[Boolean] = js.native
}

object IgBrowseButton {
  @scala.inline
  def apply(): IgBrowseButton = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgBrowseButton]
  }
  @scala.inline
  implicit class IgBrowseButtonOps[Self <: IgBrowseButton] (val x: Self) extends AnyVal {
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
    def setAutoselect(value: Boolean): Self = this.set("autoselect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoselect: Self = this.set("autoselect", js.undefined)
    @scala.inline
    def setContainer(value: js.Any): Self = this.set("container", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    @scala.inline
    def setMultipleFiles(value: Boolean): Self = this.set("multipleFiles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultipleFiles: Self = this.set("multipleFiles", js.undefined)
  }
  
}

