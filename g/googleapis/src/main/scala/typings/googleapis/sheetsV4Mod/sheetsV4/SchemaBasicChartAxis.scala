package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBasicChartAxis extends StObject {
  
  /**
    * The format of the title. Only valid if the axis is not associated with the domain. The link field is not supported.
    */
  var format: js.UndefOr[SchemaTextFormat] = js.undefined
  
  /**
    * The position of this axis.
    */
  var position: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The title of this axis. If set, this overrides any title inferred from headers of the data.
    */
  var title: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The axis title text position.
    */
  var titleTextPosition: js.UndefOr[SchemaTextPosition] = js.undefined
  
  /**
    * The view window options for this axis.
    */
  var viewWindowOptions: js.UndefOr[SchemaChartAxisViewWindowOptions] = js.undefined
}
object SchemaBasicChartAxis {
  
  inline def apply(): SchemaBasicChartAxis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBasicChartAxis]
  }
  
  extension [Self <: SchemaBasicChartAxis](x: Self) {
    
    inline def setFormat(value: SchemaTextFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionNull: Self = StObject.set(x, "position", null)
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleTextPosition(value: SchemaTextPosition): Self = StObject.set(x, "titleTextPosition", value.asInstanceOf[js.Any])
    
    inline def setTitleTextPositionUndefined: Self = StObject.set(x, "titleTextPosition", js.undefined)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setViewWindowOptions(value: SchemaChartAxisViewWindowOptions): Self = StObject.set(x, "viewWindowOptions", value.asInstanceOf[js.Any])
    
    inline def setViewWindowOptionsUndefined: Self = StObject.set(x, "viewWindowOptions", js.undefined)
  }
}
