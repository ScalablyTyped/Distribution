package typings.jfp

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("jfp", JSImport.Namespace)
  @js.native
  val ^ : JfpStatic = js.native
  
  trait JfpCurriedOutput[T] extends StObject
  
  //Array functions
  //Conditional functions
  // Predicate functions
  // Composite functions
  @js.native
  trait JfpStatic extends StObject {
    
    /**
      * jfp supports string function aliasing -- alias is a jfp function name and seeking behavior
      * will happen against the jfp object only.
      */
    def apply(alias: String, args: js.Any*): JfpCurriedOutput[js.Any] = js.native
    def apply(externalFunction: js.Function1[/* repeated */ js.Any, js.Any], args: js.Any*): JfpCurriedOutput[js.Any] = js.native
    
    /**
      * Adds two numbers
      */
    def add(a: Double, b: Double): Double = js.native
    
    /**
      * Returns function which returns provided value
      * Signature: (any) -> () -> any
      * @param value Value to return from produced function
      */
    def always(value: js.Any): js.Function1[/* repeated */ js.Any, js.Any] = js.native
    
    /**
      * Performs a conjunction (and) operation on two or more booleans
      */
    def and(a: Boolean, b: Boolean, args: Boolean*): Boolean = js.native
    
    /**
      * Applies an array of values to a function
      * @param userFn Function to perform application against
      * @param values Array of arguments for function
      */
    @JSName("apply")
    def apply(userFn: js.Function1[/* repeated */ js.Any, js.Any], values: js.Array[js.Any]): Unit = js.native
    
    /**
      * Checks if number is between two values
      */
    def between(bounds: js.Array[Double], value: Double): Boolean = js.native
    
    /**
      * Clones values to an optional depth
      */
    def clone(value: js.Any): js.Any = js.native
    def clone(value: js.Any, depth: Double): js.Any = js.native
    
    /**
      * Removes falsey values from an array
      * @param values The array to compact
      */
    def compact(values: js.Array[js.Any]): js.Array[js.Any] = js.native
    
    /**
      * Composes a set of functions into a new single function
      * @param ...args Arguments for compose
      */
    def compose(args: (js.Function1[/* repeated */ js.Any, js.Any])*): js.Function1[/* repeated */ js.Any, js.Any] = js.native
    
    /**
      * Creates composite predicate which performs each check on a value and then conjoins the result
      */
    def composePredicate(args: (js.Function1[/* repeated */ js.Any, Boolean])*): js.Function1[/* repeated */ js.Any, Boolean] = js.native
    
    /**
      * Clones and concatenates two arrays
      * @param values1 The array to concatenate to
      * @param values2 The array to concatenate with
      */
    def concat(values1: js.Array[js.Any], values2: js.Array[js.Any]): js.Array[js.Any] = js.native
    
    /**
      * Appends value to clone of destination array
      * @param value The value to add to the end of an array
      * @param destination The array to be cloned and appended to
      */
    def conj(value: js.Any, destination: js.Array[js.Any]): js.Array[js.Any] = js.native
    
    /**
      * Prepends value to clone of destination array
      * @param value The value to add to the beginning of an array
      * @param destination The array to be cloned and prepended to
      */
    def cons(value: js.Any, destination: js.Array[js.Any]): js.Array[js.Any] = js.native
    
    /**
      * Returns true if array contains provided value, else false
      */
    def contains(value: js.Any, list: js.Array[js.Any]): Boolean = js.native
    
    /**
      * Returns a copy of passed array
      */
    def copyArray(list: js.Array[js.Any]): js.Array[js.Any] = js.native
    
    /**
      * Counts the number of arguments in a function declaration
      * @param userFn Function to count arguments of
      */
    def countArguments(userFn: js.Function1[/* repeated */ js.Any, js.Any]): Double = js.native
    
    def curry(userFn: js.Function1[/* repeated */ js.Any, js.Any]): js.Any = js.native
    def curry(userFn: js.Function1[/* repeated */ js.Any, js.Any], args: js.Any*): js.Any = js.native
    /**
      * Curries function until all arguments are satisfied
      * @param userFn Function to curry
      * @param ...argments Initial arguments for currying application
      */
    @JSName("curry")
    def curry_Function1(userFn: js.Function1[/* repeated */ js.Any, js.Any]): js.Function1[/* repeated */ js.Any, js.Any] = js.native
    @JSName("curry")
    def curry_Function1(userFn: js.Function1[/* repeated */ js.Any, js.Any], args: js.Any*): js.Function1[/* repeated */ js.Any, js.Any] = js.native
    
    /**
      * Traverses object tree and retrieves dot-delimited key or returns null
      */
    def deref(key: String, dataset: js.Object): js.Any = js.native
    
    /**
      * Takes the difference of sets A and B where the difference is A - B
      */
    def difference(lista: js.Array[js.Any], listb: js.Array[js.Any]): js.Array[js.Any] = js.native
    
    /**
      * Divides first number by second
      */
    def divide(numerator: Double, denominator: Double): Double = js.native
    
    /**
      * Drops value at specified index from clone of array
      * @param index Index to perform drop at
      * @param values Array to remove value from
      */
    def drop(index: Double, values: js.Array[js.Any]): js.Array[js.Any] = js.native
    
    /**
      * Drops first element from clone of values array
      * @param values Array to drop first value of
      */
    def dropFirst(values: js.Array[js.Any]): js.Array[js.Any] = js.native
    
    /**
      * Drops last element from clone of values array
      * @param values Array to drop last value from
      */
    def dropLast(values: js.Array[js.Any]): js.Array[js.Any] = js.native
    
    /**
      * Drops values from array until predicate is satisfied
      */
    def dropUntil(predicate: js.Function1[/* repeated */ js.Any, Boolean], list: js.Array[js.Any]): js.Array[js.Any] = js.native
    
    /**
      * Performs iterable function on each value of provided array
      * @param iterable Function to perform on each value of array
      * @param values Array to operate on
      */
    def each(iteratable: js.Function1[/* value */ js.Any, Unit], values: js.Array[js.Any]): js.Array[js.Any] = js.native
    
    /**
      * Returns preferred value if truthy, otherwise returns default value
      * @param defaultValue Default value
      * @param preferredValue Preferred value
      */
    def either(defaultValue: js.Any, preferredValue: js.Any): js.Any = js.native
    /**
      * Returns provided value if truthy or matches datatype, otherwise returns default value
      * @param defaultValue Default value
      * @param preferredValue Preferred value
      * @param datatype Type preferred value should be
      */
    def either(defaultValue: js.Any, preferredValue: js.Any, datatype: String): js.Any = js.native
    
    /**
      * Returns preferred value if truthy, otherwise returns default value
      * @param defaultValue Default value
      * @param preferredValue Preferred value
      * @param predicateValue Boolean switch to return default or preferred value
      */
    def eitherIf(defaultValue: js.Any, preferredValue: js.Any, predicateValue: Boolean): js.Any = js.native
    
    /**
      * Returns either typed value based on type parameter
      */
    def eitherType(`type`: String, defaultValue: js.Any, value: js.Any): js.Any = js.native
    
    /**
      * Returns provided value if truthy, otherwise returns default value
      * @param defaultValue Default value
      * @param preferredValue Preferred value
      * @param predicate Predicate function preferred value is tested against
      */
    def eitherWhen(defaultValue: js.Any, preferredValue: js.Any, predicate: js.Function1[/* value */ js.Any, Boolean]): js.Any = js.native
    
    /**
      * Checks value equality of two arguments
      * @param valuea
      * @param valueb
      */
    def equal(valuea: js.Any, valueb: js.Any): Boolean = js.native
    
    /**
      * Checks if every value in an array passes a predicate
      */
    def every(predicate: js.Function1[/* value */ js.Any, Boolean], list: js.Array[js.Any]): Boolean = js.native
    
    /**
      * Executes passed function
      * @param userFn
      */
    def execute(userFn: js.Function1[/* repeated */ js.Any, js.Any]): js.Any = js.native
    
    /**
      * Takes the factorial of passed number
      */
    def fac(n: Double): Double = js.native
    
    /**
      * Filters all values not passing provided predicate
      * @param predicate Function which performs a boolean resultant operation on a value of the array
      * @param values Array to filter
      */
    def filter(predicate: js.Function1[/* value */ js.Any, Boolean], values: js.Array[js.Any]): js.Array[js.Any] = js.native
    
    /**
      * Finds the first value in an array that satisfies provided predicate
      * @param predicate Function which performs a boolean resultant operation on a value of the array
      * @param values Array to run predicate against
      */
    def find(predicate: js.Function1[/* value */ js.Any, Boolean], values: js.Array[js.Any]): js.Any = js.native
    
    /**
      * Returns the first value in an array
      * @param values Array of values
      */
    def first(values: js.Array[js.Any]): js.Any = js.native
    
    /**
      * Checks if a is greater or equal to b
      */
    def geq(a: Double, b: Double): Boolean = js.native
    
    /**
      * Gets object keys
      */
    def getKeys(dataset: js.Object): js.Array[String] = js.native
    
    /**
      * Gets type of passed value
      * @param value
      */
    def getType(value: js.Any): String = js.native
    
    /**
      * Checks if a is greater than b
      */
    def greater(a: Double, b: Double): Boolean = js.native
    
    /**
      * Checks that passed value is an array which contains a first value
      */
    def hasFirst(value: js.Any): Boolean = js.native
    
    /**
      * Returns value passed to the function
      * @param value Value to return
      */
    def identity(value: js.Any): js.Any = js.native
    
    /**
      * Increments a number
      */
    def inc(value: Double): Double = js.native
    
    /**
      * Drops last element of array
      */
    def init(list: js.Array[js.Any]): js.Array[js.Any] = js.native
    
    /**
      * Takes the intersection of two arrays
      */
    def intersect(lista: js.Array[js.Any], listb: js.Array[js.Any]): js.Array[js.Any] = js.native
    
    /**
      * Checks if passed value is an array
      */
    def isArray(value: js.Any): Boolean = js.native
    
    /**
      * Checks if passed value is a boolean
      */
    def isBoolean(value: js.Any): Boolean = js.native
    
    /**
      * Checks if value is an empty string
      * @param value
      */
    def isEmptyString(value: js.Any): Boolean = js.native
    
    /**
      * Checks if value is even
      */
    def isEven(value: Double): Boolean = js.native
    
    /**
      * Checks if passed value is a function
      */
    def isFunction(value: js.Any): Boolean = js.native
    
    /**
      * Checks if value is an integer
      */
    def isInt(value: Double): Boolean = js.native
    
    /**
      * Checks if value is a multiple of base value
      */
    def isMultipleOf(base: Double, value: Double): Boolean = js.native
    
    /**
      * Checks if number is negative
      */
    def isNegative(value: Double): Boolean = js.native
    
    /**
      * Checks if value is positive or 0
      */
    def isNonNegative(value: Double): Boolean = js.native
    
    /**
      * Checks if value is negative or 0
      */
    def isNonPositive(value: Double): Boolean = js.native
    
    /**
      * Checks if value is not 0
      */
    def isNonZero(value: Double): Boolean = js.native
    
    /**
      * Checks if value is null
      * @param value
      */
    def isNull(value: js.Any): Boolean = js.native
    
    /**
      * Checks if passed value is a number
      */
    def isNumber(value: js.Any): Boolean = js.native
    
    /**
      * Checks if passed value is either a number or a numeric string
      */
    def isNumeric(value: js.Any): Boolean = js.native
    
    /**
      * Checks if passed value is an object
      */
    def isObject(value: js.Any): Boolean = js.native
    
    /**
      * Checks if value is odd
      */
    def isOdd(value: Double): Boolean = js.native
    
    /**
      * Checks if passed value is a tuple of length 2
      */
    def isPair(value: js.Any): Boolean = js.native
    
    /**
      * Checks if number is positive
      */
    def isPositive(value: Double): Boolean = js.native
    
    /**
      * Checks if passed value is a primitive Javascript type
      */
    def isPrimitive(value: js.Any): Boolean = js.native
    
    /**
      * Checks if passed value is a tuple of length 1
      */
    def isSingle(value: js.Any): Boolean = js.native
    
    /**
      * Checks if passed value is a string
      */
    def isString(value: js.Any): Boolean = js.native
    
    /**
      * Checks if passed value is a tuple of length 3
      */
    def isTriple(value: js.Any): Boolean = js.native
    
    /**
      * Checks if passed value is truthy
      */
    def isTruthy(value: js.Any): Boolean = js.native
    
    /**
      * Checks if passed value is a tuple
      */
    def isTuple(value: js.Any): Boolean = js.native
    
    /**
      * Checks if value is of type passed as string
      * @param type
      * @param value
      */
    def isType(`type`: String, value: js.Any): Boolean = js.native
    
    /**
      * Checks if passed value is undefined
      */
    def isUndefined(value: js.Any): Boolean = js.native
    
    /**
      * Checks if number is 0
      */
    def isZero(value: Double): Boolean = js.native
    
    /**
      * Returns last value in an array
      * @param values Array of values
      */
    def last(values: js.Array[js.Any]): js.Any = js.native
    
    /**
      * Returns last index of an array
      * @param values Array
      */
    def lastIndex(values: js.Array[js.Any]): Double = js.native
    
    /**
      * Checks if a is less than or equal to b
      */
    def leq(a: Double, b: Double): Boolean = js.native
    
    /**
      * Checks if a is less than b
      */
    def less(a: Double, b: Double): Boolean = js.native
    
    /**
      * Maps functions into new array using mapper function
      * @param mapper Mapping function
      * @param values Array to map
      */
    def map(mapper: js.Function1[/* value */ js.Any, js.Any], values: js.Array[js.Any]): js.Array[js.Any] = js.native
    
    /**
      * Takes the maximum of two numbers
      */
    def max(a: Double, b: Double): Double = js.native
    
    /**
      * Returns preferred value if truthy, otherwise null
      * @param preferredValue Preferred value to check
      */
    def maybe(preferredValue: js.Any): js.Any = js.native
    /**
      * Returns preferred value if truthy or matches datatype, otherwise null
      * @param preferredValue Preferred value to check
      * @param datatype Datatype to match
      */
    def maybe(preferredValue: js.Any, datatype: String): js.Any = js.native
    
    /**
      * Returns maybe typed value based on type parameter
      */
    def maybeType(`type`: String, value: js.Any): js.Any = js.native
    
    /**
      * Merges right object into a copy of left object
      */
    def merge(left: js.Object, right: js.Object): js.Object = js.native
    
    /**
      * Takes the minimum of two numbers
      */
    def min(a: Double, b: Double): Double = js.native
    
    /**
      * Takes the modulus of first number against second number
      */
    def mod(a: Double, b: Double): Double = js.native
    
    /**
      * Takes mathematical modulo of first number against second number
      */
    def modulo(a: Double, b: Double): Double = js.native
    
    /**
      * Takes multiple partitions of a list using a partitioning predicate and criteria
      */
    def multiPartition(
      predicate: js.Function2[/* criterion */ js.Any, /* value */ js.Any, Boolean],
      criteria: js.Array[js.Any],
      list: js.Array[js.Any]
    ): js.Array[js.Array[js.Any]] = js.native
    
    /**
      * Multiplies two numbers
      */
    def multiply(a: Double, b: Double): Double = js.native
    
    /**
      * Returns boolean inverse of passed value
      */
    def not(value: Boolean): Boolean = js.native
    
    /**
      * Returns nth value of passed array
      * @param index Array index
      * @param values Array of values
      */
    def nth(index: Double, values: js.Array[js.Any]): js.Any = js.native
    
    /**
      * Counts number of list values which satisfy predicate
      */
    def numberOf(predicate: js.Function1[/* value */ js.Any, Boolean], list: js.Array[js.Any]): Double = js.native
    
    /**
      * Performs a disjunction (or) operation on two or more booleans
      */
    def or(a: Boolean, b: Boolean, args: Boolean*): Boolean = js.native
    
    /**
      * Applies values to a function and returns partially applied function
      * @param userFn Function to apply values to
      * @param ...args Values to apply
      */
    def partial(userFn: js.Function1[/* repeated */ js.Any, js.Any]): js.Function1[/* repeated */ js.Any, js.Any] = js.native
    def partial(userFn: js.Function1[/* repeated */ js.Any, js.Any], args: js.Any*): js.Function1[/* repeated */ js.Any, js.Any] = js.native
    
    /**
      * Returns a partially applied function with remaining arguments reversed
      */
    def partialReverse(fn: js.Function1[/* repeated */ js.Any, js.Any], args: js.Any*): js.Function1[/* repeated */ js.Any, js.Any] = js.native
    
    /**
      * Partitions array on values which pass and do not pass predicate
      */
    def partition(predicate: js.Function1[/* value */ js.Any, Boolean], list: js.Array[js.Any]): js.Array[js.Array[js.Any]] = js.native
    
    /**
      * Picks key from object
      */
    def pick(key: String, dataset: js.Object): js.Any = js.native
    
    /**
      * Pipelines or chains functions producing a single final output
      * @param value Initial condition for function pipelining
      * @param ...args Functions to chain/pipeline
      */
    def pipeline(value: js.Any, args: (js.Function1[/* repeated */ js.Any, js.Any])*): js.Any = js.native
    
    /**
      * Picks value from object by key and returns a new object containing key value pair
      */
    def pluck(key: String, dataset: js.Object): js.Object = js.native
    
    /**
      * Performs pluck across an array of keys, returns a single object containing all key value pairs
      */
    def pluckKeys(keys: js.Array[String], dataset: js.Object): js.Object = js.native
    
    /**
      * Creates a range either from 0 to an integer or from one integer to another
      */
    def range(end: Double): js.Array[Double] = js.native
    def range(start: Double, end: Double): js.Array[Double] = js.native
    
    /**
      * Composes functions executing from left to right
      */
    def rcompose(args: (js.Function1[/* repeated */ js.Any, js.Any])*): js.Function1[/* repeated */ js.Any, js.Any] = js.native
    
    /**
      * Recursion function to allow for tail-optimized recursion
      * @param userFn Function to recur on
      * @param ...args Initial condition arguments
      */
    def recur(userFn: js.Function1[/* repeated */ js.Any, js.Any]): js.Any = js.native
    def recur(userFn: js.Function1[/* repeated */ js.Any, js.Any], args: js.Any*): js.Any = js.native
    
    /**
      * Reduces array using reducer function
      * @param reducer Function to reduce values with
      * @param values Array to reduce
      */
    def reduce(
      reducer: js.Function2[/* condition1 */ js.Any, /* condition2 */ js.Any, js.Any],
      values: js.Array[js.Any]
    ): js.Any = js.native
    /**
      * Reduces array using reducer function
      * @param reducer Function to reduce values with
      * @param values Array to reduce
      * @param initialCondition Initial value to use in first reduction application
      */
    def reduce(
      reducer: js.Function2[/* condition1 */ js.Any, /* condition2 */ js.Any, js.Any],
      values: js.Array[js.Any],
      initialCondition: js.Any
    ): js.Any = js.native
    
    /**
      * Repeats action n times
      */
    def repeat(count: Double, action: js.Function1[/* repeated */ js.Any, js.Any]): js.Any = js.native
    
    /**
      * Returns all but the first element of array
      * @param values Array to return the rest of
      */
    def rest(values: js.Array[js.Any]): js.Array[js.Any] = js.native
    
    /**
      * Reverses arguments of provided function
      * @param userFn
      */
    def reverseArgs(userFn: js.Function1[/* repeated */ js.Any, js.Any]): js.Function1[/* repeated */ js.Any, js.Any] = js.native
    
    /**
      * Performs a right partial application on a function
      * @param userFn Function to apply arguments
      * @param ...args Inital arguments
      */
    def rpartial(userFn: js.Function1[/* repeated */ js.Any, js.Any]): js.Any = js.native
    def rpartial(userFn: js.Function1[/* repeated */ js.Any, js.Any], args: js.Any*): js.Any = js.native
    
    /**
      * Executes function if value is truthy, otherwise returns default
      * @param defaultValue
      * @param userFn
      * @param value
      */
    def shortCircuit(defaultValue: js.Any, userFn: js.Function1[/* repeated */ js.Any, js.Any], value: js.Any): js.Any = js.native
    
    /**
      * Returns a slice of an array
      * @param initialIndex index to start slicing at
      * @param values Array to slice
      */
    def slice(initialIndex: Double, values: js.Array[js.Any]): js.Array[js.Any] = js.native
    /**
      * Returns a slice of an array
      * @param initialIndex index to start slicing at
      * @param values Array to slice
      * @param lastIndex Index to end slice with
      */
    def slice(initialIndex: Double, values: js.Array[js.Any], lastIndex: Double): js.Array[js.Any] = js.native
    
    /**
      * Returns true if at least one array element satisfies predicate, else false
      */
    def some(predicate: js.Function1[/* value */ js.Any, Boolean], list: js.Array[js.Any]): Boolean = js.native
    
    /**
      * Sorts values in an array with an optional comparator arguments
      */
    def sort(list: js.Array[js.Any]): js.Array[js.Any] = js.native
    def sort(list: js.Array[js.Any], comparator: js.Function2[/* a */ js.Any, /* b */ js.Any, Double]): js.Array[js.Any] = js.native
    
    /**
      * Performs a split partial application
      * @param userFn
      * @param leftArgs
      * @param rightArgs
      */
    def splitPartial(
      userFn: js.Function1[/* repeated */ js.Any, js.Any],
      leftArgs: js.Array[js.Any],
      rightArgs: js.Array[js.Any]
    ): js.Function1[/* repeated */ js.Any, js.Any] = js.native
    
    /**
      * Subtracts second argument from first
      */
    def subtract(a: Double, b: Double): Double = js.native
    
    /**
      * Takes the symmetric difference of two arrays
      */
    def symmetricDifference(lista: js.Array[js.Any], listb: js.Array[js.Any]): js.Array[js.Any] = js.native
    
    /**
      * Returns first n values of an array
      * @param quantity Number of values to return
      * @param values Array of values to take from
      */
    def take(quantity: Double, values: js.Array[js.Any]): js.Array[js.Any] = js.native
    
    /**
      * Takes values from array until predicate is satisfied
      */
    def takeUntil(predicate: js.Function1[/* value */ js.Any, Boolean], list: js.Array[js.Any]): js.Array[js.Any] = js.native
    
    /**
      * Outputs a string composed of n copies of base string
      */
    def times(count: Double, value: String): String = js.native
    
    /**
      * Converts value to decimal equivalent returns null if non-convertable
      * @param value String or number value to convert
      */
    def toDec(value: String): Double = js.native
    /**
      * Converts string to decimal safely
      */
    def toDec(value: js.Any): Double = js.native
    def toDec(value: Double): Double = js.native
    
    /**
      * Converts an object literal into an array of values
      * @param value Object literal
      */
    /**
      * Converts object to an array of values
      */
    def toValues(value: js.Object): js.Array[js.Any] = js.native
    
    /**
      * Transforms object to a new object containing transformed keys
      */
    def transform(transformation: js.Array[js.Array[String]], dataset: js.Object): js.Object = js.native
    
    /**
      * Truncates number to floor if positive or to ceil if negative
      */
    def truncate(value: Double): Double = js.native
    
    /**
      * Takes the union of two arrays
      */
    def union(lista: js.Array[js.Any], listb: js.Array[js.Any]): js.Array[js.Any] = js.native
    
    /**
      * Returns array of values with duplicates removed
      * @param values Array of values to filter by uniqueness
      */
    def unique(values: js.Array[js.Any]): js.Array[js.Any] = js.native
    
    /**
      * Executes function when condition is true
      * @param predicateValue Value to set behavior execution
      * @param userFunction Behavior to execute
      */
    def when(predicateValue: Boolean, userFunction: js.Function1[/* repeated */ js.Any, js.Any]): js.Any = js.native
    /**
      * Executes function when condition is true
      * @param predicateValue Value to set behavior execution
      * @param userFunction Behavior to execute
      * @param ...args arguments for userFunction
      */
    def when(predicateValue: Boolean, userFunction: js.Function1[/* repeated */ js.Any, js.Any], args: js.Any*): js.Any = js.native
    
    /**
      * Performs an exclusive or operation on two booleans
      */
    def xor(a: Boolean, b: Boolean): Boolean = js.native
    
    /**
      * Zips two arrays together into an array of arrays
      */
    def zip(lista: js.Array[js.Any], listb: js.Array[js.Any]): js.Array[js.Array[js.Any]] = js.native
  }
  
  type _To = JfpStatic
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: JfpStatic = ^
}
