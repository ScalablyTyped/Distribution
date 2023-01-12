package typings.igniteUi.Infragistics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OlapResult extends StObject {
  
  /**
    * Returns an array of $.ig.OlapResultAxis objects this result is built on.
    *
    * @param value
    */
  def axes(value: js.Object): js.Array[Any]
  
  /**
    * Returns an array of $.ig.OlapResultCell objects which hold the result data.
    *
    * @param value
    */
  def cells(value: js.Object): js.Array[Any]
  
  /**
    * Returns a value indicating whether the result object contains any data.
    *
    * @param value
    */
  def isEmpty(value: js.Object): Boolean
}
object OlapResult {
  
  inline def apply(axes: js.Object => js.Array[Any], cells: js.Object => js.Array[Any], isEmpty: js.Object => Boolean): OlapResult = {
    val __obj = js.Dynamic.literal(axes = js.Any.fromFunction1(axes), cells = js.Any.fromFunction1(cells), isEmpty = js.Any.fromFunction1(isEmpty))
    __obj.asInstanceOf[OlapResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OlapResult] (val x: Self) extends AnyVal {
    
    inline def setAxes(value: js.Object => js.Array[Any]): Self = StObject.set(x, "axes", js.Any.fromFunction1(value))
    
    inline def setCells(value: js.Object => js.Array[Any]): Self = StObject.set(x, "cells", js.Any.fromFunction1(value))
    
    inline def setIsEmpty(value: js.Object => Boolean): Self = StObject.set(x, "isEmpty", js.Any.fromFunction1(value))
  }
}
