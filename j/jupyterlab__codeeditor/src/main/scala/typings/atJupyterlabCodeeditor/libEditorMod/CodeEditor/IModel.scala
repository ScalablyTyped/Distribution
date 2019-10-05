package typings.atJupyterlabCodeeditor.libEditorMod.CodeEditor

import typings.atJupyterlabCoreutils.libInterfacesMod.IChangedArgs
import typings.atJupyterlabObservables.libModeldbMod.IModelDB
import typings.atJupyterlabObservables.libObservablemapMod.IObservableMap
import typings.atJupyterlabObservables.libObservablestringMod.IObservableString
import typings.atPhosphorDisposable.atPhosphorDisposableMod.IDisposable
import typings.atPhosphorSignaling.atPhosphorSignalingMod.ISignal
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
  var mimeTypeChanged: ISignal[IModel, IChangedArgs[String]]
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
    mimeTypeChanged: ISignal[IModel, IChangedArgs[String]],
    modelDB: IModelDB,
    selections: IObservableMap[js.Array[ITextSelection]],
    value: IObservableString
  ): IModel = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), isDisposed = isDisposed, mimeType = mimeType, mimeTypeChanged = mimeTypeChanged, modelDB = modelDB, selections = selections, value = value)
  
    __obj.asInstanceOf[IModel]
  }
}

