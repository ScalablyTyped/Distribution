package typings.ipfsUnixfsImporter

import typings.ipfsUnixfsImporter.distSrcUtilsPersistMod.PersistOptions
import typings.ipfsUnixfsImporter.mod.TreeBuilder
import typings.multiformats.distTypesSrcLinkInterfaceMod.Version
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTreeBuilderMod {
  
  @JSImport("ipfs-unixfs-importer/dist/src/tree-builder", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def defaultTreeBuilder(options: TreeBuilderOptions): TreeBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultTreeBuilder")(options.asInstanceOf[js.Any]).asInstanceOf[TreeBuilder]
  
  trait AddToTreeOptions
    extends StObject
       with PersistOptions {
    
    var shardSplitThresholdBytes: Double
  }
  object AddToTreeOptions {
    
    inline def apply(cidVersion: Version, shardSplitThresholdBytes: Double): AddToTreeOptions = {
      val __obj = js.Dynamic.literal(cidVersion = cidVersion.asInstanceOf[js.Any], shardSplitThresholdBytes = shardSplitThresholdBytes.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddToTreeOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AddToTreeOptions] (val x: Self) extends AnyVal {
      
      inline def setShardSplitThresholdBytes(value: Double): Self = StObject.set(x, "shardSplitThresholdBytes", value.asInstanceOf[js.Any])
    }
  }
  
  trait TreeBuilderOptions
    extends StObject
       with AddToTreeOptions {
    
    var wrapWithDirectory: Boolean
  }
  object TreeBuilderOptions {
    
    inline def apply(cidVersion: Version, shardSplitThresholdBytes: Double, wrapWithDirectory: Boolean): TreeBuilderOptions = {
      val __obj = js.Dynamic.literal(cidVersion = cidVersion.asInstanceOf[js.Any], shardSplitThresholdBytes = shardSplitThresholdBytes.asInstanceOf[js.Any], wrapWithDirectory = wrapWithDirectory.asInstanceOf[js.Any])
      __obj.asInstanceOf[TreeBuilderOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TreeBuilderOptions] (val x: Self) extends AnyVal {
      
      inline def setWrapWithDirectory(value: Boolean): Self = StObject.set(x, "wrapWithDirectory", value.asInstanceOf[js.Any])
    }
  }
}
