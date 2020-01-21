package typings.jupyterlabCompleter

import typings.jupyterlabCompleter.widgetMod.Completer.IModel
import typings.jupyterlabCompleter.widgetMod.Completer.TypeMap
import typings.phosphorAlgorithm.iterMod.IterableOrArrayLike
import typings.phosphorSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/completer/lib/model", JSImport.Namespace)
@js.native
object modelMod extends js.Object {
  @js.native
  class CompleterModel () extends IModel {
    var _current: js.Any = js.native
    var _cursor: js.Any = js.native
    /**
      * Apply the query to the complete options list to return the matching subset.
      */
    var _filter: js.Any = js.native
    var _isDisposed: js.Any = js.native
    var _options: js.Any = js.native
    var _orderedTypes: js.Any = js.native
    var _original: js.Any = js.native
    var _query: js.Any = js.native
    /**
      * Reset the state of the model.
      */
    var _reset: js.Any = js.native
    var _stateChanged: js.Any = js.native
    var _subsetMatch: js.Any = js.native
    var _typeMap: js.Any = js.native
    /**
      * Test whether the object has been disposed.
      *
      * #### Notes
      * This property is always safe to access.
      */
    /* CompleteClass */
    override val isDisposed: Boolean = js.native
    /**
      * A signal emitted when state of the completer menu changes.
      */
    @JSName("stateChanged")
    val stateChanged_CompleterModel: ISignal[this.type, Unit] = js.native
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
    def setOptions(newValue: IterableOrArrayLike[String], typeMap: TypeMap): Unit = js.native
  }
  
}

