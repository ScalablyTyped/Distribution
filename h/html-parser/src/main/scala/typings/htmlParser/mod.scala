package typings.htmlParser

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("html-parser", "parse")
  @js.native
  def parse(htmlString: String): Unit = js.native
  @JSImport("html-parser", "parse")
  @js.native
  def parse(htmlString: String, callbacks: js.UndefOr[scala.Nothing], regex: RegExpOptions): Unit = js.native
  @JSImport("html-parser", "parse")
  @js.native
  def parse(htmlString: String, callbacks: CallbacksOption): Unit = js.native
  @JSImport("html-parser", "parse")
  @js.native
  def parse(htmlString: String, callbacks: CallbacksOption, regex: RegExpOptions): Unit = js.native
  
  @JSImport("html-parser", "parseFile")
  @js.native
  def parseFile(
    fileName: String,
    encoding: js.UndefOr[scala.Nothing],
    callbacks: CallbacksOption,
    callback: Callback
  ): Unit = js.native
  @JSImport("html-parser", "parseFile")
  @js.native
  def parseFile(fileName: String, encoding: String, callbacks: CallbacksOption, callback: Callback): Unit = js.native
  
  @JSImport("html-parser", "sanitize")
  @js.native
  def sanitize(htmlString: String): String = js.native
  @JSImport("html-parser", "sanitize")
  @js.native
  def sanitize(htmlString: String, removalCallbacks: RemovalCallback): String = js.native
  
  type Callback = js.Function1[/* arg */ js.Any, js.Any]
  
  @js.native
  trait CallbacksOption extends StObject {
    
    var attribute: js.UndefOr[js.Function2[/* name */ String, /* value */ js.Any, Unit]] = js.native
    
    var cdata: js.UndefOr[js.Function1[/* content */ String, Unit]] = js.native
    
    var closeElement: js.UndefOr[js.Function1[/* name */ String, Unit]] = js.native
    
    var closeOpenedElement: js.UndefOr[
        js.Function3[/* tagName */ String, /* token */ Token, /* isUnary */ Boolean, Unit]
      ] = js.native
    
    var comment: js.UndefOr[js.Function1[/* content */ String, Unit]] = js.native
    
    var docType: js.UndefOr[js.Function1[/* content */ String, Unit]] = js.native
    
    var openElement: js.UndefOr[js.Function1[/* tagName */ String, Unit]] = js.native
    
    var text: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.native
    
    var xmlProlog: js.UndefOr[js.Function0[Unit]] = js.native
  }
  object CallbacksOption {
    
    @scala.inline
    def apply(): CallbacksOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CallbacksOption]
    }
    
    @scala.inline
    implicit class CallbacksOptionMutableBuilder[Self <: CallbacksOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttribute(value: (/* name */ String, /* value */ js.Any) => Unit): Self = StObject.set(x, "attribute", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAttributeUndefined: Self = StObject.set(x, "attribute", js.undefined)
      
      @scala.inline
      def setCdata(value: /* content */ String => Unit): Self = StObject.set(x, "cdata", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCdataUndefined: Self = StObject.set(x, "cdata", js.undefined)
      
      @scala.inline
      def setCloseElement(value: /* name */ String => Unit): Self = StObject.set(x, "closeElement", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCloseElementUndefined: Self = StObject.set(x, "closeElement", js.undefined)
      
      @scala.inline
      def setCloseOpenedElement(value: (/* tagName */ String, /* token */ Token, /* isUnary */ Boolean) => Unit): Self = StObject.set(x, "closeOpenedElement", js.Any.fromFunction3(value))
      
      @scala.inline
      def setCloseOpenedElementUndefined: Self = StObject.set(x, "closeOpenedElement", js.undefined)
      
      @scala.inline
      def setComment(value: /* content */ String => Unit): Self = StObject.set(x, "comment", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
      
      @scala.inline
      def setDocType(value: /* content */ String => Unit): Self = StObject.set(x, "docType", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDocTypeUndefined: Self = StObject.set(x, "docType", js.undefined)
      
      @scala.inline
      def setOpenElement(value: /* tagName */ String => Unit): Self = StObject.set(x, "openElement", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOpenElementUndefined: Self = StObject.set(x, "openElement", js.undefined)
      
      @scala.inline
      def setText(value: /* value */ String => Unit): Self = StObject.set(x, "text", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      @scala.inline
      def setXmlProlog(value: () => Unit): Self = StObject.set(x, "xmlProlog", js.Any.fromFunction0(value))
      
      @scala.inline
      def setXmlPrologUndefined: Self = StObject.set(x, "xmlProlog", js.undefined)
    }
  }
  
  @js.native
  trait RegExpOptions extends StObject {
    
    var attribute: js.UndefOr[RegExp] = js.native
    
    var name: js.UndefOr[RegExp] = js.native
  }
  object RegExpOptions {
    
    @scala.inline
    def apply(): RegExpOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RegExpOptions]
    }
    
    @scala.inline
    implicit class RegExpOptionsMutableBuilder[Self <: RegExpOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttribute(value: RegExp): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributeUndefined: Self = StObject.set(x, "attribute", js.undefined)
      
      @scala.inline
      def setName(value: RegExp): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  @js.native
  trait RemovalCallback extends StObject {
    
    var attributes: Callback | js.Array[String] = js.native
    
    var comments: Callback | Boolean = js.native
    
    var docTypes: Callback | Boolean = js.native
    
    var elements: Callback | js.Array[String] = js.native
  }
  object RemovalCallback {
    
    @scala.inline
    def apply(
      attributes: Callback | js.Array[String],
      comments: Callback | Boolean,
      docTypes: Callback | Boolean,
      elements: Callback | js.Array[String]
    ): RemovalCallback = {
      val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], comments = comments.asInstanceOf[js.Any], docTypes = docTypes.asInstanceOf[js.Any], elements = elements.asInstanceOf[js.Any])
      __obj.asInstanceOf[RemovalCallback]
    }
    
    @scala.inline
    implicit class RemovalCallbackMutableBuilder[Self <: RemovalCallback] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(value: Callback | js.Array[String]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesFunction1(value: /* arg */ js.Any => js.Any): Self = StObject.set(x, "attributes", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAttributesVarargs(value: String*): Self = StObject.set(x, "attributes", js.Array(value :_*))
      
      @scala.inline
      def setComments(value: Callback | Boolean): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommentsFunction1(value: /* arg */ js.Any => js.Any): Self = StObject.set(x, "comments", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDocTypes(value: Callback | Boolean): Self = StObject.set(x, "docTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDocTypesFunction1(value: /* arg */ js.Any => js.Any): Self = StObject.set(x, "docTypes", js.Any.fromFunction1(value))
      
      @scala.inline
      def setElements(value: Callback | js.Array[String]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementsFunction1(value: /* arg */ js.Any => js.Any): Self = StObject.set(x, "elements", js.Any.fromFunction1(value))
      
      @scala.inline
      def setElementsVarargs(value: String*): Self = StObject.set(x, "elements", js.Array(value :_*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.htmlParser.htmlParserStrings.Greaterthansign
    - typings.htmlParser.htmlParserStrings.SlashGreaterthansign
    - typings.htmlParser.htmlParserStrings.QuestionmarkGreaterthansign
  */
  trait Token extends StObject
  object Token {
    
    @scala.inline
    def Greaterthansign: typings.htmlParser.htmlParserStrings.Greaterthansign = ">".asInstanceOf[typings.htmlParser.htmlParserStrings.Greaterthansign]
    
    @scala.inline
    def QuestionmarkGreaterthansign: typings.htmlParser.htmlParserStrings.QuestionmarkGreaterthansign = "?>".asInstanceOf[typings.htmlParser.htmlParserStrings.QuestionmarkGreaterthansign]
    
    @scala.inline
    def SlashGreaterthansign: typings.htmlParser.htmlParserStrings.SlashGreaterthansign = "/>".asInstanceOf[typings.htmlParser.htmlParserStrings.SlashGreaterthansign]
  }
}
