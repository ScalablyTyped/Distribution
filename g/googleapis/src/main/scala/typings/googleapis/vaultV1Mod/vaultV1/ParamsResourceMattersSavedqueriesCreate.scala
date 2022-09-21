package typings.googleapis.vaultV1Mod.vaultV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceMattersSavedqueriesCreate
  extends StObject
     with StandardParameters {
  
  /**
    * The ID of the matter to create the saved query in.
    */
  var matterId: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaSavedQuery] = js.undefined
}
object ParamsResourceMattersSavedqueriesCreate {
  
  inline def apply(): ParamsResourceMattersSavedqueriesCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceMattersSavedqueriesCreate]
  }
  
  extension [Self <: ParamsResourceMattersSavedqueriesCreate](x: Self) {
    
    inline def setMatterId(value: String): Self = StObject.set(x, "matterId", value.asInstanceOf[js.Any])
    
    inline def setMatterIdUndefined: Self = StObject.set(x, "matterId", js.undefined)
    
    inline def setRequestBody(value: SchemaSavedQuery): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
