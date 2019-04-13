package typings
package jjveLib.jjveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Issue extends js.Object {
  var code: java.lang.String
  var data: js.Any
  var message: java.lang.String
  var path: java.lang.String
}

object Issue {
  @scala.inline
  def apply(code: java.lang.String, data: js.Any, message: java.lang.String, path: java.lang.String): Issue = {
    val __obj = js.Dynamic.literal(code = code, data = data, message = message, path = path)
  
    __obj.asInstanceOf[Issue]
  }
}

