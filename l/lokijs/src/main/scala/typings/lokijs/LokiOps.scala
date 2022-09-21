package typings.lokijs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LokiOps extends StObject {
  
  // abstract/loose equality
  @JSName("$aeq")
  def $aeq(a: Any, b: Any): Boolean
  
  @JSName("$and")
  def $and(a: Any, b: Any): Boolean
  
  /** ex : coll.find({'orderCount': {$between: [10, 50]}}); */
  @JSName("$between")
  def $between(a: Any, vals: Any): Boolean
  
  @JSName("$contains")
  def $contains(a: Any, b: Any): Boolean
  
  @JSName("$containsAny")
  def $containsAny(a: Any, b: Any): Boolean
  
  @JSName("$containsNone")
  def $containsNone(a: Any, b: Any): Boolean
  
  @JSName("$containsString")
  def $containsString(a: Any, b: Any): Boolean
  
  @JSName("$definedin")
  def $definedin(a: Any, b: Any): Boolean
  
  // date equality / loki abstract equality test
  @JSName("$dteq")
  def $dteq(a: Any, b: Any): Boolean
  
  @JSName("$eq")
  def $eq(a: Any, b: Any): Boolean
  
  @JSName("$finite")
  def $finite(a: Any, b: Any): Boolean
  
  @JSName("$gt")
  def $gt(a: Any, b: Any): Boolean
  
  @JSName("$gte")
  def $gte(a: Any, b: Any): Boolean
  
  @JSName("$in")
  def $in(a: Any, b: Any): Boolean
  
  @JSName("$jbetween")
  def $jbetween(a: Any, vals: Any): Boolean
  
  @JSName("$jgt")
  def $jgt(a: Any, b: Any): Boolean
  
  @JSName("$jgte")
  def $jgte(a: Any, b: Any): Boolean
  
  @JSName("$jlt")
  def $jlt(a: Any, b: Any): Boolean
  
  @JSName("$jlte")
  def $jlte(a: Any, b: Any): Boolean
  
  @JSName("$keyin")
  def $keyin(a: Any, b: Any): Boolean
  
  @JSName("$len")
  def $len(a: Any, b: Any): Boolean
  
  @JSName("$lt")
  def $lt(a: Any, b: Any): Boolean
  
  @JSName("$lte")
  def $lte(a: Any, b: Any): Boolean
  
  @JSName("$ne")
  def $ne(a: Any, b: Any): Boolean
  
  @JSName("$nin")
  def $nin(a: Any, b: Any): Boolean
  
  @JSName("$nkeyin")
  def $nkeyin(a: Any, b: Any): Boolean
  
  // field-level logical operators
  // a is the value in the collection
  // b is the nested query operation (for '$not')
  //   or an array of nested query operations (for '$and' and '$or')
  @JSName("$not")
  def $not(a: Any, b: Any): Boolean
  
  @JSName("$or")
  def $or(a: Any, b: Any): Boolean
  
  @JSName("$regex")
  def $regex(a: Any, b: Any): Boolean
  
  @JSName("$size")
  def $size(a: Any, b: Any): Boolean
  
  @JSName("$type")
  def $type(a: Any, b: Any): Boolean
  
  @JSName("$undefinedin")
  def $undefinedin(a: Any, b: Any): Boolean
  
  @JSName("$where")
  def $where(a: Any, b: Any): Boolean
}
object LokiOps {
  
