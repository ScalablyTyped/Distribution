package typings.googleapis.dataplexV1Mod.dataplexV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDataplexV1ContentSqlScript extends StObject {
  
  /**
    * Required. Query Engine to be used for the Sql Query.
    */
  var engine: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDataplexV1ContentSqlScript {
  
  inline def apply(): SchemaGoogleCloudDataplexV1ContentSqlScript = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDataplexV1ContentSqlScript]
  }
  
  extension [Self <: SchemaGoogleCloudDataplexV1ContentSqlScript](x: Self) {
    
    inline def setEngine(value: String): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
    
    inline def setEngineNull: Self = StObject.set(x, "engine", null)
    
    inline def setEngineUndefined: Self = StObject.set(x, "engine", js.undefined)
  }
}
