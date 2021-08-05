package typings.ipfsCli

import typings.ipfsCli.anon.AliasArray
import typings.ipfsCli.anon.AliasCoerce
import typings.ipfsCli.anon.AliasDefaultDescribeType
import typings.ipfsCli.anon.Coerce
import typings.ipfsCli.anon.CoerceDescribe
import typings.ipfsCli.anon.CoerceType
import typings.ipfsCli.anon.Describe
import typings.ipfsCli.anon.HashAlg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mkdirMod {
  
  @JSImport("ipfs-cli/dist/src/commands/files/mkdir", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object builder {
    
    @JSImport("ipfs-cli/dist/src/commands/files/mkdir", "builder")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ipfs-cli/dist/src/commands/files/mkdir", "builder.cid-version")
    @js.native
    def cidVersion: AliasArray = js.native
    
    inline def cidVersion_=(x: AliasArray): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cid-version")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-cli/dist/src/commands/files/mkdir", "builder.flush")
    @js.native
    def flush: AliasCoerce = js.native
    inline def flush_=(x: AliasCoerce): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("flush")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-cli/dist/src/commands/files/mkdir", "builder.hash-alg")
    @js.native
    def hashAlg: AliasDefaultDescribeType = js.native
    
    inline def hashAlg_=(x: AliasDefaultDescribeType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hash-alg")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-cli/dist/src/commands/files/mkdir", "builder.mode")
    @js.native
    def mode: CoerceDescribe = js.native
    inline def mode_=(x: CoerceDescribe): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mode")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-cli/dist/src/commands/files/mkdir", "builder.mtime")
    @js.native
    def mtime: Coerce = js.native
    
    @JSImport("ipfs-cli/dist/src/commands/files/mkdir", "builder.mtime-nsecs")
    @js.native
    def mtimeNsecs: Coerce = js.native
    
    inline def mtimeNsecs_=(x: Coerce): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mtime-nsecs")(x.asInstanceOf[js.Any])
    
    inline def mtime_=(x: Coerce): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mtime")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-cli/dist/src/commands/files/mkdir", "builder.parents")
    @js.native
    def parents: AliasCoerce = js.native
    inline def parents_=(x: AliasCoerce): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parents")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-cli/dist/src/commands/files/mkdir", "builder.shard-split-threshold")
    @js.native
    def shardSplitThreshold: Describe = js.native
    
    inline def shardSplitThreshold_=(x: Describe): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("shard-split-threshold")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-cli/dist/src/commands/files/mkdir", "builder.timeout")
    @js.native
    def timeout: CoerceType = js.native
    inline def timeout_=(x: CoerceType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("timeout")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("ipfs-cli/dist/src/commands/files/mkdir", "command")
  @js.native
  val command: String = js.native
  
  @JSImport("ipfs-cli/dist/src/commands/files/mkdir", "describe")
  @js.native
  val describe: String = js.native
  
  inline def handler(hasHasIpfsPathParentsCidVersionHashAlgFlushShardSplitThresholdModeMtimeMtimeNsecsTimeout: HashAlg): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("handler")(hasHasIpfsPathParentsCidVersionHashAlgFlushShardSplitThresholdModeMtimeMtimeNsecsTimeout.asInstanceOf[js.Any]).asInstanceOf[js.Any]
}
