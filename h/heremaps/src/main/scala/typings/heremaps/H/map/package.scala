package typings.heremaps.H

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object map {
  
  type AbstractMarker = typings.heremaps.H.map.AbstractMarker_
  
  type ArrowStyle = typings.heremaps.H.map.ArrowStyle_
  
  type Circle = typings.heremaps.H.map.Circle_
  
  /**
    * The class represents data model of the map. It holds list of layers that are rendered by map's RenderEngine.
    * The class listens to 'update' events from layers and dispatches them to the RenderEngine.
    */
  type DataModel = typings.heremaps.H.util.OList
  
  type DomIcon = typings.heremaps.H.map.DomIcon_
  
  /**
    * A marker with a visual representation in the form of a full styleable and scripteable DOM element. DomMarker are predestinated if small amounts of markers with dynamic styled and/or
    * scripted icons should be displayed om the map (e.g. animated interactive SVG).
    */
  type DomMarker = typings.heremaps.H.map.AbstractMarker
  
  type Group = typings.heremaps.H.map.Group_
  
  type Icon = typings.heremaps.H.map.Icon_
  
  type Imprint = typings.heremaps.H.map.Imprint_
  
  /**
    * A marker with a visual representation in the form of a bitmap icon. Marker are predestinated if large amounts of markers with static icons should be displayed om the map.
    */
  type Marker = typings.heremaps.H.map.AbstractMarker
  
  type Object = typings.heremaps.H.map.Object_
  
  type Overlay = typings.heremaps.H.map.Overlay_
  
  type Polygon = typings.heremaps.H.map.Polygon_
  
  type Polyline = typings.heremaps.H.map.Polyline_
  
  type Spatial = typings.heremaps.H.map.Spatial_
  
  type SpatialStyle = typings.heremaps.H.map.SpatialStyle_
  
  type ViewModel = typings.heremaps.H.map.ViewModel_
  
  type ViewPort = typings.heremaps.H.map.ViewPort_
}
