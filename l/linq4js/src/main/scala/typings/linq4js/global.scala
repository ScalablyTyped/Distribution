package typings.linq4js

import typings.linq4js.Linq4JS.OrderDirection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Linq4JS {
    
    @JSGlobal("Linq4JS.EvaluateCommand")
    @js.native
    open class EvaluateCommand protected ()
      extends StObject
         with typings.linq4js.Linq4JS.EvaluateCommand {
      def this(command: String, identifier: String*) = this()
      
      /* CompleteClass */
      var Command: String = js.native
      
      /* CompleteClass */
      var Finder: Array[js.RegExp] = js.native
      
      /* CompleteClass */
      var SplitRegex: Array[js.RegExp] = js.native
    }
    
    @JSGlobal("Linq4JS.EvaluateCommandResult")
    @js.native
    open class EvaluateCommandResult protected ()
      extends StObject
         with typings.linq4js.Linq4JS.EvaluateCommandResult {
      def this(cmd: String, fn: String) = this()
      
      /* CompleteClass */
      var Command: String = js.native
      
      /* CompleteClass */
      var DynamicFunction: String = js.native
    }
    
    @JSGlobal("Linq4JS.GeneratedEntity")
    @js.native
    open class GeneratedEntity ()
      extends StObject
         with typings.linq4js.Linq4JS.GeneratedEntity {
      
      /* CompleteClass */
      var Id: Double = js.native
      
      /* CompleteClass */
      var _GeneratedId_ : Double = js.native
    }
    
    @JSGlobal("Linq4JS.Helper")
    @js.native
    open class Helper ()
      extends StObject
         with typings.linq4js.Linq4JS.Helper
    object Helper {
      
      @JSGlobal("Linq4JS.Helper")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSGlobal("Linq4JS.Helper.Commands")
      @js.native
      def Commands: Array[typings.linq4js.Linq4JS.EvaluateCommand] = js.native
      inline def Commands_=(x: Array[typings.linq4js.Linq4JS.EvaluateCommand]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Commands")(x.asInstanceOf[js.Any])
      
      inline def ConvertFunction[T](testFunction: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("ConvertFunction")(testFunction.asInstanceOf[js.Any]).asInstanceOf[T]
      inline def ConvertFunction[T](testFunction: T, noAutoReturn: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("ConvertFunction")(testFunction.asInstanceOf[js.Any], noAutoReturn.asInstanceOf[js.Any])).asInstanceOf[T]
      inline def ConvertFunction[T](testFunction: T, noAutoReturn: Boolean, noBracketReplace: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("ConvertFunction")(testFunction.asInstanceOf[js.Any], noAutoReturn.asInstanceOf[js.Any], noBracketReplace.asInstanceOf[js.Any])).asInstanceOf[T]
      inline def ConvertFunction[T](testFunction: T, noAutoReturn: Unit, noBracketReplace: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("ConvertFunction")(testFunction.asInstanceOf[js.Any], noAutoReturn.asInstanceOf[js.Any], noBracketReplace.asInstanceOf[js.Any])).asInstanceOf[T]
      /* static member */
      inline def ConvertFunction[T](testFunction: String): T = ^.asInstanceOf[js.Dynamic].applyDynamic("ConvertFunction")(testFunction.asInstanceOf[js.Any]).asInstanceOf[T]
      inline def ConvertFunction[T](testFunction: String, noAutoReturn: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("ConvertFunction")(testFunction.asInstanceOf[js.Any], noAutoReturn.asInstanceOf[js.Any])).asInstanceOf[T]
      inline def ConvertFunction[T](testFunction: String, noAutoReturn: Boolean, noBracketReplace: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("ConvertFunction")(testFunction.asInstanceOf[js.Any], noAutoReturn.asInstanceOf[js.Any], noBracketReplace.asInstanceOf[js.Any])).asInstanceOf[T]
      inline def ConvertFunction[T](testFunction: String, noAutoReturn: Unit, noBracketReplace: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("ConvertFunction")(testFunction.asInstanceOf[js.Any], noAutoReturn.asInstanceOf[js.Any], noBracketReplace.asInstanceOf[js.Any])).asInstanceOf[T]
      
      /* static member */
      @JSGlobal("Linq4JS.Helper.ConvertStringFunction")
      @js.native
      def ConvertStringFunction: Any = js.native
      inline def ConvertStringFunction_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ConvertStringFunction")(x.asInstanceOf[js.Any])
      
      /* static member */
      inline def CreateArrayData(array: Array[Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateArrayData")(array.asInstanceOf[js.Any]).asInstanceOf[Unit]
      inline def CreateArrayData(array: Array[Any], value: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateArrayData")(array.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      /* static member */
      inline def MatchCommand(cmd: String): typings.linq4js.Linq4JS.EvaluateCommandResult = ^.asInstanceOf[js.Dynamic].applyDynamic("MatchCommand")(cmd.asInstanceOf[js.Any]).asInstanceOf[typings.linq4js.Linq4JS.EvaluateCommandResult]
      
      /* static member */
      inline def NonEnumerable(name: String, value: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("NonEnumerable")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      /* static member */
      inline def OrderCompareFunction[T](valueSelector: js.Function1[/* item */ T, Any], a: T, b: T, invert: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("OrderCompareFunction")(valueSelector.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], invert.asInstanceOf[js.Any])).asInstanceOf[Double]
      
      /* static member */
      inline def SplitCommand(command: String): Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("SplitCommand")(command.asInstanceOf[js.Any]).asInstanceOf[Array[String]]
    }
    
    @JSGlobal("Linq4JS.OrderDirection")
    @js.native
    object OrderDirection extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.linq4js.Linq4JS.OrderDirection & Double] = js.native
      
      /* 0 */ val Ascending: typings.linq4js.Linq4JS.OrderDirection.Ascending & Double = js.native
      
      /* 1 */ val Descending: typings.linq4js.Linq4JS.OrderDirection.Descending & Double = js.native
    }
    
    @JSGlobal("Linq4JS.OrderEntry")
    @js.native
    open class OrderEntry protected ()
      extends StObject
         with typings.linq4js.Linq4JS.OrderEntry {
      def this(_direction: OrderDirection, _valueSelector: js.Function1[/* item */ Any, Any]) = this()
      
      /* CompleteClass */
      var Direction: OrderDirection = js.native
      
      /* CompleteClass */
      override def ValueSelector(item: Any): Any = js.native
    }
    
    @JSGlobal("Linq4JS.SelectEntry")
    @js.native
    open class SelectEntry protected ()
      extends StObject
         with typings.linq4js.Linq4JS.SelectEntry {
      def this(n: String, p: String) = this()
      
      /* CompleteClass */
      var name: String = js.native
      
      /* CompleteClass */
      var property: String = js.native
    }
  }
}
