package typings.marko.transformerMod

import typings.marko.tagMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Transformer extends js.Object {
  
  def getFunc(): js.Any = js.native
  
  var id: Double = js.native
  
  var name: String | Null = js.native
  
  var path: String | Null = js.native
  
  var priority: js.Any = js.native
  
  var properties: js.Any = js.native
  
  var tag: ^  | Null = js.native
  
  var taglibId: String = js.native
}
object Transformer {
  
  @scala.inline
  def apply(getFunc: () => js.Any, id: Double, priority: js.Any, properties: js.Any, taglibId: String): Transformer = {
    val __obj = js.Dynamic.literal(getFunc = js.Any.fromFunction0(getFunc), id = id.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], taglibId = taglibId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transformer]
  }
  
  @scala.inline
  implicit class TransformerOps[Self <: Transformer] (val x: Self) extends AnyVal {
    
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
    def setGetFunc(value: () => js.Any): Self = this.set("getFunc", js.Any.fromFunction0(value))
    
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriority(value: js.Any): Self = this.set("priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperties(value: js.Any): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaglibId(value: String): Self = this.set("taglibId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameNull: Self = this.set("name", null)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathNull: Self = this.set("path", null)
    
    @scala.inline
    def setTag(value: ^): Self = this.set("tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagNull: Self = this.set("tag", null)
  }
}
