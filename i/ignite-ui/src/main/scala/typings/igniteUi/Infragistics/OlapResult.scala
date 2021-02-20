package typings.igniteUi.Infragistics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OlapResult extends StObject {
  
  /**
    * Returns an array of $.ig.OlapResultAxis objects this result is built on.
    *
    * @param value
    */
  def axes(value: js.Object): js.Array[_] = js.native
  
  /**
    * Returns an array of $.ig.OlapResultCell objects which hold the result data.
    *
    * @param value
    */
  def cells(value: js.Object): js.Array[_] = js.native
  
  /**
    * Returns a value indicating whether the result object contains any data.
    *
    * @param value
    */
  def isEmpty(value: js.Object): Boolean = js.native
}
object OlapResult {
  
  @scala.inline
  def apply(axes: js.Object => js.Array[_], cells: js.Object => js.Array[_], isEmpty: js.Object => Boolean): OlapResult = {
    val __obj = js.Dynamic.literal(axes = js.Any.fromFunction1(axes), cells = js.Any.fromFunction1(cells), isEmpty = js.Any.fromFunction1(isEmpty))
    __obj.asInstanceOf[OlapResult]
  }
  
  @scala.inline
  implicit class OlapResultMutableBuilder[Self <: OlapResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAxes(value: js.Object => js.Array[_]): Self = StObject.set(x, "axes", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCells(value: js.Object => js.Array[_]): Self = StObject.set(x, "cells", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsEmpty(value: js.Object => Boolean): Self = StObject.set(x, "isEmpty", js.Any.fromFunction1(value))
  }
}
