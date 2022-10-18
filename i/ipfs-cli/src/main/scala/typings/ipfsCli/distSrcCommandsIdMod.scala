package typings.ipfsCli

import org.scalablytyped.runtime.Shortcut
import typings.ipfsCli.distSrcTypesMod.Context
import typings.libp2pInterfacePeerId.mod.PeerId
import typings.yargs.mod.CommandModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCommandsIdMod extends Shortcut {
  
  /**
    * @typedef {object} Argv
    * @property {import('../types').Context} Argv.ctx
    * @property {string} Argv.format
    * @property {number} Argv.timeout
    * @property {import('@libp2p/interface-peer-id').PeerId} [Argv.peerId]
    */
  /** @type {import('yargs').CommandModule<Argv, Argv>} */
  @JSImport("ipfs-cli/dist/src/commands/id", JSImport.Default)
  @js.native
  val default: CommandModule[Argv, Argv] = js.native
  
  trait Argv extends StObject {
    
    var ctx: Context
    
    var format: String
    
    var peerId: js.UndefOr[PeerId] = js.undefined
    
    var timeout: Double
  }
  object Argv {
    
    inline def apply(ctx: Context, format: String, timeout: Double): Argv = {
      val __obj = js.Dynamic.literal(ctx = ctx.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
      __obj.asInstanceOf[Argv]
    }
    
    extension [Self <: Argv](x: Self) {
      
      inline def setCtx(value: Context): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setPeerId(value: PeerId): Self = StObject.set(x, "peerId", value.asInstanceOf[js.Any])
      
      inline def setPeerIdUndefined: Self = StObject.set(x, "peerId", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = CommandModule[Argv, Argv]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcCommandsIdMod.foo` */
  override def _to: CommandModule[Argv, Argv] = default
}
