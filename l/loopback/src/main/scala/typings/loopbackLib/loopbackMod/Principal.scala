package typings
package loopbackLib.loopbackMod

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
@JSImport("loopback", "Principal")
@js.native
class Principal protected ()
  extends loopbackLib.loopbackMod.lNs.Principal {
  def this(`type`: java.lang.String, id: js.Any, name: java.lang.String) = this()
  /**
               * Compare if two principals are equal
               * Returns true if argument principal is equal to this principal.
               * @param {any} p The other principa
               */
  /* CompleteClass */
  override def equals(p: js.Any): scala.Unit = js.native
}

