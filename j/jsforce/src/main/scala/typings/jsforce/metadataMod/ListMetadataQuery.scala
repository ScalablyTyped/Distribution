package typings.jsforce.metadataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListMetadataQuery extends StObject {
  
  var folder: js.UndefOr[String] = js.native
  
  var `type`: String = js.native
}
object ListMetadataQuery {
  
  @scala.inline
  def apply(`type`: String): ListMetadataQuery = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListMetadataQuery]
  }
  
  @scala.inline
  implicit class ListMetadataQueryMutableBuilder[Self <: ListMetadataQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFolder(value: String): Self = StObject.set(x, "folder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFolderUndefined: Self = StObject.set(x, "folder", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
