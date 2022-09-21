package typings.jss.mod

import typings.jss.jssBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Plugin extends StObject {
  
  var onChangeValue: js.UndefOr[
    js.Function3[/* value */ String, /* prop */ String, /* rule */ Rule, String | Null | `false`]
  ] = js.undefined
  
  var onCreateRule: js.UndefOr[
    js.Function3[/* name */ String, /* decl */ JssStyle[Any, Unit], /* options */ RuleOptions, Rule]
  ] = js.undefined
  
  var onProcessRule: js.UndefOr[
    js.Function2[
      /* rule */ Rule, 
      /* sheet */ js.UndefOr[StyleSheet[String | Double | js.Symbol]], 
      Unit
    ]
  ] = js.undefined
  
  var onProcessSheet: js.UndefOr[
    js.Function1[/* sheet */ js.UndefOr[StyleSheet[String | Double | js.Symbol]], Unit]
  ] = js.undefined
  
  var onProcessStyle: js.UndefOr[
    js.Function3[
      /* style */ JssStyle[Any, Unit], 
      /* rule */ Rule, 
      /* sheet */ js.UndefOr[StyleSheet[String | Double | js.Symbol]], 
      JssStyle[Any, Unit]
    ]
  ] = js.undefined
  
  var onUpdate: js.UndefOr[
    js.Function3[
      /* data */ js.Object, 
      /* rule */ Rule, 
      /* sheet */ js.UndefOr[StyleSheet[String | Double | js.Symbol]], 
      Unit
    ]
  ] = js.undefined
}
object Plugin {
  
  inline def apply(): Plugin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Plugin]
  }
  
  extension [Self <: Plugin](x: Self) {
    
    inline def setOnChangeValue(value: (/* value */ String, /* prop */ String, /* rule */ Rule) => String | Null | `false`): Self = StObject.set(x, "onChangeValue", js.Any.fromFunction3(value))
    
    inline def setOnChangeValueUndefined: Self = StObject.set(x, "onChangeValue", js.undefined)
    
    inline def setOnCreateRule(value: (/* name */ String, /* decl */ JssStyle[Any, Unit], /* options */ RuleOptions) => Rule): Self = StObject.set(x, "onCreateRule", js.Any.fromFunction3(value))
    
    inline def setOnCreateRuleUndefined: Self = StObject.set(x, "onCreateRule", js.undefined)
    
    inline def setOnProcessRule(value: (/* rule */ Rule, /* sheet */ js.UndefOr[StyleSheet[String | Double | js.Symbol]]) => Unit): Self = StObject.set(x, "onProcessRule", js.Any.fromFunction2(value))
    
    inline def setOnProcessRuleUndefined: Self = StObject.set(x, "onProcessRule", js.undefined)
    
    inline def setOnProcessSheet(value: /* sheet */ js.UndefOr[StyleSheet[String | Double | js.Symbol]] => Unit): Self = StObject.set(x, "onProcessSheet", js.Any.fromFunction1(value))
    
    inline def setOnProcessSheetUndefined: Self = StObject.set(x, "onProcessSheet", js.undefined)
    
    inline def setOnProcessStyle(
      value: (/* style */ JssStyle[Any, Unit], /* rule */ Rule, /* sheet */ js.UndefOr[StyleSheet[String | Double | js.Symbol]]) => JssStyle[Any, Unit]
    ): Self = StObject.set(x, "onProcessStyle", js.Any.fromFunction3(value))
    
    inline def setOnProcessStyleUndefined: Self = StObject.set(x, "onProcessStyle", js.undefined)
    
    inline def setOnUpdate(
      value: (/* data */ js.Object, /* rule */ Rule, /* sheet */ js.UndefOr[StyleSheet[String | Double | js.Symbol]]) => Unit
    ): Self = StObject.set(x, "onUpdate", js.Any.fromFunction3(value))
    
    inline def setOnUpdateUndefined: Self = StObject.set(x, "onUpdate", js.undefined)
  }
}
