package typings.jupyterlabOutputarea.modelMod

import typings.jupyterlabObservables.observablelistMod.IObservableList
import typings.jupyterlabOutputarea.AnonLastModel
import typings.jupyterlabOutputarea.modelMod.IOutputAreaModel.ChangedArgs
import typings.jupyterlabOutputarea.modelMod.IOutputAreaModel.IContentFactory
import typings.jupyterlabOutputarea.modelMod.IOutputAreaModel.IOptions
import typings.jupyterlabRendermime.outputmodelMod.IOutputModel
import typings.phosphorSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/outputarea/lib/model", "OutputAreaModel")
@js.native
/**
  * Construct a new observable outputs instance.
  */
class OutputAreaModel () extends IOutputAreaModel {
  def this(options: IOptions) = this()
  /**
    * Add a copy of the item to the list.
    */
  var _add: js.Any = js.native
  var _changed: js.Any = js.native
  /**
    * Create an output item and hook up its signals.
    */
  var _createItem: js.Any = js.native
  var _isDisposed: js.Any = js.native
  var _lastName: js.Any = js.native
  var _lastStream: js.Any = js.native
  /**
    * Handle a change to an item.
    */
  var _onGenericChange: js.Any = js.native
  /**
    * Handle a change to the list.
    */
  var _onListChanged: js.Any = js.native
  var _stateChanged: js.Any = js.native
  var _trusted: js.Any = js.native
  /**
    * A signal emitted when the model changes.
    */
  @JSName("changed")
  val changed_OutputAreaModel: ISignal[this.type, ChangedArgs] = js.native
  /**
    * A flag that is set when we want to clear the output area
    * *after* the next addition to it.
    */
  var clearNext: Boolean = js.native
  /**
    * Test whether the object has been disposed.
    *
    * #### Notes
    * This property is always safe to access.
    */
  /* CompleteClass */
  override val isDisposed: Boolean = js.native
  /**
    * An observable list containing the output models
    * for this output area.
    */
  var list: IObservableList[IOutputModel] = js.native
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
    * Whether a new value should be consolidated with the previous output.
    *
    * This will only be called if the minimal criteria of both being stream
    * messages of the same type.
    */
  /* protected */ def shouldCombine(options: AnonLastModel): Boolean = js.native
}

@JSImport("@jupyterlab/outputarea/lib/model", "OutputAreaModel")
@js.native
object OutputAreaModel extends js.Object {
  /**
    * The default implementation of a `IModelOutputFactory`.
    */
  @js.native
  class ContentFactory () extends IContentFactory {
    /**
      * Create an output model.
      */
    /* CompleteClass */
    override def createOutputModel(options: typings.jupyterlabRendermime.outputmodelMod.IOutputModel.IOptions): IOutputModel = js.native
  }
  
  /**
    * The default output model factory.
    */
  val defaultContentFactory: ContentFactory = js.native
}

