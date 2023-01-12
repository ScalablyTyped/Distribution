package typings.less.Less

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RenderOutput extends StObject {
  
  var css: String
  
  var imports: js.Array[String]
  
  var map: String
}
object RenderOutput {
  
  inline def apply(css: String, imports: js.Array[String], map: String): RenderOutput = {
    val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any], imports = imports.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RenderOutput] (val x: Self) extends AnyVal {
    
    inline def setCss(value: String): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
    
    inline def setImports(value: js.Array[String]): Self = StObject.set(x, "imports", value.asInstanceOf[js.Any])
    
    inline def setImportsVarargs(value: String*): Self = StObject.set(x, "imports", js.Array(value*))
    
    inline def setMap(value: String): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
  }
}
