package typings.jest.mod.jest

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InverseAsymmetricMatchers extends js.Object {
  /**
    * `expect.not.arrayContaining(array)` matches a received array which
    * does not contain all of the elements in the expected array. That is,
    * the expected array is not a subset of the received array. It is the
    * inverse of `expect.arrayContaining`.
    *
    * Optionally, you can provide a type for the elements via a generic.
    */
  // tslint:disable-next-line: no-unnecessary-generics
  def arrayContaining[E](arr: js.Array[E]): js.Any = js.native
  /**
    * `expect.not.objectContaining(object)` matches any received object
    * that does not recursively match the expected properties. That is, the
    * expected object is not a subset of the received object. Therefore,
    * it matches a received object which contains properties that are not
    * in the expected object. It is the inverse of `expect.objectContaining`.
    *
    * Optionally, you can provide a type for the object via a generic.
    * This ensures that the object contains the desired structure.
    */
  // tslint:disable-next-line: no-unnecessary-generics
  def objectContaining[E](obj: E): js.Any = js.native
  /**
    * `expect.not.stringContaining(string)` matches the received string
    * that does not contain the exact expected string. It is the inverse of
    * `expect.stringContaining`.
    */
  def stringContaining(str: String): js.Any = js.native
  /**
    * `expect.not.stringMatching(string | regexp)` matches the received
    * string that does not match the expected regexp. It is the inverse of
    * `expect.stringMatching`.
    */
  def stringMatching(str: String): js.Any = js.native
  def stringMatching(str: RegExp): js.Any = js.native
}

