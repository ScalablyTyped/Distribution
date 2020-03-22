package typings.lunr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Index {
  /**
    * A query builder callback provides a query object to be used to express
    * the query to perform on the index.
    *
    * @param query - The query object to build up.
    */
  type QueryBuilder = js.ThisFunction1[/* this */ typings.lunr.mod.Query, /* query */ typings.lunr.mod.Query, scala.Unit]
  /**
    * Although lunr provides the ability to create queries using lunr.Query, it also provides a simple
    * query language which itself is parsed into an instance of lunr.Query.
    *
    * For programmatically building queries it is advised to directly use lunr.Query, the query language
    * is best used for human entered text rather than program generated text.
    *
    * At its simplest queries can just be a single term, e.g. `hello`, multiple terms are also supported
    * and will be combined with OR, e.g `hello world` will match documents that contain either 'hello'
    * or 'world', though those that contain both will rank higher in the results.
    *
    * Wildcards can be included in terms to match one or more unspecified characters, these wildcards can
    * be inserted anywhere within the term, and more than one wildcard can exist in a single term. Adding
    * wildcards will increase the number of documents that will be found but can also have a negative
    * impact on query performance, especially with wildcards at the beginning of a term.
    *
    * Terms can be restricted to specific fields, e.g. `title:hello`, only documents with the term
    * hello in the title field will match this query. Using a field not present in the index will lead
    * to an error being thrown.
    *
    * Modifiers can also be added to terms, lunr supports edit distance and boost modifiers on terms. A term
    * boost will make documents matching that term score higher, e.g. `foo^5`. Edit distance is also supported
    * to provide fuzzy matching, e.g. 'hello~2' will match documents with hello with an edit distance of 2.
    * Avoid large values for edit distance to improve query performance.
    *
    * To escape special characters the backslash character '\' can be used, this allows searches to include
    * characters that would normally be considered modifiers, e.g. `foo\~2` will search for a term "foo~2" instead
    * of attempting to apply a boost of 2 to the search term "foo".
    *
    * @example <caption>Simple single term query</caption>
    * hello
    * @example <caption>Multiple term query</caption>
    * hello world
    * @example <caption>term scoped to a field</caption>
    * title:hello
    * @example <caption>term with a boost of 10</caption>
    * hello^10
    * @example <caption>term with an edit distance of 2</caption>
    * hello~2
    */
  type QueryString = java.lang.String
}
