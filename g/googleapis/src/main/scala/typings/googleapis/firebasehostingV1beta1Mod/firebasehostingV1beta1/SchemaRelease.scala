package typings.googleapis.firebasehostingV1beta1Mod.firebasehostingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRelease extends StObject {
  
  /**
    * The deploy description when the release was created. The value can be up to 512 characters.
    */
  var message: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The unique identifier for the release, in either of the following formats: - sites/SITE_ID/releases/RELEASE_ID - sites/SITE_ID/channels/CHANNEL_ID/releases/RELEASE_ID This name is provided in the response body when you call [`releases.create`](sites.releases/create) or [`channels.releases.create`](sites.channels.releases/create).
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The time at which the version is set to be public.
    */
  var releaseTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Identifies the user who created the release.
    */
  var releaseUser: js.UndefOr[SchemaActingUser] = js.undefined
  
  /**
    * Explains the reason for the release. Specify a value for this field only when creating a `SITE_DISABLE` type release.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The configuration and content that was released.
    */
  var version: js.UndefOr[SchemaVersion] = js.undefined
}
object SchemaRelease {
  
  inline def apply(): SchemaRelease = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRelease]
  }
  
  extension [Self <: SchemaRelease](x: Self) {
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageNull: Self = StObject.set(x, "message", null)
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setReleaseTime(value: String): Self = StObject.set(x, "releaseTime", value.asInstanceOf[js.Any])
    
    inline def setReleaseTimeNull: Self = StObject.set(x, "releaseTime", null)
    
    inline def setReleaseTimeUndefined: Self = StObject.set(x, "releaseTime", js.undefined)
    
    inline def setReleaseUser(value: SchemaActingUser): Self = StObject.set(x, "releaseUser", value.asInstanceOf[js.Any])
    
    inline def setReleaseUserUndefined: Self = StObject.set(x, "releaseUser", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setVersion(value: SchemaVersion): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
