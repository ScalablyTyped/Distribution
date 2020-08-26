package typings.jxon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jxon", "xmlToJs")
@js.native
object xmlToJs extends js.Object {
  def apply(xmlDocument: js.Any): js.Object = js.native
  def apply(
    xmlDocument: js.Any,
    verbosity: js.UndefOr[scala.Nothing],
    freeze: js.UndefOr[scala.Nothing],
    nestedAttributes: Boolean
  ): js.Object = js.native
  def apply(xmlDocument: js.Any, verbosity: js.UndefOr[scala.Nothing], freeze: Boolean): js.Object = js.native
  def apply(
    xmlDocument: js.Any,
    verbosity: js.UndefOr[scala.Nothing],
    freeze: Boolean,
    nestedAttributes: Boolean
  ): js.Object = js.native
  def apply(xmlDocument: js.Any, verbosity: VerbosityType): js.Object = js.native
  def apply(
    xmlDocument: js.Any,
    verbosity: VerbosityType,
    freeze: js.UndefOr[scala.Nothing],
    nestedAttributes: Boolean
  ): js.Object = js.native
  def apply(xmlDocument: js.Any, verbosity: VerbosityType, freeze: Boolean): js.Object = js.native
  def apply(xmlDocument: js.Any, verbosity: VerbosityType, freeze: Boolean, nestedAttributes: Boolean): js.Object = js.native
}

