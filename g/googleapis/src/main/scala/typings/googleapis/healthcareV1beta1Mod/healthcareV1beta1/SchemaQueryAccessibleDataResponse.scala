package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaQueryAccessibleDataResponse extends StObject {
  
  /**
    * List of files, each of which contains a list of data_id(s) that are consented for a specified use in the request.
    */
  var gcsUris: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaQueryAccessibleDataResponse {
  
  inline def apply(): SchemaQueryAccessibleDataResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQueryAccessibleDataResponse]
  }
  
  extension [Self <: SchemaQueryAccessibleDataResponse](x: Self) {
    
    inline def setGcsUris(value: js.Array[String]): Self = StObject.set(x, "gcsUris", value.asInstanceOf[js.Any])
    
    inline def setGcsUrisNull: Self = StObject.set(x, "gcsUris", null)
    
    inline def setGcsUrisUndefined: Self = StObject.set(x, "gcsUris", js.undefined)
    
    inline def setGcsUrisVarargs(value: String*): Self = StObject.set(x, "gcsUris", js.Array(value*))
  }
}
