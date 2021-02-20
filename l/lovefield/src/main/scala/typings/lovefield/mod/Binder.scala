package typings.lovefield.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Binder extends StObject {
  
  def getIndex(): Double = js.native
}
object Binder {
  
  @scala.inline
  def apply(getIndex: () => Double): Binder = {
    val __obj = js.Dynamic.literal(getIndex = js.Any.fromFunction0(getIndex))
    __obj.asInstanceOf[Binder]
  }
  
  @scala.inline
  implicit class BinderMutableBuilder[Self <: Binder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetIndex(value: () => Double): Self = StObject.set(x, "getIndex", js.Any.fromFunction0(value))
  }
}
