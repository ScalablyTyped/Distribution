package typings.libraDashCore.libAtGeneratedAccessUnderscorePathUnderscorePbMod.AccessPath

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var address: Uint8Array | String
  var path: Uint8Array | String
}

object AsObject {
  @scala.inline
  def apply(address: Uint8Array | String, path: Uint8Array | String): AsObject = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AsObject]
  }
}

