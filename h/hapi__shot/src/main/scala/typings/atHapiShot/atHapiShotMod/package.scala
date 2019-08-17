package typings.atHapiShot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atHapiShotMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.node.httpMod.ServerResponse
  import typings.node.streamMod.Readable

  type Headers = StringDictionary[String | js.Array[String]]
  type Listener = js.Function2[/* req */ SimulatedRequestObject, /* res */ SimulatedResponseObject, Unit]
  type SimulatedRequestObject = Readable
  type SimulatedResponseObject = ServerResponse
}
