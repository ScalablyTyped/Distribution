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
  
  @scala.inline
  def apply(): SchemaThreatHit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaThreatHit]
  }
  
  @scala.inline
  implicit class SchemaThreatHitMutableBuilder[Self <: SchemaThreatHit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientInfo(value: SchemaClientInfo): Self = StObject.set(x, "clientInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientInfoUndefined: Self = StObject.set(x, "clientInfo", js.undefined)
    
    @scala.inline
    def setEntry(value: SchemaThreatEntry): Self = StObject.set(x, "entry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntryUndefined: Self = StObject.set(x, "entry", js.undefined)
    
    @scala.inline
    def setPlatformType(value: String): Self = StObject.set(x, "platformType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformTypeUndefined: Self = StObject.set(x, "platformType", js.undefined)
    
    @scala.inline
    def setResources(value: js.Array[SchemaThreatSource]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    @scala.inline
    def setResourcesVarargs(value: SchemaThreatSource*): Self = StObject.set(x, "resources", js.Array(value :_*))
    
    @scala.inline
    def setThreatType(value: String): Self = StObject.set(x, "threatType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThreatTypeUndefined: Self = StObject.set(x, "threatType", js.undefined)
    
    @scala.inline
    def setUserInfo(value: SchemaUserInfo): Self = StObject.set(x, "userInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserInfoUndefined: Self = StObject.set(x, "userInfo", js.undefined)
  }
}
