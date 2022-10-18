package typings.ipfsCli

import org.scalablytyped.runtime.Shortcut
import typings.ipfsCli.distSrcCommandsBitswapStatMod.Argv
import typings.yargs.mod.CommandModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCommandsStatsRepoMod extends Shortcut {
  
  /** @type {repoStats} */
  @JSImport("ipfs-cli/dist/src/commands/stats/repo", JSImport.Default)
  @js.native
  val default: CommandModule[Argv, Argv] = js.native
  
  type _To = CommandModule[Argv, Argv]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcCommandsStatsRepoMod.foo` */
  override def _to: CommandModule[Argv, Argv] = default
}
