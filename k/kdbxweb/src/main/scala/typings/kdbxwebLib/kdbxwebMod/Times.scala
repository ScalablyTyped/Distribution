package typings
package kdbxwebLib.kdbxwebMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("kdbxweb", "Times")
@js.native
class Times () extends js.Object {
  var creationTime: stdLib.Date = js.native
  var expires: scala.Boolean = js.native
  var expiryTime: stdLib.Date = js.native
  var lastAccessTime: stdLib.Date = js.native
  var lastModTime: stdLib.Date = js.native
  var locationChanged: stdLib.Date = js.native
  var usageCount: scala.Double = js.native
  def update(): scala.Unit = js.native
  def write(parentNode: stdLib.Node, ctx: Context): scala.Unit = js.native
}

/* static members */
@JSImport("kdbxweb", "Times")
@js.native
object Times extends js.Object {
  def create(): kdbxwebLib.kdbxwebMod.Times = js.native
  def read(xmlNode: stdLib.Node): kdbxwebLib.kdbxwebMod.Times = js.native
}

