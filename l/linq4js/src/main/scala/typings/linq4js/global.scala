package typings.linq4js

import typings.linq4js.Linq4JS.OrderDirection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Linq4JS {
    
    @JSGlobal("Linq4JS.EvaluateCommand")
    @js.native
    class EvaluateCommand protected ()
      extends typings.linq4js.Linq4JS.EvaluateCommand {
      def this(command: String, identifier: String*) = this()
    }
    
    @JSGlobal("Linq4JS.EvaluateCommandResult")
    @js.native
    class EvaluateCommandResult protected ()
      extends typings.linq4js.Linq4JS.EvaluateCommandResult {
      def this(cmd: String, fn: String) = this()
    }
    
    @JSGlobal("Linq4JS.GeneratedEntity")
    @js.native
    class GeneratedEntity ()
      extends typings.linq4js.Linq4JS.GeneratedEntity
    
    @JSGlobal("Linq4JS.Helper")
    @js.native
    class Helper ()
      extends typings.linq4js.Linq4JS.Helper
    object Helper {
      
      @JSGlobal("Linq4JS.Helper")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSGlobal("Linq4JS.Helper.Commands")
      @js.native
      def Commands: Array[typings.linq4js.Linq4JS.EvaluateCommand] = js.native
      @scala.inline
      def Commands_=(x: Array[typings.linq4js.Linq4JS.EvaluateCommand]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Commands")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Linq4JS.Helper.ConvertFunction")
      @js.native
      def ConvertFunction[T](testFunction: T): T = js.native
      @JSGlobal("Linq4JS.Helper.ConvertFunction")
      @js.native
      def ConvertFunction[T](testFunction: T, noAutoReturn: js.UndefOr[scala.Nothing], noBracketReplace: Boolean): T = js.native
      @JSGlobal("Linq4JS.Helper.ConvertFunction")
      @js.native
      def ConvertFunction[T](testFunction: T, noAutoReturn: Boolean): T = js.native
      @JSGlobal("Linq4JS.Helper.ConvertFunction")
      @js.native
      def ConvertFunction[T](testFunction: T, noAutoReturn: Boolean, noBracketReplace: Boolean): T = js.native
      /* static member */
      @JSGlobal("Linq4JS.Helper.ConvertFunction")
      @js.native
      def ConvertFunction[T](testFunction: String): T = js.native
      @JSGlobal("Linq4JS.Helper.ConvertFunction")
      @js.native
      def ConvertFunction[T](testFunction: String, noAutoReturn: js.UndefOr[scala.Nothing], noBracketReplace: Boolean): T = js.native
      @JSGlobal("Linq4JS.Helper.ConvertFunction")
      @js.native
      def ConvertFunction[T](testFunction: String, noAutoReturn: Boolean): T = js.native
      @JSGlobal("Linq4JS.Helper.ConvertFunction")
      @js.native
      def ConvertFunction[T](testFunction: String, noAutoReturn: Boolean, noBracketReplace: Boolean): T = js.native
      
      /* static member */
      @JSGlobal("Linq4JS.Helper.ConvertStringFunction")
      @js.native
      def ConvertStringFunction: js.Any = js.native
      @scala.inline
      def ConvertStringFunction_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ConvertStringFunction")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("Linq4JS.Helper.CreateArrayData")
      @js.native
      def CreateArrayData(array: Array[_]): Unit = js.native
      @JSGlobal("Linq4JS.Helper.CreateArrayData")
      @js.native
      def CreateArrayData(array: Array[_], value: js.Any): Unit = js.native
      
      /* static member */
      @JSGlobal("Linq4JS.Helper.MatchCommand")
      @js.native
      def MatchCommand(cmd: String): typings.linq4js.Linq4JS.EvaluateCommandResult = js.native
      
      /* static member */
      @JSGlobal("Linq4JS.Helper.NonEnumerable")
      @js.native
      def NonEnumerable(name: String, value: js.Function): Unit = js.native
      
      /* static member */
      @JSGlobal("Linq4JS.Helper.OrderCompareFunction")
      @js.native
      def OrderCompareFunction[T](valueSelector: js.Function1[/* item */ T, _], a: T, b: T, invert: Boolean): Double = js.native
      
      /* static member */
      @JSGlobal("Linq4JS.Helper.SplitCommand")
      @js.native
      def SplitCommand(command: String): Array[String] = js.native
    }
    
    @JSGlobal("Linq4JS.OrderDirection")
    @js.native
    object OrderDirection extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.linq4js.Linq4JS.OrderDirection with Double] = js.native
      
      /* 0 */ val Ascending: typings.linq4js.Linq4JS.OrderDirection.Ascending with Double = js.native
      
      /* 1 */ val Descending: typings.linq4js.Linq4JS.OrderDirection.Descending with Double = js.native
    }
    
    @JSGlobal("Linq4JS.OrderEntry")
    @js.native
    class OrderEntry protected ()
      extends typings.linq4js.Linq4JS.OrderEntry {
      def this(_direction: OrderDirection, _valueSelector: js.Function1[/* item */ js.Any, _]) = this()
    }
    
    @JSGlobal("Linq4JS.SelectEntry")
    @js.native
    class SelectEntry protected ()
      extends typings.linq4js.Linq4JS.SelectEntry {
      def this(n: String, p: String) = this()
    }
  }
}
