package typings.isbnDashUtils.isbnDashUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("isbn-utils", "ISBN")
@js.native
class ISBN protected () extends js.Object {
  def this(`val`: String, groups: IGroups) = this()
  var codes: ISBNcodes = js.native
  def asIsbn10(): String = js.native
  def asIsbn10(hyphenate: Boolean): String = js.native
  def asIsbn13(): String = js.native
  def asIsbn13(hyphenate: Boolean): String = js.native
  def isIsbn10(): Boolean = js.native
  def isIsbn13(): Boolean = js.native
  def isValid(): Boolean = js.native
}

