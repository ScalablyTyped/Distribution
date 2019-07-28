package typings.linq4js.Linq4JSNs

import typings.linq4js.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Linq4JS.Helper")
@js.native
class Helper () extends js.Object

/* static members */
@JSGlobal("Linq4JS.Helper")
@js.native
object Helper extends js.Object {
  var Commands: Array[EvaluateCommand] = js.native
  var ConvertStringFunction: js.Any = js.native
  def ConvertFunction[T](testFunction: T): T = js.native
  def ConvertFunction[T](testFunction: T, noAutoReturn: Boolean): T = js.native
  def ConvertFunction[T](testFunction: T, noAutoReturn: Boolean, noBracketReplace: Boolean): T = js.native
  def ConvertFunction[T](testFunction: String): T = js.native
  def ConvertFunction[T](testFunction: String, noAutoReturn: Boolean): T = js.native
  def ConvertFunction[T](testFunction: String, noAutoReturn: Boolean, noBracketReplace: Boolean): T = js.native
  def CreateArrayData(array: Array[_]): Unit = js.native
  def CreateArrayData(array: Array[_], value: js.Any): Unit = js.native
  def MatchCommand(cmd: String): EvaluateCommandResult = js.native
  def NonEnumerable(name: String, value: js.Function): Unit = js.native
  def OrderCompareFunction[T](valueSelector: js.Function1[/* item */ T, _], a: T, b: T, invert: Boolean): Double = js.native
  def SplitCommand(command: String): Array[String] = js.native
}

