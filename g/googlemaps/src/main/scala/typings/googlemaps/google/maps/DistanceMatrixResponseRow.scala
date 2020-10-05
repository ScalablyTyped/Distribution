package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DistanceMatrixResponseRow extends js.Object {
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

