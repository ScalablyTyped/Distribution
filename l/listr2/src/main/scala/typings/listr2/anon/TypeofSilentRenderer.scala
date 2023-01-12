package typings.listr2.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofSilentRenderer extends StObject {
  
  /** designates whether this renderer can output to a non-tty console */
  /* static member */
  var nonTTY: Boolean
}
object TypeofSilentRenderer {
  
  inline def apply(nonTTY: Boolean): TypeofSilentRenderer = {
    val __obj = js.Dynamic.literal(nonTTY = nonTTY.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofSilentRenderer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofSilentRenderer] (val x: Self) extends AnyVal {
    
    inline def setNonTTY(value: Boolean): Self = StObject.set(x, "nonTTY", value.asInstanceOf[js.Any])
  }
}
