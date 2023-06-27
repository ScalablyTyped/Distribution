package typings.lezerHtml

import org.scalablytyped.runtime.StringDictionary
import typings.lezerCommon.mod.Parser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Attrs extends StObject {
    
    var attrs: js.UndefOr[js.Function1[/* attrs */ StringDictionary[String], Boolean]] = js.undefined
    
    var parser: Parser
    
    var tag: String
  }
  object Attrs {
    
    inline def apply(parser: Parser, tag: String): Attrs = {
      val __obj = js.Dynamic.literal(parser = parser.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
      __obj.asInstanceOf[Attrs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Attrs] (val x: Self) extends AnyVal {
      
      inline def setAttrs(value: /* attrs */ StringDictionary[String] => Boolean): Self = StObject.set(x, "attrs", js.Any.fromFunction1(value))
      
      inline def setAttrsUndefined: Self = StObject.set(x, "attrs", js.undefined)
      
      inline def setParser(value: Parser): Self = StObject.set(x, "parser", value.asInstanceOf[js.Any])
      
      inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    }
  }
  
  trait Name extends StObject {
    
    var name: String
    
    var parser: Parser
    
    var tagName: js.UndefOr[String] = js.undefined
  }
  object Name {
    
    inline def apply(name: String, parser: Parser): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], parser = parser.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setParser(value: Parser): Self = StObject.set(x, "parser", value.asInstanceOf[js.Any])
      
      inline def setTagName(value: String): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
      
      inline def setTagNameUndefined: Self = StObject.set(x, "tagName", js.undefined)
    }
  }
}
