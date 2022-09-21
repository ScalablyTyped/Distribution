package typings.googleapis.dataprocV1Mod.dataprocV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSparkBatch extends StObject {
  
  /**
    * Optional. HCFS URIs of archives to be extracted into the working directory of each executor. Supported file types: .jar, .tar, .tar.gz, .tgz, and .zip.
    */
  var archiveUris: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Optional. The arguments to pass to the driver. Do not include arguments that can be set as batch properties, such as --conf, since a collision can occur that causes an incorrect batch submission.
    */
  var args: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Optional. HCFS URIs of files to be placed in the working directory of each executor.
    */
  var fileUris: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Optional. HCFS URIs of jar files to add to the classpath of the Spark driver and tasks.
    */
  var jarFileUris: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Optional. The name of the driver main class. The jar file that contains the class must be in the classpath or specified in jar_file_uris.
    */
  var mainClass: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. The HCFS URI of the jar file that contains the main class.
    */
  var mainJarFileUri: js.UndefOr[String | Null] = js.undefined
}
object SchemaSparkBatch {
  
  inline def apply(): SchemaSparkBatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSparkBatch]
  }
  
  extension [Self <: SchemaSparkBatch](x: Self) {
    
    inline def setArchiveUris(value: js.Array[String]): Self = StObject.set(x, "archiveUris", value.asInstanceOf[js.Any])
    
    inline def setArchiveUrisNull: Self = StObject.set(x, "archiveUris", null)
    
    inline def setArchiveUrisUndefined: Self = StObject.set(x, "archiveUris", js.undefined)
    
    inline def setArchiveUrisVarargs(value: String*): Self = StObject.set(x, "archiveUris", js.Array(value*))
    
    inline def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsNull: Self = StObject.set(x, "args", null)
    
    inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    inline def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value*))
    
    inline def setFileUris(value: js.Array[String]): Self = StObject.set(x, "fileUris", value.asInstanceOf[js.Any])
    
    inline def setFileUrisNull: Self = StObject.set(x, "fileUris", null)
    
    inline def setFileUrisUndefined: Self = StObject.set(x, "fileUris", js.undefined)
    
    inline def setFileUrisVarargs(value: String*): Self = StObject.set(x, "fileUris", js.Array(value*))
    
    inline def setJarFileUris(value: js.Array[String]): Self = StObject.set(x, "jarFileUris", value.asInstanceOf[js.Any])
    
    inline def setJarFileUrisNull: Self = StObject.set(x, "jarFileUris", null)
    
    inline def setJarFileUrisUndefined: Self = StObject.set(x, "jarFileUris", js.undefined)
    
    inline def setJarFileUrisVarargs(value: String*): Self = StObject.set(x, "jarFileUris", js.Array(value*))
    
    inline def setMainClass(value: String): Self = StObject.set(x, "mainClass", value.asInstanceOf[js.Any])
    
    inline def setMainClassNull: Self = StObject.set(x, "mainClass", null)
    
    inline def setMainClassUndefined: Self = StObject.set(x, "mainClass", js.undefined)
    
    inline def setMainJarFileUri(value: String): Self = StObject.set(x, "mainJarFileUri", value.asInstanceOf[js.Any])
    
    inline def setMainJarFileUriNull: Self = StObject.set(x, "mainJarFileUri", null)
    
    inline def setMainJarFileUriUndefined: Self = StObject.set(x, "mainJarFileUri", js.undefined)
  }
}
