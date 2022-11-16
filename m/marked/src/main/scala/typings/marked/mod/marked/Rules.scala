package typings.marked.mod.marked

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
NOTE: Rewritten from type alias:
{{{
type Rules = {[ruleName: string] : std.RegExp | marked.marked.marked.Rules}
}}}
to avoid circular code involving: 
- marked.marked.marked.Rules
*/
trait Rules
  extends StObject
     with /* ruleName */ StringDictionary[js.RegExp | Rules]
object Rules {
  
  inline def apply(): Rules = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Rules]
  }
}
