package typings.googlemaps.google.maps

import typings.googlemaps.googlemapsStrings.insert_at
import typings.googlemaps.googlemapsStrings.remove_at
import typings.googlemaps.googlemapsStrings.set_at
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @see {@link https://developers.google.com/maps/documentation/javascript/reference/event#MVCArray Maps JavaScript API}
  */
@js.native
trait MVCArray[T]
  extends StObject
     with MVCObject {
  
  /**
    * @see {@link MVCArrayHandlerMap#insert_at insert_at} event
    * @see {@link MVCArrayHandlerMap#remove_at remove_at} event
    * @see {@link MVCArrayHandlerMap#set_at set_at} event
    */
  def addListener[N /* <: /* keyof googlemaps.google.maps.MVCArrayHandlerMap<this, T> */ insert_at | remove_at | set_at */](
    eventName: N,
    handler: /* import warning: importer.ImportType#apply Failed type conversion: googlemaps.google.maps.MVCArrayHandlerMap<this, T>[N] */ js.Any
  ): MapsEventListener = js.native
  
  /**
    * Removes all elements from the array.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/event#MVCArray.clear Maps JavaScript API}
    * @see {@link pop}
    * @see {@link removeAt}
    */
  def clear(): Unit = js.native
  
  /**
    * Iterate over each element, calling the provided callback. The callback is called for each element like:
    * `callback(element, index)`.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/event#MVCArray.forEach Maps JavaScript API}
    * @see {@link getArray}
    * @see {@link getAt}
    */
  def forEach(callback: js.Function2[/* elem */ T, /* i */ Double, Unit]): Unit = js.native
  
  /**
    * Returns a reference to the underlying Array. Warning: if the Array is mutated, no events will be fired by
    * this object.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/event#MVCArray.getArray Maps JavaScript API}
    * @see {@link forEach}
    * @see {@link getAt}
    */
  def getArray(): js.Array[T] = js.native
  
  /**
    * Returns the element at the specified index.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/event#MVCArray.getAt Maps JavaScript API}
    * @see {@link forEach}
    * @see {@link getArray}
    * @see {@link insertAt}
    * @see {@link removeAt}
    * @see {@link setAt}
    */
  def getAt(i: Double): T = js.native
  
  /**
    * Returns the number of elements in this array.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/event#MVCArray.getLength Maps JavaScript API}
    */
  def getLength(): Double = js.native
  
  /**
    * Inserts an element at the specified index.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/event#MVCArray.insertAt Maps JavaScript API}
    * @see {@link getAt}
    * @see {@link push}
    * @see {@link removeAt}
    * @see {@link setAt}
    * @see {@link MVCArrayHandlerMap#insert_at insert_at} event
    */
  def insertAt(i: Double, elem: T): Unit = js.native
  
  /**
    * Removes the last element of the array and returns that element.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/event#MVCArray.pop Maps JavaScript API}
    * @see {@link clear}
    * @see {@link removeAt}
    */
  def pop(): T = js.native
  
  /**
    * Adds one element to the end of the array and returns the new length of the array.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/event#MVCArray.push Maps JavaScript API}
    * @see {@link insertAt}
    * @see {@link setAt}
    */
  def push(elem: T): Double = js.native
  
  /**
    * Removes an element from the specified index.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/event#MVCArray.removeAt Maps JavaScript API}
    * @see {@link clear}
    * @see {@link getAt}
    * @see {@link insertAt}
    * @see {@link pop}
    * @see {@link setAt}
    * @see {@link MVCArrayHandlerMap#remove_at remove_at} event
    */
  def removeAt(i: Double): T = js.native
  
  /**
    * Sets an element at the specified index.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/event#MVCArray.setAt Maps JavaScript API}
    * @see {@link getAt}
    * @see {@link insertAt}
    * @see {@link push}
    * @see {@link removeAt}
    * @see {@link MVCArrayHandlerMap#set_at set_at} event
    */
  def setAt(i: Double, elem: T): Unit = js.native
}
