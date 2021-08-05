package typings.ipfsCli

import typings.ipfsCli.anon.AliasCoerce
import typings.ipfsCli.anon.AliasDefaultDescribeType
import typings.ipfsCli.anon.CoerceType
import typings.ipfsCli.anon.Describe
import typings.ipfsCli.anon.DescribeType
import typings.ipfsCli.anon.Flush
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chmodMod {
  
  @JSImport("ipfs-cli/dist/src/commands/files/chmod", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object builder {
    
    @JSImport("ipfs-cli/dist/src/commands/files/chmod", "builder")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ipfs-cli/dist/src/commands/files/chmod", "builder.flush")
    @js.native
    def flush: AliasCoerce = js.native
    inline def flush_=(x: AliasCoerce): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("flush")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-cli/dist/src/commands/files/chmod", "builder.hash-alg")
    @js.native
    def hashAlg: AliasDefaultDescribeType = js.native
    
    inline def hashAlg_=(x: AliasDefaultDescribeType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hash-alg")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-cli/dist/src/commands/files/chmod", "builder.mode")
    @js.native
    def mode: DescribeType = js.native
    inline def mode_=(x: DescribeType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mode")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-cli/dist/src/commands/files/chmod", "builder.path")
    @js.native
    def path: DescribeType = js.native
    inline def path_=(x: DescribeType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("path")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-cli/dist/src/commands/files/chmod", "builder.recursive")
    @js.native
    def recursive: AliasCoerce = js.native
    inline def recursive_=(x: AliasCoerce): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("recursive")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-cli/dist/src/commands/files/chmod", "builder.shard-split-threshold")
    @js.native
    def shardSplitThreshold: Describe = js.native
    
    inline def shardSplitThreshold_=(x: Describe): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("shard-split-threshold")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-cli/dist/src/commands/files/chmod", "builder.timeout")
    @js.native
    def timeout: CoerceType = js.native
    inline def timeout_=(x: CoerceType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("timeout")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("ipfs-cli/dist/src/commands/files/chmod", "command")
  @js.native
  val command: String = js.native
  
  @JSImport("ipfs-cli/dist/src/commands/files/chmod", "describe")
  @js.native
  val describe: String = js.native
  
  inline def handler(hasHasIpfsPathModeRecursiveHashAlgFlushShardSplitThresholdTimeout: Flush): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("handler")(hasHasIpfsPathModeRecursiveHashAlgFlushShardSplitThresholdTimeout.asInstanceOf[js.Any]).asInstanceOf[js.Any]
}
