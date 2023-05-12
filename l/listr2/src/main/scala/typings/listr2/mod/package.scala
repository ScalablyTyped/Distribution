package typings.listr2.mod

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.colorette.mod.Colorette
import typings.listr2.anon.FallbackRendererCondition
import typings.listr2.anon.TypeofDefaultRenderer
import typings.listr2.anon.TypeofListrRenderer
import typings.listr2.anon.TypeofSilentRenderer
import typings.listr2.anon.TypeofSimpleRenderer
import typings.listr2.anon.TypeofTestRenderer
import typings.listr2.anon.TypeofVerboseRenderer
import typings.listr2.listr2Booleans.`false`
import typings.listr2.listr2Booleans.`true`
import typings.listr2.listr2Strings.default
import typings.listr2.listr2Strings.silent
import typings.listr2.listr2Strings.simple
import typings.listr2.listr2Strings.test
import typings.listr2.listr2Strings.verbose
import typings.listr2.mod.^
import typings.node.NodeJS.ReadableStream
import typings.node.streamMod.Readable
import typings.rxjs.mod.Observable_
import typings.std.Map
import typings.std.Partial
import typings.std.PropertyKey
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/**
  * Indicates an UNICODE characters is coming up.
  */
inline def ANSI_ESCAPE: /* "\\u001B[" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("ANSI_ESCAPE").asInstanceOf[/* "\\u001B[" */ String]

inline def LISTR_DEFAULT_RENDERER_STYLE: ListrLoggerStyleMap[ListrDefaultRendererLogLevels] = ^.asInstanceOf[js.Dynamic].selectDynamic("LISTR_DEFAULT_RENDERER_STYLE").asInstanceOf[ListrLoggerStyleMap[ListrDefaultRendererLogLevels]]

inline def LISTR_LOGGER_STDERR_LEVELS: js.Array[ListrLogLevels] = ^.asInstanceOf[js.Dynamic].selectDynamic("LISTR_LOGGER_STDERR_LEVELS").asInstanceOf[js.Array[ListrLogLevels]]

inline def LISTR_LOGGER_STYLE: ListrLoggerStyleMap[ListrLogLevels] = ^.asInstanceOf[js.Dynamic].selectDynamic("LISTR_LOGGER_STYLE").asInstanceOf[ListrLoggerStyleMap[ListrLogLevels]]

inline def PRESET_TIMER: PresetTimer = ^.asInstanceOf[js.Dynamic].selectDynamic("PRESET_TIMER").asInstanceOf[PresetTimer]

inline def PRESET_TIMESTAMP: PresetTimestamp = ^.asInstanceOf[js.Dynamic].selectDynamic("PRESET_TIMESTAMP").asInstanceOf[PresetTimestamp]

/**
  * This function asserts the given value as a function or itself.
  * If the value itself is a function it will evaluate it with the passed in arguments,
  * elsewise it will directly return itself.
  */
inline def assertFunctionOrSelf[T](
  functionOrSelf: T,
  /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type T extends (args : ...any): any ? Parameters<T> : never is not an array type */ args: /* import warning: importer.ImportType#apply Failed type conversion: T extends (args : ...any): any ? std.Parameters<T> : never */ js.Any
): /* import warning: importer.ImportType#apply Failed type conversion: T extends (args : ...any): any ? std.ReturnType<T> : T */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("assertFunctionOrSelf")(functionOrSelf.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: T extends (args : ...any): any ? std.ReturnType<T> : T */ js.Any]

