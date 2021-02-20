package typings.lokijs

import typings.lokijs.anon.PartialGetDataOptions
import typings.lokijs.anon.PartialSimplesortOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Resultset class allowing chainable queries.  Intended to be instanced internally.
  *    Collection.find(), Collection.where(), and Collection.chain() instantiate this.
  *
  * @example
  *    mycollection.chain()
  *      .find({ 'doors' : 4 })
  *      .where(function(obj) { return obj.name === 'Toyota' })
  *      .data();
  */
@js.native
trait Resultset[E /* <: js.Object */] extends StObject {
  
  @JSName("$and")
  def $and(expressionArray: js.Array[LokiQuery[E]]): this.type = js.native
  @JSName("$and")
  var $and_Original: js.Function1[/* expressionArray */ js.Array[LokiQuery[E]], this.type] = js.native
  
  @JSName("$or")
  def $or(expressionArray: js.Array[LokiQuery[E]]): this.type = js.native
  @JSName("$or")
  var $or_Original: js.Function1[/* expressionArray */ js.Array[LokiQuery[E]], this.type] = js.native
  
  /**
    * Alias of copy()
    */
  def branch(): Resultset[E] = js.native
  /**
    * Alias of copy()
    */
  @JSName("branch")
  var branch_Original: js.Function0[Resultset[E]] = js.native
  
  var collection: Collection[E] = js.native
  
  /**
    * Allows sorting a resultset based on multiple columns.
    * @example
    * // to sort by age and then name (both ascending)
    * rs.compoundsort(['age', 'name']);
    * // to sort by age (ascending) and then by name (descending)
    * rs.compoundsort(['age', ['name', true]);
    *
    * @param properties - array of property names or subarray of [propertyname, isdesc] used evaluate sort order
    * @returns Reference to this resultset, sorted, for future chain operations.
    */
  def compoundsort(properties: js.Array[js.Tuple2[/* keyof E */ String, Boolean]]): this.type = js.native
  
  /**
    * copy() - To support reuse of resultset in branched query situations.
    *
    * @returns Returns a copy of the resultset (set) but the underlying document references will be the same.
    */
  def copy(): Resultset[E] = js.native
  
  /**
    * count() - returns the number of documents in the resultset.
    *
    * @returns The number of documents in the resultset.
    */
  def count(): Double = js.native
  
  /**
    * Terminates the chain and returns array of filtered documents
    *
    * @param [options] - allows specifying 'forceClones' and 'forceCloneMethod' options.
    * @param [options.forceClones] - Allows forcing the return of cloned objects even when
    *        the collection is not configured for clone object.
    * @param [options.forceCloneMethod] - Allows overriding the default or collection specified cloning method.
    *        Possible values include 'parse-stringify', 'jquery-extend-deep', 'shallow', 'shallow-assign'
    * @param [options.removeMeta] - Will force clones and strip $loki and meta properties from documents
    *
    * @returns Array of documents in the resultset
    */
  def data(): js.Array[E with LokiObj] = js.native
  def data(options: PartialGetDataOptions): js.Array[E with LokiObj] = js.native
  
