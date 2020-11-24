package typings.jupyterlabObservables.observablelistMod

import typings.jupyterlabObservables.jupyterlabObservablesStrings.List
import typings.jupyterlabObservables.observablelistMod.IObservableList.IChangedArgs
import typings.jupyterlabObservables.observablelistMod.ObservableList.IOptions
import typings.luminoSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/observables/lib/observablelist", "ObservableList")
@js.native
/**
  * Construct a new observable map.
  */
class ObservableList_[T] () extends IObservableList[T] {
  def this(options: IOptions[T]) = this()
  
  var _array: js.Any = js.native
  
  var _changed: js.Any = js.native
  
  var _isDisposed: js.Any = js.native
  
  var _itemCmp: js.Any = js.native
  
  /**
    * A signal emitted when the list has changed.
    */
  @JSName("changed")
  def changed_MObservableList_ : ISignal[this.type, IChangedArgs[T]] = js.native
  
  /**
    * Test whether the list has been disposed.
    */
  @JSName("isDisposed")
  def isDisposed_MObservableList_ : Boolean = js.native
  
  /**
    * The length of the list.
    */
  @JSName("length")
  def length_MObservableList_ : Double = js.native
  
  /**
    * The type of this object.
    */
  @JSName("type")
  def type_MObservableList_ : List = js.native
}
