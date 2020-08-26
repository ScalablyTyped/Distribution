package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This object is sent in an event when a user clicks on an icon on the map.
  * The place ID of this place is stored in the placeId member.
  * To prevent the default info window from showing up, call the stop() method
  * on this event to prevent it being propagated. Learn more about place IDs in
  * the Places API developer guide.
  */
@js.native
trait IconMouseEvent extends MouseEvent {
  /**
    * The place ID of the place that was clicked.
    * This place ID can be used to query more information about the feature
    * that was clicked.
    */
  var placeId: String = js.native
}

object IconMouseEvent {
  @scala.inline
  def apply(latLng: LatLng, placeId: String, stop: () => Unit): IconMouseEvent = {
    val __obj = js.Dynamic.literal(latLng = latLng.asInstanceOf[js.Any], placeId = placeId.asInstanceOf[js.Any], stop = js.Any.fromFunction0(stop))
    __obj.asInstanceOf[IconMouseEvent]
  }
  @scala.inline
  implicit class IconMouseEventOps[Self <: IconMouseEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPlaceId(value: String): Self = this.set("placeId", value.asInstanceOf[js.Any])
  }
  
}

