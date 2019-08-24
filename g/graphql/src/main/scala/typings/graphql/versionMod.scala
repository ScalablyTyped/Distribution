package typings.graphql

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/version", JSImport.Namespace)
@js.native
object versionMod extends js.Object {
  val version: String = js.native
  @js.native
  object versionInfo extends js.Object {
    var major: Double = js.native
    var minor: Double = js.native
    var patch: Double = js.native
    var preReleaseTag: Double | Null = js.native
  }
  
}

