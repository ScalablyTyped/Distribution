package typings.ipfsCore.anon

import typings.ipfsCore.configMod.IPFSConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Description extends js.Object {
  
  var description: String = js.native
  
  def transform(config: IPFSConfig): IPFSConfig = js.native
}
object Description {
  
  @scala.inline
  def apply(description: String, transform: IPFSConfig => IPFSConfig): Description = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], transform = js.Any.fromFunction1(transform))
    __obj.asInstanceOf[Description]
  }
  
  @scala.inline
  implicit class DescriptionOps[Self <: Description] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransform(value: IPFSConfig => IPFSConfig): Self = this.set("transform", js.Any.fromFunction1(value))
  }
}
