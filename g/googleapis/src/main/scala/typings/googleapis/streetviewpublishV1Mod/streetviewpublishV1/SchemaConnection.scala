package typings.googleapis.streetviewpublishV1Mod.streetviewpublishV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A connection is the link from a source photo to a destination photo.
  */
@js.native
trait SchemaConnection extends js.Object {
  /**
    * Required. The destination of the connection from the containing photo to
    * another photo.
    */
  var target: js.UndefOr[SchemaPhotoId] = js.native
}

object SchemaConnection {
  @scala.inline
  def apply(): SchemaConnection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConnection]
  }
  @scala.inline
  implicit class SchemaConnectionOps[Self <: SchemaConnection] (val x: Self) extends AnyVal {
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
    def setTarget(value: SchemaPhotoId): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
  }
  
}

