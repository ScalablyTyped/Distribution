package typings.kendoUi.kendo

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Route extends Class {
  var route: RegExp
  def callback(url: String): Unit
  def worksWith(url: String): Unit
}

object Route {
  @scala.inline
  def apply(callback: String => Unit, route: RegExp, worksWith: String => Unit): Route = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback), route = route.asInstanceOf[js.Any], worksWith = js.Any.fromFunction1(worksWith))
    __obj.asInstanceOf[Route]
  }
}

