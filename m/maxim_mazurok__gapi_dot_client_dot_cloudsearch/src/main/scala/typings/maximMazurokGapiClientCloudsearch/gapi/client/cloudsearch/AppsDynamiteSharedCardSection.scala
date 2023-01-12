package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamiteSharedCardSection extends StObject {
  
  /** Indicates whether this section is collapsible. If a section is collapsible, the description must be given. */
  var collapsible: js.UndefOr[Boolean] = js.undefined
  
  /** The header of the section. Formatted text is supported. */
  var header: js.UndefOr[String] = js.undefined
  
  /**
    * The number of uncollapsible widgets. For example, when a section contains five widgets and the `numUncollapsibleWidget` is set to `2`, the first two widgets are always shown and the
    * last three are collapsed as default. The `numUncollapsibleWidget` is taken into account only when collapsible is set to `true`.
    */
  var uncollapsibleWidgetsCount: js.UndefOr[Double] = js.undefined
  
  /** A section must contain at least 1 widget. */
  var widgets: js.UndefOr[js.Array[AppsDynamiteSharedWidget]] = js.undefined
}
object AppsDynamiteSharedCardSection {
  
  inline def apply(): AppsDynamiteSharedCardSection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamiteSharedCardSection]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppsDynamiteSharedCardSection] (val x: Self) extends AnyVal {
    
    inline def setCollapsible(value: Boolean): Self = StObject.set(x, "collapsible", value.asInstanceOf[js.Any])
    
    inline def setCollapsibleUndefined: Self = StObject.set(x, "collapsible", js.undefined)
    
    inline def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    inline def setUncollapsibleWidgetsCount(value: Double): Self = StObject.set(x, "uncollapsibleWidgetsCount", value.asInstanceOf[js.Any])
    
    inline def setUncollapsibleWidgetsCountUndefined: Self = StObject.set(x, "uncollapsibleWidgetsCount", js.undefined)
    
    inline def setWidgets(value: js.Array[AppsDynamiteSharedWidget]): Self = StObject.set(x, "widgets", value.asInstanceOf[js.Any])
    
    inline def setWidgetsUndefined: Self = StObject.set(x, "widgets", js.undefined)
    
    inline def setWidgetsVarargs(value: AppsDynamiteSharedWidget*): Self = StObject.set(x, "widgets", js.Array(value*))
  }
}
