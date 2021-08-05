package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryInfo extends StObject {
  
  /** Includes an entry for each satisfied QueryProperty. */
  var queryProperty: js.UndefOr[js.Array[String]] = js.undefined
}
object QueryInfo {
  
  inline def apply(): QueryInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryInfo]
  }
  
  extension [Self <: QueryInfo](x: Self) {
    
    inline def setQueryProperty(value: js.Array[String]): Self = StObject.set(x, "queryProperty", value.asInstanceOf[js.Any])
    
    inline def setQueryPropertyUndefined: Self = StObject.set(x, "queryProperty", js.undefined)
    
    inline def setQueryPropertyVarargs(value: String*): Self = StObject.set(x, "queryProperty", js.Array(value :_*))
  }
}
