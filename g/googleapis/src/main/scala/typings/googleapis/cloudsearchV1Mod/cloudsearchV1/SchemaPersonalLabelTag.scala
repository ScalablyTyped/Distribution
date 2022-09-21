package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPersonalLabelTag extends StObject {
  
  /**
    * A string ID representing the label. Possible ID values are documented at go/chat-labels-howto:ids. Examples: "^t" for "Starred", "^nu" for "Nudged".
    */
  var labelId: js.UndefOr[String | Null] = js.undefined
}
object SchemaPersonalLabelTag {
  
  inline def apply(): SchemaPersonalLabelTag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPersonalLabelTag]
  }
  
  extension [Self <: SchemaPersonalLabelTag](x: Self) {
    
    inline def setLabelId(value: String): Self = StObject.set(x, "labelId", value.asInstanceOf[js.Any])
    
    inline def setLabelIdNull: Self = StObject.set(x, "labelId", null)
    
    inline def setLabelIdUndefined: Self = StObject.set(x, "labelId", js.undefined)
  }
}
