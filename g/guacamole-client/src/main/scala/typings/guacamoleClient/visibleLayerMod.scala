package typings.guacamoleClient

import typings.guacamoleClient.layerMod.Layer
import typings.std.HTMLElement
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("guacamole-client/lib/VisibleLayer", JSImport.Namespace)
@js.native
object visibleLayerMod extends js.Object {
  @js.native
  class VisibleLayer protected () extends Layer {
    /**
      * @param width The width of the Layer, in pixels. The canvas element backing this Layer will be given this width.
      * @param height The height of the Layer, in pixels. The canvas element backing this Layer will be given this height.
      */
    def this(width: Double, height: Double) = this()
    /**
      * The opacity of the layer container, where 255 is fully opaque and 0 is
      * fully transparent.
      */
    var alpha: Double = js.native
    /**
      * Set of all children of this layer, indexed by layer index. This object
      * will have one property per child.
      */
    var children: Record[Double, js.UndefOr[VisibleLayer]] = js.native
    /**
      * The affine transformation applied to this layer container. Each element
      * corresponds to a value from the transformation matrix, with the first
      * three values being the first row, and the last three values being the
      * second row. There are six values total.
      */
    var matrix: js.Tuple6[Double, Double, Double, Double, Double, Double] = js.native
    /**
      * The parent layer container of this layer, if any.
      */
    var parent: VisibleLayer | Null = js.native
    /**
      * X coordinate of the upper-left corner of this layer container within
      * its parent, in pixels.
      */
    var x: Double = js.native
    /**
      * Y coordinate of the upper-left corner of this layer container within
      * its parent, in pixels.
      */
    var y: Double = js.native
    /**
      * Z stacking order of this layer relative to other sibling layers.
      */
    var z: Double = js.native
    /**
      * Removes this layer container entirely, such that it is no longer
      * contained within its parent layer, if any.
      */
    def dispose(): Unit = js.native
    /**
      * Returns the element containing the canvas and any other elements
      * associated with this layer.
      * @returns The element containing this layer's canvas.
      */
    def getElement(): HTMLElement = js.native
    /**
      * Moves the upper-left corner of this VisibleLayer to the given X and Y
      * coordinate, sets the Z stacking order, and reparents this VisibleLayer
      * to the given VisibleLayer.
      * @param parent The parent to set.
      * @param x The X coordinate to move to.
      * @param y The Y coordinate to move to.
      * @param z The Z coordinate to move to.
      */
    def move(parent: VisibleLayer, x: Double, y: Double, z: Double): Unit = js.native
    /**
      * Sets the opacity of this layer to the given value, where 255 is fully
      * opaque and 0 is fully transparent.
      * @param a The opacity to set.
      */
    def shade(a: Double): Unit = js.native
    /**
      * Moves the upper-left corner of this layer to the given X and Y coordinate.
      * @param x The X coordinate to move to.
      * @param y The Y coordinate to move to.
      */
    def translate(x: Double, y: Double): Unit = js.native
  }
  
}

