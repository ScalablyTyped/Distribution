package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaQueryInterpretation extends StObject {
  
  var interpretationType: js.UndefOr[String] = js.undefined
  
  /**
    * The interpretation of the query used in search. For example, query
    * &quot;email from john&quot; will be interpreted as &quot;from:john
    * source:mail&quot;
    */
  var interpretedQuery: js.UndefOr[String] = js.undefined
}
object SchemaQueryInterpretation {
  
  inline def apply(): SchemaQueryInterpretation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQueryInterpretation]
  }
  
  extension [Self <: SchemaQueryInterpretation](x: Self) {
    
    inline def setInterpretationType(value: String): Self = StObject.set(x, "interpretationType", value.asInstanceOf[js.Any])
    
    inline def setInterpretationTypeUndefined: Self = StObject.set(x, "interpretationType", js.undefined)
    
    inline def setInterpretedQuery(value: String): Self = StObject.set(x, "interpretedQuery", value.asInstanceOf[js.Any])
    
    inline def setInterpretedQueryUndefined: Self = StObject.set(x, "interpretedQuery", js.undefined)
  }
}
