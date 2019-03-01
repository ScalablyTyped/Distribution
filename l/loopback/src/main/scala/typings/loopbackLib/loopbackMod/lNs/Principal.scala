package typings
package loopbackLib.loopbackMod.lNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This class represents the abstract notion of a principal, which can be used
  * to represent any entity, such as an individual, a corporation, and a login id
  * @param {string} type The principal type
  * @param {*} id The princiapl id
  * @param {string} [name] The principal name
  * @returns {Principal}
  * @class
  */
trait Principal extends js.Object {
  /**
    * Compare if two principals are equal
    * Returns true if argument principal is equal to this principal.
    * @param {any} p The other principa
    */
  def equals(p: js.Any): scala.Unit
}

object Principal {
  @scala.inline
  def apply(equals: js.Function1[js.Any, scala.Unit]): Principal = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("equals")(equals)
    __obj.asInstanceOf[Principal]
  }
}

