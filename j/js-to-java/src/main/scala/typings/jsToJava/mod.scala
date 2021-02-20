package typings.jsToJava

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("js-to-java", JSImport.Namespace)
  @js.native
  def apply(className: String, value: js.Any): js.Object = js.native
  
  @JSImport("js-to-java", "BigDecimal")
  @js.native
  def BigDecimal(`val`: String): js.Object = js.native
  
  @JSImport("js-to-java", "Boolean")
  @js.native
  def Boolean_(value: Boolean): js.Object = js.native
  
  @JSImport("js-to-java", "Byte")
  @js.native
  def Byte_(value: Double): js.Object = js.native
  
  @JSImport("js-to-java", "Character")
  @js.native
  def Character(value: String): js.Object = js.native
  
  @JSImport("js-to-java", "Class")
  @js.native
  def Class(className: String): js.Object = js.native
  
  @js.native
  trait Currency
    extends /* k */ StringDictionary[js.Any] {
    
    var currencyCode: String = js.native
  }
  object Currency {
    
    @JSImport("js-to-java", "Currency")
    @js.native
    def apply(): js.Object = js.native
    @JSImport("js-to-java", "Currency")
    @js.native
    def apply(value: String): js.Object = js.native
    @JSImport("js-to-java", "Currency")
    @js.native
    def apply(value: Currency): js.Object = js.native
    
    @scala.inline
    implicit class CurrencyMutableBuilder[Self <: Currency] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrencyCode(value: String): Self = StObject.set(x, "currencyCode", value.asInstanceOf[js.Any])
    }
  }
  
  @JSImport("js-to-java", "Dictionary")
  @js.native
  def Dictionary(value: js.Object): js.Object = js.native
  
  @JSImport("js-to-java", "Double")
  @js.native
  def Double_(value: Double): js.Object = js.native
  
  @JSImport("js-to-java", "Enumeration")
  @js.native
  def Enumeration(value: js.Object): js.Object = js.native
  
  @JSImport("js-to-java", "Float")
  @js.native
  def Float_(value: Double): js.Object = js.native
  
  @JSImport("js-to-java", "HashMap")
  @js.native
  def HashMap(value: js.Object): js.Object = js.native
  
  // Note: enum is keyword
  // function enum(className: string, value: string): object;
  @JSImport("js-to-java", "Integer")
  @js.native
  def Integer(value: Double): js.Object = js.native
  
  @JSImport("js-to-java", "Iterator")
  @js.native
  def Iterator(value: js.Object): js.Object = js.native
  
  @JSImport("js-to-java", "List")
  @js.native
  def List[T](value: js.Array[T]): js.Object = js.native
  
  @JSImport("js-to-java", "Locale")
  @js.native
  def Locale(locale: String, handle: String): js.Object = js.native
  
  @JSImport("js-to-java", "Long")
  @js.native
  def Long_(value: Double): js.Object = js.native
  
  @JSImport("js-to-java", "Map")
  @js.native
  def Map(value: js.Object): js.Object = js.native
  
  @JSImport("js-to-java", "Set")
  @js.native
  def Set(value: js.Object): js.Object = js.native
  
  @JSImport("js-to-java", "Short")
  @js.native
  def Short_(value: Double): js.Object = js.native
  
  @JSImport("js-to-java", "String")
  @js.native
  def String(value: java.lang.String): js.Object = js.native
  
  object array {
    
    @JSImport("js-to-java", "array")
    @js.native
    def apply(className: String, value: js.Array[_]): js.Object = js.native
    
    @JSImport("js-to-java", "array.BigDecimal")
    @js.native
    def BigDecimal(`val`: js.Array[String]): js.Object = js.native
    
    @JSImport("js-to-java", "array.Boolean")
    @js.native
    def Boolean_(value: js.Array[Boolean]): js.Object = js.native
    
    @JSImport("js-to-java", "array.Byte")
    @js.native
    def Byte_(value: js.Array[Double]): js.Object = js.native
    
    @JSImport("js-to-java", "array.Character")
    @js.native
    def Character(value: js.Array[String]): js.Object = js.native
    
    @JSImport("js-to-java", "array.Class")
    @js.native
    def Class(className: js.Array[String]): js.Object = js.native
    
    @JSImport("js-to-java", "array.Currency")
    @js.native
    def Currency(value: js.Array[Null | String | typings.jsToJava.mod.Currency]): js.Object = js.native
    
    @JSImport("js-to-java", "array.Dictionary")
    @js.native
    def Dictionary(value: js.Array[js.Object]): js.Object = js.native
    
    @JSImport("js-to-java", "array.Double")
    @js.native
    def Double_(value: js.Array[Double]): js.Object = js.native
    
    @JSImport("js-to-java", "array.Enumeration")
    @js.native
    def Enumeration(value: js.Array[js.Object]): js.Object = js.native
    
    @JSImport("js-to-java", "array.Float")
    @js.native
    def Float_(value: js.Array[Double]): js.Object = js.native
    
    @JSImport("js-to-java", "array.HashMap")
    @js.native
    def HashMap(value: js.Array[js.Object]): js.Object = js.native
    
    @JSImport("js-to-java", "array.Integer")
    @js.native
    def Integer(value: js.Array[Double]): js.Object = js.native
    
    @JSImport("js-to-java", "array.Iterator")
    @js.native
    def Iterator(value: js.Array[js.Object]): js.Object = js.native
    
    @JSImport("js-to-java", "array.List")
    @js.native
    def List[T](value: js.Array[T]): js.Object = js.native
    
    @JSImport("js-to-java", "array.Locale")
    @js.native
    def Locale(locale: js.Array[String], handle: String): js.Object = js.native
    
    @JSImport("js-to-java", "array.Long")
    @js.native
    def Long_(value: js.Array[Double]): js.Object = js.native
    
    @JSImport("js-to-java", "array.Map")
    @js.native
    def Map(value: js.Array[js.Object]): js.Object = js.native
    
    @JSImport("js-to-java", "array.Set")
    @js.native
    def Set(value: js.Array[js.Object]): js.Object = js.native
    
    @JSImport("js-to-java", "array.Short")
    @js.native
    def Short_(value: js.Array[Double]): js.Object = js.native
    
    @JSImport("js-to-java", "array.String")
    @js.native
    def String(value: js.Array[java.lang.String]): js.Object = js.native
    
    @JSImport("js-to-java", "array.boolean")
    @js.native
    def boolean(value: js.Array[Boolean]): js.Object = js.native
    
    @JSImport("js-to-java", "array.byte")
    @js.native
    def byte(value: js.Array[Double]): js.Object = js.native
    
    @JSImport("js-to-java", "array.char")
    @js.native
    def char(value: js.Array[String]): js.Object = js.native
    
    @JSImport("js-to-java", "array.chars")
    @js.native
    def chars(value: js.Array[String]): js.Object = js.native
    
    @JSImport("js-to-java", "array.double")
    @js.native
    def double(value: js.Array[Double]): js.Object = js.native
    
    @JSImport("js-to-java", "array.float")
    @js.native
    def float(value: js.Array[Double]): js.Object = js.native
    
    @JSImport("js-to-java", "array.int")
    @js.native
    def int(value: js.Array[Double]): js.Object = js.native
    
    @JSImport("js-to-java", "array.long")
    @js.native
    def long(value: js.Array[Double]): js.Object = js.native
    
    @JSImport("js-to-java", "array.short")
    @js.native
    def short(value: js.Array[Double]): js.Object = js.native
  }
  
  @JSImport("js-to-java", "boolean")
  @js.native
  def boolean(value: Boolean): js.Object = js.native
  
  @JSImport("js-to-java", "byte")
  @js.native
  def byte(value: Double): js.Object = js.native
  
  @JSImport("js-to-java", "char")
  @js.native
  def char(value: String): js.Object = js.native
  
  @JSImport("js-to-java", "chars")
  @js.native
  def chars(value: String): js.Object = js.native
  
  @JSImport("js-to-java", "combine")
  @js.native
  def combine(className: String, value: js.Any): js.Object = js.native
  
  @JSImport("js-to-java", "double")
  @js.native
  def double(value: Double): js.Object = js.native
  
  @JSImport("js-to-java", "exception")
  @js.native
  def exception(error: Error, className: String): js.Object = js.native
  
  @JSImport("js-to-java", "float")
  @js.native
  def float(value: Double): js.Object = js.native
  
  @JSImport("js-to-java", "int")
  @js.native
  def int(value: Double): js.Object = js.native
  
  @JSImport("js-to-java", "long")
  @js.native
  def long(value: Double): js.Object = js.native
  
  @JSImport("js-to-java", "revert")
  @js.native
  def revert(javaObject: js.Object): js.Any = js.native
  
  @JSImport("js-to-java", "short")
  @js.native
  def short(value: Double): js.Object = js.native
  
  @JSImport("js-to-java", "abstract")
  @js.native
  def `abstract`(abstractClassName: String, className: String, value: js.Any): js.Object = js.native
}
