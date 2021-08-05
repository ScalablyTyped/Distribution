package typings.ipfsCli

import typings.ipfsCli.anon.AliasArray
import typings.ipfsCli.anon.AliasCoerce
import typings.ipfsCli.anon.AliasCoerceDescribe
import typings.ipfsCli.anon.AliasDefaultDescribeType
import typings.ipfsCli.anon.Coerce
import typings.ipfsCli.anon.CoerceType
import typings.ipfsCli.anon.Describe
import typings.ipfsCli.anon.Mtime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object touchMod {
  
  @JSImport("ipfs-cli/dist/src/commands/files/touch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object builder {
    
    @JSImport("ipfs-cli/dist/src/commands/files/touch", "builder")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ipfs-cli/dist/src/commands/files/touch", "builder.cid-version")
    @js.native
    def cidVersion: AliasArray = js.native
    
    inline def cidVersion_=(x: AliasArray): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cid-version")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-cli/dist/src/commands/files/touch", "builder.flush")
    @js.native
    def flush: AliasCoerce = js.native
    inline def flush_=(x: AliasCoerce): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("flush")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-cli/dist/src/commands/files/touch", "builder.hash-alg")
    @js.native
    def hashAlg: AliasDefaultDescribeType = js.native
    
    inline def hashAlg_=(x: AliasDefaultDescribeType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hash-alg")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-cli/dist/src/commands/files/touch", "builder.mtime")
    @js.native
    def mtime: AliasCoerceDescribe = js.native
    
    @JSImport("ipfs-cli/dist/src/commands/files/touch", "builder.mtime-nsecs")
    @js.native
    def mtimeNsecs: Coerce = js.native
    
    inline def mtimeNsecs_=(x: Coerce): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mtime-nsecs")(x.asInstanceOf[js.Any])
    
    inline def mtime_=(x: AliasCoerceDescribe): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mtime")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-cli/dist/src/commands/files/touch", "builder.shard-split-threshold")
    @js.native
    def shardSplitThreshold: Describe = js.native
    
    inline def shardSplitThreshold_=(x: Describe): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("shard-split-threshold")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-cli/dist/src/commands/files/touch", "builder.timeout")
    @js.native
    def timeout: CoerceType = js.native
    inline def timeout_=(x: CoerceType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("timeout")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("ipfs-cli/dist/src/commands/files/touch", "command")
  @js.native
  val command: String = js.native
  
  @JSImport("ipfs-cli/dist/src/commands/files/touch", "describe")
  @js.native
  val describe: String = js.native
  
  inline def handler(hasHasIpfsPathFlushCidVersionHashAlgShardSplitThresholdMtimeMtimeNsecsTimeout: Mtime): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("handler")(hasHasIpfsPathFlushCidVersionHashAlgShardSplitThresholdMtimeMtimeNsecsTimeout.asInstanceOf[js.Any]).asInstanceOf[js.Any]
}
