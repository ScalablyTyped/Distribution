package typings
package iobrokerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_File extends js.Object {
  var file: java.lang.String | nodeLib.Buffer
  var mimeType: java.lang.String
}

object Anon_File {
  @scala.inline
  def apply(file: java.lang.String | nodeLib.Buffer, mimeType: java.lang.String): Anon_File = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], mimeType = mimeType)
  
    __obj.asInstanceOf[Anon_File]
  }
}

