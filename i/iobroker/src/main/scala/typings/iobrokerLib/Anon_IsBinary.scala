package typings
package iobrokerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IsBinary extends js.Object {
  var isBinary: scala.Boolean
  var mimeType: java.lang.String
}

object Anon_IsBinary {
  @scala.inline
  def apply(isBinary: scala.Boolean, mimeType: java.lang.String): Anon_IsBinary = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isBinary")(isBinary)
    __obj.updateDynamic("mimeType")(mimeType)
    __obj.asInstanceOf[Anon_IsBinary]
  }
}

