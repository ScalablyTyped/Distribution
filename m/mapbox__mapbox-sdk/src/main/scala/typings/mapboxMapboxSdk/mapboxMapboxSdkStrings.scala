package typings.mapboxMapboxSdk

import typings.mapboxMapboxSdk.libClassesMapiRequestMod.DirectionsApproach
import typings.mapboxMapboxSdk.libClassesMapiRequestMod.MapboxProfile
import typings.mapboxMapboxSdk.servicesDirectionsMod.DirectionsAnnotation
import typings.mapboxMapboxSdk.servicesDirectionsMod.DirectionsClass
import typings.mapboxMapboxSdk.servicesDirectionsMod.DirectionsGeometry
import typings.mapboxMapboxSdk.servicesDirectionsMod.DirectionsMode
import typings.mapboxMapboxSdk.servicesDirectionsMod.DirectionsOverview
import typings.mapboxMapboxSdk.servicesDirectionsMod.DirectionsSide
import typings.mapboxMapboxSdk.servicesDirectionsMod.DirectionsUnits
import typings.mapboxMapboxSdk.servicesDirectionsMod.ManeuverModifier
import typings.mapboxMapboxSdk.servicesDirectionsMod.ManeuverType
import typings.mapboxMapboxSdk.servicesGeocodingMod.GeocodeMode
import typings.mapboxMapboxSdk.servicesGeocodingMod.GeocodeQueryType
import typings.mapboxMapboxSdk.servicesOptimizationMod.OptimizationAnnotation
import typings.mapboxMapboxSdk.servicesTilequeryMod.GeometryType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mapboxMapboxSdkStrings {
  
  @js.native
  sealed trait Feature extends StObject
  inline def Feature: Feature = "Feature".asInstanceOf[Feature]
  
  @js.native
  sealed trait FeatureCollection extends StObject
  inline def FeatureCollection: FeatureCollection = "FeatureCollection".asInstanceOf[FeatureCollection]
  
  @js.native
  sealed trait Point extends StObject
  inline def Point: Point = "Point".asInstanceOf[Point]
  
  @js.native
  sealed trait address
    extends StObject
       with GeocodeQueryType
  inline def address: address = "address".asInstanceOf[address]
  
  @js.native
  sealed trait all extends StObject
  inline def all: all = "all".asInstanceOf[all]
  
  @js.native
  sealed trait any extends StObject
  inline def any: any = "any".asInstanceOf[any]
  
  @js.native
  sealed trait arrive
    extends StObject
       with ManeuverModifier
       with ManeuverType
  inline def arrive: arrive = "arrive".asInstanceOf[arrive]
  
  @js.native
  sealed trait auto extends StObject
  inline def auto: auto = "auto".asInstanceOf[auto]
  
  @js.native
  sealed trait congestion
    extends StObject
       with DirectionsAnnotation
  inline def congestion: congestion = "congestion".asInstanceOf[congestion]
  
  @js.native
  sealed trait continue
    extends StObject
       with ManeuverType
  inline def continue: continue = "continue".asInstanceOf[continue]
  
  @js.native
  sealed trait country
    extends StObject
       with GeocodeQueryType
  inline def country: country = "country".asInstanceOf[country]
  
  @js.native
  sealed trait created extends StObject
  inline def created: created = "created".asInstanceOf[created]
  
  @js.native
  sealed trait curb
    extends StObject
       with DirectionsApproach
  inline def curb: curb = "curb".asInstanceOf[curb]
  
  @js.native
  sealed trait cycling
    extends StObject
       with DirectionsMode
       with MapboxProfile
  inline def cycling: cycling = "cycling".asInstanceOf[cycling]
  
  @js.native
  sealed trait data extends StObject
  inline def data: data = "data".asInstanceOf[data]
  
  @js.native
  sealed trait depart
    extends StObject
       with ManeuverModifier
       with ManeuverType
  inline def depart: depart = "depart".asInstanceOf[depart]
  
  @js.native
  sealed trait distance
    extends StObject
       with DirectionsAnnotation
       with OptimizationAnnotation
  inline def distance: distance = "distance".asInstanceOf[distance]
  
  @js.native
  sealed trait district
    extends StObject
       with GeocodeQueryType
  inline def district: district = "district".asInstanceOf[district]
  
  @js.native
  sealed trait driving
    extends StObject
       with DirectionsMode
       with MapboxProfile
  inline def driving: driving = "driving".asInstanceOf[driving]
  
  @js.native
  sealed trait `driving-traffic`
    extends StObject
       with MapboxProfile
  inline def `driving-traffic`: `driving-traffic` = "driving-traffic".asInstanceOf[`driving-traffic`]
  
  @js.native
  sealed trait duration
    extends StObject
       with DirectionsAnnotation
       with OptimizationAnnotation
  inline def duration: duration = "duration".asInstanceOf[duration]
  
  @js.native
  sealed trait `end of road`
    extends StObject
       with ManeuverType
  inline def `end of road`: `end of road` = ("end of road").asInstanceOf[`end of road`]
  
  @js.native
  sealed trait `exit rotary`
    extends StObject
       with ManeuverType
  inline def `exit rotary`: `exit rotary` = ("exit rotary").asInstanceOf[`exit rotary`]
  
  @js.native
  sealed trait `exit roundabout`
    extends StObject
       with ManeuverType
  inline def `exit roundabout`: `exit roundabout` = ("exit roundabout").asInstanceOf[`exit roundabout`]
  
  @js.native
  sealed trait failed extends StObject
  inline def failed: failed = "failed".asInstanceOf[failed]
  
  @js.native
  sealed trait `false`
    extends StObject
       with DirectionsOverview
  inline def `false`: `false` = "false".asInstanceOf[`false`]
  
  @js.native
  sealed trait ferry
    extends StObject
       with DirectionsClass
       with DirectionsMode
  inline def ferry: ferry = "ferry".asInstanceOf[ferry]
  
  @js.native
  sealed trait first extends StObject
  inline def first: first = "first".asInstanceOf[first]
  
  @js.native
  sealed trait fork
    extends StObject
       with ManeuverType
  inline def fork: fork = "fork".asInstanceOf[fork]
  
  @js.native
  sealed trait form extends StObject
  inline def form: form = "form".asInstanceOf[form]
  
  @js.native
  sealed trait full
    extends StObject
       with DirectionsOverview
  inline def full: full = "full".asInstanceOf[full]
  
  @js.native
  sealed trait geojson
    extends StObject
       with DirectionsGeometry
  inline def geojson: geojson = "geojson".asInstanceOf[geojson]
  
  @js.native
  sealed trait imperial
    extends StObject
       with DirectionsUnits
  inline def imperial: imperial = "imperial".asInstanceOf[imperial]
  
  @js.native
  sealed trait json extends StObject
  inline def json: json = "json".asInstanceOf[json]
  
  @js.native
  sealed trait large extends StObject
  inline def large: large = "large".asInstanceOf[large]
  
  @js.native
  sealed trait last extends StObject
  inline def last: last = "last".asInstanceOf[last]
  
  @js.native
  sealed trait left
    extends StObject
       with DirectionsSide
       with ManeuverModifier
  inline def left: left = "left".asInstanceOf[left]
  
  @js.native
  sealed trait linestring
    extends StObject
       with GeometryType
  inline def linestring: linestring = "linestring".asInstanceOf[linestring]
  
  @js.native
  sealed trait locality
    extends StObject
       with GeocodeQueryType
  inline def locality: locality = "locality".asInstanceOf[locality]
  
  @js.native
  sealed trait mapboxDotplaces
    extends StObject
       with GeocodeMode
  inline def mapboxDotplaces: mapboxDotplaces = "mapbox.places".asInstanceOf[mapboxDotplaces]
  
  @js.native
  sealed trait `mapboxDotplaces-permanent`
    extends StObject
       with GeocodeMode
  inline def `mapboxDotplaces-permanent`: `mapboxDotplaces-permanent` = "mapbox.places-permanent".asInstanceOf[`mapboxDotplaces-permanent`]
  
  @js.native
  sealed trait merge
    extends StObject
       with ManeuverType
  inline def merge: merge = "merge".asInstanceOf[merge]
  
  @js.native
  sealed trait metric
    extends StObject
       with DirectionsUnits
  inline def metric: metric = "metric".asInstanceOf[metric]
  
  @js.native
  sealed trait modified extends StObject
  inline def modified: modified = "modified".asInstanceOf[modified]
  
  @js.native
  sealed trait motorway
    extends StObject
       with DirectionsClass
  inline def motorway: motorway = "motorway".asInstanceOf[motorway]
  
  @js.native
  sealed trait neighborhood
    extends StObject
       with GeocodeQueryType
  inline def neighborhood: neighborhood = "neighborhood".asInstanceOf[neighborhood]
  
  @js.native
  sealed trait `new name`
    extends StObject
       with ManeuverType
  inline def `new name`: `new name` = ("new name").asInstanceOf[`new name`]
  
  @js.native
  sealed trait notification
    extends StObject
       with ManeuverType
  inline def notification: notification = "notification".asInstanceOf[notification]
  
  @js.native
  sealed trait `off ramp`
    extends StObject
       with ManeuverType
  inline def `off ramp`: `off ramp` = ("off ramp").asInstanceOf[`off ramp`]
  
  @js.native
  sealed trait `on ramp`
    extends StObject
       with ManeuverType
  inline def `on ramp`: `on ramp` = ("on ramp").asInstanceOf[`on ramp`]
  
  @js.native
  sealed trait place
    extends StObject
       with GeocodeQueryType
  inline def place: place = "place".asInstanceOf[place]
  
  @js.native
  sealed trait png extends StObject
  inline def png: png = "png".asInstanceOf[png]
  
  @js.native
  sealed trait poi
    extends StObject
       with GeocodeQueryType
  inline def poi: poi = "poi".asInstanceOf[poi]
  
  @js.native
  sealed trait poiDotlandmark
    extends StObject
       with GeocodeQueryType
  inline def poiDotlandmark: poiDotlandmark = "poi.landmark".asInstanceOf[poiDotlandmark]
  
  @js.native
  sealed trait point_
    extends StObject
       with GeometryType
  inline def point_ : point_ = "point".asInstanceOf[point_]
  
  @js.native
  sealed trait polygon
    extends StObject
       with GeometryType
  inline def polygon: polygon = "polygon".asInstanceOf[polygon]
  
  @js.native
  sealed trait polyline
    extends StObject
       with DirectionsGeometry
  inline def polyline: polyline = "polyline".asInstanceOf[polyline]
  
  @js.native
  sealed trait polyline6
    extends StObject
       with DirectionsGeometry
  inline def polyline6: polyline6 = "polyline6".asInstanceOf[polyline6]
  
  @js.native
  sealed trait postcode
    extends StObject
       with GeocodeQueryType
  inline def postcode: postcode = "postcode".asInstanceOf[postcode]
  
  @js.native
  sealed trait `private` extends StObject
  inline def `private`: `private` = "private".asInstanceOf[`private`]
  
  @js.native
  sealed trait processing extends StObject
  inline def processing: processing = "processing".asInstanceOf[processing]
  
  @js.native
  sealed trait public extends StObject
  inline def public: public = "public".asInstanceOf[public]
  
  @js.native
  sealed trait queued extends StObject
  inline def queued: queued = "queued".asInstanceOf[queued]
  
  @js.native
  sealed trait raster extends StObject
  inline def raster: raster = "raster".asInstanceOf[raster]
  
  @js.native
  sealed trait region
    extends StObject
       with GeocodeQueryType
  inline def region: region = "region".asInstanceOf[region]
  
  @js.native
  sealed trait restricted
    extends StObject
       with DirectionsClass
  inline def restricted: restricted = "restricted".asInstanceOf[restricted]
  
  @js.native
  sealed trait right
    extends StObject
       with DirectionsSide
       with ManeuverModifier
  inline def right: right = "right".asInstanceOf[right]
  
  @js.native
  sealed trait rotary
    extends StObject
       with ManeuverType
  inline def rotary: rotary = "rotary".asInstanceOf[rotary]
  
  @js.native
  sealed trait roundabout
    extends StObject
       with ManeuverType
  inline def roundabout: roundabout = "roundabout".asInstanceOf[roundabout]
  
  @js.native
  sealed trait `roundabout turn`
    extends StObject
       with ManeuverType
  inline def `roundabout turn`: `roundabout turn` = ("roundabout turn").asInstanceOf[`roundabout turn`]
  
  @js.native
  sealed trait `sharp left`
    extends StObject
       with ManeuverModifier
  inline def `sharp left`: `sharp left` = ("sharp left").asInstanceOf[`sharp left`]
  
  @js.native
  sealed trait `sharp right`
    extends StObject
       with ManeuverModifier
  inline def `sharp right`: `sharp right` = ("sharp right").asInstanceOf[`sharp right`]
  
  @js.native
  sealed trait simplified
    extends StObject
       with DirectionsOverview
  inline def simplified: simplified = "simplified".asInstanceOf[simplified]
  
  @js.native
  sealed trait `slight left`
    extends StObject
       with ManeuverModifier
  inline def `slight left`: `slight left` = ("slight left").asInstanceOf[`slight left`]
  
  @js.native
  sealed trait `slight right`
    extends StObject
       with ManeuverModifier
  inline def `slight right`: `slight right` = ("slight right").asInstanceOf[`slight right`]
  
  @js.native
  sealed trait small extends StObject
  inline def small: small = "small".asInstanceOf[small]
  
  @js.native
  sealed trait speed
    extends StObject
       with DirectionsAnnotation
       with OptimizationAnnotation
  inline def speed: speed = "speed".asInstanceOf[speed]
  
  @js.native
  sealed trait straight
    extends StObject
       with ManeuverModifier
  inline def straight: straight = "straight".asInstanceOf[straight]
  
  @js.native
  sealed trait success extends StObject
  inline def success: success = "success".asInstanceOf[success]
  
  @js.native
  sealed trait toll
    extends StObject
       with DirectionsClass
  inline def toll: toll = "toll".asInstanceOf[toll]
  
  @js.native
  sealed trait train
    extends StObject
       with DirectionsMode
  inline def train: train = "train".asInstanceOf[train]
  
  @js.native
  sealed trait tunnel
    extends StObject
       with DirectionsClass
  inline def tunnel: tunnel = "tunnel".asInstanceOf[tunnel]
  
  @js.native
  sealed trait turn
    extends StObject
       with ManeuverType
  inline def turn: turn = "turn".asInstanceOf[turn]
  
  @js.native
  sealed trait unaccessible
    extends StObject
       with DirectionsMode
  inline def unaccessible: unaccessible = "unaccessible".asInstanceOf[unaccessible]
  
  @js.native
  sealed trait unlimited extends StObject
  inline def unlimited: unlimited = "unlimited".asInstanceOf[unlimited]
  
  @js.native
  sealed trait unrestricted
    extends StObject
       with DirectionsApproach
  inline def unrestricted: unrestricted = "unrestricted".asInstanceOf[unrestricted]
  
  @js.native
  sealed trait uturn
    extends StObject
       with ManeuverModifier
  inline def uturn: uturn = "uturn".asInstanceOf[uturn]
  
  @js.native
  sealed trait vector extends StObject
  inline def vector: vector = "vector".asInstanceOf[vector]
  
  @js.native
  sealed trait walking
    extends StObject
       with DirectionsMode
       with MapboxProfile
  inline def walking: walking = "walking".asInstanceOf[walking]
}
