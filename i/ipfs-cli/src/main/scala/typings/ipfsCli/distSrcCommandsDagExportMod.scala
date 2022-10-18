package typings.ipfsCli

import org.scalablytyped.runtime.Shortcut
import typings.ipfsCli.distSrcTypesMod.Context
import typings.yargs.mod.CommandModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCommandsDagExportMod extends Shortcut {
  
  /**
    * @typedef {object} Argv
    * @property {import('../../types').Context} Argv.ctx
    * @property {string} Argv.rootcid
    * @property {number} Argv.timeout
    */
  /** @type {import('yargs').CommandModule<Argv, Argv>} */
  @JSImport("ipfs-cli/dist/src/commands/dag/export", JSImport.Default)
  @js.native
  val default: CommandModule[Argv, Argv] = js.native
  
  trait Argv extends StObject {
    
    var ctx: Context
    
    var rootcid: String
    
    var timeout: Double
  }
  object Argv {
    
    inline def apply(ctx: Context, rootcid: String, timeout: Double): Argv = {
      val __obj = js.Dynamic.literal(ctx = ctx.asInstanceOf[js.Any], rootcid = rootcid.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
      __obj.asInstanceOf[Argv]
    }
    
    extension [Self <: Argv](x: Self) {
      
      inline def setCtx(value: Context): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
      
      inline def setRootcid(value: String): Self = StObject.set(x, "rootcid", value.asInstanceOf[js.Any])
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = CommandModule[Argv, Argv]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcCommandsDagExportMod.foo` */
  override def _to: CommandModule[Argv, Argv] = default
}
