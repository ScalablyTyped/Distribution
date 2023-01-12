package typings.maximMazurokGapiClientCloudbuild.gapi.client.cloudbuild

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchCreateBitbucketServerConnectedRepositoriesResponseMetadata extends StObject {
  
  /** Time the operation was completed. */
  var completeTime: js.UndefOr[String] = js.undefined
  
  /** The name of the `BitbucketServerConfig` that added connected repositories. Format: `projects/{project}/locations/{location}/bitbucketServerConfigs/{config}` */
  var config: js.UndefOr[String] = js.undefined
  
  /** Time the operation was created. */
  var createTime: js.UndefOr[String] = js.undefined
}
object BatchCreateBitbucketServerConnectedRepositoriesResponseMetadata {
  
  inline def apply(): BatchCreateBitbucketServerConnectedRepositoriesResponseMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchCreateBitbucketServerConnectedRepositoriesResponseMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchCreateBitbucketServerConnectedRepositoriesResponseMetadata] (val x: Self) extends AnyVal {
    
    inline def setCompleteTime(value: String): Self = StObject.set(x, "completeTime", value.asInstanceOf[js.Any])
    
    inline def setCompleteTimeUndefined: Self = StObject.set(x, "completeTime", js.undefined)
    
    inline def setConfig(value: String): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
  }
}
