package typings.hapiShot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Headers = org.scalablytyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String]]
  type Listener = js.Function2[
    /* req */ typings.hapiShot.mod.SimulatedRequestObject, 
    /* res */ typings.hapiShot.mod.SimulatedResponseObject, 
    scala.Unit
  ]
  type SimulatedRequestObject = typings.node.streamMod.Readable
  type SimulatedResponseObject = typings.node.httpMod.ServerResponse
}
