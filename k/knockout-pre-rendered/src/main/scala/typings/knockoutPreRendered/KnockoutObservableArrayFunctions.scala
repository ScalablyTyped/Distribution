package typings.knockoutPreRendered

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KnockoutObservableArrayFunctions[T] extends // Ko specific
/* key */ StringDictionary[KnockoutBindingHandler] {
  
  def destroy(destroyFunction: js.Function1[/* item */ T, Boolean]): Unit = js.native
  def destroy(item: T): Unit = js.native
  
  def destroyAll(): Unit = js.native
  def destroyAll(items: js.Array[T]): Unit = js.native
  
  // General Array functions
  def indexOf(searchElement: T): Double = js.native
  def indexOf(searchElement: T, fromIndex: Double): Double = js.native
  
  def pop(): T = js.native
  
  def push(items: T*): Unit = js.native
  
  def remove(item: T): js.Array[T] = js.native
  def remove(removeFunction: js.Function1[/* item */ T, Boolean]): js.Array[T] = js.native
  
  def removeAll(): js.Array[T] = js.native
  def removeAll(items: js.Array[T]): js.Array[T] = js.native
  
  def replace(oldItem: T, newItem: T): Unit = js.native
  
  def reverse(): js.Array[T] = js.native
  
  def shift(): T = js.native
  
  def slice(start: Double): js.Array[T] = js.native
  def slice(start: Double, end: Double): js.Array[T] = js.native
  
  def sort(): Unit = js.native
  def sort(compareFunction: js.Function2[/* left */ T, /* right */ T, Double]): Unit = js.native
  
  def splice(start: Double): js.Array[T] = js.native
  def splice(start: Double, deleteCount: Double, items: T*): js.Array[T] = js.native
  
  def unshift(items: T*): Double = js.native
}
