package typings.atJupyterlabObservables.libModeldbMod

import typings.atJupyterlabObservables.atJupyterlabObservablesStrings.Map
import typings.atJupyterlabObservables.libObservablemapMod.IObservableMap
import typings.atJupyterlabObservables.libObservablemapMod.IObservableMap.IChangedArgs
import typings.atPhosphorSignaling.atPhosphorSignalingMod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICollaboratorMap extends IObservableMap[ICollaborator] {
  /**
    * The local collaborator on a model.
    */
  val localCollaborator: ICollaborator
}

object ICollaboratorMap {
  @scala.inline
  def apply(
    changed: ISignal[ICollaboratorMap, IChangedArgs[ICollaborator]],
    clear: () => Unit,
    delete: String => js.UndefOr[ICollaborator],
    dispose: () => Unit,
    get: String => js.UndefOr[ICollaborator],
    has: String => Boolean,
    isDisposed: Boolean,
    keys: () => js.Array[String],
    localCollaborator: ICollaborator,
    set: (String, ICollaborator) => js.UndefOr[ICollaborator],
    size: Double,
    `type`: Map,
    values: () => js.Array[ICollaborator]
  ): ICollaboratorMap = {
    val __obj = js.Dynamic.literal(changed = changed.asInstanceOf[js.Any], clear = js.Any.fromFunction0(clear), delete = js.Any.fromFunction1(delete), dispose = js.Any.fromFunction0(dispose), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), isDisposed = isDisposed.asInstanceOf[js.Any], keys = js.Any.fromFunction0(keys), localCollaborator = localCollaborator.asInstanceOf[js.Any], set = js.Any.fromFunction2(set), size = size.asInstanceOf[js.Any], values = js.Any.fromFunction0(values))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICollaboratorMap]
  }
}

