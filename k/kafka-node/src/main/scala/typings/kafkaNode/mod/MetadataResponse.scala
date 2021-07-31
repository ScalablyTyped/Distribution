package typings.kafkaNode.mod

import typings.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MetadataResponse
  extends StObject
     with Array[BrokerMetadataResponse | ClusterMetadataResponse] {
  
  var `0`: BrokerMetadataResponse = js.native
  
  var `1`: ClusterMetadataResponse = js.native
}
