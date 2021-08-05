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
  
  inline def apply(): SchemaListFoldersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListFoldersResponse]
  }
  
  extension [Self <: SchemaListFoldersResponse](x: Self) {
    
    inline def setFolders(value: js.Array[SchemaFolder]): Self = StObject.set(x, "folders", value.asInstanceOf[js.Any])
    
    inline def setFoldersUndefined: Self = StObject.set(x, "folders", js.undefined)
    
    inline def setFoldersVarargs(value: SchemaFolder*): Self = StObject.set(x, "folders", js.Array(value :_*))
  }
}
