package typings.koaBouncer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* augmented module */
@JSImport("koa", JSImport.Namespace)
@js.native
object koaAugmentingMod extends js.Object {
  @js.native
  trait Context extends js.Object {
    var vals: js.Any = js.native
    def check(result: js.Any): Unit = js.native
    def check(result: js.Any, tip: String): Unit = js.native
    def checkNot(result: js.Any): Validator = js.native
    def checkNot(result: js.Any, tip: String): Validator = js.native
    def validateBody(key: String): Validator = js.native
    def validateParam(key: String): Validator = js.native
    def validateQuery(key: String): Validator = js.native
  }
  
}

