package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListPerfSampleSeriesResponse extends StObject {
  
  /**
    * The resulting PerfSampleSeries sorted by id
    */
  var perfSampleSeries: js.UndefOr[js.Array[SchemaPerfSampleSeries]] = js.undefined
}
object SchemaListPerfSampleSeriesResponse {
  
  @scala.inline
  def apply(): SchemaListPerfSampleSeriesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListPerfSampleSeriesResponse]
  }
  
  @scala.inline
  implicit class SchemaListPerfSampleSeriesResponseMutableBuilder[Self <: SchemaListPerfSampleSeriesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPerfSampleSeries(value: js.Array[SchemaPerfSampleSeries]): Self = StObject.set(x, "perfSampleSeries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerfSampleSeriesUndefined: Self = StObject.set(x, "perfSampleSeries", js.undefined)
    
    @scala.inline
    def setPerfSampleSeriesVarargs(value: SchemaPerfSampleSeries*): Self = StObject.set(x, "perfSampleSeries", js.Array(value :_*))
  }
}
