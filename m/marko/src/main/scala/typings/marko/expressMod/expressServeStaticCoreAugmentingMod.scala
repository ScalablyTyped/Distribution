package typings.marko.expressMod

import typings.marko.templateMod.Template
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-serve-static-core", JSImport.Namespace)
@js.native
object expressServeStaticCoreAugmentingMod extends js.Object {
  @js.native
  trait Response extends js.Object {
    def marko(template: Template): Unit = js.native
    def marko(template: Template, data: js.Any): Unit = js.native
  }
  
}

