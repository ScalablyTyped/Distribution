package typings.jweixin.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Resouce extends StObject {
  
  var localId: String
}
object Resouce {
  
  inline def apply(localId: String): Resouce = {
    val __obj = js.Dynamic.literal(localId = localId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resouce]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Resouce] (val x: Self) extends AnyVal {
    
    inline def setLocalId(value: String): Self = StObject.set(x, "localId", value.asInstanceOf[js.Any])
  }
}
