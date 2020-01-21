package typings.googleapis.gamesV1Mod.gamesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for a push token resource.
  */
@js.native
trait SchemaPushToken extends js.Object {
  /**
    * The revision of the client SDK used by your application, in the same
    * format that&#39;s used by revisions.check. Used to send backward
    * compatible messages. Format: [PLATFORM_TYPE]:[VERSION_NUMBER]. Possible
    * values of PLATFORM_TYPE are:   - IOS - Push token is for iOS
    */
  var clientRevision: js.UndefOr[String] = js.native
  /**
    * Unique identifier for this push token.
    */
  var id: js.UndefOr[SchemaPushTokenId] = js.native
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#pushToken.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The preferred language for notifications that are sent using this token.
    */
  var language: js.UndefOr[String] = js.native
}

object SchemaPushToken {
  @scala.inline
  def apply(
    clientRevision: String = null,
    id: SchemaPushTokenId = null,
    kind: String = null,
    language: String = null
  ): SchemaPushToken = {
    val __obj = js.Dynamic.literal()
    if (clientRevision != null) __obj.updateDynamic("clientRevision")(clientRevision.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPushToken]
  }
}

