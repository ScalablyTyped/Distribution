package typings.googleapis.firestoreV1beta1Mod.firestoreV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A precondition on a document, used for conditional operations.
  */
@js.native
trait SchemaPrecondition extends js.Object {
  /**
    * When set to `true`, the target document must exist. When set to `false`,
    * the target document must not exist.
    */
  var exists: js.UndefOr[Boolean] = js.native
  /**
    * When set, the target document must exist and have been last updated at
    * that time.
    */
  var updateTime: js.UndefOr[String] = js.native
}

object SchemaPrecondition {
  @scala.inline
  def apply(): SchemaPrecondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPrecondition]
  }
  @scala.inline
  implicit class SchemaPreconditionOps[Self <: SchemaPrecondition] (val x: Self) extends AnyVal {
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
    def setExists(value: Boolean): Self = this.set("exists", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExists: Self = this.set("exists", js.undefined)
    @scala.inline
    def setUpdateTime(value: String): Self = this.set("updateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateTime: Self = this.set("updateTime", js.undefined)
  }
  
}

