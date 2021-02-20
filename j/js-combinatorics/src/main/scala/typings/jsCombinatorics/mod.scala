package typings.jsCombinatorics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Calculates m C n
    */
  @JSImport("js-combinatorics", "C")
  @js.native
  def C(m: Double, n: Double): Double = js.native
  
  /**
    * Calculates m P n
    */
  @JSImport("js-combinatorics", "P")
  @js.native
  def P(m: Double, n: Double): Double = js.native
  
  @JSImport("js-combinatorics", "VERSION")
  @js.native
  val VERSION: String = js.native
  
  /**
    * Generates `n`-digit "numbers" where each digit is an element in array.
    * Note this "number" is in the least significant order.
    * `n` defaults to the length of `a`.
    */
  @JSImport("js-combinatorics", "baseN")
  @js.native
  def baseN[T](a: js.Array[T]): IPredictableGenerator[js.Array[T]] = js.native
  @JSImport("js-combinatorics", "baseN")
  @js.native
  def baseN[T](a: js.Array[T], n: Double): IPredictableGenerator[js.Array[T]] = js.native
  
  /**
    * Generates the combination of `a` with `n` elements, which
    * also supports larger sets of elements.
    * When `n` is ommited, the length of the array is used.
    * Somewhat slower than `combination()`
    */
  @JSImport("js-combinatorics", "bigCombination")
  @js.native
  def bigCombination[T](a: js.Array[T]): IGenerator[js.Array[T]] = js.native
  @JSImport("js-combinatorics", "bigCombination")
  @js.native
  def bigCombination[T](a: js.Array[T], n: Double): IGenerator[js.Array[T]] = js.native
  
  @JSImport("js-combinatorics", "cartesianProduct")
  @js.native
  def cartesianProduct(a: js.Array[_]*): ICartesianProductGenerator[js.Array[_]] = js.native
  /**
    * Generates the cartesian product of the arrays. All arguments must be arrays with more than one element.
    */
  @JSImport("js-combinatorics", "cartesianProduct")
  @js.native
  def cartesianProduct[T1](a1: js.Array[T1]): ICartesianProductGenerator[js.Array[T1]] = js.native
  @JSImport("js-combinatorics", "cartesianProduct")
  @js.native
  def cartesianProduct[T1, T2](a1: js.Array[T1], a2: js.Array[T2]): ICartesianProductGenerator[js.Tuple2[T1, T2]] = js.native
  @JSImport("js-combinatorics", "cartesianProduct")
  @js.native
  def cartesianProduct[T1, T2, T3](a1: js.Array[T1], a2: js.Array[T2], a3: js.Array[T3]): ICartesianProductGenerator[js.Tuple3[T1, T2, T3]] = js.native
  @JSImport("js-combinatorics", "cartesianProduct")
  @js.native
  def cartesianProduct[T1, T2, T3, T4](a1: js.Array[T1], a2: js.Array[T2], a3: js.Array[T3], a4: js.Array[T4]): ICartesianProductGenerator[js.Tuple4[T1, T2, T3, T4]] = js.native
  @JSImport("js-combinatorics", "cartesianProduct")
  @js.native
  def cartesianProduct[T1, T2, T3, T4, T5](a1: js.Array[T1], a2: js.Array[T2], a3: js.Array[T3], a4: js.Array[T4], a5: js.Array[T5]): ICartesianProductGenerator[js.Tuple5[T1, T2, T3, T4, T5]] = js.native
  @JSImport("js-combinatorics", "cartesianProduct")
  @js.native
  def cartesianProduct[T1, T2, T3, T4, T5, T6](
    a1: js.Array[T1],
    a2: js.Array[T2],
    a3: js.Array[T3],
    a4: js.Array[T4],
    a5: js.Array[T5],
    a6: js.Array[T6]
  ): ICartesianProductGenerator[js.Tuple6[T1, T2, T3, T4, T5, T6]] = js.native
  @JSImport("js-combinatorics", "cartesianProduct")
  @js.native
  def cartesianProduct[T1, T2, T3, T4, T5, T6, T7](
    a1: js.Array[T1],
    a2: js.Array[T2],
    a3: js.Array[T3],
    a4: js.Array[T4],
    a5: js.Array[T5],
    a6: js.Array[T6],
    a7: js.Array[T7]
  ): ICartesianProductGenerator[js.Tuple7[T1, T2, T3, T4, T5, T6, T7]] = js.native
  @JSImport("js-combinatorics", "cartesianProduct")
  @js.native
  def cartesianProduct[T1, T2, T3, T4, T5, T6, T7, T8](
    a1: js.Array[T1],
    a2: js.Array[T2],
    a3: js.Array[T3],
    a4: js.Array[T4],
    a5: js.Array[T5],
    a6: js.Array[T6],
    a7: js.Array[T7],
    a8: js.Array[T8]
  ): ICartesianProductGenerator[js.Tuple8[T1, T2, T3, T4, T5, T6, T7, T8]] = js.native
  @JSImport("js-combinatorics", "cartesianProduct")
  @js.native
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
  ): ICartesianProductGenerator[js.Tuple9[T1, T2, T3, T4, T5, T6, T7, T8, T9]] = js.native
  @JSImport("js-combinatorics", "cartesianProduct")
  @js.native
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
  ): ICartesianProductGenerator[js.Tuple10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]] = js.native
  
  /**
    * Generates the combination of `a` with `n` elements.
    * `n` defaults to the length of `a`.
    */
  @JSImport("js-combinatorics", "combination")
  @js.native
  def combination[T](a: js.Array[T]): IGenerator[js.Array[T]] = js.native
  @JSImport("js-combinatorics", "combination")
  @js.native
  def combination[T](a: js.Array[T], n: Double): IGenerator[js.Array[T]] = js.native
  
  /**
    * Returns the factoradic representation of `n` in an array, in
    * least significant order.
    * See http://en.wikipedia.org/wiki/Factorial_number_system
    */
  @JSImport("js-combinatorics", "factoradic")
  @js.native
  def factoradic(n: Double): js.Array[Double] = js.native
  
  /**
    * Calculates n!
    */
  @JSImport("js-combinatorics", "factorial")
  @js.native
  def factorial(n: Double): Double = js.native
  
  /**
    * Generates the permutation of `a` with `n` elements.
    * `n` defaults to the length of `a`.
    */
  @JSImport("js-combinatorics", "permutation")
  @js.native
  def permutation[T](a: js.Array[T]): IGenerator[js.Array[T]] = js.native
  @JSImport("js-combinatorics", "permutation")
  @js.native
  def permutation[T](a: js.Array[T], n: Double): IGenerator[js.Array[T]] = js.native
  
  /**
    * Generates the permutation of the combination of `a`.
    * Equivalent to `permutation(combination(a))`, but more efficient.
    */
  @JSImport("js-combinatorics", "permutationCombination")
  @js.native
  def permutationCombination[T](a: js.Array[T]): IGenerator[js.Array[T]] = js.native
  
  /**
    * Generates the power set of `a`.
    */
  @JSImport("js-combinatorics", "power")
  @js.native
  def power[T](a: js.Array[T]): IPredictableGenerator[js.Array[T]] = js.native
  
  @js.native
  trait ICartesianProductGenerator[T] extends IPredictableGenerator[T] {
    
    /**
      * Arguments are integer coordinates.
      * Arguments can be out of bounds but it returns `undefined` in such cases.
      */
    def get(coordinates: Double*): T = js.native
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
    implicit class ICartesianProductGeneratorMutableBuilder[Self <: ICartesianProductGenerator[_], T] (val x: Self with ICartesianProductGenerator[T]) extends AnyVal {
      
      @scala.inline
      def setGet(value: /* repeated */ Double => T): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait IGenerator[T] extends StObject {
    
    /**
      * Returns an array of elements that return `true` for the filter function.
      */
    def filter(predicate: js.Function1[/* item */ T, Boolean]): js.Array[T] = js.native
    
    /**
      * Applies the callback function for each element.
      */
    def forEach(f: js.Function1[/* item */ T, Unit]): Unit = js.native
    
    /**
      * Returns the total number of elements to be generated. This equals the result of calling
      * `generator.toArray().length` but it is precalculated without actually generating any elements.
      * Handy when doing setup for a potentially long-running loop.
      */
    var length: Double = js.native
    
    /**
      * Returns an array that is the output of calling the callback function separately on each element.
      */
    def map[TResult](f: js.Function1[/* item */ T, TResult]): js.Array[TResult] = js.native
    
    /**
      * Returns the element or undefined if no more elements are available.
      */
    def next(): T = js.native
    
    /**
      * Returns an array of all elements.
      */
    def toArray(): js.Array[T] = js.native
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
    implicit class IGeneratorMutableBuilder[Self <: IGenerator[_], T] (val x: Self with IGenerator[T]) extends AnyVal {
      
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
  
  @js.native
  trait IPredictableGenerator[T] extends IGenerator[T] {
    
    /**
      * Returns the nth element (indexed from 0).
      */
    def nth(n: Double): T = js.native
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
    implicit class IPredictableGeneratorMutableBuilder[Self <: IPredictableGenerator[_], T] (val x: Self with IPredictableGenerator[T]) extends AnyVal {
      
      @scala.inline
      def setNth(value: Double => T): Self = StObject.set(x, "nth", js.Any.fromFunction1(value))
    }
  }
}
