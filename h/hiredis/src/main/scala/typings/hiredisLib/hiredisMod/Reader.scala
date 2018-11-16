package typings
package hiredisLib.hiredisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hiredis", "Reader")
@js.native
class Reader () extends js.Object {
  def this(config: Config) = this()
  def feed(reply: java.lang.String): scala.Unit = js.native
  def feed(reply: nodeLib.Buffer): scala.Unit = js.native
  def get(): java.lang.String | nodeLib.Buffer = js.native
}

