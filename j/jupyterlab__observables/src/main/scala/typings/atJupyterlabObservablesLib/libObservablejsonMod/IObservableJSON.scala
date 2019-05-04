package typings
package atJupyterlabObservablesLib.libObservablejsonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObservableJSON
  extends atJupyterlabObservablesLib.libObservablemapMod.IObservableMap[atPhosphorCoreutilsLib.libJsonMod.JSONValue] {
  /**
    * Serialize the model to JSON.
    */
  def toJSON(): atPhosphorCoreutilsLib.libJsonMod.JSONObject
}

object IObservableJSON {
  @scala.inline
  def apply(
    changed: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[
      IObservableJSON, 
      atJupyterlabObservablesLib.libObservablemapMod.IObservableMapNs.IChangedArgs[atPhosphorCoreutilsLib.libJsonMod.JSONValue]
    ],
    clear: () => scala.Unit,
    delete: java.lang.String => js.UndefOr[atPhosphorCoreutilsLib.libJsonMod.JSONValue],
    dispose: () => scala.Unit,
    get: java.lang.String => js.UndefOr[atPhosphorCoreutilsLib.libJsonMod.JSONValue],
    has: java.lang.String => scala.Boolean,
    isDisposed: scala.Boolean,
    keys: () => js.Array[java.lang.String],
    set: (java.lang.String, atPhosphorCoreutilsLib.libJsonMod.JSONValue) => js.UndefOr[atPhosphorCoreutilsLib.libJsonMod.JSONValue],
    size: scala.Double,
    toJSON: () => atPhosphorCoreutilsLib.libJsonMod.JSONObject,
    `type`: atJupyterlabObservablesLib.atJupyterlabObservablesLibStrings.Map,
    values: () => js.Array[atPhosphorCoreutilsLib.libJsonMod.JSONValue]
  ): IObservableJSON = {
    val __obj = js.Dynamic.literal(changed = changed, clear = js.Any.fromFunction0(clear), delete = js.Any.fromFunction1(delete), dispose = js.Any.fromFunction0(dispose), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), isDisposed = isDisposed, keys = js.Any.fromFunction0(keys), set = js.Any.fromFunction2(set), size = size, toJSON = js.Any.fromFunction0(toJSON), values = js.Any.fromFunction0(values))
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IObservableJSON]
  }
}

