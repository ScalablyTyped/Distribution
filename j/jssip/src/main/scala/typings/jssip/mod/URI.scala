package typings.jssip.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jssip", "URI")
@js.native
class URI protected () extends StObject {
  def this(scheme: String, user: String, host: String) = this()
  def this(scheme: String, user: Null, host: String) = this()
  def this(scheme: Null, user: String, host: String) = this()
  def this(scheme: Null, user: Null, host: String) = this()
  def this(scheme: String, user: String, host: String, port: Double) = this()
  def this(scheme: String, user: Null, host: String, port: Double) = this()
  def this(scheme: Null, user: String, host: String, port: Double) = this()
  def this(scheme: Null, user: Null, host: String, port: Double) = this()
  def this(scheme: String, user: String, host: String, port: Double, parameters: StringDictionary[String]) = this()
  def this(scheme: String, user: String, host: String, port: Unit, parameters: StringDictionary[String]) = this()
  def this(scheme: String, user: Null, host: String, port: Double, parameters: StringDictionary[String]) = this()
  def this(scheme: String, user: Null, host: String, port: Unit, parameters: StringDictionary[String]) = this()
  def this(scheme: Null, user: String, host: String, port: Double, parameters: StringDictionary[String]) = this()
  def this(scheme: Null, user: String, host: String, port: Unit, parameters: StringDictionary[String]) = this()
  def this(scheme: Null, user: Null, host: String, port: Double, parameters: StringDictionary[String]) = this()
  def this(scheme: Null, user: Null, host: String, port: Unit, parameters: StringDictionary[String]) = this()
  def this(
    scheme: String,
    user: String,
    host: String,
    port: Double,
    parameters: StringDictionary[String],
    headers: StringDictionary[String]
  ) = this()
  def this(
    scheme: String,
    user: String,
    host: String,
    port: Double,
    parameters: Unit,
    headers: StringDictionary[String]
  ) = this()
  def this(
    scheme: String,
    user: String,
    host: String,
    port: Unit,
    parameters: StringDictionary[String],
    headers: StringDictionary[String]
  ) = this()
  def this(
    scheme: String,
    user: String,
    host: String,
    port: Unit,
    parameters: Unit,
    headers: StringDictionary[String]
  ) = this()
  def this(
    scheme: String,
    user: Null,
    host: String,
    port: Double,
    parameters: StringDictionary[String],
    headers: StringDictionary[String]
  ) = this()
  def this(
    scheme: String,
    user: Null,
    host: String,
    port: Double,
    parameters: Unit,
    headers: StringDictionary[String]
  ) = this()
  def this(
    scheme: String,
    user: Null,
    host: String,
    port: Unit,
    parameters: StringDictionary[String],
    headers: StringDictionary[String]
  ) = this()
  def this(
    scheme: String,
    user: Null,
    host: String,
    port: Unit,
    parameters: Unit,
    headers: StringDictionary[String]
  ) = this()
  def this(
    scheme: Null,
    user: String,
    host: String,
    port: Double,
    parameters: StringDictionary[String],
    headers: StringDictionary[String]
  ) = this()
  def this(
    scheme: Null,
    user: String,
    host: String,
    port: Double,
    parameters: Unit,
    headers: StringDictionary[String]
  ) = this()
  def this(
    scheme: Null,
    user: String,
    host: String,
    port: Unit,
    parameters: StringDictionary[String],
    headers: StringDictionary[String]
  ) = this()
  def this(
    scheme: Null,
    user: String,
    host: String,
    port: Unit,
    parameters: Unit,
    headers: StringDictionary[String]
  ) = this()
  def this(
    scheme: Null,
    user: Null,
    host: String,
    port: Double,
    parameters: StringDictionary[String],
    headers: StringDictionary[String]
  ) = this()
  def this(
    scheme: Null,
    user: Null,
    host: String,
    port: Double,
    parameters: Unit,
    headers: StringDictionary[String]
  ) = this()
  def this(
    scheme: Null,
    user: Null,
    host: String,
    port: Unit,
    parameters: StringDictionary[String],
    headers: StringDictionary[String]
  ) = this()
  def this(
    scheme: Null,
    user: Null,
    host: String,
    port: Unit,
    parameters: Unit,
    headers: StringDictionary[String]
  ) = this()
  
  def clearHeaders(): Unit = js.native
  
  def clearParams(): Unit = js.native
  
  def deleteHeader(header: String): Unit = js.native
  
  def deleteParam(parameter: String): Unit = js.native
  
  def getHeader(name: String): js.UndefOr[js.Array[String]] = js.native
  
  def getParam(key: String): js.UndefOr[String] = js.native
  
  def hasHeader(name: String): Boolean = js.native
  
  def hasParam(key: String): Boolean = js.native
  
  def setHeader(name: String, value: String): Unit = js.native
  
  def setParam(key: String): Unit = js.native
  def setParam(key: String, value: String): Unit = js.native
  
  def toAor(show_port: Boolean): String = js.native
}
object URI {
  
  @JSImport("jssip", "URI")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def parse(uri: String): URI = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(uri.asInstanceOf[js.Any]).asInstanceOf[URI]
}
