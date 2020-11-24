package typings.jupyterlabObservables.observablemapMod

import typings.jupyterlabObservables.jupyterlabObservablesStrings.Map
import typings.jupyterlabObservables.observablemapMod.IObservableMap.IChangedArgs
import typings.jupyterlabObservables.observablemapMod.ObservableMap.IOptions
import typings.luminoSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/observables/lib/observablemap", "ObservableMap")
@js.native
/**
  * Construct a new observable map.
  */
class ObservableMap_[T] () extends IObservableMap[T] {
  def this(options: IOptions[T]) = this()
  
  var _changed: js.Any = js.native
  
  var _isDisposed: js.Any = js.native
  
  var _itemCmp: js.Any = js.native
  
  var _map: js.Any = js.native
  
  /**
    * A signal emitted when the map has changed.
    */
  @JSName("changed")
  def changed_MObservableMap_ : ISignal[this.type, IChangedArgs[T]] = js.native
  
  /**
    * Whether this map has been disposed.
    */
  @JSName("isDisposed")
  def isDisposed_MObservableMap_ : Boolean = js.native
  
  /**
    * The number of key-value pairs in the map.
    */
  @JSName("size")
  def size_MObservableMap_ : Double = js.native
  
  /**
    * The type of the Observable.
    */
  @JSName("type")
  def type_MObservableMap_ : Map = js.native
}
