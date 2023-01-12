package typings.js2coffee

import typings.js2coffee.js2coffeeStrings.CoffeeEscapedExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Aliases extends StObject {
    
    var aliases: js.Array[String]
    
    var keywords: js.Array[String]
    
    var reserved: js.Array[String]
  }
  object Aliases {
    
    inline def apply(aliases: js.Array[String], keywords: js.Array[String], reserved: js.Array[String]): Aliases = {
      val __obj = js.Dynamic.literal(aliases = aliases.asInstanceOf[js.Any], keywords = keywords.asInstanceOf[js.Any], reserved = reserved.asInstanceOf[js.Any])
      __obj.asInstanceOf[Aliases]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Aliases] (val x: Self) extends AnyVal {
      
      inline def setAliases(value: js.Array[String]): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
      
      inline def setAliasesVarargs(value: String*): Self = StObject.set(x, "aliases", js.Array(value*))
      
      inline def setKeywords(value: js.Array[String]): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
      
      inline def setKeywordsVarargs(value: String*): Self = StObject.set(x, "keywords", js.Array(value*))
      
      inline def setReserved(value: js.Array[String]): Self = StObject.set(x, "reserved", value.asInstanceOf[js.Any])
      
      inline def setReservedVarargs(value: String*): Self = StObject.set(x, "reserved", js.Array(value*))
    }
  }
  
  trait Column extends StObject {
    
    var column: Double
    
    var line: Double
  }
  object Column {
    
    inline def apply(column: Double, line: Double): Column = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
      __obj.asInstanceOf[Column]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Column] (val x: Self) extends AnyVal {
      
      inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    }
  }
  
  trait Type extends StObject {
    
    var `type`: CoffeeEscapedExpression
  }
  object Type {
    
    inline def apply(): Type = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("CoffeeEscapedExpression")
      __obj.asInstanceOf[Type]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Type] (val x: Self) extends AnyVal {
      
      inline def setType(value: CoffeeEscapedExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