  def eqJoin(joinData: js.Array[_], leftJoinKey: String, rightJoinKey: String): Resultset[_] = js.native
  def eqJoin(
    joinData: js.Array[_],
    leftJoinKey: String,
    rightJoinKey: String,
    mapFun: js.UndefOr[scala.Nothing],
    dataOptions: PartialGetDataOptions
  ): Resultset[_] = js.native
  def eqJoin(
    joinData: js.Array[_],
    leftJoinKey: String,
    rightJoinKey: String,
    mapFun: js.Function2[/* left */ js.Any, /* right */ js.Any, _]
  ): Resultset[_] = js.native
  def eqJoin(
    joinData: js.Array[_],
    leftJoinKey: String,
    rightJoinKey: String,
    mapFun: js.Function2[/* left */ js.Any, /* right */ js.Any, _],
    dataOptions: PartialGetDataOptions
  ): Resultset[_] = js.native
  def eqJoin(joinData: js.Array[_], leftJoinKey: String, rightJoinKey: js.Function1[/* obj */ js.Any, String]): Resultset[_] = js.native
  def eqJoin(
    joinData: js.Array[_],
    leftJoinKey: String,
    rightJoinKey: js.Function1[/* obj */ js.Any, String],
    mapFun: js.UndefOr[scala.Nothing],
    dataOptions: PartialGetDataOptions
  ): Resultset[_] = js.native
  def eqJoin(
    joinData: js.Array[_],
    leftJoinKey: String,
    rightJoinKey: js.Function1[/* obj */ js.Any, String],
    mapFun: js.Function2[/* left */ js.Any, /* right */ js.Any, _]
  ): Resultset[_] = js.native
  def eqJoin(
    joinData: js.Array[_],
    leftJoinKey: String,
    rightJoinKey: js.Function1[/* obj */ js.Any, String],
    mapFun: js.Function2[/* left */ js.Any, /* right */ js.Any, _],
    dataOptions: PartialGetDataOptions
  ): Resultset[_] = js.native
  def eqJoin(joinData: js.Array[_], leftJoinKey: js.Function1[/* obj */ js.Any, String], rightJoinKey: String): Resultset[_] = js.native
  def eqJoin(
    joinData: js.Array[_],
    leftJoinKey: js.Function1[/* obj */ js.Any, String],
    rightJoinKey: String,
    mapFun: js.UndefOr[scala.Nothing],
    dataOptions: PartialGetDataOptions
  ): Resultset[_] = js.native
  def eqJoin(
    joinData: js.Array[_],
    leftJoinKey: js.Function1[/* obj */ js.Any, String],
    rightJoinKey: String,
    mapFun: js.Function2[/* left */ js.Any, /* right */ js.Any, _]
  ): Resultset[_] = js.native
  def eqJoin(
    joinData: js.Array[_],
    leftJoinKey: js.Function1[/* obj */ js.Any, String],
    rightJoinKey: String,
    mapFun: js.Function2[/* left */ js.Any, /* right */ js.Any, _],
    dataOptions: PartialGetDataOptions
  ): Resultset[_] = js.native
  def eqJoin(
    joinData: js.Array[_],
    leftJoinKey: js.Function1[/* obj */ js.Any, String],
    rightJoinKey: js.Function1[/* obj */ js.Any, String]
  ): Resultset[_] = js.native
  def eqJoin(
    joinData: js.Array[_],
    leftJoinKey: js.Function1[/* obj */ js.Any, String],
    rightJoinKey: js.Function1[/* obj */ js.Any, String],
    mapFun: js.UndefOr[scala.Nothing],
    dataOptions: PartialGetDataOptions
  ): Resultset[_] = js.native
  def eqJoin(
    joinData: js.Array[_],
    leftJoinKey: js.Function1[/* obj */ js.Any, String],
    rightJoinKey: js.Function1[/* obj */ js.Any, String],
    mapFun: js.Function2[/* left */ js.Any, /* right */ js.Any, _]
  ): Resultset[_] = js.native
  def eqJoin(
    joinData: js.Array[_],
    leftJoinKey: js.Function1[/* obj */ js.Any, String],
    rightJoinKey: js.Function1[/* obj */ js.Any, String],
    mapFun: js.Function2[/* left */ js.Any, /* right */ js.Any, _],
    dataOptions: PartialGetDataOptions
  ): Resultset[_] = js.native
  /**
    * eqJoin() - Left joining two sets of data. Join keys can be defined or calculated properties
    * eqJoin expects the right join key values to be unique.  Otherwise left data will be joined on the last joinData object with that key
    * @param joinData - Data array to join to.
    * @param leftJoinKey - Property name in this result set to join on or a function to produce a value to join on
    * @param rightJoinKey - Property name in the joinData to join on or a function to produce a value to join on
    * @param [mapFun] - (Optional) A function that receives each matching pair and maps them into output objects - function(left,right){return joinedObject}
    * @param [dataOptions] - options to data() before input to your map function
    * @param [dataOptions.removeMeta] - allows removing meta before calling mapFun
    * @param [dataOptions.forceClones] - forcing the return of cloned objects to your map object
    * @param [dataOptions.forceCloneMethod] - Allows overriding the default or collection specified cloning method.
    * @returns A resultset with data in the format [{left: leftObj, right: rightObj}]
    */
  def eqJoin(joinData: Collection[_], leftJoinKey: String, rightJoinKey: String): Resultset[_] = js.native
  def eqJoin(
    joinData: Collection[_],
    leftJoinKey: String,
    rightJoinKey: String,
    mapFun: js.UndefOr[scala.Nothing],
    dataOptions: PartialGetDataOptions
  ): Resultset[_] = js.native
  def eqJoin(
    joinData: Collection[_],
    leftJoinKey: String,
    rightJoinKey: String,
    mapFun: js.Function2[/* left */ js.Any, /* right */ js.Any, _]
  ): Resultset[_] = js.native
  def eqJoin(
    joinData: Collection[_],
    leftJoinKey: String,
    rightJoinKey: String,
    mapFun: js.Function2[/* left */ js.Any, /* right */ js.Any, _],
    dataOptions: PartialGetDataOptions
  ): Resultset[_] = js.native
  def eqJoin(joinData: Collection[_], leftJoinKey: String, rightJoinKey: js.Function1[/* obj */ js.Any, String]): Resultset[_] = js.native
  def eqJoin(
    joinData: Collection[_],
    leftJoinKey: String,
    rightJoinKey: js.Function1[/* obj */ js.Any, String],
    mapFun: js.UndefOr[scala.Nothing],
    dataOptions: PartialGetDataOptions
  ): Resultset[_] = js.native
  def eqJoin(
    joinData: Collection[_],
    leftJoinKey: String,
    rightJoinKey: js.Function1[/* obj */ js.Any, String],
    mapFun: js.Function2[/* left */ js.Any, /* right */ js.Any, _]
  ): Resultset[_] = js.native
  def eqJoin(
    joinData: Collection[_],
    leftJoinKey: String,
    rightJoinKey: js.Function1[/* obj */ js.Any, String],
    mapFun: js.Function2[/* left */ js.Any, /* right */ js.Any, _],
    dataOptions: PartialGetDataOptions
  ): Resultset[_] = js.native
  def eqJoin(joinData: Collection[_], leftJoinKey: js.Function1[/* obj */ js.Any, String], rightJoinKey: String): Resultset[_] = js.native
  def eqJoin(
    joinData: Collection[_],
    leftJoinKey: js.Function1[/* obj */ js.Any, String],
    rightJoinKey: String,
    mapFun: js.UndefOr[scala.Nothing],
    dataOptions: PartialGetDataOptions
  ): Resultset[_] = js.native
  def eqJoin(
    joinData: Collection[_],
    leftJoinKey: js.Function1[/* obj */ js.Any, String],
    rightJoinKey: String,
    mapFun: js.Function2[/* left */ js.Any, /* right */ js.Any, _]
  ): Resultset[_] = js.native
  def eqJoin(
    joinData: Collection[_],
    leftJoinKey: js.Function1[/* obj */ js.Any, String],
    rightJoinKey: String,
    mapFun: js.Function2[/* left */ js.Any, /* right */ js.Any, _],
    dataOptions: PartialGetDataOptions
  ): Resultset[_] = js.native
  def eqJoin(
    joinData: Collection[_],
    leftJoinKey: js.Function1[/* obj */ js.Any, String],
    rightJoinKey: js.Function1[/* obj */ js.Any, String]
  ): Resultset[_] = js.native
  def eqJoin(
    joinData: Collection[_],
    leftJoinKey: js.Function1[/* obj */ js.Any, String],
    rightJoinKey: js.Function1[/* obj */ js.Any, String],
    mapFun: js.UndefOr[scala.Nothing],
    dataOptions: PartialGetDataOptions
  ): Resultset[_] = js.native
  def eqJoin(
    joinData: Collection[_],
    leftJoinKey: js.Function1[/* obj */ js.Any, String],
    rightJoinKey: js.Function1[/* obj */ js.Any, String],
    mapFun: js.Function2[/* left */ js.Any, /* right */ js.Any, _]
  ): Resultset[_] = js.native
  def eqJoin(
    joinData: Collection[_],
    leftJoinKey: js.Function1[/* obj */ js.Any, String],
    rightJoinKey: js.Function1[/* obj */ js.Any, String],
    mapFun: js.Function2[/* left */ js.Any, /* right */ js.Any, _],
    dataOptions: PartialGetDataOptions
  ): Resultset[_] = js.native
  def eqJoin(joinData: Resultset[_], leftJoinKey: String, rightJoinKey: String): Resultset[_] = js.native
  def eqJoin(
    joinData: Resultset[_],
    leftJoinKey: String,
    rightJoinKey: String,
    mapFun: js.UndefOr[scala.Nothing],
    dataOptions: PartialGetDataOptions
  ): Resultset[_] = js.native
  def eqJoin(
    joinData: Resultset[_],
    leftJoinKey: String,
    rightJoinKey: String,
    mapFun: js.Function2[/* left */ js.Any, /* right */ js.Any, _]
  ): Resultset[_] = js.native
  def eqJoin(
    joinData: Resultset[_],
    leftJoinKey: String,
    rightJoinKey: String,
    mapFun: js.Function2[/* left */ js.Any, /* right */ js.Any, _],
    dataOptions: PartialGetDataOptions
  ): Resultset[_] = js.native
  def eqJoin(joinData: Resultset[_], leftJoinKey: String, rightJoinKey: js.Function1[/* obj */ js.Any, String]): Resultset[_] = js.native
  def eqJoin(
    joinData: Resultset[_],
    leftJoinKey: String,
    rightJoinKey: js.Function1[/* obj */ js.Any, String],
    mapFun: js.UndefOr[scala.Nothing],
    dataOptions: PartialGetDataOptions
  ): Resultset[_] = js.native
  def eqJoin(
    joinData: Resultset[_],
    leftJoinKey: String,
    rightJoinKey: js.Function1[/* obj */ js.Any, String],
    mapFun: js.Function2[/* left */ js.Any, /* right */ js.Any, _]
  ): Resultset[_] = js.native
  def eqJoin(
    joinData: Resultset[_],
    leftJoinKey: String,
    rightJoinKey: js.Function1[/* obj */ js.Any, String],
    mapFun: js.Function2[/* left */ js.Any, /* right */ js.Any, _],
    dataOptions: PartialGetDataOptions
  ): Resultset[_] = js.native
  def eqJoin(joinData: Resultset[_], leftJoinKey: js.Function1[/* obj */ js.Any, String], rightJoinKey: String): Resultset[_] = js.native
  def eqJoin(
    joinData: Resultset[_],
    leftJoinKey: js.Function1[/* obj */ js.Any, String],
    rightJoinKey: String,
    mapFun: js.UndefOr[scala.Nothing],
    dataOptions: PartialGetDataOptions
  ): Resultset[_] = js.native
  def eqJoin(
    joinData: Resultset[_],
    leftJoinKey: js.Function1[/* obj */ js.Any, String],
    rightJoinKey: String,
    mapFun: js.Function2[/* left */ js.Any, /* right */ js.Any, _]
  ): Resultset[_] = js.native
  def eqJoin(
    joinData: Resultset[_],
    leftJoinKey: js.Function1[/* obj */ js.Any, String],
    rightJoinKey: String,
    mapFun: js.Function2[/* left */ js.Any, /* right */ js.Any, _],
    dataOptions: PartialGetDataOptions
  ): Resultset[_] = js.native
  def eqJoin(
    joinData: Resultset[_],
    leftJoinKey: js.Function1[/* obj */ js.Any, String],
    rightJoinKey: js.Function1[/* obj */ js.Any, String]
  ): Resultset[_] = js.native
  def eqJoin(
    joinData: Resultset[_],
    leftJoinKey: js.Function1[/* obj */ js.Any, String],
    rightJoinKey: js.Function1[/* obj */ js.Any, String],
    mapFun: js.UndefOr[scala.Nothing],
    dataOptions: PartialGetDataOptions
  ): Resultset[_] = js.native
  def eqJoin(
    joinData: Resultset[_],
    leftJoinKey: js.Function1[/* obj */ js.Any, String],
    rightJoinKey: js.Function1[/* obj */ js.Any, String],
    mapFun: js.Function2[/* left */ js.Any, /* right */ js.Any, _]
  ): Resultset[_] = js.native
  def eqJoin(
    joinData: Resultset[_],
    leftJoinKey: js.Function1[/* obj */ js.Any, String],
    rightJoinKey: js.Function1[/* obj */ js.Any, String],
    mapFun: js.Function2[/* left */ js.Any, /* right */ js.Any, _],
    dataOptions: PartialGetDataOptions
  ): Resultset[_] = js.native
  
