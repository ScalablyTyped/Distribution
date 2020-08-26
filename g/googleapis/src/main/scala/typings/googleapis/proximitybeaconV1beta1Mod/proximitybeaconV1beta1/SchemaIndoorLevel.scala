package typings.googleapis.proximitybeaconV1beta1Mod.proximitybeaconV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Indoor level, a human-readable string as returned by Google Maps APIs,
  * useful to indicate which floor of a building a beacon is located on.
  */
@js.native
trait SchemaIndoorLevel extends js.Object {
  /**
    * The name of this level.
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaIndoorLevel {
  @scala.inline
  def apply(): SchemaIndoorLevel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIndoorLevel]
  }
  @scala.inline
  implicit class SchemaIndoorLevelOps[Self <: SchemaIndoorLevel] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

