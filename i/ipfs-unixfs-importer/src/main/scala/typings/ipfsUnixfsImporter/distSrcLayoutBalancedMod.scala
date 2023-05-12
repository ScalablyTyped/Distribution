package typings.ipfsUnixfsImporter

import typings.ipfsUnixfsImporter.distSrcLayoutMod.FileLayout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcLayoutBalancedMod {
  
  @JSImport("ipfs-unixfs-importer/dist/src/layout/balanced", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def balanced(): FileLayout = ^.asInstanceOf[js.Dynamic].applyDynamic("balanced")().asInstanceOf[FileLayout]
  inline def balanced(options: BalancedOptions): FileLayout = ^.asInstanceOf[js.Dynamic].applyDynamic("balanced")(options.asInstanceOf[js.Any]).asInstanceOf[FileLayout]
  
  trait BalancedOptions extends StObject {
    
    var maxChildrenPerNode: js.UndefOr[Double] = js.undefined
  }
  object BalancedOptions {
    
    inline def apply(): BalancedOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BalancedOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BalancedOptions] (val x: Self) extends AnyVal {
      
      inline def setMaxChildrenPerNode(value: Double): Self = StObject.set(x, "maxChildrenPerNode", value.asInstanceOf[js.Any])
      
      inline def setMaxChildrenPerNodeUndefined: Self = StObject.set(x, "maxChildrenPerNode", js.undefined)
    }
  }
}
