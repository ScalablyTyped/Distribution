package typings.libp2pInterfaceDht.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RoutingTable extends StObject {
  
  var size: Double
}
object RoutingTable {
  
  inline def apply(size: Double): RoutingTable = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoutingTable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RoutingTable] (val x: Self) extends AnyVal {
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
