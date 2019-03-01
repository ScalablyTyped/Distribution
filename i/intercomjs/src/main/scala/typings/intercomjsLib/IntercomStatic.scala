package typings
package intercomjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntercomStatic extends js.Object {
  /**
    * Removes all data associated with intercom from localStorage.
    */
  def destroy(): scala.Unit
  /**
    * Returns an instance of Intercom. If one doesn't exist, it will be instantiated.
    * @return an instance of Intercom.
    */
  def getInstance(): intercomjsLib.intercomNs.Intercom
}

object IntercomStatic {
  @scala.inline
  def apply(destroy: js.Function0[scala.Unit], getInstance: js.Function0[intercomjsLib.intercomNs.Intercom]): IntercomStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("destroy")(destroy)
    __obj.updateDynamic("getInstance")(getInstance)
    __obj.asInstanceOf[IntercomStatic]
  }
}

