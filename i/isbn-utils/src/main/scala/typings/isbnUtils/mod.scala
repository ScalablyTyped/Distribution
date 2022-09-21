package typings.isbnUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("isbn-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("isbn-utils", "ISBN")
  @js.native
  open class ISBN protected () extends StObject {
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
  open class ISBNcodes () extends StObject {
    
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
  
  inline def asIsbn10(isbn: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("asIsbn10")(isbn.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def asIsbn10(isbn: String, hyphenate: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("asIsbn10")(isbn.asInstanceOf[js.Any], hyphenate.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def asIsbn13(isbn: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("asIsbn13")(isbn.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def asIsbn13(isbn: String, hyphenate: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("asIsbn13")(isbn.asInstanceOf[js.Any], hyphenate.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def hyphenate(isbn: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hyphenate")(isbn.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def isValid(isbn: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValid")(isbn.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isValid(isbn: String, groups: IGroups): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isValid")(isbn.asInstanceOf[js.Any], groups.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def parse(isbn: String): ISBN | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(isbn.asInstanceOf[js.Any]).asInstanceOf[ISBN | Null]
  inline def parse(isbn: String, groups: IGroups): ISBN | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(isbn.asInstanceOf[js.Any], groups.asInstanceOf[js.Any])).asInstanceOf[ISBN | Null]
  
  type IGroups = Any
}
