package typings.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data to pass through to the worker harness.
  */
@js.native
trait SchemaWorkerSettings extends js.Object {
  
  /**
    * The base URL for accessing Google Cloud APIs.  When workers access Google
    * Cloud APIs, they logically do so via relative URLs.  If this field is
    * specified, it supplies the base URL to use for resolving these relative
    * URLs.  The normative algorithm used is defined by RFC 1808,
    * &quot;Relative Uniform Resource Locators&quot;.  If not specified, the
    * default value is &quot;http://www.googleapis.com/&quot;
    */
  var baseUrl: js.UndefOr[String] = js.native
  
  /**
    * Whether to send work progress updates to the service.
    */
  var reportingEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * The Cloud Dataflow service path relative to the root URL, for example,
    * &quot;dataflow/v1b3/projects&quot;.
    */
  var servicePath: js.UndefOr[String] = js.native
  
  /**
    * The Shuffle service path relative to the root URL, for example,
    * &quot;shuffle/v1beta1&quot;.
    */
  var shuffleServicePath: js.UndefOr[String] = js.native
  
  /**
    * The prefix of the resources the system should use for temporary storage.
    * The supported resource type is:  Google Cloud Storage:
    * storage.googleapis.com/{bucket}/{object}
    * bucket.storage.googleapis.com/{object}
    */
  var tempStoragePrefix: js.UndefOr[String] = js.native
  
  /**
    * The ID of the worker running this pipeline.
    */
  var workerId: js.UndefOr[String] = js.native
}
object SchemaWorkerSettings {
  
  @scala.inline
  def apply(): SchemaWorkerSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWorkerSettings]
  }
  
  @scala.inline
  implicit class SchemaWorkerSettingsOps[Self <: SchemaWorkerSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBaseUrl(value: String): Self = this.set("baseUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaseUrl: Self = this.set("baseUrl", js.undefined)
    
    @scala.inline
    def setReportingEnabled(value: Boolean): Self = this.set("reportingEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReportingEnabled: Self = this.set("reportingEnabled", js.undefined)
    
    @scala.inline
    def setServicePath(value: String): Self = this.set("servicePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServicePath: Self = this.set("servicePath", js.undefined)
    
    @scala.inline
    def setShuffleServicePath(value: String): Self = this.set("shuffleServicePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShuffleServicePath: Self = this.set("shuffleServicePath", js.undefined)
    
    @scala.inline
    def setTempStoragePrefix(value: String): Self = this.set("tempStoragePrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTempStoragePrefix: Self = this.set("tempStoragePrefix", js.undefined)
    
    @scala.inline
    def setWorkerId(value: String): Self = this.set("workerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkerId: Self = this.set("workerId", js.undefined)
  }
}
