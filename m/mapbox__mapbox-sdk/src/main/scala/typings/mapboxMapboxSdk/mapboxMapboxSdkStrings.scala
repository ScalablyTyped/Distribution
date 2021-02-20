package typings.mapboxMapboxSdk

import typings.mapboxMapboxSdk.directionsMod.DirectionsAnnotation
import typings.mapboxMapboxSdk.directionsMod.DirectionsClass
import typings.mapboxMapboxSdk.directionsMod.DirectionsGeometry
import typings.mapboxMapboxSdk.directionsMod.DirectionsMode
import typings.mapboxMapboxSdk.directionsMod.DirectionsOverview
import typings.mapboxMapboxSdk.directionsMod.DirectionsProfile
import typings.mapboxMapboxSdk.directionsMod.DirectionsSide
import typings.mapboxMapboxSdk.directionsMod.DirectionsUnits
import typings.mapboxMapboxSdk.directionsMod.ManeuverModifier
import typings.mapboxMapboxSdk.directionsMod.ManeuverType
import typings.mapboxMapboxSdk.geocodingMod.GeocodeMode
import typings.mapboxMapboxSdk.geocodingMod.GeocodeQueryType
import typings.mapboxMapboxSdk.mapiRequestMod.DirectionsApproach
import typings.mapboxMapboxSdk.mapiRequestMod.MapboxProfile
import typings.mapboxMapboxSdk.tilequeryMod.GeometryType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mapboxMapboxSdkStrings {
  
  @js.native
  sealed trait address extends GeocodeQueryType
  @scala.inline
  def address: address = "address".asInstanceOf[address]
  
  @js.native
  sealed trait any extends StObject
  @scala.inline
  def any: any = "any".asInstanceOf[any]
  
  @js.native
  sealed trait arrive
    extends ManeuverModifier
       with ManeuverType
  @scala.inline
  def arrive: arrive = "arrive".asInstanceOf[arrive]
  
  @js.native
  sealed trait auto extends StObject
  @scala.inline
  def auto: auto = "auto".asInstanceOf[auto]
  
  @js.native
  sealed trait congestion extends DirectionsAnnotation
  @scala.inline
  def congestion: congestion = "congestion".asInstanceOf[congestion]
  
  @js.native
  sealed trait continue extends ManeuverType
  @scala.inline
  def continue: continue = "continue".asInstanceOf[continue]
  
  @js.native
  sealed trait country extends GeocodeQueryType
  @scala.inline
  def country: country = "country".asInstanceOf[country]
  
  @js.native
  sealed trait curb extends DirectionsApproach
  @scala.inline
  def curb: curb = "curb".asInstanceOf[curb]
  
  @js.native
  sealed trait cycling
    extends DirectionsMode
       with DirectionsProfile
       with MapboxProfile
  @scala.inline
  def cycling: cycling = "cycling".asInstanceOf[cycling]
  
  @js.native
  sealed trait depart
    extends ManeuverModifier
       with ManeuverType
  @scala.inline
  def depart: depart = "depart".asInstanceOf[depart]
  
  @js.native
  sealed trait distance extends DirectionsAnnotation
  @scala.inline
  def distance: distance = "distance".asInstanceOf[distance]
  
  @js.native
  sealed trait district extends GeocodeQueryType
  @scala.inline
  def district: district = "district".asInstanceOf[district]
  
  @js.native
  sealed trait driving
    extends DirectionsMode
       with DirectionsProfile
       with MapboxProfile
  @scala.inline
  def driving: driving = "driving".asInstanceOf[driving]
  
  @js.native
  sealed trait `driving-traffic` extends DirectionsProfile
  @scala.inline
  def `driving-traffic`: `driving-traffic` = "driving-traffic".asInstanceOf[`driving-traffic`]
  
  @js.native
  sealed trait duration extends DirectionsAnnotation
  @scala.inline
  def duration: duration = "duration".asInstanceOf[duration]
  
  @js.native
  sealed trait `end of road` extends ManeuverType
  @scala.inline
  def `end of road`: `end of road` = ("end of road").asInstanceOf[`end of road`]
  
  @js.native
  sealed trait `exit rotary` extends ManeuverType
  @scala.inline
  def `exit rotary`: `exit rotary` = ("exit rotary").asInstanceOf[`exit rotary`]
  
  @js.native
  sealed trait `exit roundabout` extends ManeuverType
  @scala.inline
  def `exit roundabout`: `exit roundabout` = ("exit roundabout").asInstanceOf[`exit roundabout`]
  
  @js.native
  sealed trait `false` extends StObject
  @scala.inline
  def `false`: `false` = "false".asInstanceOf[`false`]
  
  @js.native
  sealed trait ferry
    extends DirectionsClass
       with DirectionsMode
  @scala.inline
  def ferry: ferry = "ferry".asInstanceOf[ferry]
  
  @js.native
  sealed trait first extends StObject
  @scala.inline
  def first: first = "first".asInstanceOf[first]
  
  @js.native
  sealed trait fork extends ManeuverType
  @scala.inline
  def fork: fork = "fork".asInstanceOf[fork]
  
  @js.native
  sealed trait full extends DirectionsOverview
  @scala.inline
  def full: full = "full".asInstanceOf[full]
  
  @js.native
  sealed trait geojson extends DirectionsGeometry
  @scala.inline
  def geojson: geojson = "geojson".asInstanceOf[geojson]
  
  @js.native
  sealed trait imperial extends DirectionsUnits
  @scala.inline
  def imperial: imperial = "imperial".asInstanceOf[imperial]
  
  @js.native
  sealed trait json extends StObject
  @scala.inline
  def json: json = "json".asInstanceOf[json]
  
  @js.native
  sealed trait large extends StObject
  @scala.inline
  def large: large = "large".asInstanceOf[large]
  
  @js.native
  sealed trait last extends StObject
  @scala.inline
  def last: last = "last".asInstanceOf[last]
  
  @js.native
  sealed trait left
    extends DirectionsSide
       with ManeuverModifier
  @scala.inline
  def left: left = "left".asInstanceOf[left]
  
  @js.native
  sealed trait linestring extends GeometryType
  @scala.inline
  def linestring: linestring = "linestring".asInstanceOf[linestring]
  
  @js.native
  sealed trait locality extends GeocodeQueryType
  @scala.inline
  def locality: locality = "locality".asInstanceOf[locality]
  
  @js.native
  sealed trait mapboxDotplaces extends GeocodeMode
  @scala.inline
  def mapboxDotplaces: mapboxDotplaces = "mapbox.places".asInstanceOf[mapboxDotplaces]
  
  @js.native
  sealed trait `mapboxDotplaces-permanent` extends GeocodeMode
  @scala.inline
  def `mapboxDotplaces-permanent`: `mapboxDotplaces-permanent` = "mapbox.places-permanent".asInstanceOf[`mapboxDotplaces-permanent`]
  
  @js.native
  sealed trait merge extends ManeuverType
  @scala.inline
  def merge: merge = "merge".asInstanceOf[merge]
  
  @js.native
  sealed trait metric extends DirectionsUnits
  @scala.inline
  def metric: metric = "metric".asInstanceOf[metric]
  
  @js.native
  sealed trait motorway extends DirectionsClass
  @scala.inline
  def motorway: motorway = "motorway".asInstanceOf[motorway]
  
  @js.native
  sealed trait neighborhood extends GeocodeQueryType
  @scala.inline
  def neighborhood: neighborhood = "neighborhood".asInstanceOf[neighborhood]
  
  @js.native
  sealed trait `new name` extends ManeuverType
  @scala.inline
  def `new name`: `new name` = ("new name").asInstanceOf[`new name`]
  
  @js.native
  sealed trait notification extends ManeuverType
  @scala.inline
  def notification: notification = "notification".asInstanceOf[notification]
  
  @js.native
  sealed trait `off ramp` extends ManeuverType
  @scala.inline
  def `off ramp`: `off ramp` = ("off ramp").asInstanceOf[`off ramp`]
  
  @js.native
  sealed trait `on ramp` extends ManeuverType
  @scala.inline
  def `on ramp`: `on ramp` = ("on ramp").asInstanceOf[`on ramp`]
  
  @js.native
  sealed trait place extends GeocodeQueryType
  @scala.inline
  def place: place = "place".asInstanceOf[place]
  
  @js.native
  sealed trait png extends StObject
  @scala.inline
  def png: png = "png".asInstanceOf[png]
  
  @js.native
  sealed trait poi extends GeocodeQueryType
  @scala.inline
  def poi: poi = "poi".asInstanceOf[poi]
  
  @js.native
  sealed trait poiDotlandmark extends GeocodeQueryType
  @scala.inline
  def poiDotlandmark: poiDotlandmark = "poi.landmark".asInstanceOf[poiDotlandmark]
  
  @js.native
  sealed trait point extends GeometryType
  @scala.inline
  def point: point = "point".asInstanceOf[point]
  
  @js.native
  sealed trait polygon extends GeometryType
  @scala.inline
  def polygon: polygon = "polygon".asInstanceOf[polygon]
  
  @js.native
  sealed trait polyline extends DirectionsGeometry
  @scala.inline
  def polyline: polyline = "polyline".asInstanceOf[polyline]
  
  @js.native
  sealed trait polyline6 extends DirectionsGeometry
  @scala.inline
  def polyline6: polyline6 = "polyline6".asInstanceOf[polyline6]
  
  @js.native
  sealed trait postcode extends GeocodeQueryType
  @scala.inline
  def postcode: postcode = "postcode".asInstanceOf[postcode]
  
  @js.native
  sealed trait region extends GeocodeQueryType
  @scala.inline
  def region: region = "region".asInstanceOf[region]
  
  @js.native
  sealed trait restricted extends DirectionsClass
  @scala.inline
  def restricted: restricted = "restricted".asInstanceOf[restricted]
  
  @js.native
  sealed trait right
    extends DirectionsSide
       with ManeuverModifier
  @scala.inline
  def right: right = "right".asInstanceOf[right]
  
  @js.native
  sealed trait rotary extends ManeuverType
  @scala.inline
  def rotary: rotary = "rotary".asInstanceOf[rotary]
  
  @js.native
  sealed trait roundabout extends ManeuverType
  @scala.inline
  def roundabout: roundabout = "roundabout".asInstanceOf[roundabout]
  
  @js.native
  sealed trait `roundabout turn` extends ManeuverType
  @scala.inline
  def `roundabout turn`: `roundabout turn` = ("roundabout turn").asInstanceOf[`roundabout turn`]
  
  @js.native
  sealed trait `sharp left` extends ManeuverModifier
  @scala.inline
  def `sharp left`: `sharp left` = ("sharp left").asInstanceOf[`sharp left`]
  
  @js.native
  sealed trait `sharp right` extends ManeuverModifier
  @scala.inline
  def `sharp right`: `sharp right` = ("sharp right").asInstanceOf[`sharp right`]
  
  @js.native
  sealed trait simplified extends DirectionsOverview
  @scala.inline
  def simplified: simplified = "simplified".asInstanceOf[simplified]
  
  @js.native
  sealed trait `slight left` extends ManeuverModifier
  @scala.inline
  def `slight left`: `slight left` = ("slight left").asInstanceOf[`slight left`]
  
  @js.native
  sealed trait `slight right` extends ManeuverModifier
  @scala.inline
  def `slight right`: `slight right` = ("slight right").asInstanceOf[`slight right`]
  
  @js.native
  sealed trait small extends StObject
  @scala.inline
  def small: small = "small".asInstanceOf[small]
  
  @js.native
  sealed trait speed extends DirectionsAnnotation
  @scala.inline
  def speed: speed = "speed".asInstanceOf[speed]
  
  @js.native
  sealed trait straight extends ManeuverModifier
  @scala.inline
  def straight: straight = "straight".asInstanceOf[straight]
  
  @js.native
  sealed trait toll extends DirectionsClass
  @scala.inline
  def toll: toll = "toll".asInstanceOf[toll]
  
  @js.native
  sealed trait train extends DirectionsMode
  @scala.inline
  def train: train = "train".asInstanceOf[train]
  
  @js.native
  sealed trait tunnel extends DirectionsClass
  @scala.inline
  def tunnel: tunnel = "tunnel".asInstanceOf[tunnel]
  
  @js.native
  sealed trait turn extends ManeuverType
  @scala.inline
  def turn: turn = "turn".asInstanceOf[turn]
  
  @js.native
  sealed trait unaccessible extends DirectionsMode
  @scala.inline
  def unaccessible: unaccessible = "unaccessible".asInstanceOf[unaccessible]
  
  @js.native
  sealed trait unlimited extends StObject
  @scala.inline
  def unlimited: unlimited = "unlimited".asInstanceOf[unlimited]
  
  @js.native
  sealed trait unrestricted extends DirectionsApproach
  @scala.inline
  def unrestricted: unrestricted = "unrestricted".asInstanceOf[unrestricted]
  
  @js.native
  sealed trait uturn extends ManeuverModifier
  @scala.inline
  def uturn: uturn = "uturn".asInstanceOf[uturn]
  
  @js.native
  sealed trait walking
    extends DirectionsMode
       with DirectionsProfile
       with MapboxProfile
  @scala.inline
  def walking: walking = "walking".asInstanceOf[walking]
}
