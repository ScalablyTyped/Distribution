package typings.ibmMobilefirst.WL.JSONStore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryPartObj extends js.Object {
  /**
    * Add a between clause to a query for advanced find.
    */
  def between(searchField: js.Any, value: js.Any): js.Array[_]
  /**
    * Add an equal to clause to a query for advanced find.
    */
  def equal(searchField: js.Any, value: js.Any): js.Array[_]
  /**
    * Add a greater or equal thanclause to a query for advanced find.
    */
  def greaterOrEqualThan(searchField: js.Any, value: js.Any): js.Array[_]
  /**
    * Add a greater than clause to a query for advanced find.
    */
  def greaterThan(searchField: js.Any, value: js.Any): js.Array[_]
  /**
    * Add an in clause to a query for advanced find.
    */
  def inside(searchField: js.Any, value: js.Any): js.Array[_]
  /**
    * Add a left clause to a query for advanced find.
    */
  def leftLike(searchField: js.Any, value: js.Any): js.Array[_]
  /**
    * Add a less or equal than clause to a query for advanced find.
    */
  def lessOrEqualThan(searchField: js.Any, value: js.Any): js.Array[_]
  /**
    * Add a less than clause to a query for advanced find.
    */
  def lessThan(searchField: js.Any, value: js.Any): js.Array[_]
  /**
    * Add a like clause to a query for advanced find.
    */
  def like(searchField: js.Any, value: js.Any): js.Array[_]
  /**
    * Add a not between clause to a query for advanced find.
    */
  def notBetween(searchField: js.Any, value: js.Any): js.Array[_]
  /**
    * Add a not equal to clause to a query for advanced find.
    */
  def notEqual(searchField: js.Any, value: js.Any): js.Array[_]
  /**
    * Add a not in clause to a query for advanced find.
    */
  def notInside(searchField: js.Any, value: js.Any): js.Array[_]
  /**
    * Add a not left clause to a query for advanced find.
    */
  def notLeftLike(searchField: js.Any, value: js.Any): js.Array[_]
  /**
    * Add a not like clause to a query for advanced find.
    */
  def notLike(searchField: js.Any, value: js.Any): js.Array[_]
  /**
    * Add a not right clause to a query for advanced find.
    */
  def notRightLike(searchField: js.Any, value: js.Any): js.Array[_]
  /**
    * Add a right clause to a query for advanced find.
    */
  def rightLike(searchField: js.Any, value: js.Any): js.Array[_]
}

object QueryPartObj {
  @scala.inline
  def apply(
    between: (js.Any, js.Any) => js.Array[_],
    equal: (js.Any, js.Any) => js.Array[_],
    greaterOrEqualThan: (js.Any, js.Any) => js.Array[_],
    greaterThan: (js.Any, js.Any) => js.Array[_],
    inside: (js.Any, js.Any) => js.Array[_],
    leftLike: (js.Any, js.Any) => js.Array[_],
    lessOrEqualThan: (js.Any, js.Any) => js.Array[_],
    lessThan: (js.Any, js.Any) => js.Array[_],
    like: (js.Any, js.Any) => js.Array[_],
    notBetween: (js.Any, js.Any) => js.Array[_],
    notEqual: (js.Any, js.Any) => js.Array[_],
    notInside: (js.Any, js.Any) => js.Array[_],
    notLeftLike: (js.Any, js.Any) => js.Array[_],
    notLike: (js.Any, js.Any) => js.Array[_],
    notRightLike: (js.Any, js.Any) => js.Array[_],
    rightLike: (js.Any, js.Any) => js.Array[_]
  ): QueryPartObj = {
    val __obj = js.Dynamic.literal(between = js.Any.fromFunction2(between), equal = js.Any.fromFunction2(equal), greaterOrEqualThan = js.Any.fromFunction2(greaterOrEqualThan), greaterThan = js.Any.fromFunction2(greaterThan), inside = js.Any.fromFunction2(inside), leftLike = js.Any.fromFunction2(leftLike), lessOrEqualThan = js.Any.fromFunction2(lessOrEqualThan), lessThan = js.Any.fromFunction2(lessThan), like = js.Any.fromFunction2(like), notBetween = js.Any.fromFunction2(notBetween), notEqual = js.Any.fromFunction2(notEqual), notInside = js.Any.fromFunction2(notInside), notLeftLike = js.Any.fromFunction2(notLeftLike), notLike = js.Any.fromFunction2(notLike), notRightLike = js.Any.fromFunction2(notRightLike), rightLike = js.Any.fromFunction2(rightLike))
    __obj.asInstanceOf[QueryPartObj]
  }
}

