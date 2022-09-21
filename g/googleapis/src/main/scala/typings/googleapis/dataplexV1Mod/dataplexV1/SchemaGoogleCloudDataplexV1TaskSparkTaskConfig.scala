package typings.googleapis.dataplexV1Mod.dataplexV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDataplexV1TaskSparkTaskConfig extends StObject {
  
  /**
    * Optional. Cloud Storage URIs of archives to be extracted into the working directory of each executor. Supported file types: .jar, .tar, .tar.gz, .tgz, and .zip.
    */
  var archiveUris: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Optional. Cloud Storage URIs of files to be placed in the working directory of each executor.
    */
  var fileUris: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Optional. Infrastructure specification for the execution.
    */
  var infrastructureSpec: js.UndefOr[SchemaGoogleCloudDataplexV1TaskInfrastructureSpec] = js.undefined
  
  /**
    * The name of the driver's main class. The jar file that contains the class must be in the default CLASSPATH or specified in jar_file_uris. The execution args are passed in as a sequence of named process arguments (--key=value).
    */
  var mainClass: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The Cloud Storage URI of the jar file that contains the main class. The execution args are passed in as a sequence of named process arguments (--key=value).
    */
  var mainJarFileUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The Gcloud Storage URI of the main Python file to use as the driver. Must be a .py file. The execution args are passed in as a sequence of named process arguments (--key=value).
    */
  var pythonScriptFile: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The query text. The execution args are used to declare a set of script variables (set key="value";).
    */
  var sqlScript: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A reference to a query file. This can be the Cloud Storage URI of the query file or it can the path to a SqlScript Content. The execution args are used to declare a set of script variables (set key="value";).
    */
  var sqlScriptFile: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDataplexV1TaskSparkTaskConfig {
  
  inline def apply(): SchemaGoogleCloudDataplexV1TaskSparkTaskConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDataplexV1TaskSparkTaskConfig]
  }
  
  extension [Self <: SchemaGoogleCloudDataplexV1TaskSparkTaskConfig](x: Self) {
    
    inline def setArchiveUris(value: js.Array[String]): Self = StObject.set(x, "archiveUris", value.asInstanceOf[js.Any])
    
    inline def setArchiveUrisNull: Self = StObject.set(x, "archiveUris", null)
    
    inline def setArchiveUrisUndefined: Self = StObject.set(x, "archiveUris", js.undefined)
    
    inline def setArchiveUrisVarargs(value: String*): Self = StObject.set(x, "archiveUris", js.Array(value*))
    
    inline def setFileUris(value: js.Array[String]): Self = StObject.set(x, "fileUris", value.asInstanceOf[js.Any])
    
    inline def setFileUrisNull: Self = StObject.set(x, "fileUris", null)
    
    inline def setFileUrisUndefined: Self = StObject.set(x, "fileUris", js.undefined)
    
    inline def setFileUrisVarargs(value: String*): Self = StObject.set(x, "fileUris", js.Array(value*))
    
    inline def setInfrastructureSpec(value: SchemaGoogleCloudDataplexV1TaskInfrastructureSpec): Self = StObject.set(x, "infrastructureSpec", value.asInstanceOf[js.Any])
    
    inline def setInfrastructureSpecUndefined: Self = StObject.set(x, "infrastructureSpec", js.undefined)
    
    inline def setMainClass(value: String): Self = StObject.set(x, "mainClass", value.asInstanceOf[js.Any])
    
    inline def setMainClassNull: Self = StObject.set(x, "mainClass", null)
    
    inline def setMainClassUndefined: Self = StObject.set(x, "mainClass", js.undefined)
    
    inline def setMainJarFileUri(value: String): Self = StObject.set(x, "mainJarFileUri", value.asInstanceOf[js.Any])
    
    inline def setMainJarFileUriNull: Self = StObject.set(x, "mainJarFileUri", null)
    
    inline def setMainJarFileUriUndefined: Self = StObject.set(x, "mainJarFileUri", js.undefined)
    
    inline def setPythonScriptFile(value: String): Self = StObject.set(x, "pythonScriptFile", value.asInstanceOf[js.Any])
    
    inline def setPythonScriptFileNull: Self = StObject.set(x, "pythonScriptFile", null)
    
    inline def setPythonScriptFileUndefined: Self = StObject.set(x, "pythonScriptFile", js.undefined)
    
    inline def setSqlScript(value: String): Self = StObject.set(x, "sqlScript", value.asInstanceOf[js.Any])
    
    inline def setSqlScriptFile(value: String): Self = StObject.set(x, "sqlScriptFile", value.asInstanceOf[js.Any])
    
    inline def setSqlScriptFileNull: Self = StObject.set(x, "sqlScriptFile", null)
    
    inline def setSqlScriptFileUndefined: Self = StObject.set(x, "sqlScriptFile", js.undefined)
    
    inline def setSqlScriptNull: Self = StObject.set(x, "sqlScript", null)
    
    inline def setSqlScriptUndefined: Self = StObject.set(x, "sqlScript", js.undefined)
  }
}
