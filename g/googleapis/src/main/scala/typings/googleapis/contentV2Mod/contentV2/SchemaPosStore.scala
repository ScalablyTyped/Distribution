package typings.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Store resource.
  */
@js.native
trait SchemaPosStore extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#posStore&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The street address of the store.
    */
  var storeAddress: js.UndefOr[String] = js.native
  /**
    * A store identifier that is unique for the given merchant.
    */
  var storeCode: js.UndefOr[String] = js.native
}

object SchemaPosStore {
  @scala.inline
  def apply(kind: String = null, storeAddress: String = null, storeCode: String = null): SchemaPosStore = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (storeAddress != null) __obj.updateDynamic("storeAddress")(storeAddress.asInstanceOf[js.Any])
    if (storeCode != null) __obj.updateDynamic("storeCode")(storeCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPosStore]
  }
}

