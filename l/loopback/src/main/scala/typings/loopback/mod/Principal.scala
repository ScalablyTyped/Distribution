package typings.loopback.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
class Principal protected () extends js.Object {
  def this(`type`: String, id: js.Any, name: String) = this()
  
  /**
    * Compare if two principals are equal
    * Returns true if argument principal is equal to this principal.
    * @param {any} p The other principa
    */
  def equals(p: js.Any): Unit = js.native
}
