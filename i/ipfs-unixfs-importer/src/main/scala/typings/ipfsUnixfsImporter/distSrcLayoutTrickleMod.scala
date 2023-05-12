package typings.ipfsUnixfsImporter

import typings.ipfsUnixfsImporter.distSrcLayoutMod.FileLayout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcLayoutTrickleMod {
  
  @JSImport("ipfs-unixfs-importer/dist/src/layout/trickle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def trickle(): FileLayout = ^.asInstanceOf[js.Dynamic].applyDynamic("trickle")().asInstanceOf[FileLayout]
  inline def trickle(options: TrickleOptions): FileLayout = ^.asInstanceOf[js.Dynamic].applyDynamic("trickle")(options.asInstanceOf[js.Any]).asInstanceOf[FileLayout]
  
  trait TrickleOptions extends StObject {
    
    var layerRepeat: js.UndefOr[Double] = js.undefined
    
    var maxChildrenPerNode: js.UndefOr[Double] = js.undefined
  }
  object TrickleOptions {
    
    inline def apply(): TrickleOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TrickleOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TrickleOptions] (val x: Self) extends AnyVal {
      
      inline def setLayerRepeat(value: Double): Self = StObject.set(x, "layerRepeat", value.asInstanceOf[js.Any])
      
      inline def setLayerRepeatUndefined: Self = StObject.set(x, "layerRepeat", js.undefined)
      
      inline def setMaxChildrenPerNode(value: Double): Self = StObject.set(x, "maxChildrenPerNode", value.asInstanceOf[js.Any])
      
      inline def setMaxChildrenPerNodeUndefined: Self = StObject.set(x, "maxChildrenPerNode", js.undefined)
    }
  }
}
