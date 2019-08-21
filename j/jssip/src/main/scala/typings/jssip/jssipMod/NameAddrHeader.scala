package typings.jssip.jssipMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jssip", "NameAddrHeader")
@js.native
class NameAddrHeader protected () extends js.Object {
  def this(uri: URI) = this()
  def this(uri: URI, display_name: String) = this()
  def this(uri: URI, display_name: String, parameters: StringDictionary[String]) = this()
  var display_name: String = js.native
  var uri: URI = js.native
  def clearParams(): Unit = js.native
  def deleteParam(parameter: String): js.Any = js.native
  def getParam(key: String): js.UndefOr[String] = js.native
  def hasParam(key: String): Boolean = js.native
  def setParam(key: String, value: String): Unit = js.native
}

