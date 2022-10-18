package typings.grayMatter

import typings.grayMatter.mod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Content[I /* <: Input */] extends StObject {
    
    var content: I
  }
  object Content {
    
    inline def apply[I /* <: Input */](content: I): Content[I] = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
      __obj.asInstanceOf[Content[I]]
    }
    
    extension [Self <: Content[?], I /* <: Input */](x: Self & Content[I]) {
      
      inline def setContent(value: I): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    }
  }
  
  trait ContentString extends StObject {
    
    var content: String
  }
  object ContentString {
    
    inline def apply(content: String): ContentString = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContentString]
    }
    
    extension [Self <: ContentString](x: Self) {
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    }
  }
  
  trait Name extends StObject {
    
    var name: String
    
    var raw: String
  }
  object Name {
    
    inline def apply(name: String, raw: String): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    extension [Self <: Name](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    }
  }
  
  trait Parse extends StObject {
    
    def parse(input: String): js.Object
    
    var stringify: js.UndefOr[js.Function1[/* data */ js.Object, String]] = js.undefined
  }
  object Parse {
    
    inline def apply(parse: String => js.Object): Parse = {
      val __obj = js.Dynamic.literal(parse = js.Any.fromFunction1(parse))
      __obj.asInstanceOf[Parse]
    }
    
    extension [Self <: Parse](x: Self) {
      
      inline def setParse(value: String => js.Object): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
      
      inline def setStringify(value: /* data */ js.Object => String): Self = StObject.set(x, "stringify", js.Any.fromFunction1(value))
      
      inline def setStringifyUndefined: Self = StObject.set(x, "stringify", js.undefined)
    }
  }
}
