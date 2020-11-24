package typings.hexo.mod.extend.Generator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Return extends js.Object {
  
  var data: js.Any = js.native
  
  /**
    * Layout. Specify the layouts for rendering. The value can be a string or an array. If it’s ignored then the route will return data directly.
    */
  var layout: String | js.Array[String] = js.native
  
  /**
    * Path not including the prefixing `/` .
    */
  var path: String = js.native
}
object Return {
  
  @scala.inline
  def apply(data: js.Any, layout: String | js.Array[String], path: String): Return = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Return]
  }
  
  @scala.inline
  implicit class ReturnOps[Self <: Return] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayoutVarargs(value: String*): Self = this.set("layout", js.Array(value :_*))
    
    @scala.inline
    def setLayout(value: String | js.Array[String]): Self = this.set("layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
  }
}