  var filterInitialized: Boolean = js.native
  
  var filteredrows: js.Array[Double] = js.native
  
  /**
    * Used for querying via a mongo-style query object.
    *
    * @param query - A mongo-style query object used for filtering current results.
    * @param firstOnly - (Optional) Used by collection.findOne()
    * @returns this resultset for further chain ops.
    */
  def find(): this.type = js.native
  def find(query: js.UndefOr[scala.Nothing], firstOnly: Boolean): this.type = js.native
  def find(query: LokiQuery[E]): this.type = js.native
  def find(query: LokiQuery[E], firstOnly: Boolean): this.type = js.native
  
  /**
    * findAnd() - oversee the operation of AND'ed query expressions.
    *    AND'ed expression evaluation runs each expression progressively against the full collection,
    *    internally utilizing existing chained resultset functionality.
    *    Only the first filter can utilize a binary index.
    *
    * @param expressionArray - array of expressions
    * @returns this resultset for further chain ops.
    */
  def findAnd(expressionArray: js.Array[LokiQuery[E]]): this.type = js.native
  
  /**
    * findOr() - oversee the operation of OR'ed query expressions.
    *    OR'ed expression evaluation runs each expression individually against the full collection,
    *    and finally does a set OR on each expression's results.
    *    Each evaluation can utilize a binary index to prevent multiple linear array scans.
    *
    * @param expressionArray - array of expressions
    * @returns this resultset for further chain ops.
    */
  def findOr(expressionArray: js.Array[LokiQuery[E]]): this.type = js.native
  
