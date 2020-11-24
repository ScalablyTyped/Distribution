package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A row of the response to a {@link DistanceMatrixService} request, consisting of a sequence of
  * {@link DistanceMatrixResponseElement}s, one for each corresponding destination address.
  * @see {@link https://developers.google.com/maps/documentation/javascript/reference/distance-matrix#DistanceMatrixResponseRow Maps JavaScript API}
  */
@js.native
trait DistanceMatrixResponseRow extends js.Object {
  
  /**
    * The row's elements, corresponding to the destination addresses.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/distance-matrix#DistanceMatrixResponseRow.elements Maps JavaScript API}
    */
  var elements: js.Array[DistanceMatrixResponseElement] = js.native
}
object DistanceMatrixResponseRow {
  
  @scala.inline
  def apply(elements: js.Array[DistanceMatrixResponseElement]): DistanceMatrixResponseRow = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistanceMatrixResponseRow]
  }
  
  @scala.inline
  implicit class DistanceMatrixResponseRowOps[Self <: DistanceMatrixResponseRow] (val x: Self) extends AnyVal {
    
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
    def setElementsVarargs(value: DistanceMatrixResponseElement*): Self = this.set("elements", js.Array(value :_*))
    
    @scala.inline
    def setElements(value: js.Array[DistanceMatrixResponseElement]): Self = this.set("elements", value.asInstanceOf[js.Any])
  }
}
