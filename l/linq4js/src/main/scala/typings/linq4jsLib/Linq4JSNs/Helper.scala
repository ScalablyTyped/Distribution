package typings
package linq4jsLib.Linq4JSNs

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
  var Commands: linq4jsLib.Array[linq4jsLib.Linq4JSNs.EvaluateCommand] = js.native
  def ConvertFunction[T](testFunction: T): T = js.native
  def ConvertFunction[T](testFunction: T, noAutoReturn: scala.Boolean): T = js.native
  def ConvertFunction[T](testFunction: T, noAutoReturn: scala.Boolean, noBracketReplace: scala.Boolean): T = js.native
  def ConvertFunction[T](testFunction: java.lang.String): T = js.native
  def ConvertFunction[T](testFunction: java.lang.String, noAutoReturn: scala.Boolean): T = js.native
  def ConvertFunction[T](testFunction: java.lang.String, noAutoReturn: scala.Boolean, noBracketReplace: scala.Boolean): T = js.native
  /* private */ def ConvertStringFunction(functionString: js.Any): js.Any = js.native
  /* private */ def ConvertStringFunction(functionString: js.Any, noAutoReturn: js.Any): js.Any = js.native
  /* private */ def ConvertStringFunction(functionString: js.Any, noAutoReturn: js.Any, noBracketReplace: js.Any): js.Any = js.native
  def MatchCommand(cmd: java.lang.String): linq4jsLib.Linq4JSNs.EvaluateCommandResult = js.native
  def NonEnumerable(name: java.lang.String, value: js.Function): scala.Unit = js.native
  def OrderCompareFunction[T](valueSelector: js.Function1[/* item */ T, _], a: T, b: T, invert: scala.Boolean): scala.Double = js.native
  def SplitCommand(command: java.lang.String): linq4jsLib.Array[java.lang.String] = js.native
}

