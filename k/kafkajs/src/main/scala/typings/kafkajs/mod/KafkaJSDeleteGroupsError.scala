package typings.kafkajs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("kafkajs", "KafkaJSDeleteGroupsError")
@js.native
open class KafkaJSDeleteGroupsError protected () extends KafkaJSError {
  def this(e: String) = this()
  def this(e: js.Error) = this()
  def this(e: String, groups: js.Array[KafkaJSDeleteGroupsErrorGroups]) = this()
  def this(e: js.Error, groups: js.Array[KafkaJSDeleteGroupsErrorGroups]) = this()
  
  val groups: js.Array[DeleteGroupsResult] = js.native
}
