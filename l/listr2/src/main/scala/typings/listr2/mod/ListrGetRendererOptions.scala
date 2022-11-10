package typings.listr2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Returns renderer global options depending on the renderer type.
  */
/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately.
  * TS definition: {{{
  T extends listr2.listr2.ListrDefaultRendererValue ? listr2.listr2.ListrDefaultRenderer['rendererOptions'] : T extends listr2.listr2.ListrSimpleRendererValue ? listr2.listr2.ListrSimpleRenderer['rendererOptions'] : T extends listr2.listr2.ListrFallbackRendererValue ? listr2.listr2.ListrFallbackRenderer['rendererOptions'] : T extends listr2.listr2.ListrSilentRenderer ? listr2.listr2.ListrSilentRenderer['rendererOptions'] : T extends listr2.listr2.ListrRendererFactory ? T['rendererOptions'] : never
  }}}
  */
@js.native
trait ListrGetRendererOptions[T /* <: ListrRendererValue */] extends StObject
