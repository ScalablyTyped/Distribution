package typings
package isbnDashUtilsLib.isbnDashUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("isbn-utils", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def asIsbn10(isbn: java.lang.String): java.lang.String = js.native
  def asIsbn10(isbn: java.lang.String, hyphenate: scala.Boolean): java.lang.String = js.native
  def asIsbn13(isbn: java.lang.String): java.lang.String = js.native
  def asIsbn13(isbn: java.lang.String, hyphenate: scala.Boolean): java.lang.String = js.native
  def hyphenate(isbn: java.lang.String): java.lang.String = js.native
  def isValid(isbn: java.lang.String): scala.Boolean = js.native
  def isValid(isbn: java.lang.String, groups: IGroups): scala.Boolean = js.native
  def parse(isbn: java.lang.String): ISBN | scala.Null = js.native
  def parse(isbn: java.lang.String, groups: IGroups): ISBN | scala.Null = js.native
}

