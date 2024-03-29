package typings.interactjsTypes.anon

import typings.interactjsTypes.coreTypesMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pending extends StObject {
  
  var pending: Point
  
  var total: Point
}
object Pending {
  
  inline def apply(pending: Point, total: Point): Pending = {
    val __obj = js.Dynamic.literal(pending = pending.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pending]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Pending] (val x: Self) extends AnyVal {
    
    inline def setPending(value: Point): Self = StObject.set(x, "pending", value.asInstanceOf[js.Any])
    
    inline def setTotal(value: Point): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
  }
}
