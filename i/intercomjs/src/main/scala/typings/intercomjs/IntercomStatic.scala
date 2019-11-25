package typings.intercomjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntercomStatic extends js.Object {
  /**
    * Removes all data associated with intercom from localStorage.
    */
  def destroy(): Unit
  /**
    * Returns an instance of Intercom. If one doesn't exist, it will be instantiated.
    * @return an instance of Intercom.
    */
  def getInstance(): typings.intercomjs.intercom.Intercom
}

object IntercomStatic {
  @scala.inline
  def apply(destroy: () => Unit, getInstance: () => typings.intercomjs.intercom.Intercom): IntercomStatic = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), getInstance = js.Any.fromFunction0(getInstance))
  
    __obj.asInstanceOf[IntercomStatic]
  }
}

