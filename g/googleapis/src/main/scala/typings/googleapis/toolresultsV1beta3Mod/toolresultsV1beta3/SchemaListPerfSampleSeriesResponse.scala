package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaListPerfSampleSeriesResponse extends js.Object {
  
  /**
    * The resulting PerfSampleSeries sorted by id
    */
  var perfSampleSeries: js.UndefOr[js.Array[SchemaPerfSampleSeries]] = js.native
}
object SchemaListPerfSampleSeriesResponse {
  
  @scala.inline
  def apply(): SchemaListPerfSampleSeriesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListPerfSampleSeriesResponse]
  }
  
  @scala.inline
  implicit class SchemaListPerfSampleSeriesResponseOps[Self <: SchemaListPerfSampleSeriesResponse] (val x: Self) extends AnyVal {
    
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
    def setPerfSampleSeriesVarargs(value: SchemaPerfSampleSeries*): Self = this.set("perfSampleSeries", js.Array(value :_*))
    
    @scala.inline
    def setPerfSampleSeries(value: js.Array[SchemaPerfSampleSeries]): Self = this.set("perfSampleSeries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePerfSampleSeries: Self = this.set("perfSampleSeries", js.undefined)
  }
}
