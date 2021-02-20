package typings.intercomjs

import typings.intercomjs.intercom.Intercom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IntercomStatic extends StObject {
  
  /**
    * Removes all data associated with intercom from localStorage.
    */
  def destroy(): Unit = js.native
  
  /**
    * Returns an instance of Intercom. If one doesn't exist, it will be instantiated.
    * @return an instance of Intercom.
    */
  def getInstance(): Intercom = js.native
}
object IntercomStatic {
  
  @scala.inline
  def apply(destroy: () => Unit, getInstance: () => Intercom): IntercomStatic = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), getInstance = js.Any.fromFunction0(getInstance))
    __obj.asInstanceOf[IntercomStatic]
  }
  
  @scala.inline
  implicit class IntercomStaticMutableBuilder[Self <: IntercomStatic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetInstance(value: () => Intercom): Self = StObject.set(x, "getInstance", js.Any.fromFunction0(value))
  }
}
