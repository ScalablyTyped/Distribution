package typings.maplibreMaplibreGlStyleSpec.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FeatureFilter_ extends StObject {
  
  def filter(globalProperties: GlobalProperties, feature: Feature): Boolean
  def filter(globalProperties: GlobalProperties, feature: Feature, canonical: ICanonicalTileID): Boolean
  @JSName("filter")
  var filter_Original: FilterExpression
  
  var needGeometry: Boolean
}
object FeatureFilter_ {
  
  inline def apply(
    filter: (/* globalProperties */ GlobalProperties, /* feature */ Feature, /* canonical */ js.UndefOr[ICanonicalTileID]) => Boolean,
    needGeometry: Boolean
  ): FeatureFilter_ = {
    val __obj = js.Dynamic.literal(filter = js.Any.fromFunction3(filter), needGeometry = needGeometry.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureFilter_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FeatureFilter_] (val x: Self) extends AnyVal {
    
    inline def setFilter(
      value: (/* globalProperties */ GlobalProperties, /* feature */ Feature, /* canonical */ js.UndefOr[ICanonicalTileID]) => Boolean
    ): Self = StObject.set(x, "filter", js.Any.fromFunction3(value))
    
    inline def setNeedGeometry(value: Boolean): Self = StObject.set(x, "needGeometry", value.asInstanceOf[js.Any])
  }
}
