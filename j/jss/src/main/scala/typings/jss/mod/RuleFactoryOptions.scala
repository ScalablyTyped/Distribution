package typings.jss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleFactoryOptions extends StObject {
  
  var Renderer: js.UndefOr[typings.jss.mod.Renderer] = js.undefined
  
  var classes: js.UndefOr[js.Object] = js.undefined
  
  var generateId: js.UndefOr[GenerateId] = js.undefined
  
  var index: js.UndefOr[Double] = js.undefined
  
  var jss: js.UndefOr[Jss] = js.undefined
  
  var selector: js.UndefOr[String] = js.undefined
  
  var sheet: js.UndefOr[StyleSheet[String | Double | js.Symbol]] = js.undefined
}
object RuleFactoryOptions {
  
  inline def apply(): RuleFactoryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuleFactoryOptions]
  }
  
  extension [Self <: RuleFactoryOptions](x: Self) {
    
    inline def setClasses(value: js.Object): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    inline def setGenerateId(value: (/* rule */ Rule, /* sheet */ js.UndefOr[StyleSheet[String]]) => String): Self = StObject.set(x, "generateId", js.Any.fromFunction2(value))
    
    inline def setGenerateIdUndefined: Self = StObject.set(x, "generateId", js.undefined)
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setJss(value: Jss): Self = StObject.set(x, "jss", value.asInstanceOf[js.Any])
    
    inline def setJssUndefined: Self = StObject.set(x, "jss", js.undefined)
    
    inline def setRenderer(value: Renderer): Self = StObject.set(x, "Renderer", value.asInstanceOf[js.Any])
    
    inline def setRendererUndefined: Self = StObject.set(x, "Renderer", js.undefined)
    
    inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
    
    inline def setSheet(value: StyleSheet[String | Double | js.Symbol]): Self = StObject.set(x, "sheet", value.asInstanceOf[js.Any])
    
    inline def setSheetUndefined: Self = StObject.set(x, "sheet", js.undefined)
  }
}
