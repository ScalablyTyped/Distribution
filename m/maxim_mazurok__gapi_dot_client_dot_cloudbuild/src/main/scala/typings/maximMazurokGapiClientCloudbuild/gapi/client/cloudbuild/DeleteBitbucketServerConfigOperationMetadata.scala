package typings.maximMazurokGapiClientCloudbuild.gapi.client.cloudbuild

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteBitbucketServerConfigOperationMetadata extends StObject {
  
  /** The resource name of the BitbucketServerConfig to be deleted. Format: `projects/{project}/locations/{location}/bitbucketServerConfigs/{id}`. */
  var bitbucketServerConfig: js.UndefOr[String] = js.undefined
  
  /** Time the operation was completed. */
  var completeTime: js.UndefOr[String] = js.undefined
  
  /** Time the operation was created. */
  var createTime: js.UndefOr[String] = js.undefined
}
object DeleteBitbucketServerConfigOperationMetadata {
  
  inline def apply(): DeleteBitbucketServerConfigOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteBitbucketServerConfigOperationMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteBitbucketServerConfigOperationMetadata] (val x: Self) extends AnyVal {
    
    inline def setBitbucketServerConfig(value: String): Self = StObject.set(x, "bitbucketServerConfig", value.asInstanceOf[js.Any])
    
    inline def setBitbucketServerConfigUndefined: Self = StObject.set(x, "bitbucketServerConfig", js.undefined)
    
    inline def setCompleteTime(value: String): Self = StObject.set(x, "completeTime", value.asInstanceOf[js.Any])
    
    inline def setCompleteTimeUndefined: Self = StObject.set(x, "completeTime", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
  }
}
