package typings.maximMazurokGapiClientBooks.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Layers extends StObject {
  
  /** A layer should appear here if and only if the layer exists for this book. */
  var layers: js.UndefOr[js.Array[VolumeAnnotationsVersion]] = js.undefined
}
object Layers {
  
  @scala.inline
  def apply(): Layers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Layers]
  }
  
  @scala.inline
  implicit class LayersMutableBuilder[Self <: Layers] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLayers(value: js.Array[VolumeAnnotationsVersion]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
    
    @scala.inline
    def setLayersVarargs(value: VolumeAnnotationsVersion*): Self = StObject.set(x, "layers", js.Array(value :_*))
  }
}
