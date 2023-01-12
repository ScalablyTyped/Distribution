package typings.ipfsCli

import org.scalablytyped.runtime.Shortcut
import typings.ipfsCli.distSrcTypesMod.Context
import typings.multiformats.cidMod.CID
import typings.multiformats.distTypesSrcLinkInterfaceMod.Version
import typings.yargs.mod.CommandModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCommandsBlockRmMod extends Shortcut {
  
  /**
    * @typedef {object} Argv
    * @property {import('../../types').Context} Argv.ctx
    * @property {import('multiformats/cid').CID[]} Argv.hash
    * @property {boolean} Argv.force
    * @property {boolean} Argv.quiet
    * @property {number} Argv.timeout
    */
  /** @type {import('yargs').CommandModule<Argv, Argv>} */
  @JSImport("ipfs-cli/dist/src/commands/block/rm", JSImport.Default)
  @js.native
  val default: CommandModule[Argv, Argv] = js.native
  
  trait Argv extends StObject {
    
    var ctx: Context
    
    var force: Boolean
    
    var hash: js.Array[CID[Any, Double, Double, Version]]
    
    var quiet: Boolean
    
    var timeout: Double
  }
  object Argv {
    
    inline def apply(
      ctx: Context,
      force: Boolean,
      hash: js.Array[CID[Any, Double, Double, Version]],
      quiet: Boolean,
      timeout: Double
    ): Argv = {
      val __obj = js.Dynamic.literal(ctx = ctx.asInstanceOf[js.Any], force = force.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], quiet = quiet.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
      __obj.asInstanceOf[Argv]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Argv] (val x: Self) extends AnyVal {
      
      inline def setCtx(value: Context): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
      
      inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
      
      inline def setHash(value: js.Array[CID[Any, Double, Double, Version]]): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setHashVarargs(value: (CID[Any, Double, Double, Version])*): Self = StObject.set(x, "hash", js.Array(value*))
      
      inline def setQuiet(value: Boolean): Self = StObject.set(x, "quiet", value.asInstanceOf[js.Any])
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = CommandModule[Argv, Argv]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcCommandsBlockRmMod.foo` */
  override def _to: CommandModule[Argv, Argv] = default
}
