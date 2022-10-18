package typings.ipfsCli

import org.scalablytyped.runtime.Shortcut
import typings.ipfsCli.distSrcTypesMod.Context
import typings.yargs.mod.CommandModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCommandsResolveMod extends Shortcut {
  
  /**
    * @typedef {object} Argv
    * @property {import('../types').Context} Argv.ctx
    * @property {string} Argv.name
    * @property {boolean} Argv.recursive
    * @property {string} Argv.cidBase
    * @property {number} Argv.timeout
    */
  /** @type {import('yargs').CommandModule<Argv, Argv>} */
  @JSImport("ipfs-cli/dist/src/commands/resolve", JSImport.Default)
  @js.native
  val default: CommandModule[Argv, Argv] = js.native
  
  trait Argv extends StObject {
    
    var cidBase: String
    
    var ctx: Context
    
    var name: String
    
    var recursive: Boolean
    
    var timeout: Double
  }
  object Argv {
    
    inline def apply(cidBase: String, ctx: Context, name: String, recursive: Boolean, timeout: Double): Argv = {
      val __obj = js.Dynamic.literal(cidBase = cidBase.asInstanceOf[js.Any], ctx = ctx.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], recursive = recursive.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
      __obj.asInstanceOf[Argv]
    }
    
    extension [Self <: Argv](x: Self) {
      
      inline def setCidBase(value: String): Self = StObject.set(x, "cidBase", value.asInstanceOf[js.Any])
      
      inline def setCtx(value: Context): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = CommandModule[Argv, Argv]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcCommandsResolveMod.foo` */
  override def _to: CommandModule[Argv, Argv] = default
}
