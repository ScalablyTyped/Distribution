package typings.jpm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sdk/l10n", JSImport.Namespace)
@js.native
object l10nMod extends js.Object {
  
  def get(identifier: String, count: js.UndefOr[scala.Nothing], placeholder: String*): String = js.native
  def get(identifier: String, count: Double, placeholder: String*): String = js.native
}
