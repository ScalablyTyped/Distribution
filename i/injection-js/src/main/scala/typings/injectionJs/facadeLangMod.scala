package typings.injectionJs

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.injectionJs.injectorMod.Injector
import typings.std.ArrayConstructor
import typings.std.Console
import typings.std.DateConstructor
import typings.std.JSON
import typings.std.MapConstructor
import typings.std.ObjectConstructor
import typings.std.PropertyKey
import typings.std.RegExpConstructor
import typings.std.SetConstructor
import typings.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object facadeLangMod {
  
  @JSImport("injection-js/facade/lang", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* note: abstract class */ @JSImport("injection-js/facade/lang", "DebugContext")
  @js.native
  open class DebugContext () extends StObject {
    
    def component: Any = js.native
    
    def componentRenderElement: Any = js.native
    
    def context: Any = js.native
    
    def injector: Injector = js.native
    
    def logError(console: Console, values: Any*): Unit = js.native
    
    def nodeIndex: Double | Null = js.native
    
    def providerTokens: js.Array[Any] = js.native
    
    def references: StringDictionary[Any] = js.native
    
    def renderNode: Any = js.native
  }
  
  object global extends Shortcut {
    
    @JSImport("injection-js/facade/lang", "global")
    @js.native
    val ^ : BrowserNodeGlobal = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("injection-js/facade/lang", "global.Array")
    @js.native
    open class Array[T] protected ()
      extends StObject
         with typings.std.Array[T] {
      /* standard es5 */
      def this(arrayLength: Double) = this()
      /* standard es5 */
      def this(items: T*) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("injection-js/facade/lang", "global.Date")
    @js.native
    /* standard es5 */
    open class Date ()
      extends StObject
         with typings.std.Date {
      def this(value: String) = this()
      def this(value: js.Date) = this()
      /* standard es5 */
      def this(value: Double) = this()
      /* standard scripthost */
      def this(vd: VarDate) = this()
      /**
        * Creates a new Date.
        * @param year The full year designation is required for cross-century date accuracy. If year is between 0 and 99 is used, then year is assumed to be 1900 + year.
        * @param monthIndex The month as a number between 0 and 11 (January to December).
        * @param date The date as a number between 1 and 31.
        * @param hours Must be supplied if minutes is supplied. A number from 0 to 23 (midnight to 11pm) that specifies the hour.
        * @param minutes Must be supplied if seconds is supplied. A number from 0 to 59 that specifies the minutes.
        * @param seconds Must be supplied if milliseconds is supplied. A number from 0 to 59 that specifies the seconds.
        * @param ms A number from 0 to 999 that specifies the milliseconds.
        */
      /* standard es5 */
      def this(year: Double, monthIndex: Double) = this()
      def this(year: Double, monthIndex: Double, date: Double) = this()
      def this(year: Double, monthIndex: Double, date: Double, hours: Double) = this()
      def this(year: Double, monthIndex: Double, date: Unit, hours: Double) = this()
      def this(year: Double, monthIndex: Double, date: Double, hours: Double, minutes: Double) = this()
      def this(year: Double, monthIndex: Double, date: Double, hours: Unit, minutes: Double) = this()
      def this(year: Double, monthIndex: Double, date: Unit, hours: Double, minutes: Double) = this()
      def this(year: Double, monthIndex: Double, date: Unit, hours: Unit, minutes: Double) = this()
      def this(year: Double, monthIndex: Double, date: Double, hours: Double, minutes: Double, seconds: Double) = this()
      def this(year: Double, monthIndex: Double, date: Double, hours: Double, minutes: Unit, seconds: Double) = this()
      def this(year: Double, monthIndex: Double, date: Double, hours: Unit, minutes: Double, seconds: Double) = this()
      def this(year: Double, monthIndex: Double, date: Double, hours: Unit, minutes: Unit, seconds: Double) = this()
      def this(year: Double, monthIndex: Double, date: Unit, hours: Double, minutes: Double, seconds: Double) = this()
      def this(year: Double, monthIndex: Double, date: Unit, hours: Double, minutes: Unit, seconds: Double) = this()
      def this(year: Double, monthIndex: Double, date: Unit, hours: Unit, minutes: Double, seconds: Double) = this()
      def this(year: Double, monthIndex: Double, date: Unit, hours: Unit, minutes: Unit, seconds: Double) = this()
      def this(
        year: Double,
        monthIndex: Double,
        date: Double,
        hours: Double,
        minutes: Double,
        seconds: Double,
        ms: Double
      ) = this()
      def this(
        year: Double,
        monthIndex: Double,
        date: Double,
        hours: Double,
        minutes: Double,
        seconds: Unit,
        ms: Double
      ) = this()
      def this(
        year: Double,
        monthIndex: Double,
        date: Double,
        hours: Double,
        minutes: Unit,
        seconds: Double,
        ms: Double
      ) = this()
      def this(
        year: Double,
        monthIndex: Double,
        date: Double,
        hours: Double,
        minutes: Unit,
        seconds: Unit,
        ms: Double
      ) = this()
      def this(
        year: Double,
        monthIndex: Double,
        date: Double,
        hours: Unit,
        minutes: Double,
        seconds: Double,
        ms: Double
      ) = this()
      def this(
        year: Double,
        monthIndex: Double,
        date: Double,
        hours: Unit,
        minutes: Double,
        seconds: Unit,
        ms: Double
      ) = this()
      def this(
        year: Double,
        monthIndex: Double,
        date: Double,
        hours: Unit,
        minutes: Unit,
        seconds: Double,
        ms: Double
      ) = this()
      def this(
        year: Double,
        monthIndex: Double,
        date: Double,
        hours: Unit,
        minutes: Unit,
        seconds: Unit,
        ms: Double
      ) = this()
      def this(
        year: Double,
        monthIndex: Double,
        date: Unit,
        hours: Double,
        minutes: Double,
        seconds: Double,
        ms: Double
      ) = this()
      def this(
        year: Double,
        monthIndex: Double,
        date: Unit,
        hours: Double,
        minutes: Double,
        seconds: Unit,
        ms: Double
      ) = this()
      def this(
        year: Double,
        monthIndex: Double,
        date: Unit,
        hours: Double,
        minutes: Unit,
        seconds: Double,
        ms: Double
      ) = this()
      def this(
        year: Double,
        monthIndex: Double,
        date: Unit,
        hours: Double,
        minutes: Unit,
        seconds: Unit,
        ms: Double
      ) = this()
      def this(
        year: Double,
        monthIndex: Double,
        date: Unit,
        hours: Unit,
        minutes: Double,
        seconds: Double,
        ms: Double
      ) = this()
      def this(
        year: Double,
        monthIndex: Double,
        date: Unit,
        hours: Unit,
        minutes: Double,
        seconds: Unit,
        ms: Double
      ) = this()
      def this(
        year: Double,
        monthIndex: Double,
        date: Unit,
        hours: Unit,
        minutes: Unit,
        seconds: Double,
        ms: Double
      ) = this()
      def this(
        year: Double,
        monthIndex: Double,
        date: Unit,
        hours: Unit,
        minutes: Unit,
        seconds: Unit,
        ms: Double
      ) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("injection-js/facade/lang", "global.Map")
    @js.native
    /* standard es2015.collection */
    open class Map[K, V] ()
      extends StObject
         with typings.std.Map[K, V] {
      def this(entries: js.Array[js.Tuple2[K, V]]) = this()
      def this(iterable: js.Iterable[js.Tuple2[K, V]]) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("injection-js/facade/lang", "global.Object")
    @js.native
    /* standard es5 */
    open class Object ()
      extends StObject
         with typings.std.Object {
      def this(value: Any) = this()
      
      /** The initial value of Object.prototype.constructor is the standard built-in Object constructor. */
      /* standard es5 */
      /* CompleteClass */
      var constructor: js.Function = js.native
      
      /**
        * Determines whether an object has a property with the specified name.
        * @param v A property name.
        */
      /* standard es5 */
      /* CompleteClass */
      override def hasOwnProperty(v: PropertyKey): Boolean = js.native
      
      /**
        * Determines whether a specified property is enumerable.
        * @param v A property name.
        */
      /* standard es5 */
      /* CompleteClass */
      override def propertyIsEnumerable(v: PropertyKey): Boolean = js.native
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("injection-js/facade/lang", "global.RegExp")
    @js.native
    open class RegExp protected ()
      extends StObject
         with typings.std.RegExp {
      def this(pattern: String) = this()
      /* standard es5 */
      def this(pattern: js.RegExp) = this()
      def this(pattern: String, flags: String) = this()
      def this(pattern: js.RegExp, flags: String) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("injection-js/facade/lang", "global.Set")
    @js.native
    /* standard es2015.collection */
    open class Set[T] ()
      extends StObject
         with typings.std.Set[T] {
      def this(values: js.Array[T]) = this()
    }
    
    type _To = BrowserNodeGlobal
    
    /* This means you don't have to write `^`, but can instead just say `global.foo` */
    override def _to: BrowserNodeGlobal = ^
  }
  
  inline def isPresent[T](obj: T): /* is std.NonNullable<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPresent")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is std.NonNullable<T> */ Boolean]
  
  inline def stringify(token: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(token.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait BrowserNodeGlobal extends StObject {
    
    /* standard es5 */
    def Array(): js.Array[Any]
    def Array(arrayLength: Double): js.Array[Any]
    /* standard es5 */
    def Array[T](items: T*): js.Array[T]
    @JSName("Array")
    var Array_Original: ArrayConstructor
    /* standard es5 */
    @JSName("Array")
    def Array_T[T](arrayLength: Double): js.Array[T]
    
    /* standard es5 */
    def Date(): String
    @JSName("Date")
    var Date_Original: DateConstructor
    
    var JSON: typings.std.JSON
    
    var Map: MapConstructor
    
    var Math: Any
    
    /* standard es5 */
    def Object(): Any
    /* standard es5 */
    def Object(value: Any): Any
    @JSName("Object")
    var Object_Original: ObjectConstructor
    
    var Reflect: Any
    
    def RegExp(pattern: String): js.RegExp
    def RegExp(pattern: String, flags: String): js.RegExp
    /* standard es5 */
    def RegExp(pattern: js.RegExp): js.RegExp
    def RegExp(pattern: js.RegExp, flags: String): js.RegExp
    @JSName("RegExp")
    var RegExp_Original: RegExpConstructor
    
    var Set: SetConstructor
    
    def assert(condition: Any): Unit
    
    var clearInterval: js.Function
    
    var clearTimeout: js.Function
    
    var encodeURI: js.Function
    
    var frameworkStabilizers: js.Array[js.Function]
    
    var getAllAngularRootElements: js.Function
    
    var getAllAngularTestabilities: js.Function
    
    var getAngularTestability: js.Function
    
    var setInterval: js.Function
    
    var setTimeout: js.Function
  }
  object BrowserNodeGlobal {
    
    inline def apply(
      Array: ArrayConstructor,
      Date: DateConstructor,
      JSON: JSON,
      Map: MapConstructor,
      Math: Any,
      Object: ObjectConstructor,
      Reflect: Any,
      RegExp: RegExpConstructor,
      Set: SetConstructor,
      assert: Any => Unit,
      clearInterval: js.Function,
      clearTimeout: js.Function,
      encodeURI: js.Function,
      frameworkStabilizers: js.Array[js.Function],
      getAllAngularRootElements: js.Function,
      getAllAngularTestabilities: js.Function,
      getAngularTestability: js.Function,
      setInterval: js.Function,
      setTimeout: js.Function
    ): BrowserNodeGlobal = {
      val __obj = js.Dynamic.literal(Array = Array.asInstanceOf[js.Any], Date = Date.asInstanceOf[js.Any], JSON = JSON.asInstanceOf[js.Any], Map = Map.asInstanceOf[js.Any], Math = Math.asInstanceOf[js.Any], Object = Object.asInstanceOf[js.Any], Reflect = Reflect.asInstanceOf[js.Any], RegExp = RegExp.asInstanceOf[js.Any], Set = Set.asInstanceOf[js.Any], assert = js.Any.fromFunction1(assert), clearInterval = clearInterval.asInstanceOf[js.Any], clearTimeout = clearTimeout.asInstanceOf[js.Any], encodeURI = encodeURI.asInstanceOf[js.Any], frameworkStabilizers = frameworkStabilizers.asInstanceOf[js.Any], getAllAngularRootElements = getAllAngularRootElements.asInstanceOf[js.Any], getAllAngularTestabilities = getAllAngularTestabilities.asInstanceOf[js.Any], getAngularTestability = getAngularTestability.asInstanceOf[js.Any], setInterval = setInterval.asInstanceOf[js.Any], setTimeout = setTimeout.asInstanceOf[js.Any])
      __obj.asInstanceOf[BrowserNodeGlobal]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BrowserNodeGlobal] (val x: Self) extends AnyVal {
      
      inline def setArray(value: ArrayConstructor): Self = StObject.set(x, "Array", value.asInstanceOf[js.Any])
      
      inline def setAssert(value: Any => Unit): Self = StObject.set(x, "assert", js.Any.fromFunction1(value))
      
      inline def setClearInterval(value: js.Function): Self = StObject.set(x, "clearInterval", value.asInstanceOf[js.Any])
      
      inline def setClearTimeout(value: js.Function): Self = StObject.set(x, "clearTimeout", value.asInstanceOf[js.Any])
      
      inline def setDate(value: DateConstructor): Self = StObject.set(x, "Date", value.asInstanceOf[js.Any])
      
      inline def setEncodeURI(value: js.Function): Self = StObject.set(x, "encodeURI", value.asInstanceOf[js.Any])
      
      inline def setFrameworkStabilizers(value: js.Array[js.Function]): Self = StObject.set(x, "frameworkStabilizers", value.asInstanceOf[js.Any])
      
      inline def setFrameworkStabilizersVarargs(value: js.Function*): Self = StObject.set(x, "frameworkStabilizers", js.Array(value*))
      
      inline def setGetAllAngularRootElements(value: js.Function): Self = StObject.set(x, "getAllAngularRootElements", value.asInstanceOf[js.Any])
      
      inline def setGetAllAngularTestabilities(value: js.Function): Self = StObject.set(x, "getAllAngularTestabilities", value.asInstanceOf[js.Any])
      
      inline def setGetAngularTestability(value: js.Function): Self = StObject.set(x, "getAngularTestability", value.asInstanceOf[js.Any])
      
      inline def setJSON(value: JSON): Self = StObject.set(x, "JSON", value.asInstanceOf[js.Any])
      
      inline def setMap(value: MapConstructor): Self = StObject.set(x, "Map", value.asInstanceOf[js.Any])
      
      inline def setMath(value: Any): Self = StObject.set(x, "Math", value.asInstanceOf[js.Any])
      
      inline def setObject(value: ObjectConstructor): Self = StObject.set(x, "Object", value.asInstanceOf[js.Any])
      
      inline def setReflect(value: Any): Self = StObject.set(x, "Reflect", value.asInstanceOf[js.Any])
      
      inline def setRegExp(value: RegExpConstructor): Self = StObject.set(x, "RegExp", value.asInstanceOf[js.Any])
      
      inline def setSet(value: SetConstructor): Self = StObject.set(x, "Set", value.asInstanceOf[js.Any])
      
      inline def setSetInterval(value: js.Function): Self = StObject.set(x, "setInterval", value.asInstanceOf[js.Any])
      
      inline def setSetTimeout(value: js.Function): Self = StObject.set(x, "setTimeout", value.asInstanceOf[js.Any])
    }
  }
}
