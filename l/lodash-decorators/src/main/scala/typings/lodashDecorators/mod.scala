package typings.lodashDecorators

import typings.lodashDecorators.applicatorsMod.Applicator
import typings.lodashDecorators.commonMod.BiTypedDecorator
import typings.lodashDecorators.commonMod.BiTypedDecorator1
import typings.lodashDecorators.commonMod.BiTypedDecorator2
import typings.lodashDecorators.commonMod.BiTypedDecoratorN
import typings.lodashDecorators.commonMod.BiTypedMethodDecorator
import typings.lodashDecorators.commonMod.BiTypedMethodDecorator1
import typings.lodashDecorators.commonMod.InstanceChainData
import typings.lodashDecorators.commonMod.LodashDecorator
import typings.lodashDecorators.commonMod.LodashMethodDecorator
import typings.lodashDecorators.commonMod.ResolvableFunction
import typings.lodashDecorators.decoratorConfigMod.DecoratorConfigOptions
import typings.lodashDecorators.sharedMod.DebounceOptions
import typings.lodashDecorators.sharedMod.MemoizeConfig
import typings.lodashDecorators.sharedMod.ThrottleOptions
import typings.lodashDecorators.utilsMod.CompositeKeyWeakMap
import typings.std.ClassDecorator
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("lodash-decorators", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def AfterAll_(n: Double): LodashDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("AfterAll")(n.asInstanceOf[js.Any]).asInstanceOf[LodashDecorator]
  
  inline def After_(n: Double): LodashDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("After")(n.asInstanceOf[js.Any]).asInstanceOf[LodashDecorator]
  
  inline def Ary_(n: Double): LodashMethodDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Ary")(n.asInstanceOf[js.Any]).asInstanceOf[LodashMethodDecorator]
  
  @JSImport("lodash-decorators", "Attempt")
  @js.native
  val Attempt_ : BiTypedMethodDecorator = js.native
  
  inline def BeforeAll_(n: Double): LodashDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("BeforeAll")(n.asInstanceOf[js.Any]).asInstanceOf[LodashDecorator]
  
  inline def Before_(n: Double): LodashDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Before")(n.asInstanceOf[js.Any]).asInstanceOf[LodashDecorator]
  
  inline def BindAll_(): ClassDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("BindAll")().asInstanceOf[ClassDecorator]
  inline def BindAll_(methods: js.Array[String]): ClassDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("BindAll")(methods.asInstanceOf[js.Any]).asInstanceOf[ClassDecorator]
  
  @JSImport("lodash-decorators", "Bind")
  @js.native
  val Bind_ : BiTypedMethodDecorator1[js.Any] = js.native
  
  @JSImport("lodash-decorators", "CurryAll")
  @js.native
  val CurryAll_ : BiTypedDecorator1[Double] = js.native
  
  @JSImport("lodash-decorators", "CurryRightAll")
  @js.native
  val CurryRightAll_ : BiTypedMethodDecorator1[Double] = js.native
  
  @JSImport("lodash-decorators", "CurryRight")
  @js.native
  val CurryRight_ : BiTypedMethodDecorator1[Double] = js.native
  
  @JSImport("lodash-decorators", "Curry")
  @js.native
  val Curry_ : BiTypedMethodDecorator1[Double] = js.native
  
  inline def DebounceAll_(): LodashMethodDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("DebounceAll")().asInstanceOf[LodashMethodDecorator]
  inline def DebounceAll_(wait: Double): LodashMethodDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("DebounceAll")(wait.asInstanceOf[js.Any]).asInstanceOf[LodashMethodDecorator]
  inline def DebounceAll_(wait: Double, options: DebounceOptions): LodashMethodDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("DebounceAll")(wait.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[LodashMethodDecorator]
  inline def DebounceAll_(wait: Unit, options: DebounceOptions): LodashMethodDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("DebounceAll")(wait.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[LodashMethodDecorator]
  
  inline def Debounce_(): LodashDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Debounce")().asInstanceOf[LodashDecorator]
  inline def Debounce_(wait: Double): LodashDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Debounce")(wait.asInstanceOf[js.Any]).asInstanceOf[LodashDecorator]
  inline def Debounce_(wait: Double, options: DebounceOptions): LodashDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("Debounce")(wait.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[LodashDecorator]
  inline def Debounce_(wait: Unit, options: DebounceOptions): LodashDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("Debounce")(wait.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[LodashDecorator]
  
  @JSImport("lodash-decorators", "DecoratorConfig")
  @js.native
  class DecoratorConfig protected ()
    extends typings.lodashDecorators.factoryMod.DecoratorConfig {
    def this(execute: js.Function, applicator: Applicator) = this()
    def this(execute: js.Function, applicator: Applicator, options: DecoratorConfigOptions) = this()
  }
  
  @JSImport("lodash-decorators", "DecoratorFactory")
  @js.native
  val DecoratorFactory: typings.lodashDecorators.decoratorFactoryMod.InternalDecoratorFactory = js.native
  
  @JSImport("lodash-decorators", "Defer")
  @js.native
  val Defer_ : BiTypedDecoratorN = js.native
  
  inline def Delay_(wait: Double, args: js.Any*): LodashMethodDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("Delay")(wait.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[LodashMethodDecorator]
  
  inline def Flip_(): LodashDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Flip")().asInstanceOf[LodashDecorator]
  inline def Flip_(fn: ResolvableFunction): LodashDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Flip")(fn.asInstanceOf[js.Any]).asInstanceOf[LodashDecorator]
  
  inline def FlowRight_(fns: ResolvableFunction*): LodashDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("FlowRight")(fns.asInstanceOf[js.Any]).asInstanceOf[LodashDecorator]
  
  inline def Flow_(fns: ResolvableFunction*): LodashDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Flow")(fns.asInstanceOf[js.Any]).asInstanceOf[LodashDecorator]
  
  @JSImport("lodash-decorators", "InstanceChainMap")
  @js.native
  val InstanceChainMap: CompositeKeyWeakMap[InstanceChainData] = js.native
  
  @JSImport("lodash-decorators", "InternalDecoratorFactory")
  @js.native
  class InternalDecoratorFactory ()
    extends typings.lodashDecorators.factoryMod.InternalDecoratorFactory
  
  @JSImport("lodash-decorators", "MemoizeAll")
  @js.native
  val MemoizeAll_ : BiTypedMethodDecorator1[js.Function | (MemoizeConfig[js.Any, js.Any])] = js.native
  
  @JSImport("lodash-decorators", "Memoize")
  @js.native
  val Memoize_ : BiTypedMethodDecorator1[String | js.Function | (MemoizeConfig[js.Any, js.Any])] = js.native
  
  inline def Mixin_(srcs: js.Object*): ClassDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Mixin")(srcs.asInstanceOf[js.Any]).asInstanceOf[ClassDecorator]
  
  @JSImport("lodash-decorators", "Negate")
  @js.native
  val Negate_ : BiTypedDecorator1[ResolvableFunction] = js.native
  
  @JSImport("lodash-decorators", "Once")
  @js.native
  val Once_ : BiTypedDecorator = js.native
  
  inline def OverArgs_(transforms: js.Function*): LodashMethodDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("OverArgs")(transforms.asInstanceOf[js.Any]).asInstanceOf[LodashMethodDecorator]
  
  inline def PartialRight_(partials: js.Any*): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("PartialRight")(partials.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  inline def Partial_(partials: js.Any*): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Partial")(partials.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  inline def Rearg_(indexes: js.Array[Double], args: (Double | js.Array[Double])*): LodashDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("Rearg")(indexes.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[LodashDecorator]
  inline def Rearg_(indexes: Double, args: (Double | js.Array[Double])*): LodashDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("Rearg")(indexes.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[LodashDecorator]
  inline def Rearg_(indexes: ResolvableFunction, args: (Double | js.Array[Double])*): LodashDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("Rearg")(indexes.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[LodashDecorator]
  
  @JSImport("lodash-decorators", "Rest")
  @js.native
  val Rest_ : BiTypedMethodDecorator1[Double] = js.native
  
  @JSImport("lodash-decorators", "Spread")
  @js.native
  val Spread_ : BiTypedMethodDecorator1[Double] = js.native
  
  @JSImport("lodash-decorators", "Tap")
  @js.native
  val Tap_ : BiTypedMethodDecorator = js.native
  
  inline def ThrottleAll_(): LodashMethodDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("ThrottleAll")().asInstanceOf[LodashMethodDecorator]
  inline def ThrottleAll_(wait: Double): LodashMethodDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("ThrottleAll")(wait.asInstanceOf[js.Any]).asInstanceOf[LodashMethodDecorator]
  inline def ThrottleAll_(wait: Double, options: ThrottleOptions): LodashMethodDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("ThrottleAll")(wait.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[LodashMethodDecorator]
  inline def ThrottleAll_(wait: Unit, options: ThrottleOptions): LodashMethodDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("ThrottleAll")(wait.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[LodashMethodDecorator]
  
  @JSImport("lodash-decorators", "ThrottleGetter")
  @js.native
  val ThrottleGetter_ : BiTypedDecorator2[Double, ThrottleOptions] = js.native
  
  @JSImport("lodash-decorators", "ThrottleSetter")
  @js.native
  val ThrottleSetter_ : BiTypedDecorator2[Double, ThrottleOptions] = js.native
  
  @JSImport("lodash-decorators", "Throttle")
  @js.native
  val Throttle_ : BiTypedDecorator2[Double, ThrottleOptions] = js.native
  
  @JSImport("lodash-decorators", "Unary")
  @js.native
  val Unary_ : BiTypedMethodDecorator = js.native
  
  inline def Wrap_(): LodashMethodDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Wrap")().asInstanceOf[LodashMethodDecorator]
  inline def Wrap_(fnToWrap: ResolvableFunction): LodashMethodDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Wrap")(fnToWrap.asInstanceOf[js.Any]).asInstanceOf[LodashMethodDecorator]
  
  inline def after(n: Double): LodashDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("after")(n.asInstanceOf[js.Any]).asInstanceOf[LodashDecorator]
  
  inline def afterAll(n: Double): LodashDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("afterAll")(n.asInstanceOf[js.Any]).asInstanceOf[LodashDecorator]
  
  inline def ary(n: Double): LodashMethodDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("ary")(n.asInstanceOf[js.Any]).asInstanceOf[LodashMethodDecorator]
  
  @JSImport("lodash-decorators", "attempt")
  @js.native
  val attempt: BiTypedMethodDecorator = js.native
  
  inline def before(n: Double): LodashDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("before")(n.asInstanceOf[js.Any]).asInstanceOf[LodashDecorator]
  
  inline def beforeAll(n: Double): LodashDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("beforeAll")(n.asInstanceOf[js.Any]).asInstanceOf[LodashDecorator]
  
  @JSImport("lodash-decorators", "bind")
  @js.native
  val bind: BiTypedMethodDecorator1[js.Any] = js.native
  
  inline def bindAll(): ClassDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("bindAll")().asInstanceOf[ClassDecorator]
  inline def bindAll(methods: js.Array[String]): ClassDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("bindAll")(methods.asInstanceOf[js.Any]).asInstanceOf[ClassDecorator]
  
  @JSImport("lodash-decorators", "curry")
  @js.native
  val curry: BiTypedMethodDecorator1[Double] = js.native
  
  @JSImport("lodash-decorators", "curryAll")
  @js.native
  val curryAll: BiTypedDecorator1[Double] = js.native
  
  @JSImport("lodash-decorators", "curryRight")
  @js.native
  val curryRight: BiTypedMethodDecorator1[Double] = js.native
  
  @JSImport("lodash-decorators", "curryRightAll")
  @js.native
  val curryRightAll: BiTypedMethodDecorator1[Double] = js.native
  
  inline def debounce(): LodashDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("debounce")().asInstanceOf[LodashDecorator]
  inline def debounce(wait: Double): LodashDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(wait.asInstanceOf[js.Any]).asInstanceOf[LodashDecorator]
  inline def debounce(wait: Double, options: DebounceOptions): LodashDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(wait.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[LodashDecorator]
  inline def debounce(wait: Unit, options: DebounceOptions): LodashDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(wait.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[LodashDecorator]
  
  inline def debounceAll(): LodashMethodDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("debounceAll")().asInstanceOf[LodashMethodDecorator]
  inline def debounceAll(wait: Double): LodashMethodDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("debounceAll")(wait.asInstanceOf[js.Any]).asInstanceOf[LodashMethodDecorator]
  inline def debounceAll(wait: Double, options: DebounceOptions): LodashMethodDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("debounceAll")(wait.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[LodashMethodDecorator]
  inline def debounceAll(wait: Unit, options: DebounceOptions): LodashMethodDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("debounceAll")(wait.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[LodashMethodDecorator]
  
  @JSImport("lodash-decorators", "defer")
  @js.native
  val defer: BiTypedDecoratorN = js.native
  
  inline def delay(wait: Double, args: js.Any*): LodashMethodDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("delay")(wait.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[LodashMethodDecorator]
  
  inline def flip(): LodashDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("flip")().asInstanceOf[LodashDecorator]
  inline def flip(fn: ResolvableFunction): LodashDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("flip")(fn.asInstanceOf[js.Any]).asInstanceOf[LodashDecorator]
  
  inline def flow(fns: ResolvableFunction*): LodashDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("flow")(fns.asInstanceOf[js.Any]).asInstanceOf[LodashDecorator]
  
  inline def flowRight(fns: ResolvableFunction*): LodashDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("flowRight")(fns.asInstanceOf[js.Any]).asInstanceOf[LodashDecorator]
  
  @JSImport("lodash-decorators", "memoize")
  @js.native
  val memoize: BiTypedMethodDecorator1[String | js.Function | (MemoizeConfig[js.Any, js.Any])] = js.native
  
  @JSImport("lodash-decorators", "memoizeAll")
  @js.native
  val memoizeAll: BiTypedMethodDecorator1[js.Function | (MemoizeConfig[js.Any, js.Any])] = js.native
  
  inline def mixin(srcs: js.Object*): ClassDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("mixin")(srcs.asInstanceOf[js.Any]).asInstanceOf[ClassDecorator]
  
  @JSImport("lodash-decorators", "negate")
  @js.native
  val negate: BiTypedDecorator1[ResolvableFunction] = js.native
  
  @JSImport("lodash-decorators", "once")
  @js.native
  val once: BiTypedDecorator = js.native
  
  inline def overArgs(transforms: js.Function*): LodashMethodDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("overArgs")(transforms.asInstanceOf[js.Any]).asInstanceOf[LodashMethodDecorator]
  
  inline def partial(partials: js.Any*): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("partial")(partials.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  inline def partialRight(partials: js.Any*): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("partialRight")(partials.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  inline def rearg(indexes: js.Array[Double], args: (Double | js.Array[Double])*): LodashDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("rearg")(indexes.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[LodashDecorator]
  inline def rearg(indexes: Double, args: (Double | js.Array[Double])*): LodashDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("rearg")(indexes.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[LodashDecorator]
  inline def rearg(indexes: ResolvableFunction, args: (Double | js.Array[Double])*): LodashDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("rearg")(indexes.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[LodashDecorator]
  
  @JSImport("lodash-decorators", "rest")
  @js.native
  val rest: BiTypedMethodDecorator1[Double] = js.native
  
  @JSImport("lodash-decorators", "spread")
  @js.native
  val spread: BiTypedMethodDecorator1[Double] = js.native
  
  @JSImport("lodash-decorators", "tap")
  @js.native
  val tap: BiTypedMethodDecorator = js.native
  
  @JSImport("lodash-decorators", "throttle")
  @js.native
  val throttle: BiTypedDecorator2[Double, ThrottleOptions] = js.native
  
  inline def throttleAll(): LodashMethodDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("throttleAll")().asInstanceOf[LodashMethodDecorator]
  inline def throttleAll(wait: Double): LodashMethodDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("throttleAll")(wait.asInstanceOf[js.Any]).asInstanceOf[LodashMethodDecorator]
  inline def throttleAll(wait: Double, options: ThrottleOptions): LodashMethodDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("throttleAll")(wait.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[LodashMethodDecorator]
  inline def throttleAll(wait: Unit, options: ThrottleOptions): LodashMethodDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("throttleAll")(wait.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[LodashMethodDecorator]
  
  @JSImport("lodash-decorators", "throttleGetter")
  @js.native
  val throttleGetter: BiTypedDecorator2[Double, ThrottleOptions] = js.native
  
  @JSImport("lodash-decorators", "throttleSetter")
  @js.native
  val throttleSetter: BiTypedDecorator2[Double, ThrottleOptions] = js.native
  
  @JSImport("lodash-decorators", "unary")
  @js.native
  val unary: BiTypedMethodDecorator = js.native
  
  inline def wrap(): LodashMethodDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("wrap")().asInstanceOf[LodashMethodDecorator]
  inline def wrap(fnToWrap: ResolvableFunction): LodashMethodDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(fnToWrap.asInstanceOf[js.Any]).asInstanceOf[LodashMethodDecorator]
}
