package typings.joigoose.mod

import typings.joi.mod.Schema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Joigoose extends js.Object {
  def convert(schema: Schema): typings.mongoose.mod.Schema[_] = js.native
}

object Joigoose {
  @scala.inline
  def apply(convert: Schema => typings.mongoose.mod.Schema[_]): Joigoose = {
    val __obj = js.Dynamic.literal(convert = js.Any.fromFunction1(convert))
    __obj.asInstanceOf[Joigoose]
  }
  @scala.inline
  implicit class JoigooseOps[Self <: Joigoose] (val x: Self) extends AnyVal {
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
    def setConvert(value: Schema => typings.mongoose.mod.Schema[_]): Self = this.set("convert", js.Any.fromFunction1(value))
  }
  
}

