package typings.hastToHyperscript

import typings.hastToHyperscript.hastToHyperscriptStrings.html
import typings.hastToHyperscript.hastToHyperscriptStrings.svg
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMod {
  
  @JSImport("hast-to-hyperscript/lib", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def toH[H /* <: CreateElementLike */](h: H, tree: Node): ReturnType[H] = (^.asInstanceOf[js.Dynamic].applyDynamic("toH")(h.asInstanceOf[js.Any], tree.asInstanceOf[js.Any])).asInstanceOf[ReturnType[H]]
  inline def toH[H /* <: CreateElementLike */](h: H, tree: Node, options: String): ReturnType[H] = (^.asInstanceOf[js.Dynamic].applyDynamic("toH")(h.asInstanceOf[js.Any], tree.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ReturnType[H]]
  inline def toH[H /* <: CreateElementLike */](h: H, tree: Node, options: Boolean): ReturnType[H] = (^.asInstanceOf[js.Dynamic].applyDynamic("toH")(h.asInstanceOf[js.Any], tree.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ReturnType[H]]
  inline def toH[H /* <: CreateElementLike */](h: H, tree: Node, options: Options): ReturnType[H] = (^.asInstanceOf[js.Dynamic].applyDynamic("toH")(h.asInstanceOf[js.Any], tree.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ReturnType[H]]
  
  type Content = typings.hast.mod.Content
  
  type CreateElementLike = js.Function3[/* name */ String, /* attributes */ Any, /* children */ js.UndefOr[js.Array[Any]], Any]
  
  type Element = typings.hast.mod.Element
  
  type Node = Root | Content
  
  trait Options extends StObject {
    
    /**
      * Prefix to use as a prefix for keys passed in `props` to `h()`, this
      * behavior is turned off by passing `false` and turned on by passing a
      * `string`.
      * By default, `h-` is used as a prefix if the given `h` is detected as being
      * `virtual-dom/h` or `React.createElement`
      */
    var prefix: js.UndefOr[String | Null] = js.undefined
    
    /**
      * Whether `node` is in the `'html'` or `'svg'` space.
      * If an `<svg>` element is found when inside the HTML space, `toH`
      * automatically switches to the SVG space when entering the element, and
      * switches back when exiting.
      */
    var space: js.UndefOr[html | svg | Null] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixNull: Self = StObject.set(x, "prefix", null)
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setSpace(value: html | svg): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
      
      inline def setSpaceNull: Self = StObject.set(x, "space", null)
      
      inline def setSpaceUndefined: Self = StObject.set(x, "space", js.undefined)
    }
  }
  
  type Root = typings.hast.mod.Root
  
  type Schema = typings.propertyInformation.mod.Schema
  
  trait State extends StObject {
    
    /**
      *  Looks like `hyperscript`.
      */
    var hyperscript: Boolean
    
    /**
      *  Current key.
      */
    var key: Double
    
    /**
      *  Prefix to use.
      */
    var prefix: js.UndefOr[String] = js.undefined
    
    /**
      *  Looks like React.
      */
    var react: Boolean
    
    /**
      *  Current schema.
      */
    var schema: Schema
    
    /**
      *  Looks like vdom.
      */
    var vdom: Boolean
    
    /**
      *  Looks like Vue.
      */
    var vue: Boolean
  }
  object State {
    
    inline def apply(hyperscript: Boolean, key: Double, react: Boolean, schema: Schema, vdom: Boolean, vue: Boolean): State = {
      val __obj = js.Dynamic.literal(hyperscript = hyperscript.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], react = react.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], vdom = vdom.asInstanceOf[js.Any], vue = vue.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: State] (val x: Self) extends AnyVal {
      
      inline def setHyperscript(value: Boolean): Self = StObject.set(x, "hyperscript", value.asInstanceOf[js.Any])
      
      inline def setKey(value: Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setReact(value: Boolean): Self = StObject.set(x, "react", value.asInstanceOf[js.Any])
      
      inline def setSchema(value: Schema): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      inline def setVdom(value: Boolean): Self = StObject.set(x, "vdom", value.asInstanceOf[js.Any])
      
      inline def setVue(value: Boolean): Self = StObject.set(x, "vue", value.asInstanceOf[js.Any])
    }
  }
}
