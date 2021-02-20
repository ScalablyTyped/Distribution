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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("lodash-decorators", "AfterAll")
  @js.native
  def AfterAll_(n: Double): LodashDecorator = js.native
  
  @JSImport("lodash-decorators", "After")
  @js.native
  def After_(n: Double): LodashDecorator = js.native
  
  @JSImport("lodash-decorators", "Ary")
  @js.native
  def Ary_(n: Double): LodashMethodDecorator = js.native
  
  @JSImport("lodash-decorators", "Attempt")
  @js.native
  val Attempt_ : BiTypedMethodDecorator = js.native
  
  @JSImport("lodash-decorators", "BeforeAll")
  @js.native
  def BeforeAll_(n: Double): LodashDecorator = js.native
  
  @JSImport("lodash-decorators", "Before")
  @js.native
  def Before_(n: Double): LodashDecorator = js.native
  
  @JSImport("lodash-decorators", "BindAll")
  @js.native
  def BindAll_(): ClassDecorator = js.native
  @JSImport("lodash-decorators", "BindAll")
  @js.native
  def BindAll_(methods: js.Array[String]): ClassDecorator = js.native
  
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
  
  @JSImport("lodash-decorators", "DebounceAll")
  @js.native
  def DebounceAll_(): LodashMethodDecorator = js.native
  @JSImport("lodash-decorators", "DebounceAll")
  @js.native
  def DebounceAll_(wait: js.UndefOr[scala.Nothing], options: DebounceOptions): LodashMethodDecorator = js.native
  @JSImport("lodash-decorators", "DebounceAll")
  @js.native
  def DebounceAll_(wait: Double): LodashMethodDecorator = js.native
  @JSImport("lodash-decorators", "DebounceAll")
  @js.native
  def DebounceAll_(wait: Double, options: DebounceOptions): LodashMethodDecorator = js.native
  
  @JSImport("lodash-decorators", "Debounce")
  @js.native
  def Debounce_(): LodashDecorator = js.native
  @JSImport("lodash-decorators", "Debounce")
  @js.native
  def Debounce_(wait: js.UndefOr[scala.Nothing], options: DebounceOptions): LodashDecorator = js.native
  @JSImport("lodash-decorators", "Debounce")
  @js.native
  def Debounce_(wait: Double): LodashDecorator = js.native
  @JSImport("lodash-decorators", "Debounce")
  @js.native
  def Debounce_(wait: Double, options: DebounceOptions): LodashDecorator = js.native
  
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
  
  @JSImport("lodash-decorators", "Delay")
  @js.native
  def Delay_(wait: Double, args: js.Any*): LodashMethodDecorator = js.native
  
  @JSImport("lodash-decorators", "Flip")
  @js.native
  def Flip_(): LodashDecorator = js.native
  @JSImport("lodash-decorators", "Flip")
  @js.native
  def Flip_(fn: ResolvableFunction): LodashDecorator = js.native
  
  @JSImport("lodash-decorators", "FlowRight")
  @js.native
  def FlowRight_(fns: ResolvableFunction*): LodashDecorator = js.native
  
  @JSImport("lodash-decorators", "Flow")
  @js.native
  def Flow_(fns: ResolvableFunction*): LodashDecorator = js.native
  
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
  
  @JSImport("lodash-decorators", "Mixin")
  @js.native
  def Mixin_(srcs: js.Object*): ClassDecorator = js.native
  
  @JSImport("lodash-decorators", "Negate")
  @js.native
  val Negate_ : BiTypedDecorator1[ResolvableFunction] = js.native
  
  @JSImport("lodash-decorators", "Once")
  @js.native
  val Once_ : BiTypedDecorator = js.native
  
  @JSImport("lodash-decorators", "OverArgs")
  @js.native
  def OverArgs_(transforms: js.Function*): LodashMethodDecorator = js.native
  
  @JSImport("lodash-decorators", "PartialRight")
  @js.native
  def PartialRight_(partials: js.Any*): PropertyDecorator = js.native
  
  @JSImport("lodash-decorators", "Partial")
  @js.native
  def Partial_(partials: js.Any*): PropertyDecorator = js.native
  
  @JSImport("lodash-decorators", "Rearg")
  @js.native
  def Rearg_(indexes: js.Array[Double], args: (Double | js.Array[Double])*): LodashDecorator = js.native
  @JSImport("lodash-decorators", "Rearg")
  @js.native
  def Rearg_(indexes: Double, args: (Double | js.Array[Double])*): LodashDecorator = js.native
  @JSImport("lodash-decorators", "Rearg")
  @js.native
  def Rearg_(indexes: ResolvableFunction, args: (Double | js.Array[Double])*): LodashDecorator = js.native
  
  @JSImport("lodash-decorators", "Rest")
  @js.native
  val Rest_ : BiTypedMethodDecorator1[Double] = js.native
  
  @JSImport("lodash-decorators", "Spread")
  @js.native
  val Spread_ : BiTypedMethodDecorator1[Double] = js.native
  
  @JSImport("lodash-decorators", "Tap")
  @js.native
  val Tap_ : BiTypedMethodDecorator = js.native
  
  @JSImport("lodash-decorators", "ThrottleAll")
  @js.native
  def ThrottleAll_(): LodashMethodDecorator = js.native
  @JSImport("lodash-decorators", "ThrottleAll")
  @js.native
  def ThrottleAll_(wait: js.UndefOr[scala.Nothing], options: ThrottleOptions): LodashMethodDecorator = js.native
  @JSImport("lodash-decorators", "ThrottleAll")
  @js.native
  def ThrottleAll_(wait: Double): LodashMethodDecorator = js.native
  @JSImport("lodash-decorators", "ThrottleAll")
  @js.native
  def ThrottleAll_(wait: Double, options: ThrottleOptions): LodashMethodDecorator = js.native
  
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
  
  @JSImport("lodash-decorators", "Wrap")
  @js.native
  def Wrap_(): LodashMethodDecorator = js.native
  @JSImport("lodash-decorators", "Wrap")
  @js.native
  def Wrap_(fnToWrap: ResolvableFunction): LodashMethodDecorator = js.native
  
  @JSImport("lodash-decorators", "after")
  @js.native
  def after(n: Double): LodashDecorator = js.native
  
  @JSImport("lodash-decorators", "afterAll")
  @js.native
  def afterAll(n: Double): LodashDecorator = js.native
  
  @JSImport("lodash-decorators", "ary")
  @js.native
  def ary(n: Double): LodashMethodDecorator = js.native
  
  @JSImport("lodash-decorators", "attempt")
  @js.native
  val attempt: BiTypedMethodDecorator = js.native
  
  @JSImport("lodash-decorators", "before")
  @js.native
  def before(n: Double): LodashDecorator = js.native
  
  @JSImport("lodash-decorators", "beforeAll")
  @js.native
  def beforeAll(n: Double): LodashDecorator = js.native
  
  @JSImport("lodash-decorators", "bind")
  @js.native
  val bind: BiTypedMethodDecorator1[js.Any] = js.native
  
  @JSImport("lodash-decorators", "bindAll")
  @js.native
  def bindAll(): ClassDecorator = js.native
  @JSImport("lodash-decorators", "bindAll")
  @js.native
  def bindAll(methods: js.Array[String]): ClassDecorator = js.native
  
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
  
  @JSImport("lodash-decorators", "debounce")
  @js.native
  def debounce(): LodashDecorator = js.native
  @JSImport("lodash-decorators", "debounce")
  @js.native
  def debounce(wait: js.UndefOr[scala.Nothing], options: DebounceOptions): LodashDecorator = js.native
  @JSImport("lodash-decorators", "debounce")
  @js.native
  def debounce(wait: Double): LodashDecorator = js.native
  @JSImport("lodash-decorators", "debounce")
  @js.native
  def debounce(wait: Double, options: DebounceOptions): LodashDecorator = js.native
  
  @JSImport("lodash-decorators", "debounceAll")
  @js.native
  def debounceAll(): LodashMethodDecorator = js.native
  @JSImport("lodash-decorators", "debounceAll")
  @js.native
  def debounceAll(wait: js.UndefOr[scala.Nothing], options: DebounceOptions): LodashMethodDecorator = js.native
  @JSImport("lodash-decorators", "debounceAll")
  @js.native
  def debounceAll(wait: Double): LodashMethodDecorator = js.native
  @JSImport("lodash-decorators", "debounceAll")
  @js.native
  def debounceAll(wait: Double, options: DebounceOptions): LodashMethodDecorator = js.native
  
  @JSImport("lodash-decorators", "defer")
  @js.native
  val defer: BiTypedDecoratorN = js.native
  
  @JSImport("lodash-decorators", "delay")
  @js.native
  def delay(wait: Double, args: js.Any*): LodashMethodDecorator = js.native
  
  @JSImport("lodash-decorators", "flip")
  @js.native
  def flip(): LodashDecorator = js.native
  @JSImport("lodash-decorators", "flip")
  @js.native
  def flip(fn: ResolvableFunction): LodashDecorator = js.native
  
  @JSImport("lodash-decorators", "flow")
  @js.native
  def flow(fns: ResolvableFunction*): LodashDecorator = js.native
  
  @JSImport("lodash-decorators", "flowRight")
  @js.native
  def flowRight(fns: ResolvableFunction*): LodashDecorator = js.native
  
  @JSImport("lodash-decorators", "memoize")
  @js.native
  val memoize: BiTypedMethodDecorator1[String | js.Function | (MemoizeConfig[js.Any, js.Any])] = js.native
  
  @JSImport("lodash-decorators", "memoizeAll")
  @js.native
  val memoizeAll: BiTypedMethodDecorator1[js.Function | (MemoizeConfig[js.Any, js.Any])] = js.native
  
  @JSImport("lodash-decorators", "mixin")
  @js.native
  def mixin(srcs: js.Object*): ClassDecorator = js.native
  
  @JSImport("lodash-decorators", "negate")
  @js.native
  val negate: BiTypedDecorator1[ResolvableFunction] = js.native
  
  @JSImport("lodash-decorators", "once")
  @js.native
  val once: BiTypedDecorator = js.native
  
  @JSImport("lodash-decorators", "overArgs")
  @js.native
  def overArgs(transforms: js.Function*): LodashMethodDecorator = js.native
  
  @JSImport("lodash-decorators", "partial")
  @js.native
  def partial(partials: js.Any*): PropertyDecorator = js.native
  
  @JSImport("lodash-decorators", "partialRight")
  @js.native
  def partialRight(partials: js.Any*): PropertyDecorator = js.native
  
  @JSImport("lodash-decorators", "rearg")
  @js.native
  def rearg(indexes: js.Array[Double], args: (Double | js.Array[Double])*): LodashDecorator = js.native
  @JSImport("lodash-decorators", "rearg")
  @js.native
  def rearg(indexes: Double, args: (Double | js.Array[Double])*): LodashDecorator = js.native
  @JSImport("lodash-decorators", "rearg")
  @js.native
  def rearg(indexes: ResolvableFunction, args: (Double | js.Array[Double])*): LodashDecorator = js.native
  
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
  
  @JSImport("lodash-decorators", "throttleAll")
  @js.native
  def throttleAll(): LodashMethodDecorator = js.native
  @JSImport("lodash-decorators", "throttleAll")
  @js.native
  def throttleAll(wait: js.UndefOr[scala.Nothing], options: ThrottleOptions): LodashMethodDecorator = js.native
  @JSImport("lodash-decorators", "throttleAll")
  @js.native
  def throttleAll(wait: Double): LodashMethodDecorator = js.native
  @JSImport("lodash-decorators", "throttleAll")
  @js.native
  def throttleAll(wait: Double, options: ThrottleOptions): LodashMethodDecorator = js.native
  
  @JSImport("lodash-decorators", "throttleGetter")
  @js.native
  val throttleGetter: BiTypedDecorator2[Double, ThrottleOptions] = js.native
  
  @JSImport("lodash-decorators", "throttleSetter")
  @js.native
  val throttleSetter: BiTypedDecorator2[Double, ThrottleOptions] = js.native
  
  @JSImport("lodash-decorators", "unary")
  @js.native
  val unary: BiTypedMethodDecorator = js.native
  
  @JSImport("lodash-decorators", "wrap")
  @js.native
  def wrap(): LodashMethodDecorator = js.native
  @JSImport("lodash-decorators", "wrap")
  @js.native
  def wrap(fnToWrap: ResolvableFunction): LodashMethodDecorator = js.native
}
