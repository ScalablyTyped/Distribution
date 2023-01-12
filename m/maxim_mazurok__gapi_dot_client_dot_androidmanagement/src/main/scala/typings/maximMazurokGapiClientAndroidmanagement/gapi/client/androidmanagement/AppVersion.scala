package typings.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppVersion extends StObject {
  
  /** If the value is True, it indicates that this version is a production track. */
  var production: js.UndefOr[Boolean] = js.undefined
  
  /** Track identifiers that the app version is published in. This does not include the production track (see production instead). */
  var trackIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Unique increasing identifier for the app version. */
  var versionCode: js.UndefOr[Double] = js.undefined
  
  /** The string used in the Play store by the app developer to identify the version. The string is not necessarily unique or localized (for example, the string could be "1.4"). */
  var versionString: js.UndefOr[String] = js.undefined
}
object AppVersion {
  
  inline def apply(): AppVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppVersion]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppVersion] (val x: Self) extends AnyVal {
    
    inline def setProduction(value: Boolean): Self = StObject.set(x, "production", value.asInstanceOf[js.Any])
    
    inline def setProductionUndefined: Self = StObject.set(x, "production", js.undefined)
    
    inline def setTrackIds(value: js.Array[String]): Self = StObject.set(x, "trackIds", value.asInstanceOf[js.Any])
    
    inline def setTrackIdsUndefined: Self = StObject.set(x, "trackIds", js.undefined)
    
    inline def setTrackIdsVarargs(value: String*): Self = StObject.set(x, "trackIds", js.Array(value*))
    
    inline def setVersionCode(value: Double): Self = StObject.set(x, "versionCode", value.asInstanceOf[js.Any])
    
    inline def setVersionCodeUndefined: Self = StObject.set(x, "versionCode", js.undefined)
    
    inline def setVersionString(value: String): Self = StObject.set(x, "versionString", value.asInstanceOf[js.Any])
    
    inline def setVersionStringUndefined: Self = StObject.set(x, "versionString", js.undefined)
  }
}
