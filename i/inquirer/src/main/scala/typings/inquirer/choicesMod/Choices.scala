package typings.inquirer.choicesMod

import typings.inquirer.mod.Answers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A collection of multiple `Choice`-objects.
  *
  * @template T
  * The type of the answers.
  */
@js.native
trait Choices[T /* <: Answers */] extends js.Object {
  /**
    * The unfiltered choices.
    */
  var choices: js.Array[DistinctChoice[T]] = js.native
  /**
    * The number of choices.
    */
  var length: Double = js.native
  /**
    * The selectable choices.
    */
  var realChoices: js.Array[RealChoice[T]] = js.native
  /**
    * The number of selectable choices.
    */
  var realLength: Double = js.native
  /**
    * Returns the elements of an array that meet the condition specified in a callback function.
    *
    * @param callbackfn
    * A function that accepts up to three arguments.
    *
    * The filter method calls the `callbackfn` function one time for each element in the array.
    *
    * @param thisArg
    * An object to which the `this` keyword can refer in the callbackfn function.
    *
    * If `thisArg` is omitted, undefined is used as the this value.
    *
    * @returns
    * The elements in the collection which meet the conditions.
    */
  def filter[TElement /* <: typings.inquirer.choiceMod.^[T] | typings.inquirer.separatorMod.^  */](
    callbackfn: js.Function3[
      /* value */ typings.inquirer.choiceMod.^[T] | typings.inquirer.separatorMod.^ , 
      /* index */ Double, 
      /* array */ js.Array[typings.inquirer.choiceMod.^[T] | typings.inquirer.separatorMod.^ ], 
      /* is TElement */ Boolean
    ]
  ): js.Array[TElement] = js.native
  def filter[TElement /* <: typings.inquirer.choiceMod.^[T] | typings.inquirer.separatorMod.^  */](
    callbackfn: js.Function3[
      /* value */ typings.inquirer.choiceMod.^[T] | typings.inquirer.separatorMod.^ , 
      /* index */ Double, 
      /* array */ js.Array[typings.inquirer.choiceMod.^[T] | typings.inquirer.separatorMod.^ ], 
      /* is TElement */ Boolean
    ],
    thisArg: js.Any
  ): js.Array[TElement] = js.native
  /**
    * Returns the value of the first element in the array where predicate is true, and `undefined` otherwise.
    *
    * @param predicate
    * `find` calls `predicate` once for each element of the array, in ascending order, until it finds one where predicate returns `true`.
    *
    * If such an element is found, `find` immediately returns that element value.
    * Otherwise, find returns undefined.
    *
    * @param thisArg
    * If provided, it will be used as the `this` value for each invocation of `predicate`.
    *
    * If it is not provided, undefined is used instead.
    */
  def find(
    predicate: js.Function3[
      /* value */ typings.inquirer.choiceMod.^[T] | typings.inquirer.separatorMod.^ , 
      /* index */ Double, 
      /* obj */ js.Array[typings.inquirer.choiceMod.^[T] | typings.inquirer.separatorMod.^ ], 
      Boolean
    ]
  ): typings.inquirer.choiceMod.^[T] | typings.inquirer.separatorMod.^  = js.native
  def find(
    predicate: js.Function3[
      /* value */ typings.inquirer.choiceMod.^[T] | typings.inquirer.separatorMod.^ , 
      /* index */ Double, 
      /* obj */ js.Array[typings.inquirer.choiceMod.^[T] | typings.inquirer.separatorMod.^ ], 
      Boolean
    ],
    thisArg: js.Any
  ): typings.inquirer.choiceMod.^[T] | typings.inquirer.separatorMod.^  = js.native
  /**
    * Performs the specified action for each element in an array.
    *
    * @param callbackfn
    * A function that accepts up to three arguments.
    *
    * `forEach` calls the callbackfn function one time for each element in the array.
    *
    * @param thisArg
    * An object to which the this keyword can refer in the callbackfn function.
    *
    * If `thisArg` is omitted, undefined is used as the this value.
    */
  def forEach(
    callbackfn: js.Function3[
      /* value */ typings.inquirer.choiceMod.^[T] | typings.inquirer.separatorMod.^ , 
      /* index */ Double, 
      /* array */ js.Array[typings.inquirer.choiceMod.^[T] | typings.inquirer.separatorMod.^ ], 
      Unit
    ]
  ): Unit = js.native
  def forEach(
    callbackfn: js.Function3[
      /* value */ typings.inquirer.choiceMod.^[T] | typings.inquirer.separatorMod.^ , 
      /* index */ Double, 
      /* array */ js.Array[typings.inquirer.choiceMod.^[T] | typings.inquirer.separatorMod.^ ], 
      Unit
    ],
    thisArg: js.Any
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
    * If fromIndex is omitted, the search starts at index 0.
    *
    * @returns
    * The index of the specified `searchElement`.
    */
  def indexOf(searchElement: typings.inquirer.choiceMod.^[T]): Double = js.native
  def indexOf(searchElement: typings.inquirer.choiceMod.^[T], fromIndex: Double): Double = js.native
  def indexOf(searchElement: typings.inquirer.separatorMod.^): Double = js.native
  def indexOf(searchElement: typings.inquirer.separatorMod.^, fromIndex: Double): Double = js.native
  /**
    * Retrieves the specified `property` from all choices.
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
  def pluck[TProperty /* <: ChoiceProperty[T] */](property: TProperty): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: inquirer.inquirer/lib/objects/choices.RealChoice<T> & {[key: string] : undefined}[TProperty] */ js.Any
  ] = js.native
  def pluck[TProperty /* <: ChoiceProperty[T] */](property: ChoiceProperty[T]): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: inquirer.inquirer/lib/objects/choices.RealChoice<T> & {[key: string] : undefined}[TProperty] */ js.Any
  ] = js.native
  /**
    * Appends new elements to an array, and returns the new length of the array.
    *
    * @param items
    * The elements to add to the array.
    *
    * @returns
    * The new length of the array.
    */
  def push(items: (typings.inquirer.choiceMod.^[T] | typings.inquirer.separatorMod.^ )*): Double = js.native
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

