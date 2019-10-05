package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This class extends MVCObject. */
@JSGlobal("google.maps.MVCArray")
@js.native
/** A mutable MVC Array. */
class MVCArray[T] () extends MVCObject {
  def this(array: js.Array[T]) = this()
  /** Removes all elements from the array. */
  def clear(): Unit = js.native
  /**
    * Iterate over each element, calling the provided callback.
    * The callback is called for each element like: callback(element, index).
    */
  def forEach(callback: js.Function2[/* elem */ T, /* i */ Double, Unit]): Unit = js.native
  /**
    * Returns a reference to the underlying Array.
    * Warning: if the Array is mutated, no events will be fired by this object.
    */
  def getArray(): js.Array[T] = js.native
  /** Returns the element at the specified index. */
  def getAt(i: Double): T = js.native
  /** Returns the number of elements in this array. */
  def getLength(): Double = js.native
  /** Inserts an element at the specified index. */
  def insertAt(i: Double, elem: T): Unit = js.native
  /** Removes the last element of the array and returns that element. */
  def pop(): T = js.native
  /**
    * Adds one element to the end of the array and returns the new length of
    * the array.
    */
  def push(elem: T): Double = js.native
  /** Removes an element from the specified index. */
  def removeAt(i: Double): T = js.native
  /** Sets an element at the specified index. */
  def setAt(i: Double, elem: T): Unit = js.native
}

