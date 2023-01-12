package typings.ipfsCli

import org.scalablytyped.runtime.Shortcut
import typings.ipfsCli.distSrcTypesMod.Context
import typings.yargs.mod.CommandModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCommandsRefsMod extends Shortcut {
  
  /**
    * @typedef {object} Argv
    * @property {import('../types').Context} Argv.ctx
    * @property {string} Argv.key
    * @property {string} Argv.keys
    * @property {boolean} Argv.recursive
    * @property {string} Argv.format
    * @property {boolean} Argv.edges
    * @property {boolean} Argv.unique
    * @property {number} Argv.maxDepth
    * @property {number} Argv.timeout
    */
  /** @type {import('yargs').CommandModule<Argv, Argv>} */
  @JSImport("ipfs-cli/dist/src/commands/refs", JSImport.Default)
  @js.native
  val default: CommandModule[Argv, Argv] = js.native
  
  trait Argv extends StObject {
    
    var ctx: Context
    
    var edges: Boolean
    
    var format: String
    
    var key: String
    
    var keys: String
    
    var maxDepth: Double
    
    var recursive: Boolean
    
    var timeout: Double
    
    var unique: Boolean
  }
  object Argv {
    
    inline def apply(
      ctx: Context,
      edges: Boolean,
      format: String,
      key: String,
      keys: String,
      maxDepth: Double,
      recursive: Boolean,
      timeout: Double,
      unique: Boolean
    ): Argv = {
      val __obj = js.Dynamic.literal(ctx = ctx.asInstanceOf[js.Any], edges = edges.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], maxDepth = maxDepth.asInstanceOf[js.Any], recursive = recursive.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any], unique = unique.asInstanceOf[js.Any])
      __obj.asInstanceOf[Argv]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Argv] (val x: Self) extends AnyVal {
      
      inline def setCtx(value: Context): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
      
      inline def setEdges(value: Boolean): Self = StObject.set(x, "edges", value.asInstanceOf[js.Any])
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeys(value: String): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      inline def setMaxDepth(value: Double): Self = StObject.set(x, "maxDepth", value.asInstanceOf[js.Any])
      
      inline def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setUnique(value: Boolean): Self = StObject.set(x, "unique", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = CommandModule[Argv, Argv]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcCommandsRefsMod.foo` */
  override def _to: CommandModule[Argv, Argv] = default
}
