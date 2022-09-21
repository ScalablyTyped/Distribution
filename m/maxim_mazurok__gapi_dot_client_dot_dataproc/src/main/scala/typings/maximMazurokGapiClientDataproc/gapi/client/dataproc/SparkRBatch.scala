package typings.maximMazurokGapiClientDataproc.gapi.client.dataproc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SparkRBatch extends StObject {
  
  /** Optional. HCFS URIs of archives to be extracted into the working directory of each executor. Supported file types: .jar, .tar, .tar.gz, .tgz, and .zip. */
  var archiveUris: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Optional. The arguments to pass to the Spark driver. Do not include arguments that can be set as batch properties, such as --conf, since a collision can occur that causes an
    * incorrect batch submission.
    */
  var args: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Optional. HCFS URIs of files to be placed in the working directory of each executor. */
  var fileUris: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Required. The HCFS URI of the main R file to use as the driver. Must be a .R or .r file. */
  var mainRFileUri: js.UndefOr[String] = js.undefined
}
object SparkRBatch {
  
  inline def apply(): SparkRBatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SparkRBatch]
  }
  
  extension [Self <: SparkRBatch](x: Self) {
    
    inline def setArchiveUris(value: js.Array[String]): Self = StObject.set(x, "archiveUris", value.asInstanceOf[js.Any])
    
    inline def setArchiveUrisUndefined: Self = StObject.set(x, "archiveUris", js.undefined)
    
    inline def setArchiveUrisVarargs(value: String*): Self = StObject.set(x, "archiveUris", js.Array(value*))
    
    inline def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    inline def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value*))
    
    inline def setFileUris(value: js.Array[String]): Self = StObject.set(x, "fileUris", value.asInstanceOf[js.Any])
    
    inline def setFileUrisUndefined: Self = StObject.set(x, "fileUris", js.undefined)
    
    inline def setFileUrisVarargs(value: String*): Self = StObject.set(x, "fileUris", js.Array(value*))
    
    inline def setMainRFileUri(value: String): Self = StObject.set(x, "mainRFileUri", value.asInstanceOf[js.Any])
    
    inline def setMainRFileUriUndefined: Self = StObject.set(x, "mainRFileUri", js.undefined)
  }
}
