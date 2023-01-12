package typings.hashset

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IHashSet[TValue] extends StObject {
  
  def add(value: TValue): Unit
  
  def addAll(arr: js.Array[TValue]): Unit
  
  def clear(): Unit
  
  def complement(set: IHashSet[TValue]): IHashSet[TValue]
  
  def contains(value: TValue): Boolean
  
  def intersection(set: IHashSet[TValue]): IHashSet[TValue]
  
  def isEmpty(): Boolean
  
  def isSubsetOf(set: IHashSet[TValue]): Boolean
  
  def remove(value: TValue): Unit
  
  def size(): Double
  
  def union(set: IHashSet[TValue]): IHashSet[TValue]
  
  def values(): js.Array[TValue]
}
object IHashSet {
  
  inline def apply[TValue](
    add: TValue => Unit,
    addAll: js.Array[TValue] => Unit,
    clear: () => Unit,
    complement: IHashSet[TValue] => IHashSet[TValue],
    contains: TValue => Boolean,
    intersection: IHashSet[TValue] => IHashSet[TValue],
    isEmpty: () => Boolean,
    isSubsetOf: IHashSet[TValue] => Boolean,
    remove: TValue => Unit,
    size: () => Double,
    union: IHashSet[TValue] => IHashSet[TValue],
    values: () => js.Array[TValue]
  ): IHashSet[TValue] = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), addAll = js.Any.fromFunction1(addAll), clear = js.Any.fromFunction0(clear), complement = js.Any.fromFunction1(complement), contains = js.Any.fromFunction1(contains), intersection = js.Any.fromFunction1(intersection), isEmpty = js.Any.fromFunction0(isEmpty), isSubsetOf = js.Any.fromFunction1(isSubsetOf), remove = js.Any.fromFunction1(remove), size = js.Any.fromFunction0(size), union = js.Any.fromFunction1(union), values = js.Any.fromFunction0(values))
    __obj.asInstanceOf[IHashSet[TValue]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IHashSet[?], TValue] (val x: Self & IHashSet[TValue]) extends AnyVal {
    
    inline def setAdd(value: TValue => Unit): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
    
    inline def setAddAll(value: js.Array[TValue] => Unit): Self = StObject.set(x, "addAll", js.Any.fromFunction1(value))
    
    inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    inline def setComplement(value: IHashSet[TValue] => IHashSet[TValue]): Self = StObject.set(x, "complement", js.Any.fromFunction1(value))
    
    inline def setContains(value: TValue => Boolean): Self = StObject.set(x, "contains", js.Any.fromFunction1(value))
    
    inline def setIntersection(value: IHashSet[TValue] => IHashSet[TValue]): Self = StObject.set(x, "intersection", js.Any.fromFunction1(value))
    
    inline def setIsEmpty(value: () => Boolean): Self = StObject.set(x, "isEmpty", js.Any.fromFunction0(value))
    
    inline def setIsSubsetOf(value: IHashSet[TValue] => Boolean): Self = StObject.set(x, "isSubsetOf", js.Any.fromFunction1(value))
    
    inline def setRemove(value: TValue => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
    
    inline def setSize(value: () => Double): Self = StObject.set(x, "size", js.Any.fromFunction0(value))
    
    inline def setUnion(value: IHashSet[TValue] => IHashSet[TValue]): Self = StObject.set(x, "union", js.Any.fromFunction1(value))
    
    inline def setValues(value: () => js.Array[TValue]): Self = StObject.set(x, "values", js.Any.fromFunction0(value))
  }
}
