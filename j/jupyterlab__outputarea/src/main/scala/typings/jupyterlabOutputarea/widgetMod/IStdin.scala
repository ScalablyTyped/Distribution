package typings.jupyterlabOutputarea.widgetMod

import typings.luminoWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IStdin extends Widget {
  
  /**
    * The stdin value.
    */
  val value: js.Promise[String] = js.native
}
