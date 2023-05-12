package typings.luxon.srcDatetimeMod

import typings.luxon.anon.RecordExcludeDateTimeUnit
import typings.std.Intl.DateTimeFormatOptions
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type DateTimeFormatPreset = DateTimeFormatOptions

type ISOTimeOptions = ToISOTimeOptions

type MinuteNumbers = SecondNumbers

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  luxon.luxon/src/_util.CanBeInvalid extends true ? std.Partial<luxon.luxon/src/datetime._ToObjectOutput<IncludeConfig>> : luxon.luxon/src/datetime._ToObjectOutput<IncludeConfig>
  }}}
  */
type ToObjectOutput[IncludeConfig /* <: js.UndefOr[Boolean] */] = Partial[_ToObjectOutput[IncludeConfig]]

type _ToObjectOutput[IncludeConfig /* <: js.UndefOr[Boolean] */] = RecordExcludeDateTimeUnit & (/* import warning: importer.ImportType#apply Failed type conversion: IncludeConfig extends true ? luxon.luxon/src/datetime.LocaleOptions : unknown */ js.Any)
