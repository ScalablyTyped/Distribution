package typings.luminoWidgets.widgetMod.Widget

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Flag extends js.Object

/**
  * An enum of widget bit flags.
  */
@JSImport("@lumino/widgets/types/widget", "Widget.Flag")
@js.native
object Flag extends js.Object {
  /**
    * A layout cannot be set on the widget.
    */
  @js.native
  sealed trait DisallowLayout extends Flag
  
  /**
    * The widget is attached to the DOM.
    */
  @js.native
  sealed trait IsAttached extends Flag
  
  /**
    * The widget has been disposed.
    */
  @js.native
  sealed trait IsDisposed extends Flag
  
  /**
    * The widget is hidden.
    */
  @js.native
  sealed trait IsHidden extends Flag
  
  /**
    * The widget is visible.
    */
  @js.native
  sealed trait IsVisible extends Flag
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Flag with Double] = js.native
  /* 16 */ @js.native
  object DisallowLayout extends TopLevel[DisallowLayout with Double]
  
  /* 2 */ @js.native
  object IsAttached extends TopLevel[IsAttached with Double]
  
  /* 1 */ @js.native
  object IsDisposed extends TopLevel[IsDisposed with Double]
  
  /* 4 */ @js.native
  object IsHidden extends TopLevel[IsHidden with Double]
  
  /* 8 */ @js.native
  object IsVisible extends TopLevel[IsVisible with Double]
  
}

