package typings.googlemaps

import typings.googlemaps.google.maps.DrawingMode
import typings.googlemaps.google.maps.GestureHandlingOptions
import typings.googlemaps.google.maps.MapTypeStyleElementType
import typings.googlemaps.google.maps.MapTypeStyleFeatureType
import typings.googlemaps.google.maps.MarkerChangeOptionEventNames
import typings.googlemaps.google.maps.MarkerMouseEventNames
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object googlemapsStrings {
  @js.native
  sealed trait LineString extends DrawingMode
  
  @js.native
  sealed trait Point extends DrawingMode
  
  @js.native
  sealed trait Polygon extends DrawingMode
  
  @js.native
  sealed trait administrative extends MapTypeStyleFeatureType
  
  @js.native
  sealed trait administrativeDotcountry extends MapTypeStyleFeatureType
  
  @js.native
  sealed trait administrativeDotland_parcel extends MapTypeStyleFeatureType
  
  @js.native
  sealed trait administrativeDotlocality extends MapTypeStyleFeatureType
  
  @js.native
  sealed trait administrativeDotneighborhood extends MapTypeStyleFeatureType
  
  @js.native
  sealed trait administrativeDotprovince extends MapTypeStyleFeatureType
  
  @js.native
  sealed trait all
    extends MapTypeStyleElementType
       with MapTypeStyleFeatureType
  
  @js.native
  sealed trait animation_changed extends MarkerChangeOptionEventNames
  
  @js.native
  sealed trait auto extends GestureHandlingOptions
  
  @js.native
  sealed trait bounds_changed extends js.Object
  
  @js.native
  sealed trait center_changed extends js.Object
  
  @js.native
  sealed trait circle extends js.Object
  
  @js.native
  sealed trait click extends MarkerMouseEventNames
  
  @js.native
  sealed trait clickable_changed extends MarkerChangeOptionEventNames
  
  @js.native
  sealed trait closeclick extends js.Object
  
  @js.native
  sealed trait content_changed extends js.Object
  
  @js.native
  sealed trait cooperative extends GestureHandlingOptions
  
  @js.native
  sealed trait cursor_changed extends MarkerChangeOptionEventNames
  
  @js.native
  sealed trait dblclick extends MarkerMouseEventNames
  
  @js.native
  sealed trait domready extends js.Object
  
  @js.native
  sealed trait drag extends MarkerMouseEventNames
  
  @js.native
  sealed trait dragend extends MarkerMouseEventNames
  
  @js.native
  sealed trait draggable_changed extends MarkerChangeOptionEventNames
  
  @js.native
  sealed trait dragstart extends MarkerMouseEventNames
  
  @js.native
  sealed trait flat_changed extends MarkerChangeOptionEventNames
  
  @js.native
  sealed trait geometry extends MapTypeStyleElementType
  
  @js.native
  sealed trait geometryDotfill extends MapTypeStyleElementType
  
  @js.native
  sealed trait geometryDotstroke extends MapTypeStyleElementType
  
  @js.native
  sealed trait greedy extends GestureHandlingOptions
  
  @js.native
  sealed trait heading_changed extends js.Object
  
  @js.native
  sealed trait html4 extends js.Object
  
  @js.native
  sealed trait html5 extends js.Object
  
  @js.native
  sealed trait icon_changed extends MarkerChangeOptionEventNames
  
  @js.native
  sealed trait idle extends js.Object
  
  @js.native
  sealed trait labels extends MapTypeStyleElementType
  
  @js.native
  sealed trait labelsDoticon extends MapTypeStyleElementType
  
  @js.native
  sealed trait labelsDottext extends MapTypeStyleElementType
  
  @js.native
  sealed trait labelsDottextDotfill extends MapTypeStyleElementType
  
  @js.native
  sealed trait labelsDottextDotstroke extends MapTypeStyleElementType
  
  @js.native
  sealed trait landscape extends MapTypeStyleFeatureType
  
  @js.native
  sealed trait landscapeDotman_made extends MapTypeStyleFeatureType
  
  @js.native
  sealed trait landscapeDotnatural extends MapTypeStyleFeatureType
  
  @js.native
  sealed trait landscapeDotnaturalDotlandcover extends MapTypeStyleFeatureType
  
  @js.native
  sealed trait landscapeDotnaturalDotterrain extends MapTypeStyleFeatureType
  
  @js.native
  sealed trait maptypeid_changed extends js.Object
  
  @js.native
  sealed trait mousedown extends MarkerMouseEventNames
  
  @js.native
  sealed trait mousemove extends js.Object
  
  @js.native
  sealed trait mouseout extends MarkerMouseEventNames
  
  @js.native
  sealed trait mouseover extends MarkerMouseEventNames
  
  @js.native
  sealed trait mouseup extends MarkerMouseEventNames
  
  @js.native
  sealed trait none extends GestureHandlingOptions
  
  @js.native
  sealed trait poi extends MapTypeStyleFeatureType
  
  @js.native
  sealed trait poiDotattraction extends MapTypeStyleFeatureType
  
  @js.native
  sealed trait poiDotbusiness extends MapTypeStyleFeatureType
  
  @js.native
  sealed trait poiDotgovernment extends MapTypeStyleFeatureType
  
  @js.native
  sealed trait poiDotmedical extends MapTypeStyleFeatureType
  
  @js.native
  sealed trait poiDotpark extends MapTypeStyleFeatureType
  
  @js.native
  sealed trait poiDotplace_of_worship extends MapTypeStyleFeatureType
  
  @js.native
  sealed trait poiDotschool extends MapTypeStyleFeatureType
  
  @js.native
  sealed trait poiDotsports_complex extends MapTypeStyleFeatureType
  
  @js.native
  sealed trait poly extends js.Object
  
  @js.native
  sealed trait position_changed extends MarkerChangeOptionEventNames
  
  @js.native
  sealed trait projection_changed extends js.Object
  
  @js.native
  sealed trait rect extends js.Object
  
  @js.native
  sealed trait rightclick extends MarkerMouseEventNames
  
  @js.native
  sealed trait road extends MapTypeStyleFeatureType
  
  @js.native
  sealed trait roadDotarterial extends MapTypeStyleFeatureType
  
  @js.native
  sealed trait roadDothighway extends MapTypeStyleFeatureType
  
  @js.native
  sealed trait roadDothighwayDotcontrolled_access extends MapTypeStyleFeatureType
  
  @js.native
  sealed trait roadDotlocal extends MapTypeStyleFeatureType
  
  @js.native
  sealed trait shape_changed extends MarkerChangeOptionEventNames
  
  @js.native
  sealed trait tilesloaded extends js.Object
  
  @js.native
  sealed trait tilt_changed extends js.Object
  
  @js.native
  sealed trait title_changed extends MarkerChangeOptionEventNames
  
  @js.native
  sealed trait transit extends MapTypeStyleFeatureType
  
  @js.native
  sealed trait transitDotline extends MapTypeStyleFeatureType
  
  @js.native
  sealed trait transitDotstation extends MapTypeStyleFeatureType
  
  @js.native
  sealed trait transitDotstationDotairport extends MapTypeStyleFeatureType
  
  @js.native
  sealed trait transitDotstationDotbus extends MapTypeStyleFeatureType
  
  @js.native
  sealed trait transitDotstationDotrail extends MapTypeStyleFeatureType
  
  @js.native
  sealed trait visible_changed extends MarkerChangeOptionEventNames
  
  @js.native
  sealed trait water extends MapTypeStyleFeatureType
  
  @js.native
  sealed trait webgl extends js.Object
  
  @js.native
  sealed trait zindex_changed extends MarkerChangeOptionEventNames
  
  @js.native
  sealed trait zoom_changed extends js.Object
  
  @scala.inline
  def LineString: LineString = "LineString".asInstanceOf[LineString]
  @scala.inline
  def Point: Point = "Point".asInstanceOf[Point]
  @scala.inline
  def Polygon: Polygon = "Polygon".asInstanceOf[Polygon]
  @scala.inline
  def administrative: administrative = "administrative".asInstanceOf[administrative]
  @scala.inline
  def administrativeDotcountry: administrativeDotcountry = "administrative.country".asInstanceOf[administrativeDotcountry]
  @scala.inline
  def administrativeDotland_parcel: administrativeDotland_parcel = "administrative.land_parcel".asInstanceOf[administrativeDotland_parcel]
  @scala.inline
  def administrativeDotlocality: administrativeDotlocality = "administrative.locality".asInstanceOf[administrativeDotlocality]
  @scala.inline
  def administrativeDotneighborhood: administrativeDotneighborhood = "administrative.neighborhood".asInstanceOf[administrativeDotneighborhood]
  @scala.inline
  def administrativeDotprovince: administrativeDotprovince = "administrative.province".asInstanceOf[administrativeDotprovince]
  @scala.inline
  def all: all = "all".asInstanceOf[all]
  @scala.inline
  def animation_changed: animation_changed = "animation_changed".asInstanceOf[animation_changed]
  @scala.inline
  def auto: auto = "auto".asInstanceOf[auto]
  @scala.inline
  def bounds_changed: bounds_changed = "bounds_changed".asInstanceOf[bounds_changed]
  @scala.inline
  def center_changed: center_changed = "center_changed".asInstanceOf[center_changed]
  @scala.inline
  def circle: circle = "circle".asInstanceOf[circle]
  @scala.inline
  def click: click = "click".asInstanceOf[click]
  @scala.inline
  def clickable_changed: clickable_changed = "clickable_changed".asInstanceOf[clickable_changed]
  @scala.inline
  def closeclick: closeclick = "closeclick".asInstanceOf[closeclick]
  @scala.inline
  def content_changed: content_changed = "content_changed".asInstanceOf[content_changed]
  @scala.inline
  def cooperative: cooperative = "cooperative".asInstanceOf[cooperative]
  @scala.inline
  def cursor_changed: cursor_changed = "cursor_changed".asInstanceOf[cursor_changed]
  @scala.inline
  def dblclick: dblclick = "dblclick".asInstanceOf[dblclick]
  @scala.inline
  def domready: domready = "domready".asInstanceOf[domready]
  @scala.inline
  def drag: drag = "drag".asInstanceOf[drag]
  @scala.inline
  def dragend: dragend = "dragend".asInstanceOf[dragend]
  @scala.inline
  def draggable_changed: draggable_changed = "draggable_changed".asInstanceOf[draggable_changed]
  @scala.inline
  def dragstart: dragstart = "dragstart".asInstanceOf[dragstart]
  @scala.inline
  def flat_changed: flat_changed = "flat_changed".asInstanceOf[flat_changed]
  @scala.inline
  def geometry: geometry = "geometry".asInstanceOf[geometry]
  @scala.inline
  def geometryDotfill: geometryDotfill = "geometry.fill".asInstanceOf[geometryDotfill]
  @scala.inline
  def geometryDotstroke: geometryDotstroke = "geometry.stroke".asInstanceOf[geometryDotstroke]
  @scala.inline
  def greedy: greedy = "greedy".asInstanceOf[greedy]
  @scala.inline
  def heading_changed: heading_changed = "heading_changed".asInstanceOf[heading_changed]
  @scala.inline
  def html4: html4 = "html4".asInstanceOf[html4]
  @scala.inline
  def html5: html5 = "html5".asInstanceOf[html5]
  @scala.inline
  def icon_changed: icon_changed = "icon_changed".asInstanceOf[icon_changed]
  @scala.inline
  def idle: idle = "idle".asInstanceOf[idle]
  @scala.inline
  def labels: labels = "labels".asInstanceOf[labels]
  @scala.inline
  def labelsDoticon: labelsDoticon = "labels.icon".asInstanceOf[labelsDoticon]
  @scala.inline
  def labelsDottext: labelsDottext = "labels.text".asInstanceOf[labelsDottext]
  @scala.inline
  def labelsDottextDotfill: labelsDottextDotfill = "labels.text.fill".asInstanceOf[labelsDottextDotfill]
  @scala.inline
  def labelsDottextDotstroke: labelsDottextDotstroke = "labels.text.stroke".asInstanceOf[labelsDottextDotstroke]
  @scala.inline
  def landscape: landscape = "landscape".asInstanceOf[landscape]
  @scala.inline
  def landscapeDotman_made: landscapeDotman_made = "landscape.man_made".asInstanceOf[landscapeDotman_made]
  @scala.inline
  def landscapeDotnatural: landscapeDotnatural = "landscape.natural".asInstanceOf[landscapeDotnatural]
  @scala.inline
  def landscapeDotnaturalDotlandcover: landscapeDotnaturalDotlandcover = "landscape.natural.landcover".asInstanceOf[landscapeDotnaturalDotlandcover]
  @scala.inline
  def landscapeDotnaturalDotterrain: landscapeDotnaturalDotterrain = "landscape.natural.terrain".asInstanceOf[landscapeDotnaturalDotterrain]
  @scala.inline
  def maptypeid_changed: maptypeid_changed = "maptypeid_changed".asInstanceOf[maptypeid_changed]
  @scala.inline
  def mousedown: mousedown = "mousedown".asInstanceOf[mousedown]
  @scala.inline
  def mousemove: mousemove = "mousemove".asInstanceOf[mousemove]
  @scala.inline
  def mouseout: mouseout = "mouseout".asInstanceOf[mouseout]
  @scala.inline
  def mouseover: mouseover = "mouseover".asInstanceOf[mouseover]
  @scala.inline
  def mouseup: mouseup = "mouseup".asInstanceOf[mouseup]
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  @scala.inline
  def poi: poi = "poi".asInstanceOf[poi]
  @scala.inline
  def poiDotattraction: poiDotattraction = "poi.attraction".asInstanceOf[poiDotattraction]
  @scala.inline
  def poiDotbusiness: poiDotbusiness = "poi.business".asInstanceOf[poiDotbusiness]
  @scala.inline
  def poiDotgovernment: poiDotgovernment = "poi.government".asInstanceOf[poiDotgovernment]
  @scala.inline
  def poiDotmedical: poiDotmedical = "poi.medical".asInstanceOf[poiDotmedical]
  @scala.inline
  def poiDotpark: poiDotpark = "poi.park".asInstanceOf[poiDotpark]
  @scala.inline
  def poiDotplace_of_worship: poiDotplace_of_worship = "poi.place_of_worship".asInstanceOf[poiDotplace_of_worship]
  @scala.inline
  def poiDotschool: poiDotschool = "poi.school".asInstanceOf[poiDotschool]
  @scala.inline
  def poiDotsports_complex: poiDotsports_complex = "poi.sports_complex".asInstanceOf[poiDotsports_complex]
  @scala.inline
  def poly: poly = "poly".asInstanceOf[poly]
  @scala.inline
  def position_changed: position_changed = "position_changed".asInstanceOf[position_changed]
  @scala.inline
  def projection_changed: projection_changed = "projection_changed".asInstanceOf[projection_changed]
  @scala.inline
  def rect: rect = "rect".asInstanceOf[rect]
  @scala.inline
  def rightclick: rightclick = "rightclick".asInstanceOf[rightclick]
  @scala.inline
  def road: road = "road".asInstanceOf[road]
  @scala.inline
  def roadDotarterial: roadDotarterial = "road.arterial".asInstanceOf[roadDotarterial]
  @scala.inline
  def roadDothighway: roadDothighway = "road.highway".asInstanceOf[roadDothighway]
  @scala.inline
  def roadDothighwayDotcontrolled_access: roadDothighwayDotcontrolled_access = "road.highway.controlled_access".asInstanceOf[roadDothighwayDotcontrolled_access]
  @scala.inline
  def roadDotlocal: roadDotlocal = "road.local".asInstanceOf[roadDotlocal]
  @scala.inline
  def shape_changed: shape_changed = "shape_changed".asInstanceOf[shape_changed]
  @scala.inline
  def tilesloaded: tilesloaded = "tilesloaded".asInstanceOf[tilesloaded]
  @scala.inline
  def tilt_changed: tilt_changed = "tilt_changed".asInstanceOf[tilt_changed]
  @scala.inline
  def title_changed: title_changed = "title_changed".asInstanceOf[title_changed]
  @scala.inline
  def transit: transit = "transit".asInstanceOf[transit]
  @scala.inline
  def transitDotline: transitDotline = "transit.line".asInstanceOf[transitDotline]
  @scala.inline
  def transitDotstation: transitDotstation = "transit.station".asInstanceOf[transitDotstation]
  @scala.inline
  def transitDotstationDotairport: transitDotstationDotairport = "transit.station.airport".asInstanceOf[transitDotstationDotairport]
  @scala.inline
  def transitDotstationDotbus: transitDotstationDotbus = "transit.station.bus".asInstanceOf[transitDotstationDotbus]
  @scala.inline
  def transitDotstationDotrail: transitDotstationDotrail = "transit.station.rail".asInstanceOf[transitDotstationDotrail]
  @scala.inline
  def visible_changed: visible_changed = "visible_changed".asInstanceOf[visible_changed]
  @scala.inline
  def water: water = "water".asInstanceOf[water]
  @scala.inline
  def webgl: webgl = "webgl".asInstanceOf[webgl]
  @scala.inline
  def zindex_changed: zindex_changed = "zindex_changed".asInstanceOf[zindex_changed]
  @scala.inline
  def zoom_changed: zoom_changed = "zoom_changed".asInstanceOf[zoom_changed]
}

