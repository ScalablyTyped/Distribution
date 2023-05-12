package typings.jestSchemas

import typings.sinclairTypebox.mod.TBoolean
import typings.sinclairTypebox.mod.TNull
import typings.sinclairTypebox.mod.TNumber
import typings.sinclairTypebox.mod.TObject
import typings.sinclairTypebox.mod.TPartial
import typings.sinclairTypebox.mod.TReadonly
import typings.sinclairTypebox.mod.TString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait CallToJSON extends StObject {
    
    var callToJSON: TReadonly[TBoolean]
    
    var compareKeys: TReadonly[TNull]
    
    var escapeRegex: TReadonly[TBoolean]
    
    var escapeString: TReadonly[TBoolean]
    
    var highlight: TReadonly[TBoolean]
    
    var indent: TReadonly[TNumber]
    
    var maxDepth: TReadonly[TNumber]
    
    var maxWidth: TReadonly[TNumber]
    
    var min: TReadonly[TBoolean]
    
    var printBasicPrototype: TReadonly[TBoolean]
    
    var printFunctionName: TReadonly[TBoolean]
    
    var theme: TReadonly[TPartial[TObject[Comment]]]
  }
  object CallToJSON {
    
    inline def apply(
      callToJSON: TReadonly[TBoolean],
      compareKeys: TReadonly[TNull],
      escapeRegex: TReadonly[TBoolean],
      escapeString: TReadonly[TBoolean],
      highlight: TReadonly[TBoolean],
      indent: TReadonly[TNumber],
      maxDepth: TReadonly[TNumber],
      maxWidth: TReadonly[TNumber],
      min: TReadonly[TBoolean],
      printBasicPrototype: TReadonly[TBoolean],
      printFunctionName: TReadonly[TBoolean],
      theme: TReadonly[TPartial[TObject[Comment]]]
    ): CallToJSON = {
      val __obj = js.Dynamic.literal(callToJSON = callToJSON.asInstanceOf[js.Any], compareKeys = compareKeys.asInstanceOf[js.Any], escapeRegex = escapeRegex.asInstanceOf[js.Any], escapeString = escapeString.asInstanceOf[js.Any], highlight = highlight.asInstanceOf[js.Any], indent = indent.asInstanceOf[js.Any], maxDepth = maxDepth.asInstanceOf[js.Any], maxWidth = maxWidth.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], printBasicPrototype = printBasicPrototype.asInstanceOf[js.Any], printFunctionName = printFunctionName.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[CallToJSON]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CallToJSON] (val x: Self) extends AnyVal {
      
      inline def setCallToJSON(value: TReadonly[TBoolean]): Self = StObject.set(x, "callToJSON", value.asInstanceOf[js.Any])
      
      inline def setCompareKeys(value: TReadonly[TNull]): Self = StObject.set(x, "compareKeys", value.asInstanceOf[js.Any])
      
      inline def setEscapeRegex(value: TReadonly[TBoolean]): Self = StObject.set(x, "escapeRegex", value.asInstanceOf[js.Any])
      
      inline def setEscapeString(value: TReadonly[TBoolean]): Self = StObject.set(x, "escapeString", value.asInstanceOf[js.Any])
      
      inline def setHighlight(value: TReadonly[TBoolean]): Self = StObject.set(x, "highlight", value.asInstanceOf[js.Any])
      
      inline def setIndent(value: TReadonly[TNumber]): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      inline def setMaxDepth(value: TReadonly[TNumber]): Self = StObject.set(x, "maxDepth", value.asInstanceOf[js.Any])
      
      inline def setMaxWidth(value: TReadonly[TNumber]): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      inline def setMin(value: TReadonly[TBoolean]): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setPrintBasicPrototype(value: TReadonly[TBoolean]): Self = StObject.set(x, "printBasicPrototype", value.asInstanceOf[js.Any])
      
      inline def setPrintFunctionName(value: TReadonly[TBoolean]): Self = StObject.set(x, "printFunctionName", value.asInstanceOf[js.Any])
      
      inline def setTheme(value: TReadonly[TPartial[TObject[Comment]]]): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  trait Comment extends StObject {
    
    var comment: TReadonly[TString]
    
    var content: TReadonly[TString]
    
    var prop: TReadonly[TString]
    
    var tag: TReadonly[TString]
    
    var value: TReadonly[TString]
  }
  object Comment {
    
    inline def apply(
      comment: TReadonly[TString],
      content: TReadonly[TString],
      prop: TReadonly[TString],
      tag: TReadonly[TString],
      value: TReadonly[TString]
    ): Comment = {
      val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], prop = prop.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Comment]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Comment] (val x: Self) extends AnyVal {
      
      inline def setComment(value: TReadonly[TString]): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      inline def setContent(value: TReadonly[TString]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setProp(value: TReadonly[TString]): Self = StObject.set(x, "prop", value.asInstanceOf[js.Any])
      
      inline def setTag(value: TReadonly[TString]): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setValue(value: TReadonly[TString]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
