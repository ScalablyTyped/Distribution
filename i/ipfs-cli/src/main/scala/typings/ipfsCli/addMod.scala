package typings.ipfsCli

import typings.ipfsCli.anon.Alias
import typings.ipfsCli.anon.BlockWriteConcurrency
import typings.ipfsCli.anon.Choices
import typings.ipfsCli.anon.ChoicesDefault
import typings.ipfsCli.anon.Coerce
import typings.ipfsCli.anon.CoerceType
import typings.ipfsCli.anon.Default
import typings.ipfsCli.anon.DefaultBoolean
import typings.ipfsCli.anon.DefaultDescribe
import typings.ipfsCli.anon.DefaultDescribeType
import typings.ipfsCli.anon.DefaultType
import typings.ipfsCli.anon.Describe
import typings.ipfsCli.anon.DescribeType
import typings.ipfsCli.anon.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object addMod {
  
  @JSImport("ipfs-cli/dist/src/commands/add", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object builder {
    
    @JSImport("ipfs-cli/dist/src/commands/add", "builder")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ipfs-cli/dist/src/commands/add", "builder.block-write-concurrency")
    @js.native
    def blockWriteConcurrency: Describe = js.native
    
    @scala.inline
    def blockWriteConcurrency_=(x: Describe): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("block-write-concurrency")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-cli/dist/src/commands/add", "builder.chunker")
    @js.native
    def chunker: DefaultDescribe = js.native
    @scala.inline
    def chunker_=(x: DefaultDescribe): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("chunker")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-cli/dist/src/commands/add", "builder.cid-base")
    @js.native
    def cidBase: Choices = js.native
    
    @scala.inline
    def cidBase_=(x: Choices): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cid-base")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-cli/dist/src/commands/add", "builder.cid-version")
    @js.native
    def cidVersion: DefaultDescribeType = js.native
    
    @scala.inline
    def cidVersion_=(x: DefaultDescribeType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cid-version")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-cli/dist/src/commands/add", "builder.enable-sharding-experiment")
    @js.native
    def enableShardingExperiment: Type = js.native
    
    @scala.inline
    def enableShardingExperiment_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enable-sharding-experiment")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-cli/dist/src/commands/add", "builder.file-import-concurrency")
    @js.native
    def fileImportConcurrency: Describe = js.native
    
    @scala.inline
    def fileImportConcurrency_=(x: Describe): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("file-import-concurrency")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-cli/dist/src/commands/add", "builder.hash")
    @js.native
    def hash: ChoicesDefault = js.native
    @scala.inline
    def hash_=(x: ChoicesDefault): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hash")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-cli/dist/src/commands/add", "builder.hidden")
    @js.native
    def hidden: Alias = js.native
    @scala.inline
    def hidden_=(x: Alias): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hidden")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-cli/dist/src/commands/add", "builder.mode")
    @js.native
    def mode: DescribeType = js.native
    @scala.inline
    def mode_=(x: DescribeType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mode")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-cli/dist/src/commands/add", "builder.mtime")
    @js.native
    def mtime: Coerce = js.native
    
    @JSImport("ipfs-cli/dist/src/commands/add", "builder.mtime-nsecs")
    @js.native
    def mtimeNsecs: Coerce = js.native
    
    @scala.inline
    def mtimeNsecs_=(x: Coerce): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mtime-nsecs")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def mtime_=(x: Coerce): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mtime")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-cli/dist/src/commands/add", "builder.only-hash")
    @js.native
    def onlyHash: Alias = js.native
    
    @scala.inline
    def onlyHash_=(x: Alias): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("only-hash")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-cli/dist/src/commands/add", "builder.pin")
    @js.native
    def pin: DefaultBoolean = js.native
    @scala.inline
    def pin_=(x: DefaultBoolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pin")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-cli/dist/src/commands/add", "builder.preload")
    @js.native
    def preload: DefaultBoolean = js.native
    @scala.inline
    def preload_=(x: DefaultBoolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("preload")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-cli/dist/src/commands/add", "builder.preserve-mode")
    @js.native
    def preserveMode: DefaultBoolean = js.native
    
    @scala.inline
    def preserveMode_=(x: DefaultBoolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("preserve-mode")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-cli/dist/src/commands/add", "builder.preserve-mtime")
    @js.native
    def preserveMtime: DefaultBoolean = js.native
    
    @scala.inline
    def preserveMtime_=(x: DefaultBoolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("preserve-mtime")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-cli/dist/src/commands/add", "builder.progress")
    @js.native
    def progress: Alias = js.native
    @scala.inline
    def progress_=(x: Alias): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("progress")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-cli/dist/src/commands/add", "builder.quiet")
    @js.native
    def quiet: Alias = js.native
    @scala.inline
    def quiet_=(x: Alias): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("quiet")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-cli/dist/src/commands/add", "builder.quieter")
    @js.native
    def quieter: Alias = js.native
    @scala.inline
    def quieter_=(x: Alias): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("quieter")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-cli/dist/src/commands/add", "builder.raw-leaves")
    @js.native
    def rawLeaves: DescribeType = js.native
    
    @scala.inline
    def rawLeaves_=(x: DescribeType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("raw-leaves")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-cli/dist/src/commands/add", "builder.recursive")
    @js.native
    def recursive: Default = js.native
    @scala.inline
    def recursive_=(x: Default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("recursive")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-cli/dist/src/commands/add", "builder.shard-split-threshold")
    @js.native
    def shardSplitThreshold: DefaultType = js.native
    
    @scala.inline
    def shardSplitThreshold_=(x: DefaultType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("shard-split-threshold")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-cli/dist/src/commands/add", "builder.silent")
    @js.native
    def silent: DefaultBoolean = js.native
    @scala.inline
    def silent_=(x: DefaultBoolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("silent")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-cli/dist/src/commands/add", "builder.timeout")
    @js.native
    def timeout: CoerceType = js.native
    @scala.inline
    def timeout_=(x: CoerceType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("timeout")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-cli/dist/src/commands/add", "builder.trickle")
    @js.native
    def trickle: Alias = js.native
    @scala.inline
    def trickle_=(x: Alias): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("trickle")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-cli/dist/src/commands/add", "builder.wrap-with-directory")
    @js.native
    def wrapWithDirectory: Alias = js.native
    
    @scala.inline
    def wrapWithDirectory_=(x: Alias): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("wrap-with-directory")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("ipfs-cli/dist/src/commands/add", "command")
  @js.native
  val command: String = js.native
  
  @JSImport("ipfs-cli/dist/src/commands/add", "describe")
  @js.native
  val describe: String = js.native
  
  @scala.inline
  def handler(
    hasHasIpfsPrintIsDaemonGetStdinTrickleShardSplitThresholdCidVersionRawLeavesOnlyHashHashWrapWithDirectoryPinChunkerPreloadFileImportConcurrencyBlockWriteConcurrencyTimeoutQuieterQuietSilentProgressFileMtimeMtimeNsecsRecursiveHiddenPreserveModePreserveMtimeModeCidBase: BlockWriteConcurrency
  ): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("handler")(hasHasIpfsPrintIsDaemonGetStdinTrickleShardSplitThresholdCidVersionRawLeavesOnlyHashHashWrapWithDirectoryPinChunkerPreloadFileImportConcurrencyBlockWriteConcurrencyTimeoutQuieterQuietSilentProgressFileMtimeMtimeNsecsRecursiveHiddenPreserveModePreserveMtimeModeCidBase.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
