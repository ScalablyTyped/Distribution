package typings.ipfsCli

import org.scalablytyped.runtime.Shortcut
import typings.ipfsCli.distSrcTypesMod.Context
import typings.multiformats.distTypesSrcLinkInterfaceMod.Version
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCommandsAddMod extends Shortcut {
  
  /**
    * @typedef {object} Argv
    * @property {import('../types').Context} Argv.ctx
    * @property {boolean} Argv.trickle
    * @property {number} Argv.shardSplitThreshold
    * @property {import('multiformats/cid').Version} Argv.cidVersion
    * @property {boolean} Argv.rawLeaves
    * @property {boolean} Argv.onlyHash
    * @property {string} Argv.hash
    * @property {boolean} Argv.wrapWithDirectory
    * @property {boolean} Argv.pin
    * @property {string} Argv.chunker
    * @property {boolean} Argv.preload
    * @property {number} Argv.fileImportConcurrency
    * @property {number} Argv.blockWriteConcurrency
    * @property {number} Argv.timeout
    * @property {boolean} Argv.quieter
    * @property {boolean} Argv.quiet
    * @property {boolean} Argv.silent
    * @property {boolean} Argv.progress
    * @property {string[]} Argv.file
    * @property {number} Argv.mtime
    * @property {number} Argv.mtimeNsecs
    * @property {boolean} Argv.recursive
    * @property {boolean} Argv.hidden
    * @property {boolean} Argv.preserveMode
    * @property {boolean} Argv.preserveMtime
    * @property {number} Argv.mode
    * @property {string} Argv.cidBase
    * @property {boolean} Argv.enableShardingExperiment
    */
  /** @type {import('yargs').CommandModule<Argv, Argv>} */
  @JSImport("ipfs-cli/dist/src/commands/add", JSImport.Default)
  @js.native
  val default: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_yargs.CommandModule<Argv, Argv> */ Any = js.native
  
  trait Argv extends StObject {
    
    var blockWriteConcurrency: Double
    
    var chunker: String
    
    var cidBase: String
    
    var cidVersion: Version
    
    var ctx: Context
    
    var enableShardingExperiment: Boolean
    
    var file: js.Array[String]
    
    var fileImportConcurrency: Double
    
    var hash: String
    
    var hidden: Boolean
    
    var mode: Double
    
    var mtime: Double
    
    var mtimeNsecs: Double
    
    var onlyHash: Boolean
    
    var pin: Boolean
    
    var preload: Boolean
    
    var preserveMode: Boolean
    
    var preserveMtime: Boolean
    
    var progress: Boolean
    
    var quiet: Boolean
    
    var quieter: Boolean
    
    var rawLeaves: Boolean
    
    var recursive: Boolean
    
    var shardSplitThreshold: Double
    
    var silent: Boolean
    
    var timeout: Double
    
    var trickle: Boolean
    
    var wrapWithDirectory: Boolean
  }
  object Argv {
    
    inline def apply(
      blockWriteConcurrency: Double,
      chunker: String,
      cidBase: String,
      cidVersion: Version,
      ctx: Context,
      enableShardingExperiment: Boolean,
      file: js.Array[String],
      fileImportConcurrency: Double,
      hash: String,
      hidden: Boolean,
      mode: Double,
      mtime: Double,
      mtimeNsecs: Double,
      onlyHash: Boolean,
      pin: Boolean,
      preload: Boolean,
      preserveMode: Boolean,
      preserveMtime: Boolean,
      progress: Boolean,
      quiet: Boolean,
      quieter: Boolean,
      rawLeaves: Boolean,
      recursive: Boolean,
      shardSplitThreshold: Double,
      silent: Boolean,
      timeout: Double,
      trickle: Boolean,
      wrapWithDirectory: Boolean
    ): Argv = {
      val __obj = js.Dynamic.literal(blockWriteConcurrency = blockWriteConcurrency.asInstanceOf[js.Any], chunker = chunker.asInstanceOf[js.Any], cidBase = cidBase.asInstanceOf[js.Any], cidVersion = cidVersion.asInstanceOf[js.Any], ctx = ctx.asInstanceOf[js.Any], enableShardingExperiment = enableShardingExperiment.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], fileImportConcurrency = fileImportConcurrency.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], mtime = mtime.asInstanceOf[js.Any], mtimeNsecs = mtimeNsecs.asInstanceOf[js.Any], onlyHash = onlyHash.asInstanceOf[js.Any], pin = pin.asInstanceOf[js.Any], preload = preload.asInstanceOf[js.Any], preserveMode = preserveMode.asInstanceOf[js.Any], preserveMtime = preserveMtime.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], quiet = quiet.asInstanceOf[js.Any], quieter = quieter.asInstanceOf[js.Any], rawLeaves = rawLeaves.asInstanceOf[js.Any], recursive = recursive.asInstanceOf[js.Any], shardSplitThreshold = shardSplitThreshold.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any], trickle = trickle.asInstanceOf[js.Any], wrapWithDirectory = wrapWithDirectory.asInstanceOf[js.Any])
      __obj.asInstanceOf[Argv]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Argv] (val x: Self) extends AnyVal {
      
      inline def setBlockWriteConcurrency(value: Double): Self = StObject.set(x, "blockWriteConcurrency", value.asInstanceOf[js.Any])
      
      inline def setChunker(value: String): Self = StObject.set(x, "chunker", value.asInstanceOf[js.Any])
      
      inline def setCidBase(value: String): Self = StObject.set(x, "cidBase", value.asInstanceOf[js.Any])
      
      inline def setCidVersion(value: Version): Self = StObject.set(x, "cidVersion", value.asInstanceOf[js.Any])
      
      inline def setCtx(value: Context): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
      
      inline def setEnableShardingExperiment(value: Boolean): Self = StObject.set(x, "enableShardingExperiment", value.asInstanceOf[js.Any])
      
      inline def setFile(value: js.Array[String]): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setFileImportConcurrency(value: Double): Self = StObject.set(x, "fileImportConcurrency", value.asInstanceOf[js.Any])
      
      inline def setFileVarargs(value: String*): Self = StObject.set(x, "file", js.Array(value*))
      
      inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setMtime(value: Double): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
      
      inline def setMtimeNsecs(value: Double): Self = StObject.set(x, "mtimeNsecs", value.asInstanceOf[js.Any])
      
      inline def setOnlyHash(value: Boolean): Self = StObject.set(x, "onlyHash", value.asInstanceOf[js.Any])
      
      inline def setPin(value: Boolean): Self = StObject.set(x, "pin", value.asInstanceOf[js.Any])
      
      inline def setPreload(value: Boolean): Self = StObject.set(x, "preload", value.asInstanceOf[js.Any])
      
      inline def setPreserveMode(value: Boolean): Self = StObject.set(x, "preserveMode", value.asInstanceOf[js.Any])
      
      inline def setPreserveMtime(value: Boolean): Self = StObject.set(x, "preserveMtime", value.asInstanceOf[js.Any])
      
      inline def setProgress(value: Boolean): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      inline def setQuiet(value: Boolean): Self = StObject.set(x, "quiet", value.asInstanceOf[js.Any])
      
      inline def setQuieter(value: Boolean): Self = StObject.set(x, "quieter", value.asInstanceOf[js.Any])
      
      inline def setRawLeaves(value: Boolean): Self = StObject.set(x, "rawLeaves", value.asInstanceOf[js.Any])
      
      inline def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
      
      inline def setShardSplitThreshold(value: Double): Self = StObject.set(x, "shardSplitThreshold", value.asInstanceOf[js.Any])
      
      inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTrickle(value: Boolean): Self = StObject.set(x, "trickle", value.asInstanceOf[js.Any])
      
      inline def setWrapWithDirectory(value: Boolean): Self = StObject.set(x, "wrapWithDirectory", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_yargs.CommandModule<Argv, Argv> */ Any
  
  /* This means you don't have to write `default`, but can instead just say `distSrcCommandsAddMod.foo` */
  override def _to: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_yargs.CommandModule<Argv, Argv> */ Any = default
}