  /**
    * Allows you to limit the number of documents passed to next chain operation.
    *    A resultset copy() is made to avoid altering original resultset.
    *
    * @param qty - The number of documents to return.
    * @returns Returns a copy of the resultset, limited by qty, for subsequent chain ops.
    */
  def limit(qty: Double): Resultset[E] = js.native
  
  /**
    * Applies a map function into a new collection for further chaining.
    * @param mapFun - javascript map function
    * @param [dataOptions] - options to data() before input to your map function
    * @param [dataOptions.removeMeta] - allows removing meta before calling mapFun
    * @param [dataOptions.forceClones] - forcing the return of cloned objects to your map object
    * @param [dataOptions.forceCloneMethod] - Allows overriding the default or collection specified cloning method.
    */
  def map[U /* <: js.Object */](mapFun: js.Function3[/* value */ E, /* index */ Double, /* array */ js.Array[E], U]): Resultset[U] = js.native
  def map[U /* <: js.Object */](
    mapFun: js.Function3[/* value */ E, /* index */ Double, /* array */ js.Array[E], U],
    dataOptions: PartialGetDataOptions
  ): Resultset[U] = js.native
  
  /**
    * data transformation via user supplied functions
    *
    * @param mapFunction - this function accepts a single document for you to transform and return
    * @param reduceFunction - this function accepts many (array of map outputs) and returns single value
    * @returns The output of your reduceFunction
    */
  def mapReduce[U, R](
    mapFunction: js.Function3[/* value */ E, /* index */ Double, /* array */ js.Array[E], U],
    reduceFunction: js.Function1[/* ary */ js.Array[U], R]
  ): R = js.native
  
