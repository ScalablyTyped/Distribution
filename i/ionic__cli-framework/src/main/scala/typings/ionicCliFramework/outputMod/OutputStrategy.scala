package typings.ionicCliFramework.outputMod

import typings.ionicCliFramework.tasksMod.TaskChain
import typings.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutputStrategy extends js.Object {
  val stream: WritableStream
  def createTaskChain(): TaskChain
}

object OutputStrategy {
  @scala.inline
  def apply(createTaskChain: () => TaskChain, stream: WritableStream): OutputStrategy = {
    val __obj = js.Dynamic.literal(createTaskChain = js.Any.fromFunction0(createTaskChain), stream = stream.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OutputStrategy]
  }
}

