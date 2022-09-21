package typings.jitsiMeet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigDeploymentInfo extends StObject {
  
  var region: js.UndefOr[String] = js.undefined
  
  var shard: js.UndefOr[String] = js.undefined
  
  var userRegion: js.UndefOr[String] = js.undefined
}
object ConfigDeploymentInfo {
  
  inline def apply(): ConfigDeploymentInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigDeploymentInfo]
  }
  
  extension [Self <: ConfigDeploymentInfo](x: Self) {
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setShard(value: String): Self = StObject.set(x, "shard", value.asInstanceOf[js.Any])
    
    inline def setShardUndefined: Self = StObject.set(x, "shard", js.undefined)
    
    inline def setUserRegion(value: String): Self = StObject.set(x, "userRegion", value.asInstanceOf[js.Any])
    
    inline def setUserRegionUndefined: Self = StObject.set(x, "userRegion", js.undefined)
  }
}
