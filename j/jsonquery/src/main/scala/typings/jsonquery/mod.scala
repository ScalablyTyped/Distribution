package typings.jsonquery

import org.scalablytyped.runtime.StringDictionary
import typings.node.NodeJS.ReadWriteStream
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply[T](query: Query[T]): ReadWriteStream = ^.asInstanceOf[js.Dynamic].apply(query.asInstanceOf[js.Any]).asInstanceOf[ReadWriteStream]
  
  @JSImport("jsonquery", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def `match`[T](haystack: T, predicate: Query[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("match")(haystack.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  trait AndQueryCondition[T]
    extends StObject
       with BinaryQueryCondition[T] {
    
    @JSName("$and")
    var $and: js.Array[Query[T]]
  }
  object AndQueryCondition {
    
    inline def apply[T]($and: js.Array[Query[T]]): AndQueryCondition[T] = {
      val __obj = js.Dynamic.literal($and = $and.asInstanceOf[js.Any])
      __obj.asInstanceOf[AndQueryCondition[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AndQueryCondition[?], T] (val x: Self & AndQueryCondition[T]) extends AnyVal {
      
      inline def set$and(value: js.Array[Query[T]]): Self = StObject.set(x, "$and", value.asInstanceOf[js.Any])
      
      inline def set$andVarargs(value: Query[T]*): Self = StObject.set(x, "$and", js.Array(value*))
    }
  }
  
  trait BaseCondition[P] extends StObject {
    
    @JSName("$all")
    var $all: js.Array[P]
    
    @JSName("$elemMatch")
    var $elemMatch: Partial[P]
    
    @JSName("$gt")
    var $gt: P
    
    @JSName("$gte")
    var $gte: P
    
    @JSName("$in")
    var $in: js.Array[P]
    
    @JSName("$lt")
    var $lt: P
    
    @JSName("$lte")
    var $lte: P
    
    @JSName("$mod")
    var $mod: js.Tuple2[Double, Double]
    
    @JSName("$ne")
    var $ne: P
    
    @JSName("$nin")
    var $nin: js.Array[P]
  }
  object BaseCondition {
    
    inline def apply[P](
      $all: js.Array[P],
      $elemMatch: Partial[P],
      $gt: P,
      $gte: P,
      $in: js.Array[P],
      $lt: P,
      $lte: P,
      $mod: js.Tuple2[Double, Double],
      $ne: P,
      $nin: js.Array[P]
    ): BaseCondition[P] = {
      val __obj = js.Dynamic.literal($all = $all.asInstanceOf[js.Any], $elemMatch = $elemMatch.asInstanceOf[js.Any], $gt = $gt.asInstanceOf[js.Any], $gte = $gte.asInstanceOf[js.Any], $in = $in.asInstanceOf[js.Any], $lt = $lt.asInstanceOf[js.Any], $lte = $lte.asInstanceOf[js.Any], $mod = $mod.asInstanceOf[js.Any], $ne = $ne.asInstanceOf[js.Any], $nin = $nin.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseCondition[P]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BaseCondition[?], P] (val x: Self & BaseCondition[P]) extends AnyVal {
      
      inline def set$all(value: js.Array[P]): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
      
      inline def set$allVarargs(value: P*): Self = StObject.set(x, "$all", js.Array(value*))
      
      inline def set$elemMatch(value: Partial[P]): Self = StObject.set(x, "$elemMatch", value.asInstanceOf[js.Any])
      
      inline def set$gt(value: P): Self = StObject.set(x, "$gt", value.asInstanceOf[js.Any])
      
      inline def set$gte(value: P): Self = StObject.set(x, "$gte", value.asInstanceOf[js.Any])
      
      inline def set$in(value: js.Array[P]): Self = StObject.set(x, "$in", value.asInstanceOf[js.Any])
      
      inline def set$inVarargs(value: P*): Self = StObject.set(x, "$in", js.Array(value*))
      
      inline def set$lt(value: P): Self = StObject.set(x, "$lt", value.asInstanceOf[js.Any])
      
      inline def set$lte(value: P): Self = StObject.set(x, "$lte", value.asInstanceOf[js.Any])
      
      inline def set$mod(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "$mod", value.asInstanceOf[js.Any])
      
      inline def set$ne(value: P): Self = StObject.set(x, "$ne", value.asInstanceOf[js.Any])
      
      inline def set$nin(value: js.Array[P]): Self = StObject.set(x, "$nin", value.asInstanceOf[js.Any])
      
      inline def set$ninVarargs(value: P*): Self = StObject.set(x, "$nin", js.Array(value*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.jsonquery.mod.OrQueryCondition[T]
    - typings.jsonquery.mod.AndQueryCondition[T]
  */
  trait BinaryQueryCondition[T]
    extends StObject
       with _Query[T]
  object BinaryQueryCondition {
    
    inline def AndQueryCondition[T]($and: js.Array[Query[T]]): typings.jsonquery.mod.AndQueryCondition[T] = {
      val __obj = js.Dynamic.literal($and = $and.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.jsonquery.mod.AndQueryCondition[T]]
    }
    
    inline def OrQueryCondition[T]($or: js.Array[Query[T]]): typings.jsonquery.mod.OrQueryCondition[T] = {
      val __obj = js.Dynamic.literal($or = $or.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.jsonquery.mod.OrQueryCondition[T]]
    }
  }
  
  trait OrQueryCondition[T]
    extends StObject
       with BinaryQueryCondition[T] {
    
    @JSName("$or")
    var $or: js.Array[Query[T]]
  }
  object OrQueryCondition {
    
    inline def apply[T]($or: js.Array[Query[T]]): OrQueryCondition[T] = {
      val __obj = js.Dynamic.literal($or = $or.asInstanceOf[js.Any])
      __obj.asInstanceOf[OrQueryCondition[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OrQueryCondition[?], T] (val x: Self & OrQueryCondition[T]) extends AnyVal {
      
      inline def set$or(value: js.Array[Query[T]]): Self = StObject.set(x, "$or", value.asInstanceOf[js.Any])
      
      inline def set$orVarargs(value: Query[T]*): Self = StObject.set(x, "$or", js.Array(value*))
    }
  }
  
  type PathQuery = StringDictionary[Any]
  
  /* Rewritten from type alias, can be one of: 
    - typings.jsonquery.mod.BinaryQueryCondition[T]
    - typings.jsonquery.mod.QueryValue[T]
    - typings.jsonquery.mod.PathQuery
  */
  type Query[T] = _Query[T] | PathQuery
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ P in keyof T ]:? T[P] | jsonquery.jsonquery.BaseCondition<T[P]>}
    }}}
    */
  @js.native
  trait QueryValue[T]
    extends StObject
       with _Query[T]
  
  trait _Query[T] extends StObject
}
