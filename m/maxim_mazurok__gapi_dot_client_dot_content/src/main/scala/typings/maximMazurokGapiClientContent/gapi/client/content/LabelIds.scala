package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LabelIds extends StObject {
  
  /** The list of label IDs. */
  var labelIds: js.UndefOr[js.Array[String]] = js.undefined
}
object LabelIds {
  
  inline def apply(): LabelIds = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelIds]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LabelIds] (val x: Self) extends AnyVal {
    
    inline def setLabelIds(value: js.Array[String]): Self = StObject.set(x, "labelIds", value.asInstanceOf[js.Any])
    
    inline def setLabelIdsUndefined: Self = StObject.set(x, "labelIds", js.undefined)
    
    inline def setLabelIdsVarargs(value: String*): Self = StObject.set(x, "labelIds", js.Array(value*))
  }
}
