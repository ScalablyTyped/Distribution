package typings.googleapis.scriptV1Mod.scriptV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaContent extends StObject {
  
  /**
    * The list of script project files. One of the files is a script manifest; it must be named "appsscript", must have type of JSON, and include the manifest configurations for the project.
    */
  var files: js.UndefOr[js.Array[SchemaFile]] = js.undefined
  
  /**
    * The script project's Drive ID.
    */
  var scriptId: js.UndefOr[String | Null] = js.undefined
}
object SchemaContent {
  
  inline def apply(): SchemaContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaContent]
  }
  
  extension [Self <: SchemaContent](x: Self) {
    
    inline def setFiles(value: js.Array[SchemaFile]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
    
    inline def setFilesVarargs(value: SchemaFile*): Self = StObject.set(x, "files", js.Array(value*))
    
    inline def setScriptId(value: String): Self = StObject.set(x, "scriptId", value.asInstanceOf[js.Any])
    
    inline def setScriptIdNull: Self = StObject.set(x, "scriptId", null)
    
    inline def setScriptIdUndefined: Self = StObject.set(x, "scriptId", js.undefined)
  }
}
