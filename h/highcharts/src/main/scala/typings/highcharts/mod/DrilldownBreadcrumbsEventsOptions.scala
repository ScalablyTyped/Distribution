package typings.highcharts.mod

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DrilldownBreadcrumbsEventsOptions extends StObject {
  
  /**
    * (Highcharts) Fires when clicking on the breadcrumbs button. Two arguments
    * are passed to the function. First breadcrumb button as an SVG element.
    * Second is the breadcrumbs class, containing reference to the chart,
    * series etc. (see online documentation for example)
    *
    * Return false to stop default buttons click action.
    */
  var click: js.UndefOr[BreadcrumbsClickCallbackFunction] = js.undefined
}
object DrilldownBreadcrumbsEventsOptions {
  
  inline def apply(): DrilldownBreadcrumbsEventsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DrilldownBreadcrumbsEventsOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DrilldownBreadcrumbsEventsOptions] (val x: Self) extends AnyVal {
    
    inline def setClick(value: (/* event */ Event, /* options */ BreadcrumbOptions, /* e */ Event) => Unit): Self = StObject.set(x, "click", js.Any.fromFunction3(value))
    
    inline def setClickUndefined: Self = StObject.set(x, "click", js.undefined)
  }
}
