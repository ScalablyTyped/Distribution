package typings.maximMazurokGapiClientAdsense.gapi.client.adsense

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SavedReport extends StObject {
  
  /** Unique identifier of this saved report. */
  var id: js.UndefOr[String] = js.undefined
  
  /** Kind of resource this is, in this case adsense#savedReport. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** This saved report's name. */
  var name: js.UndefOr[String] = js.undefined
}
object SavedReport {
  
  inline def apply(): SavedReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SavedReport]
  }
  
  extension [Self <: SavedReport](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
