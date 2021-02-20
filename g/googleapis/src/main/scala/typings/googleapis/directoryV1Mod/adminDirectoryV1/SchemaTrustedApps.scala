package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON template for Trusted Apps response object of a user in Directory API.
  */
@js.native
trait SchemaTrustedApps extends StObject {
  
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.native
  
  /**
    * Identifies the resource as trusted apps response.
    */
  var kind: js.UndefOr[String] = js.native
  
  var nextPageToken: js.UndefOr[String] = js.native
  
  /**
    * Trusted Apps list.
    */
  var trustedApps: js.UndefOr[js.Array[SchemaTrustedAppId]] = js.native
}
object SchemaTrustedApps {
  
  @scala.inline
  def apply(): SchemaTrustedApps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTrustedApps]
  }
  
  @scala.inline
  implicit class SchemaTrustedAppsMutableBuilder[Self <: SchemaTrustedApps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setTrustedApps(value: js.Array[SchemaTrustedAppId]): Self = StObject.set(x, "trustedApps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrustedAppsUndefined: Self = StObject.set(x, "trustedApps", js.undefined)
    
    @scala.inline
    def setTrustedAppsVarargs(value: SchemaTrustedAppId*): Self = StObject.set(x, "trustedApps", js.Array(value :_*))
  }
}
