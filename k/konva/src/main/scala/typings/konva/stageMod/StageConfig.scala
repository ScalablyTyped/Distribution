package typings.konva.stageMod

import typings.konva.containerMod.ContainerConfig
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StageConfig extends ContainerConfig {
  
  var container: HTMLDivElement | String = js.native
}
object StageConfig {
  
  @scala.inline
  def apply(container: HTMLDivElement | String): StageConfig = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any])
    __obj.asInstanceOf[StageConfig]
  }
  
  @scala.inline
  implicit class StageConfigOps[Self <: StageConfig] (val x: Self) extends AnyVal {
    
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
    def setContainer(value: HTMLDivElement | String): Self = this.set("container", value.asInstanceOf[js.Any])
  }
}
