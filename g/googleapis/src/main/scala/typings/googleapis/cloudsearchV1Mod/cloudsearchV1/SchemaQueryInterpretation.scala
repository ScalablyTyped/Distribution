package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaQueryInterpretation extends StObject {
  
  var interpretationType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The interpretation of the query used in search. For example, queries with natural language intent like "email from john" will be interpreted as "from:john source:mail". This field will not be filled when the reason is NOT_ENOUGH_RESULTS_FOUND_FOR_USER_QUERY.
    */
  var interpretedQuery: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The reason for interpretation of the query. This field will not be UNSPECIFIED if the interpretation type is not NONE.
    */
  var reason: js.UndefOr[String | Null] = js.undefined
}
object SchemaQueryInterpretation {
  
  inline def apply(): SchemaQueryInterpretation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQueryInterpretation]
  }
  
  extension [Self <: SchemaQueryInterpretation](x: Self) {
    
    inline def setInterpretationType(value: String): Self = StObject.set(x, "interpretationType", value.asInstanceOf[js.Any])
    
    inline def setInterpretationTypeNull: Self = StObject.set(x, "interpretationType", null)
    
    inline def setInterpretationTypeUndefined: Self = StObject.set(x, "interpretationType", js.undefined)
    
    inline def setInterpretedQuery(value: String): Self = StObject.set(x, "interpretedQuery", value.asInstanceOf[js.Any])
    
    inline def setInterpretedQueryNull: Self = StObject.set(x, "interpretedQuery", null)
    
    inline def setInterpretedQueryUndefined: Self = StObject.set(x, "interpretedQuery", js.undefined)
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonNull: Self = StObject.set(x, "reason", null)
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}
