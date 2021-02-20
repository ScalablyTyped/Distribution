package typings.griddleReact.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GriddleProps[T]
  extends GriddlePlugin
     with GriddleInitialState {
  
  var core: js.UndefOr[GriddlePlugin] = js.native
  
  var data: js.UndefOr[js.Array[T]] = js.native
  
  var plugins: js.UndefOr[js.Array[GriddlePlugin]] = js.native
  
  var storeKey: js.UndefOr[String] = js.native
}
object GriddleProps {
  
  @scala.inline
  def apply[T](): GriddleProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GriddleProps[T]]
  }
  
  @scala.inline
  implicit class GriddlePropsMutableBuilder[Self <: GriddleProps[_], T] (val x: Self with GriddleProps[T]) extends AnyVal {
    
    @scala.inline
    def setCore(value: GriddlePlugin): Self = StObject.set(x, "core", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoreUndefined: Self = StObject.set(x, "core", js.undefined)
    
    @scala.inline
    def setData(value: js.Array[T]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setDataVarargs(value: T*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    @scala.inline
    def setPlugins(value: js.Array[GriddlePlugin]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
    
    @scala.inline
    def setPluginsVarargs(value: GriddlePlugin*): Self = StObject.set(x, "plugins", js.Array(value :_*))
    
    @scala.inline
    def setStoreKey(value: String): Self = StObject.set(x, "storeKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoreKeyUndefined: Self = StObject.set(x, "storeKey", js.undefined)
  }
}
