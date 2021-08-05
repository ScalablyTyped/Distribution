package typings.ipfsCli

import typings.ipfsCli.anon.Alias
import typings.ipfsCli.anon.AliasArray
import typings.ipfsCli.anon.AliasCoerce
import typings.ipfsCli.anon.AliasDefaultType
import typings.ipfsCli.anon.AliasDescribeType
import typings.ipfsCli.anon.Coerce
import typings.ipfsCli.anon.CoerceDefault
import typings.ipfsCli.anon.CoerceDescribe
import typings.ipfsCli.anon.CoerceType
import typings.ipfsCli.anon.Create
import typings.ipfsCli.anon.Describe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object writeMod {
  
  @JSImport("ipfs-cli/dist/src/commands/files/write", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object builder {
    
    @JSImport("ipfs-cli/dist/src/commands/files/write", "builder")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ipfs-cli/dist/src/commands/files/write", "builder.cid-version")
    @js.native
    def cidVersion: AliasArray = js.native
    
    inline def cidVersion_=(x: AliasArray): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cid-version")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-cli/dist/src/commands/files/write", "builder.create")
    @js.native
    def create: AliasCoerce = js.native
    inline def create_=(x: AliasCoerce): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("create")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-cli/dist/src/commands/files/write", "builder.flush")
    @js.native
    def flush: AliasCoerce = js.native
    inline def flush_=(x: AliasCoerce): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("flush")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-cli/dist/src/commands/files/write", "builder.hash-alg")
    @js.native
    def hashAlg: AliasDefaultType = js.native
    
    inline def hashAlg_=(x: AliasDefaultType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hash-alg")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-cli/dist/src/commands/files/write", "builder.length")
    @js.native
    def length: AliasDescribeType = js.native
    inline def length_=(x: AliasDescribeType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("length")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-cli/dist/src/commands/files/write", "builder.mode")
    @js.native
    def mode: CoerceDescribe = js.native
    inline def mode_=(x: CoerceDescribe): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mode")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-cli/dist/src/commands/files/write", "builder.mtime")
    @js.native
    def mtime: Coerce = js.native
    
    @JSImport("ipfs-cli/dist/src/commands/files/write", "builder.mtime-nsecs")
    @js.native
    def mtimeNsecs: Coerce = js.native
    
    inline def mtimeNsecs_=(x: Coerce): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mtime-nsecs")(x.asInstanceOf[js.Any])
    
    inline def mtime_=(x: Coerce): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mtime")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-cli/dist/src/commands/files/write", "builder.offset")
    @js.native
    def offset: AliasDescribeType = js.native
    inline def offset_=(x: AliasDescribeType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("offset")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-cli/dist/src/commands/files/write", "builder.parents")
    @js.native
    def parents: Alias = js.native
    inline def parents_=(x: Alias): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parents")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-cli/dist/src/commands/files/write", "builder.raw-leaves")
    @js.native
    def rawLeaves: AliasCoerce = js.native
    
    inline def rawLeaves_=(x: AliasCoerce): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("raw-leaves")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-cli/dist/src/commands/files/write", "builder.reduce-single-leaf-to-self")
    @js.native
    def reduceSingleLeafToSelf: CoerceDefault = js.native
    
    inline def reduceSingleLeafToSelf_=(x: CoerceDefault): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("reduce-single-leaf-to-self")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-cli/dist/src/commands/files/write", "builder.shard-split-threshold")
    @js.native
    def shardSplitThreshold: Describe = js.native
    
    inline def shardSplitThreshold_=(x: Describe): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("shard-split-threshold")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-cli/dist/src/commands/files/write", "builder.strategy")
    @js.native
    def strategy: AliasDefaultType = js.native
    inline def strategy_=(x: AliasDefaultType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("strategy")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-cli/dist/src/commands/files/write", "builder.timeout")
    @js.native
    def timeout: CoerceType = js.native
    inline def timeout_=(x: CoerceType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("timeout")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-cli/dist/src/commands/files/write", "builder.truncate")
    @js.native
    def truncate: AliasCoerce = js.native
    inline def truncate_=(x: AliasCoerce): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("truncate")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("ipfs-cli/dist/src/commands/files/write", "command")
  @js.native
  val command: String = js.native
  
  @JSImport("ipfs-cli/dist/src/commands/files/write", "describe")
  @js.native
  val describe: String = js.native
  
  inline def handler(
    hasHasIpfsGetStdinPathOffsetLengthCreateTruncateRawLeavesReduceSingleLeafToSelfCidVersionHashAlgParentsProgressStrategyFlushShardSplitThresholdModeMtimeMtimeNsecsTimeout: Create
  ): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("handler")(hasHasIpfsGetStdinPathOffsetLengthCreateTruncateRawLeavesReduceSingleLeafToSelfCidVersionHashAlgParentsProgressStrategyFlushShardSplitThresholdModeMtimeMtimeNsecsTimeout.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
