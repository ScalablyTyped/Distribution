package typings.jointjs.global.joint

import typings.backbone.mod.Model
import typings.backbone.mod.ModelSetOptions
import typings.jointjs.mod.mvc.ViewOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mvc {
  
  @JSGlobal("joint.mvc.View")
  @js.native
  class View[T /* <: Model[js.Any, ModelSetOptions, js.Object] */] ()
    extends typings.jointjs.mod.mvc.View[T] {
    def this(opt: ViewOptions[T]) = this()
  }
}
