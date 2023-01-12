package typings.highcharts.mod

import typings.highcharts.highchartsStrings.curved
import typings.highcharts.highchartsStrings.default
import typings.highcharts.highchartsStrings.straight
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotOrganizationLinkOptions extends StObject {
  
  /**
    * (Highcharts) The color of the links between nodes.
    */
  var color: js.UndefOr[ColorString] = js.undefined
  
  /**
    * (Highcharts) The line width of the links connecting nodes, in pixels.
    */
  var lineWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts) Radius for the rounded corners of the links between nodes.
    * Works for `default` link type.
    */
  var radius: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts) Type of the link shape.
    */
  var `type`: js.UndefOr[curved | default | straight] = js.undefined
}
object PlotOrganizationLinkOptions {
  
  inline def apply(): PlotOrganizationLinkOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotOrganizationLinkOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlotOrganizationLinkOptions] (val x: Self) extends AnyVal {
    
    inline def setColor(value: ColorString): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
    
    inline def setLineWidthUndefined: Self = StObject.set(x, "lineWidth", js.undefined)
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    
    inline def setType(value: curved | default | straight): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
