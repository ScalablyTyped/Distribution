package typings.googleapis.servicenetworkingV1betaMod.servicenetworkingV1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A custom pattern is used for defining custom HTTP verb.
  */
@js.native
trait SchemaCustomHttpPattern extends js.Object {
  /**
    * The name of this custom HTTP verb.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The path matched by this custom verb.
    */
  var path: js.UndefOr[String] = js.native
}

object SchemaCustomHttpPattern {
  @scala.inline
  def apply(): SchemaCustomHttpPattern = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomHttpPattern]
  }
  @scala.inline
  implicit class SchemaCustomHttpPatternOps[Self <: SchemaCustomHttpPattern] (val x: Self) extends AnyVal {
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
  }
  
}

