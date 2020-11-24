package typings.jsYaml.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("js-yaml", "YAMLException")
@js.native
class YAMLException () extends Error {
  def this(reason: js.Any) = this()
  def this(reason: js.UndefOr[scala.Nothing], mark: js.Any) = this()
  def this(reason: js.Any, mark: js.Any) = this()
  
  def toString(compact: Boolean): String = js.native
}
