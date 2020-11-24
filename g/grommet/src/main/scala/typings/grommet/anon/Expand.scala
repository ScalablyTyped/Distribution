package typings.grommet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Expand extends js.Object {
  
  var expand: js.Array[String] = js.native
  
  def onExpand(expandedKeys: js.Array[String]): Unit = js.native
  
  var property: String = js.native
}
object Expand {
  
  @scala.inline
  def apply(expand: js.Array[String], onExpand: js.Array[String] => Unit, property: String): Expand = {
    val __obj = js.Dynamic.literal(expand = expand.asInstanceOf[js.Any], onExpand = js.Any.fromFunction1(onExpand), property = property.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expand]
  }
  
  @scala.inline
  implicit class ExpandOps[Self <: Expand] (val x: Self) extends AnyVal {
    
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
    def setExpandVarargs(value: String*): Self = this.set("expand", js.Array(value :_*))
    
    @scala.inline
    def setExpand(value: js.Array[String]): Self = this.set("expand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnExpand(value: js.Array[String] => Unit): Self = this.set("onExpand", js.Any.fromFunction1(value))
    
    @scala.inline
    def setProperty(value: String): Self = this.set("property", value.asInstanceOf[js.Any])
  }
}
