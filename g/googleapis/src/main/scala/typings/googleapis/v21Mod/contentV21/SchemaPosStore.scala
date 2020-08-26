package typings.googleapis.v21Mod.contentV21

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
  def apply(): SchemaPosStore = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPosStore]
  }
  @scala.inline
  implicit class SchemaPosStoreOps[Self <: SchemaPosStore] (val x: Self) extends AnyVal {
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setStoreAddress(value: String): Self = this.set("storeAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStoreAddress: Self = this.set("storeAddress", js.undefined)
    @scala.inline
    def setStoreCode(value: String): Self = this.set("storeCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStoreCode: Self = this.set("storeCode", js.undefined)
  }
  
}

