package typings.luminoWidgets.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@lumino/widgets", "LayoutItem")
@js.native
open class LayoutItem protected ()
  extends typings.luminoWidgets.typesLayoutMod.LayoutItem {
  /**
    * Construct a new layout item.
    *
    * @param widget - The widget to be managed by the item.
    *
    * #### Notes
    * The widget will be set to absolute positioning.
    * The widget will use strict CSS containment.
    */
  def this(widget: typings.luminoWidgets.typesWidgetMod.Widget) = this()
}
