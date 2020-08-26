package typings.googleapis.gamesV1Mod.gamesV1

import typings.googleapis.anon.Apnsdevicetoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for a push token ID resource.
  */
@js.native
trait SchemaPushTokenId extends js.Object {
  /**
    * A push token ID for iOS devices.
    */
  var ios: js.UndefOr[Apnsdevicetoken] = js.native
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#pushTokenId.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaPushTokenId {
  @scala.inline
  def apply(): SchemaPushTokenId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPushTokenId]
  }
  @scala.inline
  implicit class SchemaPushTokenIdOps[Self <: SchemaPushTokenId] (val x: Self) extends AnyVal {
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
    def setIos(value: Apnsdevicetoken): Self = this.set("ios", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIos: Self = this.set("ios", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
  
}

