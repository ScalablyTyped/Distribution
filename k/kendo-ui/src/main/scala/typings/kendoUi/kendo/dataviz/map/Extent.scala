package typings.kendoUi.kendo.dataviz.map

import typings.kendoUi.kendo.Class
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Extent
  extends StObject
     with Class {
  
  def center(): Location
  
  def contains(location: Location): Boolean
  
  def containsAny(locations: Any): Boolean
  
  def edges(): Any
  
  def include(location: Location): Unit
  
  def includeAll(locations: Any): Unit
  
  var nw: Location
  
  var options: ExtentOptions
  
  def overlaps(extent: Extent): Boolean
  
  var se: Location
  
  def toArray(): Any
}
object Extent {
  
  inline def apply(
    center: () => Location,
    contains: Location => Boolean,
    containsAny: Any => Boolean,
    edges: () => Any,
    include: Location => Unit,
    includeAll: Any => Unit,
    nw: Location,
    options: ExtentOptions,
    overlaps: Extent => Boolean,
    se: Location,
    toArray: () => Any
  ): Extent = {
    val __obj = js.Dynamic.literal(center = js.Any.fromFunction0(center), contains = js.Any.fromFunction1(contains), containsAny = js.Any.fromFunction1(containsAny), edges = js.Any.fromFunction0(edges), include = js.Any.fromFunction1(include), includeAll = js.Any.fromFunction1(includeAll), nw = nw.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], overlaps = js.Any.fromFunction1(overlaps), se = se.asInstanceOf[js.Any], toArray = js.Any.fromFunction0(toArray))
    __obj.asInstanceOf[Extent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Extent] (val x: Self) extends AnyVal {
    
    inline def setCenter(value: () => Location): Self = StObject.set(x, "center", js.Any.fromFunction0(value))
    
    inline def setContains(value: Location => Boolean): Self = StObject.set(x, "contains", js.Any.fromFunction1(value))
    
    inline def setContainsAny(value: Any => Boolean): Self = StObject.set(x, "containsAny", js.Any.fromFunction1(value))
    
    inline def setEdges(value: () => Any): Self = StObject.set(x, "edges", js.Any.fromFunction0(value))
    
    inline def setInclude(value: Location => Unit): Self = StObject.set(x, "include", js.Any.fromFunction1(value))
    
    inline def setIncludeAll(value: Any => Unit): Self = StObject.set(x, "includeAll", js.Any.fromFunction1(value))
    
    inline def setNw(value: Location): Self = StObject.set(x, "nw", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: ExtentOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOverlaps(value: Extent => Boolean): Self = StObject.set(x, "overlaps", js.Any.fromFunction1(value))
    
    inline def setSe(value: Location): Self = StObject.set(x, "se", value.asInstanceOf[js.Any])
    
    inline def setToArray(value: () => Any): Self = StObject.set(x, "toArray", js.Any.fromFunction0(value))
  }
}
