package typings
package lokijsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LokiOps extends js.Object {
  // abstract/loose equality
  @JSName("$aeq")
  def $aeq(a: js.Any, b: js.Any): scala.Boolean
  @JSName("$and")
  def $and(a: js.Any, b: js.Any): scala.Boolean
  /** ex : coll.find({'orderCount': {$between: [10, 50]}}); */
  @JSName("$between")
  def $between(a: js.Any, vals: js.Any): scala.Boolean
  @JSName("$contains")
  def $contains(a: js.Any, b: js.Any): scala.Boolean
  @JSName("$containsAny")
  def $containsAny(a: js.Any, b: js.Any): scala.Boolean
  @JSName("$containsNone")
  def $containsNone(a: js.Any, b: js.Any): scala.Boolean
  @JSName("$containsString")
  def $containsString(a: js.Any, b: js.Any): scala.Boolean
  @JSName("$definedin")
  def $definedin(a: js.Any, b: js.Any): scala.Boolean
  // date equality / loki abstract equality test
  @JSName("$dteq")
  def $dteq(a: js.Any, b: js.Any): scala.Boolean
  @JSName("$eq")
  def $eq(a: js.Any, b: js.Any): scala.Boolean
  @JSName("$finite")
  def $finite(a: js.Any, b: js.Any): scala.Boolean
  @JSName("$gt")
  def $gt(a: js.Any, b: js.Any): scala.Boolean
  @JSName("$gte")
  def $gte(a: js.Any, b: js.Any): scala.Boolean
  @JSName("$in")
  def $in(a: js.Any, b: js.Any): scala.Boolean
  @JSName("$jbetween")
  def $jbetween(a: js.Any, vals: js.Any): scala.Boolean
  @JSName("$jgt")
  def $jgt(a: js.Any, b: js.Any): scala.Boolean
  @JSName("$jgte")
  def $jgte(a: js.Any, b: js.Any): scala.Boolean
  @JSName("$jlt")
  def $jlt(a: js.Any, b: js.Any): scala.Boolean
  @JSName("$jlte")
  def $jlte(a: js.Any, b: js.Any): scala.Boolean
  @JSName("$keyin")
  def $keyin(a: js.Any, b: js.Any): scala.Boolean
  @JSName("$len")
  def $len(a: js.Any, b: js.Any): scala.Boolean
  @JSName("$lt")
  def $lt(a: js.Any, b: js.Any): scala.Boolean
  @JSName("$lte")
  def $lte(a: js.Any, b: js.Any): scala.Boolean
  @JSName("$ne")
  def $ne(a: js.Any, b: js.Any): scala.Boolean
  @JSName("$nin")
  def $nin(a: js.Any, b: js.Any): scala.Boolean
  @JSName("$nkeyin")
  def $nkeyin(a: js.Any, b: js.Any): scala.Boolean
  // field-level logical operators
  // a is the value in the collection
  // b is the nested query operation (for '$not')
  //   or an array of nested query operations (for '$and' and '$or')
  @JSName("$not")
  def $not(a: js.Any, b: js.Any): scala.Boolean
  @JSName("$or")
  def $or(a: js.Any, b: js.Any): scala.Boolean
  @JSName("$regex")
  def $regex(a: js.Any, b: js.Any): scala.Boolean
  @JSName("$size")
  def $size(a: js.Any, b: js.Any): scala.Boolean
  @JSName("$type")
  def $type(a: js.Any, b: js.Any): scala.Boolean
  @JSName("$undefinedin")
  def $undefinedin(a: js.Any, b: js.Any): scala.Boolean
  @JSName("$where")
  def $where(a: js.Any, b: js.Any): scala.Boolean
}

@JSGlobal("LokiOps")
@js.native
object LokiOps extends js.Object {
  // abstract/loose equality
  @JSName("$aeq")
  def $aeq(a: js.Any, b: js.Any): scala.Boolean = js.native
  @JSName("$and")
  def $and(a: js.Any, b: js.Any): scala.Boolean = js.native
  /** ex : coll.find({'orderCount': {$between: [10, 50]}}); */
  @JSName("$between")
  def $between(a: js.Any, vals: js.Any): scala.Boolean = js.native
  @JSName("$contains")
  def $contains(a: js.Any, b: js.Any): scala.Boolean = js.native
  @JSName("$containsAny")
  def $containsAny(a: js.Any, b: js.Any): scala.Boolean = js.native
  @JSName("$containsNone")
  def $containsNone(a: js.Any, b: js.Any): scala.Boolean = js.native
  @JSName("$containsString")
  def $containsString(a: js.Any, b: js.Any): scala.Boolean = js.native
  @JSName("$definedin")
  def $definedin(a: js.Any, b: js.Any): scala.Boolean = js.native
  // date equality / loki abstract equality test
  @JSName("$dteq")
  def $dteq(a: js.Any, b: js.Any): scala.Boolean = js.native
  @JSName("$eq")
  def $eq(a: js.Any, b: js.Any): scala.Boolean = js.native
  @JSName("$finite")
  def $finite(a: js.Any, b: js.Any): scala.Boolean = js.native
  @JSName("$gt")
  def $gt(a: js.Any, b: js.Any): scala.Boolean = js.native
  @JSName("$gte")
  def $gte(a: js.Any, b: js.Any): scala.Boolean = js.native
  @JSName("$in")
  def $in(a: js.Any, b: js.Any): scala.Boolean = js.native
  @JSName("$jbetween")
  def $jbetween(a: js.Any, vals: js.Any): scala.Boolean = js.native
  @JSName("$jgt")
  def $jgt(a: js.Any, b: js.Any): scala.Boolean = js.native
  @JSName("$jgte")
  def $jgte(a: js.Any, b: js.Any): scala.Boolean = js.native
  @JSName("$jlt")
  def $jlt(a: js.Any, b: js.Any): scala.Boolean = js.native
  @JSName("$jlte")
  def $jlte(a: js.Any, b: js.Any): scala.Boolean = js.native
  @JSName("$keyin")
  def $keyin(a: js.Any, b: js.Any): scala.Boolean = js.native
  @JSName("$len")
  def $len(a: js.Any, b: js.Any): scala.Boolean = js.native
  @JSName("$lt")
  def $lt(a: js.Any, b: js.Any): scala.Boolean = js.native
  @JSName("$lte")
  def $lte(a: js.Any, b: js.Any): scala.Boolean = js.native
  @JSName("$ne")
  def $ne(a: js.Any, b: js.Any): scala.Boolean = js.native
  @JSName("$nin")
  def $nin(a: js.Any, b: js.Any): scala.Boolean = js.native
  @JSName("$nkeyin")
  def $nkeyin(a: js.Any, b: js.Any): scala.Boolean = js.native
  // field-level logical operators
  // a is the value in the collection
  // b is the nested query operation (for '$not')
  //   or an array of nested query operations (for '$and' and '$or')
  @JSName("$not")
  def $not(a: js.Any, b: js.Any): scala.Boolean = js.native
  @JSName("$or")
  def $or(a: js.Any, b: js.Any): scala.Boolean = js.native
  @JSName("$regex")
  def $regex(a: js.Any, b: js.Any): scala.Boolean = js.native
  @JSName("$size")
  def $size(a: js.Any, b: js.Any): scala.Boolean = js.native
  @JSName("$type")
  def $type(a: js.Any, b: js.Any): scala.Boolean = js.native
  @JSName("$undefinedin")
  def $undefinedin(a: js.Any, b: js.Any): scala.Boolean = js.native
  @JSName("$where")
  def $where(a: js.Any, b: js.Any): scala.Boolean = js.native
}

