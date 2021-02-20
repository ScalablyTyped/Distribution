package typings.maximMazurokGapiClientArea120tables.gapi.client.area120tables

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LabeledItem extends StObject {
  
  /** Internal id associated with the item. */
  var id: js.UndefOr[String] = js.native
  
  /** Display string as entered by user. */
  var name: js.UndefOr[String] = js.native
}
object LabeledItem {
  
  @scala.inline
  def apply(): LabeledItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabeledItem]
  }
  
  @scala.inline
  implicit class LabeledItemMutableBuilder[Self <: LabeledItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
