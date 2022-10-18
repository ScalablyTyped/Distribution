package typings.listr2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Returns the friendly names from the type of renderer classes.
  */
/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  T extends listr2.listr2.DefaultRenderer ? listr2.listr2.ListrDefaultRendererValue : T extends listr2.listr2.SimpleRenderer ? listr2.listr2.ListrSimpleRendererValue : T extends listr2.listr2.VerboseRenderer ? listr2.listr2.ListrFallbackRendererValue : T extends listr2.listr2.SilentRenderer ? listr2.listr2.ListrSilentRenderer : T extends listr2.listr2.ListrRendererFactory ? T : never
  }}}
  */
@js.native
trait ListrGetRendererValueFromClass[T /* <: ListrRendererFactory */] extends StObject
