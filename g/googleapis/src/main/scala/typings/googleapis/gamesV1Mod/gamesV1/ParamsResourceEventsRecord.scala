package typings.googleapis.gamesV1Mod.gamesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceEventsRecord
  extends StObject
     with StandardParameters {
  
  /**
    * The preferred language to use for strings returned by this method.
    */
  var language: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaEventRecordRequest] = js.undefined
}
object ParamsResourceEventsRecord {
  
  inline def apply(): ParamsResourceEventsRecord = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceEventsRecord]
  }
  
  extension [Self <: ParamsResourceEventsRecord](x: Self) {
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setRequestBody(value: SchemaEventRecordRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
