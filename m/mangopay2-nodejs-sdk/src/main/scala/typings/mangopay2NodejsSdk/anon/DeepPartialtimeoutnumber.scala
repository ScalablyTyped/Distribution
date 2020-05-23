package typings.mangopay2NodejsSdk.anon

import typings.mangopay2NodejsSdk.typesMod.DeepPartial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/types.DeepPartial<{  timeout  :number}> */
trait DeepPartialtimeoutnumber extends js.Object {
  var timeout: js.UndefOr[DeepPartial[Double]] = js.undefined
}

object DeepPartialtimeoutnumber {
  @scala.inline
  def apply(timeout: DeepPartial[Double] = null): DeepPartialtimeoutnumber = {
    val __obj = js.Dynamic.literal()
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeepPartialtimeoutnumber]
  }
}

