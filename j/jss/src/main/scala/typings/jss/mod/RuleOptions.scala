package typings.jss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleOptions extends StObject {
  
  var Renderer: typings.jss.mod.Renderer
  
  var classes: Classes[String]
  
  def generateId(rule: Rule): String
  def generateId(rule: Rule, sheet: StyleSheet[String]): String
  @JSName("generateId")
  var generateId_Original: GenerateId
  
  var index: js.UndefOr[Double] = js.undefined
  
  var jss: Jss
  
  var parent: js.UndefOr[ContainerRule | (StyleSheet[String | Double | js.Symbol])] = js.undefined
  
  var selector: js.UndefOr[String] = js.undefined
  
  var sheet: js.UndefOr[StyleSheet[String | Double | js.Symbol]] = js.undefined
}
object RuleOptions {
  
  inline def apply(
    Renderer: Renderer,
    classes: Classes[String],
    generateId: (/* rule */ Rule, /* sheet */ js.UndefOr[StyleSheet[String]]) => String,
    jss: Jss
  ): RuleOptions = {
    val __obj = js.Dynamic.literal(Renderer = Renderer.asInstanceOf[js.Any], classes = classes.asInstanceOf[js.Any], generateId = js.Any.fromFunction2(generateId), jss = jss.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RuleOptions] (val x: Self) extends AnyVal {
    
    inline def setClasses(value: Classes[String]): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    inline def setGenerateId(value: (/* rule */ Rule, /* sheet */ js.UndefOr[StyleSheet[String]]) => String): Self = StObject.set(x, "generateId", js.Any.fromFunction2(value))
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setJss(value: Jss): Self = StObject.set(x, "jss", value.asInstanceOf[js.Any])
    
    inline def setParent(value: ContainerRule | (StyleSheet[String | Double | js.Symbol])): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRenderer(value: Renderer): Self = StObject.set(x, "Renderer", value.asInstanceOf[js.Any])
    
    inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
    
    inline def setSheet(value: StyleSheet[String | Double | js.Symbol]): Self = StObject.set(x, "sheet", value.asInstanceOf[js.Any])
    
    inline def setSheetUndefined: Self = StObject.set(x, "sheet", js.undefined)
  }
}
