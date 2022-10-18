package typings.luminoWidgets.mod

import typings.luminoWidgets.typesBoxlayoutMod.BoxLayout.IOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@lumino/widgets", "BoxLayout")
@js.native
/**
  * Construct a new box layout.
  *
  * @param options - The options for initializing the layout.
  */
open class BoxLayout ()
  extends typings.luminoWidgets.typesBoxlayoutMod.BoxLayout {
  def this(options: IOptions) = this()
}
object BoxLayout {
  
  @JSImport("@lumino/widgets", "BoxLayout")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Get the box layout size basis for the given widget.
    *
    * @param widget - The widget of interest.
    *
    * @returns The box layout size basis for the widget.
    */
  inline def getSizeBasis(widget: typings.luminoWidgets.typesWidgetMod.Widget): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getSizeBasis")(widget.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * Get the box layout stretch factor for the given widget.
    *
    * @param widget - The widget of interest.
    *
    * @returns The box layout stretch factor for the widget.
    */
  inline def getStretch(widget: typings.luminoWidgets.typesWidgetMod.Widget): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getStretch")(widget.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * Set the box layout size basis for the given widget.
    *
    * @param widget - The widget of interest.
    *
    * @param value - The value for the size basis.
    */
  inline def setSizeBasis(widget: typings.luminoWidgets.typesWidgetMod.Widget, value: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setSizeBasis")(widget.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Set the box layout stretch factor for the given widget.
    *
    * @param widget - The widget of interest.
    *
    * @param value - The value for the stretch factor.
    */
  inline def setStretch(widget: typings.luminoWidgets.typesWidgetMod.Widget, value: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setStretch")(widget.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
