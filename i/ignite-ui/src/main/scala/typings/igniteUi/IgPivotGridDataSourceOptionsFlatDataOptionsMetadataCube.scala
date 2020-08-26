package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgPivotGridDataSourceOptionsFlatDataOptionsMetadataCube
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * A caption for the cube.
    */
  var caption: js.UndefOr[String] = js.native
  /**
    * An array of dimension metadata objects.
    */
  var dimensions: js.UndefOr[js.Array[IgPivotGridDataSourceOptionsFlatDataOptionsMetadataCubeDimension]] = js.native
  /**
    * An object providing information about the measures' root node.
    */
  var measuresDimension: js.UndefOr[IgPivotGridDataSourceOptionsFlatDataOptionsMetadataCubeMeasuresDimension] = js.native
  /**
    * Optional="false" A unique name for the cube.
    */
  var name: js.UndefOr[String] = js.native
}

object IgPivotGridDataSourceOptionsFlatDataOptionsMetadataCube {
  @scala.inline
  def apply(): IgPivotGridDataSourceOptionsFlatDataOptionsMetadataCube = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgPivotGridDataSourceOptionsFlatDataOptionsMetadataCube]
  }
  @scala.inline
  implicit class IgPivotGridDataSourceOptionsFlatDataOptionsMetadataCubeOps[Self <: IgPivotGridDataSourceOptionsFlatDataOptionsMetadataCube] (val x: Self) extends AnyVal {
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
    def setCaption(value: String): Self = this.set("caption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaption: Self = this.set("caption", js.undefined)
    @scala.inline
    def setDimensionsVarargs(value: IgPivotGridDataSourceOptionsFlatDataOptionsMetadataCubeDimension*): Self = this.set("dimensions", js.Array(value :_*))
    @scala.inline
    def setDimensions(value: js.Array[IgPivotGridDataSourceOptionsFlatDataOptionsMetadataCubeDimension]): Self = this.set("dimensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDimensions: Self = this.set("dimensions", js.undefined)
    @scala.inline
    def setMeasuresDimension(value: IgPivotGridDataSourceOptionsFlatDataOptionsMetadataCubeMeasuresDimension): Self = this.set("measuresDimension", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMeasuresDimension: Self = this.set("measuresDimension", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

