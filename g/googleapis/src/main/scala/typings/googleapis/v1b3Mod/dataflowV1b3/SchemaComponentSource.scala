package typings.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Description of an interstitial value between transforms in an execution
  * stage.
  */
@js.native
trait SchemaComponentSource extends js.Object {
  /**
    * Dataflow service generated name for this source.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * User name for the original user transform or collection with which this
    * source is most closely associated.
    */
  var originalTransformOrCollection: js.UndefOr[String] = js.native
  /**
    * Human-readable name for this transform; may be user or system generated.
    */
  var userName: js.UndefOr[String] = js.native
}

object SchemaComponentSource {
  @scala.inline
  def apply(): SchemaComponentSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaComponentSource]
  }
  @scala.inline
  implicit class SchemaComponentSourceOps[Self <: SchemaComponentSource] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setOriginalTransformOrCollection(value: String): Self = this.set("originalTransformOrCollection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOriginalTransformOrCollection: Self = this.set("originalTransformOrCollection", js.undefined)
    @scala.inline
    def setUserName(value: String): Self = this.set("userName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserName: Self = this.set("userName", js.undefined)
  }
  
}

