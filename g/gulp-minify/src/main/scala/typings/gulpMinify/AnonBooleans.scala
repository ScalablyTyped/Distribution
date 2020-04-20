package typings.gulpMinify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBooleans extends js.Object {
  /**
    * optimize boolean expressions
    */
  var booleans: js.UndefOr[Boolean] = js.undefined
  /**
    * try to cascade `right` into `left` in sequences
    */
  var cascade: js.UndefOr[Boolean] = js.undefined
  /**
    * optimize comparisons
    */
  var comparisons: js.UndefOr[Boolean] = js.undefined
   //
  /**
    * optimize if-s and conditional expressions
    */
  var conditionals: js.UndefOr[Boolean] = js.undefined
  /**
    * discard unreachable code
    */
  var dead_code: js.UndefOr[Boolean] = js.undefined
  /**
    * discard “debugger” statements
    */
  var drop_debugger: js.UndefOr[Boolean] = js.undefined
  /**
    * optimize boolean expressions
    */
  var evaluate: js.UndefOr[Boolean] = js.undefined
  /**
    * global definitions
    */
  var global_defs: js.UndefOr[js.Object] = js.undefined
  /**
    * hoist function declarations
    */
  var hoist_funs: js.UndefOr[Boolean] = js.undefined
  /**
    * hoist variable declarations
    */
  var hoist_vars: js.UndefOr[Boolean] = js.undefined
   // hoist variable declarations
  /**
    * optimize if-s followed by return/continue
    */
  var if_return: js.UndefOr[Boolean] = js.undefined
  /**
    * join var declarations
    */
  var join_vars: js.UndefOr[Boolean] = js.undefined
  /**
    * optimize loops
    */
  var loops: js.UndefOr[Boolean] = js.undefined
  /**
    * optimize property access?: a["foo"] → a.foo
    */
  var properties: js.UndefOr[Boolean] = js.undefined
  /**
    * join consecutive statemets with the “comma operator”
    */
  var sequences: js.UndefOr[Boolean] = js.undefined
  /**
    * drop side-effect-free statements
    */
  var side_effects: js.UndefOr[Boolean] = js.undefined
  /**
    * some unsafe optimizations (see below)
    */
  var unsafe: js.UndefOr[Boolean] = js.undefined
  /**
    * drop unused variables/functions
    */
  var unused: js.UndefOr[Boolean] = js.undefined
  /**
    * warn about potentially dangerous optimizations/code
    */
  var warnings: js.UndefOr[Boolean] = js.undefined
}

object AnonBooleans {
  @scala.inline
  def apply(
    booleans: js.UndefOr[Boolean] = js.undefined,
    cascade: js.UndefOr[Boolean] = js.undefined,
    comparisons: js.UndefOr[Boolean] = js.undefined,
    conditionals: js.UndefOr[Boolean] = js.undefined,
    dead_code: js.UndefOr[Boolean] = js.undefined,
    drop_debugger: js.UndefOr[Boolean] = js.undefined,
    evaluate: js.UndefOr[Boolean] = js.undefined,
    global_defs: js.Object = null,
    hoist_funs: js.UndefOr[Boolean] = js.undefined,
    hoist_vars: js.UndefOr[Boolean] = js.undefined,
    if_return: js.UndefOr[Boolean] = js.undefined,
    join_vars: js.UndefOr[Boolean] = js.undefined,
    loops: js.UndefOr[Boolean] = js.undefined,
    properties: js.UndefOr[Boolean] = js.undefined,
    sequences: js.UndefOr[Boolean] = js.undefined,
    side_effects: js.UndefOr[Boolean] = js.undefined,
    unsafe: js.UndefOr[Boolean] = js.undefined,
    unused: js.UndefOr[Boolean] = js.undefined,
    warnings: js.UndefOr[Boolean] = js.undefined
  ): AnonBooleans = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(booleans)) __obj.updateDynamic("booleans")(booleans.asInstanceOf[js.Any])
    if (!js.isUndefined(cascade)) __obj.updateDynamic("cascade")(cascade.asInstanceOf[js.Any])
    if (!js.isUndefined(comparisons)) __obj.updateDynamic("comparisons")(comparisons.asInstanceOf[js.Any])
    if (!js.isUndefined(conditionals)) __obj.updateDynamic("conditionals")(conditionals.asInstanceOf[js.Any])
    if (!js.isUndefined(dead_code)) __obj.updateDynamic("dead_code")(dead_code.asInstanceOf[js.Any])
    if (!js.isUndefined(drop_debugger)) __obj.updateDynamic("drop_debugger")(drop_debugger.asInstanceOf[js.Any])
    if (!js.isUndefined(evaluate)) __obj.updateDynamic("evaluate")(evaluate.asInstanceOf[js.Any])
    if (global_defs != null) __obj.updateDynamic("global_defs")(global_defs.asInstanceOf[js.Any])
    if (!js.isUndefined(hoist_funs)) __obj.updateDynamic("hoist_funs")(hoist_funs.asInstanceOf[js.Any])
    if (!js.isUndefined(hoist_vars)) __obj.updateDynamic("hoist_vars")(hoist_vars.asInstanceOf[js.Any])
    if (!js.isUndefined(if_return)) __obj.updateDynamic("if_return")(if_return.asInstanceOf[js.Any])
    if (!js.isUndefined(join_vars)) __obj.updateDynamic("join_vars")(join_vars.asInstanceOf[js.Any])
    if (!js.isUndefined(loops)) __obj.updateDynamic("loops")(loops.asInstanceOf[js.Any])
    if (!js.isUndefined(properties)) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (!js.isUndefined(sequences)) __obj.updateDynamic("sequences")(sequences.asInstanceOf[js.Any])
    if (!js.isUndefined(side_effects)) __obj.updateDynamic("side_effects")(side_effects.asInstanceOf[js.Any])
    if (!js.isUndefined(unsafe)) __obj.updateDynamic("unsafe")(unsafe.asInstanceOf[js.Any])
    if (!js.isUndefined(unused)) __obj.updateDynamic("unused")(unused.asInstanceOf[js.Any])
    if (!js.isUndefined(warnings)) __obj.updateDynamic("warnings")(warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBooleans]
  }
}

