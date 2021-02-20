package typings.lokijs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LokiOps extends StObject {
  
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
  implicit class LokiOpsMutableBuilder[Self <: LokiOps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$aeq(value: (js.Any, js.Any) => Boolean): Self = StObject.set(x, "$aeq", js.Any.fromFunction2(value))
    
    @scala.inline
    def set$and(value: (js.Any, js.Any) => Boolean): Self = StObject.set(x, "$and", js.Any.fromFunction2(value))
    
    @scala.inline
    def set$between(value: (js.Any, js.Any) => Boolean): Self = StObject.set(x, "$between", js.Any.fromFunction2(value))
    
    @scala.inline
    def set$contains(value: (js.Any, js.Any) => Boolean): Self = StObject.set(x, "$contains", js.Any.fromFunction2(value))
    
    @scala.inline
    def set$containsAny(value: (js.Any, js.Any) => Boolean): Self = StObject.set(x, "$containsAny", js.Any.fromFunction2(value))
    
    @scala.inline
    def set$containsNone(value: (js.Any, js.Any) => Boolean): Self = StObject.set(x, "$containsNone", js.Any.fromFunction2(value))
    
    @scala.inline
    def set$containsString(value: (js.Any, js.Any) => Boolean): Self = StObject.set(x, "$containsString", js.Any.fromFunction2(value))
    
    @scala.inline
    def set$definedin(value: (js.Any, js.Any) => Boolean): Self = StObject.set(x, "$definedin", js.Any.fromFunction2(value))
    
    @scala.inline
    def set$dteq(value: (js.Any, js.Any) => Boolean): Self = StObject.set(x, "$dteq", js.Any.fromFunction2(value))
    
    @scala.inline
    def set$eq(value: (js.Any, js.Any) => Boolean): Self = StObject.set(x, "$eq", js.Any.fromFunction2(value))
    
    @scala.inline
    def set$finite(value: (js.Any, js.Any) => Boolean): Self = StObject.set(x, "$finite", js.Any.fromFunction2(value))
    
    @scala.inline
    def set$gt(value: (js.Any, js.Any) => Boolean): Self = StObject.set(x, "$gt", js.Any.fromFunction2(value))
    
    @scala.inline
    def set$gte(value: (js.Any, js.Any) => Boolean): Self = StObject.set(x, "$gte", js.Any.fromFunction2(value))
    
    @scala.inline
    def set$in(value: (js.Any, js.Any) => Boolean): Self = StObject.set(x, "$in", js.Any.fromFunction2(value))
    
    @scala.inline
    def set$jbetween(value: (js.Any, js.Any) => Boolean): Self = StObject.set(x, "$jbetween", js.Any.fromFunction2(value))
    
    @scala.inline
    def set$jgt(value: (js.Any, js.Any) => Boolean): Self = StObject.set(x, "$jgt", js.Any.fromFunction2(value))
    
    @scala.inline
    def set$jgte(value: (js.Any, js.Any) => Boolean): Self = StObject.set(x, "$jgte", js.Any.fromFunction2(value))
    
    @scala.inline
    def set$jlt(value: (js.Any, js.Any) => Boolean): Self = StObject.set(x, "$jlt", js.Any.fromFunction2(value))
    
    @scala.inline
    def set$jlte(value: (js.Any, js.Any) => Boolean): Self = StObject.set(x, "$jlte", js.Any.fromFunction2(value))
    
    @scala.inline
    def set$keyin(value: (js.Any, js.Any) => Boolean): Self = StObject.set(x, "$keyin", js.Any.fromFunction2(value))
    
    @scala.inline
    def set$len(value: (js.Any, js.Any) => Boolean): Self = StObject.set(x, "$len", js.Any.fromFunction2(value))
    
    @scala.inline
    def set$lt(value: (js.Any, js.Any) => Boolean): Self = StObject.set(x, "$lt", js.Any.fromFunction2(value))
    
    @scala.inline
    def set$lte(value: (js.Any, js.Any) => Boolean): Self = StObject.set(x, "$lte", js.Any.fromFunction2(value))
    
    @scala.inline
    def set$ne(value: (js.Any, js.Any) => Boolean): Self = StObject.set(x, "$ne", js.Any.fromFunction2(value))
    
    @scala.inline
    def set$nin(value: (js.Any, js.Any) => Boolean): Self = StObject.set(x, "$nin", js.Any.fromFunction2(value))
    
    @scala.inline
    def set$nkeyin(value: (js.Any, js.Any) => Boolean): Self = StObject.set(x, "$nkeyin", js.Any.fromFunction2(value))
    
    @scala.inline
    def set$not(value: (js.Any, js.Any) => Boolean): Self = StObject.set(x, "$not", js.Any.fromFunction2(value))
    
    @scala.inline
    def set$or(value: (js.Any, js.Any) => Boolean): Self = StObject.set(x, "$or", js.Any.fromFunction2(value))
    
    @scala.inline
    def set$regex(value: (js.Any, js.Any) => Boolean): Self = StObject.set(x, "$regex", js.Any.fromFunction2(value))
    
    @scala.inline
    def set$size(value: (js.Any, js.Any) => Boolean): Self = StObject.set(x, "$size", js.Any.fromFunction2(value))
    
    @scala.inline
    def set$type(value: (js.Any, js.Any) => Boolean): Self = StObject.set(x, "$type", js.Any.fromFunction2(value))
    
    @scala.inline
    def set$undefinedin(value: (js.Any, js.Any) => Boolean): Self = StObject.set(x, "$undefinedin", js.Any.fromFunction2(value))
    
    @scala.inline
    def set$where(value: (js.Any, js.Any) => Boolean): Self = StObject.set(x, "$where", js.Any.fromFunction2(value))
  }
}
