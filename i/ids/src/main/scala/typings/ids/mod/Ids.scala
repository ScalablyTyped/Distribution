package typings.ids.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ids extends js.Object {
  /**
    * Returns true if the given id has already been assigned.
    *
    * @param  {String} id
    * @return {Boolean}
    */
  def assigned(id: ID): Boolean = js.native
  /**
    * Manually claim an existing id.
    *
    * @param {String} id
    * @param {String} [element] element the id is claimed by
    */
  def claim(id: ID): Unit = js.native
  def claim(id: ID, element: js.Any): Unit = js.native
  /**
    * Clear all claimed ids.
    */
  def clear(): Unit = js.native
  /**
    * Generate a next id.
    *
    * @param {Object} [element] element to bind the id to
    *
    * @return {String} id
    */
  def next(): ID = js.native
  def next(element: js.Any): ID = js.native
  /**
    * Generate a next id with a given prefix.
    *
    * @param {Object} [element] element to bind the id to
    *
    * @return {String} id
    */
  def nextPrefixed(prefix: String): ID = js.native
  def nextPrefixed(prefix: String, element: js.Any): ID = js.native
  /**
    * Unclaim an id.
    *
    * @param  {String} id the id to unclaim
    */
  def unclaim(id: ID): Unit = js.native
}

