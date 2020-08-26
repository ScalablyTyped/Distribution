package typings.lokijs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LokiOps extends js.Object {
  // abstract/loose equality
  @JSName("$aeq")
  def $aeq(a: js.Any, b: js.Any): Boolean = js.native
  @JSName("$and")
  def $and(a: js.Any, b: js.Any): Boolean = js.native
  /** ex : coll.find({'orderCount': {$between: [10, 50]}}); */
  @JSName("$between")
  def $between(a: js.Any, vals: js.Any): Boolean = js.native
  @JSName("$contains")
  def $contains(a: js.Any, b: js.Any): Boolean = js.native
  @JSName("$containsAny")
  def $containsAny(a: js.Any, b: js.Any): Boolean = js.native
  @JSName("$containsNone")
  def $containsNone(a: js.Any, b: js.Any): Boolean = js.native
  @JSName("$containsString")
  def $containsString(a: js.Any, b: js.Any): Boolean = js.native
  @JSName("$definedin")
  def $definedin(a: js.Any, b: js.Any): Boolean = js.native
  // date equality / loki abstract equality test
  @JSName("$dteq")
  def $dteq(a: js.Any, b: js.Any): Boolean = js.native
  @JSName("$eq")
  def $eq(a: js.Any, b: js.Any): Boolean = js.native
  @JSName("$finite")
  def $finite(a: js.Any, b: js.Any): Boolean = js.native
  @JSName("$gt")
  def $gt(a: js.Any, b: js.Any): Boolean = js.native
  @JSName("$gte")
  def $gte(a: js.Any, b: js.Any): Boolean = js.native
  @JSName("$in")
  def $in(a: js.Any, b: js.Any): Boolean = js.native
  @JSName("$jbetween")
  def $jbetween(a: js.Any, vals: js.Any): Boolean = js.native
  @JSName("$jgt")
  def $jgt(a: js.Any, b: js.Any): Boolean = js.native
  @JSName("$jgte")
  def $jgte(a: js.Any, b: js.Any): Boolean = js.native
  @JSName("$jlt")
  def $jlt(a: js.Any, b: js.Any): Boolean = js.native
  @JSName("$jlte")
  def $jlte(a: js.Any, b: js.Any): Boolean = js.native
  @JSName("$keyin")
  def $keyin(a: js.Any, b: js.Any): Boolean = js.native
  @JSName("$len")
  def $len(a: js.Any, b: js.Any): Boolean = js.native
  @JSName("$lt")
  def $lt(a: js.Any, b: js.Any): Boolean = js.native
  @JSName("$lte")
  def $lte(a: js.Any, b: js.Any): Boolean = js.native
  @JSName("$ne")
  def $ne(a: js.Any, b: js.Any): Boolean = js.native
  @JSName("$nin")
  def $nin(a: js.Any, b: js.Any): Boolean = js.native
  @JSName("$nkeyin")
  def $nkeyin(a: js.Any, b: js.Any): Boolean = js.native
  // field-level logical operators
  // a is the value in the collection
  // b is the nested query operation (for '$not')
  //   or an array of nested query operations (for '$and' and '$or')
  @JSName("$not")
  def $not(a: js.Any, b: js.Any): Boolean = js.native
  @JSName("$or")
  def $or(a: js.Any, b: js.Any): Boolean = js.native
  @JSName("$regex")
  def $regex(a: js.Any, b: js.Any): Boolean = js.native
  @JSName("$size")
  def $size(a: js.Any, b: js.Any): Boolean = js.native
  @JSName("$type")
  def $type(a: js.Any, b: js.Any): Boolean = js.native
  @JSName("$undefinedin")
  def $undefinedin(a: js.Any, b: js.Any): Boolean = js.native
  @JSName("$where")
  def $where(a: js.Any, b: js.Any): Boolean = js.native
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
  @scala.inline
  implicit class LokiOpsOps[Self <: LokiOps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set$aeq(value: (js.Any, js.Any) => Boolean): Self = this.set("$aeq", js.Any.fromFunction2(value))
    @scala.inline
    def set$and(value: (js.Any, js.Any) => Boolean): Self = this.set("$and", js.Any.fromFunction2(value))
    @scala.inline
    def set$between(value: (js.Any, js.Any) => Boolean): Self = this.set("$between", js.Any.fromFunction2(value))
    @scala.inline
    def set$contains(value: (js.Any, js.Any) => Boolean): Self = this.set("$contains", js.Any.fromFunction2(value))
    @scala.inline
    def set$containsAny(value: (js.Any, js.Any) => Boolean): Self = this.set("$containsAny", js.Any.fromFunction2(value))
    @scala.inline
    def set$containsNone(value: (js.Any, js.Any) => Boolean): Self = this.set("$containsNone", js.Any.fromFunction2(value))
    @scala.inline
    def set$containsString(value: (js.Any, js.Any) => Boolean): Self = this.set("$containsString", js.Any.fromFunction2(value))
    @scala.inline
    def set$definedin(value: (js.Any, js.Any) => Boolean): Self = this.set("$definedin", js.Any.fromFunction2(value))
    @scala.inline
    def set$dteq(value: (js.Any, js.Any) => Boolean): Self = this.set("$dteq", js.Any.fromFunction2(value))
    @scala.inline
    def set$eq(value: (js.Any, js.Any) => Boolean): Self = this.set("$eq", js.Any.fromFunction2(value))
    @scala.inline
    def set$finite(value: (js.Any, js.Any) => Boolean): Self = this.set("$finite", js.Any.fromFunction2(value))
    @scala.inline
    def set$gt(value: (js.Any, js.Any) => Boolean): Self = this.set("$gt", js.Any.fromFunction2(value))
    @scala.inline
    def set$gte(value: (js.Any, js.Any) => Boolean): Self = this.set("$gte", js.Any.fromFunction2(value))
    @scala.inline
    def set$in(value: (js.Any, js.Any) => Boolean): Self = this.set("$in", js.Any.fromFunction2(value))
    @scala.inline
    def set$jbetween(value: (js.Any, js.Any) => Boolean): Self = this.set("$jbetween", js.Any.fromFunction2(value))
    @scala.inline
    def set$jgt(value: (js.Any, js.Any) => Boolean): Self = this.set("$jgt", js.Any.fromFunction2(value))
    @scala.inline
    def set$jgte(value: (js.Any, js.Any) => Boolean): Self = this.set("$jgte", js.Any.fromFunction2(value))
    @scala.inline
    def set$jlt(value: (js.Any, js.Any) => Boolean): Self = this.set("$jlt", js.Any.fromFunction2(value))
    @scala.inline
    def set$jlte(value: (js.Any, js.Any) => Boolean): Self = this.set("$jlte", js.Any.fromFunction2(value))
    @scala.inline
    def set$keyin(value: (js.Any, js.Any) => Boolean): Self = this.set("$keyin", js.Any.fromFunction2(value))
    @scala.inline
    def set$len(value: (js.Any, js.Any) => Boolean): Self = this.set("$len", js.Any.fromFunction2(value))
    @scala.inline
    def set$lt(value: (js.Any, js.Any) => Boolean): Self = this.set("$lt", js.Any.fromFunction2(value))
    @scala.inline
    def set$lte(value: (js.Any, js.Any) => Boolean): Self = this.set("$lte", js.Any.fromFunction2(value))
    @scala.inline
    def set$ne(value: (js.Any, js.Any) => Boolean): Self = this.set("$ne", js.Any.fromFunction2(value))
    @scala.inline
    def set$nin(value: (js.Any, js.Any) => Boolean): Self = this.set("$nin", js.Any.fromFunction2(value))
    @scala.inline
    def set$nkeyin(value: (js.Any, js.Any) => Boolean): Self = this.set("$nkeyin", js.Any.fromFunction2(value))
    @scala.inline
    def set$not(value: (js.Any, js.Any) => Boolean): Self = this.set("$not", js.Any.fromFunction2(value))
    @scala.inline
    def set$or(value: (js.Any, js.Any) => Boolean): Self = this.set("$or", js.Any.fromFunction2(value))
    @scala.inline
    def set$regex(value: (js.Any, js.Any) => Boolean): Self = this.set("$regex", js.Any.fromFunction2(value))
    @scala.inline
    def set$size(value: (js.Any, js.Any) => Boolean): Self = this.set("$size", js.Any.fromFunction2(value))
    @scala.inline
    def set$type(value: (js.Any, js.Any) => Boolean): Self = this.set("$type", js.Any.fromFunction2(value))
    @scala.inline
    def set$undefinedin(value: (js.Any, js.Any) => Boolean): Self = this.set("$undefinedin", js.Any.fromFunction2(value))
    @scala.inline
    def set$where(value: (js.Any, js.Any) => Boolean): Self = this.set("$where", js.Any.fromFunction2(value))
  }
  
}

