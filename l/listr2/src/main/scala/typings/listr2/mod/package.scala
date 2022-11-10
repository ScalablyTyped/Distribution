package typings.listr2.mod

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.listr2.anon.TypeofDefaultRenderer
import typings.listr2.anon.TypeofListrRenderer
import typings.listr2.anon.TypeofSilentRenderer
import typings.listr2.anon.TypeofSimpleRenderer
import typings.listr2.anon.TypeofVerboseRenderer
import typings.listr2.listr2Booleans.`false`
import typings.listr2.listr2Booleans.`true`
import typings.listr2.listr2Strings.default
import typings.listr2.listr2Strings.silent
import typings.listr2.listr2Strings.simple
import typings.listr2.listr2Strings.verbose
import typings.listr2.mod.^
import typings.node.NodeJS.ReadableStream
import typings.node.streamMod.Readable
import typings.rxjs.mod.Observable_
import typings.rxjs.mod.Subject
import typings.std.PropertyKey
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


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

inline def destroyPrompt(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("destroyPrompt")().asInstanceOf[Unit]
inline def destroyPrompt(throwError: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("destroyPrompt")(throwError.asInstanceOf[js.Any]).asInstanceOf[Unit]

/** Listr Default Context */
type ListrContext = js.UndefOr[Any]

/** Type of default renderer */
type ListrDefaultRenderer = TypeofDefaultRenderer & (Instantiable3[
/* tasks */ js.Array[
  Task[
    Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof DefaultRenderer */ js.Any
  ]
], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof DefaultRenderer['rendererOptions'] */ /* options */ js.Any, 
/* renderHook$ */ js.UndefOr[Subject[Unit]], 
DefaultRenderer])

/** The default renderer value used in Listr2 applications */
type ListrDefaultRendererValue = default

/**
  * Used to match event.type to ListrEvent permutations
  */
/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  E extends {  type :infer U} ? T extends U ? E : never : never
  }}}
  */
type ListrEventFromType[T /* <: ListrEventType */, E] = E

/** Type of default fallback renderer */
type ListrFallbackRenderer = TypeofVerboseRenderer & (Instantiable2[
/* tasks */ js.Array[
  Task[
    Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof VerboseRenderer */ js.Any
  ]
], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof VerboseRenderer['rendererOptions'] */ /* options */ js.Any, 
VerboseRenderer])

/** Name of default fallback renderer */
type ListrFallbackRendererValue = verbose

/**
  * Returns the class type from friendly names of the renderers.
  */
/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends listr2.listr2.ListrDefaultRendererValue ? listr2.listr2.ListrDefaultRenderer : T extends listr2.listr2.ListrSimpleRendererValue ? listr2.listr2.ListrSimpleRenderer : T extends listr2.listr2.ListrFallbackRendererValue ? listr2.listr2.ListrFallbackRenderer : T extends listr2.listr2.ListrSilentRenderer ? listr2.listr2.ListrSilentRenderer : T extends listr2.listr2.ListrRendererFactory ? T : never
  }}}
  */
type ListrGetRendererClassFromValue[T /* <: ListrRendererValue */] = ListrDefaultRenderer

/**
  * Returns renderer per task options depending on the renderer type.
  */
/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends listr2.listr2.ListrDefaultRendererValue ? listr2.listr2.ListrDefaultRenderer['rendererTaskOptions'] : T extends listr2.listr2.ListrSimpleRendererValue ? listr2.listr2.ListrSimpleRenderer : T extends listr2.listr2.ListrFallbackRendererValue ? listr2.listr2.ListrFallbackRenderer['rendererTaskOptions'] : T extends listr2.listr2.ListrSilentRenderer ? listr2.listr2.ListrSilentRenderer['rendererTaskOptions'] : T extends listr2.listr2.ListrRendererFactory ? T['rendererTaskOptions'] : never
  }}}
  */
type ListrGetRendererTaskOptions[T /* <: ListrRendererValue */] = ListrSimpleRenderer

/**
  * Returns the friendly names from the type of renderer classes.
  */
/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends listr2.listr2.DefaultRenderer ? listr2.listr2.ListrDefaultRendererValue : T extends listr2.listr2.SimpleRenderer ? listr2.listr2.ListrSimpleRendererValue : T extends listr2.listr2.VerboseRenderer ? listr2.listr2.ListrFallbackRendererValue : T extends listr2.listr2.SilentRenderer ? listr2.listr2.ListrSilentRenderer : T extends listr2.listr2.ListrRendererFactory ? T : never
  }}}
  */
type ListrGetRendererValueFromClass[T /* <: ListrRendererFactory */] = ListrDefaultRendererValue

/** A renderer factory from the current type */
type ListrRendererFactory = TypeofListrRenderer & (Instantiable3[
/* tasks */ js.Array[Task[Any, Any]], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ListrRenderer.rendererOptions */ /* options */ js.Any, 
/* renderHook$ */ js.UndefOr[Subject[Unit]], 
ListrRenderer])

/**
  * Listr2 can process either the integrated renderers as string aliases,
  * or utilize a compatible style renderer that extends the ListrRenderer abstract class.
  */
type ListrRendererValue = ListrSilentRendererValue | ListrDefaultRendererValue | ListrSimpleRendererValue | ListrFallbackRendererValue | Any

/** Typeof silent renderer */
type ListrSilentRenderer = TypeofSilentRenderer & (Instantiable2[
/* tasks */ js.Array[
  Task[
    Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof SilentRenderer */ js.Any
  ]
], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof SilentRenderer['rendererOptions'] */ /* options */ js.Any, 
SilentRenderer])

/** Silent rendere for internal usage */
type ListrSilentRendererValue = silent

/** Typeof simple renderer */
type ListrSimpleRenderer = TypeofSimpleRenderer & (Instantiable2[
/* tasks */ js.Array[
  Task[
    Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof SimpleRenderer */ js.Any
  ]
], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof SimpleRenderer['rendererOptions'] */ /* options */ js.Any, 
SimpleRenderer])

/** Simple renderer that simplifies things */
type ListrSimpleRendererValue = simple

/**
  * Task can be set of sync or async function, an Observable or a stream.
  */
type ListrTaskResult[Ctx] = String | js.Promise[Any] | (Listr[Ctx, Any, Any]) | Readable | ReadableStream | Observable_[Any]

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
