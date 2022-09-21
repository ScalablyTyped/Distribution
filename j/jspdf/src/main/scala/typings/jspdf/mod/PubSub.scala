package typings.jspdf.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PubSub extends StObject {
  
  def getTopics(): Record[String, Record[String, js.Tuple2[js.Function1[/* repeated */ Any, Unit], Boolean]]] = js.native
  
  def publish(topic: String, args: Any*): Unit = js.native
  
  def subscribe(topic: String, callback: js.Function1[/* repeated */ Any, Unit]): String = js.native
  def subscribe(topic: String, callback: js.Function1[/* repeated */ Any, Unit], once: Boolean): String = js.native
  
  def unsubscribe(token: String): Boolean = js.native
}
