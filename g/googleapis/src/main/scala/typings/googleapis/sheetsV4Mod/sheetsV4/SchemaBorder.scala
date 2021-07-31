package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A border along a cell.
  */
trait SchemaBorder extends StObject {
  
  /**
    * The color of the border.
    */
  var color: js.UndefOr[SchemaColor] = js.undefined
  
  /**
    * The style of the border.
    */
  var style: js.UndefOr[String] = js.undefined
  
  /**
    * The width of the border, in pixels. Deprecated; the width is determined
    * by the &quot;style&quot; field.
    */
  var width: js.UndefOr[Double] = js.undefined
}
object SchemaBorder {
  
  @scala.inline
  def apply(): SchemaBorder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBorder]
  }
  
  @scala.inline
  implicit class SchemaBorderMutableBuilder[Self <: SchemaBorder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: SchemaColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
