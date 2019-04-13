package typings
package markdownDashItLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libMod {
  type Rule[S /* <: markdownDashItLib.libRulesUnderscoreCoreStateUnderscoreCoreMod.^ */] = js.Function2[/* state */ S, /* silent */ js.UndefOr[scala.Boolean], scala.Boolean | scala.Unit]
  type RuleBlock = Rule[markdownDashItLib.libRulesUnderscoreBlockStateUnderscoreBlockMod.^]
  type RuleInline = Rule[markdownDashItLib.libRulesUnderscoreInlineStateUnderscoreInlineMod.^]
  type RulerBlock = markdownDashItLib.libRulerMod.^[markdownDashItLib.libRulesUnderscoreBlockStateUnderscoreBlockMod.^]
  type RulerInline = markdownDashItLib.libRulerMod.^[markdownDashItLib.libRulesUnderscoreInlineStateUnderscoreInlineMod.^]
  type TokenRender = js.Function5[
    /* tokens */ js.Array[markdownDashItLib.libTokenMod.^], 
    /* index */ scala.Double, 
    /* options */ js.Any, 
    /* env */ js.Any, 
    /* self */ markdownDashItLib.libRendererMod.^, 
    scala.Unit
  ]
}