inline def cleanseAnsi(chunk: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("cleanseAnsi")(chunk.asInstanceOf[js.Any]).asInstanceOf[String]

/**
  * Deep clones a object in the easiest manner.
  */
inline def cloneObject[T /* <: Record[PropertyKey, Any] */](obj: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("cloneObject")(obj.asInstanceOf[js.Any]).asInstanceOf[T]

inline def color: Colorette = ^.asInstanceOf[js.Dynamic].selectDynamic("color").asInstanceOf[Colorette]

/**
  * Create a new prompt with Enquirer externally.
  * This extends enquirer so you dont have to give a name to single prompts and such so it is also
  * useful to use externally.
  * @param this
  * @param options
  * @param settings
  */
inline def createPrompt_false(options: PromptOptions[`false`]): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("createPrompt")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
inline def createPrompt_false(options: PromptOptions[`false`], settings: PromptSettings): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("createPrompt")(options.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]

inline def createPrompt_true(options: js.Array[PromptOptions[`true`]]): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("createPrompt")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
inline def createPrompt_true(options: js.Array[PromptOptions[`true`]], settings: PromptSettings): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("createPrompt")(options.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]

inline def delay(time: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("delay")(time.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]

inline def figures: Figures_ = ^.asInstanceOf[js.Dynamic].selectDynamic("figures").asInstanceOf[Figures_]

inline def getRenderer[Renderer /* <: ListrRendererValue */, FallbackRenderer /* <: ListrRendererValue */](options: FallbackRendererCondition[Renderer, FallbackRenderer]): SupportedRenderer[ListrRendererFactory] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRenderer")(options.asInstanceOf[js.Any]).asInstanceOf[SupportedRenderer[ListrRendererFactory]]

inline def getRendererClass(renderer: ListrRendererValue): ListrRendererFactory = ^.asInstanceOf[js.Dynamic].applyDynamic("getRendererClass")(renderer.asInstanceOf[js.Any]).asInstanceOf[ListrRendererFactory]

inline def indent(string: String, count: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("indent")(string.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[String]

/**
  * Tests to see if the object is an RxJS {@link Observable}
  * @param obj the object to test
  */
inline def isObservable[T](obj: Any): /* is listr2.anon.Complete<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObservable")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is listr2.anon.Complete<T> */ Boolean]

inline def isUnicodeSupported(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUnicodeSupported")().asInstanceOf[Boolean]

/**
  * A basic function to parse minutes and tasks passed given a duration.
  * Useful for renderers to show the task time.
  */
inline def parseTimer(duration: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("parseTimer")(duration.asInstanceOf[js.Any]).asInstanceOf[String]

inline def parseTimestamp(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("parseTimestamp")().asInstanceOf[String]

inline def splat(message: String, splat: Any*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("splat")(scala.List(message.asInstanceOf[js.Any]).`++`(splat.asInstanceOf[Seq[js.Any]])*).asInstanceOf[String]

/**
  * An event map of given events that defined the parameters and return types for firing a certain event.
  */
type EventMap[Events /* <: String */] = Partial[Record[Events, Any]]

/** Listr context. */
type ListrContext = js.UndefOr[Any]

/** Type of default renderer. */
type ListrDefaultRenderer = TypeofDefaultRenderer & (Instantiable3[
/* tasks */ js.Array[ListrDefaultRendererTask], 
/* options */ ListrDefaultRendererOptions, 
/* events */ ListrEventManager, 
DefaultRenderer])

type ListrDefaultRendererOptionsStyle = ListrLoggerStyleMap[ListrDefaultRendererLogLevels]

/** Name of the default renderer. */
type ListrDefaultRendererValue = default

/**
  * Returns the class type from friendly names of the renderers.
  */
/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends listr2.listr2.ListrDefaultRendererValue ? listr2.listr2.ListrDefaultRenderer : T extends listr2.listr2.ListrSimpleRendererValue ? listr2.listr2.ListrSimpleRenderer : T extends listr2.listr2.ListrVerboseRendererValue ? listr2.listr2.ListrVerboseRenderer : T extends listr2.listr2.ListrTestRendererValue ? listr2.listr2.ListrTestRenderer : T extends listr2.listr2.ListrSilentRenderer ? listr2.listr2.ListrSilentRenderer : T extends listr2.listr2.ListrRendererFactory ? T : never
  }}}
  */
type ListrGetRendererClassFromValue[T /* <: ListrRendererValue */] = ListrDefaultRenderer

/**
  * Returns the friendly names from the type of renderer classes.
  */
/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends listr2.listr2.DefaultRenderer ? listr2.listr2.ListrDefaultRendererValue : T extends listr2.listr2.SimpleRenderer ? listr2.listr2.ListrSimpleRendererValue : T extends listr2.listr2.VerboseRenderer ? listr2.listr2.ListrVerboseRendererValue : T extends listr2.listr2.TestRenderer ? listr2.listr2.ListrTestRendererValue : T extends listr2.listr2.SilentRenderer ? listr2.listr2.ListrSilentRenderer : T extends listr2.listr2.ListrRendererFactory ? T : never
  }}}
  */
type ListrGetRendererValueFromClass[T /* <: ListrRendererFactory */] = ListrDefaultRendererValue

/** The default prefered renderer. */
type ListrPrimaryRendererValue = ListrDefaultRendererValue

type ListrRendererCacheMap[T] = Map[String, T]

/** Factory of compatible Listr renderers. */
/** 
NOTE: Rewritten from type alias:
{{{
type ListrRendererFactory = {  rendererOptions :std.Record<std.PropertyKey, any>,   rendererTaskOptions :std.Record<std.PropertyKey, any>,   nonTTY :boolean} & new (tasks : std.Array<listr2.listr2.Task<any, listr2.listr2.ListrRendererFactory>>, options : typeof ListrRenderer.rendererOptions, events : listr2.listr2.ListrEventManager | undefined): listr2.listr2.ListrRenderer
}}}
to avoid circular code involving: 
- listr2.listr2.ListrRendererFactory
*/
type ListrRendererFactory = TypeofListrRenderer & (Instantiable3[
/* tasks */ js.Array[Task[Any, Any]], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ListrRenderer.rendererOptions */ /* options */ js.Any, 
/* events */ js.UndefOr[ListrEventManager], 
ListrRenderer])

/**
  * Listr2 can process either the integrated renderers as string aliases,
  * or utilize a compatible style renderer that extends the ListrRenderer abstract class.
  */
/** 
NOTE: Rewritten from type alias:
{{{
type ListrRendererValue = listr2.listr2.ListrSilentRendererValue | listr2.listr2.ListrDefaultRendererValue | listr2.listr2.ListrSimpleRendererValue | listr2.listr2.ListrVerboseRendererValue | listr2.listr2.ListrTestRendererValue | listr2.listr2.ListrRendererFactory
}}}
to avoid circular code involving: 
- listr2.listr2.ListrRendererFactory
- listr2.listr2.ListrRendererValue
*/
type ListrRendererValue = ListrSilentRendererValue | ListrDefaultRendererValue | ListrSimpleRendererValue | ListrVerboseRendererValue | ListrTestRendererValue | Any

/** The default fallback renderer. */
type ListrSecondaryRendererValue = ListrSimpleRendererValue

/** Type of silent renderer. */
type ListrSilentRenderer = TypeofSilentRenderer & (Instantiable2[
/* tasks */ js.Array[ListrSilentRendererTask], 
/* options */ ListrSilentRendererOptions, 
SilentRenderer])

type ListrSilentRendererOptions = scala.Nothing

type ListrSilentRendererTaskOptions = scala.Nothing

/** Name of silent renderer. */
type ListrSilentRendererValue = silent

/** Type of simple renderer. */
type ListrSimpleRenderer = TypeofSimpleRenderer & (Instantiable2[
/* tasks */ js.Array[ListrSimpleRendererTask], 
/* options */ ListrSimpleRendererOptions, 
SimpleRenderer])

type ListrSimpleRendererTaskOptions = RendererPresetTimer

/** Name of simple renderer. */
type ListrSimpleRendererValue = simple

/**
  * Result of the processed task can be any of the supported types.
  */
/** 
NOTE: Rewritten from type alias:
{{{
type ListrTaskResult = string | std.Promise<any> | listr2.listr2.Listr<Ctx, listr2.listr2.ListrRendererValue, any> | node.stream.Readable | node.NodeJS.ReadableStream | rxjs.rxjs.Observable<any>
}}}
to avoid circular code involving: 
- listr2.listr2.ListrRendererFactory
- listr2.listr2.ListrRendererValue
- listr2.listr2.ListrTaskResult
*/
type ListrTaskResult[Ctx] = String | js.Promise[Any] | (Listr[Ctx, Any, Any]) | Readable | ReadableStream | Observable_[Any]

/** Type of test renderer. */
type ListrTestRenderer = TypeofTestRenderer & (Instantiable2[
/* tasks */ js.Array[ListrTestRendererTask], 
/* options */ ListrTestRendererOptions, 
TestRenderer])

type ListrTestRendererTaskOptions = scala.Nothing

/** Name of test renderer. */
type ListrTestRendererValue = test

/** Type of verbose renderer. */
type ListrVerboseRenderer = TypeofVerboseRenderer & (Instantiable2[
/* tasks */ js.Array[ListrVerboseRendererTask], 
/* options */ ListrVerboseRendererOptions, 
VerboseRenderer])

type ListrVerboseRendererTaskOptions = RendererPresetTimer

/** Name of verbose renderer. */
type ListrVerboseRendererValue = verbose

type LoggerField[Args /* <: js.Array[Any] */] = LoggerFieldFn[Args] | String

type LoggerFormat = js.Function1[/* message */ js.UndefOr[String], String]

type PresetTimer = LoggerFieldFn[js.Array[Double]]

type PresetTimestamp = LoggerFieldFn[js.Array[Any]]

/** Returns all the prompt options depending on the type selected. */
type PromptOptions[T /* <: Boolean */] = (Unionize[
/* import warning: importer.ImportType#apply Failed type conversion: {[ K in listr2.listr2.PromptTypes ]: -? T extends true? {  type :K,   name :string | (): string} & listr2.listr2.PromptOptionsType<K> : {  type :K} & listr2.listr2.PromptOptionsType<K>} */ js.Any]) | (/* import warning: importer.ImportType#apply Failed type conversion: {  type :string} & T extends true ? listr2.listr2.PromptOptionsType<string> & {  name :string | (): string} : listr2.listr2.PromptOptionsType<string> */ js.Any)

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends keyof / * Inlined listr2.listr2.PromptOptionsMap * /
{  AutoComplete :listr2.listr2.ArrayPromptOptions,   BasicAuth :listr2.listr2.StringPromptOptions,   Confirm :listr2.listr2.BooleanPromptOptions,   Editable :listr2.listr2.ArrayPromptOptions,   Form :listr2.listr2.ArrayPromptOptions,   Input :listr2.listr2.StringPromptOptions,   Invisible :listr2.listr2.StringPromptOptions,   List :listr2.listr2.ArrayPromptOptions,   MultiSelect :listr2.listr2.ArrayPromptOptions,   Numeral :listr2.listr2.NumberPromptOptions,   Password :listr2.listr2.StringPromptOptions,   Quiz :listr2.listr2.QuizPromptOptions,   Scale :listr2.listr2.ScalePromptOptions,   Select :listr2.listr2.ArrayPromptOptions,   Snippet :listr2.listr2.SnippetPromptOptions,   Sort :listr2.listr2.SortPromptOptions,   Survey :listr2.listr2.SurveyPromptOptions,   Text :listr2.listr2.StringPromptOptions,   Toggle :listr2.listr2.TogglePromptOptions} ? / * Inlined listr2.listr2.PromptOptionsMap * /
{  AutoComplete :listr2.listr2.ArrayPromptOptions,   BasicAuth :listr2.listr2.StringPromptOptions,   Confirm :listr2.listr2.BooleanPromptOptions,   Editable :listr2.listr2.ArrayPromptOptions,   Form :listr2.listr2.ArrayPromptOptions,   Input :listr2.listr2.StringPromptOptions,   Invisible :listr2.listr2.StringPromptOptions,   List :listr2.listr2.ArrayPromptOptions,   MultiSelect :listr2.listr2.ArrayPromptOptions,   Numeral :listr2.listr2.NumberPromptOptions,   Password :listr2.listr2.StringPromptOptions,   Quiz :listr2.listr2.QuizPromptOptions,   Scale :listr2.listr2.ScalePromptOptions,   Select :listr2.listr2.ArrayPromptOptions,   Snippet :listr2.listr2.SnippetPromptOptions,   Sort :listr2.listr2.SortPromptOptions,   Survey :listr2.listr2.SurveyPromptOptions,   Text :listr2.listr2.StringPromptOptions,   Toggle :listr2.listr2.TogglePromptOptions}[T] : T extends string ? listr2.listr2.BasePromptOptions & std.Record<std.PropertyKey, unknown> : any
  }}}
  */
type PromptOptionsType[T] = BasePromptOptions & (Record[PropertyKey, Any])

type Unionize[T /* <: Record[PropertyKey, Any] */] = /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: T[P]}[keyof T] */ js.Any
