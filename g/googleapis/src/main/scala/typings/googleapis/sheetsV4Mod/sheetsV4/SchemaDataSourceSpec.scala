package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDataSourceSpec extends StObject {
  
  /**
    * A BigQueryDataSourceSpec.
    */
  var bigQuery: js.UndefOr[SchemaBigQueryDataSourceSpec] = js.undefined
  
  /**
    * The parameters of the data source, used when querying the data source.
    */
  var parameters: js.UndefOr[js.Array[SchemaDataSourceParameter]] = js.undefined
}
object SchemaDataSourceSpec {
  
  inline def apply(): SchemaDataSourceSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDataSourceSpec]
  }
  
  extension [Self <: SchemaDataSourceSpec](x: Self) {
    
    inline def setBigQuery(value: SchemaBigQueryDataSourceSpec): Self = StObject.set(x, "bigQuery", value.asInstanceOf[js.Any])
    
    inline def setBigQueryUndefined: Self = StObject.set(x, "bigQuery", js.undefined)
    
    inline def setParameters(value: js.Array[SchemaDataSourceParameter]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setParametersVarargs(value: SchemaDataSourceParameter*): Self = StObject.set(x, "parameters", js.Array(value*))
  }
}
