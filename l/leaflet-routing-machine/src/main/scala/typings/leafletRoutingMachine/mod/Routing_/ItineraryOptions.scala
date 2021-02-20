package typings.leafletRoutingMachine.mod.Routing_

import typings.leaflet.mod.CircleMarkerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItineraryOptions extends StObject {
  
  var alternativeClassName: js.UndefOr[String] = js.native
  
  var collapseBtn: js.UndefOr[js.Function1[/* itinerary */ Itinerary_, Unit]] = js.native
  
  var collapseBtnClass: js.UndefOr[String] = js.native
  
  var collapsible: js.UndefOr[Boolean] = js.native
  
  var containerClassName: js.UndefOr[String] = js.native
  
  var distanceTemplate: js.UndefOr[String] = js.native
  
  var formatter: js.UndefOr[Formatter_] = js.native
  
  var itineraryBuilder: js.UndefOr[ItineraryBuilder_] = js.native
  
  var itineraryClassName: js.UndefOr[String] = js.native
  
  var itineraryFormatter: js.UndefOr[ItineraryBuilder_] = js.native
  
  var minimizedClassName: js.UndefOr[String] = js.native
  
  var pointMarkerStyle: js.UndefOr[CircleMarkerOptions] = js.native
  
  var show: js.UndefOr[Boolean] = js.native
  
  var summaryTemplate: js.UndefOr[String] = js.native
  
  var timeTemplate: js.UndefOr[String] = js.native
  
  var totalDistanceRoundingSensitivity: js.UndefOr[Double] = js.native
}
object ItineraryOptions {
  
  @scala.inline
  def apply(): ItineraryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItineraryOptions]
  }
  
  @scala.inline
  implicit class ItineraryOptionsMutableBuilder[Self <: ItineraryOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlternativeClassName(value: String): Self = StObject.set(x, "alternativeClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlternativeClassNameUndefined: Self = StObject.set(x, "alternativeClassName", js.undefined)
    
    @scala.inline
    def setCollapseBtn(value: /* itinerary */ Itinerary_ => Unit): Self = StObject.set(x, "collapseBtn", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCollapseBtnClass(value: String): Self = StObject.set(x, "collapseBtnClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollapseBtnClassUndefined: Self = StObject.set(x, "collapseBtnClass", js.undefined)
    
    @scala.inline
    def setCollapseBtnUndefined: Self = StObject.set(x, "collapseBtn", js.undefined)
    
    @scala.inline
    def setCollapsible(value: Boolean): Self = StObject.set(x, "collapsible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollapsibleUndefined: Self = StObject.set(x, "collapsible", js.undefined)
    
    @scala.inline
    def setContainerClassName(value: String): Self = StObject.set(x, "containerClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerClassNameUndefined: Self = StObject.set(x, "containerClassName", js.undefined)
    
    @scala.inline
    def setDistanceTemplate(value: String): Self = StObject.set(x, "distanceTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistanceTemplateUndefined: Self = StObject.set(x, "distanceTemplate", js.undefined)
    
    @scala.inline
    def setFormatter(value: Formatter_): Self = StObject.set(x, "formatter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
    
    @scala.inline
    def setItineraryBuilder(value: ItineraryBuilder_): Self = StObject.set(x, "itineraryBuilder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItineraryBuilderUndefined: Self = StObject.set(x, "itineraryBuilder", js.undefined)
    
    @scala.inline
    def setItineraryClassName(value: String): Self = StObject.set(x, "itineraryClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItineraryClassNameUndefined: Self = StObject.set(x, "itineraryClassName", js.undefined)
    
    @scala.inline
    def setItineraryFormatter(value: ItineraryBuilder_): Self = StObject.set(x, "itineraryFormatter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItineraryFormatterUndefined: Self = StObject.set(x, "itineraryFormatter", js.undefined)
    
    @scala.inline
    def setMinimizedClassName(value: String): Self = StObject.set(x, "minimizedClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimizedClassNameUndefined: Self = StObject.set(x, "minimizedClassName", js.undefined)
    
    @scala.inline
    def setPointMarkerStyle(value: CircleMarkerOptions): Self = StObject.set(x, "pointMarkerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointMarkerStyleUndefined: Self = StObject.set(x, "pointMarkerStyle", js.undefined)
    
    @scala.inline
    def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    
    @scala.inline
    def setSummaryTemplate(value: String): Self = StObject.set(x, "summaryTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummaryTemplateUndefined: Self = StObject.set(x, "summaryTemplate", js.undefined)
    
    @scala.inline
    def setTimeTemplate(value: String): Self = StObject.set(x, "timeTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeTemplateUndefined: Self = StObject.set(x, "timeTemplate", js.undefined)
    
    @scala.inline
    def setTotalDistanceRoundingSensitivity(value: Double): Self = StObject.set(x, "totalDistanceRoundingSensitivity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalDistanceRoundingSensitivityUndefined: Self = StObject.set(x, "totalDistanceRoundingSensitivity", js.undefined)
  }
}
