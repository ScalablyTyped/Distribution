package typings.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A collection of object IDs.
  */
@js.native
trait SchemaObjectReferences extends js.Object {
  /**
    * The object IDs.
    */
  var objectIds: js.UndefOr[js.Array[String]] = js.native
}

object SchemaObjectReferences {
  @scala.inline
  def apply(): SchemaObjectReferences = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaObjectReferences]
  }
  @scala.inline
  implicit class SchemaObjectReferencesOps[Self <: SchemaObjectReferences] (val x: Self) extends AnyVal {
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
    def setObjectIdsVarargs(value: String*): Self = this.set("objectIds", js.Array(value :_*))
    @scala.inline
    def setObjectIds(value: js.Array[String]): Self = this.set("objectIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectIds: Self = this.set("objectIds", js.undefined)
  }
  
}

