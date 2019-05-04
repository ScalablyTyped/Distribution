package typings
package atJupyterlabApputilsLib.libHoverboxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/apputils/lib/hoverbox", "HoverBox")
@js.native
object HoverBoxNs extends js.Object {
  /**
    * Options for setting the geometry of a hovering node and its anchor node.
    */
  trait IOptions extends js.Object {
    /**
      * The referent anchor rectangle to which the hover box is bound.
      *
      * #### Notes
      * In an editor context, this value will typically be the cursor's
      * coordinate position, which can be retrieved via calling the
      * `getCoordinateForPosition` method.
      */
    var anchor: stdLib.ClientRect
    /**
      * The node that hosts the anchor.
      *
      * #### Notes
      * The visibility of the anchor rectangle within this host node is the
      * heuristic that determines whether the hover box ought to be visible.
      */
    var host: stdLib.HTMLElement
    /**
      * The maximum height of a hover box.
      *
      * #### Notes
      * This value is only used if a CSS max-height attribute is not set for the
      * hover box. It is a fallback value.
      */
    var maxHeight: scala.Double
    /**
      * The minimum height of a hover box.
      */
    var minHeight: scala.Double
    /**
      * The hover box node.
      */
    var node: stdLib.HTMLElement
    /**
      * Optional pixel offset values added to where the hover box should render.
      *
      * #### Notes
      * This option is useful for passing in values that may pertain to CSS
      * borders or padding in cases where the text inside the hover box may need
      * to align with the text of the referent editor.
      *
      * Because the hover box calculation may render a box either above or below
      * the cursor, the `vertical` offset accepts `above` and `below` values for
      * the different render modes.
      */
    var offset: js.UndefOr[atJupyterlabApputilsLib.Anon_Horizontal] = js.undefined
    /**
      * If space is available both above and below the anchor, denote which
      * location is privileged. Use forceBelow and forceAbove to mandate where
      * hover box should render relative to anchor.
      *
      * #### Notes
      * The default value is `'below'`.
      */
    var privilege: js.UndefOr[
        atJupyterlabApputilsLib.atJupyterlabApputilsLibStrings.above | atJupyterlabApputilsLib.atJupyterlabApputilsLibStrings.below | atJupyterlabApputilsLib.atJupyterlabApputilsLibStrings.forceAbove | atJupyterlabApputilsLib.atJupyterlabApputilsLibStrings.forceBelow
      ] = js.undefined
    /**
      * If the style of the node has already been computed, it can be passed into
      * the hover box for geometry calculation.
      */
    var style: js.UndefOr[stdLib.CSSStyleDeclaration] = js.undefined
  }
  
  /**
    * Set the visible dimensions of a hovering box anchored to an editor cursor.
    *
    * @param options - The hover box geometry calculation options.
    */
  def setGeometry(options: IOptions): scala.Unit = js.native
}

