package typings.ionicUtilsSubprocess.mod

import typings.node.childProcessMod.ChildProcess
import typings.node.childProcessMod.SpawnOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/utils-subprocess", "spawn")
@js.native
object spawn extends js.Object {
  
  def apply(command: String): ChildProcess = js.native
  def apply(command: String, args: js.UndefOr[scala.Nothing], options: SpawnOptions): ChildProcess = js.native
  def apply(command: String, args: js.Array[String]): ChildProcess = js.native
  def apply(command: String, args: js.Array[String], options: SpawnOptions): ChildProcess = js.native
}
