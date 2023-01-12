package typings.hellosignSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Caninserteverywhere extends StObject {
  
  var can_insert_everywhere: Boolean
}
object Caninserteverywhere {
  
  inline def apply(can_insert_everywhere: Boolean): Caninserteverywhere = {
    val __obj = js.Dynamic.literal(can_insert_everywhere = can_insert_everywhere.asInstanceOf[js.Any])
    __obj.asInstanceOf[Caninserteverywhere]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Caninserteverywhere] (val x: Self) extends AnyVal {
    
    inline def setCan_insert_everywhere(value: Boolean): Self = StObject.set(x, "can_insert_everywhere", value.asInstanceOf[js.Any])
  }
}
