package typings.knockoutPreRendered

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.NumberDictionary
import typings.std.Document
import typings.std.HTMLElement
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AddDisposeCallback extends StObject {
    
    def addDisposeCallback(node: typings.std.Element, callback: js.Function): Unit
    
    def cleanNode(node: Node): typings.std.Element
    
    def removeDisposeCallback(node: typings.std.Element, callback: js.Function): Unit
    
    def removeNode(node: Node): Unit
  }
  object AddDisposeCallback {
    
    inline def apply(
      addDisposeCallback: (typings.std.Element, js.Function) => Unit,
      cleanNode: Node => typings.std.Element,
      removeDisposeCallback: (typings.std.Element, js.Function) => Unit,
      removeNode: Node => Unit
    ): AddDisposeCallback = {
      val __obj = js.Dynamic.literal(addDisposeCallback = js.Any.fromFunction2(addDisposeCallback), cleanNode = js.Any.fromFunction1(cleanNode), removeDisposeCallback = js.Any.fromFunction2(removeDisposeCallback), removeNode = js.Any.fromFunction1(removeNode))
      __obj.asInstanceOf[AddDisposeCallback]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AddDisposeCallback] (val x: Self) extends AnyVal {
      
      inline def setAddDisposeCallback(value: (typings.std.Element, js.Function) => Unit): Self = StObject.set(x, "addDisposeCallback", js.Any.fromFunction2(value))
      
      inline def setCleanNode(value: Node => typings.std.Element): Self = StObject.set(x, "cleanNode", js.Any.fromFunction1(value))
      
      inline def setRemoveDisposeCallback(value: (typings.std.Element, js.Function) => Unit): Self = StObject.set(x, "removeDisposeCallback", js.Any.fromFunction2(value))
      
      inline def setRemoveNode(value: Node => Unit): Self = StObject.set(x, "removeNode", js.Any.fromFunction1(value))
    }
  }
  
  trait AddTemplate extends StObject {
    
    def addTemplate(templateName: String, templateMarkup: String): Unit
    
    def createJavaScriptEvaluatorBlock(script: String): String
    
    def renderTemplateSource(templateSource: js.Object, bindingContext: KnockoutBindingContext, options: js.Object): js.Array[Node]
  }
  object AddTemplate {
    
    inline def apply(
      addTemplate: (String, String) => Unit,
      createJavaScriptEvaluatorBlock: String => String,
      renderTemplateSource: (js.Object, KnockoutBindingContext, js.Object) => js.Array[Node]
    ): AddTemplate = {
      val __obj = js.Dynamic.literal(addTemplate = js.Any.fromFunction2(addTemplate), createJavaScriptEvaluatorBlock = js.Any.fromFunction1(createJavaScriptEvaluatorBlock), renderTemplateSource = js.Any.fromFunction3(renderTemplateSource))
      __obj.asInstanceOf[AddTemplate]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AddTemplate] (val x: Self) extends AnyVal {
      
      inline def setAddTemplate(value: (String, String) => Unit): Self = StObject.set(x, "addTemplate", js.Any.fromFunction2(value))
      
      inline def setCreateJavaScriptEvaluatorBlock(value: String => String): Self = StObject.set(x, "createJavaScriptEvaluatorBlock", js.Any.fromFunction1(value))
      
      inline def setRenderTemplateSource(value: (js.Object, KnockoutBindingContext, js.Object) => js.Array[Node]): Self = StObject.set(x, "renderTemplateSource", js.Any.fromFunction3(value))
    }
  }
  
  @js.native
  trait ApplyMemoizedBindingsToNextSibling extends StObject {
    
    def applyMemoizedBindingsToNextSibling(bindings: Any, nodeName: String): String = js.native
    
    def ensureTemplateIsRewritten(template: String, templateEngine: KnockoutTemplateEngine, templateDocument: Document): Any = js.native
    def ensureTemplateIsRewritten(template: Node, templateEngine: KnockoutTemplateEngine, templateDocument: Document): Any = js.native
    
    def memoizeBindingAttributeSyntax(htmlString: String, templateEngine: KnockoutTemplateEngine): Any = js.native
  }
  
  trait BindingRewriteValidators extends StObject {
    
    var bindingRewriteValidators: Any
    
    def parseObjectLiteral(objectLiteralString: String): js.Array[Any]
  }
  object BindingRewriteValidators {
    
    inline def apply(bindingRewriteValidators: Any, parseObjectLiteral: String => js.Array[Any]): BindingRewriteValidators = {
      val __obj = js.Dynamic.literal(bindingRewriteValidators = bindingRewriteValidators.asInstanceOf[js.Any], parseObjectLiteral = js.Any.fromFunction1(parseObjectLiteral))
      __obj.asInstanceOf[BindingRewriteValidators]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BindingRewriteValidators] (val x: Self) extends AnyVal {
      
      inline def setBindingRewriteValidators(value: Any): Self = StObject.set(x, "bindingRewriteValidators", value.asInstanceOf[js.Any])
      
      inline def setParseObjectLiteral(value: String => js.Array[Any]): Self = StObject.set(x, "parseObjectLiteral", js.Any.fromFunction1(value))
    }
  }
  
  trait Clear extends StObject {
    
    def clear(node: typings.std.Element): Boolean
    
    def get(node: typings.std.Element, key: String): Any
    
    def getAll(node: typings.std.Element, createIfNotFound: Boolean): Any
    
    def set(node: typings.std.Element, key: String, value: Any): Unit
  }
  object Clear {
    
    inline def apply(
      clear: typings.std.Element => Boolean,
      get: (typings.std.Element, String) => Any,
      getAll: (typings.std.Element, Boolean) => Any,
      set: (typings.std.Element, String, Any) => Unit
    ): Clear = {
      val __obj = js.Dynamic.literal(clear = js.Any.fromFunction1(clear), get = js.Any.fromFunction2(get), getAll = js.Any.fromFunction2(getAll), set = js.Any.fromFunction3(set))
      __obj.asInstanceOf[Clear]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Clear] (val x: Self) extends AnyVal {
      
      inline def setClear(value: typings.std.Element => Boolean): Self = StObject.set(x, "clear", js.Any.fromFunction1(value))
      
      inline def setGet(value: (typings.std.Element, String) => Any): Self = StObject.set(x, "get", js.Any.fromFunction2(value))
      
      inline def setGetAll(value: (typings.std.Element, Boolean) => Any): Self = StObject.set(x, "getAll", js.Any.fromFunction2(value))
      
      inline def setSet(value: (typings.std.Element, String, Any) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction3(value))
    }
  }
  
  trait ControlsDescendantBindings extends StObject {
    
    var controlsDescendantBindings: Boolean
  }
  object ControlsDescendantBindings {
    
    inline def apply(controlsDescendantBindings: Boolean): ControlsDescendantBindings = {
      val __obj = js.Dynamic.literal(controlsDescendantBindings = controlsDescendantBindings.asInstanceOf[js.Any])
      __obj.asInstanceOf[ControlsDescendantBindings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ControlsDescendantBindings] (val x: Self) extends AnyVal {
      
      inline def setControlsDescendantBindings(value: Boolean): Self = StObject.set(x, "controlsDescendantBindings", value.asInstanceOf[js.Any])
    }
  }
  
  trait Dictindex
    extends StObject
       with /* index */ NumberDictionary[Node] {
    
    var length: Double
  }
  object Dictindex {
    
    inline def apply(length: Double): Dictindex = {
      val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dictindex]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Dictindex] (val x: Self) extends AnyVal {
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    }
  }
  
  trait Element extends StObject {
    
    var element: Node
  }
  object Element {
    
    inline def apply(element: Node): Element = {
      val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[Element]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Element] (val x: Self) extends AnyVal {
      
      inline def setElement(value: Node): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Instance
    extends StObject
       with Instantiable0[KnockoutNativeTemplateEngine] {
    
    var instance: KnockoutNativeTemplateEngine = js.native
  }
  
  @js.native
  trait Instantiable
    extends StObject
       with Instantiable1[/* element */ typings.std.Element, KnockoutTemplateSourcesDomElement]
  
  @js.native
  trait InstantiableInstance
    extends StObject
       with Instantiable0[KnockoutBindingProvider] {
    
    var instance: KnockoutBindingProvider = js.native
  }
  
  @js.native
  trait InstantiableKnockoutTemplateAnonymous
    extends StObject
       with Instantiable1[/* element */ typings.std.Element, KnockoutTemplateAnonymous]
  
  @js.native
  trait InstantiableKnockoutTemplateEngine
    extends StObject
       with Instantiable0[KnockoutTemplateEngine]
  
  trait Method extends StObject {
    
    var method: js.UndefOr[String] = js.undefined
    
    var timeout: Double
  }
  object Method {
    
    inline def apply(timeout: Double): Method = {
      val __obj = js.Dynamic.literal(timeout = timeout.asInstanceOf[js.Any])
      __obj.asInstanceOf[Method]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Method] (val x: Self) extends AnyVal {
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    }
  }
  
  trait ReadValue extends StObject {
    
    def readValue(element: HTMLElement): Any
    
    def writeValue(element: HTMLElement, value: Any): Unit
  }
  object ReadValue {
    
    inline def apply(readValue: HTMLElement => Any, writeValue: (HTMLElement, Any) => Unit): ReadValue = {
      val __obj = js.Dynamic.literal(readValue = js.Any.fromFunction1(readValue), writeValue = js.Any.fromFunction2(writeValue))
      __obj.asInstanceOf[ReadValue]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReadValue] (val x: Self) extends AnyVal {
      
      inline def setReadValue(value: HTMLElement => Any): Self = StObject.set(x, "readValue", js.Any.fromFunction1(value))
      
      inline def setWriteValue(value: (HTMLElement, Any) => Unit): Self = StObject.set(x, "writeValue", js.Any.fromFunction2(value))
    }
  }
}
