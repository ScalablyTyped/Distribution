package typings.googleapis.v1Dot1Mod.doubleclickbidmanagerV11

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceQueriesCreatequery
  extends StObject
     with StandardParameters {
  
  /**
    * If true, tries to run the query asynchronously. Only applicable when the frequency is ONE_TIME.
    */
  var asynchronous: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaQuery] = js.undefined
}
object ParamsResourceQueriesCreatequery {
  
  inline def apply(): ParamsResourceQueriesCreatequery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceQueriesCreatequery]
  }
  
  extension [Self <: ParamsResourceQueriesCreatequery](x: Self) {
    
    inline def setAsynchronous(value: Boolean): Self = StObject.set(x, "asynchronous", value.asInstanceOf[js.Any])
    
    inline def setAsynchronousUndefined: Self = StObject.set(x, "asynchronous", js.undefined)
    
    inline def setRequestBody(value: SchemaQuery): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
