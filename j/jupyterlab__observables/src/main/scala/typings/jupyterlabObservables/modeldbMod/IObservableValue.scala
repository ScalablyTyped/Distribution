package typings.jupyterlabObservables.modeldbMod

import typings.jupyterlabObservables.jupyterlabObservablesStrings.Value
import typings.jupyterlabObservables.modeldbMod.ObservableValue.IChangedArgs
import typings.luminoCoreutils.jsonMod.PartialJSONValue
import typings.luminoSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IObservableValue extends IObservable {
  
  /**
    * The changed signal.
    */
  val changed: ISignal[IObservableValue, IChangedArgs] = js.native
  
  /**
    * Get the current value, or `undefined` if it has not been set.
    */
  def get(): js.UndefOr[PartialJSONValue] = js.native
  
  /**
    * Set the value.
    */
  def set(value: PartialJSONValue): Unit = js.native
  
  /**
    * The type of this object.
    */
  @JSName("type")
  val type_IObservableValue: Value = js.native
}
object IObservableValue {
  
  @scala.inline
  def apply(
    changed: ISignal[IObservableValue, IChangedArgs],
    dispose: () => Unit,
    get: () => js.UndefOr[PartialJSONValue],
    isDisposed: Boolean,
    set: PartialJSONValue => Unit,
    `type`: Value
  ): IObservableValue = {
    val __obj = js.Dynamic.literal(changed = changed.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), get = js.Any.fromFunction0(get), isDisposed = isDisposed.asInstanceOf[js.Any], set = js.Any.fromFunction1(set))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IObservableValue]
  }
  
  @scala.inline
  implicit class IObservableValueOps[Self <: IObservableValue] (val x: Self) extends AnyVal {
    
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
    def setChanged(value: ISignal[IObservableValue, IChangedArgs]): Self = this.set("changed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGet(value: () => js.UndefOr[PartialJSONValue]): Self = this.set("get", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSet(value: PartialJSONValue => Unit): Self = this.set("set", js.Any.fromFunction1(value))
    
    @scala.inline
    def setType(value: Value): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
