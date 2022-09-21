package typings.lowlight

import typings.highlightJs.mod.Emitter
import typings.highlightJs.mod.HLJSOptions
import typings.highlightJs.mod.LanguageFn
import typings.lowlight.anon.ClassName
import typings.lowlight.anon.Language
import typings.lowlight.lowlightStrings.element
import typings.lowlight.lowlightStrings.root
import typings.lowlight.lowlightStrings.span
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreMod {
  
  trait AutoOptions
    extends StObject
       with Options
       with ExtraOptions
  object AutoOptions {
    
    inline def apply(): AutoOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AutoOptions]
    }
  }
  
  trait ExtraOptions extends StObject {
    
    /**
      * List of allowed languages, defaults to all registered languages.
      */
    var subset: js.UndefOr[js.Array[String]] = js.undefined
  }
  object ExtraOptions {
    
    inline def apply(): ExtraOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExtraOptions]
    }
    
    extension [Self <: ExtraOptions](x: Self) {
      
      inline def setSubset(value: js.Array[String]): Self = StObject.set(x, "subset", value.asInstanceOf[js.Any])
      
      inline def setSubsetUndefined: Self = StObject.set(x, "subset", js.undefined)
      
      inline def setSubsetVarargs(value: String*): Self = StObject.set(x, "subset", js.Array(value*))
    }
  }
  
  type HighlightEmitter = Emitter
  
  type HighlightOptions = HLJSOptions
  
  type HighlightResult = typings.highlightJs.mod.HighlightResult
  
  type HighlightSyntax = LanguageFn
  
  trait Options extends StObject {
    
    /**
      * Class prefix.
      */
    var prefix: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    }
  }
  
  trait Root extends StObject {
    
    var children: js.Array[Span | Text]
    
    var data: Language
    
    var `type`: root
  }
  object Root {
    
    inline def apply(children: js.Array[Span | Text], data: Language): Root = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("root")
      __obj.asInstanceOf[Root]
    }
    
    extension [Self <: Root](x: Self) {
      
      inline def setChildren(value: js.Array[Span | Text]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: (Span | Text)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setData(value: Language): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setType(value: root): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Span extends StObject {
    
    var children: js.Array[Span | Text]
    
    var properties: ClassName
    
    var tagName: span
    
    var `type`: element
  }
  object Span {
    
    inline def apply(children: js.Array[Span | Text], properties: ClassName): Span = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], tagName = "span")
      __obj.updateDynamic("type")("element")
      __obj.asInstanceOf[Span]
    }
    
    extension [Self <: Span](x: Self) {
      
      inline def setChildren(value: js.Array[Span | Text]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: (Span | Text)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setProperties(value: ClassName): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setTagName(value: span): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
      
      inline def setType(value: element): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type Text = typings.hast.mod.Text
}
