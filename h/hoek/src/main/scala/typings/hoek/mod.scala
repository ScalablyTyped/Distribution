package typings.hoek

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("hoek", "Bench")
  @js.native
  class Bench () extends StObject {
    
    /** The time (ms) elapsed since the timer was created. */
    def elapsed(): Double = js.native
    
    /** The number of milliseconds on the node clock elapsed since the epoch. */
    var ts: Double = js.native
  }
  
  @JSImport("hoek", "Timer")
  @js.native
  class Timer () extends StObject {
    
    /** The time (ms) elapsed since the timer was created. */
    def elapsed(): Double = js.native
    
    /** The number of milliseconds elapsed since the epoch. */
    var ts: Double = js.native
  }
  
  @JSImport("hoek", "abort")
  @js.native
  def abort(message: String): Unit = js.native
  @JSImport("hoek", "abort")
  @js.native
  def abort(message: Error): Unit = js.native
  
  @JSImport("hoek", "applyToDefaults")
  @js.native
  def applyToDefaults[T1, T2](defaults: T1, options: T2): T1 with T2 = js.native
  @JSImport("hoek", "applyToDefaults")
  @js.native
  def applyToDefaults[T1, T2](defaults: T1, options: T2, isNullOverride: Boolean): T1 with T2 = js.native
  
  @JSImport("hoek", "applyToDefaultsWithShallow")
  @js.native
  def applyToDefaultsWithShallow[T1, T2](defaults: T1, options: T2): T1 with T2 = js.native
  @JSImport("hoek", "applyToDefaultsWithShallow")
  @js.native
  def applyToDefaultsWithShallow[T1, T2](defaults: T1, options: T2, keys: js.Array[String]): T1 with T2 = js.native
  
  @JSImport("hoek", "assert")
  @js.native
  def assert(condition: Boolean, message: String): Unit | Error = js.native
  @JSImport("hoek", "assert")
  @js.native
  def assert(condition: Boolean, message: Error): Unit | Error = js.native
  
  @JSImport("hoek", "base64urlDecode")
  @js.native
  def base64urlDecode(value: String): String = js.native
  
  @JSImport("hoek", "base64urlEncode")
  @js.native
  def base64urlEncode(value: String): String = js.native
  
  @JSImport("hoek", "callStack")
  @js.native
  def callStack(): js.Array[_] = js.native
  @JSImport("hoek", "callStack")
  @js.native
  def callStack(slice: js.Any): js.Array[_] = js.native
  
  @JSImport("hoek", "cloneWithShallow")
  @js.native
  def cloneWithShallow(obj: js.Any, keys: js.Array[String]): js.Any = js.native
  
  @JSImport("hoek", "clone")
  @js.native
  def clone_[T](obj: T): T = js.native
  
  @JSImport("hoek", "contain")
  @js.native
  def contain(ref: js.Any, values: js.Any): Boolean = js.native
  @JSImport("hoek", "contain")
  @js.native
  def contain(ref: js.Any, values: js.Any, options: ContainOptions): Boolean = js.native
  
  @JSImport("hoek", "deepEqual")
  @js.native
  def deepEqual[T](b: T, a: T): T = js.native
  @JSImport("hoek", "deepEqual")
  @js.native
  def deepEqual[T](b: T, a: T, options: js.Any): T = js.native
  
  @JSImport("hoek", "displayStack")
  @js.native
  def displayStack(): js.Array[String] = js.native
  @JSImport("hoek", "displayStack")
  @js.native
  def displayStack(slice: js.Any): js.Array[String] = js.native
  
  @JSImport("hoek", "escapeHeaderAttribute")
  @js.native
  def escapeHeaderAttribute(attribute: String): String = js.native
  
  @JSImport("hoek", "escapeHtml")
  @js.native
  def escapeHtml(htmlString: String): String = js.native
  
  @JSImport("hoek", "escapeRegex")
  @js.native
  def escapeRegex(regexString: String): String = js.native
  
  @JSImport("hoek", "flatten")
  @js.native
  def flatten(array: js.Array[_]): js.Array[_] = js.native
  @JSImport("hoek", "flatten")
  @js.native
  def flatten(array: js.Array[_], target: js.Array[_]): js.Array[_] = js.native
  
  @JSImport("hoek", "ignore")
  @js.native
  def ignore(): Unit = js.native
  
  @JSImport("hoek", "intersect")
  @js.native
  def intersect(array1: js.Array[_], array2: js.Array[_]): js.Any = js.native
  
  @JSImport("hoek", "isInteger")
  @js.native
  def isInteger(value: js.Any): Boolean = js.native
  
  @JSImport("hoek", "mapToObject")
  @js.native
  def mapToObject(array: js.Array[_]): js.Any = js.native
  @JSImport("hoek", "mapToObject")
  @js.native
  def mapToObject(array: js.Array[_], key: String): js.Any = js.native
  
  @JSImport("hoek", "merge")
  @js.native
  def merge[T1, T2](target: T1, source: T2): T1 with T2 = js.native
  @JSImport("hoek", "merge")
  @js.native
  def merge[T1, T2](target: T1, source: T2, isNullOverride: js.UndefOr[scala.Nothing], isMergeArrays: Boolean): T1 with T2 = js.native
  @JSImport("hoek", "merge")
  @js.native
  def merge[T1, T2](target: T1, source: T2, isNullOverride: Boolean): T1 with T2 = js.native
  @JSImport("hoek", "merge")
  @js.native
  def merge[T1, T2](target: T1, source: T2, isNullOverride: Boolean, isMergeArrays: Boolean): T1 with T2 = js.native
  
  @JSImport("hoek", "nextTick")
  @js.native
  def nextTick(fn: js.Function0[Unit]): js.Function0[Unit] = js.native
  
  @JSImport("hoek", "once")
  @js.native
  def once(fn: js.Function0[Unit]): js.Function0[Unit] = js.native
  
  @JSImport("hoek", "reach")
  @js.native
  def reach(obj: js.Any, chain: js.Any): js.Any = js.native
  @JSImport("hoek", "reach")
  @js.native
  def reach(obj: js.Any, chain: js.Any, options: ReachOptions): js.Any = js.native
  
  @JSImport("hoek", "reachTemplate")
  @js.native
  def reachTemplate(obj: js.Any, template: String): js.Any = js.native
  @JSImport("hoek", "reachTemplate")
  @js.native
  def reachTemplate(obj: js.Any, template: String, options: ReachOptions): js.Any = js.native
  
  @JSImport("hoek", "shallow")
  @js.native
  def shallow(obj: js.Any): js.Any = js.native
  
  @JSImport("hoek", "stringify")
  @js.native
  def stringify(obj: js.Any): String = js.native
  
  @JSImport("hoek", "transform")
  @js.native
  def transform(obj: js.Any, transform: js.Any): js.Any = js.native
  @JSImport("hoek", "transform")
  @js.native
  def transform(obj: js.Any, transform: js.Any, options: ReachOptions): js.Any = js.native
  
  @JSImport("hoek", "unique")
  @js.native
  def unique[T](array: js.Array[T]): js.Array[T] = js.native
  @JSImport("hoek", "unique")
  @js.native
  def unique[T](array: js.Array[T], key: String): js.Array[T] = js.native
  
  @JSImport("hoek", "uniqueFilename")
  @js.native
  def uniqueFilename(path: String): String = js.native
  @JSImport("hoek", "uniqueFilename")
  @js.native
  def uniqueFilename(path: String, extension: String): String = js.native
  
  @js.native
  trait ContainOptions extends StObject {
    
    /** Perform a deep comparison of the values? */
    var deep: js.UndefOr[Boolean] = js.native
    
    /** Allow only one occurrence of each value? */
    var once: js.UndefOr[Boolean] = js.native
    
    /** Don't allow values not explicitly listed? */
    var only: js.UndefOr[Boolean] = js.native
    
    /** Allow partial match of the values? */
    var part: js.UndefOr[Boolean] = js.native
  }
  object ContainOptions {
    
    @scala.inline
    def apply(): ContainOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContainOptions]
    }
    
    @scala.inline
    implicit class ContainOptionsMutableBuilder[Self <: ContainOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeep(value: Boolean): Self = StObject.set(x, "deep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeepUndefined: Self = StObject.set(x, "deep", js.undefined)
      
      @scala.inline
      def setOnce(value: Boolean): Self = StObject.set(x, "once", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnceUndefined: Self = StObject.set(x, "once", js.undefined)
      
      @scala.inline
      def setOnly(value: Boolean): Self = StObject.set(x, "only", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnlyUndefined: Self = StObject.set(x, "only", js.undefined)
      
      @scala.inline
      def setPart(value: Boolean): Self = StObject.set(x, "part", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPartUndefined: Self = StObject.set(x, "part", js.undefined)
    }
  }
  
  @js.native
  trait ReachOptions extends StObject {
    
    /** Value to return if the path or value is not present. Default is undefined. */
    var default: js.UndefOr[js.Any] = js.native
    
    /** Allow traversing functions for properties? */
    var functions: js.UndefOr[Boolean] = js.native
    
    /** String to split chain path on. Defaults to ".". */
    var separator: js.UndefOr[String] = js.native
    
    /** Throw an error on missing member? Default is false. */
    var strict: js.UndefOr[Boolean] = js.native
  }
  object ReachOptions {
    
    @scala.inline
    def apply(): ReachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReachOptions]
    }
    
    @scala.inline
    implicit class ReachOptionsMutableBuilder[Self <: ReachOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefault(value: js.Any): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      @scala.inline
      def setFunctions(value: Boolean): Self = StObject.set(x, "functions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFunctionsUndefined: Self = StObject.set(x, "functions", js.undefined)
      
      @scala.inline
      def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
      
      @scala.inline
      def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    }
  }
}
