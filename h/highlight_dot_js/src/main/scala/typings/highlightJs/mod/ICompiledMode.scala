package typings.highlightJs.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICompiledMode extends IModeBase {
  var compiled: Boolean = js.native
  var contains: js.UndefOr[js.Array[ICompiledMode]] = js.native
  var keywords: js.UndefOr[js.Object] = js.native
  var terminator_end: js.UndefOr[String] = js.native
  var terminators: RegExp = js.native
}

object ICompiledMode {
  @scala.inline
  def apply(compiled: Boolean, terminators: RegExp): ICompiledMode = {
    val __obj = js.Dynamic.literal(compiled = compiled.asInstanceOf[js.Any], terminators = terminators.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICompiledMode]
  }
  @scala.inline
  implicit class ICompiledModeOps[Self <: ICompiledMode] (val x: Self) extends AnyVal {
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
    def setCompiled(value: Boolean): Self = this.set("compiled", value.asInstanceOf[js.Any])
    @scala.inline
    def setTerminators(value: RegExp): Self = this.set("terminators", value.asInstanceOf[js.Any])
    @scala.inline
    def setContainsVarargs(value: ICompiledMode*): Self = this.set("contains", js.Array(value :_*))
    @scala.inline
    def setContains(value: js.Array[ICompiledMode]): Self = this.set("contains", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContains: Self = this.set("contains", js.undefined)
    @scala.inline
    def setKeywords(value: js.Object): Self = this.set("keywords", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeywords: Self = this.set("keywords", js.undefined)
    @scala.inline
    def setTerminator_end(value: String): Self = this.set("terminator_end", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTerminator_end: Self = this.set("terminator_end", js.undefined)
  }
  
}

