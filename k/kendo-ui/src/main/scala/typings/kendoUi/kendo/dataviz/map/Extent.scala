package typings.kendoUi.kendo.dataviz.map

import typings.kendoUi.kendo.Class
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Extent extends Class {
  var nw: Location
  var options: ExtentOptions
  var se: Location
  def center(): Location
  def contains(location: Location): Boolean
  def containsAny(locations: js.Any): Boolean
  def edges(): js.Any
  def include(location: Location): Unit
  def includeAll(locations: js.Any): Unit
  def overlaps(extent: Extent): Boolean
  def toArray(): js.Any
}

object Extent {
  @scala.inline
  def apply(
    center: () => Location,
    contains: Location => Boolean,
    containsAny: js.Any => Boolean,
    edges: () => js.Any,
    include: Location => Unit,
    includeAll: js.Any => Unit,
    nw: Location,
    options: ExtentOptions,
    overlaps: Extent => Boolean,
    se: Location,
    toArray: () => js.Any
  ): Extent = {
    val __obj = js.Dynamic.literal(center = js.Any.fromFunction0(center), contains = js.Any.fromFunction1(contains), containsAny = js.Any.fromFunction1(containsAny), edges = js.Any.fromFunction0(edges), include = js.Any.fromFunction1(include), includeAll = js.Any.fromFunction1(includeAll), nw = nw.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], overlaps = js.Any.fromFunction1(overlaps), se = se.asInstanceOf[js.Any], toArray = js.Any.fromFunction0(toArray))
    __obj.asInstanceOf[Extent]
  }
}

