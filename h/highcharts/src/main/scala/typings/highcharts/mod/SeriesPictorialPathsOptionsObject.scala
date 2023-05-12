package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SeriesPictorialPathsOptionsObject extends StObject {
  
  /**
    * (Highcharts) The definition defines a path to be drawn. It corresponds
    * `d` SVG attribute.
    */
  var definition: js.UndefOr[String] = js.undefined
  
  /**
    * (Highcharts) The max option determines height of the image. It is the
    * ratio of `yAxis.max` to the `paths.max`.
    */
  var max: js.UndefOr[Double] = js.undefined
}
object SeriesPictorialPathsOptionsObject {
  
  inline def apply(): SeriesPictorialPathsOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesPictorialPathsOptionsObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SeriesPictorialPathsOptionsObject] (val x: Self) extends AnyVal {
    
    inline def setDefinition(value: String): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    inline def setDefinitionUndefined: Self = StObject.set(x, "definition", js.undefined)
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
  }
}
