package typings.markdownDashIt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libMod {
  type Rule[S /* <: typings.markdownDashIt.libRulesUnderscoreCoreStateUnderscoreCoreMod.^ */] = js.Function2[/* state */ S, /* silent */ js.UndefOr[Boolean], Boolean | Unit]
  type RuleBlock = Rule[typings.markdownDashIt.libRulesUnderscoreBlockStateUnderscoreBlockMod.^]
  type RuleInline = Rule[typings.markdownDashIt.libRulesUnderscoreInlineStateUnderscoreInlineMod.^]
  type RulerBlock = typings.markdownDashIt.libRulerMod.^[typings.markdownDashIt.libRulesUnderscoreBlockStateUnderscoreBlockMod.^]
  type RulerInline = typings.markdownDashIt.libRulerMod.^[typings.markdownDashIt.libRulesUnderscoreInlineStateUnderscoreInlineMod.^]
  type TokenRender = js.Function5[
    /* tokens */ js.Array[typings.markdownDashIt.libTokenMod.^], 
    /* index */ Double, 
    /* options */ js.Any, 
    /* env */ js.Any, 
    /* self */ typings.markdownDashIt.libRendererMod.^, 
    String
  ]
}
