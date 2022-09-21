package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamiteSharedColumnsColumn extends StObject {
  
  /** The horizontal alignment of the column. */
  var horizontalAlignment: js.UndefOr[String] = js.undefined
  
  /** Specifies how the column content is sized horizontally. */
  var horizontalSizeStyle: js.UndefOr[String] = js.undefined
  
  /** The vertical alignment of the column. */
  var verticalAlignment: js.UndefOr[String] = js.undefined
  
  /** LINT.ThenChange(//google/apps/card/v1/card.proto) Array of widgets included in the column. */
  var widgets: js.UndefOr[js.Array[AppsDynamiteSharedColumnsColumnWidgets]] = js.undefined
}
object AppsDynamiteSharedColumnsColumn {
  
  inline def apply(): AppsDynamiteSharedColumnsColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamiteSharedColumnsColumn]
  }
  
  extension [Self <: AppsDynamiteSharedColumnsColumn](x: Self) {
    
    inline def setHorizontalAlignment(value: String): Self = StObject.set(x, "horizontalAlignment", value.asInstanceOf[js.Any])
    
    inline def setHorizontalAlignmentUndefined: Self = StObject.set(x, "horizontalAlignment", js.undefined)
    
    inline def setHorizontalSizeStyle(value: String): Self = StObject.set(x, "horizontalSizeStyle", value.asInstanceOf[js.Any])
    
    inline def setHorizontalSizeStyleUndefined: Self = StObject.set(x, "horizontalSizeStyle", js.undefined)
    
    inline def setVerticalAlignment(value: String): Self = StObject.set(x, "verticalAlignment", value.asInstanceOf[js.Any])
    
    inline def setVerticalAlignmentUndefined: Self = StObject.set(x, "verticalAlignment", js.undefined)
    
    inline def setWidgets(value: js.Array[AppsDynamiteSharedColumnsColumnWidgets]): Self = StObject.set(x, "widgets", value.asInstanceOf[js.Any])
    
    inline def setWidgetsUndefined: Self = StObject.set(x, "widgets", js.undefined)
    
    inline def setWidgetsVarargs(value: AppsDynamiteSharedColumnsColumnWidgets*): Self = StObject.set(x, "widgets", js.Array(value*))
  }
}
