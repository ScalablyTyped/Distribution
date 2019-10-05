package typings.localDashDynamo.localDashDynamoMod

import typings.node.childUnderscoreProcessMod.ChildProcess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("local-dynamo", "launch")
@js.native
object launch extends js.Object {
  def apply(): ChildProcess = js.native
  def apply(options: String): ChildProcess = js.native
  def apply(options: String, port: Double): ChildProcess = js.native
  def apply(options: Options): ChildProcess = js.native
  def apply(options: Options, port: Double): ChildProcess = js.native
}

