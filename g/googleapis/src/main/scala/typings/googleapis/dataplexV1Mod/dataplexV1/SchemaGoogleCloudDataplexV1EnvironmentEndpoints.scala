package typings.googleapis.dataplexV1Mod.dataplexV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDataplexV1EnvironmentEndpoints extends StObject {
  
  /**
    * Output only. URI to serve notebook APIs
    */
  var notebooks: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. URI to serve SQL APIs
    */
  var sql: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDataplexV1EnvironmentEndpoints {
  
  inline def apply(): SchemaGoogleCloudDataplexV1EnvironmentEndpoints = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDataplexV1EnvironmentEndpoints]
  }
  
  extension [Self <: SchemaGoogleCloudDataplexV1EnvironmentEndpoints](x: Self) {
    
    inline def setNotebooks(value: String): Self = StObject.set(x, "notebooks", value.asInstanceOf[js.Any])
    
    inline def setNotebooksNull: Self = StObject.set(x, "notebooks", null)
    
    inline def setNotebooksUndefined: Self = StObject.set(x, "notebooks", js.undefined)
    
    inline def setSql(value: String): Self = StObject.set(x, "sql", value.asInstanceOf[js.Any])
    
    inline def setSqlNull: Self = StObject.set(x, "sql", null)
    
    inline def setSqlUndefined: Self = StObject.set(x, "sql", js.undefined)
  }
}
