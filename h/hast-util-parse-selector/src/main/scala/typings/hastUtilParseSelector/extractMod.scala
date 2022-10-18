package typings.hastUtilParseSelector

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object extractMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    SimpleSelector extends / * template literal string: #${inferRest} * / string ? DefaultTagName : SimpleSelector extends / * template literal string: .${inferRest} * / string ? DefaultTagName : SimpleSelector extends / * template literal string: ${inferTagName}.${inferRest} * / string ? hast-util-parse-selector.hast-util-parse-selector/extract.ExtractTagName</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TagName * / any, DefaultTagName> : SimpleSelector extends / * template literal string: ${inferTagName}#${inferRest} * / string ? / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TagName * / any : SimpleSelector extends '' ? DefaultTagName : SimpleSelector extends string ? SimpleSelector : DefaultTagName
    }}}
    */
  @js.native
  trait ExtractTagName[SimpleSelector /* <: String */, DefaultTagName /* <: String */] extends StObject
}
