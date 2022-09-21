package typings.jsCombinatorics

import typings.std.Generator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("js-combinatorics", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("js-combinatorics", "BaseN")
  @js.native
  open class BaseN[T] protected ()
    extends StObject
       with CBase[T, T] {
    def this(seed: js.Iterable[T]) = this()
    def this(seed: js.Iterable[T], size: Double) = this()
    
    var base: Double = js.native
  }
  
  @JSImport("js-combinatorics", "CartesianProduct")
  @js.native
  open class CartesianProduct[T] protected ()
    extends StObject
       with CBase[js.Array[T], T] {
    def this(args: js.Iterable[T]*) = this()
  }
  
  @JSImport("js-combinatorics", "Combination")
  @js.native
  open class Combination_[T] protected ()
    extends StObject
       with CBase[T, T] {
    def this(seed: js.Iterable[T]) = this()
    def this(seed: js.Iterable[T], size: Double) = this()
    
    /**
      * returns an iterator which is more efficient
      * than the default iterator that uses .nth
      *
      * @link https://en.wikipedia.org/wiki/Combinatorial_number_system#Applications
      */
    def bitwiseIterator(): Generator[js.Array[T], Unit, Any] = js.native
    
    def comb(anyint: Any): js.Array[Double] = js.native
  }
  
  @JSImport("js-combinatorics", "Permutation")
  @js.native
  open class Permutation_[T] protected ()
    extends StObject
       with CBase[T, T] {
    def this(seed: js.Iterable[T]) = this()
    def this(seed: js.Iterable[T], size: Double) = this()
  }
  
  @JSImport("js-combinatorics", "PowerSet")
  @js.native
  open class PowerSet[T] protected ()
    extends StObject
       with CBase[T, T] {
    def this(seed: js.Iterable[T]) = this()
  }
  
  inline def combinadic(n: anyint, k: anyint): js.Function1[/* m */ anyint, js.Array[Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("combinadic")(n.asInstanceOf[js.Any], k.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* m */ anyint, js.Array[Double]]]
  
  inline def combination(n: anyint, k: anyint): js.BigInt = (^.asInstanceOf[js.Dynamic].applyDynamic("combination")(n.asInstanceOf[js.Any], k.asInstanceOf[js.Any])).asInstanceOf[js.BigInt]
  
  inline def factoradic(n: anyint): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("factoradic")(n.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  inline def factoradic(n: anyint, l: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("factoradic")(n.asInstanceOf[js.Any], l.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def factorial(n: anyint): js.BigInt = ^.asInstanceOf[js.Dynamic].applyDynamic("factorial")(n.asInstanceOf[js.Any]).asInstanceOf[js.BigInt]
  
  inline def permutation(n: anyint, k: anyint): js.BigInt = (^.asInstanceOf[js.Dynamic].applyDynamic("permutation")(n.asInstanceOf[js.Any], k.asInstanceOf[js.Any])).asInstanceOf[js.BigInt]
  
  inline def randomInteger(): anyint = ^.asInstanceOf[js.Dynamic].applyDynamic("randomInteger")().asInstanceOf[anyint]
  inline def randomInteger(min: Unit, max: anyint): anyint = (^.asInstanceOf[js.Dynamic].applyDynamic("randomInteger")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[anyint]
  inline def randomInteger(min: anyint): anyint = ^.asInstanceOf[js.Dynamic].applyDynamic("randomInteger")(min.asInstanceOf[js.Any]).asInstanceOf[anyint]
  inline def randomInteger(min: anyint, max: anyint): anyint = (^.asInstanceOf[js.Dynamic].applyDynamic("randomInteger")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[anyint]
  
  @JSImport("js-combinatorics", "version")
  @js.native
  val version: /* "2.1.1" */ String = js.native
  
  /**
    * Base Class of `js-combinatorics`
    */
  @js.native
  trait CBase[T, U] extends StObject {
    
    /**
      * check n for nth
      */
    def _check(n: anyint): anyint = js.native
    
    /**
      * get the `n`th element of the iterator.
      * negative `n` goes backwards
      * like `Array.prototype.at()`
      * @link: https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array/at
      */
    def at(n: anyint): Optional[js.Array[U]] = js.native
    
    /**
      * @deprecated
      * tells wether you need `BigInt` to access all elements.
      */
    def isBig: Boolean = js.native
    
    /**
      * @deprecated
      * tells wether it is safe to work on this instance.
      *
      * * always `true` unless your platform does not support `BigInt`.
      * * if not, `true` iff `.isBig` is `false`.
      */
    def isSafe: Boolean = js.native
    
    /**
      * Common iterator
      */
    @JSName(js.Symbol.iterator)
    var iterator: js.Function0[Generator[js.Array[U], Unit, Any]] = js.native
    
    /**
      * the number of elements
      */
    var length: js.BigInt = js.native
    
    /**
      * an alias of `at`
      */
    def nth(n: anyint): Optional[js.Array[U]] = js.native
    
    /**
      * pick random element
      */
    def sample(): Optional[js.Array[U]] = js.native
    
    /**
      * an infinite steam of random elements
      */
    def samples(): Generator[js.Array[U], scala.Nothing, Any] = js.native
    
    /**
      * the seed iterable
      */
    var seed: js.Array[T] = js.native
    
    /**
      * the size (# of elements) of each element.
      */
    var size: Double = js.native
    
    /**
      * returns `[...this]`.
      */
    def toArray(): js.Array[js.Array[U]] = js.native
  }
  
  /**
    * Optional<T> will not be official so
    * @link: https://github.com/microsoft/TypeScript/issues/19944
    */
  type Optional[T] = js.UndefOr[T]
  
  /**
    * BigInt Workaround
    *
    * https://github.com/streamich/memfs/issues/275
    */
  type anyint = Double | js.BigInt
}
