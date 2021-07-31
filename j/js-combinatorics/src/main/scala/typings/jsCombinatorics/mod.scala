package typings.jsCombinatorics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("js-combinatorics", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Calculates m C n
    */
  @scala.inline
  def C(m: Double, n: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("C")(m.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Calculates m P n
    */
  @scala.inline
  def P(m: Double, n: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("P")(m.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @JSImport("js-combinatorics", "VERSION")
  @js.native
  val VERSION: String = js.native
  
  /**
    * Generates `n`-digit "numbers" where each digit is an element in array.
    * Note this "number" is in the least significant order.
    * `n` defaults to the length of `a`.
    */
  @scala.inline
  def baseN[T](a: js.Array[T]): IPredictableGenerator[js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("baseN")(a.asInstanceOf[js.Any]).asInstanceOf[IPredictableGenerator[js.Array[T]]]
  @scala.inline
  def baseN[T](a: js.Array[T], n: Double): IPredictableGenerator[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("baseN")(a.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[IPredictableGenerator[js.Array[T]]]
  
  /**
    * Generates the combination of `a` with `n` elements, which
    * also supports larger sets of elements.
    * When `n` is ommited, the length of the array is used.
    * Somewhat slower than `combination()`
    */
  @scala.inline
  def bigCombination[T](a: js.Array[T]): IGenerator[js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("bigCombination")(a.asInstanceOf[js.Any]).asInstanceOf[IGenerator[js.Array[T]]]
  @scala.inline
  def bigCombination[T](a: js.Array[T], n: Double): IGenerator[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bigCombination")(a.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[IGenerator[js.Array[T]]]
  
  @scala.inline
  def cartesianProduct(a: js.Array[js.Any]*): ICartesianProductGenerator[js.Array[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("cartesianProduct")(a.asInstanceOf[js.Any]).asInstanceOf[ICartesianProductGenerator[js.Array[js.Any]]]
  /**
    * Generates the cartesian product of the arrays. All arguments must be arrays with more than one element.
    */
  @scala.inline
  def cartesianProduct[T1](a1: js.Array[T1]): ICartesianProductGenerator[js.Array[T1]] = ^.asInstanceOf[js.Dynamic].applyDynamic("cartesianProduct")(a1.asInstanceOf[js.Any]).asInstanceOf[ICartesianProductGenerator[js.Array[T1]]]
  @scala.inline
  def cartesianProduct[T1, T2](a1: js.Array[T1], a2: js.Array[T2]): ICartesianProductGenerator[js.Tuple2[T1, T2]] = (^.asInstanceOf[js.Dynamic].applyDynamic("cartesianProduct")(a1.asInstanceOf[js.Any], a2.asInstanceOf[js.Any])).asInstanceOf[ICartesianProductGenerator[js.Tuple2[T1, T2]]]
  @scala.inline
  def cartesianProduct[T1, T2, T3](a1: js.Array[T1], a2: js.Array[T2], a3: js.Array[T3]): ICartesianProductGenerator[js.Tuple3[T1, T2, T3]] = (^.asInstanceOf[js.Dynamic].applyDynamic("cartesianProduct")(a1.asInstanceOf[js.Any], a2.asInstanceOf[js.Any], a3.asInstanceOf[js.Any])).asInstanceOf[ICartesianProductGenerator[js.Tuple3[T1, T2, T3]]]
  @scala.inline
  def cartesianProduct[T1, T2, T3, T4](a1: js.Array[T1], a2: js.Array[T2], a3: js.Array[T3], a4: js.Array[T4]): ICartesianProductGenerator[js.Tuple4[T1, T2, T3, T4]] = (^.asInstanceOf[js.Dynamic].applyDynamic("cartesianProduct")(a1.asInstanceOf[js.Any], a2.asInstanceOf[js.Any], a3.asInstanceOf[js.Any], a4.asInstanceOf[js.Any])).asInstanceOf[ICartesianProductGenerator[js.Tuple4[T1, T2, T3, T4]]]
  @scala.inline
  def cartesianProduct[T1, T2, T3, T4, T5](a1: js.Array[T1], a2: js.Array[T2], a3: js.Array[T3], a4: js.Array[T4], a5: js.Array[T5]): ICartesianProductGenerator[js.Tuple5[T1, T2, T3, T4, T5]] = (^.asInstanceOf[js.Dynamic].applyDynamic("cartesianProduct")(a1.asInstanceOf[js.Any], a2.asInstanceOf[js.Any], a3.asInstanceOf[js.Any], a4.asInstanceOf[js.Any], a5.asInstanceOf[js.Any])).asInstanceOf[ICartesianProductGenerator[js.Tuple5[T1, T2, T3, T4, T5]]]
  @scala.inline
  def cartesianProduct[T1, T2, T3, T4, T5, T6](
    a1: js.Array[T1],
    a2: js.Array[T2],
    a3: js.Array[T3],
    a4: js.Array[T4],
    a5: js.Array[T5],
    a6: js.Array[T6]
  ): ICartesianProductGenerator[js.Tuple6[T1, T2, T3, T4, T5, T6]] = (^.asInstanceOf[js.Dynamic].applyDynamic("cartesianProduct")(a1.asInstanceOf[js.Any], a2.asInstanceOf[js.Any], a3.asInstanceOf[js.Any], a4.asInstanceOf[js.Any], a5.asInstanceOf[js.Any], a6.asInstanceOf[js.Any])).asInstanceOf[ICartesianProductGenerator[js.Tuple6[T1, T2, T3, T4, T5, T6]]]
  @scala.inline
  def cartesianProduct[T1, T2, T3, T4, T5, T6, T7](
    a1: js.Array[T1],
    a2: js.Array[T2],
    a3: js.Array[T3],
    a4: js.Array[T4],
    a5: js.Array[T5],
    a6: js.Array[T6],
    a7: js.Array[T7]
  ): ICartesianProductGenerator[js.Tuple7[T1, T2, T3, T4, T5, T6, T7]] = (^.asInstanceOf[js.Dynamic].applyDynamic("cartesianProduct")(a1.asInstanceOf[js.Any], a2.asInstanceOf[js.Any], a3.asInstanceOf[js.Any], a4.asInstanceOf[js.Any], a5.asInstanceOf[js.Any], a6.asInstanceOf[js.Any], a7.asInstanceOf[js.Any])).asInstanceOf[ICartesianProductGenerator[js.Tuple7[T1, T2, T3, T4, T5, T6, T7]]]
  @scala.inline
  def cartesianProduct[T1, T2, T3, T4, T5, T6, T7, T8](
    a1: js.Array[T1],
    a2: js.Array[T2],
    a3: js.Array[T3],
    a4: js.Array[T4],
    a5: js.Array[T5],
    a6: js.Array[T6],
    a7: js.Array[T7],
    a8: js.Array[T8]
  ): ICartesianProductGenerator[js.Tuple8[T1, T2, T3, T4, T5, T6, T7, T8]] = (^.asInstanceOf[js.Dynamic].applyDynamic("cartesianProduct")(a1.asInstanceOf[js.Any], a2.asInstanceOf[js.Any], a3.asInstanceOf[js.Any], a4.asInstanceOf[js.Any], a5.asInstanceOf[js.Any], a6.asInstanceOf[js.Any], a7.asInstanceOf[js.Any], a8.asInstanceOf[js.Any])).asInstanceOf[ICartesianProductGenerator[js.Tuple8[T1, T2, T3, T4, T5, T6, T7, T8]]]
  @scala.inline
  def cartesianProduct[T1, T2, T3, T4, T5, T6, T7, T8, T9](
    a1: js.Array[T1],
    a2: js.Array[T2],
    a3: js.Array[T3],
    a4: js.Array[T4],
    a5: js.Array[T5],
    a6: js.Array[T6],
    a7: js.Array[T7],
    a8: js.Array[T8],
    a9: js.Array[T9]
  ): ICartesianProductGenerator[js.Tuple9[T1, T2, T3, T4, T5, T6, T7, T8, T9]] = (^.asInstanceOf[js.Dynamic].applyDynamic("cartesianProduct")(a1.asInstanceOf[js.Any], a2.asInstanceOf[js.Any], a3.asInstanceOf[js.Any], a4.asInstanceOf[js.Any], a5.asInstanceOf[js.Any], a6.asInstanceOf[js.Any], a7.asInstanceOf[js.Any], a8.asInstanceOf[js.Any], a9.asInstanceOf[js.Any])).asInstanceOf[ICartesianProductGenerator[js.Tuple9[T1, T2, T3, T4, T5, T6, T7, T8, T9]]]
  @scala.inline
  def cartesianProduct[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
    a1: js.Array[T1],
    a2: js.Array[T2],
    a3: js.Array[T3],
    a4: js.Array[T4],
    a5: js.Array[T5],
    a6: js.Array[T6],
    a7: js.Array[T7],
    a8: js.Array[T8],
    a9: js.Array[T9],
    a10: js.Array[T10]
  ): ICartesianProductGenerator[js.Tuple10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]] = (^.asInstanceOf[js.Dynamic].applyDynamic("cartesianProduct")(a1.asInstanceOf[js.Any], a2.asInstanceOf[js.Any], a3.asInstanceOf[js.Any], a4.asInstanceOf[js.Any], a5.asInstanceOf[js.Any], a6.asInstanceOf[js.Any], a7.asInstanceOf[js.Any], a8.asInstanceOf[js.Any], a9.asInstanceOf[js.Any], a10.asInstanceOf[js.Any])).asInstanceOf[ICartesianProductGenerator[js.Tuple10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]]]
  
  /**
    * Generates the combination of `a` with `n` elements.
    * `n` defaults to the length of `a`.
    */
  @scala.inline
  def combination[T](a: js.Array[T]): IGenerator[js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("combination")(a.asInstanceOf[js.Any]).asInstanceOf[IGenerator[js.Array[T]]]
  @scala.inline
  def combination[T](a: js.Array[T], n: Double): IGenerator[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("combination")(a.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[IGenerator[js.Array[T]]]
  
  /**
    * Returns the factoradic representation of `n` in an array, in
    * least significant order.
    * See http://en.wikipedia.org/wiki/Factorial_number_system
    */
  @scala.inline
  def factoradic(n: Double): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("factoradic")(n.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  /**
    * Calculates n!
    */
  @scala.inline
  def factorial(n: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("factorial")(n.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * Generates the permutation of `a` with `n` elements.
    * `n` defaults to the length of `a`.
    */
  @scala.inline
  def permutation[T](a: js.Array[T]): IGenerator[js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("permutation")(a.asInstanceOf[js.Any]).asInstanceOf[IGenerator[js.Array[T]]]
  @scala.inline
  def permutation[T](a: js.Array[T], n: Double): IGenerator[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("permutation")(a.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[IGenerator[js.Array[T]]]
  
  /**
    * Generates the permutation of the combination of `a`.
    * Equivalent to `permutation(combination(a))`, but more efficient.
    */
  @scala.inline
  def permutationCombination[T](a: js.Array[T]): IGenerator[js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("permutationCombination")(a.asInstanceOf[js.Any]).asInstanceOf[IGenerator[js.Array[T]]]
  
  /**
    * Generates the power set of `a`.
    */
  @scala.inline
  def power[T](a: js.Array[T]): IPredictableGenerator[js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("power")(a.asInstanceOf[js.Any]).asInstanceOf[IPredictableGenerator[js.Array[T]]]
  
  trait ICartesianProductGenerator[T]
    extends StObject
       with IPredictableGenerator[T] {
    
    /**
      * Arguments are integer coordinates.
      * Arguments can be out of bounds but it returns `undefined` in such cases.
      */
    def get(coordinates: Double*): T
  }
  object ICartesianProductGenerator {
    
    @scala.inline
    def apply[T](
      filter: js.Function1[T, Boolean] => js.Array[T],
      forEach: js.Function1[T, Unit] => Unit,
      get: /* repeated */ Double => T,
      length: Double,
      map: js.Function1[T, js.Any] => js.Array[js.Any],
      next: () => T,
      nth: Double => T,
      toArray: () => js.Array[T]
    ): ICartesianProductGenerator[T] = {
      val __obj = js.Dynamic.literal(filter = js.Any.fromFunction1(filter), forEach = js.Any.fromFunction1(forEach), get = js.Any.fromFunction1(get), length = length.asInstanceOf[js.Any], map = js.Any.fromFunction1(map), next = js.Any.fromFunction0(next), nth = js.Any.fromFunction1(nth), toArray = js.Any.fromFunction0(toArray))
      __obj.asInstanceOf[ICartesianProductGenerator[T]]
    }
    
    @scala.inline
    implicit class ICartesianProductGeneratorMutableBuilder[Self <: ICartesianProductGenerator[?], T] (val x: Self & ICartesianProductGenerator[T]) extends AnyVal {
      
      @scala.inline
      def setGet(value: /* repeated */ Double => T): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    }
  }
  
  trait IGenerator[T] extends StObject {
    
    /**
      * Returns an array of elements that return `true` for the filter function.
      */
    def filter(predicate: js.Function1[/* item */ T, Boolean]): js.Array[T]
    
    /**
      * Applies the callback function for each element.
      */
    def forEach(f: js.Function1[/* item */ T, Unit]): Unit
    
    /**
      * Returns the total number of elements to be generated. This equals the result of calling
      * `generator.toArray().length` but it is precalculated without actually generating any elements.
      * Handy when doing setup for a potentially long-running loop.
      */
    var length: Double
    
    /**
      * Returns an array that is the output of calling the callback function separately on each element.
      */
    def map[TResult](f: js.Function1[/* item */ T, TResult]): js.Array[TResult]
    
    /**
      * Returns the element or undefined if no more elements are available.
      */
    def next(): T
    
    /**
      * Returns an array of all elements.
      */
    def toArray(): js.Array[T]
  }
  object IGenerator {
    
    @scala.inline
    def apply[T](
      filter: js.Function1[/* item */ T, Boolean] => js.Array[T],
      forEach: js.Function1[/* item */ T, Unit] => Unit,
      length: Double,
      map: js.Function1[/* item */ T, js.Any] => js.Array[js.Any],
      next: () => T,
      toArray: () => js.Array[T]
    ): IGenerator[T] = {
      val __obj = js.Dynamic.literal(filter = js.Any.fromFunction1(filter), forEach = js.Any.fromFunction1(forEach), length = length.asInstanceOf[js.Any], map = js.Any.fromFunction1(map), next = js.Any.fromFunction0(next), toArray = js.Any.fromFunction0(toArray))
      __obj.asInstanceOf[IGenerator[T]]
    }
    
    @scala.inline
    implicit class IGeneratorMutableBuilder[Self <: IGenerator[?], T] (val x: Self & IGenerator[T]) extends AnyVal {
      
      @scala.inline
      def setFilter(value: js.Function1[/* item */ T, Boolean] => js.Array[T]): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setForEach(value: js.Function1[/* item */ T, Unit] => Unit): Self = StObject.set(x, "forEach", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMap(value: js.Function1[/* item */ T, js.Any] => js.Array[js.Any]): Self = StObject.set(x, "map", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNext(value: () => T): Self = StObject.set(x, "next", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToArray(value: () => js.Array[T]): Self = StObject.set(x, "toArray", js.Any.fromFunction0(value))
    }
  }
  
  trait IPredictableGenerator[T]
    extends StObject
       with IGenerator[T] {
    
    /**
      * Returns the nth element (indexed from 0).
      */
    def nth(n: Double): T
  }
  object IPredictableGenerator {
    
    @scala.inline
    def apply[T](
      filter: js.Function1[T, Boolean] => js.Array[T],
      forEach: js.Function1[T, Unit] => Unit,
      length: Double,
      map: js.Function1[T, js.Any] => js.Array[js.Any],
      next: () => T,
      nth: Double => T,
      toArray: () => js.Array[T]
    ): IPredictableGenerator[T] = {
      val __obj = js.Dynamic.literal(filter = js.Any.fromFunction1(filter), forEach = js.Any.fromFunction1(forEach), length = length.asInstanceOf[js.Any], map = js.Any.fromFunction1(map), next = js.Any.fromFunction0(next), nth = js.Any.fromFunction1(nth), toArray = js.Any.fromFunction0(toArray))
      __obj.asInstanceOf[IPredictableGenerator[T]]
    }
    
    @scala.inline
    implicit class IPredictableGeneratorMutableBuilder[Self <: IPredictableGenerator[?], T] (val x: Self & IPredictableGenerator[T]) extends AnyVal {
      
      @scala.inline
      def setNth(value: Double => T): Self = StObject.set(x, "nth", js.Any.fromFunction1(value))
    }
  }
}
