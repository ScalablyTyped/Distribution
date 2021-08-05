package typings.jqueryValidationUnobtrusive

import typings.jquery.JQuery
import typings.std.Array
import typings.std.Document
import typings.std.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MicrosoftJQueryUnobtrusiveValidation {
  
  trait Adapter extends StObject {
    
    var adapt: js.Function
    
    var name: String
    
    var params: js.Array[String]
  }
  object Adapter {
    
    inline def apply(adapt: js.Function, name: String, params: js.Array[String]): Adapter = {
      val __obj = js.Dynamic.literal(adapt = adapt.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
      __obj.asInstanceOf[Adapter]
    }
    
    extension [Self <: Adapter](x: Self) {
      
      inline def setAdapt(value: js.Function): Self = StObject.set(x, "adapt", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setParams(value: js.Array[String]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsVarargs(value: String*): Self = StObject.set(x, "params", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Adapters
    extends StObject
       with Array[Adapter] {
    
    def add(adapterName: String, fn: js.Function): Adapters = js.native
    def add(adapterName: String, params: js.Array[String], fn: js.Function): Adapters = js.native
    
    def addBool(adapterName: String): Adapters = js.native
    def addBool(adapterName: String, ruleName: String): Adapters = js.native
    
    def addMethod(
      adapterName: String,
      fn: js.Function3[/* value */ String, /* element */ Element, /* params */ js.Any, js.Any]
    ): Adapters = js.native
    
    def addMinMax(adapterName: String, minRuleName: String, maxRuleName: String, minMaxRuleName: String): Adapters = js.native
    def addMinMax(
      adapterName: String,
      minRuleName: String,
      maxRuleName: String,
      minMaxRuleName: String,
      minAttribute: String
    ): Adapters = js.native
    def addMinMax(
      adapterName: String,
      minRuleName: String,
      maxRuleName: String,
      minMaxRuleName: String,
      minAttribute: String,
      maxAttribute: String
    ): Adapters = js.native
    def addMinMax(
      adapterName: String,
      minRuleName: String,
      maxRuleName: String,
      minMaxRuleName: String,
      minAttribute: Unit,
      maxAttribute: String
    ): Adapters = js.native
    
    def addSingleVal(adapterName: String, attribute: String, ruleName: String): Adapters = js.native
    def addSingleVal(adapterName: String, ruleName: String): Adapters = js.native
  }
  
  type JQuerySelector = String | Document | Element | JQuery[HTMLElement]
  
  @js.native
  trait Validator extends StObject {
    
    var adapters: Adapters = js.native
    
    def parse(selector: JQuerySelector): Unit = js.native
    
    def parseElement(element: JQuerySelector): Unit = js.native
    def parseElement(element: JQuerySelector, skipAttach: Boolean): Unit = js.native
  }
}
