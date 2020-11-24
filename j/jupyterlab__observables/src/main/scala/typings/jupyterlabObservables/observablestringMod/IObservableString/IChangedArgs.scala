package typings.jupyterlabObservables.observablestringMod.IObservableString

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The changed args object which is emitted by an observable string.
  */
@js.native
trait IChangedArgs extends js.Object {
  
  /**
    * The end index of the change.
    */
  var end: Double = js.native
  
  /**
    * The starting index of the change.
    */
  var start: Double = js.native
  
  /**
    * The type of change undergone by the list.
    */
  var `type`: ChangeType = js.native
  
  /**
    * The value of the change.
    *
    * ### Notes
    * If `ChangeType` is `set`, then
    * this is the new value of the string.
    *
    * If `ChangeType` is `insert` this is
    * the value of the inserted string.
    *
    * If `ChangeType` is remove this is the
    * value of the removed substring.
    */
  var value: String = js.native
}
object IChangedArgs {
  
  @scala.inline
  def apply(end: Double, start: Double, `type`: ChangeType, value: String): IChangedArgs = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IChangedArgs]
  }
  
  @scala.inline
  implicit class IChangedArgsOps[Self <: IChangedArgs] (val x: Self) extends AnyVal {
    
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
    def setEnd(value: Double): Self = this.set("end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: Double): Self = this.set("start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ChangeType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
