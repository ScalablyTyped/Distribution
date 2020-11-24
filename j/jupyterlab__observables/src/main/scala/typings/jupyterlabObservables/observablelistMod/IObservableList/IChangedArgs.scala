package typings.jupyterlabObservables.observablelistMod.IObservableList

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The changed args object which is emitted by an observable list.
  */
@js.native
trait IChangedArgs[T] extends js.Object {
  
  /**
    * The new index associated with the change.
    */
  var newIndex: Double = js.native
  
  /**
    * The new values associated with the change.
    *
    * #### Notes
    * The values will be contiguous starting at the `newIndex`.
    */
  var newValues: js.Array[T] = js.native
  
  /**
    * The old index associated with the change.
    */
  var oldIndex: Double = js.native
  
  /**
    * The old values associated with the change.
    *
    * #### Notes
    * The values will be contiguous starting at the `oldIndex`.
    */
  var oldValues: js.Array[T] = js.native
  
  /**
    * The type of change undergone by the vector.
    */
  var `type`: ChangeType = js.native
}
object IChangedArgs {
  
  @scala.inline
  def apply[T](
    newIndex: Double,
    newValues: js.Array[T],
    oldIndex: Double,
    oldValues: js.Array[T],
    `type`: ChangeType
  ): IChangedArgs[T] = {
    val __obj = js.Dynamic.literal(newIndex = newIndex.asInstanceOf[js.Any], newValues = newValues.asInstanceOf[js.Any], oldIndex = oldIndex.asInstanceOf[js.Any], oldValues = oldValues.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IChangedArgs[T]]
  }
  
  @scala.inline
  implicit class IChangedArgsOps[Self <: IChangedArgs[_], T] (val x: Self with IChangedArgs[T]) extends AnyVal {
    
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
    def setNewIndex(value: Double): Self = this.set("newIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewValuesVarargs(value: T*): Self = this.set("newValues", js.Array(value :_*))
    
    @scala.inline
    def setNewValues(value: js.Array[T]): Self = this.set("newValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldIndex(value: Double): Self = this.set("oldIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldValuesVarargs(value: T*): Self = this.set("oldValues", js.Array(value :_*))
    
    @scala.inline
    def setOldValues(value: js.Array[T]): Self = this.set("oldValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ChangeType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
