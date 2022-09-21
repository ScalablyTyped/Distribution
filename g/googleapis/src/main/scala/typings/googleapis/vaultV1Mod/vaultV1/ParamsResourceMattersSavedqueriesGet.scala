package typings.googleapis.vaultV1Mod.vaultV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceMattersSavedqueriesGet
  extends StObject
     with StandardParameters {
  
  /**
    * The ID of the matter to get the saved query from.
    */
  var matterId: js.UndefOr[String] = js.undefined
  
  /**
    * ID of the saved query to retrieve.
    */
  var savedQueryId: js.UndefOr[String] = js.undefined
}
object ParamsResourceMattersSavedqueriesGet {
  
  inline def apply(): ParamsResourceMattersSavedqueriesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceMattersSavedqueriesGet]
  }
  
  extension [Self <: ParamsResourceMattersSavedqueriesGet](x: Self) {
    
    inline def setMatterId(value: String): Self = StObject.set(x, "matterId", value.asInstanceOf[js.Any])
    
    inline def setMatterIdUndefined: Self = StObject.set(x, "matterId", js.undefined)
    
    inline def setSavedQueryId(value: String): Self = StObject.set(x, "savedQueryId", value.asInstanceOf[js.Any])
    
    inline def setSavedQueryIdUndefined: Self = StObject.set(x, "savedQueryId", js.undefined)
  }
}
