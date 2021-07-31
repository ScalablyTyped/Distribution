package typings.layuiSrc.layui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LayerConfigOptions
  extends StObject
     with LayerOptions {
  
  var extend: js.UndefOr[js.Array[String]] = js.undefined
  
  // 初始化全局配置
  var path: js.UndefOr[String] = js.undefined
}
object LayerConfigOptions {
  
  @scala.inline
  def apply(): LayerConfigOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayerConfigOptions]
  }
  
  @scala.inline
  implicit class LayerConfigOptionsMutableBuilder[Self <: LayerConfigOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtend(value: js.Array[String]): Self = StObject.set(x, "extend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtendUndefined: Self = StObject.set(x, "extend", js.undefined)
    
    @scala.inline
    def setExtendVarargs(value: String*): Self = StObject.set(x, "extend", js.Array(value :_*))
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
  }
}
