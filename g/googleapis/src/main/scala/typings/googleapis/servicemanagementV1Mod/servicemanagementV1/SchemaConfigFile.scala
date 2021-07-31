package typings.googleapis.servicemanagementV1Mod.servicemanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Generic specification of a source configuration file
  */
trait SchemaConfigFile extends StObject {
  
  /**
    * The bytes that constitute the file.
    */
  var fileContents: js.UndefOr[String] = js.undefined
  
  /**
    * The file name of the configuration file (full or relative path).
    */
  var filePath: js.UndefOr[String] = js.undefined
  
  /**
    * The type of configuration file this represents.
    */
  var fileType: js.UndefOr[String] = js.undefined
}
object SchemaConfigFile {
  
  @scala.inline
  def apply(): SchemaConfigFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConfigFile]
  }
  
  @scala.inline
  implicit class SchemaConfigFileMutableBuilder[Self <: SchemaConfigFile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFileContents(value: String): Self = StObject.set(x, "fileContents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileContentsUndefined: Self = StObject.set(x, "fileContents", js.undefined)
    
    @scala.inline
    def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilePathUndefined: Self = StObject.set(x, "filePath", js.undefined)
    
    @scala.inline
    def setFileType(value: String): Self = StObject.set(x, "fileType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileTypeUndefined: Self = StObject.set(x, "fileType", js.undefined)
  }
}
