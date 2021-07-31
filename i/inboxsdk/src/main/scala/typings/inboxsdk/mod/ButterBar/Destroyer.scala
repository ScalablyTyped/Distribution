package typings.inboxsdk.mod.ButterBar

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Destroyer extends StObject {
  
  def destroy(): Unit
}
object Destroyer {
  
  @scala.inline
  def apply(destroy: () => Unit): Destroyer = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy))
    __obj.asInstanceOf[Destroyer]
  }
  
  @scala.inline
  implicit class DestroyerMutableBuilder[Self <: Destroyer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
  }
}
