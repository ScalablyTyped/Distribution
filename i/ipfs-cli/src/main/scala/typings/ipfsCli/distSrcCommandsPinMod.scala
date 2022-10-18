package typings.ipfsCli

import org.scalablytyped.runtime.Shortcut
import typings.yargs.mod.CommandModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCommandsPinMod extends Shortcut {
  
  /** @type {import('yargs').CommandModule} */
  @JSImport("ipfs-cli/dist/src/commands/pin", JSImport.Default)
  @js.native
  val default: CommandModule[js.Object, js.Object] = js.native
  
  type _To = CommandModule[js.Object, js.Object]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcCommandsPinMod.foo` */
  override def _to: CommandModule[js.Object, js.Object] = default
}
