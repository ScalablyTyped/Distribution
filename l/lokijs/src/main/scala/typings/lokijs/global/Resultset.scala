package typings.lokijs.global

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
@JSGlobal("Resultset")
@js.native
class Resultset[E /* <: js.Object */] protected ()
  extends typings.lokijs.Resultset[E] {
  /**
    * @param collection - The collection which this Resultset will query against.
    * @param options
    */
  def this(collection: typings.lokijs.Collection[E]) = this()
  def this(collection: typings.lokijs.Collection[E], options: js.Any) = this()
}
