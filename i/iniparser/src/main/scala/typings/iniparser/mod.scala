package typings.iniparser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("iniparser", "parse")
  @js.native
  def parse[T](file: String, callback: js.Function2[/* err */ js.Any, /* data */ T, Unit]): Unit = js.native
  
  @JSImport("iniparser", "parseString")
  @js.native
  def parseString[T](data: String): T = js.native
  
  @JSImport("iniparser", "parseSync")
  @js.native
  def parseSync[T](file: String): T = js.native
}
