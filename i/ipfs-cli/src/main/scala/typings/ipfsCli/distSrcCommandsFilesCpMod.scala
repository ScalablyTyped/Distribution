package typings.ipfsCli

import org.scalablytyped.runtime.Shortcut
import typings.ipfsCli.distSrcTypesMod.Context
import typings.yargs.mod.CommandModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCommandsFilesCpMod extends Shortcut {
  
  /**
    * @typedef {object} Argv
    * @property {import('../../types').Context} Argv.ctx
    * @property {string} Argv.source
    * @property {string} Argv.dest
    * @property {boolean} Argv.parents
    * @property {string} Argv.hashAlg
    * @property {boolean} Argv.flush
    * @property {number} Argv.shardSplitThreshold
    * @property {number} Argv.timeout
    */
  /** @type {import('yargs').CommandModule<Argv, Argv>} */
  @JSImport("ipfs-cli/dist/src/commands/files/cp", JSImport.Default)
  @js.native
  val default: CommandModule[Argv, Argv] = js.native
  
  trait Argv extends StObject {
    
    var ctx: Context
    
    var dest: String
    
    var flush: Boolean
    
    var hashAlg: String
    
    var parents: Boolean
    
    var shardSplitThreshold: Double
    
    var source: String
    
    var timeout: Double
  }
  object Argv {
    
    inline def apply(
      ctx: Context,
      dest: String,
      flush: Boolean,
      hashAlg: String,
      parents: Boolean,
      shardSplitThreshold: Double,
      source: String,
      timeout: Double
    ): Argv = {
      val __obj = js.Dynamic.literal(ctx = ctx.asInstanceOf[js.Any], dest = dest.asInstanceOf[js.Any], flush = flush.asInstanceOf[js.Any], hashAlg = hashAlg.asInstanceOf[js.Any], parents = parents.asInstanceOf[js.Any], shardSplitThreshold = shardSplitThreshold.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
      __obj.asInstanceOf[Argv]
    }
    
    extension [Self <: Argv](x: Self) {
      
      inline def setCtx(value: Context): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
      
      inline def setDest(value: String): Self = StObject.set(x, "dest", value.asInstanceOf[js.Any])
      
      inline def setFlush(value: Boolean): Self = StObject.set(x, "flush", value.asInstanceOf[js.Any])
      
      inline def setHashAlg(value: String): Self = StObject.set(x, "hashAlg", value.asInstanceOf[js.Any])
      
      inline def setParents(value: Boolean): Self = StObject.set(x, "parents", value.asInstanceOf[js.Any])
      
      inline def setShardSplitThreshold(value: Double): Self = StObject.set(x, "shardSplitThreshold", value.asInstanceOf[js.Any])
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = CommandModule[Argv, Argv]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcCommandsFilesCpMod.foo` */
  override def _to: CommandModule[Argv, Argv] = default
}
