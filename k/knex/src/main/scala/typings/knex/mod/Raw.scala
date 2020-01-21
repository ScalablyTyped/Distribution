package typings.knex.mod

import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Raw
@js.native
trait Raw[TResult]
  extends EventEmitter
     with ChainableInterface[ResolveResult[TResult]] {
  def queryContext(context: js.Any): Raw[TResult] = js.native
  def toSQL(): Sql = js.native
  def wrap[TResult2](before: String, after: String): Raw[TResult] = js.native
}

