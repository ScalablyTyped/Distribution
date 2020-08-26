package typings.gulpMinify.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Booleans extends js.Object {
  /**
    * optimize boolean expressions
    */
  var booleans: js.UndefOr[Boolean] = js.native
  /**
    * try to cascade `right` into `left` in sequences
    */
  var cascade: js.UndefOr[Boolean] = js.native
  /**
    * optimize comparisons
    */
  var comparisons: js.UndefOr[Boolean] = js.native
   //
  /**
    * optimize if-s and conditional expressions
    */
  var conditionals: js.UndefOr[Boolean] = js.native
  /**
    * discard unreachable code
    */
  var dead_code: js.UndefOr[Boolean] = js.native
  /**
    * discard “debugger” statements
    */
  var drop_debugger: js.UndefOr[Boolean] = js.native
  /**
    * optimize boolean expressions
    */
  var evaluate: js.UndefOr[Boolean] = js.native
  /**
    * global definitions
    */
  var global_defs: js.UndefOr[js.Object] = js.native
  /**
    * hoist function declarations
    */
  var hoist_funs: js.UndefOr[Boolean] = js.native
  /**
    * hoist variable declarations
    */
  var hoist_vars: js.UndefOr[Boolean] = js.native
   // hoist variable declarations
  /**
    * optimize if-s followed by return/continue
    */
  var if_return: js.UndefOr[Boolean] = js.native
  /**
    * join var declarations
    */
  var join_vars: js.UndefOr[Boolean] = js.native
  /**
    * optimize loops
    */
  var loops: js.UndefOr[Boolean] = js.native
  /**
    * optimize property access?: a["foo"] → a.foo
    */
  var properties: js.UndefOr[Boolean] = js.native
  /**
    * join consecutive statemets with the “comma operator”
    */
  var sequences: js.UndefOr[Boolean] = js.native
  /**
    * drop side-effect-free statements
    */
  var side_effects: js.UndefOr[Boolean] = js.native
  /**
    * some unsafe optimizations (see below)
    */
  var unsafe: js.UndefOr[Boolean] = js.native
  /**
    * drop unused variables/functions
    */
  var unused: js.UndefOr[Boolean] = js.native
  /**
    * warn about potentially dangerous optimizations/code
    */
  var warnings: js.UndefOr[Boolean] = js.native
}

object Booleans {
  @scala.inline
  def apply(): Booleans = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Booleans]
  }
  @scala.inline
  implicit class BooleansOps[Self <: Booleans] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBooleans(value: Boolean): Self = this.set("booleans", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBooleans: Self = this.set("booleans", js.undefined)
    @scala.inline
    def setCascade(value: Boolean): Self = this.set("cascade", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCascade: Self = this.set("cascade", js.undefined)
    @scala.inline
    def setComparisons(value: Boolean): Self = this.set("comparisons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComparisons: Self = this.set("comparisons", js.undefined)
    @scala.inline
    def setConditionals(value: Boolean): Self = this.set("conditionals", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConditionals: Self = this.set("conditionals", js.undefined)
    @scala.inline
    def setDead_code(value: Boolean): Self = this.set("dead_code", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDead_code: Self = this.set("dead_code", js.undefined)
    @scala.inline
    def setDrop_debugger(value: Boolean): Self = this.set("drop_debugger", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDrop_debugger: Self = this.set("drop_debugger", js.undefined)
    @scala.inline
    def setEvaluate(value: Boolean): Self = this.set("evaluate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvaluate: Self = this.set("evaluate", js.undefined)
    @scala.inline
    def setGlobal_defs(value: js.Object): Self = this.set("global_defs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlobal_defs: Self = this.set("global_defs", js.undefined)
    @scala.inline
    def setHoist_funs(value: Boolean): Self = this.set("hoist_funs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHoist_funs: Self = this.set("hoist_funs", js.undefined)
    @scala.inline
    def setHoist_vars(value: Boolean): Self = this.set("hoist_vars", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHoist_vars: Self = this.set("hoist_vars", js.undefined)
    @scala.inline
    def setIf_return(value: Boolean): Self = this.set("if_return", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIf_return: Self = this.set("if_return", js.undefined)
    @scala.inline
    def setJoin_vars(value: Boolean): Self = this.set("join_vars", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJoin_vars: Self = this.set("join_vars", js.undefined)
    @scala.inline
    def setLoops(value: Boolean): Self = this.set("loops", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoops: Self = this.set("loops", js.undefined)
    @scala.inline
    def setProperties(value: Boolean): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
    @scala.inline
    def setSequences(value: Boolean): Self = this.set("sequences", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSequences: Self = this.set("sequences", js.undefined)
    @scala.inline
    def setSide_effects(value: Boolean): Self = this.set("side_effects", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSide_effects: Self = this.set("side_effects", js.undefined)
    @scala.inline
    def setUnsafe(value: Boolean): Self = this.set("unsafe", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnsafe: Self = this.set("unsafe", js.undefined)
    @scala.inline
    def setUnused(value: Boolean): Self = this.set("unused", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnused: Self = this.set("unused", js.undefined)
    @scala.inline
    def setWarnings(value: Boolean): Self = this.set("warnings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWarnings: Self = this.set("warnings", js.undefined)
  }
  
}

