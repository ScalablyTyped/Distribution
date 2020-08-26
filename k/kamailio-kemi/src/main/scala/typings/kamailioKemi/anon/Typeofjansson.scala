package typings.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofjansson extends js.Object {
  def get(spath: String, sdoc: String, spv: String): Double = js.native
}

object Typeofjansson {
  @scala.inline
  def apply(get: (String, String, String) => Double): Typeofjansson = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction3(get))
    __obj.asInstanceOf[Typeofjansson]
  }
  @scala.inline
  implicit class TypeofjanssonOps[Self <: Typeofjansson] (val x: Self) extends AnyVal {
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
    def setGet(value: (String, String, String) => Double): Self = this.set("get", js.Any.fromFunction3(value))
  }
  
}

