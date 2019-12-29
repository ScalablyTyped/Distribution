package typings.jsonquery

import org.scalablytyped.runtime.StringDictionary
import typings.node.NodeJS.ReadWriteStream
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsonquery", JSImport.Namespace)
@js.native
object jsonqueryMod extends js.Object {
  @js.native
  trait AndQueryCondition[T] extends BinaryQueryCondition[T] {
    @JSName("$and")
    var $and: js.Array[Query[T]] = js.native
  }
  
  @js.native
  trait BaseCondition[P] extends js.Object {
    @JSName("$all")
    var $all: js.Array[P] = js.native
    @JSName("$elemMatch")
    var $elemMatch: Partial[P] = js.native
    @JSName("$gt")
    var $gt: P = js.native
    @JSName("$gte")
    var $gte: P = js.native
    @JSName("$in")
    var $in: js.Array[P] = js.native
    @JSName("$lt")
    var $lt: P = js.native
    @JSName("$lte")
    var $lte: P = js.native
    @JSName("$mod")
    var $mod: js.Tuple2[Double, Double] = js.native
    @JSName("$ne")
    var $ne: P = js.native
    @JSName("$nin")
    var $nin: js.Array[P] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.jsonquery.jsonqueryMod.OrQueryCondition[T]
    - typings.jsonquery.jsonqueryMod.AndQueryCondition[T]
  */
  trait BinaryQueryCondition[T] extends js.Object
  
  @js.native
  trait OrQueryCondition[T] extends BinaryQueryCondition[T] {
    @JSName("$or")
    var $or: js.Array[Query[T]] = js.native
  }
  
  def apply[T](query: Query[T]): ReadWriteStream = js.native
  def `match`[T](haystack: T, predicate: Query[T]): Boolean = js.native
  type PathQuery = StringDictionary[js.Any]
  type Query[T] = BinaryQueryCondition[T] | QueryValue[T] | PathQuery
  type QueryValue[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? T[P] | jsonquery.jsonquery.BaseCondition<T[P]>}
    */ typings.jsonquery.jsonqueryStrings.QueryValue with js.Any
}

