package typings.googleapis.firestoreV1Mod.firestoreV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for a transaction that can only be used to read documents.
  */
@js.native
trait SchemaReadOnly extends js.Object {
  /**
    * Reads documents at the given time. This may not be older than 60 seconds.
    */
  var readTime: js.UndefOr[String] = js.native
}

object SchemaReadOnly {
  @scala.inline
  def apply(): SchemaReadOnly = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReadOnly]
  }
  @scala.inline
  implicit class SchemaReadOnlyOps[Self <: SchemaReadOnly] (val x: Self) extends AnyVal {
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
    def setReadTime(value: String): Self = this.set("readTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadTime: Self = this.set("readTime", js.undefined)
  }
  
}

