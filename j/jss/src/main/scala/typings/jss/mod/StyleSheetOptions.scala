package typings.jss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StyleSheetOptions
  extends StObject
     with StyleSheetFactoryOptions {
  
  var Renderer: typings.jss.mod.Renderer
  
  @JSName("generateId")
  def generateId_MStyleSheetOptions(rule: Rule): String
  @JSName("generateId")
  def generateId_MStyleSheetOptions(rule: Rule, sheet: StyleSheet[String]): String
  @JSName("generateId")
  var generateId_Original: GenerateId
  
  @JSName("index")
  var index_StyleSheetOptions: Double
  
  var insertionPoint: js.UndefOr[InsertionPoint] = js.undefined
  
  var jss: Jss
}
object StyleSheetOptions {
  
  inline def apply(
    Renderer: Renderer,
    generateId: (/* rule */ Rule, /* sheet */ js.UndefOr[StyleSheet[String]]) => String,
    index: Double,
    jss: Jss
  ): StyleSheetOptions = {
    val __obj = js.Dynamic.literal(Renderer = Renderer.asInstanceOf[js.Any], generateId = js.Any.fromFunction2(generateId), index = index.asInstanceOf[js.Any], jss = jss.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleSheetOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StyleSheetOptions] (val x: Self) extends AnyVal {
    
    inline def setGenerateId(value: (/* rule */ Rule, /* sheet */ js.UndefOr[StyleSheet[String]]) => String): Self = StObject.set(x, "generateId", js.Any.fromFunction2(value))
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setInsertionPoint(value: InsertionPoint): Self = StObject.set(x, "insertionPoint", value.asInstanceOf[js.Any])
    
    inline def setInsertionPointUndefined: Self = StObject.set(x, "insertionPoint", js.undefined)
    
    inline def setJss(value: Jss): Self = StObject.set(x, "jss", value.asInstanceOf[js.Any])
    
    inline def setRenderer(value: Renderer): Self = StObject.set(x, "Renderer", value.asInstanceOf[js.Any])
  }
}
