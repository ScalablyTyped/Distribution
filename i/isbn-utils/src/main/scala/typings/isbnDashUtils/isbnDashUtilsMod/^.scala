package typings.isbnDashUtils.isbnDashUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("isbn-utils", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def asIsbn10(isbn: String): String = js.native
  def asIsbn10(isbn: String, hyphenate: Boolean): String = js.native
  def asIsbn13(isbn: String): String = js.native
  def asIsbn13(isbn: String, hyphenate: Boolean): String = js.native
  def hyphenate(isbn: String): String = js.native
  def isValid(isbn: String): Boolean = js.native
  def isValid(isbn: String, groups: IGroups): Boolean = js.native
  def parse(isbn: String): ISBN | Null = js.native
  def parse(isbn: String, groups: IGroups): ISBN | Null = js.native
}

