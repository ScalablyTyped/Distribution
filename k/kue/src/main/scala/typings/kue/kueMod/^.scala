package typings.kue.kueMod

import typings.express.expressMod.Application
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("kue", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var app: Application = js.native
  var workers: js.Array[Worker] = js.native
  def createQueue(): Queue = js.native
  def createQueue(options: js.Object): Queue = js.native
}

