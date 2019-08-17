package typings.jsonquery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jsonqueryMod {
  import org.scalablytyped.runtime.StringDictionary

  type PathQuery = StringDictionary[js.Any]
  type Query[T] = BinaryQueryCondition[T] | QueryValue[T] | PathQuery
  type QueryValue[T] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]:? T[P] | jsonquery.jsonquery.BaseCondition<T[P]>}
    */ typings.jsonquery.jsonqueryStrings.QueryValue with js.Any
}
