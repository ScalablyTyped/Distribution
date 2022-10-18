package typings.ipfsCli

import org.scalablytyped.runtime.Shortcut
import typings.ipfsCli.distSrcTypesMod.Context
import typings.yargs.mod.CommandModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCommandsFilesStatMod extends Shortcut {
  
  /**
    * @typedef {object} Argv
    * @property {import('../../types').Context} Argv.ctx
    * @property {string} Argv.path
    * @property {string} Argv.format
    * @property {boolean} Argv.hash
    * @property {boolean} Argv.size
    * @property {boolean} Argv.withLocal
    * @property {string} Argv.cidBase
    * @property {number} Argv.timeout
    */
  /** @type {import('yargs').CommandModule<Argv, Argv>} */
  @JSImport("ipfs-cli/dist/src/commands/files/stat", JSImport.Default)
  @js.native
  val default: CommandModule[Argv, Argv] = js.native
  
  trait Argv extends StObject {
    
    var cidBase: String
    
    var ctx: Context
    
    var format: String
    
    var hash: Boolean
    
    var path: String
    
    var size: Boolean
    
    var timeout: Double
    
    var withLocal: Boolean
  }
  object Argv {
    
    inline def apply(
      cidBase: String,
      ctx: Context,
      format: String,
      hash: Boolean,
      path: String,
      size: Boolean,
      timeout: Double,
      withLocal: Boolean
    ): Argv = {
      val __obj = js.Dynamic.literal(cidBase = cidBase.asInstanceOf[js.Any], ctx = ctx.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any], withLocal = withLocal.asInstanceOf[js.Any])
      __obj.asInstanceOf[Argv]
    }
    
    extension [Self <: Argv](x: Self) {
      
      inline def setCidBase(value: String): Self = StObject.set(x, "cidBase", value.asInstanceOf[js.Any])
      
      inline def setCtx(value: Context): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setHash(value: Boolean): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Boolean): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setWithLocal(value: Boolean): Self = StObject.set(x, "withLocal", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = CommandModule[Argv, Argv]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcCommandsFilesStatMod.foo` */
  override def _to: CommandModule[Argv, Argv] = default
}
