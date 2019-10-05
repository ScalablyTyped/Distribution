package typings.linq4js

import typings.linq4js.Linq4JS.EvaluateCommand
import typings.linq4js.Linq4JS.EvaluateCommandResult
import typings.linq4js.Linq4JS.OrderDirection
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Linq4JS")
@js.native
object Linq4JS extends js.Object {
  @js.native
  class EvaluateCommand protected () extends js.Object {
    def this(command: String, identifier: String*) = this()
    var Command: String = js.native
    var Finder: Array[RegExp] = js.native
    var SplitRegex: Array[RegExp] = js.native
  }
  
  @js.native
  class EvaluateCommandResult protected () extends js.Object {
    def this(cmd: String, fn: String) = this()
    var Command: String = js.native
    var DynamicFunction: String = js.native
  }
  
  @js.native
  class GeneratedEntity () extends js.Object {
    var Id: Double = js.native
    var _GeneratedId_ : Double = js.native
  }
  
  @js.native
  class Helper () extends js.Object
  
  @js.native
  sealed trait OrderDirection extends js.Object
  
  @js.native
  class OrderEntry protected () extends js.Object {
    def this(_direction: OrderDirection, _valueSelector: js.Function1[/* item */ js.Any, _]) = this()
    var Direction: OrderDirection = js.native
    def ValueSelector(item: js.Any): js.Any = js.native
  }
  
  @js.native
  class SelectEntry protected () extends js.Object {
    def this(n: String, p: String) = this()
    var name: String = js.native
    var property: String = js.native
  }
  
  /* static members */
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
  
  @js.native
  object OrderDirection extends js.Object {
    @js.native
    sealed trait Ascending extends OrderDirection
    
    @js.native
    sealed trait Descending extends OrderDirection
    
    /* 0 */ val Ascending: typings.linq4js.Linq4JS.OrderDirection.Ascending with Double = js.native
    /* 1 */ val Descending: typings.linq4js.Linq4JS.OrderDirection.Descending with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[OrderDirection with Double] = js.native
  }
  
}

