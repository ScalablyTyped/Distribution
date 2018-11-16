package typings
package isbnDashUtilsLib.isbnDashUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("isbn-utils", "ISBN")
@js.native
class ISBN protected () extends js.Object {
  def this(`val`: java.lang.String, groups: IGroups) = this()
  var codes: ISBNcodes = js.native
  def asIsbn10(): java.lang.String = js.native
  def asIsbn10(hyphenate: scala.Boolean): java.lang.String = js.native
  def asIsbn13(): java.lang.String = js.native
  def asIsbn13(hyphenate: scala.Boolean): java.lang.String = js.native
  def isIsbn10(): scala.Boolean = js.native
  def isIsbn13(): scala.Boolean = js.native
  def isValid(): scala.Boolean = js.native
}

