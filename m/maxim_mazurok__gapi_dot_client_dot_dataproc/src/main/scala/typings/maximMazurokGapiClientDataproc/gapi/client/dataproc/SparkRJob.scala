package typings.maximMazurokGapiClientDataproc.gapi.client.dataproc

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SparkRJob extends js.Object {
  
  /** Optional. HCFS URIs of archives to be extracted into the working directory of each executor. Supported file types: .jar, .tar, .tar.gz, .tgz, and .zip. */
  var archiveUris: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Optional. The arguments to pass to the driver. Do not include arguments, such as --conf, that can be set as job properties, since a collision may occur that causes an incorrect job
    * submission.
    */
  var args: js.UndefOr[js.Array[String]] = js.native
  
  /** Optional. HCFS URIs of files to be placed in the working directory of each executor. Useful for naively parallel tasks. */
  var fileUris: js.UndefOr[js.Array[String]] = js.native
  
  /** Optional. The runtime log config for job execution. */
  var loggingConfig: js.UndefOr[LoggingConfig] = js.native
  
  /** Required. The HCFS URI of the main R file to use as the driver. Must be a .R file. */
  var mainRFileUri: js.UndefOr[String] = js.native
  
  /**
    * Optional. A mapping of property names to values, used to configure SparkR. Properties that conflict with values set by the Dataproc API may be overwritten. Can include properties
    * set in /etc/spark/conf/spark-defaults.conf and classes in user code.
    */
  var properties: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientDataproc.maximMazurokGapiClientDataprocStrings.SparkRJob with TopLevel[js.Any]
  ] = js.native
}
object SparkRJob {
  
  @scala.inline
  def apply(): SparkRJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SparkRJob]
  }
  
  @scala.inline
  implicit class SparkRJobOps[Self <: SparkRJob] (val x: Self) extends AnyVal {
    
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
    def setArchiveUrisVarargs(value: String*): Self = this.set("archiveUris", js.Array(value :_*))
    
    @scala.inline
    def setArchiveUris(value: js.Array[String]): Self = this.set("archiveUris", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArchiveUris: Self = this.set("archiveUris", js.undefined)
    
    @scala.inline
    def setArgsVarargs(value: String*): Self = this.set("args", js.Array(value :_*))
    
    @scala.inline
    def setArgs(value: js.Array[String]): Self = this.set("args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArgs: Self = this.set("args", js.undefined)
    
    @scala.inline
    def setFileUrisVarargs(value: String*): Self = this.set("fileUris", js.Array(value :_*))
    
    @scala.inline
    def setFileUris(value: js.Array[String]): Self = this.set("fileUris", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileUris: Self = this.set("fileUris", js.undefined)
    
    @scala.inline
    def setLoggingConfig(value: LoggingConfig): Self = this.set("loggingConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoggingConfig: Self = this.set("loggingConfig", js.undefined)
    
    @scala.inline
    def setMainRFileUri(value: String): Self = this.set("mainRFileUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMainRFileUri: Self = this.set("mainRFileUri", js.undefined)
    
    @scala.inline
    def setProperties(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientDataproc.maximMazurokGapiClientDataprocStrings.SparkRJob with TopLevel[js.Any]
    ): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
  }
}
