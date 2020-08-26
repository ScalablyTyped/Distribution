package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaResultDisplayMetadata extends js.Object {
  /**
    * The metalines content to be displayed with the result.
    */
  var metalines: js.UndefOr[js.Array[SchemaResultDisplayLine]] = js.native
  /**
    * The display label for the object.
    */
  var objectTypeLabel: js.UndefOr[String] = js.native
}

object SchemaResultDisplayMetadata {
  @scala.inline
  def apply(): SchemaResultDisplayMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResultDisplayMetadata]
  }
  @scala.inline
  implicit class SchemaResultDisplayMetadataOps[Self <: SchemaResultDisplayMetadata] (val x: Self) extends AnyVal {
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
    def setMetalinesVarargs(value: SchemaResultDisplayLine*): Self = this.set("metalines", js.Array(value :_*))
    @scala.inline
    def setMetalines(value: js.Array[SchemaResultDisplayLine]): Self = this.set("metalines", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetalines: Self = this.set("metalines", js.undefined)
    @scala.inline
    def setObjectTypeLabel(value: String): Self = this.set("objectTypeLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectTypeLabel: Self = this.set("objectTypeLabel", js.undefined)
  }
  
}

