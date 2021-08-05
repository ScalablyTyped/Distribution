package typings.instagramPrivateApi.anon

import typings.instagramPrivateApi.commonTypesMod.IgAppModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Pick<instagram-private-api.instagram-private-api/dist/feeds.TopicalExploreFeed, 'sessionId' | 'clusterId' | 'lat' | 'lng' | 'module'>> */
trait PartialPickTopicalExplore extends StObject {
  
  var clusterId: js.UndefOr[String] = js.undefined
  
  var lat: js.UndefOr[String | Double] = js.undefined
  
  var lng: js.UndefOr[String | Double] = js.undefined
  
  var module: js.UndefOr[IgAppModule] = js.undefined
  
  var sessionId: js.UndefOr[String] = js.undefined
}
object PartialPickTopicalExplore {
  
  inline def apply(): PartialPickTopicalExplore = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickTopicalExplore]
  }
  
  extension [Self <: PartialPickTopicalExplore](x: Self) {
    
    inline def setClusterId(value: String): Self = StObject.set(x, "clusterId", value.asInstanceOf[js.Any])
    
    inline def setClusterIdUndefined: Self = StObject.set(x, "clusterId", js.undefined)
    
    inline def setLat(value: String | Double): Self = StObject.set(x, "lat", value.asInstanceOf[js.Any])
    
    inline def setLatUndefined: Self = StObject.set(x, "lat", js.undefined)
    
    inline def setLng(value: String | Double): Self = StObject.set(x, "lng", value.asInstanceOf[js.Any])
    
    inline def setLngUndefined: Self = StObject.set(x, "lng", js.undefined)
    
    inline def setModule(value: IgAppModule): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
    
    inline def setModuleUndefined: Self = StObject.set(x, "module", js.undefined)
    
    inline def setSessionId(value: String): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
    
    inline def setSessionIdUndefined: Self = StObject.set(x, "sessionId", js.undefined)
  }
}
