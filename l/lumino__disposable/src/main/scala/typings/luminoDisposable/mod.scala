package typings.luminoDisposable

import typings.luminoAlgorithm.iterMod.IterableOrArrayLike
import typings.luminoSignaling.mod.ISignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@lumino/disposable", "DisposableDelegate")
  @js.native
  class DisposableDelegate protected () extends IDisposable {
    /**
      * Construct a new disposable delegate.
      *
      * @param fn - The callback function to invoke on dispose.
      */
    def this(fn: js.Function0[Unit]) = this()
    
    var _fn: js.Any = js.native
  }
  
  @JSImport("@lumino/disposable", "DisposableSet")
  @js.native
  /**
    * Construct a new disposable set.
    */
  class DisposableSet () extends IDisposable {
    
    var _isDisposed: js.Any = js.native
    
    var _items: js.Any = js.native
    
    /**
      * Add a disposable item to the set.
      *
      * @param item - The item to add to the set.
      *
      * #### Notes
      * If the item is already contained in the set, this is a no-op.
      */
    def add(item: IDisposable): Unit = js.native
    
    /**
      * Remove all items from the set.
      */
    def clear(): Unit = js.native
    
    /**
      * Test whether the set contains a specific item.
      *
      * @param item - The item of interest.
      *
      * @returns `true` if the set contains the item, `false` otherwise.
      */
    def contains(item: IDisposable): Boolean = js.native
    
    /**
      * Remove a disposable item from the set.
      *
      * @param item - The item to remove from the set.
      *
      * #### Notes
      * If the item is not contained in the set, this is a no-op.
      */
    def remove(item: IDisposable): Unit = js.native
  }
  object DisposableSet {
    
    /**
      * Create a disposable set from an iterable of items.
      *
      * @param items - The iterable or array-like object of interest.
      *
      * @returns A new disposable initialized with the given items.
      */
    @JSImport("@lumino/disposable", "DisposableSet.from")
    @js.native
    def from(items: IterableOrArrayLike[IDisposable]): DisposableSet = js.native
  }
  
  @JSImport("@lumino/disposable", "ObservableDisposableDelegate")
  @js.native
  class ObservableDisposableDelegate protected ()
    extends DisposableDelegate
       with IObservableDisposable {
    /**
      * Construct a new disposable delegate.
      *
      * @param fn - The callback function to invoke on dispose.
      */
    def this(fn: js.Function0[Unit]) = this()
    
    var _disposed: js.Any = js.native
  }
  
  @JSImport("@lumino/disposable", "ObservableDisposableSet")
  @js.native
  /**
    * Construct a new disposable set.
    */
  class ObservableDisposableSet ()
    extends DisposableSet
       with IObservableDisposable {
    
    var _disposed: js.Any = js.native
  }
  object ObservableDisposableSet {
    
    /**
      * Create an observable disposable set from an iterable of items.
      *
      * @param items - The iterable or array-like object of interest.
      *
      * @returns A new disposable initialized with the given items.
      */
    @JSImport("@lumino/disposable", "ObservableDisposableSet.from")
    @js.native
    def from(items: IterableOrArrayLike[IDisposable]): ObservableDisposableSet = js.native
  }
  
  @js.native
  trait IDisposable extends StObject {
    
    /**
      * Dispose of the resources held by the object.
      *
      * #### Notes
      * If the object's `dispose` method is called more than once, all
      * calls made after the first will be a no-op.
      *
      * #### Undefined Behavior
      * It is undefined behavior to use any functionality of the object
      * after it has been disposed unless otherwise explicitly noted.
      */
    def dispose(): Unit = js.native
    
    /**
      * Test whether the object has been disposed.
      *
      * #### Notes
      * This property is always safe to access.
      */
    val isDisposed: Boolean = js.native
  }
  object IDisposable {
    
    @scala.inline
    def apply(dispose: () => Unit, isDisposed: Boolean): IDisposable = {
      val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), isDisposed = isDisposed.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDisposable]
    }
    
    @scala.inline
    implicit class IDisposableMutableBuilder[Self <: IDisposable] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsDisposed(value: Boolean): Self = StObject.set(x, "isDisposed", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IObservableDisposable extends IDisposable {
    
    /**
      * A signal emitted when the object is disposed.
      */
    val disposed: ISignal[this.type, Unit] = js.native
  }
  object IObservableDisposable {
    
    @scala.inline
    def apply(dispose: () => Unit, disposed: ISignal[IObservableDisposable, Unit], isDisposed: Boolean): IObservableDisposable = {
      val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), disposed = disposed.asInstanceOf[js.Any], isDisposed = isDisposed.asInstanceOf[js.Any])
      __obj.asInstanceOf[IObservableDisposable]
    }
    
    @scala.inline
    implicit class IObservableDisposableMutableBuilder[Self <: IObservableDisposable] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisposed(value: ISignal[IObservableDisposable, Unit]): Self = StObject.set(x, "disposed", value.asInstanceOf[js.Any])
    }
  }
}
