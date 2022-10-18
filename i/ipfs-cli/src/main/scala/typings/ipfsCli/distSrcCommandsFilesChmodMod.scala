package typings.ipfsCli

import org.scalablytyped.runtime.Shortcut
import typings.ipfsCli.distSrcTypesMod.Context
import typings.yargs.mod.CommandModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCommandsFilesChmodMod extends Shortcut {
  
  /**
    * @typedef {object} Argv
    * @property {import('../../types').Context} Argv.ctx
    * @property {string} Argv.path
    * @property {number} Argv.mode
    * @property {boolean} Argv.recursive
    * @property {string} Argv.hashAlg
    * @property {boolean} Argv.flush
    * @property {number} Argv.shardSplitThreshold
    * @property {number} Argv.timeout
    */
  /** @type {import('yargs').CommandModule<Argv, Argv>} */
  @JSImport("ipfs-cli/dist/src/commands/files/chmod", JSImport.Default)
  @js.native
  val default: CommandModule[Argv, Argv] = js.native
  
  trait Argv extends StObject {
    
    var ctx: Context
    
    var flush: Boolean
    
    var hashAlg: String
    
    var mode: Double
    
    var path: String
    
    var recursive: Boolean
    
    var shardSplitThreshold: Double
    
    var timeout: Double
  }
  object Argv {
    
    inline def apply(
      ctx: Context,
      flush: Boolean,
      hashAlg: String,
      mode: Double,
      path: String,
      recursive: Boolean,
      shardSplitThreshold: Double,
      timeout: Double
    ): Argv = {
      val __obj = js.Dynamic.literal(ctx = ctx.asInstanceOf[js.Any], flush = flush.asInstanceOf[js.Any], hashAlg = hashAlg.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], recursive = recursive.asInstanceOf[js.Any], shardSplitThreshold = shardSplitThreshold.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
      __obj.asInstanceOf[Argv]
    }
    
    extension [Self <: Argv](x: Self) {
      
      inline def setCtx(value: Context): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
      
      inline def setFlush(value: Boolean): Self = StObject.set(x, "flush", value.asInstanceOf[js.Any])
      
      inline def setHashAlg(value: String): Self = StObject.set(x, "hashAlg", value.asInstanceOf[js.Any])
      
      inline def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
      
      inline def setShardSplitThreshold(value: Double): Self = StObject.set(x, "shardSplitThreshold", value.asInstanceOf[js.Any])
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = CommandModule[Argv, Argv]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcCommandsFilesChmodMod.foo` */
  override def _to: CommandModule[Argv, Argv] = default
}
