package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLabelIds extends StObject {
  
  /**
    * The list of label IDs.
    */
  var labelIds: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaLabelIds {
  
  inline def apply(): SchemaLabelIds = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLabelIds]
  }
  
  extension [Self <: SchemaLabelIds](x: Self) {
    
    inline def setLabelIds(value: js.Array[String]): Self = StObject.set(x, "labelIds", value.asInstanceOf[js.Any])
    
    inline def setLabelIdsNull: Self = StObject.set(x, "labelIds", null)
    
    inline def setLabelIdsUndefined: Self = StObject.set(x, "labelIds", js.undefined)
    
    inline def setLabelIdsVarargs(value: String*): Self = StObject.set(x, "labelIds", js.Array(value*))
  }
}
