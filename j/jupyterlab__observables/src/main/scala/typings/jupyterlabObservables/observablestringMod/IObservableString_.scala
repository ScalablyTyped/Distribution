package typings.jupyterlabObservables.observablestringMod

import typings.jupyterlabObservables.modeldbMod.IObservable
import typings.jupyterlabObservables.observablestringMod.IObservableString.IChangedArgs
import typings.luminoSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IObservableString_ extends IObservable {
  
  /**
    * A signal emitted when the string has changed.
    */
  val changed: ISignal[this.type, IChangedArgs] = js.native
  
  /**
    * Set the ObservableString to an empty string.
    */
  def clear(): Unit = js.native
  
  /**
    * Insert a substring.
    *
    * @param index - The starting index.
    *
    * @param text - The substring to insert.
    */
  def insert(index: Double, text: String): Unit = js.native
  
  /**
    * Remove a substring.
    *
    * @param start - The starting index.
    *
    * @param end - The ending index.
    */
  def remove(start: Double, end: Double): Unit = js.native
  
  /**
    * The value of the string.
    */
  var text: String = js.native
  
  /**
    * The type of the Observable.
    */
  @JSName("type")
  var type_IObservableString_ : typings.jupyterlabObservables.jupyterlabObservablesStrings.String = js.native
}
object IObservableString_ {
  
  @scala.inline
  def apply(
    changed: ISignal[IObservableString_, IChangedArgs],
    clear: () => Unit,
    dispose: () => Unit,
    insert: (Double, String) => Unit,
    isDisposed: Boolean,
    remove: (Double, Double) => Unit,
    text: String,
    `type`: typings.jupyterlabObservables.jupyterlabObservablesStrings.String
  ): IObservableString_ = {
    val __obj = js.Dynamic.literal(changed = changed.asInstanceOf[js.Any], clear = js.Any.fromFunction0(clear), dispose = js.Any.fromFunction0(dispose), insert = js.Any.fromFunction2(insert), isDisposed = isDisposed.asInstanceOf[js.Any], remove = js.Any.fromFunction2(remove), text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IObservableString_]
  }
  
  @scala.inline
  implicit class IObservableString_Ops[Self <: IObservableString_] (val x: Self) extends AnyVal {
    
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
    def setChanged(value: ISignal[IObservableString_, IChangedArgs]): Self = this.set("changed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClear(value: () => Unit): Self = this.set("clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInsert(value: (Double, String) => Unit): Self = this.set("insert", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRemove(value: (Double, Double) => Unit): Self = this.set("remove", js.Any.fromFunction2(value))
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.jupyterlabObservables.jupyterlabObservablesStrings.String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
