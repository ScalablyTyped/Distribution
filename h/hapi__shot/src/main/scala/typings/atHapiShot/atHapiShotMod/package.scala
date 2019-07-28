package typings.atHapiShot

import org.scalablytyped.runtime.StringDictionary
import typings.node.httpMod.ServerResponse
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atHapiShotMod {
  type Headers = StringDictionary[String | js.Array[String]]
  type Listener = js.Function2[/* req */ SimulatedRequestObject, /* res */ SimulatedResponseObject, Unit]
  type SimulatedRequestObject = Readable
  type SimulatedResponseObject = ServerResponse
}
