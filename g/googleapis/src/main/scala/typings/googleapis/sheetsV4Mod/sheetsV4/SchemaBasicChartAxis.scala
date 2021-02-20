package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An axis of the chart. A chart may not have more than one axis per axis
  * position.
  */
@js.native
trait SchemaBasicChartAxis extends StObject {
  
  /**
    * The format of the title. Only valid if the axis is not associated with
    * the domain.
    */
  var format: js.UndefOr[SchemaTextFormat] = js.native
  
  /**
    * The position of this axis.
    */
  var position: js.UndefOr[String] = js.native
  
  /**
    * The title of this axis. If set, this overrides any title inferred from
    * headers of the data.
    */
  var title: js.UndefOr[String] = js.native
  
  /**
    * The axis title text position.
    */
  var titleTextPosition: js.UndefOr[SchemaTextPosition] = js.native
}
object SchemaBasicChartAxis {
  
  @scala.inline
  def apply(): SchemaBasicChartAxis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBasicChartAxis]
  }
  
  @scala.inline
  implicit class SchemaBasicChartAxisMutableBuilder[Self <: SchemaBasicChartAxis] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormat(value: SchemaTextFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleTextPosition(value: SchemaTextPosition): Self = StObject.set(x, "titleTextPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleTextPositionUndefined: Self = StObject.set(x, "titleTextPosition", js.undefined)
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
