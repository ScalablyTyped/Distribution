package typings
package idsLib.idsMod

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
  def assigned(id: idsLib.ID): scala.Boolean = js.native
  /**
     * Manually claim an existing id.
     *
     * @param {String} id
     * @param {String} [element] element the id is claimed by
     */
  def claim(id: idsLib.ID): scala.Unit = js.native
  /**
     * Manually claim an existing id.
     *
     * @param {String} id
     * @param {String} [element] element the id is claimed by
     */
  def claim(id: idsLib.ID, element: js.Any): scala.Unit = js.native
  /**
     * Clear all claimed ids.
     */
  def clear(): scala.Unit = js.native
  /**
     * Generate a next id.
     *
     * @param {Object} [element] element to bind the id to
     *
     * @return {String} id
     */
  def next(): idsLib.ID = js.native
  /**
     * Generate a next id.
     *
     * @param {Object} [element] element to bind the id to
     *
     * @return {String} id
     */
  def next(element: js.Any): idsLib.ID = js.native
  /**
     * Generate a next id with a given prefix.
     *
     * @param {Object} [element] element to bind the id to
     *
     * @return {String} id
     */
  def nextPrefixed(prefix: java.lang.String): idsLib.ID = js.native
  /**
     * Generate a next id with a given prefix.
     *
     * @param {Object} [element] element to bind the id to
     *
     * @return {String} id
     */
  def nextPrefixed(prefix: java.lang.String, element: js.Any): idsLib.ID = js.native
  /**
     * Unclaim an id.
     *
     * @param  {String} id the id to unclaim
     */
  def unclaim(id: idsLib.ID): scala.Unit = js.native
}

