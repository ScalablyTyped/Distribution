package typings.googleapis.fitnessV1Mod.fitnessV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListDataSourcesResponse extends StObject {
  
  /**
    * A previously created data source.
    */
  var dataSource: js.UndefOr[js.Array[SchemaDataSource]] = js.undefined
}
object SchemaListDataSourcesResponse {
  
  inline def apply(): SchemaListDataSourcesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListDataSourcesResponse]
  }
  
  extension [Self <: SchemaListDataSourcesResponse](x: Self) {
    
    inline def setDataSource(value: js.Array[SchemaDataSource]): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    inline def setDataSourceVarargs(value: SchemaDataSource*): Self = StObject.set(x, "dataSource", js.Array(value :_*))
  }
}
