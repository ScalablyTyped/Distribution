package typings.leafletRoutingMachine.leafletMod.Routing_

import typings.leaflet.mod.CircleMarkerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItineraryOptions extends StObject {
  
  var alternativeClassName: js.UndefOr[String] = js.undefined
  
  var collapseBtn: js.UndefOr[js.Function1[/* itinerary */ Itinerary_, Unit]] = js.undefined
  
  var collapseBtnClass: js.UndefOr[String] = js.undefined
  
  var collapsible: js.UndefOr[Boolean] = js.undefined
  
  var containerClassName: js.UndefOr[String] = js.undefined
  
  var distanceTemplate: js.UndefOr[String] = js.undefined
  
  var formatter: js.UndefOr[Formatter_] = js.undefined
  
  var itineraryBuilder: js.UndefOr[ItineraryBuilder_] = js.undefined
  
  var itineraryClassName: js.UndefOr[String] = js.undefined
  
  var itineraryFormatter: js.UndefOr[ItineraryBuilder_] = js.undefined
  
  var minimizedClassName: js.UndefOr[String] = js.undefined
  
  var pointMarkerStyle: js.UndefOr[CircleMarkerOptions] = js.undefined
  
  var show: js.UndefOr[Boolean] = js.undefined
  
  var summaryTemplate: js.UndefOr[String] = js.undefined
  
  var timeTemplate: js.UndefOr[String] = js.undefined
  
  var totalDistanceRoundingSensitivity: js.UndefOr[Double] = js.undefined
}
object ItineraryOptions {
  
  inline def apply(): ItineraryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItineraryOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ItineraryOptions] (val x: Self) extends AnyVal {
    
    inline def setAlternativeClassName(value: String): Self = StObject.set(x, "alternativeClassName", value.asInstanceOf[js.Any])
    
    inline def setAlternativeClassNameUndefined: Self = StObject.set(x, "alternativeClassName", js.undefined)
    
    inline def setCollapseBtn(value: /* itinerary */ Itinerary_ => Unit): Self = StObject.set(x, "collapseBtn", js.Any.fromFunction1(value))
    
    inline def setCollapseBtnClass(value: String): Self = StObject.set(x, "collapseBtnClass", value.asInstanceOf[js.Any])
    
    inline def setCollapseBtnClassUndefined: Self = StObject.set(x, "collapseBtnClass", js.undefined)
    
    inline def setCollapseBtnUndefined: Self = StObject.set(x, "collapseBtn", js.undefined)
    
    inline def setCollapsible(value: Boolean): Self = StObject.set(x, "collapsible", value.asInstanceOf[js.Any])
    
    inline def setCollapsibleUndefined: Self = StObject.set(x, "collapsible", js.undefined)
    
    inline def setContainerClassName(value: String): Self = StObject.set(x, "containerClassName", value.asInstanceOf[js.Any])
    
    inline def setContainerClassNameUndefined: Self = StObject.set(x, "containerClassName", js.undefined)
    
    inline def setDistanceTemplate(value: String): Self = StObject.set(x, "distanceTemplate", value.asInstanceOf[js.Any])
    
    inline def setDistanceTemplateUndefined: Self = StObject.set(x, "distanceTemplate", js.undefined)
    
    inline def setFormatter(value: Formatter_): Self = StObject.set(x, "formatter", value.asInstanceOf[js.Any])
    
    inline def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
    
    inline def setItineraryBuilder(value: ItineraryBuilder_): Self = StObject.set(x, "itineraryBuilder", value.asInstanceOf[js.Any])
    
    inline def setItineraryBuilderUndefined: Self = StObject.set(x, "itineraryBuilder", js.undefined)
    
    inline def setItineraryClassName(value: String): Self = StObject.set(x, "itineraryClassName", value.asInstanceOf[js.Any])
    
    inline def setItineraryClassNameUndefined: Self = StObject.set(x, "itineraryClassName", js.undefined)
    
    inline def setItineraryFormatter(value: ItineraryBuilder_): Self = StObject.set(x, "itineraryFormatter", value.asInstanceOf[js.Any])
    
    inline def setItineraryFormatterUndefined: Self = StObject.set(x, "itineraryFormatter", js.undefined)
    
    inline def setMinimizedClassName(value: String): Self = StObject.set(x, "minimizedClassName", value.asInstanceOf[js.Any])
    
    inline def setMinimizedClassNameUndefined: Self = StObject.set(x, "minimizedClassName", js.undefined)
    
    inline def setPointMarkerStyle(value: CircleMarkerOptions): Self = StObject.set(x, "pointMarkerStyle", value.asInstanceOf[js.Any])
    
    inline def setPointMarkerStyleUndefined: Self = StObject.set(x, "pointMarkerStyle", js.undefined)
    
    inline def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    
    inline def setSummaryTemplate(value: String): Self = StObject.set(x, "summaryTemplate", value.asInstanceOf[js.Any])
    
    inline def setSummaryTemplateUndefined: Self = StObject.set(x, "summaryTemplate", js.undefined)
    
    inline def setTimeTemplate(value: String): Self = StObject.set(x, "timeTemplate", value.asInstanceOf[js.Any])
    
    inline def setTimeTemplateUndefined: Self = StObject.set(x, "timeTemplate", js.undefined)
    
    inline def setTotalDistanceRoundingSensitivity(value: Double): Self = StObject.set(x, "totalDistanceRoundingSensitivity", value.asInstanceOf[js.Any])
    
    inline def setTotalDistanceRoundingSensitivityUndefined: Self = StObject.set(x, "totalDistanceRoundingSensitivity", js.undefined)
  }
}
