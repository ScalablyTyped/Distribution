package typings
package jsflLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _xjsfl extends js.Object {
  var uri: java.lang.String
  def init(_this: js.Any): scala.Unit
}

object _xjsfl {
  @scala.inline
  def apply(init: js.Function1[js.Any, scala.Unit], uri: java.lang.String): _xjsfl = {
    val __obj = js.Dynamic.literal(init = init, uri = uri)
  
    __obj.asInstanceOf[_xjsfl]
  }
}

