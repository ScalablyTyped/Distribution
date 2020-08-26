package typings.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Identifies the location of a custom souce.
  */
@js.native
trait SchemaCustomSourceLocation extends js.Object {
  /**
    * Whether this source is stateful.
    */
  var stateful: js.UndefOr[Boolean] = js.native
}

object SchemaCustomSourceLocation {
  @scala.inline
  def apply(): SchemaCustomSourceLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomSourceLocation]
  }
  @scala.inline
  implicit class SchemaCustomSourceLocationOps[Self <: SchemaCustomSourceLocation] (val x: Self) extends AnyVal {
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
    def setStateful(value: Boolean): Self = this.set("stateful", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStateful: Self = this.set("stateful", js.undefined)
  }
  
}

