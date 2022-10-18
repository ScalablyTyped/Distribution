package typings.listr2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Returns the class type from friendly names of the renderers.
  */
/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  T extends listr2.listr2.ListrDefaultRendererValue ? listr2.listr2.ListrDefaultRenderer : T extends listr2.listr2.ListrSimpleRendererValue ? listr2.listr2.ListrSimpleRenderer : T extends listr2.listr2.ListrFallbackRendererValue ? listr2.listr2.ListrFallbackRenderer : T extends listr2.listr2.ListrSilentRenderer ? listr2.listr2.ListrSilentRenderer : T extends listr2.listr2.ListrRendererFactory ? T : never
  }}}
  */
@js.native
trait ListrGetRendererClassFromValue[T /* <: ListrRendererValue */] extends StObject
