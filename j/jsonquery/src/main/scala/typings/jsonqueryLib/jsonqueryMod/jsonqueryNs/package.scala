package typings
package jsonqueryLib.jsonqueryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jsonqueryNs {
  type BinaryQueryCondition[T] = OrQueryCondition[T] | AndQueryCondition[T]
  type Query[T] = BinaryQueryCondition[T] | QueryValue[T] | PathQuery
  type QueryValue[T] = jsonqueryLib.jsonqueryLibStrings.QueryValue with T
}
