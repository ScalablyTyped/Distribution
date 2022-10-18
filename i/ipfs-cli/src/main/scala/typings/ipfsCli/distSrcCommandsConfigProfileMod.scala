package typings.ipfsCli

import org.scalablytyped.runtime.Shortcut
import typings.yargs.mod.CommandModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCommandsConfigProfileMod extends Shortcut {
  
  /**
    * @typedef {import('yargs').Argv<{}>} Argv
    */
  /** @type {import('yargs').CommandModule<Argv, Argv>} */
  @JSImport("ipfs-cli/dist/src/commands/config/profile", JSImport.Default)
  @js.native
  val default: CommandModule[Argv, Argv] = js.native
  
  type Argv = typings.yargs.mod.Argv[js.Object]
  
  type _To = CommandModule[Argv, Argv]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcCommandsConfigProfileMod.foo` */
  override def _to: CommandModule[Argv, Argv] = default
}
