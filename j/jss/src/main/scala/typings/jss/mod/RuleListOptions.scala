package typings.jss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleListOptions extends StObject {
  
  var Renderer: typings.jss.mod.Renderer
  
  var classes: Classes[String]
  
  def generateClassName(rule: Rule): String
  def generateClassName(rule: Rule, sheet: StyleSheet[String]): String
  @JSName("generateClassName")
  var generateClassName_Original: GenerateId
  
  var jss: Jss
  
  var parent: ContainerRule | (StyleSheet[String | Double | js.Symbol])
  
  var sheet: StyleSheet[String | Double | js.Symbol]
}
object RuleListOptions {
  
  inline def apply(
    Renderer: Renderer,
    classes: Classes[String],
    generateClassName: (/* rule */ Rule, /* sheet */ js.UndefOr[StyleSheet[String]]) => String,
    jss: Jss,
    parent: ContainerRule | (StyleSheet[String | Double | js.Symbol]),
    sheet: StyleSheet[String | Double | js.Symbol]
  ): RuleListOptions = {
    val __obj = js.Dynamic.literal(Renderer = Renderer.asInstanceOf[js.Any], classes = classes.asInstanceOf[js.Any], generateClassName = js.Any.fromFunction2(generateClassName), jss = jss.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], sheet = sheet.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleListOptions]
  }
  
  extension [Self <: RuleListOptions](x: Self) {
    
    inline def setClasses(value: Classes[String]): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    inline def setGenerateClassName(value: (/* rule */ Rule, /* sheet */ js.UndefOr[StyleSheet[String]]) => String): Self = StObject.set(x, "generateClassName", js.Any.fromFunction2(value))
    
    inline def setJss(value: Jss): Self = StObject.set(x, "jss", value.asInstanceOf[js.Any])
    
    inline def setParent(value: ContainerRule | (StyleSheet[String | Double | js.Symbol])): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setRenderer(value: Renderer): Self = StObject.set(x, "Renderer", value.asInstanceOf[js.Any])
    
    inline def setSheet(value: StyleSheet[String | Double | js.Symbol]): Self = StObject.set(x, "sheet", value.asInstanceOf[js.Any])
  }
}
