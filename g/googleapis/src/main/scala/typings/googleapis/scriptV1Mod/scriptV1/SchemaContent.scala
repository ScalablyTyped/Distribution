package typings.googleapis.scriptV1Mod.scriptV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Content resource.
  */
trait SchemaContent extends StObject {
  
  /**
    * The list of script project files. One of the files is a script manifest;
    * it must be named &quot;appsscript&quot;, must have type of JSON, and
    * include the manifest configurations for the project.
    */
  var files: js.UndefOr[js.Array[SchemaFile]] = js.undefined
  
  /**
    * The script project&#39;s Drive ID.
    */
  var scriptId: js.UndefOr[String] = js.undefined
}
object SchemaContent {
  
  @scala.inline
  def apply(): SchemaContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaContent]
  }
  
  @scala.inline
  implicit class SchemaContentMutableBuilder[Self <: SchemaContent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFiles(value: js.Array[SchemaFile]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
    
    @scala.inline
    def setFilesVarargs(value: SchemaFile*): Self = StObject.set(x, "files", js.Array(value :_*))
    
    @scala.inline
    def setScriptId(value: String): Self = StObject.set(x, "scriptId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScriptIdUndefined: Self = StObject.set(x, "scriptId", js.undefined)
  }
}
