package typings.googleapis.v1Dot4Mod.adsenseV14

import typings.googleapis.anon.AdsAppearOn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCustomChannel extends StObject {
  
  /**
    * Code of this custom channel, not necessarily unique across ad clients.
    */
  var code: js.UndefOr[String] = js.undefined
  
  /**
    * Unique identifier of this custom channel. This should be considered an
    * opaque identifier; it is not safe to rely on it being in any particular
    * format.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Kind of resource this is, in this case adsense#customChannel.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Name of this custom channel.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The targeting information of this custom channel, if activated.
    */
  var targetingInfo: js.UndefOr[AdsAppearOn] = js.undefined
}
object SchemaCustomChannel {
  
  inline def apply(): SchemaCustomChannel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomChannel]
  }
  
  extension [Self <: SchemaCustomChannel](x: Self) {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTargetingInfo(value: AdsAppearOn): Self = StObject.set(x, "targetingInfo", value.asInstanceOf[js.Any])
    
    inline def setTargetingInfoUndefined: Self = StObject.set(x, "targetingInfo", js.undefined)
  }
}
