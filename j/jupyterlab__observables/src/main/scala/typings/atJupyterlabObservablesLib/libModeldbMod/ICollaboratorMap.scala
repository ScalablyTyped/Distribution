package typings
package atJupyterlabObservablesLib.libModeldbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICollaboratorMap
  extends atJupyterlabObservablesLib.libObservablemapMod.IObservableMap[ICollaborator] {
  /**
    * The local collaborator on a model.
    */
  val localCollaborator: ICollaborator
}

object ICollaboratorMap {
  @scala.inline
  def apply(
    changed: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[
      ICollaboratorMap, 
      atJupyterlabObservablesLib.libObservablemapMod.IObservableMapNs.IChangedArgs[ICollaborator]
    ],
    clear: () => scala.Unit,
    delete: java.lang.String => js.UndefOr[ICollaborator],
    dispose: () => scala.Unit,
    get: java.lang.String => js.UndefOr[ICollaborator],
    has: java.lang.String => scala.Boolean,
    isDisposed: scala.Boolean,
    keys: () => js.Array[java.lang.String],
    localCollaborator: ICollaborator,
    set: (java.lang.String, ICollaborator) => js.UndefOr[ICollaborator],
    size: scala.Double,
    `type`: atJupyterlabObservablesLib.atJupyterlabObservablesLibStrings.Map,
    values: () => js.Array[ICollaborator]
  ): ICollaboratorMap = {
    val __obj = js.Dynamic.literal(changed = changed, clear = js.Any.fromFunction0(clear), delete = js.Any.fromFunction1(delete), dispose = js.Any.fromFunction0(dispose), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), isDisposed = isDisposed, keys = js.Any.fromFunction0(keys), localCollaborator = localCollaborator, set = js.Any.fromFunction2(set), size = size, values = js.Any.fromFunction0(values))
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ICollaboratorMap]
  }
}

