package typings.ldapFilters

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ldap-filters", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def AND(filters: js.Array[Filter]): Group = ^.asInstanceOf[js.Dynamic].applyDynamic("AND")(filters.asInstanceOf[js.Any]).asInstanceOf[Group]
  
  inline def NOT(filter: Filter): GroupNot = ^.asInstanceOf[js.Dynamic].applyDynamic("NOT")(filter.asInstanceOf[js.Any]).asInstanceOf[GroupNot]
  
  inline def OR(filters: js.Array[Filter]): Group = ^.asInstanceOf[js.Dynamic].applyDynamic("OR")(filters.asInstanceOf[js.Any]).asInstanceOf[Group]
  
  inline def attribute(name: String): Attribute_ = ^.asInstanceOf[js.Dynamic].applyDynamic("attribute")(name.asInstanceOf[js.Any]).asInstanceOf[Attribute_]
  
  @JSImport("ldap-filters", "collapse_not")
  @js.native
  def collapseNot: Boolean = js.native
  
  inline def collapseNot_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("collapse_not")(x.asInstanceOf[js.Any])
  
  inline def escape(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escape")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("ldap-filters", "escape_chars")
  @js.native
  def escapeChars: js.Array[String] = js.native
  
  inline def escapeChars_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("escape_chars")(x.asInstanceOf[js.Any])
  
  @JSImport("ldap-filters", "indent")
  @js.native
  def indent: Double = js.native
  
  @JSImport("ldap-filters", "indent_char")
  @js.native
  def indentChar: String = js.native
  
  inline def indentChar_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("indent_char")(x.asInstanceOf[js.Any])
  
  inline def indent_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("indent")(x.asInstanceOf[js.Any])
  
  inline def matchApprox(data: String, filter: Filter): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("matchApprox")(data.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def matchApprox(data: js.Array[String], filter: Filter): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("matchApprox")(data.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def matchGTE(data: String, filter: Filter): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("matchGTE")(data.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def matchGTE(data: js.Array[String], filter: Filter): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("matchGTE")(data.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def matchLTE(data: String, filter: Filter): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("matchLTE")(data.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def matchLTE(data: js.Array[String], filter: Filter): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("matchLTE")(data.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def matchString(data: String, filter: Filter): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("matchString")(data.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def matchString(data: js.Array[String], filter: Filter): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("matchString")(data.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def matchSubstring(data: String, filter: Filter): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("matchSubstring")(data.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def matchSubstring(data: js.Array[String], filter: Filter): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("matchSubstring")(data.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def parse(input: String): Filter = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any]).asInstanceOf[Filter]
  
  inline def unescape(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("unescape")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait Attribute_ extends StObject {
    
    def approx(value: String): Filter
    
    def contains(value: String): Filter
    
    def endsWith(value: String): Filter
    
    def equalTo(value: String): Filter
    
    def escape(value: String): String
    
    var escapeChars: js.Array[String]
    
    def gte(value: String): Filter
    
    def lte(value: String): Filter
    
    var name: String
    
    def present(): Filter
    
    def raw(value: String): Filter
    
    def startsWith(value: String): Filter
  }
  object Attribute_ {
    
    inline def apply(
      approx: String => Filter,
      contains: String => Filter,
      endsWith: String => Filter,
      equalTo: String => Filter,
      escape: String => String,
      escapeChars: js.Array[String],
      gte: String => Filter,
      lte: String => Filter,
      name: String,
      present: () => Filter,
      raw: String => Filter,
      startsWith: String => Filter
    ): Attribute_ = {
      val __obj = js.Dynamic.literal(approx = js.Any.fromFunction1(approx), contains = js.Any.fromFunction1(contains), endsWith = js.Any.fromFunction1(endsWith), equalTo = js.Any.fromFunction1(equalTo), escape = js.Any.fromFunction1(escape), escapeChars = escapeChars.asInstanceOf[js.Any], gte = js.Any.fromFunction1(gte), lte = js.Any.fromFunction1(lte), name = name.asInstanceOf[js.Any], present = js.Any.fromFunction0(present), raw = js.Any.fromFunction1(raw), startsWith = js.Any.fromFunction1(startsWith))
      __obj.asInstanceOf[Attribute_]
    }
    
    extension [Self <: Attribute_](x: Self) {
      
      inline def setApprox(value: String => Filter): Self = StObject.set(x, "approx", js.Any.fromFunction1(value))
      
      inline def setContains(value: String => Filter): Self = StObject.set(x, "contains", js.Any.fromFunction1(value))
      
      inline def setEndsWith(value: String => Filter): Self = StObject.set(x, "endsWith", js.Any.fromFunction1(value))
      
      inline def setEqualTo(value: String => Filter): Self = StObject.set(x, "equalTo", js.Any.fromFunction1(value))
      
      inline def setEscape(value: String => String): Self = StObject.set(x, "escape", js.Any.fromFunction1(value))
      
      inline def setEscapeChars(value: js.Array[String]): Self = StObject.set(x, "escapeChars", value.asInstanceOf[js.Any])
      
      inline def setEscapeCharsVarargs(value: String*): Self = StObject.set(x, "escapeChars", js.Array(value :_*))
      
      inline def setGte(value: String => Filter): Self = StObject.set(x, "gte", js.Any.fromFunction1(value))
      
      inline def setLte(value: String => Filter): Self = StObject.set(x, "lte", js.Any.fromFunction1(value))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPresent(value: () => Filter): Self = StObject.set(x, "present", js.Any.fromFunction0(value))
      
      inline def setRaw(value: String => Filter): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
      
      inline def setStartsWith(value: String => Filter): Self = StObject.set(x, "startsWith", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Filter extends StObject {
    
    def `match`(data: js.Object): Boolean = js.native
    
    def simplify(): Filter = js.native
    
    def toString(indent: Boolean): String = js.native
    def toString(indent: Double): String = js.native
  }
  
  @js.native
  trait Group extends StObject {
    
    var comp: String = js.native
    
    var filters: js.Array[Filter] = js.native
    
    def `match`(data: js.Object): Boolean = js.native
    
    def toString(indent: Boolean): String = js.native
    def toString(indent: Double): String = js.native
    
    var `type`: String = js.native
  }
  
  @js.native
  trait GroupNot
    extends StObject
       with Group {
    
    def simplify(): Filter = js.native
  }
}
