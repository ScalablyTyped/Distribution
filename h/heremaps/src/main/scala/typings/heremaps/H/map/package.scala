package typings.heremaps.H.map

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/**
  * The class represents data model of the map. It holds list of layers that are rendered by map's RenderEngine.
  * The class listens to 'update' events from layers and dispatches them to the RenderEngine.
  */
type DataModel = typings.heremaps.H.util.OList

/**
  * A marker with a visual representation in the form of a full styleable and scripteable DOM element. DomMarker are predestinated if small amounts of markers with dynamic styled and/or
  * scripted icons should be displayed om the map (e.g. animated interactive SVG).
  */
type DomMarker = typings.heremaps.H.map.AbstractMarker

/**
  * A marker with a visual representation in the form of a bitmap icon. Marker are predestinated if large amounts of markers with static icons should be displayed om the map.
  */
type Marker = typings.heremaps.H.map.AbstractMarker
