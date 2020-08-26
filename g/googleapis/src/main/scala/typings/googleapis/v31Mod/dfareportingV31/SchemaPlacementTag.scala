package typings.googleapis.v31Mod.dfareportingV31

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Placement Tag
  */
@js.native
trait SchemaPlacementTag extends js.Object {
  /**
    * Placement ID
    */
  var placementId: js.UndefOr[String] = js.native
  /**
    * Tags generated for this placement.
    */
  var tagDatas: js.UndefOr[js.Array[SchemaTagData]] = js.native
}

object SchemaPlacementTag {
  @scala.inline
  def apply(): SchemaPlacementTag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPlacementTag]
  }
  @scala.inline
  implicit class SchemaPlacementTagOps[Self <: SchemaPlacementTag] (val x: Self) extends AnyVal {
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
    def setPlacementId(value: String): Self = this.set("placementId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlacementId: Self = this.set("placementId", js.undefined)
    @scala.inline
    def setTagDatasVarargs(value: SchemaTagData*): Self = this.set("tagDatas", js.Array(value :_*))
    @scala.inline
    def setTagDatas(value: js.Array[SchemaTagData]): Self = this.set("tagDatas", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTagDatas: Self = this.set("tagDatas", js.undefined)
  }
  
}

