package typings.maplibreGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FeatureFilter extends StObject {
  
  def filter(globalProperties: GlobalProperties, feature: Feature): Boolean
  def filter(globalProperties: GlobalProperties, feature: Feature, canonical: CanonicalTileID): Boolean
  @JSName("filter")
  var filter_Original: FilterExpression
  
  var needGeometry: Boolean
}
object FeatureFilter {
  
  inline def apply(
    filter: (/* globalProperties */ GlobalProperties, /* feature */ Feature, /* canonical */ js.UndefOr[CanonicalTileID]) => Boolean,
    needGeometry: Boolean
  ): FeatureFilter = {
    val __obj = js.Dynamic.literal(filter = js.Any.fromFunction3(filter), needGeometry = needGeometry.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureFilter]
  }
  
  extension [Self <: FeatureFilter](x: Self) {
    
    inline def setFilter(
      value: (/* globalProperties */ GlobalProperties, /* feature */ Feature, /* canonical */ js.UndefOr[CanonicalTileID]) => Boolean
    ): Self = StObject.set(x, "filter", js.Any.fromFunction3(value))
    
    inline def setNeedGeometry(value: Boolean): Self = StObject.set(x, "needGeometry", value.asInstanceOf[js.Any])
  }
}
