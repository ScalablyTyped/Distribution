package typings.iniparser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("iniparser", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def parse[T](file: String, callback: js.Function2[/* err */ js.Any, /* data */ T, Unit]): Unit = js.native
  
  def parseString[T](data: String): T = js.native
  
  def parseSync[T](file: String): T = js.native
}
