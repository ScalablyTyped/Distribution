package typings.hapiHawk.utilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@hapi/hawk/lib/utils", "limits")
@js.native
object limits extends js.Object {
  
  /** Limit the length of uris and headers to avoid a DoS attack on string matching */
  var maxMatchLength: Double = js.native
}
