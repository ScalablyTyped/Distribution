package typings.googleapis.deploymentmanagerV2Mod.deploymentmanagerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaImportFile extends StObject {
  
  /**
    * The contents of the file.
    */
  var content: js.UndefOr[String] = js.native
  
  /**
    * The name of the file.
    */
  var name: js.UndefOr[String] = js.native
}
object SchemaImportFile {
  
  @scala.inline
  def apply(): SchemaImportFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaImportFile]
  }
  
  @scala.inline
  implicit class SchemaImportFileMutableBuilder[Self <: SchemaImportFile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
