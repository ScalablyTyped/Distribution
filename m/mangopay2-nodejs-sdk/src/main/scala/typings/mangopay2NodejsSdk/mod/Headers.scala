package typings.mangopay2NodejsSdk.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Headers
  extends /* header */ StringDictionary[js.UndefOr[String]] {
  var Authorization: String
  var `Content-Type`: String
  var `Idempotency-Key`: String
  var `User-Agent`: String
}

object Headers {
  @scala.inline
  def apply(
    Authorization: String,
    `Content-Type`: String,
    `Idempotency-Key`: String,
    `User-Agent`: String,
    StringDictionary: /* header */ StringDictionary[js.UndefOr[String]] = null
  ): Headers = {
    val __obj = js.Dynamic.literal(Authorization = Authorization.asInstanceOf[js.Any])
    __obj.updateDynamic("Content-Type")(`Content-Type`.asInstanceOf[js.Any])
    __obj.updateDynamic("Idempotency-Key")(`Idempotency-Key`.asInstanceOf[js.Any])
    __obj.updateDynamic("User-Agent")(`User-Agent`.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Headers]
  }
}

