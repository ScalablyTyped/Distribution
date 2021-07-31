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
  
  @scala.inline
  def apply(): SchemaFindThreatMatchesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFindThreatMatchesRequest]
  }
  
  @scala.inline
  implicit class SchemaFindThreatMatchesRequestMutableBuilder[Self <: SchemaFindThreatMatchesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClient(value: SchemaClientInfo): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
    
    @scala.inline
    def setThreatInfo(value: SchemaThreatInfo): Self = StObject.set(x, "threatInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThreatInfoUndefined: Self = StObject.set(x, "threatInfo", js.undefined)
  }
}
