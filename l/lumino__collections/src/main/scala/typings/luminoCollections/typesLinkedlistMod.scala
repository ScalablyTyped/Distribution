package typings.luminoCollections

import typings.luminoAlgorithm.typesRetroMod.IRetroable
import typings.luminoCollections.typesLinkedlistMod.LinkedList.INode
import typings.std.Iterable
import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLinkedlistMod {
  
  @JSImport("@lumino/collections/types/linkedlist", "LinkedList")
  @js.native
  open class LinkedList[T] ()
    extends StObject
       with Iterable[T]
       with IRetroable[T] {
    
    /* private */ var _first: Any = js.native
    
    /* private */ var _last: Any = js.native
    
    /* private */ var _size: Any = js.native
    
    /**
      * Add a value to the beginning of the list.
      *
      * @param value - The value to add to the beginning of the list.
      *
      * @returns The list node which holds the value.
      *
      * #### Complexity
      * Constant.
      */
    def addFirst(value: T): INode[T] = js.native
    
    /**
      * Add a value to the end of the list.
      *
      * @param value - The value to add to the end of the list.
      *
      * @returns The list node which holds the value.
      *
      * #### Complexity
      * Constant.
      */
    def addLast(value: T): INode[T] = js.native
    
    /**
      * Assign new values to the list, replacing all current values.
      *
      * @param values - The values to assign to the list.
      *
      * #### Complexity
      * Linear.
      */
    def assign(values: js.Iterable[T]): Unit = js.native
    
    /**
      * Remove all values from the list.
      *
      * #### Complexity
      * Linear.
      */
    def clear(): Unit = js.native
    
    /**
      * The first value in the list.
      *
      * This is `undefined` if the list is empty.
      *
      * #### Complexity
      * Constant.
      */
    def first: js.UndefOr[T] = js.native
    
    /**
      * The first node in the list.
      *
      * This is `null` if the list is empty.
      *
      * #### Complexity
      * Constant.
      */
    def firstNode: INode[T] | Null = js.native
    
    /**
      * Insert a value after a specific node in the list.
      *
      * @param value - The value to insert after the reference node.
      *
      * @param ref - The reference node of interest. If this is `null`,
      *   the value will be added to the end of the list.
      *
      * @returns The list node which holds the value.
      *
      * #### Notes
      * The reference node must be owned by the list.
      *
      * #### Complexity
      * Constant.
      */
    def insertAfter(value: T): INode[T] = js.native
    def insertAfter(value: T, ref: INode[T]): INode[T] = js.native
    
    /**
      * Insert a value before a specific node in the list.
      *
      * @param value - The value to insert before the reference node.
      *
      * @param ref - The reference node of interest. If this is `null`,
      *   the value will be added to the beginning of the list.
      *
      * @returns The list node which holds the value.
      *
      * #### Notes
      * The reference node must be owned by the list.
      *
      * #### Complexity
      * Constant.
      */
    def insertBefore(value: T): INode[T] = js.native
    def insertBefore(value: T, ref: INode[T]): INode[T] = js.native
    
    /**
      * Whether the list is empty.
      *
      * #### Complexity
      * Constant.
      */
    def isEmpty: Boolean = js.native
    
    /**
      * Create an iterator over the values in the list.
      *
      * @returns A new iterator starting with the first value.
      *
      * #### Complexity
      * Constant.
      */
    @JSName(js.Symbol.iterator)
    var iterator_LinkedList: js.Function0[IterableIterator[T]] = js.native
    
    /**
      * The last value in the list.
      *
      * This is `undefined` if the list is empty.
      *
      * #### Complexity
      * Constant.
      */
    def last: js.UndefOr[T] = js.native
    
    /**
      * The last node in the list.
      *
      * This is `null` if the list is empty.
      *
      * #### Complexity
      * Constant.
      */
    def lastNode: INode[T] | Null = js.native
    
    /**
      * The length of the list.
      *
      * #### Complexity
      * Constant.
      *
      * #### Notes
      * This is equivalent to `size`.
      *
      * This property is deprecated.
      */
    def length: Double = js.native
    
    /**
      * Create an iterator over the nodes in the list.
      *
      * @returns A new iterator starting with the first node.
      *
      * #### Complexity
      * Constant.
      */
    def nodes(): IterableIterator[INode[T]] = js.native
    
    /**
      * Remove and return the value at the end of the list.
      *
      * @returns The removed value, or `undefined` if the list is empty.
      *
      * #### Complexity
      * Constant.
      *
      * #### Notes
      * This is equivalent to `removeLast`.
      */
    def pop(): js.UndefOr[T] = js.native
    
    /**
      * Add a value to the end of the list.
      *
      * @param value - The value to add to the end of the list.
      *
      * #### Complexity
      * Constant.
      *
      * #### Notes
      * This is equivalent to `addLast`.
      */
    def push(value: T): Unit = js.native
    
    /**
      * Remove and return the value at the beginning of the list.
      *
      * @returns The removed value, or `undefined` if the list is empty.
      *
      * #### Complexity
      * Constant.
      */
    def removeFirst(): js.UndefOr[T] = js.native
    
    /**
      * Remove and return the value at the end of the list.
      *
      * @returns The removed value, or `undefined` if the list is empty.
      *
      * #### Complexity
      * Constant.
      */
    def removeLast(): js.UndefOr[T] = js.native
    
    /**
      * Remove a specific node from the list.
      *
      * @param node - The node to remove from the list.
      *
      * #### Complexity
      * Constant.
      *
      * #### Notes
      * The node must be owned by the list.
      */
    def removeNode(node: INode[T]): Unit = js.native
    
    /**
      * Get a reverse iterator over the object's values.
      *
      * @returns An iterator which yields the object's values in reverse.
      */
    /* CompleteClass */
    override def retro(): IterableIterator[T] = js.native
    
    /**
      * Create a reverse iterator over the nodes in the list.
      *
      * @returns A new iterator starting with the last node.
      *
      * #### Complexity
      * Constant.
      */
    def retroNodes(): IterableIterator[INode[T]] = js.native
    
    /**
      * Add a value to the beginning of the list.
      *
      * @param value - The value to add to the beginning of the list.
      *
      * #### Complexity
      * Constant.
      *
      * #### Notes
      * This is equivalent to `addFirst`.
      */
    def shift(value: T): Unit = js.native
    
    /**
      * The size of the list.
      *
      * #### Complexity
      * `O(1)`
      *
      * #### Notes
      * This is equivalent to `length`.
      */
    def size: Double = js.native
    
    /**
      * Remove and return the value at the beginning of the list.
      *
      * @returns The removed value, or `undefined` if the list is empty.
      *
      * #### Complexity
      * Constant.
      *
      * #### Notes
      * This is equivalent to `removeFirst`.
      */
    def unshift(): js.UndefOr[T] = js.native
  }
  object LinkedList {
    
    @JSImport("@lumino/collections/types/linkedlist", "LinkedList")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Create a linked list from an iterable of values.
      *
      * @param values - The iterable object of interest.
      *
      * @returns A new linked list initialized with the given values.
      *
      * #### Complexity
      * Linear.
      */
    inline def from[T](values: js.Iterable[T]): LinkedList[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(values.asInstanceOf[js.Any]).asInstanceOf[LinkedList[T]]
    
    /**
      * An object which represents a node in a linked list.
      *
      * #### Notes
      * User code will not create linked list nodes directly. Nodes
      * are created automatically when values are added to a list.
      */
    trait INode[T] extends StObject {
      
      /**
        * The linked list which created and owns the node.
        *
        * This will be `null` when the node is removed from the list.
        */
      val list: LinkedList[T] | Null
      
      /**
        * The next node in the list.
        *
        * This will be `null` when the node is the last node in the list
        * or when the node is removed from the list.
        */
      val next: INode[T] | Null
      
      /**
        * The previous node in the list.
        *
        * This will be `null` when the node is the first node in the list
        * or when the node is removed from the list.
        */
      val prev: INode[T] | Null
      
      /**
        * The user value stored in the node.
        */
      val value: T
    }
    object INode {
      
      inline def apply[T](value: T): INode[T] = {
        val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], list = null, next = null, prev = null)
        __obj.asInstanceOf[INode[T]]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: INode[?], T] (val x: Self & INode[T]) extends AnyVal {
        
        inline def setList(value: LinkedList[T]): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
        
        inline def setListNull: Self = StObject.set(x, "list", null)
        
        inline def setNext(value: INode[T]): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
        
        inline def setNextNull: Self = StObject.set(x, "next", null)
        
        inline def setPrev(value: INode[T]): Self = StObject.set(x, "prev", value.asInstanceOf[js.Any])
        
        inline def setPrevNull: Self = StObject.set(x, "prev", null)
        
        inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      }
    }
  }
}
