package typings.googleapis.driveV2Mod.driveV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A list of Team Drives.
  */
@js.native
trait SchemaTeamDriveList extends js.Object {
  /**
    * The list of Team Drives.
    */
  var items: js.UndefOr[js.Array[SchemaTeamDrive]] = js.native
  /**
    * This is always drive#teamDriveList
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The page token for the next page of Team Drives.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaTeamDriveList {
  @scala.inline
  def apply(): SchemaTeamDriveList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTeamDriveList]
  }
  @scala.inline
  implicit class SchemaTeamDriveListOps[Self <: SchemaTeamDriveList] (val x: Self) extends AnyVal {
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
    def setItemsVarargs(value: SchemaTeamDrive*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[SchemaTeamDrive]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
  
}

