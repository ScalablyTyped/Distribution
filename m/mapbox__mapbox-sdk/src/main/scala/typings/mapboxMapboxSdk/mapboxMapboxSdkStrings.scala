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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object mapboxMapboxSdkStrings {
  @js.native
  sealed trait address extends GeocodeQueryType
  
  @js.native
  sealed trait any extends js.Object
  
  @js.native
  sealed trait arrive
    extends ManeuverModifier
       with ManeuverType
  
  @js.native
  sealed trait auto extends js.Object
  
  @js.native
  sealed trait congestion extends DirectionsAnnotation
  
  @js.native
  sealed trait continue extends ManeuverType
  
  @js.native
  sealed trait country extends GeocodeQueryType
  
  @js.native
  sealed trait curb extends DirectionsApproach
  
  @js.native
  sealed trait cycling
    extends DirectionsMode
       with DirectionsProfile
       with MapboxProfile
  
  @js.native
  sealed trait depart
    extends ManeuverModifier
       with ManeuverType
  
  @js.native
  sealed trait distance extends DirectionsAnnotation
  
  @js.native
  sealed trait district extends GeocodeQueryType
  
  @js.native
  sealed trait driving
    extends DirectionsMode
       with DirectionsProfile
       with MapboxProfile
  
  @js.native
  sealed trait `driving-traffic` extends DirectionsProfile
  
  @js.native
  sealed trait duration extends DirectionsAnnotation
  
  @js.native
  sealed trait `end of road` extends ManeuverType
  
  @js.native
  sealed trait `exit rotary` extends ManeuverType
  
  @js.native
  sealed trait `exit roundabout` extends ManeuverType
  
  @js.native
  sealed trait `false` extends js.Object
  
  @js.native
  sealed trait ferry
    extends DirectionsClass
       with DirectionsMode
  
  @js.native
  sealed trait first extends js.Object
  
  @js.native
  sealed trait fork extends ManeuverType
  
  @js.native
  sealed trait full extends DirectionsOverview
  
  @js.native
  sealed trait geojson extends DirectionsGeometry
  
  @js.native
  sealed trait imperial extends DirectionsUnits
  
  @js.native
  sealed trait json extends js.Object
  
  @js.native
  sealed trait last extends js.Object
  
  @js.native
  sealed trait left
    extends DirectionsSide
       with ManeuverModifier
  
  @js.native
  sealed trait linestring extends GeometryType
  
  @js.native
  sealed trait locality extends GeocodeQueryType
  
  @js.native
  sealed trait mapboxDotplaces extends GeocodeMode
  
  @js.native
  sealed trait `mapboxDotplaces-permanent` extends GeocodeMode
  
  @js.native
  sealed trait merge extends ManeuverType
  
  @js.native
  sealed trait metric extends DirectionsUnits
  
  @js.native
  sealed trait motorway extends DirectionsClass
  
  @js.native
  sealed trait neighborhood extends GeocodeQueryType
  
  @js.native
  sealed trait `new name` extends ManeuverType
  
  @js.native
  sealed trait notification extends ManeuverType
  
  @js.native
  sealed trait `off ramp` extends ManeuverType
  
  @js.native
  sealed trait `on ramp` extends ManeuverType
  
  @js.native
  sealed trait place extends GeocodeQueryType
  
  @js.native
  sealed trait png extends js.Object
  
  @js.native
  sealed trait poi extends GeocodeQueryType
  
  @js.native
  sealed trait poiDotlandmark extends GeocodeQueryType
  
  @js.native
  sealed trait point extends GeometryType
  
  @js.native
  sealed trait polygon extends GeometryType
  
  @js.native
  sealed trait polyline extends DirectionsGeometry
  
  @js.native
  sealed trait polyline6 extends DirectionsGeometry
  
  @js.native
  sealed trait postcode extends GeocodeQueryType
  
  @js.native
  sealed trait region extends GeocodeQueryType
  
  @js.native
  sealed trait restricted extends DirectionsClass
  
  @js.native
  sealed trait right
    extends DirectionsSide
       with ManeuverModifier
  
  @js.native
  sealed trait rotary extends ManeuverType
  
  @js.native
  sealed trait roundabout extends ManeuverType
  
  @js.native
  sealed trait `roundabout turn` extends ManeuverType
  
  @js.native
  sealed trait `sharp left` extends ManeuverModifier
  
  @js.native
  sealed trait `sharp right` extends ManeuverModifier
  
  @js.native
  sealed trait simplified extends DirectionsOverview
  
  @js.native
  sealed trait `slight left` extends ManeuverModifier
  
  @js.native
  sealed trait `slight right` extends ManeuverModifier
  
  @js.native
  sealed trait speed extends DirectionsAnnotation
  
  @js.native
  sealed trait straight extends ManeuverModifier
  
  @js.native
  sealed trait toll extends DirectionsClass
  
  @js.native
  sealed trait train extends DirectionsMode
  
  @js.native
  sealed trait tunnel extends DirectionsClass
  
  @js.native
  sealed trait turn extends ManeuverType
  
  @js.native
  sealed trait unaccessible extends DirectionsMode
  
  @js.native
  sealed trait unlimited extends js.Object
  
  @js.native
  sealed trait unrestricted extends DirectionsApproach
  
  @js.native
  sealed trait uturn extends ManeuverModifier
  
  @js.native
  sealed trait walking
    extends DirectionsMode
       with DirectionsProfile
       with MapboxProfile
  
  @scala.inline
  def address: address = "address".asInstanceOf[address]
  @scala.inline
  def any: any = "any".asInstanceOf[any]
  @scala.inline
  def arrive: arrive = "arrive".asInstanceOf[arrive]
  @scala.inline
  def auto: auto = "auto".asInstanceOf[auto]
  @scala.inline
  def congestion: congestion = "congestion".asInstanceOf[congestion]
  @scala.inline
  def continue: continue = "continue".asInstanceOf[continue]
  @scala.inline
  def country: country = "country".asInstanceOf[country]
  @scala.inline
  def curb: curb = "curb".asInstanceOf[curb]
  @scala.inline
  def cycling: cycling = "cycling".asInstanceOf[cycling]
  @scala.inline
  def depart: depart = "depart".asInstanceOf[depart]
  @scala.inline
  def distance: distance = "distance".asInstanceOf[distance]
  @scala.inline
  def district: district = "district".asInstanceOf[district]
  @scala.inline
  def driving: driving = "driving".asInstanceOf[driving]
  @scala.inline
  def `driving-traffic`: `driving-traffic` = "driving-traffic".asInstanceOf[`driving-traffic`]
  @scala.inline
  def duration: duration = "duration".asInstanceOf[duration]
  @scala.inline
  def `end of road`: `end of road` = ("end of road").asInstanceOf[`end of road`]
  @scala.inline
  def `exit rotary`: `exit rotary` = ("exit rotary").asInstanceOf[`exit rotary`]
  @scala.inline
  def `exit roundabout`: `exit roundabout` = ("exit roundabout").asInstanceOf[`exit roundabout`]
  @scala.inline
  def `false`: `false` = "false".asInstanceOf[`false`]
  @scala.inline
  def ferry: ferry = "ferry".asInstanceOf[ferry]
  @scala.inline
  def first: first = "first".asInstanceOf[first]
  @scala.inline
  def fork: fork = "fork".asInstanceOf[fork]
  @scala.inline
  def full: full = "full".asInstanceOf[full]
  @scala.inline
  def geojson: geojson = "geojson".asInstanceOf[geojson]
  @scala.inline
  def imperial: imperial = "imperial".asInstanceOf[imperial]
  @scala.inline
  def json: json = "json".asInstanceOf[json]
  @scala.inline
  def last: last = "last".asInstanceOf[last]
  @scala.inline
  def left: left = "left".asInstanceOf[left]
  @scala.inline
  def linestring: linestring = "linestring".asInstanceOf[linestring]
  @scala.inline
  def locality: locality = "locality".asInstanceOf[locality]
  @scala.inline
  def mapboxDotplaces: mapboxDotplaces = "mapbox.places".asInstanceOf[mapboxDotplaces]
  @scala.inline
  def `mapboxDotplaces-permanent`: `mapboxDotplaces-permanent` = "mapbox.places-permanent".asInstanceOf[`mapboxDotplaces-permanent`]
  @scala.inline
  def merge: merge = "merge".asInstanceOf[merge]
  @scala.inline
  def metric: metric = "metric".asInstanceOf[metric]
  @scala.inline
  def motorway: motorway = "motorway".asInstanceOf[motorway]
  @scala.inline
  def neighborhood: neighborhood = "neighborhood".asInstanceOf[neighborhood]
  @scala.inline
  def `new name`: `new name` = ("new name").asInstanceOf[`new name`]
  @scala.inline
  def notification: notification = "notification".asInstanceOf[notification]
  @scala.inline
  def `off ramp`: `off ramp` = ("off ramp").asInstanceOf[`off ramp`]
  @scala.inline
  def `on ramp`: `on ramp` = ("on ramp").asInstanceOf[`on ramp`]
  @scala.inline
  def place: place = "place".asInstanceOf[place]
  @scala.inline
  def png: png = "png".asInstanceOf[png]
  @scala.inline
  def poi: poi = "poi".asInstanceOf[poi]
  @scala.inline
  def poiDotlandmark: poiDotlandmark = "poi.landmark".asInstanceOf[poiDotlandmark]
  @scala.inline
  def point: point = "point".asInstanceOf[point]
  @scala.inline
  def polygon: polygon = "polygon".asInstanceOf[polygon]
  @scala.inline
  def polyline: polyline = "polyline".asInstanceOf[polyline]
  @scala.inline
  def polyline6: polyline6 = "polyline6".asInstanceOf[polyline6]
  @scala.inline
  def postcode: postcode = "postcode".asInstanceOf[postcode]
  @scala.inline
  def region: region = "region".asInstanceOf[region]
  @scala.inline
  def restricted: restricted = "restricted".asInstanceOf[restricted]
  @scala.inline
  def right: right = "right".asInstanceOf[right]
  @scala.inline
  def rotary: rotary = "rotary".asInstanceOf[rotary]
  @scala.inline
  def roundabout: roundabout = "roundabout".asInstanceOf[roundabout]
  @scala.inline
  def `roundabout turn`: `roundabout turn` = ("roundabout turn").asInstanceOf[`roundabout turn`]
  @scala.inline
  def `sharp left`: `sharp left` = ("sharp left").asInstanceOf[`sharp left`]
  @scala.inline
  def `sharp right`: `sharp right` = ("sharp right").asInstanceOf[`sharp right`]
  @scala.inline
  def simplified: simplified = "simplified".asInstanceOf[simplified]
  @scala.inline
  def `slight left`: `slight left` = ("slight left").asInstanceOf[`slight left`]
  @scala.inline
  def `slight right`: `slight right` = ("slight right").asInstanceOf[`slight right`]
  @scala.inline
  def speed: speed = "speed".asInstanceOf[speed]
  @scala.inline
  def straight: straight = "straight".asInstanceOf[straight]
  @scala.inline
  def toll: toll = "toll".asInstanceOf[toll]
  @scala.inline
  def train: train = "train".asInstanceOf[train]
  @scala.inline
  def tunnel: tunnel = "tunnel".asInstanceOf[tunnel]
  @scala.inline
  def turn: turn = "turn".asInstanceOf[turn]
  @scala.inline
  def unaccessible: unaccessible = "unaccessible".asInstanceOf[unaccessible]
  @scala.inline
  def unlimited: unlimited = "unlimited".asInstanceOf[unlimited]
  @scala.inline
  def unrestricted: unrestricted = "unrestricted".asInstanceOf[unrestricted]
  @scala.inline
  def uturn: uturn = "uturn".asInstanceOf[uturn]
  @scala.inline
  def walking: walking = "walking".asInstanceOf[walking]
}

