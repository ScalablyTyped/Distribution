package typings.jupyterlabObservables.observablemapMod.ObservableMap

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to initialize an observable map.
  */
trait IOptions[T] extends js.Object {
  /**
    * The item comparison function for change detection on `set`.
    *
    * If not given, strict `===` equality will be used.
    */
  var itemCmp: js.UndefOr[js.Function2[/* first */ T, /* second */ T, Boolean]] = js.undefined
  /**
    * An optional initial set of values.
    */
  var values: js.UndefOr[StringDictionary[T]] = js.undefined
}

object IOptions {
  @scala.inline
  def apply[T](itemCmp: (/* first */ T, /* second */ T) => Boolean = null, values: StringDictionary[T] = null): IOptions[T] = {
    val __obj = js.Dynamic.literal()
    if (itemCmp != null) __obj.updateDynamic("itemCmp")(js.Any.fromFunction2(itemCmp))
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions[T]]
  }
}

