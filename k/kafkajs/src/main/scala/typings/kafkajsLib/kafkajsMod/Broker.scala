package typings
package kafkajsLib.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Broker extends js.Object {
  def apiVersions(): js.Promise[org.scalablytyped.runtime.NumberDictionary[kafkajsLib.Anon_MaxVersion]]
  def connect(): js.Promise[scala.Unit]
  def disconnect(): js.Promise[scala.Unit]
  def isConnected(): scala.Boolean
  def metadata(topics: js.Array[java.lang.String]): js.Promise[kafkajsLib.Anon_Brokers]
  def offsetCommit(request: kafkajsLib.Anon_GroupGenerationId): js.Promise[_]
}

object Broker {
  @scala.inline
  def apply(
    apiVersions: () => js.Promise[org.scalablytyped.runtime.NumberDictionary[kafkajsLib.Anon_MaxVersion]],
    connect: () => js.Promise[scala.Unit],
    disconnect: () => js.Promise[scala.Unit],
    isConnected: () => scala.Boolean,
    metadata: js.Array[java.lang.String] => js.Promise[kafkajsLib.Anon_Brokers],
    offsetCommit: kafkajsLib.Anon_GroupGenerationId => js.Promise[_]
  ): Broker = {
    val __obj = js.Dynamic.literal(apiVersions = js.Any.fromFunction0(apiVersions), connect = js.Any.fromFunction0(connect), disconnect = js.Any.fromFunction0(disconnect), isConnected = js.Any.fromFunction0(isConnected), metadata = js.Any.fromFunction1(metadata), offsetCommit = js.Any.fromFunction1(offsetCommit))
  
    __obj.asInstanceOf[Broker]
  }
}

