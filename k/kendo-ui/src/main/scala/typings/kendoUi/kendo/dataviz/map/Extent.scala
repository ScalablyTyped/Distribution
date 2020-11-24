package typings.kendoUi.kendo.dataviz.map

import typings.kendoUi.kendo.Class
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Extent extends Class {
  
  def center(): Location = js.native
  
  def contains(location: Location): Boolean = js.native
  
  def containsAny(locations: js.Any): Boolean = js.native
  
  def edges(): js.Any = js.native
  
  def include(location: Location): Unit = js.native
  
  def includeAll(locations: js.Any): Unit = js.native
  
  var nw: Location = js.native
  
  var options: ExtentOptions = js.native
  
  def overlaps(extent: Extent): Boolean = js.native
  
  var se: Location = js.native
  
  def toArray(): js.Any = js.native
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
  
  @scala.inline
  implicit class ExtentOps[Self <: Extent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCenter(value: () => Location): Self = this.set("center", js.Any.fromFunction0(value))
    
    @scala.inline
    def setContains(value: Location => Boolean): Self = this.set("contains", js.Any.fromFunction1(value))
    
    @scala.inline
    def setContainsAny(value: js.Any => Boolean): Self = this.set("containsAny", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEdges(value: () => js.Any): Self = this.set("edges", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInclude(value: Location => Unit): Self = this.set("include", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIncludeAll(value: js.Any => Unit): Self = this.set("includeAll", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNw(value: Location): Self = this.set("nw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: ExtentOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlaps(value: Extent => Boolean): Self = this.set("overlaps", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSe(value: Location): Self = this.set("se", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToArray(value: () => js.Any): Self = this.set("toArray", js.Any.fromFunction0(value))
  }
}
