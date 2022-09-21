package typings.hoek

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("hoek", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("hoek", "Bench")
  @js.native
  open class Bench () extends StObject {
    
    /** The time (ms) elapsed since the timer was created. */
    def elapsed(): Double = js.native
    
    /** The number of milliseconds on the node clock elapsed since the epoch. */
    var ts: Double = js.native
  }
  
  @JSImport("hoek", "Timer")
  @js.native
  open class Timer () extends StObject {
    
    /** The time (ms) elapsed since the timer was created. */
    def elapsed(): Double = js.native
    
    /** The number of milliseconds elapsed since the epoch. */
    var ts: Double = js.native
  }
  
  inline def abort(message: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("abort")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def abort(message: js.Error): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("abort")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def applyToDefaults[T1, T2](defaults: T1, options: T2): T1 & T2 = (^.asInstanceOf[js.Dynamic].applyDynamic("applyToDefaults")(defaults.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T1 & T2]
  inline def applyToDefaults[T1, T2](defaults: T1, options: T2, isNullOverride: Boolean): T1 & T2 = (^.asInstanceOf[js.Dynamic].applyDynamic("applyToDefaults")(defaults.asInstanceOf[js.Any], options.asInstanceOf[js.Any], isNullOverride.asInstanceOf[js.Any])).asInstanceOf[T1 & T2]
  
  inline def applyToDefaultsWithShallow[T1, T2](defaults: T1, options: T2): T1 & T2 = (^.asInstanceOf[js.Dynamic].applyDynamic("applyToDefaultsWithShallow")(defaults.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T1 & T2]
  inline def applyToDefaultsWithShallow[T1, T2](defaults: T1, options: T2, keys: js.Array[String]): T1 & T2 = (^.asInstanceOf[js.Dynamic].applyDynamic("applyToDefaultsWithShallow")(defaults.asInstanceOf[js.Any], options.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[T1 & T2]
  
  inline def assert(condition: Boolean, message: String): Unit | js.Error = (^.asInstanceOf[js.Dynamic].applyDynamic("assert")(condition.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit | js.Error]
  inline def assert(condition: Boolean, message: js.Error): Unit | js.Error = (^.asInstanceOf[js.Dynamic].applyDynamic("assert")(condition.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit | js.Error]
  
  inline def base64urlDecode(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("base64urlDecode")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def base64urlEncode(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("base64urlEncode")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def callStack(): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("callStack")().asInstanceOf[js.Array[Any]]
  inline def callStack(slice: Any): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("callStack")(slice.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  
  inline def cloneWithShallow(obj: Any, keys: js.Array[String]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneWithShallow")(obj.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def clone_[T](obj: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(obj.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def contain(ref: Any, values: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("contain")(ref.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def contain(ref: Any, values: Any, options: ContainOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("contain")(ref.asInstanceOf[js.Any], values.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def deepEqual[T](b: T, a: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("deepEqual")(b.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def deepEqual[T](b: T, a: T, options: Any): T = (^.asInstanceOf[js.Dynamic].applyDynamic("deepEqual")(b.asInstanceOf[js.Any], a.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def displayStack(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("displayStack")().asInstanceOf[js.Array[String]]
  inline def displayStack(slice: Any): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("displayStack")(slice.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def escapeHeaderAttribute(attribute: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeHeaderAttribute")(attribute.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def escapeHtml(htmlString: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeHtml")(htmlString.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def escapeRegex(regexString: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeRegex")(regexString.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def flatten(array: js.Array[Any]): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(array.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  inline def flatten(array: js.Array[Any], target: js.Array[Any]): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(array.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  inline def ignore(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ignore")().asInstanceOf[Unit]
  
  inline def intersect(array1: js.Array[Any], array2: js.Array[Any]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("intersect")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def isInteger(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInteger")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def mapToObject(array: js.Array[Any]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("mapToObject")(array.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def mapToObject(array: js.Array[Any], key: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mapToObject")(array.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def merge[T1, T2](target: T1, source: T2): T1 & T2 = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[T1 & T2]
  inline def merge[T1, T2](target: T1, source: T2, isNullOverride: Boolean): T1 & T2 = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any], isNullOverride.asInstanceOf[js.Any])).asInstanceOf[T1 & T2]
  inline def merge[T1, T2](target: T1, source: T2, isNullOverride: Boolean, isMergeArrays: Boolean): T1 & T2 = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any], isNullOverride.asInstanceOf[js.Any], isMergeArrays.asInstanceOf[js.Any])).asInstanceOf[T1 & T2]
  inline def merge[T1, T2](target: T1, source: T2, isNullOverride: Unit, isMergeArrays: Boolean): T1 & T2 = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any], isNullOverride.asInstanceOf[js.Any], isMergeArrays.asInstanceOf[js.Any])).asInstanceOf[T1 & T2]
  
  inline def nextTick(fn: js.Function0[Unit]): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("nextTick")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
  
  inline def once(fn: js.Function0[Unit]): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("once")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
  
  inline def reach(obj: Any, chain: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("reach")(obj.asInstanceOf[js.Any], chain.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def reach(obj: Any, chain: Any, options: ReachOptions): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("reach")(obj.asInstanceOf[js.Any], chain.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def reachTemplate(obj: Any, template: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("reachTemplate")(obj.asInstanceOf[js.Any], template.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def reachTemplate(obj: Any, template: String, options: ReachOptions): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("reachTemplate")(obj.asInstanceOf[js.Any], template.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def shallow(obj: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("shallow")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def stringify(obj: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def transform(obj: Any, transform: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(obj.asInstanceOf[js.Any], transform.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def transform(obj: Any, transform: Any, options: ReachOptions): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(obj.asInstanceOf[js.Any], transform.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def unique[T](array: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("unique")(array.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  inline def unique[T](array: js.Array[T], key: String): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("unique")(array.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def uniqueFilename(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("uniqueFilename")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def uniqueFilename(path: String, `extension`: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("uniqueFilename")(path.asInstanceOf[js.Any], `extension`.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait ContainOptions extends StObject {
    
    /** Perform a deep comparison of the values? */
    var deep: js.UndefOr[Boolean] = js.undefined
    
    /** Allow only one occurrence of each value? */
    var once: js.UndefOr[Boolean] = js.undefined
    
    /** Don't allow values not explicitly listed? */
    var only: js.UndefOr[Boolean] = js.undefined
    
    /** Allow partial match of the values? */
    var part: js.UndefOr[Boolean] = js.undefined
  }
  object ContainOptions {
    
    inline def apply(): ContainOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContainOptions]
    }
    
    extension [Self <: ContainOptions](x: Self) {
      
      inline def setDeep(value: Boolean): Self = StObject.set(x, "deep", value.asInstanceOf[js.Any])
      
      inline def setDeepUndefined: Self = StObject.set(x, "deep", js.undefined)
      
      inline def setOnce(value: Boolean): Self = StObject.set(x, "once", value.asInstanceOf[js.Any])
      
      inline def setOnceUndefined: Self = StObject.set(x, "once", js.undefined)
      
      inline def setOnly(value: Boolean): Self = StObject.set(x, "only", value.asInstanceOf[js.Any])
      
      inline def setOnlyUndefined: Self = StObject.set(x, "only", js.undefined)
      
      inline def setPart(value: Boolean): Self = StObject.set(x, "part", value.asInstanceOf[js.Any])
      
      inline def setPartUndefined: Self = StObject.set(x, "part", js.undefined)
    }
  }
  
  trait ReachOptions extends StObject {
    
    /** Value to return if the path or value is not present. Default is undefined. */
    var default: js.UndefOr[Any] = js.undefined
    
    /** Allow traversing functions for properties? */
    var functions: js.UndefOr[Boolean] = js.undefined
    
    /** String to split chain path on. Defaults to ".". */
    var separator: js.UndefOr[String] = js.undefined
    
    /** Throw an error on missing member? Default is false. */
    var strict: js.UndefOr[Boolean] = js.undefined
  }
  object ReachOptions {
    
    inline def apply(): ReachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReachOptions]
    }
    
    extension [Self <: ReachOptions](x: Self) {
      
      inline def setDefault(value: Any): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setFunctions(value: Boolean): Self = StObject.set(x, "functions", value.asInstanceOf[js.Any])
      
      inline def setFunctionsUndefined: Self = StObject.set(x, "functions", js.undefined)
      
      inline def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
      
      inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    }
  }
}
