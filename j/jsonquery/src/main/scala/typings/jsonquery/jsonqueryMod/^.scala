package typings.jsonquery.jsonqueryMod

import typings.node.NodeJSNs.ReadWriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsonquery", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply[T](query: Query[T]): ReadWriteStream = js.native
  def `match`[T](haystack: T, predicate: Query[T]): Boolean = js.native
}

