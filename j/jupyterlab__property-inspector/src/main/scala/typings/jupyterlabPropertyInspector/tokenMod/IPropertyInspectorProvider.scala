package typings.jupyterlabPropertyInspector.tokenMod

import org.scalablytyped.runtime.TopLevel
import typings.luminoCoreutils.mod.Token
import typings.luminoWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPropertyInspectorProvider extends js.Object {
  
  /**
    * Register a widget in the property inspector provider.
    *
    * @param widget The owner widget whose properties will be inspected.
    *
    * ## Notes
    * Only one property inspector can be provided for each widget.
    * Registering the same widget twice will result in an error.
    * A widget can be unregistered by disposing of its property
    * inspector.
    */
  def register(widget: Widget): IPropertyInspector = js.native
}
@JSImport("@jupyterlab/property-inspector/lib/token", "IPropertyInspectorProvider")
@js.native
object IPropertyInspectorProvider extends TopLevel[Token[IPropertyInspectorProvider]]
