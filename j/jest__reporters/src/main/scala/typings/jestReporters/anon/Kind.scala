package typings.jestReporters.anon

import typings.jestReporters.generateEmptyCoverageMod.CoverageWorkerResult
import typings.jestReporters.generateEmptyCoverageMod.SingleV8Coverage
import typings.jestReporters.jestReportersStrings.V8Coverage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Kind extends CoverageWorkerResult {
  var kind: V8Coverage = js.native
  var result: SingleV8Coverage = js.native
}

object Kind {
  @scala.inline
  def apply(kind: V8Coverage, result: SingleV8Coverage): Kind = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[Kind]
  }
  @scala.inline
  implicit class KindOps[Self <: Kind] (val x: Self) extends AnyVal {
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
    def setKind(value: V8Coverage): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setResult(value: SingleV8Coverage): Self = this.set("result", value.asInstanceOf[js.Any])
  }
  
}

