package typings.htmlParser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("html-parser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parse(htmlString: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(htmlString.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def parse(htmlString: String, callbacks: Unit, regex: RegExpOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(htmlString.asInstanceOf[js.Any], callbacks.asInstanceOf[js.Any], regex.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def parse(htmlString: String, callbacks: CallbacksOption): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(htmlString.asInstanceOf[js.Any], callbacks.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def parse(htmlString: String, callbacks: CallbacksOption, regex: RegExpOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(htmlString.asInstanceOf[js.Any], callbacks.asInstanceOf[js.Any], regex.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def parseFile(fileName: String, encoding: String, callbacks: CallbacksOption, callback: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parseFile")(fileName.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], callbacks.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def parseFile(fileName: String, encoding: Unit, callbacks: CallbacksOption, callback: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parseFile")(fileName.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], callbacks.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def sanitize(htmlString: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("sanitize")(htmlString.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def sanitize(htmlString: String, removalCallbacks: RemovalCallback): String = (^.asInstanceOf[js.Dynamic].applyDynamic("sanitize")(htmlString.asInstanceOf[js.Any], removalCallbacks.asInstanceOf[js.Any])).asInstanceOf[String]
  
  type Callback = js.Function1[/* arg */ Any, Any]
  
  trait CallbacksOption extends StObject {
    
    var attribute: js.UndefOr[js.Function2[/* name */ String, /* value */ Any, Unit]] = js.undefined
    
    var cdata: js.UndefOr[js.Function1[/* content */ String, Unit]] = js.undefined
    
    var closeElement: js.UndefOr[js.Function1[/* name */ String, Unit]] = js.undefined
    
    var closeOpenedElement: js.UndefOr[
        js.Function3[/* tagName */ String, /* token */ Token, /* isUnary */ Boolean, Unit]
      ] = js.undefined
    
    var comment: js.UndefOr[js.Function1[/* content */ String, Unit]] = js.undefined
    
    var docType: js.UndefOr[js.Function1[/* content */ String, Unit]] = js.undefined
    
    var openElement: js.UndefOr[js.Function1[/* tagName */ String, Unit]] = js.undefined
    
    var text: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.undefined
    
    var xmlProlog: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object CallbacksOption {
    
    inline def apply(): CallbacksOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CallbacksOption]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CallbacksOption] (val x: Self) extends AnyVal {
      
      inline def setAttribute(value: (/* name */ String, /* value */ Any) => Unit): Self = StObject.set(x, "attribute", js.Any.fromFunction2(value))
      
      inline def setAttributeUndefined: Self = StObject.set(x, "attribute", js.undefined)
      
      inline def setCdata(value: /* content */ String => Unit): Self = StObject.set(x, "cdata", js.Any.fromFunction1(value))
      
      inline def setCdataUndefined: Self = StObject.set(x, "cdata", js.undefined)
      
      inline def setCloseElement(value: /* name */ String => Unit): Self = StObject.set(x, "closeElement", js.Any.fromFunction1(value))
      
      inline def setCloseElementUndefined: Self = StObject.set(x, "closeElement", js.undefined)
      
      inline def setCloseOpenedElement(value: (/* tagName */ String, /* token */ Token, /* isUnary */ Boolean) => Unit): Self = StObject.set(x, "closeOpenedElement", js.Any.fromFunction3(value))
      
      inline def setCloseOpenedElementUndefined: Self = StObject.set(x, "closeOpenedElement", js.undefined)
      
      inline def setComment(value: /* content */ String => Unit): Self = StObject.set(x, "comment", js.Any.fromFunction1(value))
      
      inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
      
      inline def setDocType(value: /* content */ String => Unit): Self = StObject.set(x, "docType", js.Any.fromFunction1(value))
      
      inline def setDocTypeUndefined: Self = StObject.set(x, "docType", js.undefined)
      
      inline def setOpenElement(value: /* tagName */ String => Unit): Self = StObject.set(x, "openElement", js.Any.fromFunction1(value))
      
      inline def setOpenElementUndefined: Self = StObject.set(x, "openElement", js.undefined)
      
      inline def setText(value: /* value */ String => Unit): Self = StObject.set(x, "text", js.Any.fromFunction1(value))
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setXmlProlog(value: () => Unit): Self = StObject.set(x, "xmlProlog", js.Any.fromFunction0(value))
      
      inline def setXmlPrologUndefined: Self = StObject.set(x, "xmlProlog", js.undefined)
    }
  }
  
  trait RegExpOptions extends StObject {
    
    var attribute: js.UndefOr[js.RegExp] = js.undefined
    
    var name: js.UndefOr[js.RegExp] = js.undefined
  }
  object RegExpOptions {
    
    inline def apply(): RegExpOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RegExpOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RegExpOptions] (val x: Self) extends AnyVal {
      
      inline def setAttribute(value: js.RegExp): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
      
      inline def setAttributeUndefined: Self = StObject.set(x, "attribute", js.undefined)
      
      inline def setName(value: js.RegExp): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  trait RemovalCallback extends StObject {
    
    var attributes: js.UndefOr[Callback | js.Array[String]] = js.undefined
    
    var comments: js.UndefOr[Callback | Boolean] = js.undefined
    
    var docTypes: js.UndefOr[Callback | Boolean] = js.undefined
    
    var elements: js.UndefOr[Callback | js.Array[String]] = js.undefined
  }
  object RemovalCallback {
    
    inline def apply(): RemovalCallback = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RemovalCallback]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RemovalCallback] (val x: Self) extends AnyVal {
      
      inline def setAttributes(value: Callback | js.Array[String]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesFunction1(value: /* arg */ Any => Any): Self = StObject.set(x, "attributes", js.Any.fromFunction1(value))
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      inline def setAttributesVarargs(value: String*): Self = StObject.set(x, "attributes", js.Array(value*))
      
      inline def setComments(value: Callback | Boolean): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
      
      inline def setCommentsFunction1(value: /* arg */ Any => Any): Self = StObject.set(x, "comments", js.Any.fromFunction1(value))
      
      inline def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
      
      inline def setDocTypes(value: Callback | Boolean): Self = StObject.set(x, "docTypes", value.asInstanceOf[js.Any])
      
      inline def setDocTypesFunction1(value: /* arg */ Any => Any): Self = StObject.set(x, "docTypes", js.Any.fromFunction1(value))
      
      inline def setDocTypesUndefined: Self = StObject.set(x, "docTypes", js.undefined)
      
      inline def setElements(value: Callback | js.Array[String]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
      
      inline def setElementsFunction1(value: /* arg */ Any => Any): Self = StObject.set(x, "elements", js.Any.fromFunction1(value))
      
      inline def setElementsUndefined: Self = StObject.set(x, "elements", js.undefined)
      
      inline def setElementsVarargs(value: String*): Self = StObject.set(x, "elements", js.Array(value*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.htmlParser.htmlParserStrings.Greaterthansign
    - typings.htmlParser.htmlParserStrings.SlashGreaterthansign
    - typings.htmlParser.htmlParserStrings.QuestionmarkGreaterthansign
  */
  trait Token extends StObject
  object Token {
    
    inline def Greaterthansign: typings.htmlParser.htmlParserStrings.Greaterthansign = ">".asInstanceOf[typings.htmlParser.htmlParserStrings.Greaterthansign]
    
    inline def QuestionmarkGreaterthansign: typings.htmlParser.htmlParserStrings.QuestionmarkGreaterthansign = "?>".asInstanceOf[typings.htmlParser.htmlParserStrings.QuestionmarkGreaterthansign]
    
    inline def SlashGreaterthansign: typings.htmlParser.htmlParserStrings.SlashGreaterthansign = "/>".asInstanceOf[typings.htmlParser.htmlParserStrings.SlashGreaterthansign]
  }
}
