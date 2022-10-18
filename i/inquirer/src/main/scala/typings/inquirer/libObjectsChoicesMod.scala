package typings.inquirer

import typings.inquirer.anon.Type
import typings.inquirer.mod.Answers
import typings.inquirer.mod.KeyUnion
import typings.inquirer.mod.UnionToIntersection
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libObjectsChoicesMod {
  
  /**
    * A collection of multiple `Choice`-objects.
    *
    * @template T
    * The type of the answers.
    */
  @JSImport("inquirer/lib/objects/choices", JSImport.Default)
  @js.native
  open class default[T /* <: Answers */] protected ()
    extends StObject
       with Choices[T] {
    /**
      * Initializes a new instance of the {@link Choices `Choices<T>`} class.
      *
      * @param choices
      * The choices to add to the collection.
      *
      * @param answers
      * The {@link Answers `Answers`}-object.
      */
    def this(choices: js.Array[DistinctChoice[T]], answers: T) = this()
  }
  
  /**
    * Represents a property-name of any choice-type.
    *
    * @template T
    * The type of the answers.
    */
  type ChoiceProperty[T /* <: Answers */] = KeyUnion[UnionToIntersection[RealChoice[T]]]
  
  /**
    * A collection of multiple `Choice`-objects.
    *
    * @template T
    * The type of the answers.
    */
  @js.native
  trait Choices[T /* <: Answers */] extends StObject {
    
    /**
      * The unfiltered choices.
      */
    var choices: js.Array[DistinctChoice[T]] = js.native
    
    /**
      * Returns the elements of an array that meet the condition specified in a callback function.
      *
      * @param callbackfn
      * A function that accepts up to three arguments.
      *
      * The filter method calls the {@link callbackfn `callbackfn`} function one time for each element in the array.
      *
      * @param thisArg
      * An object to which the `this` keyword can refer in the {@link callbackfn `callbackfn`} function.
      *
      * If {@link thisArg `thisArg`} is omitted, undefined is used as the this value.
      *
      * @returns
      * The elements in the collection which meet the conditions.
      */
    def filter[TElement /* <: typings.inquirer.libObjectsChoiceMod.default[T] | typings.inquirer.libObjectsSeparatorMod.default */](
      callbackfn: js.Function3[
          /* value */ typings.inquirer.libObjectsChoiceMod.default[T] | typings.inquirer.libObjectsSeparatorMod.default, 
          /* index */ Double, 
          /* array */ js.Array[
            typings.inquirer.libObjectsChoiceMod.default[T] | typings.inquirer.libObjectsSeparatorMod.default
          ], 
          /* is TElement */ Boolean
        ]
    ): js.Array[TElement] = js.native
    def filter[TElement /* <: typings.inquirer.libObjectsChoiceMod.default[T] | typings.inquirer.libObjectsSeparatorMod.default */](
      callbackfn: js.Function3[
          /* value */ typings.inquirer.libObjectsChoiceMod.default[T] | typings.inquirer.libObjectsSeparatorMod.default, 
          /* index */ Double, 
          /* array */ js.Array[
            typings.inquirer.libObjectsChoiceMod.default[T] | typings.inquirer.libObjectsSeparatorMod.default
          ], 
          /* is TElement */ Boolean
        ],
      thisArg: Any
    ): js.Array[TElement] = js.native
    
    /**
      * Returns the value of the first element in the array where predicate is `true`, and `undefined` otherwise.
      *
      * @param predicate
      * {@link find `find`} calls {@link predicate `predicate`} once for each element of the array, in ascending order, until it finds one where predicate returns `true`.
      *
      * If such an element is found, {@link find `find`} immediately returns that element value.
      * Otherwise, find returns `undefined`.
      *
      * @param thisArg
      * If provided, it will be used as the `this` value for each invocation of {@link predicate `predicate`}.
      *
      * If it is not provided, `undefined` is used instead.
      */
    def find(
      predicate: js.Function3[
          /* value */ typings.inquirer.libObjectsChoiceMod.default[T] | typings.inquirer.libObjectsSeparatorMod.default, 
          /* index */ Double, 
          /* obj */ js.Array[
            typings.inquirer.libObjectsChoiceMod.default[T] | typings.inquirer.libObjectsSeparatorMod.default
          ], 
          Boolean
        ]
    ): typings.inquirer.libObjectsChoiceMod.default[T] | typings.inquirer.libObjectsSeparatorMod.default = js.native
    def find(
      predicate: js.Function3[
          /* value */ typings.inquirer.libObjectsChoiceMod.default[T] | typings.inquirer.libObjectsSeparatorMod.default, 
          /* index */ Double, 
          /* obj */ js.Array[
            typings.inquirer.libObjectsChoiceMod.default[T] | typings.inquirer.libObjectsSeparatorMod.default
          ], 
          Boolean
        ],
      thisArg: Any
    ): typings.inquirer.libObjectsChoiceMod.default[T] | typings.inquirer.libObjectsSeparatorMod.default = js.native
    
    /**
      * Performs the specified action for each element in an array.
      *
      * @param callbackfn
      * A function that accepts up to three arguments.
      *
      * {@link forEach `forEach`} calls the {@link callbackfn `callbackfn`} function one time for each element in the array.
      *
      * @param thisArg
      * An object to which the `this` keyword can refer in the {@link callbackfn `callbackfn`} function.
      *
      * If {@link thisArg `thisArg`} is omitted, `undefined` is used as the `this` value.
      */
    def forEach(
      callbackfn: js.Function3[
          /* value */ typings.inquirer.libObjectsChoiceMod.default[T] | typings.inquirer.libObjectsSeparatorMod.default, 
          /* index */ Double, 
          /* array */ js.Array[
            typings.inquirer.libObjectsChoiceMod.default[T] | typings.inquirer.libObjectsSeparatorMod.default
          ], 
          Unit
        ]
    ): Unit = js.native
    def forEach(
      callbackfn: js.Function3[
          /* value */ typings.inquirer.libObjectsChoiceMod.default[T] | typings.inquirer.libObjectsSeparatorMod.default, 
          /* index */ Double, 
          /* array */ js.Array[
            typings.inquirer.libObjectsChoiceMod.default[T] | typings.inquirer.libObjectsSeparatorMod.default
          ], 
          Unit
        ],
      thisArg: Any
    ): Unit = js.native
    
    /**
      * Gets the item at the specified index.
      *
      * @param index
      * The index of the item to get.
      *
      * @returns
      * The item at the specified index.
      */
    def get(index: Double): DistinctChoice[T] = js.native
    
    /**
      * Gets the choice at the specified index.
      *
      * @param index
      * The index of the choice to get.
      *
      * @returns
      * The choice at the specified index.
      */
    def getChoice(index: Double): RealChoice[T] = js.native
    
    /**
      * Returns the index of the first occurrence of a value in an array.
      *
      * @param searchElement
      * The value to locate in the array.
      *
      * @param fromIndex
      * The array index at which to begin the search.
      *
      * If {@link fromIndex `fromIndex`} is omitted, the search starts at index 0.
      *
      * @returns
      * The index of the specified {@link searchElement `searchElement`}.
      */
    def indexOf(searchElement: typings.inquirer.libObjectsChoiceMod.default[T]): Double = js.native
    def indexOf(searchElement: typings.inquirer.libObjectsChoiceMod.default[T], fromIndex: Double): Double = js.native
    def indexOf(searchElement: typings.inquirer.libObjectsSeparatorMod.default): Double = js.native
    def indexOf(searchElement: typings.inquirer.libObjectsSeparatorMod.default, fromIndex: Double): Double = js.native
    
    /**
      * The number of choices.
      */
    var length: Double = js.native
    
    /**
      * Retrieves the specified {@link property `property`} from all choices.
      *
      * @template TProperty
      * The name of the property to get.
      *
      * @param property
      * The property to query.
      *
      * @returns
      * The value of the property of each choice.
      */
    def pluck[TProperty /* <: ChoiceProperty[T] */](property: ChoiceProperty[T] | TProperty): js.Array[
        /* import warning: importer.ImportType#apply Failed type conversion: inquirer.inquirer/lib/objects/choices.RealChoice<T> & {[key: string] : undefined}[TProperty] */ js.Any
      ] = js.native
    
    /**
      * Appends new elements to the array, and returns the new length of the array.
      *
      * @param items
      * The elements to add to the array.
      *
      * @returns
      * The new length of the array.
      */
    def push(
      items: (typings.inquirer.libObjectsChoiceMod.default[T] | typings.inquirer.libObjectsSeparatorMod.default)*
    ): Double = js.native
    
    /**
      * The selectable choices.
      */
    var realChoices: js.Array[RealChoice[T]] = js.native
    
    /**
      * The number of selectable choices.
      */
    var realLength: Double = js.native
    
    /**
      * Gets all choices which apply to the where-clause.
      *
      * @param whereClause
      * The where-clause to apply.
      *
      * @returns
      * The choices which apply to the where-clause.
      */
    def where(whereClause: js.Object): js.Array[RealChoice[T]] = js.native
  }
  
  /**
    * Represents a valid choice for the {@link Choices `Choices<T>`} class.
    *
    * @template T
    * The type of the answers.
    */
  type DistinctChoice[T /* <: Answers */] = /* import warning: importer.ImportType#apply Failed type conversion: inquirer.inquirer.BaseChoiceMap<T>[keyof inquirer.inquirer.BaseChoiceMap<T>] */ js.Any
  
  /**
    * Represents a valid real choice for the {@link Choices `Choices<T>`} class.
    *
    * @template T
    * The type of the answers.
    */
  type RealChoice[T /* <: Answers */] = Exclude[DistinctChoice[T], Type]
}
