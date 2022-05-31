package typings.jsCombinatorics

import typings.jsCombinatorics.mod.ICartesianProductGenerator
import typings.jsCombinatorics.mod.IGenerator
import typings.jsCombinatorics.mod.IPredictableGenerator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Combinatorics {
    
    @JSGlobal("Combinatorics")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Calculates m C n
      */
    inline def C(m: Double, n: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("C")(m.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Calculates m P n
      */
    inline def P(m: Double, n: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("P")(m.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    @JSGlobal("Combinatorics.VERSION")
    @js.native
    val VERSION: String = js.native
    
    /**
      * Generates `n`-digit "numbers" where each digit is an element in array.
      * Note this "number" is in the least significant order.
      * `n` defaults to the length of `a`.
      */
    inline def baseN[T](a: js.Array[T]): IPredictableGenerator[js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("baseN")(a.asInstanceOf[js.Any]).asInstanceOf[IPredictableGenerator[js.Array[T]]]
    inline def baseN[T](a: js.Array[T], n: Double): IPredictableGenerator[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("baseN")(a.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[IPredictableGenerator[js.Array[T]]]
    
    /**
      * Generates the combination of `a` with `n` elements, which
      * also supports larger sets of elements.
      * When `n` is ommited, the length of the array is used.
      * Somewhat slower than `combination()`
      */
    inline def bigCombination[T](a: js.Array[T]): IGenerator[js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("bigCombination")(a.asInstanceOf[js.Any]).asInstanceOf[IGenerator[js.Array[T]]]
    inline def bigCombination[T](a: js.Array[T], n: Double): IGenerator[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bigCombination")(a.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[IGenerator[js.Array[T]]]
    
    inline def cartesianProduct(a: js.Array[js.Any]*): ICartesianProductGenerator[js.Array[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("cartesianProduct")(a.asInstanceOf[js.Any]).asInstanceOf[ICartesianProductGenerator[js.Array[js.Any]]]
    /**
      * Generates the cartesian product of the arrays. All arguments must be arrays with more than one element.
      */
    inline def cartesianProduct[T1](a1: js.Array[T1]): ICartesianProductGenerator[js.Array[T1]] = ^.asInstanceOf[js.Dynamic].applyDynamic("cartesianProduct")(a1.asInstanceOf[js.Any]).asInstanceOf[ICartesianProductGenerator[js.Array[T1]]]
    inline def cartesianProduct[T1, T2](a1: js.Array[T1], a2: js.Array[T2]): ICartesianProductGenerator[js.Tuple2[T1, T2]] = (^.asInstanceOf[js.Dynamic].applyDynamic("cartesianProduct")(a1.asInstanceOf[js.Any], a2.asInstanceOf[js.Any])).asInstanceOf[ICartesianProductGenerator[js.Tuple2[T1, T2]]]
    inline def cartesianProduct[T1, T2, T3](a1: js.Array[T1], a2: js.Array[T2], a3: js.Array[T3]): ICartesianProductGenerator[js.Tuple3[T1, T2, T3]] = (^.asInstanceOf[js.Dynamic].applyDynamic("cartesianProduct")(a1.asInstanceOf[js.Any], a2.asInstanceOf[js.Any], a3.asInstanceOf[js.Any])).asInstanceOf[ICartesianProductGenerator[js.Tuple3[T1, T2, T3]]]
    inline def cartesianProduct[T1, T2, T3, T4](a1: js.Array[T1], a2: js.Array[T2], a3: js.Array[T3], a4: js.Array[T4]): ICartesianProductGenerator[js.Tuple4[T1, T2, T3, T4]] = (^.asInstanceOf[js.Dynamic].applyDynamic("cartesianProduct")(a1.asInstanceOf[js.Any], a2.asInstanceOf[js.Any], a3.asInstanceOf[js.Any], a4.asInstanceOf[js.Any])).asInstanceOf[ICartesianProductGenerator[js.Tuple4[T1, T2, T3, T4]]]
    inline def cartesianProduct[T1, T2, T3, T4, T5](a1: js.Array[T1], a2: js.Array[T2], a3: js.Array[T3], a4: js.Array[T4], a5: js.Array[T5]): ICartesianProductGenerator[js.Tuple5[T1, T2, T3, T4, T5]] = (^.asInstanceOf[js.Dynamic].applyDynamic("cartesianProduct")(a1.asInstanceOf[js.Any], a2.asInstanceOf[js.Any], a3.asInstanceOf[js.Any], a4.asInstanceOf[js.Any], a5.asInstanceOf[js.Any])).asInstanceOf[ICartesianProductGenerator[js.Tuple5[T1, T2, T3, T4, T5]]]
    inline def cartesianProduct[T1, T2, T3, T4, T5, T6](
      a1: js.Array[T1],
      a2: js.Array[T2],
      a3: js.Array[T3],
      a4: js.Array[T4],
      a5: js.Array[T5],
      a6: js.Array[T6]
    ): ICartesianProductGenerator[js.Tuple6[T1, T2, T3, T4, T5, T6]] = (^.asInstanceOf[js.Dynamic].applyDynamic("cartesianProduct")(a1.asInstanceOf[js.Any], a2.asInstanceOf[js.Any], a3.asInstanceOf[js.Any], a4.asInstanceOf[js.Any], a5.asInstanceOf[js.Any], a6.asInstanceOf[js.Any])).asInstanceOf[ICartesianProductGenerator[js.Tuple6[T1, T2, T3, T4, T5, T6]]]
    inline def cartesianProduct[T1, T2, T3, T4, T5, T6, T7](
      a1: js.Array[T1],
      a2: js.Array[T2],
      a3: js.Array[T3],
      a4: js.Array[T4],
      a5: js.Array[T5],
      a6: js.Array[T6],
      a7: js.Array[T7]
    ): ICartesianProductGenerator[js.Tuple7[T1, T2, T3, T4, T5, T6, T7]] = (^.asInstanceOf[js.Dynamic].applyDynamic("cartesianProduct")(a1.asInstanceOf[js.Any], a2.asInstanceOf[js.Any], a3.asInstanceOf[js.Any], a4.asInstanceOf[js.Any], a5.asInstanceOf[js.Any], a6.asInstanceOf[js.Any], a7.asInstanceOf[js.Any])).asInstanceOf[ICartesianProductGenerator[js.Tuple7[T1, T2, T3, T4, T5, T6, T7]]]
    inline def cartesianProduct[T1, T2, T3, T4, T5, T6, T7, T8](
      a1: js.Array[T1],
      a2: js.Array[T2],
      a3: js.Array[T3],
      a4: js.Array[T4],
      a5: js.Array[T5],
      a6: js.Array[T6],
      a7: js.Array[T7],
      a8: js.Array[T8]
    ): ICartesianProductGenerator[js.Tuple8[T1, T2, T3, T4, T5, T6, T7, T8]] = (^.asInstanceOf[js.Dynamic].applyDynamic("cartesianProduct")(a1.asInstanceOf[js.Any], a2.asInstanceOf[js.Any], a3.asInstanceOf[js.Any], a4.asInstanceOf[js.Any], a5.asInstanceOf[js.Any], a6.asInstanceOf[js.Any], a7.asInstanceOf[js.Any], a8.asInstanceOf[js.Any])).asInstanceOf[ICartesianProductGenerator[js.Tuple8[T1, T2, T3, T4, T5, T6, T7, T8]]]
    inline def cartesianProduct[T1, T2, T3, T4, T5, T6, T7, T8, T9](
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
    inline def cartesianProduct[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
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
    inline def combination[T](a: js.Array[T]): IGenerator[js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("combination")(a.asInstanceOf[js.Any]).asInstanceOf[IGenerator[js.Array[T]]]
    inline def combination[T](a: js.Array[T], n: Double): IGenerator[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("combination")(a.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[IGenerator[js.Array[T]]]
    
    /**
      * Returns the factoradic representation of `n` in an array, in
      * least significant order.
      * See http://en.wikipedia.org/wiki/Factorial_number_system
      */
    inline def factoradic(n: Double): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("factoradic")(n.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
    
    /**
      * Calculates n!
      */
    inline def factorial(n: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("factorial")(n.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * Generates the permutation of `a` with `n` elements.
      * `n` defaults to the length of `a`.
      */
    inline def permutation[T](a: js.Array[T]): IGenerator[js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("permutation")(a.asInstanceOf[js.Any]).asInstanceOf[IGenerator[js.Array[T]]]
    inline def permutation[T](a: js.Array[T], n: Double): IGenerator[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("permutation")(a.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[IGenerator[js.Array[T]]]
    
    /**
      * Generates the permutation of the combination of `a`.
      * Equivalent to `permutation(combination(a))`, but more efficient.
      */
    inline def permutationCombination[T](a: js.Array[T]): IGenerator[js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("permutationCombination")(a.asInstanceOf[js.Any]).asInstanceOf[IGenerator[js.Array[T]]]
    
    /**
      * Generates the power set of `a`.
      */
    inline def power[T](a: js.Array[T]): IPredictableGenerator[js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("power")(a.asInstanceOf[js.Any]).asInstanceOf[IPredictableGenerator[js.Array[T]]]
  }
}
