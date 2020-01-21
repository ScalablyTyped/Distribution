package typings.isbnUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("isbn-utils", JSImport.Namespace)
@js.native
object mod extends js.Object {
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
  
  @js.native
  class ISBNcodes () extends js.Object {
    val article: String = js.native
    val check: String = js.native
    val check10: String = js.native
    val check13: String = js.native
    val group: String = js.native
    val groupname: String = js.native
    val prefix: String = js.native
    val publisher: String = js.native
    val source: String = js.native
  }
  
  def asIsbn10(isbn: String): String = js.native
  def asIsbn10(isbn: String, hyphenate: Boolean): String = js.native
  def asIsbn13(isbn: String): String = js.native
  def asIsbn13(isbn: String, hyphenate: Boolean): String = js.native
  def hyphenate(isbn: String): String = js.native
  def isValid(isbn: String): Boolean = js.native
  def isValid(isbn: String, groups: IGroups): Boolean = js.native
  def parse(isbn: String): ISBN | Null = js.native
  def parse(isbn: String, groups: IGroups): ISBN | Null = js.native
  type IGroups = js.Any
}

