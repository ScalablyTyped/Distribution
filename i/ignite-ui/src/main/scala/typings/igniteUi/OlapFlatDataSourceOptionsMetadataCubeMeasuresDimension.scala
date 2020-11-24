package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OlapFlatDataSourceOptionsMetadataCubeMeasuresDimension
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * A caption for the measures dimension.
    *                             The default value is "Measures".
    */
  var caption: js.UndefOr[String] = js.native
  
  /**
    * An array of measure metadata objects.
    */
  var measures: js.UndefOr[js.Array[OlapFlatDataSourceOptionsMetadataCubeMeasuresDimensionMeasure]] = js.native
  
  /**
    * A unique name for the measures dimension.
    *                             The default value is "Measures". This name is used to create the names of dimensions using the following pattern:
    *                             [<measuresDimensionMetadata.name>].[<measureMetadata.name>]
    */
  var name: js.UndefOr[String] = js.native
}
object OlapFlatDataSourceOptionsMetadataCubeMeasuresDimension {
  
  @scala.inline
  def apply(): OlapFlatDataSourceOptionsMetadataCubeMeasuresDimension = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OlapFlatDataSourceOptionsMetadataCubeMeasuresDimension]
  }
  
  @scala.inline
  implicit class OlapFlatDataSourceOptionsMetadataCubeMeasuresDimensionOps[Self <: OlapFlatDataSourceOptionsMetadataCubeMeasuresDimension] (val x: Self) extends AnyVal {
    
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
    def setMeasuresVarargs(value: OlapFlatDataSourceOptionsMetadataCubeMeasuresDimensionMeasure*): Self = this.set("measures", js.Array(value :_*))
    
    @scala.inline
    def setMeasures(value: js.Array[OlapFlatDataSourceOptionsMetadataCubeMeasuresDimensionMeasure]): Self = this.set("measures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMeasures: Self = this.set("measures", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
