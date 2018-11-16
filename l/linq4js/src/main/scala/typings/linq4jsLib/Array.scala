package typings
package linq4jsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Array[T] extends js.Object {
  var `_linq4js_`: Anon_GroupValue = js.native
  /**
       * Adds an object to the array
       * @param object The object to add
       * @param generateId Auto-generate a property to identify object in later processes
       */
  def Add(`object`: T): Array[T] = js.native
  /**
       * Adds an object to the array
       * @param object The object to add
       * @param generateId Auto-generate a property to identify object in later processes
       */
  def Add(`object`: T, generateId: scala.Boolean): Array[T] = js.native
  /**
       * Adds objects to the array
       * @param objects The array of objects to add
       */
  def AddRange(objects: Array[T]): Array[T] = js.native
  /**
       * Adds objects to the array
       * @param objects The array of objects to add
       */
  def AddRange(objects: Array[T], generateId: scala.Boolean): Array[T] = js.native
  /**
       * Combines the entries using a custom function
       * @param method A function (or function-string) for aggregation
       * @param startVal The value to start aggregation
       */
  def Aggregate(method: java.lang.String): java.lang.String = js.native
  /**
       * Combines the entries using a custom function
       * @param method A function (or function-string) for aggregation
       * @param startVal The value to start aggregation
       */
  def Aggregate(method: java.lang.String, startVal: js.Any): java.lang.String = js.native
  /**
       * Combines the entries using a custom function
       * @param method A function (or function-string) for aggregation
       * @param startVal The value to start aggregation
       */
  def Aggregate(method: js.Function2[/* result */ js.Any, /* item */ T, _]): java.lang.String = js.native
  /**
       * Combines the entries using a custom function
       * @param method A function (or function-string) for aggregation
       * @param startVal The value to start aggregation
       */
  def Aggregate(method: js.Function2[/* result */ js.Any, /* item */ T, _], startVal: js.Any): java.lang.String = js.native
  /**
       * Tests if all items in the array match the condition
       * @param filter A function (or function-string) that returns a boolean when matching element was found
       */
  def All(filter: java.lang.String): scala.Boolean = js.native
  /**
       * Tests if all items in the array match the condition
       * @param filter A function (or function-string) that returns a boolean when matching element was found
       */
  def All(filter: js.Function1[/* item */ T, scala.Boolean]): scala.Boolean = js.native
  /**
       * Tests if any item is in the array
       * @param filter If set the function tests if any item in the array matches the condition
       */
  def Any(): scala.Boolean = js.native
  /**
       * Tests if any item is in the array
       * @param filter If set the function tests if any item in the array matches the condition
       */
  def Any(filter: java.lang.String): scala.Boolean = js.native
  /**
       * Tests if any item is in the array
       * @param filter If set the function tests if any item in the array matches the condition
       */
  def Any(filter: js.Function1[/* item */ T, scala.Boolean]): scala.Boolean = js.native
  /**
       * Computes the average of the elements
       * @param selector A selector-function (or function-string) to select property for average computing
       * @param filter If set the function computes the average of elements that match the filter
       */
  def Average(): scala.Double = js.native
  /**
       * Computes the average of the elements
       * @param selector A selector-function (or function-string) to select property for average computing
       * @param filter If set the function computes the average of elements that match the filter
       */
  def Average(selector: java.lang.String): scala.Double = js.native
  /**
       * Computes the average of the elements
       * @param selector A selector-function (or function-string) to select property for average computing
       * @param filter If set the function computes the average of elements that match the filter
       */
  def Average(selector: java.lang.String, filter: java.lang.String): scala.Double = js.native
  /**
       * Computes the average of the elements
       * @param selector A selector-function (or function-string) to select property for average computing
       * @param filter If set the function computes the average of elements that match the filter
       */
  def Average(selector: java.lang.String, filter: js.Function1[/* item */ T, scala.Boolean]): scala.Double = js.native
  /**
       * Computes the average of the elements
       * @param selector A selector-function (or function-string) to select property for average computing
       * @param filter If set the function computes the average of elements that match the filter
       */
  def Average(selector: js.Function1[/* item */ T, _]): scala.Double = js.native
  /**
       * Computes the average of the elements
       * @param selector A selector-function (or function-string) to select property for average computing
       * @param filter If set the function computes the average of elements that match the filter
       */
  def Average(selector: js.Function1[/* item */ T, _], filter: java.lang.String): scala.Double = js.native
  /**
       * Computes the average of the elements
       * @param selector A selector-function (or function-string) to select property for average computing
       * @param filter If set the function computes the average of elements that match the filter
       */
  def Average(selector: js.Function1[/* item */ T, _], filter: js.Function1[/* item */ T, scala.Boolean]): scala.Double = js.native
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
  def Contains(`object`: T): scala.Boolean = js.native
  /**
       * Returns the length of the array
       * @param filter If set the function returns count of elements matched by the condition
       */
  def Count(): scala.Double = js.native
  /**
       * Returns the length of the array
       * @param filter If set the function returns count of elements matched by the condition
       */
  def Count(filter: java.lang.String): scala.Double = js.native
  /**
       * Returns the length of the array
       * @param filter If set the function returns count of elements matched by the condition
       */
  def Count(filter: js.Function1[/* item */ T, scala.Boolean]): scala.Double = js.native
  /**
       * Makes all values unique
       * @param valueSelector A selector-function (or function-string) to select property for comparison and distinction
       */
  def Distinct(): Array[T] = js.native
  /**
       * Makes all values unique
       * @param valueSelector A selector-function (or function-string) to select property for comparison and distinction
       */
  def Distinct(valueSelector: java.lang.String): Array[T] = js.native
  /**
       * Makes all values unique
       * @param valueSelector A selector-function (or function-string) to select property for comparison and distinction
       */
  def Distinct(valueSelector: js.Function1[/* item */ T, _]): Array[T] = js.native
  /**
       * Executes actions defined in the command-string
       * @param command The command-string for execution
       */
  def Evaluate(command: java.lang.String): js.Any = js.native
  /**
       * Gets the index of the first item found by a filter
       * @param filter A function (or function-string) that returns a boolean when matching element was found
       */
  def FindIndex(filter: java.lang.String): scala.Double = js.native
  /**
       * Gets the index of the first item found by a filter
       * @param filter A function (or function-string) that returns a boolean when matching element was found
       */
  def FindIndex(filter: js.Function1[/* item */ T, scala.Boolean]): scala.Double = js.native
  /**
       * Gets the index of the last item found by a filter
       * @param filter A function (or function-string) that returns a boolean when matching element was found
       */
  def FindLastIndex(filter: java.lang.String): scala.Double = js.native
  /**
       * Gets the index of the last item found by a filter
       * @param filter A function (or function-string) that returns a boolean when matching element was found
       */
  def FindLastIndex(filter: js.Function1[/* item */ T, scala.Boolean]): scala.Double = js.native
  /**
       * Returns the first item of the array - Throws an exception if no item was found
       * @param filter If set the function returns the first item that matches the filter
       */
  def First(): T = js.native
  /**
       * Returns the first item of the array - Throws an exception if no item was found
       * @param filter If set the function returns the first item that matches the filter
       */
  def First(filter: java.lang.String): T = js.native
  /**
       * Returns the first item of the array - Throws an exception if no item was found
       * @param filter If set the function returns the first item that matches the filter
       */
  def First(filter: js.Function1[/* item */ T, scala.Boolean]): T = js.native
  /**
       * Returns the first item of the array - returns `null` if no suitable item was found
       * @param filter If set the function returns the first item that matches the filter
       */
  def FirstOrDefault(): T | scala.Null = js.native
  /**
       * Returns the first item of the array - returns `null` if no suitable item was found
       * @param filter If set the function returns the first item that matches the filter
       */
  def FirstOrDefault(filter: java.lang.String): T | scala.Null = js.native
  /**
       * Returns the first item of the array - returns `null` if no suitable item was found
       * @param filter If set the function returns the first item that matches the filter
       */
  def FirstOrDefault(filter: js.Function1[/* item */ T, scala.Boolean]): T | scala.Null = js.native
  /**
       * Executes a method for each item in the array
       * @param action A function (or function-string) that gets executed for each element. If it returns false the loop stops.
       */
  def ForEach(action: java.lang.String): Array[T] = js.native
  /**
       * Executes a method for each item in the array
       * @param action A function (or function-string) that gets executed for each element. If it returns false the loop stops.
       */
  def ForEach(action: js.Function2[/* item */ T, /* index */ js.UndefOr[scala.Double], scala.Boolean | _]): Array[T] = js.native
  /**
       * Gets the item with the index
       * @param index Item index
       */
  def Get(index: scala.Double): T = js.native
  /**
       * Groups array by property
       * @param selector The selector-function (or function-string) that selects the property for grouping
       */
  def GroupBy(selector: java.lang.String): Array[Array[T]] = js.native
  /**
       * Groups array by property
       * @param selector The selector-function (or function-string) that selects the property for grouping
       */
  def GroupBy(selector: js.Function1[/* item */ T, _]): Array[Array[T]] = js.native
  /**
       * Inserts an entry at a specific position
       * @param object The object to insert
       * @param index The position to insert
       */
  def Insert(`object`: T, index: scala.Double): Array[T] = js.native
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
  def Join(character: java.lang.String): java.lang.String = js.native
  /**
       * Joins the entries by a given char
       * @param character The character for joining
       * @param selector A selector-function (or function-string) to select property for joining
       */
  def Join(character: java.lang.String, selector: java.lang.String): java.lang.String = js.native
  /**
       * Joins the entries by a given char
       * @param character The character for joining
       * @param selector A selector-function (or function-string) to select property for joining
       */
  def Join(character: java.lang.String, selector: js.Function1[/* item */ T, _]): java.lang.String = js.native
  /**
       * Returns the last item of the array - Throws an exception if no item was found
       * @param filter If set the function returns the last item that matches the filter
       */
  def Last(): T = js.native
  /**
       * Returns the last item of the array - Throws an exception if no item was found
       * @param filter If set the function returns the last item that matches the filter
       */
  def Last(filter: java.lang.String): T = js.native
  /**
       * Returns the last item of the array - Throws an exception if no item was found
       * @param filter If set the function returns the last item that matches the filter
       */
  def Last(filter: js.Function1[/* item */ T, scala.Boolean]): T = js.native
  /**
       * Returns the last item of the array - returns `null` if no suitable item was found
       * @param filter If set the function returns the last item that matches the filter
       */
  def LastOrDefault(): T | scala.Null = js.native
  /**
       * Returns the last item of the array - returns `null` if no suitable item was found
       * @param filter If set the function returns the last item that matches the filter
       */
  def LastOrDefault(filter: java.lang.String): T | scala.Null = js.native
  /**
       * Returns the last item of the array - returns `null` if no suitable item was found
       * @param filter If set the function returns the last item that matches the filter
       */
  def LastOrDefault(filter: js.Function1[/* item */ T, scala.Boolean]): T | scala.Null = js.native
  /**
       * Returns the greates element in array
       * @param valueSelector The selector-function (or function-string) that selects the property for comparison
       */
  def Max(): T | scala.Null = js.native
  /**
       * Returns the greates element in array
       * @param valueSelector The selector-function (or function-string) that selects the property for comparison
       */
  def Max(valueSelector: java.lang.String): T | scala.Null = js.native
  /**
       * Returns the greates element in array
       * @param valueSelector The selector-function (or function-string) that selects the property for comparison
       */
  def Max(valueSelector: js.Function1[/* item */ T, _]): T | scala.Null = js.native
  /**
       * Returns the smallest element in array
       * @param valueSelector The selector-function (or function-string) that selects the property for comparison
       */
  def Min(): T | scala.Null = js.native
  /**
       * Returns the smallest element in array
       * @param valueSelector The selector-function (or function-string) that selects the property for comparison
       */
  def Min(valueSelector: java.lang.String): T | scala.Null = js.native
  /**
       * Returns the smallest element in array
       * @param valueSelector The selector-function (or function-string) that selects the property for comparison
       */
  def Min(valueSelector: js.Function1[/* item */ T, _]): T | scala.Null = js.native
  /**
       * Moves an item from one index to another
       * @param oldIndex The current position of the item
       * @param newIndex The new position of the item
       */
  def Move(oldIndex: scala.Double, newIndex: scala.Double): Array[T] = js.native
  /**
       * Orders array by property or value in ascending direction
       * @param valueSelector The selector-function (or function-string) that selects the property for sorting
       */
  def OrderBy(valueSelector: java.lang.String): Array[T] = js.native
  /**
       * Orders array by property or value in ascending direction
       * @param valueSelector The selector-function (or function-string) that selects the property for sorting
       */
  def OrderBy(valueSelector: js.Function1[/* item */ T, _]): Array[T] = js.native
  /**
       * Orders array by property or value in descending direction
       * @param valueSelector The selector-function (or function-string) that selects the property for sorting
       */
  def OrderByDescending(valueSelector: java.lang.String): Array[T] = js.native
  /**
       * Orders array by property or value in descending direction
       * @param valueSelector The selector-function (or function-string) that selects the property for sorting
       */
  def OrderByDescending(valueSelector: js.Function1[/* item */ T, _]): Array[T] = js.native
  /**
       * Takes items in a specific range
       * @param start The start position
       * @param length The number of elements to take
       */
  def Range(start: scala.Double, length: scala.Double): Array[T] = js.native
  /**
       * Removes an object from the array
       * @param object The object to remove
       * @param primaryKeySelector A selector-function (or function-string) to define a property to indentify object in array
       */
  def Remove(`object`: T): Array[T] = js.native
  /**
       * Removes an object from the array
       * @param object The object to remove
       * @param primaryKeySelector A selector-function (or function-string) to define a property to indentify object in array
       */
  def Remove(`object`: T, primaryKeySelector: java.lang.String): Array[T] = js.native
  /**
       * Removes an object from the array
       * @param object The object to remove
       * @param primaryKeySelector A selector-function (or function-string) to define a property to indentify object in array
       */
  def Remove(`object`: T, primaryKeySelector: js.Function1[/* item */ T, _]): Array[T] = js.native
  /**
       * Removes objects from the array
       * @param objects The array of objects to remove
       * @param primaryKeySelector A selector-function (or function-string) to define a property to indentify object in array
       */
  def RemoveRange(objects: Array[T]): Array[T] = js.native
  /**
       * Removes objects from the array
       * @param objects The array of objects to remove
       * @param primaryKeySelector A selector-function (or function-string) to define a property to indentify object in array
       */
  def RemoveRange(objects: Array[T], primaryKeySelector: java.lang.String): Array[T] = js.native
  /**
       * Removes objects from the array
       * @param objects The array of objects to remove
       * @param primaryKeySelector A selector-function (or function-string) to define a property to indentify object in array
       */
  def RemoveRange(objects: Array[T], primaryKeySelector: js.Function1[/* item */ T, _]): Array[T] = js.native
  /**
       * Repeats an object in the array
       * @param object The object to repeat
       * @param count The count of repeats
       */
  def Repeat(`object`: T, count: scala.Double): Array[T] = js.native
  /**
       * Reverses the array
       */
  def Reverse(): Array[T] = js.native
  /**
       * Select the properties for a new array
       * @param selector A function (or a function-string) that returns a new object
       */
  def Select(selector: java.lang.String): Array[_] = js.native
  /**
       * Select the properties for a new array
       * @param selector A function (or a function-string) that returns a new object
       */
  def Select(selector: js.Function1[/* item */ T, _]): Array[_] = js.native
  /**
       * Select the properties with an array as value and concats them
       * @param selector A function (or a function-string) that returns the array with elements to select
       */
  def SelectMany(selector: java.lang.String): Array[_] = js.native
  /**
       * Select the properties with an array as value and concats them
       * @param selector A function (or a function-string) that returns the array with elements to select
       */
  def SelectMany(selector: js.Function1[/* item */ T, _]): Array[_] = js.native
  /**
       * Compares to sequences of objects
       * @param array The array to compare
       */
  def SequenceEqual(array: Array[T]): scala.Boolean = js.native
  /**
       * Returns the only item of the array - Throws an exception if not exactly one item is in array
       * @param filter If set the function returns the only item that matches the filter
       */
  def Single(): T = js.native
  /**
       * Returns the only item of the array - Throws an exception if not exactly one item is in array
       * @param filter If set the function returns the only item that matches the filter
       */
  def Single(filter: java.lang.String): T = js.native
  /**
       * Returns the only item of the array - Throws an exception if not exactly one item is in array
       * @param filter If set the function returns the only item that matches the filter
       */
  def Single(filter: js.Function1[/* item */ T, scala.Boolean]): T = js.native
  /**
       * Returns the only item of the array - Throws an exception if not only one item is in array
       * @param filter If set the function returns the only item that matches the filter
       */
  def SingleOrDefault(): T | scala.Null = js.native
  /**
       * Returns the only item of the array - Throws an exception if not only one item is in array
       * @param filter If set the function returns the only item that matches the filter
       */
  def SingleOrDefault(filter: java.lang.String): T | scala.Null = js.native
  /**
       * Returns the only item of the array - Throws an exception if not only one item is in array
       * @param filter If set the function returns the only item that matches the filter
       */
  def SingleOrDefault(filter: js.Function1[/* item */ T, scala.Boolean]): T | scala.Null = js.native
  /**
       * Skips entries
       * @param count The count of elements skipped
       */
  def Skip(count: scala.Double): Array[T] = js.native
  /**
       * Computes the sum of the elements
       * @param selector A selector-function (or function-string) to select property for adding
       * @param filter If set the function computes the sum of elements that match the filter
       */
  def Sum(): scala.Double = js.native
  /**
       * Computes the sum of the elements
       * @param selector A selector-function (or function-string) to select property for adding
       * @param filter If set the function computes the sum of elements that match the filter
       */
  def Sum(selector: java.lang.String): scala.Double = js.native
  /**
       * Computes the sum of the elements
       * @param selector A selector-function (or function-string) to select property for adding
       * @param filter If set the function computes the sum of elements that match the filter
       */
  def Sum(selector: java.lang.String, filter: java.lang.String): scala.Double = js.native
  /**
       * Computes the sum of the elements
       * @param selector A selector-function (or function-string) to select property for adding
       * @param filter If set the function computes the sum of elements that match the filter
       */
  def Sum(selector: java.lang.String, filter: js.Function1[/* item */ T, scala.Boolean]): scala.Double = js.native
  /**
       * Computes the sum of the elements
       * @param selector A selector-function (or function-string) to select property for adding
       * @param filter If set the function computes the sum of elements that match the filter
       */
  def Sum(selector: js.Function1[/* item */ T, _]): scala.Double = js.native
  /**
       * Computes the sum of the elements
       * @param selector A selector-function (or function-string) to select property for adding
       * @param filter If set the function computes the sum of elements that match the filter
       */
  def Sum(selector: js.Function1[/* item */ T, _], filter: java.lang.String): scala.Double = js.native
  /**
       * Computes the sum of the elements
       * @param selector A selector-function (or function-string) to select property for adding
       * @param filter If set the function computes the sum of elements that match the filter
       */
  def Sum(selector: js.Function1[/* item */ T, _], filter: js.Function1[/* item */ T, scala.Boolean]): scala.Double = js.native
  /**
       * Limits the number of entries taken
       * @param count The count of elements taken
       */
  def Take(count: scala.Double): Array[T] = js.native
  /**
       * Takes entries as long as a condition is true
       * @param condition The condition-function (or function-string) that returns a boolean. All elements until a false gets thrown are taken
       * @param initial A initial-function (or function-string) that gets executed once at the start of the loop
       * @param after A function that gets executed after every element-iteration after the condition-function was evaluated
       */
  def TakeWhile(condition: java.lang.String): Array[T] = js.native
  /**
       * Takes entries as long as a condition is true
       * @param condition The condition-function (or function-string) that returns a boolean. All elements until a false gets thrown are taken
       * @param initial A initial-function (or function-string) that gets executed once at the start of the loop
       * @param after A function that gets executed after every element-iteration after the condition-function was evaluated
       */
  def TakeWhile(condition: java.lang.String, initial: java.lang.String): Array[T] = js.native
  /**
       * Takes entries as long as a condition is true
       * @param condition The condition-function (or function-string) that returns a boolean. All elements until a false gets thrown are taken
       * @param initial A initial-function (or function-string) that gets executed once at the start of the loop
       * @param after A function that gets executed after every element-iteration after the condition-function was evaluated
       */
  def TakeWhile(condition: java.lang.String, initial: java.lang.String, after: java.lang.String): Array[T] = js.native
  /**
       * Takes entries as long as a condition is true
       * @param condition The condition-function (or function-string) that returns a boolean. All elements until a false gets thrown are taken
       * @param initial A initial-function (or function-string) that gets executed once at the start of the loop
       * @param after A function that gets executed after every element-iteration after the condition-function was evaluated
       */
  def TakeWhile(
    condition: java.lang.String,
    initial: java.lang.String,
    after: js.Function2[/* item */ T, /* storage */ js.Any, scala.Unit]
  ): Array[T] = js.native
  /**
       * Takes entries as long as a condition is true
       * @param condition The condition-function (or function-string) that returns a boolean. All elements until a false gets thrown are taken
       * @param initial A initial-function (or function-string) that gets executed once at the start of the loop
       * @param after A function that gets executed after every element-iteration after the condition-function was evaluated
       */
  def TakeWhile(condition: java.lang.String, initial: js.Function1[/* storage */ js.Any, scala.Unit]): Array[T] = js.native
  /**
       * Takes entries as long as a condition is true
       * @param condition The condition-function (or function-string) that returns a boolean. All elements until a false gets thrown are taken
       * @param initial A initial-function (or function-string) that gets executed once at the start of the loop
       * @param after A function that gets executed after every element-iteration after the condition-function was evaluated
       */
  def TakeWhile(
    condition: java.lang.String,
    initial: js.Function1[/* storage */ js.Any, scala.Unit],
    after: java.lang.String
  ): Array[T] = js.native
  /**
       * Takes entries as long as a condition is true
       * @param condition The condition-function (or function-string) that returns a boolean. All elements until a false gets thrown are taken
       * @param initial A initial-function (or function-string) that gets executed once at the start of the loop
       * @param after A function that gets executed after every element-iteration after the condition-function was evaluated
       */
  def TakeWhile(
    condition: java.lang.String,
    initial: js.Function1[/* storage */ js.Any, scala.Unit],
    after: js.Function2[/* item */ T, /* storage */ js.Any, scala.Unit]
  ): Array[T] = js.native
  /**
       * Takes entries as long as a condition is true
       * @param condition The condition-function (or function-string) that returns a boolean. All elements until a false gets thrown are taken
       * @param initial A initial-function (or function-string) that gets executed once at the start of the loop
       * @param after A function that gets executed after every element-iteration after the condition-function was evaluated
       */
  def TakeWhile(condition: js.Function2[/* item */ T, /* storage */ js.UndefOr[js.Any], scala.Boolean]): Array[T] = js.native
  /**
       * Takes entries as long as a condition is true
       * @param condition The condition-function (or function-string) that returns a boolean. All elements until a false gets thrown are taken
       * @param initial A initial-function (or function-string) that gets executed once at the start of the loop
       * @param after A function that gets executed after every element-iteration after the condition-function was evaluated
       */
  def TakeWhile(
    condition: js.Function2[/* item */ T, /* storage */ js.UndefOr[js.Any], scala.Boolean],
    initial: java.lang.String
  ): Array[T] = js.native
  /**
       * Takes entries as long as a condition is true
       * @param condition The condition-function (or function-string) that returns a boolean. All elements until a false gets thrown are taken
       * @param initial A initial-function (or function-string) that gets executed once at the start of the loop
       * @param after A function that gets executed after every element-iteration after the condition-function was evaluated
       */
  def TakeWhile(
    condition: js.Function2[/* item */ T, /* storage */ js.UndefOr[js.Any], scala.Boolean],
    initial: java.lang.String,
    after: java.lang.String
  ): Array[T] = js.native
  /**
       * Takes entries as long as a condition is true
       * @param condition The condition-function (or function-string) that returns a boolean. All elements until a false gets thrown are taken
       * @param initial A initial-function (or function-string) that gets executed once at the start of the loop
       * @param after A function that gets executed after every element-iteration after the condition-function was evaluated
       */
  def TakeWhile(
    condition: js.Function2[/* item */ T, /* storage */ js.UndefOr[js.Any], scala.Boolean],
    initial: java.lang.String,
    after: js.Function2[/* item */ T, /* storage */ js.Any, scala.Unit]
  ): Array[T] = js.native
  /**
       * Takes entries as long as a condition is true
       * @param condition The condition-function (or function-string) that returns a boolean. All elements until a false gets thrown are taken
       * @param initial A initial-function (or function-string) that gets executed once at the start of the loop
       * @param after A function that gets executed after every element-iteration after the condition-function was evaluated
       */
  def TakeWhile(
    condition: js.Function2[/* item */ T, /* storage */ js.UndefOr[js.Any], scala.Boolean],
    initial: js.Function1[/* storage */ js.Any, scala.Unit]
  ): Array[T] = js.native
  /**
       * Takes entries as long as a condition is true
       * @param condition The condition-function (or function-string) that returns a boolean. All elements until a false gets thrown are taken
       * @param initial A initial-function (or function-string) that gets executed once at the start of the loop
       * @param after A function that gets executed after every element-iteration after the condition-function was evaluated
       */
  def TakeWhile(
    condition: js.Function2[/* item */ T, /* storage */ js.UndefOr[js.Any], scala.Boolean],
    initial: js.Function1[/* storage */ js.Any, scala.Unit],
    after: java.lang.String
  ): Array[T] = js.native
  /**
       * Takes entries as long as a condition is true
       * @param condition The condition-function (or function-string) that returns a boolean. All elements until a false gets thrown are taken
       * @param initial A initial-function (or function-string) that gets executed once at the start of the loop
       * @param after A function that gets executed after every element-iteration after the condition-function was evaluated
       */
  def TakeWhile(
    condition: js.Function2[/* item */ T, /* storage */ js.UndefOr[js.Any], scala.Boolean],
    initial: js.Function1[/* storage */ js.Any, scala.Unit],
    after: js.Function2[/* item */ T, /* storage */ js.Any, scala.Unit]
  ): Array[T] = js.native
  /**
       * Orders array by additional properties in ascending direction in combination with OrderBy/OrderByDescending
       * @param valueSelector The selector-function (or function-string) that selects the property for sorting
       */
  def ThenBy(valueSelector: java.lang.String): Array[T] = js.native
  /**
       * Orders array by additional properties in ascending direction in combination with OrderBy/OrderByDescending
       * @param valueSelector The selector-function (or function-string) that selects the property for sorting
       */
  def ThenBy(valueSelector: js.Function1[/* item */ T, _]): Array[T] = js.native
  /**
       * Orders array by additional properties in descending direction in combination with OrderBy/OrderByDescending
       * @param valueSelector The selector-function (or function-string) that selects the property for sorting
       */
  def ThenByDescending(valueSelector: java.lang.String): Array[T] = js.native
  /**
       * Orders array by additional properties in descending direction in combination with OrderBy/OrderByDescending
       * @param valueSelector The selector-function (or function-string) that selects the property for sorting
       */
  def ThenByDescending(valueSelector: js.Function1[/* item */ T, _]): Array[T] = js.native
  /**
       * Converts the array to a dictionary
       * @param keySelector The selector-function (or function-string) to select property for key
       * @param valueSelector A selector-function (or function-string) to select property for value
       */
  def ToDictionary(keySelector: java.lang.String): js.Any = js.native
  /**
       * Converts the array to a dictionary
       * @param keySelector The selector-function (or function-string) to select property for key
       * @param valueSelector A selector-function (or function-string) to select property for value
       */
  def ToDictionary(keySelector: java.lang.String, valueSelector: java.lang.String): js.Any = js.native
  /**
       * Converts the array to a dictionary
       * @param keySelector The selector-function (or function-string) to select property for key
       * @param valueSelector A selector-function (or function-string) to select property for value
       */
  def ToDictionary(keySelector: java.lang.String, valueSelector: js.Function1[/* item */ T, _]): js.Any = js.native
  /**
       * Converts the array to a dictionary
       * @param keySelector The selector-function (or function-string) to select property for key
       * @param valueSelector A selector-function (or function-string) to select property for value
       */
  def ToDictionary(keySelector: js.Function1[/* item */ T, _]): js.Any = js.native
  /**
       * Converts the array to a dictionary
       * @param keySelector The selector-function (or function-string) to select property for key
       * @param valueSelector A selector-function (or function-string) to select property for value
       */
  def ToDictionary(keySelector: js.Function1[/* item */ T, _], valueSelector: java.lang.String): js.Any = js.native
  /**
       * Converts the array to a dictionary
       * @param keySelector The selector-function (or function-string) to select property for key
       * @param valueSelector A selector-function (or function-string) to select property for value
       */
  def ToDictionary(keySelector: js.Function1[/* item */ T, _], valueSelector: js.Function1[/* item */ T, _]): js.Any = js.native
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
  /**
       * Updates an object in the array
       * @param object The object to update
       * @param primaryKeySelector A selector-function (or function-string) to define a property to indentify object in array
       */
  def Update(`object`: T, primaryKeySelector: java.lang.String): Array[T] = js.native
  /**
       * Updates an object in the array
       * @param object The object to update
       * @param primaryKeySelector A selector-function (or function-string) to define a property to indentify object in array
       */
  def Update(`object`: T, primaryKeySelector: js.Function1[/* item */ T, _]): Array[T] = js.native
  /**
       * Updates objects in the array
       * @param objects The array of objects to update
       * @param primaryKeySelector A selector-function (or function-string) to define a property to indentify object in array
       */
  def UpdateRange(objects: Array[T]): Array[T] = js.native
  /**
       * Updates objects in the array
       * @param objects The array of objects to update
       * @param primaryKeySelector A selector-function (or function-string) to define a property to indentify object in array
       */
  def UpdateRange(objects: Array[T], primaryKeySelector: java.lang.String): Array[T] = js.native
  /**
       * Updates objects in the array
       * @param objects The array of objects to update
       * @param primaryKeySelector A selector-function (or function-string) to define a property to indentify object in array
       */
  def UpdateRange(objects: Array[T], primaryKeySelector: js.Function1[/* item */ T, _]): Array[T] = js.native
  /**
       * Searches for all items in array that match the given filter
       * @param filter A function (or function-string) that returns a boolean when matching element was found
       */
  def Where(filter: java.lang.String): Array[T] = js.native
  /**
       * Searches for all items in array that match the given filter
       * @param filter A function (or function-string) that returns a boolean when matching element was found
       */
  def Where(filter: js.Function2[/* item */ T, /* index */ js.UndefOr[scala.Double], scala.Boolean]): Array[T] = js.native
  /**
       * Combines the entries of two arrays using a custom function
       * @param array The array to combine
       * @param result The function (or function-string) to combine elements
       */
  def Zip[T, X](array: Array[X], result: java.lang.String): Array[_] = js.native
  /**
       * Combines the entries of two arrays using a custom function
       * @param array The array to combine
       * @param result The function (or function-string) to combine elements
       */
  def Zip[T, X](array: Array[X], result: js.Function2[/* first */ T, /* second */ X, _]): Array[_] = js.native
}

