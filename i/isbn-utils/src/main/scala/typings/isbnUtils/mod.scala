package typings.isbnUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("isbn-utils", "ISBN")
  @js.native
  class ISBN protected () extends StObject {
    def this(`val`: String, groups: IGroups) = this()
    
    def asIsbn10(): String = js.native
    def asIsbn10(hyphenate: Boolean): String = js.native
    
    def asIsbn13(): String = js.native
    def asIsbn13(hyphenate: Boolean): String = js.native
    
    var codes: ISBNcodes = js.native
    
    def isIsbn10(): Boolean = js.native
    
    def isIsbn13(): Boolean = js.native
    
    def isValid(): Boolean = js.native
  }
  
  @JSImport("isbn-utils", "ISBNcodes")
  @js.native
  class ISBNcodes () extends StObject {
    
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
  
  @JSImport("isbn-utils", "asIsbn10")
  @js.native
  def asIsbn10(isbn: String): String = js.native
  @JSImport("isbn-utils", "asIsbn10")
  @js.native
  def asIsbn10(isbn: String, hyphenate: Boolean): String = js.native
  
  @JSImport("isbn-utils", "asIsbn13")
  @js.native
  def asIsbn13(isbn: String): String = js.native
  @JSImport("isbn-utils", "asIsbn13")
  @js.native
  def asIsbn13(isbn: String, hyphenate: Boolean): String = js.native
  
  @JSImport("isbn-utils", "hyphenate")
  @js.native
  def hyphenate(isbn: String): String = js.native
  
  @JSImport("isbn-utils", "isValid")
  @js.native
  def isValid(isbn: String): Boolean = js.native
  @JSImport("isbn-utils", "isValid")
  @js.native
  def isValid(isbn: String, groups: IGroups): Boolean = js.native
  
  @JSImport("isbn-utils", "parse")
  @js.native
  def parse(isbn: String): ISBN | Null = js.native
  @JSImport("isbn-utils", "parse")
  @js.native
  def parse(isbn: String, groups: IGroups): ISBN | Null = js.native
  
  type IGroups = js.Any
}
