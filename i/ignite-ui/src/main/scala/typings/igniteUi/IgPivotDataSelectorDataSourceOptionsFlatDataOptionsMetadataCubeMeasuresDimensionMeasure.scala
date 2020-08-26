package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgPivotDataSelectorDataSourceOptionsFlatDataOptionsMetadataCubeMeasuresDimensionMeasure
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * Optional="false" An aggregator function called when each cell is evaluated.
    * Returns a value for the cell. If the returned value is null, no cell will be created in for the data source result.
    */
  var aggregator: js.UndefOr[js.Function] = js.native
  /**
    * A caption for the measure.
    */
  var caption: js.UndefOr[String] = js.native
  /**
    * The path used when displaying the measure in the user interface. Nested folders are indicated by a backslash (\).
    */
  var displayFolder: js.UndefOr[String] = js.native
  /**
    * Optional="false" A unique name for the measure.
    */
  var name: js.UndefOr[String] = js.native
}

object IgPivotDataSelectorDataSourceOptionsFlatDataOptionsMetadataCubeMeasuresDimensionMeasure {
  @scala.inline
  def apply(): IgPivotDataSelectorDataSourceOptionsFlatDataOptionsMetadataCubeMeasuresDimensionMeasure = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgPivotDataSelectorDataSourceOptionsFlatDataOptionsMetadataCubeMeasuresDimensionMeasure]
  }
  @scala.inline
  implicit class IgPivotDataSelectorDataSourceOptionsFlatDataOptionsMetadataCubeMeasuresDimensionMeasureOps[Self <: IgPivotDataSelectorDataSourceOptionsFlatDataOptionsMetadataCubeMeasuresDimensionMeasure] (val x: Self) extends AnyVal {
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
    def setAggregator(value: js.Function): Self = this.set("aggregator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAggregator: Self = this.set("aggregator", js.undefined)
    @scala.inline
    def setCaption(value: String): Self = this.set("caption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaption: Self = this.set("caption", js.undefined)
    @scala.inline
    def setDisplayFolder(value: String): Self = this.set("displayFolder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayFolder: Self = this.set("displayFolder", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

