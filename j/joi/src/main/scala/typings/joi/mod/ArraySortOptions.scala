package typings.joi.mod

import typings.joi.joiStrings.ascending
import typings.joi.joiStrings.descending
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArraySortOptions extends StObject {
  
  var by: js.UndefOr[String | Reference] = js.native
  
  /**
    * @default 'ascending'
    */
  var order: js.UndefOr[ascending | descending] = js.native
}
object ArraySortOptions {
  
  @scala.inline
  def apply(): ArraySortOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArraySortOptions]
  }
  
  @scala.inline
  implicit class ArraySortOptionsMutableBuilder[Self <: ArraySortOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBy(value: String | Reference): Self = StObject.set(x, "by", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setByUndefined: Self = StObject.set(x, "by", js.undefined)
    
    @scala.inline
    def setOrder(value: ascending | descending): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
  }
}
