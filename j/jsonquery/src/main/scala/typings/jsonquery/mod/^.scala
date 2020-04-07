package typings.jsonquery.mod

import typings.node.NodeJS.ReadWriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsonquery", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply[T](query: Query[T]): ReadWriteStream = js.native
}

