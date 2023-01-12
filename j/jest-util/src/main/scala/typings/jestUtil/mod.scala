package typings.jestUtil

import typings.jestTypes.mod.BlockNameLike
import typings.jestTypes.mod.ConfigGlobals
import typings.node.processMod.global.NodeJS.WriteStream
import typings.std.Error
import typings.std.Set
import typings.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jest-util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("jest-util", "ErrorWithStack")
  @js.native
  open class ErrorWithStack protected ()
    extends StObject
       with Error {
    def this(message: String, callsite: js.Function1[/* repeated */ Any, Any]) = this()
    def this(message: Unit, callsite: js.Function1[/* repeated */ Any, Any]) = this()
    def this(message: String, callsite: js.Function1[/* repeated */ Any, Any], stackLimit: Double) = this()
    def this(message: Unit, callsite: js.Function1[/* repeated */ Any, Any], stackLimit: Double) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  inline def clearLine(stream: WriteStream): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearLine")(stream.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def convertDescriptorToString(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("convertDescriptorToString")().asInstanceOf[String]
  inline def convertDescriptorToString(descriptor: BlockNameLike): String = ^.asInstanceOf[js.Dynamic].applyDynamic("convertDescriptorToString")(descriptor.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def createDirectory(path: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("createDirectory")(path.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def deepCyclicCopy[T](value: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("deepCyclicCopy")(value.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def deepCyclicCopy[T](value: T, options: Unit, cycles: WeakMap[Any, Any]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("deepCyclicCopy")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any], cycles.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def deepCyclicCopy[T](value: T, options: DeepCyclicCopyOptions): T = (^.asInstanceOf[js.Dynamic].applyDynamic("deepCyclicCopy")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def deepCyclicCopy[T](value: T, options: DeepCyclicCopyOptions, cycles: WeakMap[Any, Any]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("deepCyclicCopy")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any], cycles.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def formatTime(time: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatTime")(time.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def formatTime(time: Double, prefixPower: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatTime")(time.asInstanceOf[js.Any], prefixPower.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def formatTime(time: Double, prefixPower: Double, padLeftLength: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatTime")(time.asInstanceOf[js.Any], prefixPower.asInstanceOf[js.Any], padLeftLength.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def formatTime(time: Double, prefixPower: Unit, padLeftLength: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatTime")(time.asInstanceOf[js.Any], prefixPower.asInstanceOf[js.Any], padLeftLength.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def globsToMatcher(globs: js.Array[String]): Matcher = ^.asInstanceOf[js.Dynamic].applyDynamic("globsToMatcher")(globs.asInstanceOf[js.Any]).asInstanceOf[Matcher]
  
  inline def installCommonGlobals(globalObject: /* globalThis */ Any, globals: ConfigGlobals): (/* globalThis */ Any) & ConfigGlobals = (^.asInstanceOf[js.Dynamic].applyDynamic("installCommonGlobals")(globalObject.asInstanceOf[js.Any], globals.asInstanceOf[js.Any])).asInstanceOf[(/* globalThis */ Any) & ConfigGlobals]
  
  inline def interopRequireDefault(obj: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("interopRequireDefault")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @JSImport("jest-util", "isInteractive")
  @js.native
  val isInteractive: Boolean = js.native
  
  inline def isPromise[T](candidate: Any): /* is std.PromiseLike<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPromise")(candidate.asInstanceOf[js.Any]).asInstanceOf[/* is std.PromiseLike<T> */ Boolean]
  
  inline def pluralize(word: String, count: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("pluralize")(word.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def replacePathSepForGlob(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("replacePathSepForGlob")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def requireOrImportModule[T](filePath: String): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("requireOrImportModule")(filePath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  inline def requireOrImportModule[T](filePath: String, applyInteropRequireDefault: Boolean): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("requireOrImportModule")(filePath.asInstanceOf[js.Any], applyInteropRequireDefault.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  
  inline def setGlobal(
    globalToMutate: /* globalThis */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Global.Global */ Any,
    key: String,
    value: Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setGlobal")(globalToMutate.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def testPathPatternToRegExp(testPathPattern: String): js.RegExp = ^.asInstanceOf[js.Dynamic].applyDynamic("testPathPatternToRegExp")(testPathPattern.asInstanceOf[js.Any]).asInstanceOf[js.RegExp]
  
  inline def tryRealpath(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("tryRealpath")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait DeepCyclicCopyOptions extends StObject {
    
    var blacklist: js.UndefOr[Set[String]] = js.undefined
    
    var keepPrototype: js.UndefOr[Boolean] = js.undefined
  }
  object DeepCyclicCopyOptions {
    
    inline def apply(): DeepCyclicCopyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeepCyclicCopyOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DeepCyclicCopyOptions] (val x: Self) extends AnyVal {
      
      inline def setBlacklist(value: Set[String]): Self = StObject.set(x, "blacklist", value.asInstanceOf[js.Any])
      
      inline def setBlacklistUndefined: Self = StObject.set(x, "blacklist", js.undefined)
      
      inline def setKeepPrototype(value: Boolean): Self = StObject.set(x, "keepPrototype", value.asInstanceOf[js.Any])
      
      inline def setKeepPrototypeUndefined: Self = StObject.set(x, "keepPrototype", js.undefined)
    }
  }
  
  type Matcher = js.Function1[/* str */ String, Boolean]
}
