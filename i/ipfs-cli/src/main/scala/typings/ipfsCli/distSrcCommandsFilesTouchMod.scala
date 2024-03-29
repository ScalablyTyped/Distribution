package typings.ipfsCli

import org.scalablytyped.runtime.Shortcut
import typings.ipfsCli.distSrcTypesMod.Context
import typings.multiformats.distTypesSrcLinkInterfaceMod.Version
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCommandsFilesTouchMod extends Shortcut {
  
  /**
    * @typedef {object} Argv
    * @property {import('../../types').Context} Argv.ctx
    * @property {string} Argv.path
    * @property {boolean} Argv.flush
    * @property {import('multiformats/cid').Version} Argv.cidVersion
    * @property {string} Argv.hashAlg
    * @property {number} Argv.shardSplitThreshold
    * @property {number} Argv.mtime
    * @property {number} Argv.mtimeNsecs
    * @property {number} Argv.timeout
    */
  /** @type {import('yargs').CommandModule<Argv, Argv>} */
  @JSImport("ipfs-cli/dist/src/commands/files/touch", JSImport.Default)
  @js.native
  val default: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_yargs.CommandModule<Argv, Argv> */ Any = js.native
  
  trait Argv extends StObject {
    
    var cidVersion: Version
    
    var ctx: Context
    
    var flush: Boolean
    
    var hashAlg: String
    
    var mtime: Double
    
    var mtimeNsecs: Double
    
    var path: String
    
    var shardSplitThreshold: Double
    
    var timeout: Double
  }
  object Argv {
    
    inline def apply(
      cidVersion: Version,
      ctx: Context,
      flush: Boolean,
      hashAlg: String,
      mtime: Double,
      mtimeNsecs: Double,
      path: String,
      shardSplitThreshold: Double,
      timeout: Double
    ): Argv = {
      val __obj = js.Dynamic.literal(cidVersion = cidVersion.asInstanceOf[js.Any], ctx = ctx.asInstanceOf[js.Any], flush = flush.asInstanceOf[js.Any], hashAlg = hashAlg.asInstanceOf[js.Any], mtime = mtime.asInstanceOf[js.Any], mtimeNsecs = mtimeNsecs.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], shardSplitThreshold = shardSplitThreshold.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
      __obj.asInstanceOf[Argv]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Argv] (val x: Self) extends AnyVal {
      
      inline def setCidVersion(value: Version): Self = StObject.set(x, "cidVersion", value.asInstanceOf[js.Any])
      
      inline def setCtx(value: Context): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
      
      inline def setFlush(value: Boolean): Self = StObject.set(x, "flush", value.asInstanceOf[js.Any])
      
      inline def setHashAlg(value: String): Self = StObject.set(x, "hashAlg", value.asInstanceOf[js.Any])
      
      inline def setMtime(value: Double): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
      
      inline def setMtimeNsecs(value: Double): Self = StObject.set(x, "mtimeNsecs", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setShardSplitThreshold(value: Double): Self = StObject.set(x, "shardSplitThreshold", value.asInstanceOf[js.Any])
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_yargs.CommandModule<Argv, Argv> */ Any
  
  /* This means you don't have to write `default`, but can instead just say `distSrcCommandsFilesTouchMod.foo` */
  override def _to: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_yargs.CommandModule<Argv, Argv> */ Any = default
}
