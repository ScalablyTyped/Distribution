package typings.googleapis.tagmanagerV1Mod.tagmanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * List Folders Response.
  */
trait SchemaListFoldersResponse extends StObject {
  
  /**
    * All GTM Folders of a GTM Container.
    */
  var folders: js.UndefOr[js.Array[SchemaFolder]] = js.undefined
}
object SchemaListFoldersResponse {
  
  @scala.inline
  def apply(): SchemaListFoldersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListFoldersResponse]
  }
  
  @scala.inline
  implicit class SchemaListFoldersResponseMutableBuilder[Self <: SchemaListFoldersResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFolders(value: js.Array[SchemaFolder]): Self = StObject.set(x, "folders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFoldersUndefined: Self = StObject.set(x, "folders", js.undefined)
    
    @scala.inline
    def setFoldersVarargs(value: SchemaFolder*): Self = StObject.set(x, "folders", js.Array(value :_*))
  }
}