  inline def apply(
    $aeq: (Any, Any) => Boolean,
    $and: (Any, Any) => Boolean,
    $between: (Any, Any) => Boolean,
    $contains: (Any, Any) => Boolean,
    $containsAny: (Any, Any) => Boolean,
    $containsNone: (Any, Any) => Boolean,
    $containsString: (Any, Any) => Boolean,
    $definedin: (Any, Any) => Boolean,
    $dteq: (Any, Any) => Boolean,
    $eq: (Any, Any) => Boolean,
    $finite: (Any, Any) => Boolean,
    $gt: (Any, Any) => Boolean,
    $gte: (Any, Any) => Boolean,
    $in: (Any, Any) => Boolean,
    $jbetween: (Any, Any) => Boolean,
    $jgt: (Any, Any) => Boolean,
    $jgte: (Any, Any) => Boolean,
    $jlt: (Any, Any) => Boolean,
    $jlte: (Any, Any) => Boolean,
    $keyin: (Any, Any) => Boolean,
    $len: (Any, Any) => Boolean,
    $lt: (Any, Any) => Boolean,
    $lte: (Any, Any) => Boolean,
    $ne: (Any, Any) => Boolean,
    $nin: (Any, Any) => Boolean,
    $nkeyin: (Any, Any) => Boolean,
    $not: (Any, Any) => Boolean,
    $or: (Any, Any) => Boolean,
    $regex: (Any, Any) => Boolean,
    $size: (Any, Any) => Boolean,
    $type: (Any, Any) => Boolean,
    $undefinedin: (Any, Any) => Boolean,
    $where: (Any, Any) => Boolean
  ): LokiOps = {
    val __obj = js.Dynamic.literal($aeq = js.Any.fromFunction2($aeq), $and = js.Any.fromFunction2($and), $between = js.Any.fromFunction2($between), $contains = js.Any.fromFunction2($contains), $containsAny = js.Any.fromFunction2($containsAny), $containsNone = js.Any.fromFunction2($containsNone), $containsString = js.Any.fromFunction2($containsString), $definedin = js.Any.fromFunction2($definedin), $dteq = js.Any.fromFunction2($dteq), $eq = js.Any.fromFunction2($eq), $finite = js.Any.fromFunction2($finite), $gt = js.Any.fromFunction2($gt), $gte = js.Any.fromFunction2($gte), $in = js.Any.fromFunction2($in), $jbetween = js.Any.fromFunction2($jbetween), $jgt = js.Any.fromFunction2($jgt), $jgte = js.Any.fromFunction2($jgte), $jlt = js.Any.fromFunction2($jlt), $jlte = js.Any.fromFunction2($jlte), $keyin = js.Any.fromFunction2($keyin), $len = js.Any.fromFunction2($len), $lt = js.Any.fromFunction2($lt), $lte = js.Any.fromFunction2($lte), $ne = js.Any.fromFunction2($ne), $nin = js.Any.fromFunction2($nin), $nkeyin = js.Any.fromFunction2($nkeyin), $not = js.Any.fromFunction2($not), $or = js.Any.fromFunction2($or), $regex = js.Any.fromFunction2($regex), $size = js.Any.fromFunction2($size), $type = js.Any.fromFunction2($type), $undefinedin = js.Any.fromFunction2($undefinedin), $where = js.Any.fromFunction2($where))
    __obj.asInstanceOf[LokiOps]
  }
  
  extension [Self <: LokiOps](x: Self) {
    
    inline def set$aeq(value: (Any, Any) => Boolean): Self = StObject.set(x, "$aeq", js.Any.fromFunction2(value))
    
    inline def set$and(value: (Any, Any) => Boolean): Self = StObject.set(x, "$and", js.Any.fromFunction2(value))
    
    inline def set$between(value: (Any, Any) => Boolean): Self = StObject.set(x, "$between", js.Any.fromFunction2(value))
    
    inline def set$contains(value: (Any, Any) => Boolean): Self = StObject.set(x, "$contains", js.Any.fromFunction2(value))
    
    inline def set$containsAny(value: (Any, Any) => Boolean): Self = StObject.set(x, "$containsAny", js.Any.fromFunction2(value))
    
    inline def set$containsNone(value: (Any, Any) => Boolean): Self = StObject.set(x, "$containsNone", js.Any.fromFunction2(value))
    
