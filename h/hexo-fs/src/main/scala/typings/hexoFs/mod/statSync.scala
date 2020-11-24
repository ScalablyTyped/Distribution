package typings.hexoFs.mod

import typings.node.fsMod.BigIntOptions
import typings.node.fsMod.BigIntStats
import typings.node.fsMod.PathLike
import typings.node.fsMod.StatOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hexo-fs", "statSync")
@js.native
object statSync extends js.Object {
  
  def apply(path: PathLike): typings.node.fsMod.Stats = js.native
  def apply(path: PathLike, options: BigIntOptions): BigIntStats = js.native
  def apply(path: PathLike, options: StatOptions): typings.node.fsMod.Stats | BigIntStats = js.native
}
