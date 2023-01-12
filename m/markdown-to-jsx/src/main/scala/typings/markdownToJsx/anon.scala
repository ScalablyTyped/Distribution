package typings.markdownToJsx

import org.scalablytyped.runtime.StringDictionary
import typings.markdownToJsx.mod.MarkdownToJSX.Options
import typings.react.mod.ElementType
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Compiler extends StObject {
    
    var compiler: js.Function2[/* markdown */ String, /* options */ js.UndefOr[Options], Element]
  }
  object Compiler {
    
    inline def apply(compiler: (/* markdown */ String, /* options */ js.UndefOr[Options]) => Element): Compiler = {
      val __obj = js.Dynamic.literal(compiler = js.Any.fromFunction2(compiler))
      __obj.asInstanceOf[Compiler]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Compiler] (val x: Self) extends AnyVal {
      
      inline def setCompiler(value: (/* markdown */ String, /* options */ js.UndefOr[Options]) => Element): Self = StObject.set(x, "compiler", js.Any.fromFunction2(value))
    }
  }
  
  trait Component extends StObject {
    
    var component: ElementType[Any]
    
    var props: js.Object
  }
  object Component {
    
    inline def apply(component: ElementType[Any], props: js.Object): Component = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[Component]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Component] (val x: Self) extends AnyVal {
      
      inline def setComponent(value: ElementType[Any]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setProps(value: js.Object): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  trait Dictkey
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var children: String
    
    var options: js.UndefOr[Options] = js.undefined
  }
  object Dictkey {
    
    inline def apply(children: String): Dictkey = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dictkey]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Dictkey] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: String): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    }
  }
}
