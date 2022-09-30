package typings.hippyReact.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackAndroidRevoker extends StObject {
  
  def remove(): Unit
}
object BackAndroidRevoker {
  
  inline def apply(remove: () => Unit): BackAndroidRevoker = {
    val __obj = js.Dynamic.literal(remove = js.Any.fromFunction0(remove))
    __obj.asInstanceOf[BackAndroidRevoker]
  }
  
  extension [Self <: BackAndroidRevoker](x: Self) {
    
    inline def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
  }
}
