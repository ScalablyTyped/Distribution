package typings
package markdownDashItLib.libMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object MarkdownItNs {
  type Rule[S /* <: markdownDashItLib.libRulesUnderscoreCoreStateUnderscoreCoreMod.namespaced */] = js.Function2[/* state */ S, /* silent */ js.UndefOr[scala.Boolean], scala.Boolean | scala.Unit]
  type RuleBlock = Rule[markdownDashItLib.libRulesUnderscoreBlockStateUnderscoreBlockMod.namespaced]
  type RuleInline = Rule[markdownDashItLib.libRulesUnderscoreInlineStateUnderscoreInlineMod.namespaced]
  type RulerBlock = markdownDashItLib.libRulerMod.namespaced[markdownDashItLib.libRulesUnderscoreBlockStateUnderscoreBlockMod.namespaced]
  type RulerInline = markdownDashItLib.libRulerMod.namespaced[markdownDashItLib.libRulesUnderscoreInlineStateUnderscoreInlineMod.namespaced]
  type TokenRender = js.Function5[
    /* tokens */ js.Array[markdownDashItLib.libTokenMod.namespaced], 
    /* index */ scala.Double, 
    /* options */ js.Any, 
    /* env */ js.Any, 
    /* self */ markdownDashItLib.libRendererMod.namespaced, 
    scala.Unit
  ]
}
