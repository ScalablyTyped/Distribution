package typings.jsonquery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type PathQuery = org.scalablytyped.runtime.StringDictionary[js.Any]
  type Query[T] = typings.jsonquery.mod.BinaryQueryCondition[T] | typings.jsonquery.mod.QueryValue[T] | typings.jsonquery.mod.PathQuery
  type QueryValue[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? T[P] | jsonquery.jsonquery.BaseCondition<T[P]>}
    */ typings.jsonquery.jsonqueryStrings.QueryValue with js.Any
}
