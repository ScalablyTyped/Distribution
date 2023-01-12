package typings.knockout.mod

import typings.knockout.mod.utils.MappingOptions
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BindingTemplateOptions
  extends StObject
     with TemplateOptions[Any]
     with MappingOptions[Any] {
  
  var as: js.UndefOr[String] = js.undefined
  
  var data: js.UndefOr[Any] = js.undefined
  
  var foreach: js.UndefOr[js.Array[Any]] = js.undefined
  
  var `if`: js.UndefOr[Boolean] = js.undefined
  
  var ifnot: js.UndefOr[Boolean] = js.undefined
  
  var includeDestroyed: js.UndefOr[Boolean] = js.undefined
  
  var name: js.UndefOr[String | (js.Function1[/* val */ Any, String])] = js.undefined
  
  var nodes: js.UndefOr[js.Array[Node]] = js.undefined
}
object BindingTemplateOptions {
  
  inline def apply(): BindingTemplateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BindingTemplateOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BindingTemplateOptions] (val x: Self) extends AnyVal {
    
    inline def setAs(value: String): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setForeach(value: js.Array[Any]): Self = StObject.set(x, "foreach", value.asInstanceOf[js.Any])
    
    inline def setForeachUndefined: Self = StObject.set(x, "foreach", js.undefined)
    
    inline def setForeachVarargs(value: Any*): Self = StObject.set(x, "foreach", js.Array(value*))
    
    inline def setIf(value: Boolean): Self = StObject.set(x, "if", value.asInstanceOf[js.Any])
    
    inline def setIfUndefined: Self = StObject.set(x, "if", js.undefined)
    
    inline def setIfnot(value: Boolean): Self = StObject.set(x, "ifnot", value.asInstanceOf[js.Any])
    
    inline def setIfnotUndefined: Self = StObject.set(x, "ifnot", js.undefined)
    
    inline def setIncludeDestroyed(value: Boolean): Self = StObject.set(x, "includeDestroyed", value.asInstanceOf[js.Any])
    
    inline def setIncludeDestroyedUndefined: Self = StObject.set(x, "includeDestroyed", js.undefined)
    
    inline def setName(value: String | (js.Function1[/* val */ Any, String])): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameFunction1(value: /* val */ Any => String): Self = StObject.set(x, "name", js.Any.fromFunction1(value))
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNodes(value: js.Array[Node]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setNodesUndefined: Self = StObject.set(x, "nodes", js.undefined)
    
    inline def setNodesVarargs(value: Node*): Self = StObject.set(x, "nodes", js.Array(value*))
  }
}
