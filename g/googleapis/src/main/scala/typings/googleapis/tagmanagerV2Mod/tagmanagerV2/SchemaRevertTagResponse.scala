package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The result of reverting a tag in a workspace.
  */
trait SchemaRevertTagResponse extends StObject {
  
  /**
    * Tag as it appears in the latest container version since the last
    * workspace synchronization operation. If no tag is present, that means the
    * tag was deleted in the latest container version.
    */
  var tag: js.UndefOr[SchemaTag] = js.undefined
}
object SchemaRevertTagResponse {
  
  inline def apply(): SchemaRevertTagResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRevertTagResponse]
  }
  
  extension [Self <: SchemaRevertTagResponse](x: Self) {
    
    inline def setTag(value: SchemaTag): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
  }
}
