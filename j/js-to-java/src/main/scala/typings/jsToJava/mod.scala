package typings.jsToJava

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(className: String, value: js.Any): js.Object = (^.asInstanceOf[js.Dynamic].apply(className.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  @JSImport("js-to-java", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def BigDecimal(`val`: String): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("BigDecimal")(`val`.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  
  inline def Boolean_(value: Boolean): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("Boolean")(value.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  
  inline def Byte_(value: Double): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("Byte")(value.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  
  inline def Character(value: String): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("Character")(value.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  
  inline def Class(className: String): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("Class")(className.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  
  trait Currency
    extends StObject
       with /* k */ StringDictionary[js.Any] {
    
    var currencyCode: String
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
    
    extension [Self <: Currency](x: Self) {
      
      inline def setCurrencyCode(value: String): Self = StObject.set(x, "currencyCode", value.asInstanceOf[js.Any])
    }
  }
  
  inline def Dictionary(value: js.Object): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("Dictionary")(value.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  
  inline def Double_(value: Double): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("Double")(value.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  
  inline def Enumeration(value: js.Object): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("Enumeration")(value.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  
  inline def Float_(value: Double): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("Float")(value.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  
  inline def HashMap(value: js.Object): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("HashMap")(value.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  
  // Note: enum is keyword
  // function enum(className: string, value: string): object;
  inline def Integer(value: Double): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("Integer")(value.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  
  inline def Iterator(value: js.Object): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("Iterator")(value.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  
  inline def List[T](value: js.Array[T]): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("List")(value.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  
  inline def Locale(locale: String, handle: String): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("Locale")(locale.asInstanceOf[js.Any], handle.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  inline def Long_(value: Double): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("Long")(value.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  
  inline def Map(value: js.Object): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("Map")(value.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  
  inline def Set(value: js.Object): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("Set")(value.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  
  inline def Short_(value: Double): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("Short")(value.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  
  inline def String(value: java.lang.String): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("String")(value.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  
  inline def `abstract`(abstractClassName: String, className: String, value: js.Any): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("abstract")(abstractClassName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  object array {
    
    inline def apply(className: String, value: js.Array[js.Any]): js.Object = (^.asInstanceOf[js.Dynamic].apply(className.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Object]
    
    @JSImport("js-to-java", "array")
    @js.native
    val ^ : js.Any = js.native
    
    inline def BigDecimal(`val`: js.Array[String]): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("BigDecimal")(`val`.asInstanceOf[js.Any]).asInstanceOf[js.Object]
    
    inline def Boolean_(value: js.Array[Boolean]): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("Boolean")(value.asInstanceOf[js.Any]).asInstanceOf[js.Object]
    
    inline def Byte_(value: js.Array[Double]): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("Byte")(value.asInstanceOf[js.Any]).asInstanceOf[js.Object]
    
    inline def Character(value: js.Array[String]): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("Character")(value.asInstanceOf[js.Any]).asInstanceOf[js.Object]
    
    inline def Class(className: js.Array[String]): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("Class")(className.asInstanceOf[js.Any]).asInstanceOf[js.Object]
    
    inline def Currency(value: js.Array[Null | String | typings.jsToJava.mod.Currency]): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("Currency")(value.asInstanceOf[js.Any]).asInstanceOf[js.Object]
    
    inline def Dictionary(value: js.Array[js.Object]): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("Dictionary")(value.asInstanceOf[js.Any]).asInstanceOf[js.Object]
    
    inline def Double_(value: js.Array[Double]): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("Double")(value.asInstanceOf[js.Any]).asInstanceOf[js.Object]
    
    inline def Enumeration(value: js.Array[js.Object]): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("Enumeration")(value.asInstanceOf[js.Any]).asInstanceOf[js.Object]
    
    inline def Float_(value: js.Array[Double]): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("Float")(value.asInstanceOf[js.Any]).asInstanceOf[js.Object]
    
    inline def HashMap(value: js.Array[js.Object]): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("HashMap")(value.asInstanceOf[js.Any]).asInstanceOf[js.Object]
    
    inline def Integer(value: js.Array[Double]): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("Integer")(value.asInstanceOf[js.Any]).asInstanceOf[js.Object]
    
    inline def Iterator(value: js.Array[js.Object]): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("Iterator")(value.asInstanceOf[js.Any]).asInstanceOf[js.Object]
    
    inline def List[T](value: js.Array[T]): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("List")(value.asInstanceOf[js.Any]).asInstanceOf[js.Object]
    
    inline def Locale(locale: js.Array[String], handle: String): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("Locale")(locale.asInstanceOf[js.Any], handle.asInstanceOf[js.Any])).asInstanceOf[js.Object]
    
    inline def Long_(value: js.Array[Double]): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("Long")(value.asInstanceOf[js.Any]).asInstanceOf[js.Object]
    
    inline def Map(value: js.Array[js.Object]): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("Map")(value.asInstanceOf[js.Any]).asInstanceOf[js.Object]
    
    inline def Set(value: js.Array[js.Object]): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("Set")(value.asInstanceOf[js.Any]).asInstanceOf[js.Object]
    
    inline def Short_(value: js.Array[Double]): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("Short")(value.asInstanceOf[js.Any]).asInstanceOf[js.Object]
    
    inline def String(value: js.Array[java.lang.String]): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("String")(value.asInstanceOf[js.Any]).asInstanceOf[js.Object]
    
    inline def boolean(value: js.Array[Boolean]): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("boolean")(value.asInstanceOf[js.Any]).asInstanceOf[js.Object]
    
    inline def byte(value: js.Array[Double]): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("byte")(value.asInstanceOf[js.Any]).asInstanceOf[js.Object]
    
    inline def char(value: js.Array[String]): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("char")(value.asInstanceOf[js.Any]).asInstanceOf[js.Object]
    
    inline def chars(value: js.Array[String]): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("chars")(value.asInstanceOf[js.Any]).asInstanceOf[js.Object]
    
    inline def double(value: js.Array[Double]): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("double")(value.asInstanceOf[js.Any]).asInstanceOf[js.Object]
    
    inline def float(value: js.Array[Double]): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("float")(value.asInstanceOf[js.Any]).asInstanceOf[js.Object]
    
    inline def int(value: js.Array[Double]): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("int")(value.asInstanceOf[js.Any]).asInstanceOf[js.Object]
    
    inline def long(value: js.Array[Double]): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("long")(value.asInstanceOf[js.Any]).asInstanceOf[js.Object]
    
    inline def short(value: js.Array[Double]): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("short")(value.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  }
  
  inline def boolean(value: Boolean): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("boolean")(value.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  
  inline def byte(value: Double): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("byte")(value.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  
  inline def char(value: String): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("char")(value.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  
  inline def chars(value: String): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("chars")(value.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  
  inline def combine(className: String, value: js.Any): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(className.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  inline def double(value: Double): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("double")(value.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  
  inline def exception(error: Error, className: String): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("exception")(error.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  inline def float(value: Double): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("float")(value.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  
  inline def int(value: Double): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("int")(value.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  
  inline def long(value: Double): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("long")(value.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  
  inline def revert(javaObject: js.Object): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("revert")(javaObject.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  inline def short(value: Double): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("short")(value.asInstanceOf[js.Any]).asInstanceOf[js.Object]
}
