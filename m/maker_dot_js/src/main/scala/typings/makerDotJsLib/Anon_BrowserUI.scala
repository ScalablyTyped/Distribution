package typings
package makerDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BrowserUI extends js.Object {
  var BrowserUI: java.lang.String
  var NodeJs: java.lang.String
  var Unknown: java.lang.String
  var WebWorker: java.lang.String
}

object Anon_BrowserUI {
  @scala.inline
  def apply(
    BrowserUI: java.lang.String,
    NodeJs: java.lang.String,
    Unknown: java.lang.String,
    WebWorker: java.lang.String
  ): Anon_BrowserUI = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("BrowserUI")(BrowserUI)
    __obj.updateDynamic("NodeJs")(NodeJs)
    __obj.updateDynamic("Unknown")(Unknown)
    __obj.updateDynamic("WebWorker")(WebWorker)
    __obj.asInstanceOf[Anon_BrowserUI]
  }
}

