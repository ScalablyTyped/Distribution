package typings.jointjs.mod.shapes

import typings.jointjs.mod.attributes.SVGPolylineAttributes
import typings.jointjs.mod.dia.Cell.Selectors
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SVGPolylineSelector extends Selectors {
  
  var polyline: js.UndefOr[SVGPolylineAttributes] = js.native
}
object SVGPolylineSelector {
  
  @scala.inline
  def apply(): SVGPolylineSelector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SVGPolylineSelector]
  }
  
  @scala.inline
  implicit class SVGPolylineSelectorMutableBuilder[Self <: SVGPolylineSelector] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPolyline(value: SVGPolylineAttributes): Self = StObject.set(x, "polyline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolylineUndefined: Self = StObject.set(x, "polyline", js.undefined)
  }
}
