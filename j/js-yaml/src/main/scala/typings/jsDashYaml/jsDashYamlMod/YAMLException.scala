package typings.jsDashYaml.jsDashYamlMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-yaml", "YAMLException")
@js.native
class YAMLException () extends Error {
  def this(reason: js.Any) = this()
  def this(reason: js.Any, mark: js.Any) = this()
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
  def toString(compact: Boolean): String = js.native
}

