package typings.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppTrackInfo extends StObject {
  
  /** The track name associated with the trackId, set in the Play Console. The name is modifiable from Play Console. */
  var trackAlias: js.UndefOr[String] = js.undefined
  
  /** The unmodifiable unique track identifier, taken from the releaseTrackId in the URL of the Play Console page that displays the app’s track information. */
  var trackId: js.UndefOr[String] = js.undefined
}
object AppTrackInfo {
  
  inline def apply(): AppTrackInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppTrackInfo]
  }
  
  extension [Self <: AppTrackInfo](x: Self) {
    
    inline def setTrackAlias(value: String): Self = StObject.set(x, "trackAlias", value.asInstanceOf[js.Any])
    
    inline def setTrackAliasUndefined: Self = StObject.set(x, "trackAlias", js.undefined)
    
    inline def setTrackId(value: String): Self = StObject.set(x, "trackId", value.asInstanceOf[js.Any])
    
    inline def setTrackIdUndefined: Self = StObject.set(x, "trackId", js.undefined)
  }
}
