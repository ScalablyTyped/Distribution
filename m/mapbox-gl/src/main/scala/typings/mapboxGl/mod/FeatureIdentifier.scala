package typings.mapboxGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FeatureIdentifier extends StObject {
  
  var id: js.UndefOr[String | Double] = js.native
  
  var source: String = js.native
  
  var sourceLayer: js.UndefOr[String] = js.native
}
object FeatureIdentifier {
  
  @scala.inline
  def apply(source: String): FeatureIdentifier = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureIdentifier]
  }
  
  @scala.inline
  implicit class FeatureIdentifierMutableBuilder[Self <: FeatureIdentifier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceLayer(value: String): Self = StObject.set(x, "sourceLayer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceLayerUndefined: Self = StObject.set(x, "sourceLayer", js.undefined)
  }
}
