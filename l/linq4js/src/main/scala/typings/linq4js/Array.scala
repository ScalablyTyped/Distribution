package typings.linq4js

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.linq4js.anon.GroupValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Array[T] extends StObject {
  
  /**
    * Adds an object to the array
    * @param object The object to add
    * @param generateId Auto-generate a property to identify object in later processes
    */
  def Add(`object`: T): Array[T] = js.native
  def Add(`object`: T, generateId: Boolean): Array[T] = js.native
  
  /**
    * Adds objects to the array
    * @param objects The array of objects to add
    * @param generateId Auto-generate a property to identify object in later processes
    */
  def AddRange(objects: Array[T]): Array[T] = js.native
  def AddRange(objects: Array[T], generateId: Boolean): Array[T] = js.native
  
  def Aggregate(method: String): String = js.native
  def Aggregate(method: String, startVal: Any): String = js.native
  /**
    * Combines the entries using a custom function
    * @param method A function (or function-string) for aggregation
    * @param startVal The value to start aggregation
    */
  def Aggregate(method: js.Function2[/* result */ Any, /* item */ T, Any]): String = js.native
  def Aggregate(method: js.Function2[/* result */ Any, /* item */ T, Any], startVal: Any): String = js.native
  
  def All(filter: String): Boolean = js.native
  /**
    * Tests if all items in the array match the condition
    * @param filter A function (or function-string) that returns a boolean when matching element was found
    */
  def All(filter: js.Function1[/* item */ T, Boolean]): Boolean = js.native
  
  /**
    * Tests if any item is in the array
    * @param filter If set the function tests if any item in the array matches the condition
    */
  def Any(): Boolean = js.native
  def Any(filter: String): Boolean = js.native
  def Any(filter: js.Function1[/* item */ T, Boolean]): Boolean = js.native
  
  /**
    * Computes the average of the elements
    * @param selector A selector-function (or function-string) to select property for average computing
    * @param filter If set the function computes the average of elements that match the filter
    */
  def Average(): Double = js.native
  def Average(selector: String): Double = js.native
  def Average(selector: String, filter: String): Double = js.native
  def Average(selector: String, filter: js.Function1[/* item */ T, Boolean]): Double = js.native
  def Average(selector: js.Function1[/* item */ T, Any]): Double = js.native
  def Average(selector: js.Function1[/* item */ T, Any], filter: String): Double = js.native
  def Average(selector: js.Function1[/* item */ T, Any], filter: js.Function1[/* item */ T, Boolean]): Double = js.native
  def Average(selector: Unit, filter: String): Double = js.native
  def Average(selector: Unit, filter: js.Function1[/* item */ T, Boolean]): Double = js.native
  
  /**
    * Creates a copy of the array
    */
  def Clone(): Array[T] = js.native
  
  /**
    * Combines two arrays
    * @param array The array to combine
    */
  def Concat(array: Array[T]): Array[T] = js.native
  
  /**
    * Tests if array contains specific object
    * @param object The object to test for
    */
  def Contains(`object`: T): Boolean = js.native
  
  /**
    * Returns the length of the array
    * @param filter If set the function returns count of elements matched by the condition
    */
  def Count(): Double = js.native
  def Count(filter: String): Double = js.native
  def Count(filter: js.Function1[/* item */ T, Boolean]): Double = js.native
  
  /**
    * Makes all values unique
    * @param valueSelector A selector-function (or function-string) to select property for comparison and distinction
    */
  def Distinct(): Array[T] = js.native
  def Distinct(valueSelector: String): Array[T] = js.native
  def Distinct(valueSelector: js.Function1[/* item */ T, Any]): Array[T] = js.native
  
  /**
    * Executes actions defined in the command-string
    * @param command The command-string for execution
    */
  def Evaluate(command: String): Any = js.native
  
  def FindIndex(filter: String): Double = js.native
  /**
    * Gets the index of the first item found by a filter
    * @param filter A function (or function-string) that returns a boolean when matching element was found
    */
  def FindIndex(filter: js.Function1[/* item */ T, Boolean]): Double = js.native
  
  def FindLastIndex(filter: String): Double = js.native
  /**
    * Gets the index of the last item found by a filter
    * @param filter A function (or function-string) that returns a boolean when matching element was found
    */
  def FindLastIndex(filter: js.Function1[/* item */ T, Boolean]): Double = js.native
  
  /**
    * Returns the first item of the array - Throws an exception if no item was found
    * @param filter If set the function returns the first item that matches the filter
    */
  def First(): T = js.native
  def First(filter: String): T = js.native
  def First(filter: js.Function1[/* item */ T, Boolean]): T = js.native
  
  /**
    * Returns the first item of the array - returns `null` if no suitable item was found
    * @param filter If set the function returns the first item that matches the filter
    */
  def FirstOrDefault(): T | Null = js.native
  def FirstOrDefault(filter: String): T | Null = js.native
  def FirstOrDefault(filter: js.Function1[/* item */ T, Boolean]): T | Null = js.native
  
  def ForEach(action: String): Array[T] = js.native
  /**
    * Executes a method for each item in the array
    * @param action A function (or function-string) that gets executed for each element. If it returns false the loop stops.
    */
  def ForEach(action: js.Function2[/* item */ T, /* index */ js.UndefOr[Double], Boolean | Any]): Array[T] = js.native
  
  /**
    * Gets the item with the index
    * @param index Item index
    */
  def Get(index: Double): T = js.native
  
  def GroupBy(selector: String): Array[Array[T]] = js.native
  /**
    * Groups array by property
    * @param selector The selector-function (or function-string) that selects the property for grouping
    */
  def GroupBy(selector: js.Function1[/* item */ T, Any]): Array[Array[T]] = js.native
  
  /**
    * Inserts an entry at a specific position
    * @param object The object to insert
    * @param index The position to insert
    */
  def Insert(`object`: T, index: Double): Array[T] = js.native
  
  /**
    * Combines two arrays but only applies values that are in both arrays
    * @param array The array to combine
    */
  def Intersect(array: Array[T]): Array[T] = js.native
  
  /**
    * Joins the entries by a given char
    * @param character The character for joining
    * @param selector A selector-function (or function-string) to select property for joining
    */
  def Join(character: String): String = js.native
  def Join(character: String, selector: String): String = js.native
  def Join(character: String, selector: js.Function1[/* item */ T, Any]): String = js.native
  
  /**
    * Returns the last item of the array - Throws an exception if no item was found
    * @param filter If set the function returns the last item that matches the filter
    */
  def Last(): T = js.native
  def Last(filter: String): T = js.native
  def Last(filter: js.Function1[/* item */ T, Boolean]): T = js.native
  
  /**
    * Returns the last item of the array - returns `null` if no suitable item was found
    * @param filter If set the function returns the last item that matches the filter
    */
  def LastOrDefault(): T | Null = js.native
  def LastOrDefault(filter: String): T | Null = js.native
  def LastOrDefault(filter: js.Function1[/* item */ T, Boolean]): T | Null = js.native
  
  /**
    * Returns the greates element in array
    * @param valueSelector The selector-function (or function-string) that selects the property for comparison
    */
  def Max(): T | Null = js.native
  def Max(valueSelector: String): T | Null = js.native
  def Max(valueSelector: js.Function1[/* item */ T, Any]): T | Null = js.native
  
  /**
    * Returns the smallest element in array
    * @param valueSelector The selector-function (or function-string) that selects the property for comparison
    */
  def Min(): T | Null = js.native
  def Min(valueSelector: String): T | Null = js.native
  def Min(valueSelector: js.Function1[/* item */ T, Any]): T | Null = js.native
  
  /**
    * Moves an item from one index to another
    * @param oldIndex The current position of the item
    * @param newIndex The new position of the item
    */
  def Move(oldIndex: Double, newIndex: Double): Array[T] = js.native
  
  def OrderBy(valueSelector: String): Array[T] = js.native
  /**
    * Orders array by property or value in ascending direction
    * @param valueSelector The selector-function (or function-string) that selects the property for sorting
    */
  def OrderBy(valueSelector: js.Function1[/* item */ T, Any]): Array[T] = js.native
  
  def OrderByDescending(valueSelector: String): Array[T] = js.native
  /**
    * Orders array by property or value in descending direction
    * @param valueSelector The selector-function (or function-string) that selects the property for sorting
    */
  def OrderByDescending(valueSelector: js.Function1[/* item */ T, Any]): Array[T] = js.native
  
  /**
    * Takes items in a specific range
    * @param start The start position
    * @param length The number of elements to take
    */
  def Range(start: Double, length: Double): Array[T] = js.native
  
  /**
    * Removes an object from the array
    * @param object The object to remove
    * @param primaryKeySelector A selector-function (or function-string) to define a property to indentify object in array
    */
  def Remove(`object`: T): Array[T] = js.native
  def Remove(`object`: T, primaryKeySelector: String): Array[T] = js.native
  def Remove(`object`: T, primaryKeySelector: js.Function1[/* item */ T, Any]): Array[T] = js.native
  
  /**
    * Removes objects from the array
    * @param objects The array of objects to remove
    * @param primaryKeySelector A selector-function (or function-string) to define a property to indentify object in array
    */
  def RemoveRange(objects: Array[T]): Array[T] = js.native
  def RemoveRange(objects: Array[T], primaryKeySelector: String): Array[T] = js.native
  def RemoveRange(objects: Array[T], primaryKeySelector: js.Function1[/* item */ T, Any]): Array[T] = js.native
  
  /**
    * Repeats an object in the array
    * @param object The object to repeat
    * @param count The count of repeats
    */
  def Repeat(`object`: T, count: Double): Array[T] = js.native
  
  /**
    * Reverses the array
    */
  def Reverse(): Array[T] = js.native
  
  def Select[Y](selector: String): Array[Y] = js.native
  /**
    * Select the properties for a new array
    * @param selector A function (or a function-string) that returns a new object
    */
  def Select[Y](selector: js.Function1[/* item */ T, Y]): Array[Y] = js.native
  
  def SelectMany[Y](selector: String): Array[Y] = js.native
  /**
    * Select the properties with an array as value and concats them
    * @param selector A function (or a function-string) that returns the array with elements to select
    */
  def SelectMany[Y](selector: js.Function1[/* item */ T, Array[Y]]): Array[Y] = js.native
  
  /**
    * Compares to sequences of objects
    * @param array The array to compare
    */
  def SequenceEqual(array: Array[T]): Boolean = js.native
  
  /**
    * Returns the only item of the array - Throws an exception if not exactly one item is in array
    * @param filter If set the function returns the only item that matches the filter
    */
  def Single(): T = js.native
  def Single(filter: String): T = js.native
  def Single(filter: js.Function1[/* item */ T, Boolean]): T = js.native
  
  /**
    * Returns the only item of the array - Throws an exception if not only one item is in array
    * @param filter If set the function returns the only item that matches the filter
    */
  def SingleOrDefault(): T | Null = js.native
  def SingleOrDefault(filter: String): T | Null = js.native
  def SingleOrDefault(filter: js.Function1[/* item */ T, Boolean]): T | Null = js.native
  
  /**
    * Skips entries
    * @param count The count of elements skipped
    */
  def Skip(count: Double): Array[T] = js.native
  
  /**
    * Computes the sum of the elements
    * @param selector A selector-function (or function-string) to select property for adding
    * @param filter If set the function computes the sum of elements that match the filter
    */
  def Sum(): Double = js.native
  def Sum(selector: String): Double = js.native
  def Sum(selector: String, filter: String): Double = js.native
  def Sum(selector: String, filter: js.Function1[/* item */ T, Boolean]): Double = js.native
  def Sum(selector: js.Function1[/* item */ T, Any]): Double = js.native
  def Sum(selector: js.Function1[/* item */ T, Any], filter: String): Double = js.native
  def Sum(selector: js.Function1[/* item */ T, Any], filter: js.Function1[/* item */ T, Boolean]): Double = js.native
  def Sum(selector: Unit, filter: String): Double = js.native
  def Sum(selector: Unit, filter: js.Function1[/* item */ T, Boolean]): Double = js.native
  
  /**
    * Limits the number of entries taken
    * @param count The count of elements taken
    */
  def Take(count: Double): Array[T] = js.native
  
  def TakeWhile(condition: String): Array[T] = js.native
  def TakeWhile(condition: String, initial: String): Array[T] = js.native
  def TakeWhile(condition: String, initial: String, after: String): Array[T] = js.native
  def TakeWhile(condition: String, initial: String, after: js.Function2[/* item */ T, /* storage */ Any, Unit]): Array[T] = js.native
  def TakeWhile(condition: String, initial: js.Function1[/* storage */ Any, Unit]): Array[T] = js.native
  def TakeWhile(condition: String, initial: js.Function1[/* storage */ Any, Unit], after: String): Array[T] = js.native
  def TakeWhile(
    condition: String,
    initial: js.Function1[/* storage */ Any, Unit],
    after: js.Function2[/* item */ T, /* storage */ Any, Unit]
  ): Array[T] = js.native
  def TakeWhile(condition: String, initial: Unit, after: String): Array[T] = js.native
  def TakeWhile(condition: String, initial: Unit, after: js.Function2[/* item */ T, /* storage */ Any, Unit]): Array[T] = js.native
  /**
    * Takes entries as long as a condition is true
    * @param condition The condition-function (or function-string) that returns a boolean. All elements until a false gets thrown are taken
    * @param initial A initial-function (or function-string) that gets executed once at the start of the loop
    * @param after A function that gets executed after every element-iteration after the condition-function was evaluated
    */
  def TakeWhile(condition: js.Function2[/* item */ T, /* storage */ js.UndefOr[Any], Boolean]): Array[T] = js.native
  def TakeWhile(condition: js.Function2[/* item */ T, /* storage */ js.UndefOr[Any], Boolean], initial: String): Array[T] = js.native
  def TakeWhile(
    condition: js.Function2[/* item */ T, /* storage */ js.UndefOr[Any], Boolean],
    initial: String,
    after: String
  ): Array[T] = js.native
  def TakeWhile(
    condition: js.Function2[/* item */ T, /* storage */ js.UndefOr[Any], Boolean],
    initial: String,
    after: js.Function2[/* item */ T, /* storage */ Any, Unit]
  ): Array[T] = js.native
  def TakeWhile(
    condition: js.Function2[/* item */ T, /* storage */ js.UndefOr[Any], Boolean],
    initial: js.Function1[/* storage */ Any, Unit]
  ): Array[T] = js.native
  def TakeWhile(
    condition: js.Function2[/* item */ T, /* storage */ js.UndefOr[Any], Boolean],
    initial: js.Function1[/* storage */ Any, Unit],
    after: String
  ): Array[T] = js.native
  def TakeWhile(
    condition: js.Function2[/* item */ T, /* storage */ js.UndefOr[Any], Boolean],
    initial: js.Function1[/* storage */ Any, Unit],
    after: js.Function2[/* item */ T, /* storage */ Any, Unit]
  ): Array[T] = js.native
  def TakeWhile(
    condition: js.Function2[/* item */ T, /* storage */ js.UndefOr[Any], Boolean],
    initial: Unit,
    after: String
  ): Array[T] = js.native
  def TakeWhile(
    condition: js.Function2[/* item */ T, /* storage */ js.UndefOr[Any], Boolean],
    initial: Unit,
    after: js.Function2[/* item */ T, /* storage */ Any, Unit]
  ): Array[T] = js.native
  
  def ThenBy(valueSelector: String): Array[T] = js.native
  /**
    * Orders array by additional properties in ascending direction in combination with OrderBy/OrderByDescending
    * @param valueSelector The selector-function (or function-string) that selects the property for sorting
    */
  def ThenBy(valueSelector: js.Function1[/* item */ T, Any]): Array[T] = js.native
  
  def ThenByDescending(valueSelector: String): Array[T] = js.native
  /**
    * Orders array by additional properties in descending direction in combination with OrderBy/OrderByDescending
    * @param valueSelector The selector-function (or function-string) that selects the property for sorting
    */
  def ThenByDescending(valueSelector: js.Function1[/* item */ T, Any]): Array[T] = js.native
  
  def ToDictionary[Y](keySelector: String): StringDictionary[Y] & NumberDictionary[Y] = js.native
  def ToDictionary[Y](keySelector: String, valueSelector: String): StringDictionary[Y] & NumberDictionary[Y] = js.native
  def ToDictionary[Y](keySelector: String, valueSelector: js.Function1[/* item */ T, Y]): StringDictionary[Y] & NumberDictionary[Y] = js.native
  /**
    * Converts the array to a dictionary
    * @param keySelector The selector-function (or function-string) to select property for key
    * @param valueSelector A selector-function (or function-string) to select property for value
    */
  def ToDictionary[Y](keySelector: js.Function1[/* item */ T, String | Double]): StringDictionary[Y] & NumberDictionary[Y] = js.native
  def ToDictionary[Y](keySelector: js.Function1[/* item */ T, String | Double], valueSelector: String): StringDictionary[Y] & NumberDictionary[Y] = js.native
  def ToDictionary[Y](
    keySelector: js.Function1[/* item */ T, String | Double],
    valueSelector: js.Function1[/* item */ T, Y]
  ): StringDictionary[Y] & NumberDictionary[Y] = js.native
  
  /**
    * Combines two arrays without duplicates
    * @param array The array to combine
    */
  def Union(array: Array[T]): Array[T] = js.native
  
  /**
    * Updates an object in the array
    * @param object The object to update
    * @param primaryKeySelector A selector-function (or function-string) to define a property to indentify object in array
    */
  def Update(`object`: T): Array[T] = js.native
  def Update(`object`: T, primaryKeySelector: String): Array[T] = js.native
  def Update(`object`: T, primaryKeySelector: js.Function1[/* item */ T, Any]): Array[T] = js.native
  
  /**
    * Updates objects in the array
    * @param objects The array of objects to update
    * @param primaryKeySelector A selector-function (or function-string) to define a property to indentify object in array
    */
  def UpdateRange(objects: Array[T]): Array[T] = js.native
  def UpdateRange(objects: Array[T], primaryKeySelector: String): Array[T] = js.native
  def UpdateRange(objects: Array[T], primaryKeySelector: js.Function1[/* item */ T, Any]): Array[T] = js.native
  
  def Where(filter: String): Array[T] = js.native
  /**
    * Searches for all items in array that match the given filter
    * @param filter A function (or function-string) that returns a boolean when matching element was found
    */
  def Where(filter: js.Function2[/* item */ T, /* index */ js.UndefOr[Double], Boolean]): Array[T] = js.native
  
  def Zip[T, X, Y](array: Array[X], result: String): Array[Y] = js.native
  /**
    * Combines the entries of two arrays using a custom function
    * @param array The array to combine
    * @param result The function (or function-string) to combine elements
    */
  def Zip[T, X, Y](array: Array[X], result: js.Function2[/* first */ T, /* second */ X, Y]): Array[Y] = js.native
  
  var _linq4js_ : GroupValue = js.native
}
