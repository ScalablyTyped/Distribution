package typings.jasmineDashNode.jasmine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Env extends js.Object {
  var defaultTimeoutInterval: Double
}

object Env {
  @scala.inline
  def apply(defaultTimeoutInterval: Double): Env = {
    val __obj = js.Dynamic.literal(defaultTimeoutInterval = defaultTimeoutInterval)
  
    __obj.asInstanceOf[Env]
  }
}

