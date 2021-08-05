package typings.maximMazurokGapiClientBigquery.anon

import typings.maximMazurokGapiClientBigquery.gapi.client.bigquery.JsonObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsertId extends StObject {
  
  /** [Optional] A unique ID for each row. BigQuery uses this property to detect duplicate insertion requests on a best-effort basis. */
  var insertId: js.UndefOr[String] = js.undefined
  
  /** [Required] A JSON object that contains a row of data. The object's properties and values must match the destination table's schema. */
  var json: js.UndefOr[JsonObject] = js.undefined
}
object InsertId {
  
  inline def apply(): InsertId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InsertId]
  }
  
  extension [Self <: InsertId](x: Self) {
    
    inline def setInsertId(value: String): Self = StObject.set(x, "insertId", value.asInstanceOf[js.Any])
    
    inline def setInsertIdUndefined: Self = StObject.set(x, "insertId", js.undefined)
    
    inline def setJson(value: JsonObject): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
    
    inline def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
  }
}
