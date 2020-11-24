package typings.grasp.anon

import typings.node.NodeJS.ErrnoException
import typings.node.fsMod.BigIntOptions
import typings.node.fsMod.BigIntStats
import typings.node.fsMod.PathLike
import typings.node.fsMod.StatOptions
import typings.node.fsMod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofstat extends js.Object {
  
  def apply(path: PathLike, callback: js.Function2[/* err */ ErrnoException | Null, /* stats */ Stats, Unit]): Unit = js.native
  def apply(
    path: PathLike,
    options: BigIntOptions,
    callback: js.Function2[/* err */ ErrnoException | Null, /* stats */ BigIntStats, Unit]
  ): Unit = js.native
  def apply(
    path: PathLike,
    options: StatOptions,
    callback: js.Function2[/* err */ ErrnoException | Null, /* stats */ Stats | BigIntStats, Unit]
  ): Unit = js.native
}
