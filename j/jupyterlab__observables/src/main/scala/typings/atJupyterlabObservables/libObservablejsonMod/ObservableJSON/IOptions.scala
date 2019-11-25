package typings.atJupyterlabObservables.libObservablejsonMod.ObservableJSON

import typings.atPhosphorCoreutils.libJsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options use to initialize an observable JSON object.
  */
trait IOptions extends js.Object {
  /**
    * The optional initial value for the object.
    */
  var values: js.UndefOr[JSONObject] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(values: JSONObject = null): IOptions = {
    val __obj = js.Dynamic.literal()
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

