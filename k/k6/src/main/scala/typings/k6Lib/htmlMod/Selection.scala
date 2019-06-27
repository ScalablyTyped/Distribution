package typings
package k6Lib.htmlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("k6/html", "Selection")
@js.native
abstract class Selection () extends js.Object {
  var __brand: scala.Nothing = js.native
  def attr(name: java.lang.String): js.UndefOr[java.lang.String] = js.native
  def children(): Selection = js.native
  def children(selector: java.lang.String): Selection = js.native
  def closest(selector: java.lang.String): Selection = js.native
  def contents(): Selection = js.native
  def data(): js.UndefOr[java.lang.String] = js.native
  def data(key: java.lang.String): js.UndefOr[java.lang.String] = js.native
  def each(handler: Handler): scala.Unit = js.native
  def eq(index: scala.Double): Selection = js.native
  def filter(selector: java.lang.String): Selection = js.native
  def filter(selector: Selection): Selection = js.native
  def filter(selector: Tester): Selection = js.native
  def find(selector: java.lang.String): Selection = js.native
  def first(): Selection = js.native
  def get(index: scala.Double): Element = js.native
  def has(selector: java.lang.String): Selection = js.native
  def html(): js.UndefOr[java.lang.String] = js.native
  def is(selector: java.lang.String): Selection = js.native
  def is(selector: Selection): Selection = js.native
  def is(selector: Tester): Selection = js.native
  def last(): Selection = js.native
  def map(mapper: Mapper): js.Array[_] = js.native
  def next(): Selection = js.native
  def next(selector: java.lang.String): Selection = js.native
  def nextAll(): Selection = js.native
  def nextAll(selector: java.lang.String): Selection = js.native
  def nextUntil(): Selection = js.native
  def nextUntil(selector: java.lang.String): Selection = js.native
  def not(selector: java.lang.String): Selection = js.native
  def not(selector: Tester): Selection = js.native
  def parent(): Selection = js.native
  def parent(selector: java.lang.String): Selection = js.native
  def parents(): Selection = js.native
  def parents(selector: java.lang.String): Selection = js.native
  def parentsUntil(): Selection = js.native
  def parentsUntil(selector: java.lang.String): Selection = js.native
  def prev(): Selection = js.native
  def prev(selector: java.lang.String): Selection = js.native
  def prevAll(): Selection = js.native
  def prevAll(selector: java.lang.String): Selection = js.native
  def prevUntil(): Selection = js.native
  def prevUntil(selector: java.lang.String): Selection = js.native
  def serialize(): java.lang.String = js.native
  def serializeArray(): js.Array[FormValue] = js.native
  def serializeObject(): org.scalablytyped.runtime.StringDictionary[java.lang.String] = js.native
  def size(): scala.Double = js.native
  def slice(start: scala.Double): Selection = js.native
  def slice(start: scala.Double, end: scala.Double): Selection = js.native
  def text(): java.lang.String = js.native
  def toArray(): js.Array[Selection] = js.native
  def `val`(): js.UndefOr[java.lang.String] = js.native
}

