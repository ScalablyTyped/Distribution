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
  def apply(ios: Apnsdevicetoken = null, kind: String = null): SchemaPushTokenId = {
    val __obj = js.Dynamic.literal()
    if (ios != null) __obj.updateDynamic("ios")(ios.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPushTokenId]
  }
}

