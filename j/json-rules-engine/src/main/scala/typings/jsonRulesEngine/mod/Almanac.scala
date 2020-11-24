package typings.jsonRulesEngine.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("json-rules-engine", "Almanac")
@js.native
class Almanac () extends js.Object {
  
  def addRuntimeFact(factId: String, value: js.Any): Unit = js.native
  
  def factValue[T](factId: String): js.Promise[T] = js.native
  def factValue[T](factId: String, params: js.UndefOr[scala.Nothing], path: String): js.Promise[T] = js.native
  def factValue[T](factId: String, params: Record[String, _]): js.Promise[T] = js.native
  def factValue[T](factId: String, params: Record[String, _], path: String): js.Promise[T] = js.native
}
