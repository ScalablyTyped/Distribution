package typings.googleapis.fitnessV1Mod.fitnessV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The specification of which data to aggregate.
  */
@js.native
trait SchemaAggregateBy extends js.Object {
  
  /**
    * A data source ID to aggregate. Mutually exclusive of dataTypeName. Only
    * data from the specified data source ID will be included in the
    * aggregation. The dataset in the response will have the same data source
    * ID.
    */
  var dataSourceId: js.UndefOr[String] = js.native
  
  /**
    * The data type to aggregate. All data sources providing this data type
    * will contribute data to the aggregation. The response will contain a
    * single dataset for this data type name. The dataset will have a data
    * source ID of derived:com.google.:com.google.android.gms:aggregated
    */
  var dataTypeName: js.UndefOr[String] = js.native
}
object SchemaAggregateBy {
  
  @scala.inline
  def apply(): SchemaAggregateBy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAggregateBy]
  }
  
  @scala.inline
  implicit class SchemaAggregateByOps[Self <: SchemaAggregateBy] (val x: Self) extends AnyVal {
    
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
    def setDataSourceId(value: String): Self = this.set("dataSourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSourceId: Self = this.set("dataSourceId", js.undefined)
    
    @scala.inline
    def setDataTypeName(value: String): Self = this.set("dataTypeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataTypeName: Self = this.set("dataTypeName", js.undefined)
  }
}
