package typings.googleapis.safebrowsingV4Mod.safebrowsingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaThreatHit extends StObject {
  
  /**
    * Client-reported identification.
    */
  var clientInfo: js.UndefOr[SchemaClientInfo] = js.undefined
  
  /**
    * The threat entry responsible for the hit. Full hash should be reported
    * for hash-based hits.
    */
  var entry: js.UndefOr[SchemaThreatEntry] = js.undefined
  
  /**
    * The platform type reported.
    */
  var platformType: js.UndefOr[String] = js.undefined
  
  /**
    * The resources related to the threat hit.
    */
  var resources: js.UndefOr[js.Array[SchemaThreatSource]] = js.undefined
  
  /**
    * The threat type reported.
    */
  var threatType: js.UndefOr[String] = js.undefined
  
  /**
    * Details about the user that encountered the threat.
    */
  var userInfo: js.UndefOr[SchemaUserInfo] = js.undefined
}
object SchemaThreatHit {
  
  inline def apply(): SchemaThreatHit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaThreatHit]
  }
  
  extension [Self <: SchemaThreatHit](x: Self) {
    
    inline def setClientInfo(value: SchemaClientInfo): Self = StObject.set(x, "clientInfo", value.asInstanceOf[js.Any])
    
    inline def setClientInfoUndefined: Self = StObject.set(x, "clientInfo", js.undefined)
    
    inline def setEntry(value: SchemaThreatEntry): Self = StObject.set(x, "entry", value.asInstanceOf[js.Any])
    
    inline def setEntryUndefined: Self = StObject.set(x, "entry", js.undefined)
    
    inline def setPlatformType(value: String): Self = StObject.set(x, "platformType", value.asInstanceOf[js.Any])
    
    inline def setPlatformTypeUndefined: Self = StObject.set(x, "platformType", js.undefined)
    
    inline def setResources(value: js.Array[SchemaThreatSource]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    inline def setResourcesVarargs(value: SchemaThreatSource*): Self = StObject.set(x, "resources", js.Array(value :_*))
    
    inline def setThreatType(value: String): Self = StObject.set(x, "threatType", value.asInstanceOf[js.Any])
    
    inline def setThreatTypeUndefined: Self = StObject.set(x, "threatType", js.undefined)
    
    inline def setUserInfo(value: SchemaUserInfo): Self = StObject.set(x, "userInfo", value.asInstanceOf[js.Any])
    
    inline def setUserInfoUndefined: Self = StObject.set(x, "userInfo", js.undefined)
  }
}
