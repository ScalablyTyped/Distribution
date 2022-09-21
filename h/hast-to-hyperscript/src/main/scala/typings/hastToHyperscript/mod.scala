package typings.hastToHyperscript

import typings.hastToHyperscript.hastToHyperscriptStrings.html
import typings.hastToHyperscript.hastToHyperscriptStrings.svg
import typings.propertyInformation.schemaMod.Schema
import typings.std.ReturnType
import typings.unistUtilIs.mod.AssertPredicate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("hast-to-hyperscript", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def toH[H /* <: CreateElementLike */](h: H, tree: Element): ReturnType[H] = (^.asInstanceOf[js.Dynamic].applyDynamic("toH")(h.asInstanceOf[js.Any], tree.asInstanceOf[js.Any])).asInstanceOf[ReturnType[H]]
  inline def toH[H /* <: CreateElementLike */](h: H, tree: Element, options: String): ReturnType[H] = (^.asInstanceOf[js.Dynamic].applyDynamic("toH")(h.asInstanceOf[js.Any], tree.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ReturnType[H]]
  inline def toH[H /* <: CreateElementLike */](h: H, tree: Element, options: Boolean): ReturnType[H] = (^.asInstanceOf[js.Dynamic].applyDynamic("toH")(h.asInstanceOf[js.Any], tree.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ReturnType[H]]
  inline def toH[H /* <: CreateElementLike */](h: H, tree: Element, options: Options): ReturnType[H] = (^.asInstanceOf[js.Dynamic].applyDynamic("toH")(h.asInstanceOf[js.Any], tree.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ReturnType[H]]
  inline def toH[H /* <: CreateElementLike */](h: H, tree: Root): ReturnType[H] = (^.asInstanceOf[js.Dynamic].applyDynamic("toH")(h.asInstanceOf[js.Any], tree.asInstanceOf[js.Any])).asInstanceOf[ReturnType[H]]
  inline def toH[H /* <: CreateElementLike */](h: H, tree: Root, options: String): ReturnType[H] = (^.asInstanceOf[js.Dynamic].applyDynamic("toH")(h.asInstanceOf[js.Any], tree.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ReturnType[H]]
  inline def toH[H /* <: CreateElementLike */](h: H, tree: Root, options: Boolean): ReturnType[H] = (^.asInstanceOf[js.Dynamic].applyDynamic("toH")(h.asInstanceOf[js.Any], tree.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ReturnType[H]]
  inline def toH[H /* <: CreateElementLike */](h: H, tree: Root, options: Options): ReturnType[H] = (^.asInstanceOf[js.Dynamic].applyDynamic("toH")(h.asInstanceOf[js.Any], tree.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ReturnType[H]]
  
  type AssertElement = AssertPredicate[Element]
  
  type AssertRoot = AssertPredicate[Root]
  
  type AssertText = AssertPredicate[Text]
  
  trait Context extends StObject {
    
    var hyperscript: Boolean
    
    var key: Double
    
    var prefix: String | Null
    
    var react: Boolean
    
    var schema: Schema
    
    var vdom: Boolean
    
    var vue: Boolean
  }
  object Context {
    
    inline def apply(hyperscript: Boolean, key: Double, react: Boolean, schema: Schema, vdom: Boolean, vue: Boolean): Context = {
      val __obj = js.Dynamic.literal(hyperscript = hyperscript.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], react = react.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], vdom = vdom.asInstanceOf[js.Any], vue = vue.asInstanceOf[js.Any], prefix = null)
      __obj.asInstanceOf[Context]
    }
    
    extension [Self <: Context](x: Self) {
      
      inline def setHyperscript(value: Boolean): Self = StObject.set(x, "hyperscript", value.asInstanceOf[js.Any])
      
      inline def setKey(value: Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixNull: Self = StObject.set(x, "prefix", null)
      
      inline def setReact(value: Boolean): Self = StObject.set(x, "react", value.asInstanceOf[js.Any])
      
      inline def setSchema(value: Schema): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      inline def setVdom(value: Boolean): Self = StObject.set(x, "vdom", value.asInstanceOf[js.Any])
      
      inline def setVue(value: Boolean): Self = StObject.set(x, "vue", value.asInstanceOf[js.Any])
    }
  }
  
  type CreateElementLike = js.Function3[/* name */ String, /* attributes */ Any, /* children */ js.UndefOr[js.Array[Any]], Any]
  
  type Element = typings.hast.mod.Element
  
  trait Options extends StObject {
    
    var prefix: js.UndefOr[String | Null] = js.undefined
    
    var space: js.UndefOr[html | svg] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixNull: Self = StObject.set(x, "prefix", null)
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setSpace(value: html | svg): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
      
      inline def setSpaceUndefined: Self = StObject.set(x, "space", js.undefined)
    }
  }
  
  type Root = typings.hast.mod.Root
  
  type Text = typings.hast.mod.Text
}