    inline def set$containsString(value: (Any, Any) => Boolean): Self = StObject.set(x, "$containsString", js.Any.fromFunction2(value))
    
    inline def set$definedin(value: (Any, Any) => Boolean): Self = StObject.set(x, "$definedin", js.Any.fromFunction2(value))
    
    inline def set$dteq(value: (Any, Any) => Boolean): Self = StObject.set(x, "$dteq", js.Any.fromFunction2(value))
    
    inline def set$eq(value: (Any, Any) => Boolean): Self = StObject.set(x, "$eq", js.Any.fromFunction2(value))
    
    inline def set$finite(value: (Any, Any) => Boolean): Self = StObject.set(x, "$finite", js.Any.fromFunction2(value))
    
    inline def set$gt(value: (Any, Any) => Boolean): Self = StObject.set(x, "$gt", js.Any.fromFunction2(value))
    
    inline def set$gte(value: (Any, Any) => Boolean): Self = StObject.set(x, "$gte", js.Any.fromFunction2(value))
    
    inline def set$in(value: (Any, Any) => Boolean): Self = StObject.set(x, "$in", js.Any.fromFunction2(value))
    
    inline def set$jbetween(value: (Any, Any) => Boolean): Self = StObject.set(x, "$jbetween", js.Any.fromFunction2(value))
    
    inline def set$jgt(value: (Any, Any) => Boolean): Self = StObject.set(x, "$jgt", js.Any.fromFunction2(value))
    
    inline def set$jgte(value: (Any, Any) => Boolean): Self = StObject.set(x, "$jgte", js.Any.fromFunction2(value))
    
    inline def set$jlt(value: (Any, Any) => Boolean): Self = StObject.set(x, "$jlt", js.Any.fromFunction2(value))
    
    inline def set$jlte(value: (Any, Any) => Boolean): Self = StObject.set(x, "$jlte", js.Any.fromFunction2(value))
    
    inline def set$keyin(value: (Any, Any) => Boolean): Self = StObject.set(x, "$keyin", js.Any.fromFunction2(value))
    
    inline def set$len(value: (Any, Any) => Boolean): Self = StObject.set(x, "$len", js.Any.fromFunction2(value))
    
    inline def set$lt(value: (Any, Any) => Boolean): Self = StObject.set(x, "$lt", js.Any.fromFunction2(value))
    
    inline def set$lte(value: (Any, Any) => Boolean): Self = StObject.set(x, "$lte", js.Any.fromFunction2(value))
    
    inline def set$ne(value: (Any, Any) => Boolean): Self = StObject.set(x, "$ne", js.Any.fromFunction2(value))
    
    inline def set$nin(value: (Any, Any) => Boolean): Self = StObject.set(x, "$nin", js.Any.fromFunction2(value))
    
    inline def set$nkeyin(value: (Any, Any) => Boolean): Self = StObject.set(x, "$nkeyin", js.Any.fromFunction2(value))
    
    inline def set$not(value: (Any, Any) => Boolean): Self = StObject.set(x, "$not", js.Any.fromFunction2(value))
    
    inline def set$or(value: (Any, Any) => Boolean): Self = StObject.set(x, "$or", js.Any.fromFunction2(value))
    
    inline def set$regex(value: (Any, Any) => Boolean): Self = StObject.set(x, "$regex", js.Any.fromFunction2(value))
    
    inline def set$size(value: (Any, Any) => Boolean): Self = StObject.set(x, "$size", js.Any.fromFunction2(value))
    
    inline def set$type(value: (Any, Any) => Boolean): Self = StObject.set(x, "$type", js.Any.fromFunction2(value))
    
    inline def set$undefinedin(value: (Any, Any) => Boolean): Self = StObject.set(x, "$undefinedin", js.Any.fromFunction2(value))
    
    inline def set$where(value: (Any, Any) => Boolean): Self = StObject.set(x, "$where", js.Any.fromFunction2(value))
  }
}
