package typings.markdownIt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libMod {
  type Rule[S /* <: typings.markdownIt.stateCoreMod.^ */] = js.Function2[/* state */ S, /* silent */ js.UndefOr[scala.Boolean], scala.Boolean | scala.Unit]
  type RuleBlock = typings.markdownIt.libMod.Rule[typings.markdownIt.stateBlockMod.^]
  type RuleInline = typings.markdownIt.libMod.Rule[typings.markdownIt.stateInlineMod.^]
  type RulerBlock = typings.markdownIt.rulerMod.Ruler[typings.markdownIt.stateBlockMod.^]
  type RulerInline = typings.markdownIt.rulerMod.Ruler[typings.markdownIt.stateInlineMod.^]
  type TokenRender = js.Function5[
    /* tokens */ js.Array[typings.markdownIt.tokenMod.^], 
    /* index */ scala.Double, 
    /* options */ js.Any, 
    /* env */ js.Any, 
    /* self */ typings.markdownIt.rendererMod.^, 
    java.lang.String
  ]
}
