package typings.ipfsCli

import org.scalablytyped.runtime.Shortcut
import typings.ipfsCli.distSrcTypesMod.Context
import typings.yargs.mod.CommandModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCommandsCidBase32Mod extends Shortcut {
  
  /**
    * @typedef {object} Argv
    * @property {import('../../types').Context} Argv.ctx
    * @property {string[]} [Argv.cids]
    */
  /** @type {import('yargs').CommandModule<Argv, Argv>} */
  @JSImport("ipfs-cli/dist/src/commands/cid/base32", JSImport.Default)
  @js.native
  val default: CommandModule[Argv, Argv] = js.native
  
  trait Argv extends StObject {
    
    var cids: js.UndefOr[js.Array[String]] = js.undefined
    
    var ctx: Context
  }
  object Argv {
    
    inline def apply(ctx: Context): Argv = {
      val __obj = js.Dynamic.literal(ctx = ctx.asInstanceOf[js.Any])
      __obj.asInstanceOf[Argv]
    }
    
    extension [Self <: Argv](x: Self) {
      
      inline def setCids(value: js.Array[String]): Self = StObject.set(x, "cids", value.asInstanceOf[js.Any])
      
      inline def setCidsUndefined: Self = StObject.set(x, "cids", js.undefined)
      
      inline def setCidsVarargs(value: String*): Self = StObject.set(x, "cids", js.Array(value*))
      
      inline def setCtx(value: Context): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = CommandModule[Argv, Argv]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcCommandsCidBase32Mod.foo` */
  override def _to: CommandModule[Argv, Argv] = default
}
