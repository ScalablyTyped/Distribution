package typings.luminoDisposable

import typings.luminoSignaling.mod.ISignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@lumino/disposable", "DisposableDelegate")
  @js.native
  open class DisposableDelegate protected ()
    extends StObject
       with IDisposable {
    /**
      * Construct a new disposable delegate.
      *
      * @param fn - The callback function to invoke on dispose.
      */
    def this(fn: js.Function0[Unit]) = this()
    
    /* private */ var _fn: Any = js.native
    
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
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /**
      * Test whether the object has been disposed.
      *
      * #### Notes
      * This property is always safe to access.
      */
    /* CompleteClass */
    override val isDisposed: Boolean = js.native
    /**
      * Test whether the delegate has been disposed.
      */
    @JSName("isDisposed")
    def isDisposed_MDisposableDelegate: Boolean = js.native
  }
  
  @JSImport("@lumino/disposable", "DisposableSet")
  @js.native
  open class DisposableSet ()
    extends StObject
       with IDisposable {
    
    /* private */ var _isDisposed: Any = js.native
    
    /* private */ var _items: Any = js.native
    
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
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /**
      * Test whether the object has been disposed.
      *
      * #### Notes
      * This property is always safe to access.
      */
    /* CompleteClass */
    override val isDisposed: Boolean = js.native
    /**
      * Test whether the set has been disposed.
      */
    @JSName("isDisposed")
    def isDisposed_MDisposableSet: Boolean = js.native
    
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
    
    @JSImport("@lumino/disposable", "DisposableSet")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Create a disposable set from an iterable of items.
      *
      * @param items - The iterable object of interest.
      *
      * @returns A new disposable initialized with the given items.
      */
    inline def from(items: js.Iterable[IDisposable]): DisposableSet = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(items.asInstanceOf[js.Any]).asInstanceOf[DisposableSet]
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.luminoDisposable.mod.IDisposable because Already inherited
  - typings.luminoDisposable.mod.IObservableDisposable because var conflicts: isDisposed. Inlined disposed */ @JSImport("@lumino/disposable", "ObservableDisposableDelegate")
  @js.native
  open class ObservableDisposableDelegate protected () extends DisposableDelegate {
    /**
      * Construct a new disposable delegate.
      *
      * @param fn - The callback function to invoke on dispose.
      */
    def this(fn: js.Function0[Unit]) = this()
    
    /* private */ var _disposed: Any = js.native
    
    /**
      * A signal emitted when the delegate is disposed.
      */
    def disposed: ISignal[this.type, Unit] = js.native
    /**
      * A signal emitted when the object is disposed.
      */
    @JSName("disposed")
    val disposed_FObservableDisposableDelegate: ISignal[this.type, Unit] = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.luminoDisposable.mod.IDisposable because Already inherited
  - typings.luminoDisposable.mod.IObservableDisposable because var conflicts: isDisposed. Inlined disposed */ @JSImport("@lumino/disposable", "ObservableDisposableSet")
  @js.native
  open class ObservableDisposableSet () extends DisposableSet {
    
    /* private */ var _disposed: Any = js.native
    
    /**
      * A signal emitted when the set is disposed.
      */
    def disposed: ISignal[this.type, Unit] = js.native
    /**
      * A signal emitted when the object is disposed.
      */
    @JSName("disposed")
    val disposed_FObservableDisposableSet: ISignal[this.type, Unit] = js.native
  }
  object ObservableDisposableSet {
    
    @JSImport("@lumino/disposable", "ObservableDisposableSet")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Create an observable disposable set from an iterable of items.
      *
      * @param items - The iterable object of interest.
      *
      * @returns A new disposable initialized with the given items.
      */
    inline def from(items: js.Iterable[IDisposable]): ObservableDisposableSet = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(items.asInstanceOf[js.Any]).asInstanceOf[ObservableDisposableSet]
  }
  
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
    def dispose(): Unit
    
    /**
      * Test whether the object has been disposed.
      *
      * #### Notes
      * This property is always safe to access.
      */
    val isDisposed: Boolean
  }
  object IDisposable {
    
    inline def apply(dispose: () => Unit, isDisposed: Boolean): IDisposable = {
      val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), isDisposed = isDisposed.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDisposable]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IDisposable] (val x: Self) extends AnyVal {
      
      inline def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
      
      inline def setIsDisposed(value: Boolean): Self = StObject.set(x, "isDisposed", value.asInstanceOf[js.Any])
    }
  }
  
  trait IObservableDisposable
    extends StObject
       with IDisposable {
    
    /**
      * A signal emitted when the object is disposed.
      */
    val disposed: ISignal[this.type, Unit]
  }
  object IObservableDisposable {
    
    inline def apply(dispose: () => Unit, disposed: ISignal[IObservableDisposable, Unit], isDisposed: Boolean): IObservableDisposable = {
      val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), disposed = disposed.asInstanceOf[js.Any], isDisposed = isDisposed.asInstanceOf[js.Any])
      __obj.asInstanceOf[IObservableDisposable]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IObservableDisposable] (val x: Self) extends AnyVal {
      
      inline def setDisposed(value: ISignal[IObservableDisposable, Unit]): Self = StObject.set(x, "disposed", value.asInstanceOf[js.Any])
    }
  }
}
