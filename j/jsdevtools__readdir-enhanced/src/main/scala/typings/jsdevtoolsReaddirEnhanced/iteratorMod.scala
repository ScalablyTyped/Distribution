package typings.jsdevtoolsReaddirEnhanced

import typings.jsdevtoolsReaddirEnhanced.typesPublicMod.Stats
import typings.std.AsyncIterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jsdevtools/readdir-enhanced/lib/iterator", JSImport.Namespace)
@js.native
object iteratorMod extends js.Object {
  def readdirIterator(dir: String): AsyncIterableIterator[String] = js.native
  def readdirIterator(dir: String, options: Optionsstatsfalse): AsyncIterableIterator[String] = js.native
  def readdirIterator(dir: String, options: Optionsstatstrue): AsyncIterableIterator[Stats] = js.native
}

