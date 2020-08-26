package typings.linq4js

import typings.linq4js.Linq4JS.OrderDirection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  object Linq4JS extends js.Object {
    @js.native
    class EvaluateCommand protected ()
      extends typings.linq4js.Linq4JS.EvaluateCommand {
      def this(command: String, identifier: String*) = this()
    }
    
    @js.native
    class EvaluateCommandResult protected ()
      extends typings.linq4js.Linq4JS.EvaluateCommandResult {
      def this(cmd: String, fn: String) = this()
    }
    
    @js.native
    class GeneratedEntity ()
      extends typings.linq4js.Linq4JS.GeneratedEntity
    
    @js.native
    class Helper ()
      extends typings.linq4js.Linq4JS.Helper
    
    @js.native
    class OrderEntry protected ()
      extends typings.linq4js.Linq4JS.OrderEntry {
      def this(_direction: OrderDirection, _valueSelector: js.Function1[/* item */ js.Any, _]) = this()
    }
    
    @js.native
    class SelectEntry protected ()
      extends typings.linq4js.Linq4JS.SelectEntry {
      def this(n: String, p: String) = this()
    }
    
    /* static members */
    @js.native
    object Helper extends js.Object {
      var Commands: Array[typings.linq4js.Linq4JS.EvaluateCommand] = js.native
      var ConvertStringFunction: js.Any = js.native
      def ConvertFunction[T](testFunction: T): T = js.native
      def ConvertFunction[T](testFunction: T, noAutoReturn: js.UndefOr[scala.Nothing], noBracketReplace: Boolean): T = js.native
      def ConvertFunction[T](testFunction: T, noAutoReturn: Boolean): T = js.native
      def ConvertFunction[T](testFunction: T, noAutoReturn: Boolean, noBracketReplace: Boolean): T = js.native
      def ConvertFunction[T](testFunction: String): T = js.native
      def ConvertFunction[T](testFunction: String, noAutoReturn: js.UndefOr[scala.Nothing], noBracketReplace: Boolean): T = js.native
      def ConvertFunction[T](testFunction: String, noAutoReturn: Boolean): T = js.native
      def ConvertFunction[T](testFunction: String, noAutoReturn: Boolean, noBracketReplace: Boolean): T = js.native
      def CreateArrayData(array: Array[_]): Unit = js.native
      def CreateArrayData(array: Array[_], value: js.Any): Unit = js.native
      def MatchCommand(cmd: String): typings.linq4js.Linq4JS.EvaluateCommandResult = js.native
      def NonEnumerable(name: String, value: js.Function): Unit = js.native
      def OrderCompareFunction[T](valueSelector: js.Function1[/* item */ T, _], a: T, b: T, invert: Boolean): Double = js.native
      def SplitCommand(command: String): Array[String] = js.native
    }
    
    @js.native
    object OrderDirection extends js.Object {
      /* 0 */ val Ascending: typings.linq4js.Linq4JS.OrderDirection.Ascending with Double = js.native
      /* 1 */ val Descending: typings.linq4js.Linq4JS.OrderDirection.Descending with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.linq4js.Linq4JS.OrderDirection with Double] = js.native
    }
    
  }
  
}

