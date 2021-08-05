package typings.jssip.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jssip", "NameAddrHeader")
@js.native
class NameAddrHeader protected () extends StObject {
  def this(uri: URI) = this()
  def this(uri: URI, display_name: String) = this()
  def this(uri: URI, display_name: String, parameters: StringDictionary[String]) = this()
  def this(uri: URI, display_name: Unit, parameters: StringDictionary[String]) = this()
  
  def clearParams(): Unit = js.native
  
  def deleteParam(parameter: String): js.Any = js.native
  
  var display_name: String = js.native
  
  def getParam(key: String): js.UndefOr[String] = js.native
  
  def hasParam(key: String): Boolean = js.native
  
  def setParam(key: String, value: String): Unit = js.native
  
  var uri: URI = js.native
}
object NameAddrHeader {
  
  @JSImport("jssip", "NameAddrHeader")
  @js.native
  val ^ : js.Any = js.native
  
  inline def parse(nameAddrHeader: String): NameAddrHeader = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(nameAddrHeader.asInstanceOf[js.Any]).asInstanceOf[NameAddrHeader]
}
