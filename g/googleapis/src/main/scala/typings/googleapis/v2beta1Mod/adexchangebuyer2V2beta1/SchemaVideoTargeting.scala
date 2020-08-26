package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents targeting information about video.
  */
@js.native
trait SchemaVideoTargeting extends js.Object {
  /**
    * A list of video positions to be excluded. Position types can either be
    * included or excluded (XOR).
    */
  var excludedPositionTypes: js.UndefOr[js.Array[String]] = js.native
  /**
    * A list of video positions to be included. When the included list is
    * present, the excluded list must be empty. When the excluded list is
    * present, the included list must be empty.
    */
  var targetedPositionTypes: js.UndefOr[js.Array[String]] = js.native
}

object SchemaVideoTargeting {
  @scala.inline
  def apply(): SchemaVideoTargeting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVideoTargeting]
  }
  @scala.inline
  implicit class SchemaVideoTargetingOps[Self <: SchemaVideoTargeting] (val x: Self) extends AnyVal {
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
    def setExcludedPositionTypesVarargs(value: String*): Self = this.set("excludedPositionTypes", js.Array(value :_*))
    @scala.inline
    def setExcludedPositionTypes(value: js.Array[String]): Self = this.set("excludedPositionTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExcludedPositionTypes: Self = this.set("excludedPositionTypes", js.undefined)
    @scala.inline
    def setTargetedPositionTypesVarargs(value: String*): Self = this.set("targetedPositionTypes", js.Array(value :_*))
    @scala.inline
    def setTargetedPositionTypes(value: js.Array[String]): Self = this.set("targetedPositionTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetedPositionTypes: Self = this.set("targetedPositionTypes", js.undefined)
  }
  
}

