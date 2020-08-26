package typings.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A metric value representing a list of floating point numbers.
  */
@js.native
trait SchemaFloatingPointList extends js.Object {
  /**
    * Elements of the list.
    */
  var elements: js.UndefOr[js.Array[Double]] = js.native
}

object SchemaFloatingPointList {
  @scala.inline
  def apply(): SchemaFloatingPointList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFloatingPointList]
  }
  @scala.inline
  implicit class SchemaFloatingPointListOps[Self <: SchemaFloatingPointList] (val x: Self) extends AnyVal {
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
    def setElementsVarargs(value: Double*): Self = this.set("elements", js.Array(value :_*))
    @scala.inline
    def setElements(value: js.Array[Double]): Self = this.set("elements", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElements: Self = this.set("elements", js.undefined)
  }
  
}

