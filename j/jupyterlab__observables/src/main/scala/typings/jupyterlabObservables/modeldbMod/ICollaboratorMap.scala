package typings.jupyterlabObservables.modeldbMod

import typings.jupyterlabObservables.jupyterlabObservablesStrings.Map
import typings.jupyterlabObservables.observablemapMod.IObservableMap
import typings.jupyterlabObservables.observablemapMod.IObservableMap.IChangedArgs
import typings.luminoSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICollaboratorMap extends IObservableMap[ICollaborator] {
  
  /**
    * The local collaborator on a model.
    */
  val localCollaborator: ICollaborator = js.native
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
  
  @scala.inline
  implicit class ICollaboratorMapOps[Self <: ICollaboratorMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLocalCollaborator(value: ICollaborator): Self = this.set("localCollaborator", value.asInstanceOf[js.Any])
  }
}
