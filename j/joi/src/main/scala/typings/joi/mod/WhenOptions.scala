package typings.joi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WhenOptions extends js.Object {
  /**
    * the required condition joi type.
    */
  var is: SchemaLike = js.native
  /**
    * the alternative schema type if the condition is false. Required if then is missing
    */
  var otherwise: js.UndefOr[SchemaLike] = js.native
  /**
    * the alternative schema type if the condition is true. Required if otherwise is missing.
    */
  var `then`: js.UndefOr[SchemaLike] = js.native
}

object WhenOptions {
  @scala.inline
  def apply(): WhenOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WhenOptions]
  }
  @scala.inline
  implicit class WhenOptionsOps[Self <: WhenOptions] (val x: Self) extends AnyVal {
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
    def setIs(value: SchemaLike): Self = this.set("is", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsNull: Self = this.set("is", null)
    @scala.inline
    def setOtherwise(value: SchemaLike): Self = this.set("otherwise", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOtherwise: Self = this.set("otherwise", js.undefined)
    @scala.inline
    def setOtherwiseNull: Self = this.set("otherwise", null)
    @scala.inline
    def setThen(value: SchemaLike): Self = this.set("then", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThen: Self = this.set("then", js.undefined)
    @scala.inline
    def setThenNull: Self = this.set("then", null)
  }
  
}

