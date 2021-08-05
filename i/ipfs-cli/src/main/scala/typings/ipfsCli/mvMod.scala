package typings.ipfsCli

import typings.ipfsCli.anon.AliasArray
import typings.ipfsCli.anon.AliasCoerce
import typings.ipfsCli.anon.AliasDefaultDescribeType
import typings.ipfsCli.anon.CoerceType
import typings.ipfsCli.anon.Describe
import typings.ipfsCli.anon.Parents
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mvMod {
  
  @JSImport("ipfs-cli/dist/src/commands/files/mv", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object builder {
    
    @JSImport("ipfs-cli/dist/src/commands/files/mv", "builder")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ipfs-cli/dist/src/commands/files/mv", "builder.cid-version")
    @js.native
    def cidVersion: AliasArray = js.native
    
    inline def cidVersion_=(x: AliasArray): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cid-version")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-cli/dist/src/commands/files/mv", "builder.flush")
    @js.native
    def flush: AliasCoerce = js.native
    inline def flush_=(x: AliasCoerce): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("flush")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-cli/dist/src/commands/files/mv", "builder.hash-alg")
    @js.native
    def hashAlg: AliasDefaultDescribeType = js.native
    
    inline def hashAlg_=(x: AliasDefaultDescribeType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hash-alg")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-cli/dist/src/commands/files/mv", "builder.parents")
    @js.native
    def parents: AliasCoerce = js.native
    inline def parents_=(x: AliasCoerce): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parents")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-cli/dist/src/commands/files/mv", "builder.recursive")
    @js.native
    def recursive: AliasCoerce = js.native
    inline def recursive_=(x: AliasCoerce): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("recursive")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-cli/dist/src/commands/files/mv", "builder.shard-split-threshold")
    @js.native
    def shardSplitThreshold: Describe = js.native
    
    inline def shardSplitThreshold_=(x: Describe): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("shard-split-threshold")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-cli/dist/src/commands/files/mv", "builder.timeout")
    @js.native
    def timeout: CoerceType = js.native
    inline def timeout_=(x: CoerceType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("timeout")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("ipfs-cli/dist/src/commands/files/mv", "command")
  @js.native
  val command: String = js.native
  
  @JSImport("ipfs-cli/dist/src/commands/files/mv", "describe")
  @js.native
  val describe: String = js.native
  
  inline def handler(hasHasIpfsSourceDestParentsRecursiveCidVersionHashAlgFlushShardSplitThresholdTimeout: Parents): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("handler")(hasHasIpfsSourceDestParentsRecursiveCidVersionHashAlgFlushShardSplitThresholdTimeout.asInstanceOf[js.Any]).asInstanceOf[js.Any]
}
