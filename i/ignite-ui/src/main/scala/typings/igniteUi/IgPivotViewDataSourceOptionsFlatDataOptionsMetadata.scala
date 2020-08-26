package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgPivotViewDataSourceOptionsFlatDataOptionsMetadata
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * Optional="false" Metadata used for the creation of the cube.
    */
  var cube: js.UndefOr[IgPivotViewDataSourceOptionsFlatDataOptionsMetadataCube] = js.native
}

object IgPivotViewDataSourceOptionsFlatDataOptionsMetadata {
  @scala.inline
  def apply(): IgPivotViewDataSourceOptionsFlatDataOptionsMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgPivotViewDataSourceOptionsFlatDataOptionsMetadata]
  }
  @scala.inline
  implicit class IgPivotViewDataSourceOptionsFlatDataOptionsMetadataOps[Self <: IgPivotViewDataSourceOptionsFlatDataOptionsMetadata] (val x: Self) extends AnyVal {
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
    def setCube(value: IgPivotViewDataSourceOptionsFlatDataOptionsMetadataCube): Self = this.set("cube", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCube: Self = this.set("cube", js.undefined)
  }
  
}

