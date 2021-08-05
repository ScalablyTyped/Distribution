package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkerSettings extends StObject {
  
  /**
    * The base URL for accessing Google Cloud APIs. When workers access Google Cloud APIs, they logically do so via relative URLs. If this field is specified, it supplies the base URL to
    * use for resolving these relative URLs. The normative algorithm used is defined by RFC 1808, "Relative Uniform Resource Locators". If not specified, the default value is
    * "http://www.googleapis.com/"
    */
  var baseUrl: js.UndefOr[String] = js.undefined
  
  /** Whether to send work progress updates to the service. */
  var reportingEnabled: js.UndefOr[Boolean] = js.undefined
  
  /** The Cloud Dataflow service path relative to the root URL, for example, "dataflow/v1b3/projects". */
  var servicePath: js.UndefOr[String] = js.undefined
  
  /** The Shuffle service path relative to the root URL, for example, "shuffle/v1beta1". */
  var shuffleServicePath: js.UndefOr[String] = js.undefined
  
  /**
    * The prefix of the resources the system should use for temporary storage. The supported resource type is: Google Cloud Storage: storage.googleapis.com/{bucket}/{object}
    * bucket.storage.googleapis.com/{object}
    */
  var tempStoragePrefix: js.UndefOr[String] = js.undefined
  
  /** The ID of the worker running this pipeline. */
  var workerId: js.UndefOr[String] = js.undefined
}
object WorkerSettings {
  
  inline def apply(): WorkerSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkerSettings]
  }
  
  extension [Self <: WorkerSettings](x: Self) {
    
    inline def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
    
    inline def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
    
    inline def setReportingEnabled(value: Boolean): Self = StObject.set(x, "reportingEnabled", value.asInstanceOf[js.Any])
    
    inline def setReportingEnabledUndefined: Self = StObject.set(x, "reportingEnabled", js.undefined)
    
    inline def setServicePath(value: String): Self = StObject.set(x, "servicePath", value.asInstanceOf[js.Any])
    
    inline def setServicePathUndefined: Self = StObject.set(x, "servicePath", js.undefined)
    
    inline def setShuffleServicePath(value: String): Self = StObject.set(x, "shuffleServicePath", value.asInstanceOf[js.Any])
    
    inline def setShuffleServicePathUndefined: Self = StObject.set(x, "shuffleServicePath", js.undefined)
    
    inline def setTempStoragePrefix(value: String): Self = StObject.set(x, "tempStoragePrefix", value.asInstanceOf[js.Any])
    
    inline def setTempStoragePrefixUndefined: Self = StObject.set(x, "tempStoragePrefix", js.undefined)
    
    inline def setWorkerId(value: String): Self = StObject.set(x, "workerId", value.asInstanceOf[js.Any])
    
    inline def setWorkerIdUndefined: Self = StObject.set(x, "workerId", js.undefined)
  }
}
