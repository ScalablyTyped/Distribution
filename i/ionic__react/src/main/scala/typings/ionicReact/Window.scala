package typings.ionicReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Window extends js.Object {
  var Ionic: js.Any = js.native
  var cordova: js.Any = js.native
}

object Window {
  @scala.inline
  def apply(Ionic: js.Any, cordova: js.Any): Window = {
    val __obj = js.Dynamic.literal(Ionic = Ionic.asInstanceOf[js.Any], cordova = cordova.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
  @scala.inline
  implicit class WindowOps[Self <: Window] (val x: Self) extends AnyVal {
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
    def setIonic(value: js.Any): Self = this.set("Ionic", value.asInstanceOf[js.Any])
    @scala.inline
    def setCordova(value: js.Any): Self = this.set("cordova", value.asInstanceOf[js.Any])
  }
  
}

