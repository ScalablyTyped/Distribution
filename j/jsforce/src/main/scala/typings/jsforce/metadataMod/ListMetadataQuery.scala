package typings.jsforce.metadataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListMetadataQuery extends StObject {
  
  var folder: js.UndefOr[String] = js.undefined
  
  var `type`: String
}
object ListMetadataQuery {
  
  inline def apply(`type`: String): ListMetadataQuery = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListMetadataQuery]
  }
  
  extension [Self <: ListMetadataQuery](x: Self) {
    
    inline def setFolder(value: String): Self = StObject.set(x, "folder", value.asInstanceOf[js.Any])
    
    inline def setFolderUndefined: Self = StObject.set(x, "folder", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
