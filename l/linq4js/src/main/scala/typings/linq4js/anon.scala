package typings.linq4js

import typings.linq4js.Linq4JS.OrderEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait GroupValue extends StObject {
    
    var GroupValue: Any
    
    var Order: Array[OrderEntry]
  }
  object GroupValue {
    
    inline def apply(GroupValue: Any, Order: Array[OrderEntry]): GroupValue = {
      val __obj = js.Dynamic.literal(GroupValue = GroupValue.asInstanceOf[js.Any], Order = Order.asInstanceOf[js.Any])
      __obj.asInstanceOf[GroupValue]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GroupValue] (val x: Self) extends AnyVal {
      
      inline def setGroupValue(value: Any): Self = StObject.set(x, "GroupValue", value.asInstanceOf[js.Any])
      
      inline def setOrder(value: Array[OrderEntry]): Self = StObject.set(x, "Order", value.asInstanceOf[js.Any])
    }
  }
}