  /**
    * Used for skipping 'pos' number of documents in the resultset.
    *
    * @param pos - Number of documents to skip; all preceding documents are filtered out.
    * @returns Returns a copy of the resultset, containing docs starting at 'pos' for subsequent chain ops.
    */
  def offset(pos: Double): Resultset[E] = js.native
  
  /**
    * Removes all document objects which are currently in resultset from collection (as well as resultset)
    *
    * @returns this (empty) resultset for further chain ops.
    */
  def remove(): this.type = js.native
  
  /**
    * reset() - Reset the resultset to its initial state.
    *
    * @returns Reference to this resultset, for future chain operations.
    */
  def reset(): this.type = js.native
  
  /**
    * Simpler, loose evaluation for user to sort based on a property name. (chainable).
    *    Sorting based on the same lt/gt helper functions used for binary indices.
    *
    * @param propname - name of property to sort by.
    * @param options - boolean to specify if sort is descending, or options object
    * @param [options.desc] - whether to sort descending
    * @param [options.disableIndexIntersect] - whether we should explicity not use array intersection.
    * @param [options.forceIndexIntersect] - force array intersection (if binary index exists).
    * @param [options.useJavascriptSorting] - whether results are sorted via basic javascript sort.
    * @returns Reference to this resultset, sorted, for future chain operations.
    */
  def simplesort(propname: /* keyof E */ String): this.type = js.native
  def simplesort(propname: /* keyof E */ String, options: Boolean): this.type = js.native
  def simplesort(propname: /* keyof E */ String, options: PartialSimplesortOptions): this.type = js.native
  
