package typings
package atJupyterlabObservablesLib.libObservablestringMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObservableString
  extends atJupyterlabObservablesLib.libModeldbMod.IObservable {
  /**
    * A signal emitted when the string has changed.
    */
  val changed: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[
    this.type, 
    atJupyterlabObservablesLib.libObservablestringMod.IObservableStringNs.IChangedArgs
  ]
  /**
    * The value of the string.
    */
  var text: java.lang.String
  /**
    * The type of the Observable.
    */
  @JSName("type")
  var type_IObservableString: atJupyterlabObservablesLib.atJupyterlabObservablesLibStrings.String
  /**
    * Set the ObservableString to an empty string.
    */
  def clear(): scala.Unit
  /**
    * Insert a substring.
    *
    * @param index - The starting index.
    *
    * @param text - The substring to insert.
    */
  def insert(index: scala.Double, text: java.lang.String): scala.Unit
  /**
    * Remove a substring.
    *
    * @param start - The starting index.
    *
    * @param end - The ending index.
    */
  def remove(start: scala.Double, end: scala.Double): scala.Unit
}

object IObservableString {
  @scala.inline
  def apply(
    changed: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[
      IObservableString, 
      atJupyterlabObservablesLib.libObservablestringMod.IObservableStringNs.IChangedArgs
    ],
    clear: () => scala.Unit,
    dispose: () => scala.Unit,
    insert: (scala.Double, java.lang.String) => scala.Unit,
    isDisposed: scala.Boolean,
    remove: (scala.Double, scala.Double) => scala.Unit,
    text: java.lang.String,
    `type`: atJupyterlabObservablesLib.atJupyterlabObservablesLibStrings.String
  ): IObservableString = {
    val __obj = js.Dynamic.literal(changed = changed, clear = js.Any.fromFunction0(clear), dispose = js.Any.fromFunction0(dispose), insert = js.Any.fromFunction2(insert), isDisposed = isDisposed, remove = js.Any.fromFunction2(remove), text = text)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IObservableString]
  }
}

