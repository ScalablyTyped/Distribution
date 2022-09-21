package typings.maximMazurokGapiClientCloudbuild.gapi.client.cloudbuild

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkerPool extends StObject {
  
  /** User specified annotations. See https://google.aip.dev/128#annotations for more details such as format and size limitations. */
  var annotations: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientCloudbuild.maximMazurokGapiClientCloudbuildStrings.WorkerPool & TopLevel[Any]
  ] = js.undefined
  
  /** Output only. Time at which the request to create the `WorkerPool` was received. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /** Output only. Time at which the request to delete the `WorkerPool` was received. */
  var deleteTime: js.UndefOr[String] = js.undefined
  
  /** A user-specified, human-readable name for the `WorkerPool`. If provided, this value must be 1-63 characters. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** Output only. Checksum computed by the server. May be sent on update and delete requests to ensure that the client has an up-to-date value before proceeding. */
  var etag: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. The resource name of the `WorkerPool`, with format `projects/{project}/locations/{location}/workerPools/{worker_pool}`. The value of `{worker_pool}` is provided by
    * `worker_pool_id` in `CreateWorkerPool` request and the value of `{location}` is determined by the endpoint accessed.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /** Legacy Private Pool configuration. */
  var privatePoolV1Config: js.UndefOr[PrivatePoolV1Config] = js.undefined
  
  /** Output only. `WorkerPool` state. */
  var state: js.UndefOr[String] = js.undefined
  
  /** Output only. A unique identifier for the `WorkerPool`. */
  var uid: js.UndefOr[String] = js.undefined
  
  /** Output only. Time at which the request to update the `WorkerPool` was received. */
  var updateTime: js.UndefOr[String] = js.undefined
}
object WorkerPool {
  
  inline def apply(): WorkerPool = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkerPool]
  }
  
  extension [Self <: WorkerPool](x: Self) {
    
    inline def setAnnotations(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientCloudbuild.maximMazurokGapiClientCloudbuildStrings.WorkerPool & TopLevel[Any]
    ): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    inline def setAnnotationsUndefined: Self = StObject.set(x, "annotations", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDeleteTime(value: String): Self = StObject.set(x, "deleteTime", value.asInstanceOf[js.Any])
    
    inline def setDeleteTimeUndefined: Self = StObject.set(x, "deleteTime", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPrivatePoolV1Config(value: PrivatePoolV1Config): Self = StObject.set(x, "privatePoolV1Config", value.asInstanceOf[js.Any])
    
    inline def setPrivatePoolV1ConfigUndefined: Self = StObject.set(x, "privatePoolV1Config", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    
    inline def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
