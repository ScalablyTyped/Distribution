package typings.mathjs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Parser extends StObject {
  
  def clear(): scala.Unit = js.native
  
  // eslint-disable-next-line @typescript-eslint/no-explicit-any
  def evaluate(expr: String): Any = js.native
  def evaluate(expr: js.Array[String]): Any = js.native
  
  // eslint-disable-next-line @typescript-eslint/no-explicit-any
  def get(variable: String): Any = js.native
  
  // eslint-disable-next-line @typescript-eslint/no-explicit-any
  def getAll(): StringDictionary[Any] = js.native
  
  // eslint-disable-next-line @typescript-eslint/no-explicit-any
  def set(variable: String, value: Any): scala.Unit = js.native
}