  /**
    * User supplied compare function is provided two documents to compare. (chainable)
    * @example
    *    rslt.sort(function(obj1, obj2) {
    *      if (obj1.name === obj2.name) return 0;
    *      if (obj1.name > obj2.name) return 1;
    *      if (obj1.name < obj2.name) return -1;
    *    });
    *
    * @param comparefun - A javascript compare function used for sorting.
    * @returns Reference to this resultset, sorted, for future chain operations.
    */
  def sort(comparefun: js.Function2[/* a */ E with LokiObj, /* b */ E with LokiObj, Double]): this.type = js.native
  
  /**
    * toJSON() - Override of toJSON to avoid circular references
    */
  def toJSON(): Resultset[E] = js.native
  
  /**
    * transform() - executes a named collection transform or raw array of transform steps against the resultset.
    *
    * @param transform - name of collection transform or raw transform array
    * @param parameters - (Optional) object property hash of parameters, if the transform requires them.
    * @returns either (this) resultset or a clone of of this resultset (depending on steps)
    */
  def transform(transform: String): Resultset[_] = js.native
  def transform(transform: String, parameters: js.Object): Resultset[_] = js.native
  def transform(transform: js.Array[String | Transform]): Resultset[_] = js.native
  def transform(transform: js.Array[String | Transform], parameters: js.Object): Resultset[_] = js.native
  
  /**
    * Used to run an update operation on all documents currently in the resultset.
    *
    * @param updateFunction - User supplied updateFunction(obj) will be executed for each document object.
    * @returns this resultset for further chain ops.
    */
  def update(updateFunction: js.Function1[/* obj */ E, Unit]): this.type = js.native
  
  /**
    * where() - Used for filtering via a javascript filter function.
    *
    * @param fun - A javascript function used for filtering current results by.
    * @returns this resultset for further chain ops.
    */
  def where(fun: js.Function1[/* data */ E with LokiObj, Boolean]): this.type = js.native
}
