package typings.atJupyterlabObservables.libObservablestringMod

import typings.atJupyterlabObservables.libModeldbMod.IObservable
import typings.atJupyterlabObservables.libObservablestringMod.IObservableStringNs.IChangedArgs
import typings.atPhosphorSignaling.atPhosphorSignalingMod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObservableString extends IObservable {
  /**
    * A signal emitted when the string has changed.
    */
  val changed: ISignal[this.type, IChangedArgs]
  /**
    * The value of the string.
    */
  var text: String
  /**
    * The type of the Observable.
    */
  @JSName("type")
  var type_IObservableString: typings.atJupyterlabObservables.atJupyterlabObservablesStrings.String
  /**
    * Set the ObservableString to an empty string.
    */
  def clear(): Unit
  /**
    * Insert a substring.
    *
    * @param index - The starting index.
    *
    * @param text - The substring to insert.
    */
  def insert(index: Double, text: String): Unit
  /**
    * Remove a substring.
    *
    * @param start - The starting index.
    *
    * @param end - The ending index.
    */
  def remove(start: Double, end: Double): Unit
}

object IObservableString {
  @scala.inline
  def apply(
    changed: ISignal[IObservableString, IChangedArgs],
    clear: () => Unit,
    dispose: () => Unit,
    insert: (Double, String) => Unit,
    isDisposed: Boolean,
    remove: (Double, Double) => Unit,
    text: String,
    `type`: typings.atJupyterlabObservables.atJupyterlabObservablesStrings.String
  ): IObservableString = {
    val __obj = js.Dynamic.literal(changed = changed, clear = js.Any.fromFunction0(clear), dispose = js.Any.fromFunction0(dispose), insert = js.Any.fromFunction2(insert), isDisposed = isDisposed, remove = js.Any.fromFunction2(remove), text = text)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IObservableString]
  }
}

