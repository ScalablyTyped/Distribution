package typings.ionicReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Window extends js.Object {
  var Ionic: js.Any
  var cordova: js.Any
}

object Window {
  @scala.inline
  def apply(Ionic: js.Any, cordova: js.Any): Window = {
    val __obj = js.Dynamic.literal(Ionic = Ionic.asInstanceOf[js.Any], cordova = cordova.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
}

