package typings.httpsnippet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/*~ Write your module's methods and properties in this class */
@JSImport("httpsnippet", JSImport.Namespace)
@js.native
class ^ protected () extends HTTPSnippet {
  def this(data: Data) = this()
}
@JSImport("httpsnippet", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def addTarget(target: Target[String]): Unit = js.native
  
  def addTargetClient(target: String, client: TargetClient): Unit = js.native
  
  var availableTargets: js.Array[String] = js.native
  
  def extName(target: String): String = js.native
}
