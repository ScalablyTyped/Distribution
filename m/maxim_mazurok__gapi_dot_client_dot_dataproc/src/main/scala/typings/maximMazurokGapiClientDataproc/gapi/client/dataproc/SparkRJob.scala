package typings.maximMazurokGapiClientDataproc.gapi.client.dataproc

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SparkRJob extends StObject {
  
  /** Optional. HCFS URIs of archives to be extracted into the working directory of each executor. Supported file types: .jar, .tar, .tar.gz, .tgz, and .zip. */
  var archiveUris: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Optional. The arguments to pass to the driver. Do not include arguments, such as --conf, that can be set as job properties, since a collision may occur that causes an incorrect job
    * submission.
    */
  var args: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Optional. HCFS URIs of files to be placed in the working directory of each executor. Useful for naively parallel tasks. */
  var fileUris: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Optional. The runtime log config for job execution. */
  var loggingConfig: js.UndefOr[LoggingConfig] = js.undefined
  
  /** Required. The HCFS URI of the main R file to use as the driver. Must be a .R file. */
  var mainRFileUri: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. A mapping of property names to values, used to configure SparkR. Properties that conflict with values set by the Dataproc API may be overwritten. Can include properties
    * set in /etc/spark/conf/spark-defaults.conf and classes in user code.
    */
  var properties: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientDataproc.maximMazurokGapiClientDataprocStrings.SparkRJob & TopLevel[js.Any]
  ] = js.undefined
}
object SparkRJob {
  
  @scala.inline
  def apply(): SparkRJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SparkRJob]
  }
  
  @scala.inline
  implicit class SparkRJobMutableBuilder[Self <: SparkRJob] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArchiveUris(value: js.Array[String]): Self = StObject.set(x, "archiveUris", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArchiveUrisUndefined: Self = StObject.set(x, "archiveUris", js.undefined)
    
    @scala.inline
    def setArchiveUrisVarargs(value: String*): Self = StObject.set(x, "archiveUris", js.Array(value :_*))
    
    @scala.inline
    def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    @scala.inline
    def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value :_*))
    
    @scala.inline
    def setFileUris(value: js.Array[String]): Self = StObject.set(x, "fileUris", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileUrisUndefined: Self = StObject.set(x, "fileUris", js.undefined)
    
    @scala.inline
    def setFileUrisVarargs(value: String*): Self = StObject.set(x, "fileUris", js.Array(value :_*))
    
    @scala.inline
    def setLoggingConfig(value: LoggingConfig): Self = StObject.set(x, "loggingConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoggingConfigUndefined: Self = StObject.set(x, "loggingConfig", js.undefined)
    
    @scala.inline
    def setMainRFileUri(value: String): Self = StObject.set(x, "mainRFileUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMainRFileUriUndefined: Self = StObject.set(x, "mainRFileUri", js.undefined)
    
    @scala.inline
    def setProperties(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientDataproc.maximMazurokGapiClientDataprocStrings.SparkRJob & TopLevel[js.Any]
    ): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
  }
}
