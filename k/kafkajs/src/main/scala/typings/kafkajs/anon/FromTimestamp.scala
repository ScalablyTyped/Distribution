package typings.kafkajs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FromTimestamp extends StObject {
  
  var fromTimestamp: Double
}
object FromTimestamp {
  
  inline def apply(fromTimestamp: Double): FromTimestamp = {
    val __obj = js.Dynamic.literal(fromTimestamp = fromTimestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[FromTimestamp]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FromTimestamp] (val x: Self) extends AnyVal {
    
    inline def setFromTimestamp(value: Double): Self = StObject.set(x, "fromTimestamp", value.asInstanceOf[js.Any])
  }
}
