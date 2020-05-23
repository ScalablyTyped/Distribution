package typings.linq4js

import typings.linq4js.Linq4JS.OrderDirection
import typings.std.RegExp
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
      /* CompleteClass */
      override var Command: String = js.native
      /* CompleteClass */
      override var Finder: Array[RegExp] = js.native
      /* CompleteClass */
      override var SplitRegex: Array[RegExp] = js.native
    }
    
    @js.native
    class EvaluateCommandResult protected ()
      extends typings.linq4js.Linq4JS.EvaluateCommandResult {
      def this(cmd: String, fn: String) = this()
      /* CompleteClass */
      override var Command: String = js.native
      /* CompleteClass */
      override var DynamicFunction: String = js.native
    }
    
    @js.native
    class GeneratedEntity ()
      extends typings.linq4js.Linq4JS.GeneratedEntity {
      /* CompleteClass */
      override var Id: Double = js.native
      /* CompleteClass */
      override var _GeneratedId_ : Double = js.native
    }
    
    @js.native
    class Helper ()
      extends typings.linq4js.Linq4JS.Helper
    
    @js.native
    class OrderEntry protected ()
      extends typings.linq4js.Linq4JS.OrderEntry {
      def this(_direction: OrderDirection, _valueSelector: js.Function1[/* item */ js.Any, _]) = this()
      /* CompleteClass */
      override var Direction: OrderDirection = js.native
      /* CompleteClass */
      override def ValueSelector(item: js.Any): js.Any = js.native
    }
    
    @js.native
    class SelectEntry protected ()
      extends typings.linq4js.Linq4JS.SelectEntry {
      def this(n: String, p: String) = this()
      /* CompleteClass */
      override var name: String = js.native
      /* CompleteClass */
      override var property: String = js.native
    }
    
    /* static members */
    @js.native
    object Helper extends js.Object {
      var Commands: Array[typings.linq4js.Linq4JS.EvaluateCommand] = js.native
      var ConvertStringFunction: js.Any = js.native
      def ConvertFunction[T](testFunction: T): T = js.native
      def ConvertFunction[T](testFunction: T, noAutoReturn: Boolean): T = js.native
      def ConvertFunction[T](testFunction: T, noAutoReturn: Boolean, noBracketReplace: Boolean): T = js.native
      def ConvertFunction[T](testFunction: String): T = js.native
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

