package typings.kafkaNode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type BrokerMetadataResponse = org.scalablytyped.runtime.NumberDictionary[typings.kafkaNode.anon.Host]
  type CustomPartitioner = js.Function2[
    /* partitions */ js.Array[scala.Double], 
    /* key */ java.lang.String | typings.node.Buffer, 
    scala.Double
  ]
}
