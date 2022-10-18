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

type Unionize[T /* <: Record[PropertyKey, Any] */] = /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: T[P]}[keyof T] */ js.Any
