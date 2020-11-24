package typings.ionicUtilsFs.mod

import typings.node.fsMod.BigIntOptions
import typings.node.fsMod.PathLike
import typings.node.fsMod.StatOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/utils-fs", "statSync")
@js.native
object statSync extends js.Object {
  
  def apply(path: PathLike): typings.node.fsMod.Stats = js.native
  def apply(path: PathLike, options: BigIntOptions): typings.node.fsMod.BigIntStats = js.native
  def apply(path: PathLike, options: StatOptions): typings.node.fsMod.Stats | typings.node.fsMod.BigIntStats = js.native
}
