package typings.jupyterlabObservables.observablemapMod.IObservableMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The changed args object which is emitted by an observable map.
  */
@js.native
trait IChangedArgs[T] extends js.Object {
  
  /**
    * The key of the change.
    */
  var key: String = js.native
  
  /**
    * The new value of the change.
    */
  var newValue: js.UndefOr[T] = js.native
  
  /**
    * The old value of the change.
    */
  var oldValue: js.UndefOr[T] = js.native
  
  /**
    * The type of change undergone by the map.
    */
  var `type`: ChangeType = js.native
}
object IChangedArgs {
  
  @scala.inline
  def apply[T](key: String, `type`: ChangeType): IChangedArgs[T] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
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
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ChangeType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewValue(value: T): Self = this.set("newValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewValue: Self = this.set("newValue", js.undefined)
    
    @scala.inline
    def setOldValue(value: T): Self = this.set("oldValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOldValue: Self = this.set("oldValue", js.undefined)
  }
}
