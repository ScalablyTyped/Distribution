package typings.hifo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Remembers the highest/lowest values in a data set of any size. Useful if you have a large number of values,
    * but are only interested in the `n` highest (or lowest) ones.
    *
    * @example
    * import hifo = require('hifo');
    *
    * interface Person {
    *     name: string;
    *     age: number;
    * }
    *
    * const people: Person[] = [
    *   { name: 'Alice', age: 23 },
    *   { name: 'Eve', age: 45 },
    *   { name: 'Jane', age: 19 },
    *   { name: 'Bob', age: 30 },
    *   { name: 'John', age: 60 },
    *   // thousands of others
    * ];
    *
    * const oldest = hifo<Person>(hifo.highest('age'), 3);
    * for (const person of people) {
    *   oldest.add(person);
    * }
    *
    * console.log(oldest.data);
    * // =>
    * // [
    * //   { name: 'John', age: 60 },
    * //   { name: 'Eve', age: 45 },
    * //   { name: 'Bob', age: 30 }
    * // ]
    */
  inline def apply[T](compareFn: CompareFn[T]): typings.hifo.mod.Hifo[T] = ^.asInstanceOf[js.Dynamic].apply(compareFn.asInstanceOf[js.Any]).asInstanceOf[typings.hifo.mod.Hifo[T]]
  inline def apply[T](compareFn: CompareFn[T], size: Double): typings.hifo.mod.Hifo[T] = (^.asInstanceOf[js.Dynamic].apply(compareFn.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[typings.hifo.mod.Hifo[T]]
  
  @JSImport("hifo", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait Hifo[T] extends StObject {
    
    def add(entry: T): this.type = js.native
    
    val data: js.Array[T] = js.native
    
    def init(sort: CompareFn[T]): this.type = js.native
    def init(sort: CompareFn[T], size: Double): this.type = js.native
    
    def insert(entry: T): Double = js.native
    
    def reset(): this.type = js.native
    
    val size: Double = js.native
    
    def sort(left: T, right: T): Double = js.native
  }
  @JSImport("hifo", "Hifo")
  @js.native
  val Hifo: typings.hifo.mod.Hifo[Any] = js.native
  
  inline def highest(): CompareFn[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("highest")().asInstanceOf[CompareFn[Double]]
  inline def highest[TObject /* <: ObjectWithNumericValue[String | TKeySecondary] */, TKeySecondary /* <: ObjectKey */](primary: String): CompareFn[TObject] = ^.asInstanceOf[js.Dynamic].applyDynamic("highest")(primary.asInstanceOf[js.Any]).asInstanceOf[CompareFn[TObject]]
  inline def highest[TObject /* <: ObjectWithNumericValue[String | TKeySecondary] */, TKeySecondary /* <: ObjectKey */](primary: String, secondary: TKeySecondary): CompareFn[TObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("highest")(primary.asInstanceOf[js.Any], secondary.asInstanceOf[js.Any])).asInstanceOf[CompareFn[TObject]]
  inline def highest[TObject /* <: ObjectWithNumericValue[js.Symbol | TKeySecondary] */, TKeySecondary /* <: ObjectKey */](primary: js.Symbol): CompareFn[TObject] = ^.asInstanceOf[js.Dynamic].applyDynamic("highest")(primary.asInstanceOf[js.Any]).asInstanceOf[CompareFn[TObject]]
  inline def highest[TObject /* <: ObjectWithNumericValue[js.Symbol | TKeySecondary] */, TKeySecondary /* <: ObjectKey */](primary: js.Symbol, secondary: TKeySecondary): CompareFn[TObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("highest")(primary.asInstanceOf[js.Any], secondary.asInstanceOf[js.Any])).asInstanceOf[CompareFn[TObject]]
  inline def highest[TObject /* <: ObjectWithNumericValue[Double | TKeySecondary] */, TKeySecondary /* <: ObjectKey */](primary: Double): CompareFn[TObject] = ^.asInstanceOf[js.Dynamic].applyDynamic("highest")(primary.asInstanceOf[js.Any]).asInstanceOf[CompareFn[TObject]]
  inline def highest[TObject /* <: ObjectWithNumericValue[Double | TKeySecondary] */, TKeySecondary /* <: ObjectKey */](primary: Double, secondary: TKeySecondary): CompareFn[TObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("highest")(primary.asInstanceOf[js.Any], secondary.asInstanceOf[js.Any])).asInstanceOf[CompareFn[TObject]]
  
  inline def lowest(): CompareFn[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("lowest")().asInstanceOf[CompareFn[Double]]
  inline def lowest[TObject /* <: ObjectWithNumericValue[String | TKeySecondary] */, TKeySecondary /* <: ObjectKey */](primary: String): CompareFn[TObject] = ^.asInstanceOf[js.Dynamic].applyDynamic("lowest")(primary.asInstanceOf[js.Any]).asInstanceOf[CompareFn[TObject]]
  inline def lowest[TObject /* <: ObjectWithNumericValue[String | TKeySecondary] */, TKeySecondary /* <: ObjectKey */](primary: String, secondary: TKeySecondary): CompareFn[TObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("lowest")(primary.asInstanceOf[js.Any], secondary.asInstanceOf[js.Any])).asInstanceOf[CompareFn[TObject]]
  inline def lowest[TObject /* <: ObjectWithNumericValue[js.Symbol | TKeySecondary] */, TKeySecondary /* <: ObjectKey */](primary: js.Symbol): CompareFn[TObject] = ^.asInstanceOf[js.Dynamic].applyDynamic("lowest")(primary.asInstanceOf[js.Any]).asInstanceOf[CompareFn[TObject]]
  inline def lowest[TObject /* <: ObjectWithNumericValue[js.Symbol | TKeySecondary] */, TKeySecondary /* <: ObjectKey */](primary: js.Symbol, secondary: TKeySecondary): CompareFn[TObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("lowest")(primary.asInstanceOf[js.Any], secondary.asInstanceOf[js.Any])).asInstanceOf[CompareFn[TObject]]
  inline def lowest[TObject /* <: ObjectWithNumericValue[Double | TKeySecondary] */, TKeySecondary /* <: ObjectKey */](primary: Double): CompareFn[TObject] = ^.asInstanceOf[js.Dynamic].applyDynamic("lowest")(primary.asInstanceOf[js.Any]).asInstanceOf[CompareFn[TObject]]
  inline def lowest[TObject /* <: ObjectWithNumericValue[Double | TKeySecondary] */, TKeySecondary /* <: ObjectKey */](primary: Double, secondary: TKeySecondary): CompareFn[TObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("lowest")(primary.asInstanceOf[js.Any], secondary.asInstanceOf[js.Any])).asInstanceOf[CompareFn[TObject]]
  
  type CompareFn[T] = js.Function2[/* left */ T, /* right */ T, Double]
  
  type ObjectKey = String | Double | js.Symbol
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ key in TKey ]: number}
    }}}
    */
  @js.native
  trait ObjectWithNumericValue[TKey /* <: ObjectKey */] extends StObject
}
