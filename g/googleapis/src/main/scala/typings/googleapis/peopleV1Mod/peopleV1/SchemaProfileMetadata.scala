package typings.googleapis.peopleV1Mod.peopleV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The read-only metadata about a profile.
  */
@js.native
trait SchemaProfileMetadata extends js.Object {
  /**
    * The profile object type.
    */
  var objectType: js.UndefOr[String] = js.native
  /**
    * The user types.
    */
  var userTypes: js.UndefOr[js.Array[String]] = js.native
}

object SchemaProfileMetadata {
  @scala.inline
  def apply(): SchemaProfileMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProfileMetadata]
  }
  @scala.inline
  implicit class SchemaProfileMetadataOps[Self <: SchemaProfileMetadata] (val x: Self) extends AnyVal {
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
    def setObjectType(value: String): Self = this.set("objectType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectType: Self = this.set("objectType", js.undefined)
    @scala.inline
    def setUserTypesVarargs(value: String*): Self = this.set("userTypes", js.Array(value :_*))
    @scala.inline
    def setUserTypes(value: js.Array[String]): Self = this.set("userTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserTypes: Self = this.set("userTypes", js.undefined)
  }
  
}

