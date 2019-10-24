package typings.atJupyterlabDocregistry.libRegistryMod.DocumentRegistry

import typings.atJupyterlabObservables.libModeldbMod.IModelDB
import typings.atPhosphorCoreutils.libJsonMod.JSONValue
import typings.atPhosphorSignaling.atPhosphorSignalingMod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The interface for a document model that represents code.
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CodeEditor.IModel * / any */ trait ICodeModel extends IModel

object ICodeModel {
  @scala.inline
  def apply(
    contentChanged: ISignal[ICodeModel, Unit],
    defaultKernelLanguage: String,
    defaultKernelName: String,
    dirty: Boolean,
    dispose: () => Unit,
    fromJSON: js.Any => Unit,
    fromString: String => Unit,
    initialize: () => Unit,
    isDisposed: Boolean,
    modelDB: IModelDB,
    readOnly: Boolean,
    stateChanged: ISignal[ICodeModel, typings.atJupyterlabCoreutils.libInterfacesMod.IChangedArgs[_]],
    toJSON: () => JSONValue,
    toString: () => String
  ): ICodeModel = {
    val __obj = js.Dynamic.literal(contentChanged = contentChanged, defaultKernelLanguage = defaultKernelLanguage, defaultKernelName = defaultKernelName, dirty = dirty, dispose = js.Any.fromFunction0(dispose), fromJSON = js.Any.fromFunction1(fromJSON), fromString = js.Any.fromFunction1(fromString), initialize = js.Any.fromFunction0(initialize), isDisposed = isDisposed, modelDB = modelDB, readOnly = readOnly, stateChanged = stateChanged, toJSON = js.Any.fromFunction0(toJSON), toString = js.Any.fromFunction0(toString))
  
    __obj.asInstanceOf[ICodeModel]
  }
}

