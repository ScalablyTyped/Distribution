package typings.lovefield.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Binder extends StObject {
  
  def getIndex(): Double
}
object Binder {
  
  inline def apply(getIndex: () => Double): Binder = {
    val __obj = js.Dynamic.literal(getIndex = js.Any.fromFunction0(getIndex))
    __obj.asInstanceOf[Binder]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Binder] (val x: Self) extends AnyVal {
    
    inline def setGetIndex(value: () => Double): Self = StObject.set(x, "getIndex", js.Any.fromFunction0(value))
  }
}
