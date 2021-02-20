package typings.ldapFilters

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ldap-filters", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ldap-filters", "AND")
  @js.native
  def AND(filters: js.Array[Filter]): Group = js.native
  
  @JSImport("ldap-filters", "NOT")
  @js.native
  def NOT(filter: Filter): GroupNot = js.native
  
  @JSImport("ldap-filters", "OR")
  @js.native
  def OR(filters: js.Array[Filter]): Group = js.native
  
  @JSImport("ldap-filters", "attribute")
  @js.native
  def attribute(name: String): Attribute_ = js.native
  
  @JSImport("ldap-filters", "collapse_not")
  @js.native
  def collapseNot: Boolean = js.native
  
  @scala.inline
  def collapseNot_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("collapse_not")(x.asInstanceOf[js.Any])
  
  @JSImport("ldap-filters", "escape")
  @js.native
  def escape(value: String): String = js.native
  
  @JSImport("ldap-filters", "escape_chars")
  @js.native
  def escapeChars: js.Array[String] = js.native
  
  @scala.inline
  def escapeChars_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("escape_chars")(x.asInstanceOf[js.Any])
  
  @JSImport("ldap-filters", "indent")
  @js.native
  def indent: Double = js.native
  
  @JSImport("ldap-filters", "indent_char")
  @js.native
  def indentChar: String = js.native
  
  @scala.inline
  def indentChar_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("indent_char")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def indent_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("indent")(x.asInstanceOf[js.Any])
  
  @JSImport("ldap-filters", "matchApprox")
  @js.native
  def matchApprox(data: String, filter: Filter): Boolean = js.native
  @JSImport("ldap-filters", "matchApprox")
  @js.native
  def matchApprox(data: js.Array[String], filter: Filter): Boolean = js.native
  
  @JSImport("ldap-filters", "matchGTE")
  @js.native
  def matchGTE(data: String, filter: Filter): Boolean = js.native
  @JSImport("ldap-filters", "matchGTE")
  @js.native
  def matchGTE(data: js.Array[String], filter: Filter): Boolean = js.native
  
  @JSImport("ldap-filters", "matchLTE")
  @js.native
  def matchLTE(data: String, filter: Filter): Boolean = js.native
  @JSImport("ldap-filters", "matchLTE")
  @js.native
  def matchLTE(data: js.Array[String], filter: Filter): Boolean = js.native
  
  @JSImport("ldap-filters", "matchString")
  @js.native
  def matchString(data: String, filter: Filter): Boolean = js.native
  @JSImport("ldap-filters", "matchString")
  @js.native
  def matchString(data: js.Array[String], filter: Filter): Boolean = js.native
  
  @JSImport("ldap-filters", "matchSubstring")
  @js.native
  def matchSubstring(data: String, filter: Filter): Boolean = js.native
  @JSImport("ldap-filters", "matchSubstring")
  @js.native
  def matchSubstring(data: js.Array[String], filter: Filter): Boolean = js.native
  
  @JSImport("ldap-filters", "parse")
  @js.native
  def parse(input: String): Filter = js.native
  
  @JSImport("ldap-filters", "unescape")
  @js.native
  def unescape(value: String): String = js.native
  
  @js.native
  trait Attribute_ extends StObject {
    
    def approx(value: String): Filter = js.native
    
    def contains(value: String): Filter = js.native
    
    def endsWith(value: String): Filter = js.native
    
    def equalTo(value: String): Filter = js.native
    
    def escape(value: String): String = js.native
    
    var escapeChars: js.Array[String] = js.native
    
    def gte(value: String): Filter = js.native
    
    def lte(value: String): Filter = js.native
    
    var name: String = js.native
    
    def present(): Filter = js.native
    
    def raw(value: String): Filter = js.native
    
    def startsWith(value: String): Filter = js.native
  }
  object Attribute_ {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class Attribute_MutableBuilder[Self <: Attribute_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApprox(value: String => Filter): Self = StObject.set(x, "approx", js.Any.fromFunction1(value))
      
      @scala.inline
      def setContains(value: String => Filter): Self = StObject.set(x, "contains", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEndsWith(value: String => Filter): Self = StObject.set(x, "endsWith", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEqualTo(value: String => Filter): Self = StObject.set(x, "equalTo", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEscape(value: String => String): Self = StObject.set(x, "escape", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEscapeChars(value: js.Array[String]): Self = StObject.set(x, "escapeChars", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEscapeCharsVarargs(value: String*): Self = StObject.set(x, "escapeChars", js.Array(value :_*))
      
      @scala.inline
      def setGte(value: String => Filter): Self = StObject.set(x, "gte", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLte(value: String => Filter): Self = StObject.set(x, "lte", js.Any.fromFunction1(value))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPresent(value: () => Filter): Self = StObject.set(x, "present", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRaw(value: String => Filter): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStartsWith(value: String => Filter): Self = StObject.set(x, "startsWith", js.Any.fromFunction1(value))
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
  trait GroupNot extends Group {
    
    def simplify(): Filter = js.native
  }
}
