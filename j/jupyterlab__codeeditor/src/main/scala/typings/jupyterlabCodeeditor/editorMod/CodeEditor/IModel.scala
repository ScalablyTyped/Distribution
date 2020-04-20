package typings.jupyterlabCodeeditor.editorMod.CodeEditor

import typings.jupyterlabCoreutils.interfacesMod.IChangedArgs
import typings.jupyterlabObservables.modeldbMod.IModelDB
import typings.jupyterlabObservables.observablemapMod.IObservableMap
import typings.jupyterlabObservables.observablestringMod.IObservableString
import typings.luminoDisposable.mod.IDisposable
import typings.luminoSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An interface to manage selections by selection owners.
  *
  * #### Definitions
  * - a user code that has an associated uuid is called a selection owner, see `CodeEditor.ISelectionOwner`
  * - a selection belongs to a selection owner only if it is associated with the owner by an uuid, see `CodeEditor.ITextSelection`
  *
  * #### Read access
  * - any user code can observe any selection
  *
  * #### Write access
  * - if a user code is a selection owner then:
  *   - it can change selections belonging to it
  *   - but it must not change selections belonging to other selection owners
  * - otherwise it must not change any selection
  */
/**
  * An editor model.
  */
trait IModel extends IDisposable {
  /**
    * A mime type of the model.
    *
    * #### Notes
    * It is never `null`, the default mime type is `text/plain`.
    */
  var mimeType: String
  /**
    * A signal emitted when a property changes.
    */
  var mimeTypeChanged: ISignal[IModel, IChangedArgs[String, String, String]]
  /**
    * The underlying `IModelDB` instance in which model
    * data is stored.
    */
  val modelDB: IModelDB
  /**
    * The currently selected code.
    */
  val selections: IObservableMap[js.Array[ITextSelection]]
  /**
    * The text stored in the model.
    */
  val value: IObservableString
}

object IModel {
  @scala.inline
  def apply(
    dispose: () => Unit,
    isDisposed: Boolean,
    mimeType: String,
    mimeTypeChanged: ISignal[IModel, IChangedArgs[String, String, String]],
    modelDB: IModelDB,
    selections: IObservableMap[js.Array[ITextSelection]],
    value: IObservableString
  ): IModel = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), isDisposed = isDisposed.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any], mimeTypeChanged = mimeTypeChanged.asInstanceOf[js.Any], modelDB = modelDB.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IModel]
  }
}

