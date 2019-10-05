package typings.knex.knexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("knex", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply[TRecord, TResult](config: String): Knex[TRecord, TResult] = js.native
  def apply[TRecord, TResult](config: Config): Knex[TRecord, TResult] = js.native
}

