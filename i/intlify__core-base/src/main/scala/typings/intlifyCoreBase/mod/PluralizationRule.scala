package typings.intlifyCoreBase.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
NOTE: Rewritten from type alias:
{{{
type PluralizationRule = (choice : number, choicesLength : number, orgRule : @intlify/core-base.@intlify/core-base.PluralizationRule | undefined): number
}}}
to avoid circular code involving: 
- @intlify/core-base.@intlify/core-base.PluralizationRule
- @intlify/core-base.@intlify/core-base.PluralizationRules
*/
@js.native
trait PluralizationRule extends StObject {
  
  def apply(choice: Double, choicesLength: Double): Double = js.native
  def apply(choice: Double, choicesLength: Double, orgRule: PluralizationRule): Double = js.native
}
