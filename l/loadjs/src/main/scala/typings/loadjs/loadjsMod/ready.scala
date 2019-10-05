package typings.loadjs.loadjsMod

import typings.loadjs.Typeofloadjs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("loadjs", "ready")
@js.native
object ready extends js.Object {
  def apply(bundleIds: String, optionsOrCallback: LoadedFn): Typeofloadjs = js.native
  def apply(bundleIds: String, optionsOrCallback: ReadyOptions): Typeofloadjs = js.native
  def apply(bundleIds: js.Array[String], optionsOrCallback: LoadedFn): Typeofloadjs = js.native
  def apply(bundleIds: js.Array[String], optionsOrCallback: ReadyOptions): Typeofloadjs = js.native
}

