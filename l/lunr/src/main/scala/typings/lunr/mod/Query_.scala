package typings.lunr.mod

import typings.lunr.mod.Query.Clause
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A lunr.Query provides a programmatic way of defining queries to be performed
  * against a {@link lunr.Index}.
  *
  * Prefer constructing a lunr.Query using the {@link lunr.Index#query} method
  * so the query object is pre-initialized with the right index fields.
  */
@JSImport("lunr", "Query")
@js.native
class Query_ protected () extends js.Object {
  /**
    * @param allFields An array of all available fields in a lunr.Index.
    */
  def this(allFields: js.Array[String]) = this()
  
  /**
    * An array of all available fields in a lunr.Index.
    */
  var allFields: js.Array[String] = js.native
  
  /**
    * Adds a {@link lunr.Query~Clause} to this query.
    *
    * Unless the clause contains the fields to be matched all fields will be matched. In addition
    * a default boost of 1 is applied to the clause.
    *
    * @param clause - The clause to add to this query.
    * @see lunr.Query~Clause
    */
  def clause(clause: Clause): Query = js.native
  
  /**
    * An array of query clauses.
    */
  var clauses: js.Array[Clause] = js.native
  
  /**
    * Adds a term to the current query, under the covers this will create a {@link lunr.Query~Clause}
    * to the list of clauses that make up this query.
    *
    * The term is used as is, i.e. no tokenization will be performed by this method. Instead conversion
    * to a token or token-like string should be done before calling this method.
    *
    * The term will be converted to a string by calling `toString`. Multiple terms can be passed as an
    * array, each term in the array will share the same options.
    *
    * @param term - The term to add to the query.
    * @param [options] - Any additional properties to add to the query clause.
    * @see lunr.Query#clause
    * @see lunr.Query~Clause
    * @example <caption>adding a single term to a query</caption>
    * query.term("foo")
    * @example <caption>adding a single term to a query and specifying search fields, term boost and automatic trailing wildcard</caption>
    * query.term("foo", {
    *   fields: ["title"],
    *   boost: 10,
    *   wildcard: lunr.Query.wildcard.TRAILING
    * })
    */
  def term(term: String, options: js.Object): Query = js.native
  def term(term: js.Array[String | Token], options: js.Object): Query = js.native
  def term(term: Token, options: js.Object): Query = js.native
}
