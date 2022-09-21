package typings.loopback.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
open class Principal protected () extends StObject {
  def this(`type`: String, id: Any, name: String) = this()
}
