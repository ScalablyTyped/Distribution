package typings.ionicCliFramework.outputMod

import typings.ionicCliFramework.tasksMod.TaskChain
import typings.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OutputStrategy extends js.Object {
  
  def createTaskChain(): TaskChain = js.native
  
  val stream: WritableStream = js.native
}
object OutputStrategy {
  
  @scala.inline
  def apply(createTaskChain: () => TaskChain, stream: WritableStream): OutputStrategy = {
    val __obj = js.Dynamic.literal(createTaskChain = js.Any.fromFunction0(createTaskChain), stream = stream.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputStrategy]
  }
  
  @scala.inline
  implicit class OutputStrategyOps[Self <: OutputStrategy] (val x: Self) extends AnyVal {
    
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
    def setCreateTaskChain(value: () => TaskChain): Self = this.set("createTaskChain", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStream(value: WritableStream): Self = this.set("stream", value.asInstanceOf[js.Any])
  }
}
