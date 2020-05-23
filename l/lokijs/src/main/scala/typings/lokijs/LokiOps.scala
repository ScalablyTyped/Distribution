package typings.lokijs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LokiOps extends js.Object {
  // abstract/loose equality
  @JSName("$aeq")
  def $aeq(a: js.Any, b: js.Any): Boolean
  @JSName("$and")
  def $and(a: js.Any, b: js.Any): Boolean
  /** ex : coll.find({'orderCount': {$between: [10, 50]}}); */
  @JSName("$between")
  def $between(a: js.Any, vals: js.Any): Boolean
  @JSName("$contains")
  def $contains(a: js.Any, b: js.Any): Boolean
  @JSName("$containsAny")
  def $containsAny(a: js.Any, b: js.Any): Boolean
  @JSName("$containsNone")
  def $containsNone(a: js.Any, b: js.Any): Boolean
  @JSName("$containsString")
  def $containsString(a: js.Any, b: js.Any): Boolean
  @JSName("$definedin")
  def $definedin(a: js.Any, b: js.Any): Boolean
  // date equality / loki abstract equality test
  @JSName("$dteq")
  def $dteq(a: js.Any, b: js.Any): Boolean
  @JSName("$eq")
  def $eq(a: js.Any, b: js.Any): Boolean
  @JSName("$finite")
  def $finite(a: js.Any, b: js.Any): Boolean
  @JSName("$gt")
  def $gt(a: js.Any, b: js.Any): Boolean
  @JSName("$gte")
  def $gte(a: js.Any, b: js.Any): Boolean
  @JSName("$in")
  def $in(a: js.Any, b: js.Any): Boolean
  @JSName("$jbetween")
  def $jbetween(a: js.Any, vals: js.Any): Boolean
  @JSName("$jgt")
  def $jgt(a: js.Any, b: js.Any): Boolean
  @JSName("$jgte")
  def $jgte(a: js.Any, b: js.Any): Boolean
  @JSName("$jlt")
  def $jlt(a: js.Any, b: js.Any): Boolean
  @JSName("$jlte")
  def $jlte(a: js.Any, b: js.Any): Boolean
  @JSName("$keyin")
  def $keyin(a: js.Any, b: js.Any): Boolean
  @JSName("$len")
  def $len(a: js.Any, b: js.Any): Boolean
  @JSName("$lt")
  def $lt(a: js.Any, b: js.Any): Boolean
  @JSName("$lte")
  def $lte(a: js.Any, b: js.Any): Boolean
  @JSName("$ne")
  def $ne(a: js.Any, b: js.Any): Boolean
  @JSName("$nin")
  def $nin(a: js.Any, b: js.Any): Boolean
  @JSName("$nkeyin")
  def $nkeyin(a: js.Any, b: js.Any): Boolean
  // field-level logical operators
  // a is the value in the collection
  // b is the nested query operation (for '$not')
  //   or an array of nested query operations (for '$and' and '$or')
  @JSName("$not")
  def $not(a: js.Any, b: js.Any): Boolean
  @JSName("$or")
  def $or(a: js.Any, b: js.Any): Boolean
  @JSName("$regex")
  def $regex(a: js.Any, b: js.Any): Boolean
  @JSName("$size")
  def $size(a: js.Any, b: js.Any): Boolean
  @JSName("$type")
  def $type(a: js.Any, b: js.Any): Boolean
  @JSName("$undefinedin")
  def $undefinedin(a: js.Any, b: js.Any): Boolean
  @JSName("$where")
  def $where(a: js.Any, b: js.Any): Boolean
}

object LokiOps {
  @scala.inline
  def apply(
    $aeq: (js.Any, js.Any) => Boolean,
    $and: (js.Any, js.Any) => Boolean,
    $between: (js.Any, js.Any) => Boolean,
    $contains: (js.Any, js.Any) => Boolean,
    $containsAny: (js.Any, js.Any) => Boolean,
    $containsNone: (js.Any, js.Any) => Boolean,
    $containsString: (js.Any, js.Any) => Boolean,
    $definedin: (js.Any, js.Any) => Boolean,
    $dteq: (js.Any, js.Any) => Boolean,
    $eq: (js.Any, js.Any) => Boolean,
    $finite: (js.Any, js.Any) => Boolean,
    $gt: (js.Any, js.Any) => Boolean,
    $gte: (js.Any, js.Any) => Boolean,
    $in: (js.Any, js.Any) => Boolean,
    $jbetween: (js.Any, js.Any) => Boolean,
    $jgt: (js.Any, js.Any) => Boolean,
    $jgte: (js.Any, js.Any) => Boolean,
    $jlt: (js.Any, js.Any) => Boolean,
    $jlte: (js.Any, js.Any) => Boolean,
    $keyin: (js.Any, js.Any) => Boolean,
    $len: (js.Any, js.Any) => Boolean,
    $lt: (js.Any, js.Any) => Boolean,
    $lte: (js.Any, js.Any) => Boolean,
    $ne: (js.Any, js.Any) => Boolean,
    $nin: (js.Any, js.Any) => Boolean,
    $nkeyin: (js.Any, js.Any) => Boolean,
    $not: (js.Any, js.Any) => Boolean,
    $or: (js.Any, js.Any) => Boolean,
    $regex: (js.Any, js.Any) => Boolean,
    $size: (js.Any, js.Any) => Boolean,
    $type: (js.Any, js.Any) => Boolean,
    $undefinedin: (js.Any, js.Any) => Boolean,
    $where: (js.Any, js.Any) => Boolean
  ): LokiOps = {
    val __obj = js.Dynamic.literal($aeq = js.Any.fromFunction2($aeq), $and = js.Any.fromFunction2($and), $between = js.Any.fromFunction2($between), $contains = js.Any.fromFunction2($contains), $containsAny = js.Any.fromFunction2($containsAny), $containsNone = js.Any.fromFunction2($containsNone), $containsString = js.Any.fromFunction2($containsString), $definedin = js.Any.fromFunction2($definedin), $dteq = js.Any.fromFunction2($dteq), $eq = js.Any.fromFunction2($eq), $finite = js.Any.fromFunction2($finite), $gt = js.Any.fromFunction2($gt), $gte = js.Any.fromFunction2($gte), $in = js.Any.fromFunction2($in), $jbetween = js.Any.fromFunction2($jbetween), $jgt = js.Any.fromFunction2($jgt), $jgte = js.Any.fromFunction2($jgte), $jlt = js.Any.fromFunction2($jlt), $jlte = js.Any.fromFunction2($jlte), $keyin = js.Any.fromFunction2($keyin), $len = js.Any.fromFunction2($len), $lt = js.Any.fromFunction2($lt), $lte = js.Any.fromFunction2($lte), $ne = js.Any.fromFunction2($ne), $nin = js.Any.fromFunction2($nin), $nkeyin = js.Any.fromFunction2($nkeyin), $not = js.Any.fromFunction2($not), $or = js.Any.fromFunction2($or), $regex = js.Any.fromFunction2($regex), $size = js.Any.fromFunction2($size), $type = js.Any.fromFunction2($type), $undefinedin = js.Any.fromFunction2($undefinedin), $where = js.Any.fromFunction2($where))
    __obj.asInstanceOf[LokiOps]
  }
}

