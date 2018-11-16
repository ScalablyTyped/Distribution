package typings
package knexLib.knexMod.KnexNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Union extends js.Object {
  def apply(callback: QueryBuilder): QueryBuilder = js.native
  def apply(callback: QueryBuilder, wrap: scala.Boolean): QueryBuilder = js.native
  def apply(callback: QueryCallback): QueryBuilder = js.native
  def apply(callback: QueryCallback, wrap: scala.Boolean): QueryBuilder = js.native
  def apply(callback: Raw): QueryBuilder = js.native
  def apply(callback: Raw, wrap: scala.Boolean): QueryBuilder = js.native
  def apply(callbacks: (QueryCallback | QueryBuilder | Raw)*): QueryBuilder = js.native
  def apply(callbacks: js.Array[QueryCallback | QueryBuilder | Raw]): QueryBuilder = js.native
  def apply(callbacks: js.Array[QueryCallback | QueryBuilder | Raw], wrap: scala.Boolean): QueryBuilder = js.native
}

