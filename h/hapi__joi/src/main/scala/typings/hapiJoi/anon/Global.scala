package typings.hapiJoi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Global extends js.Object {
  /**
    * references to the globally provided context preference.
    *
    * @default '$'
    */
  var global: js.UndefOr[String] = js.native
  /**
    * references to error-specific or rule specific context.
    *
    * @default '#'
    */
  var local: js.UndefOr[String] = js.native
  /**
    * references to the root value being validated.
    *
    * @default '/'
    */
  var root: js.UndefOr[String] = js.native
}

object Global {
  @scala.inline
  def apply(): Global = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Global]
  }
  @scala.inline
  implicit class GlobalOps[Self <: Global] (val x: Self) extends AnyVal {
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
    def setGlobal(value: String): Self = this.set("global", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlobal: Self = this.set("global", js.undefined)
    @scala.inline
    def setLocal(value: String): Self = this.set("local", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocal: Self = this.set("local", js.undefined)
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
  }
  
}

