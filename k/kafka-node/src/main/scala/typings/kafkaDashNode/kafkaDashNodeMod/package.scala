package typings.kafkaDashNode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object kafkaDashNodeMod {
  import org.scalablytyped.runtime.NumberDictionary
  import typings.kafkaDashNode.Anon_Host
  import typings.node.Buffer

  type BrokerMetadataResponse = NumberDictionary[Anon_Host]
  type CustomPartitioner = js.Function2[/* partitions */ js.Array[Double], /* key */ String | Buffer, Double]
}
