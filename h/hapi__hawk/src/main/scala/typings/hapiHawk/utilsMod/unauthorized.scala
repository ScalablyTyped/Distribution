package typings.hapiHawk.utilsMod

import typings.hapiBoom.mod.Boom
import typings.hapiBoom.mod.unauthorized.Attributes
import typings.hapiBoom.mod.unauthorized.MissingAuth
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@hapi/hawk/lib/utils", "unauthorized")
@js.native
object unauthorized extends js.Object {
  
  def apply(): Boom[_] with MissingAuth = js.native
  def apply(message: js.UndefOr[scala.Nothing], attributes: String): Boom[_] with MissingAuth = js.native
  def apply(message: js.UndefOr[scala.Nothing], attributes: Attributes): Boom[_] with MissingAuth = js.native
  def apply(message: String): Boom[_] with MissingAuth = js.native
  def apply(message: String, attributes: String): Boom[_] with MissingAuth = js.native
  def apply(message: String, attributes: Attributes): Boom[_] with MissingAuth = js.native
}
