package typings.ipfsCli

import org.scalablytyped.runtime.Shortcut
import typings.ipfsCli.distSrcTypesMod.Context
import typings.ipfsCli.ipfsCliStrings.balanced
import typings.ipfsCli.ipfsCliStrings.trickle
import typings.multiformats.distTypesSrcLinkInterfaceMod.Version
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCommandsFilesWriteMod extends Shortcut {
  
  /**
    * @typedef {object} Argv
    * @property {import('../../types').Context} Argv.ctx
    * @property {string} Argv.path
    * @property {number} Argv.offset
    * @property {number} Argv.length
    * @property {boolean} Argv.create
    * @property {boolean} Argv.truncate
    * @property {boolean} Argv.rawLeaves
    * @property {boolean} Argv.reduceSingleLeafToSelf
    * @property {import('multiformats/cid').Version} Argv.cidVersion
    * @property {string} Argv.hashAlg
    * @property {boolean} Argv.parents
    * @property {'trickle' | 'balanced'} Argv.strategy
    * @property {boolean} Argv.flush
    * @property {number} Argv.shardSplitThreshold
    * @property {number} Argv.mode
    * @property {number} Argv.mtime
    * @property {number} Argv.mtimeNsecs
    * @property {number} Argv.timeout
    */
  /** @type {import('yargs').CommandModule<Argv, Argv>} */
  @JSImport("ipfs-cli/dist/src/commands/files/write", JSImport.Default)
  @js.native
  val default: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_yargs.CommandModule<Argv, Argv> */ Any = js.native
  
  trait Argv extends StObject {
    
    var cidVersion: Version
    
    var create: Boolean
    
    var ctx: Context
    
    var flush: Boolean
    
    var hashAlg: String
    
    var length: Double
    
    var mode: Double
    
    var mtime: Double
    
    var mtimeNsecs: Double
    
    var offset: Double
    
    var parents: Boolean
    
    var path: String
    
    var rawLeaves: Boolean
    
    var reduceSingleLeafToSelf: Boolean
    
    var shardSplitThreshold: Double
    
    var strategy: trickle | balanced
    
    var timeout: Double
    
    var truncate: Boolean
  }
  object Argv {
    
    inline def apply(
      cidVersion: Version,
      create: Boolean,
      ctx: Context,
      flush: Boolean,
      hashAlg: String,
      length: Double,
      mode: Double,
      mtime: Double,
      mtimeNsecs: Double,
      offset: Double,
      parents: Boolean,
      path: String,
      rawLeaves: Boolean,
      reduceSingleLeafToSelf: Boolean,
      shardSplitThreshold: Double,
      strategy: trickle | balanced,
      timeout: Double,
      truncate: Boolean
    ): Argv = {
      val __obj = js.Dynamic.literal(cidVersion = cidVersion.asInstanceOf[js.Any], create = create.asInstanceOf[js.Any], ctx = ctx.asInstanceOf[js.Any], flush = flush.asInstanceOf[js.Any], hashAlg = hashAlg.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], mtime = mtime.asInstanceOf[js.Any], mtimeNsecs = mtimeNsecs.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], parents = parents.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], rawLeaves = rawLeaves.asInstanceOf[js.Any], reduceSingleLeafToSelf = reduceSingleLeafToSelf.asInstanceOf[js.Any], shardSplitThreshold = shardSplitThreshold.asInstanceOf[js.Any], strategy = strategy.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any], truncate = truncate.asInstanceOf[js.Any])
      __obj.asInstanceOf[Argv]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Argv] (val x: Self) extends AnyVal {
      
      inline def setCidVersion(value: Version): Self = StObject.set(x, "cidVersion", value.asInstanceOf[js.Any])
      
      inline def setCreate(value: Boolean): Self = StObject.set(x, "create", value.asInstanceOf[js.Any])
      
      inline def setCtx(value: Context): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
      
      inline def setFlush(value: Boolean): Self = StObject.set(x, "flush", value.asInstanceOf[js.Any])
      
      inline def setHashAlg(value: String): Self = StObject.set(x, "hashAlg", value.asInstanceOf[js.Any])
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setMtime(value: Double): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
      
      inline def setMtimeNsecs(value: Double): Self = StObject.set(x, "mtimeNsecs", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setParents(value: Boolean): Self = StObject.set(x, "parents", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setRawLeaves(value: Boolean): Self = StObject.set(x, "rawLeaves", value.asInstanceOf[js.Any])
      
      inline def setReduceSingleLeafToSelf(value: Boolean): Self = StObject.set(x, "reduceSingleLeafToSelf", value.asInstanceOf[js.Any])
      
      inline def setShardSplitThreshold(value: Double): Self = StObject.set(x, "shardSplitThreshold", value.asInstanceOf[js.Any])
      
      inline def setStrategy(value: trickle | balanced): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTruncate(value: Boolean): Self = StObject.set(x, "truncate", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_yargs.CommandModule<Argv, Argv> */ Any
  
  /* This means you don't have to write `default`, but can instead just say `distSrcCommandsFilesWriteMod.foo` */
  override def _to: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_yargs.CommandModule<Argv, Argv> */ Any = default
}
