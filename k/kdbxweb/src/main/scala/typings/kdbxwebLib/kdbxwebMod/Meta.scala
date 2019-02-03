package typings
package kdbxwebLib.kdbxwebMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("kdbxweb", "Meta")
@js.native
class Meta () extends js.Object {
  def merge(remote: Meta, objectMap: ObjectMap): scala.Unit = js.native
  def write(parentNode: stdLib.Node, ctx: Context): scala.Unit = js.native
}

/* static members */
@JSImport("kdbxweb", "Meta")
@js.native
object Meta extends js.Object {
  def create(): kdbxwebLib.kdbxwebMod.Meta = js.native
  def read(xmlNode: stdLib.Node, ctx: kdbxwebLib.kdbxwebMod.Context): kdbxwebLib.kdbxwebMod.Meta = js.native
}

