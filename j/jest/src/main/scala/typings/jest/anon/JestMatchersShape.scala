package typings.jest.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined jest.jest.jest.JestMatchersShape<{}, {}> */
@js.native
trait JestMatchersShape extends js.Object {
  /**
    * Unwraps the reason of a rejected promise so any other matcher can be chained.
    * If the promise is fulfilled the assertion fails.
    */
  var rejects: AndNot = js.native
  /**
    * Use resolves to unwrap the value of a fulfilled promise so any other
    * matcher can be chained. If the promise is rejected the assertion fails.
    */
  var resolves: AndNot = js.native
}

object JestMatchersShape {
  @scala.inline
  def apply(rejects: AndNot, resolves: AndNot): JestMatchersShape = {
    val __obj = js.Dynamic.literal(rejects = rejects.asInstanceOf[js.Any], resolves = resolves.asInstanceOf[js.Any])
    __obj.asInstanceOf[JestMatchersShape]
  }
  @scala.inline
  implicit class JestMatchersShapeOps[Self <: JestMatchersShape] (val x: Self) extends AnyVal {
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
    def setRejects(value: AndNot): Self = this.set("rejects", value.asInstanceOf[js.Any])
    @scala.inline
    def setResolves(value: AndNot): Self = this.set("resolves", value.asInstanceOf[js.Any])
  }
  
}

