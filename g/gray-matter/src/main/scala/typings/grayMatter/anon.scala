package typings.grayMatter

import typings.grayMatter.mod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Content extends StObject {
    
    var content: String
  }
  object Content {
    
    inline def apply(content: String): Content = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
      __obj.asInstanceOf[Content]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Content] (val x: Self) extends AnyVal {
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    }
  }
  
  trait ContentI[I /* <: Input */] extends StObject {
    
    var content: I
  }
  object ContentI {
    
    inline def apply[I /* <: Input */](content: I): ContentI[I] = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContentI[I]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ContentI[?], I /* <: Input */] (val x: Self & ContentI[I]) extends AnyVal {
      
      inline def setContent(value: I): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Parse] (val x: Self) extends AnyVal {
      
      inline def setParse(value: String => js.Object): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
      
      inline def setStringify(value: /* data */ js.Object => String): Self = StObject.set(x, "stringify", js.Any.fromFunction1(value))
      
      inline def setStringifyUndefined: Self = StObject.set(x, "stringify", js.undefined)
    }
  }
}
