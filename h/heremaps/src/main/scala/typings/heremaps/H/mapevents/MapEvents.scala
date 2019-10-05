package typings.heremaps.H.mapevents

import typings.heremaps.H.Map
import typings.heremaps.H.util.Disposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * MapEvents enable the events functionality on the map and on the map objects. By using this extension it is possible to listen to events on map objects like markers, polylines, polygons,
  * circles and on the map object itself. Events are triggered depending on user interaction. Please check the Events Summary section for the list of events fired by this class and by the map
  * objects.
  */
@JSGlobal("H.mapevents.MapEvents")
@js.native
class MapEvents protected () extends Disposable {
  /**
    * Constructor
    * @param map {H.Map} - map instance which is used for firing events
    */
  def this(map: Map) = this()
  /**
    * This method destroys the MapEvents by removing all handlers from the map object. After calling this function mapEvents and map objects will not trigger any events. This object will be
    * disposed automatically if the corresponding map object is disposed.
    */
  def dispose(): Unit = js.native
  /**
    * This method returns map into which events are attached
    * @returns {H.Map}
    */
  def getAttachedMap(): Map = js.native
}

