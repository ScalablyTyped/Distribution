package typings.atJupyterlabObservables.libObservablejsonMod

import typings.atJupyterlabObservables.atJupyterlabObservablesStrings.Map
import typings.atJupyterlabObservables.libObservablemapMod.IObservableMap
import typings.atJupyterlabObservables.libObservablemapMod.IObservableMapNs.IChangedArgs
import typings.atPhosphorCoreutils.libJsonMod.JSONObject
import typings.atPhosphorCoreutils.libJsonMod.JSONValue
import typings.atPhosphorSignaling.atPhosphorSignalingMod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObservableJSON extends IObservableMap[JSONValue] {
  /**
    * Serialize the model to JSON.
    */
  def toJSON(): JSONObject
}

object IObservableJSON {
  @scala.inline
  def apply(
    changed: ISignal[IObservableJSON, IChangedArgs[JSONValue]],
    clear: () => Unit,
    delete: String => js.UndefOr[JSONValue],
    dispose: () => Unit,
    get: String => js.UndefOr[JSONValue],
    has: String => Boolean,
    isDisposed: Boolean,
    keys: () => js.Array[String],
    set: (String, JSONValue) => js.UndefOr[JSONValue],
    size: Double,
    toJSON: () => JSONObject,
    `type`: Map,
    values: () => js.Array[JSONValue]
  ): IObservableJSON = {
    val __obj = js.Dynamic.literal(changed = changed, clear = js.Any.fromFunction0(clear), delete = js.Any.fromFunction1(delete), dispose = js.Any.fromFunction0(dispose), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), isDisposed = isDisposed, keys = js.Any.fromFunction0(keys), set = js.Any.fromFunction2(set), size = size, toJSON = js.Any.fromFunction0(toJSON), values = js.Any.fromFunction0(values))
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IObservableJSON]
  }
}

