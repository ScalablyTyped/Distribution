package typings.googleapis.safebrowsingV4Mod.safebrowsingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request to check entries against lists.
  */
trait SchemaFindThreatMatchesRequest extends StObject {
  
  /**
    * The client metadata.
    */
  var client: js.UndefOr[SchemaClientInfo] = js.undefined
  
  /**
    * The lists and entries to be checked for matches.
    */
  var threatInfo: js.UndefOr[SchemaThreatInfo] = js.undefined
}
object SchemaFindThreatMatchesRequest {
  
  inline def apply(): SchemaFindThreatMatchesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFindThreatMatchesRequest]
  }
  
  extension [Self <: SchemaFindThreatMatchesRequest](x: Self) {
    
    inline def setClient(value: SchemaClientInfo): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    inline def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
    
    inline def setThreatInfo(value: SchemaThreatInfo): Self = StObject.set(x, "threatInfo", value.asInstanceOf[js.Any])
    
    inline def setThreatInfoUndefined: Self = StObject.set(x, "threatInfo", js.undefined)
  }
}
