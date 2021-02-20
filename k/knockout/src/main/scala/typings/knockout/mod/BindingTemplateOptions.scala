package typings.knockout.mod

import typings.knockout.mod.utils.MappingOptions
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BindingTemplateOptions
  extends TemplateOptions[js.Any]
     with MappingOptions[js.Any] {
  
  var as: js.UndefOr[String] = js.native
  
  var data: js.UndefOr[js.Any] = js.native
  
  var foreach: js.UndefOr[js.Array[_]] = js.native
  
  var `if`: js.UndefOr[Boolean] = js.native
  
  var ifnot: js.UndefOr[Boolean] = js.native
  
  var includeDestroyed: js.UndefOr[Boolean] = js.native
  
  var name: js.UndefOr[String | (js.Function1[/* val */ js.Any, String])] = js.native
  
  var nodes: js.UndefOr[js.Array[Node]] = js.native
}
object BindingTemplateOptions {
  
  @scala.inline
  def apply(): BindingTemplateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BindingTemplateOptions]
  }
  
  @scala.inline
  implicit class BindingTemplateOptionsMutableBuilder[Self <: BindingTemplateOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAs(value: String): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
    
    @scala.inline
    def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setForeach(value: js.Array[_]): Self = StObject.set(x, "foreach", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForeachUndefined: Self = StObject.set(x, "foreach", js.undefined)
    
    @scala.inline
    def setForeachVarargs(value: js.Any*): Self = StObject.set(x, "foreach", js.Array(value :_*))
    
    @scala.inline
    def setIf(value: Boolean): Self = StObject.set(x, "if", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIfUndefined: Self = StObject.set(x, "if", js.undefined)
    
    @scala.inline
    def setIfnot(value: Boolean): Self = StObject.set(x, "ifnot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIfnotUndefined: Self = StObject.set(x, "ifnot", js.undefined)
    
    @scala.inline
    def setIncludeDestroyed(value: Boolean): Self = StObject.set(x, "includeDestroyed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeDestroyedUndefined: Self = StObject.set(x, "includeDestroyed", js.undefined)
    
    @scala.inline
    def setName(value: String | (js.Function1[/* val */ js.Any, String])): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameFunction1(value: /* val */ js.Any => String): Self = StObject.set(x, "name", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNodes(value: js.Array[Node]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodesUndefined: Self = StObject.set(x, "nodes", js.undefined)
    
    @scala.inline
    def setNodesVarargs(value: Node*): Self = StObject.set(x, "nodes", js.Array(value :_*))
  }
}
