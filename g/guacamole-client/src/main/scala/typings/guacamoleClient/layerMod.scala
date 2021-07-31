package typings.guacamoleClient

import typings.guacamoleClient.anon.FnCall
import typings.guacamoleClient.anon.FnCallPathFillRule
import typings.guacamoleClient.guacamoleClientNumbers.`0x1`
import typings.guacamoleClient.guacamoleClientNumbers.`0x2`
import typings.guacamoleClient.guacamoleClientNumbers.`0x4`
import typings.guacamoleClient.guacamoleClientNumbers.`0x6`
import typings.guacamoleClient.guacamoleClientNumbers.`0x8`
import typings.guacamoleClient.guacamoleClientNumbers.`0x9`
import typings.guacamoleClient.guacamoleClientNumbers.`0xa`
import typings.guacamoleClient.guacamoleClientNumbers.`0xb`
import typings.guacamoleClient.guacamoleClientNumbers.`0xc`
import typings.guacamoleClient.guacamoleClientNumbers.`0xe`
import typings.guacamoleClient.guacamoleClientNumbers.`0xf`
import typings.guacamoleClient.layerMod.Layer.LineCap
import typings.guacamoleClient.layerMod.Layer.LineJoin
import typings.guacamoleClient.layerMod.Layer.Pixel
import typings.std.CanvasFillRule
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.Path2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layerMod {
  
  @JSImport("guacamole-client/lib/Layer", "Layer")
  @js.native
  class Layer protected () extends StObject {
    /**
      * @param width The width of the Layer, in pixels. The canvas element
      * backing this Layer will be given this width.
      * @param height The height of the Layer, in pixels. The canvas element
      * backing this Layer will be given this height.
      */
    def this(width: Double, height: Double) = this()
    
    /**
      * Add the specified arc to the current path.
      * @param x The X coordinate of the center of the circle which
      *                   will contain the arc.
      * @param y The Y coordinate of the center of the circle which
      *                   will contain the arc.
      * @param radius The radius of the circle.
      * @param startAngle The starting angle of the arc, in radians.
      * @param endAngle The ending angle of the arc, in radians.
      * @param negative Whether the arc should be drawn in order of
      *                           decreasing angle.
      */
    def arc(x: Double, y: Double, radius: Double, startAngle: Double, endAngle: Double): Unit = js.native
    /**
      * Add the specified arc to the current path.
      * @param x The X coordinate of the center of the circle which
      *                   will contain the arc.
      * @param y The Y coordinate of the center of the circle which
      *                   will contain the arc.
      * @param radius The radius of the circle.
      * @param startAngle The starting angle of the arc, in radians.
      * @param endAngle The ending angle of the arc, in radians.
      * @param negative Whether the arc should be drawn in order of
      *                           decreasing angle.
      */
    def arc(x: Double, y: Double, radius: Double, startAngle: Double, endAngle: Double, anticlockwise: Boolean): Unit = js.native
    /**
      * Add the specified arc to the current path.
      * @param x The X coordinate of the center of the circle which
      *                   will contain the arc.
      * @param y The Y coordinate of the center of the circle which
      *                   will contain the arc.
      * @param radius The radius of the circle.
      * @param startAngle The starting angle of the arc, in radians.
      * @param endAngle The ending angle of the arc, in radians.
      * @param negative Whether the arc should be drawn in order of
      *                           decreasing angle.
      */
    @JSName("arc")
    var arc_Original: FnCall = js.native
    
    /**
      * Set to true if this Layer should resize itself to accomodate the
      * dimensions of any drawing operation, and false (the default) otherwise.
      * Note that setting this property takes effect immediately, and thus may
      * take effect on operations that were started in the past but have not
      * yet completed. If you wish the setting of this flag to only modify
      * future operations, you will need to make the setting of this flag an
      * operation with sync().
      * @example
      * // Set autosize to true for all future operations
      * layer.sync(function() {
      *     layer.autosize = true;
      * });
      */
    var autoresize: Boolean = js.native
    
    /**
      * Clip all future drawing operations by the current path. The current path
      * is implicitly closed. The current path can continue to be reused
      * for other operations (such as fillColor()) but a new path will be started
      * once a path drawing operation (path() or rect()) is used.
      */
    def clip(): Unit = js.native
    /**
      * Clip all future drawing operations by the current path. The current path
      * is implicitly closed. The current path can continue to be reused
      * for other operations (such as fillColor()) but a new path will be started
      * once a path drawing operation (path() or rect()) is used.
      */
    def clip(fillRule: CanvasFillRule): Unit = js.native
    /**
      * Clip all future drawing operations by the current path. The current path
      * is implicitly closed. The current path can continue to be reused
      * for other operations (such as fillColor()) but a new path will be started
      * once a path drawing operation (path() or rect()) is used.
      */
    def clip(path: Path2D): Unit = js.native
    /**
      * Clip all future drawing operations by the current path. The current path
      * is implicitly closed. The current path can continue to be reused
      * for other operations (such as fillColor()) but a new path will be started
      * once a path drawing operation (path() or rect()) is used.
      */
    def clip(path: Path2D, fillRule: CanvasFillRule): Unit = js.native
    /**
      * Clip all future drawing operations by the current path. The current path
      * is implicitly closed. The current path can continue to be reused
      * for other operations (such as fillColor()) but a new path will be started
      * once a path drawing operation (path() or rect()) is used.
      */
    @JSName("clip")
    var clip_Original: FnCallPathFillRule = js.native
    
    /**
      * Closes the current path by connecting the end point with the start
      * point (if any) with a straight line.
      */
    def close(): Unit = js.native
    /**
      * Closes the current path by connecting the end point with the start
      * point (if any) with a straight line.
      */
    @JSName("close")
    var close_Original: js.Function0[Unit] = js.native
    
    /**
      * Copy a rectangle of image data from one Layer to this Layer. This
      * operation will copy exactly the image data that will be drawn once all
      * operations of the source Layer that were pending at the time this
      * function was called are complete. This operation will not alter the
      * size of the source Layer even if its autosize property is set to true.
      * @param srcLayer The Layer to copy image data from.
      * @param srcx The X coordinate of the upper-left corner of the
      * rectangle within the source Layer's coordinate space to copy data from.
      * @param srcy The Y coordinate of the upper-left corner of the
      * rectangle within the source Layer's coordinate space to copy data from.
      * @param srcw The width of the rectangle within the source Layer's
      * coordinate space to copy data from.
      * @param srch The height of the rectangle within the source
      * Layer's coordinate space to copy data from.
      * @param x The destination X coordinate.
      * @param y The destination Y coordinate.
      */
    def copy(srcLayer: Layer, srcx: Double, srcy: Double, srcw: Double, srch: Double, x: Double, y: Double): Unit = js.native
    
    /**
      * Starts a new path at the specified point.
      * @param cp1x The X coordinate of the first control point.
      * @param cp1y The Y coordinate of the first control point.
      * @param cp2x The X coordinate of the second control point.
      * @param cp2y The Y coordinate of the second control point.
      * @param x The X coordinate of the endpoint of the curve.
      * @param y The Y coordinate of the endpoint of the curve.
      */
    def curveTo(cp1x: Double, cp1y: Double, cp2x: Double, cp2y: Double, x: Double, y: Double): Unit = js.native
    /**
      * Starts a new path at the specified point.
      * @param cp1x The X coordinate of the first control point.
      * @param cp1y The Y coordinate of the first control point.
      * @param cp2x The X coordinate of the second control point.
      * @param cp2y The Y coordinate of the second control point.
      * @param x The X coordinate of the endpoint of the curve.
      * @param y The Y coordinate of the endpoint of the curve.
      */
    @JSName("curveTo")
    var curveTo_Original: js.Function6[
        /* cp1x */ Double, 
        /* cp1y */ Double, 
        /* cp2x */ Double, 
        /* cp2y */ Double, 
        /* x */ Double, 
        /* y */ Double, 
        Unit
      ] = js.native
    
    def distort(a: Double, b: Double, c: Double, d: Double, e: Double, f: Double): Unit = js.native
    
    /**
      * Draws the specified image at the given coordinates. The image specified
      * must already be loaded.
      * @param x The destination X coordinate.
      * @param y The destination Y coordinate.
      * @param image The image to draw. Note that this is an Image object - not a URL.
      */
    def drawImage(x: Double, y: Double, image: HTMLImageElement): Unit = js.native
    
    /**
      * Fills the current path with the specified color. The current path
      * is implicitly closed. The current path can continue to be reused
      * for other operations (such as clip()) but a new path will be started
      * once a path drawing operation (path() or rect()) is used.
      * @param r The red component of the color to fill.
      * @param g The green component of the color to fill.
      * @param b The blue component of the color to fill.
      * @param a The alpha component of the color to fill.
      */
    def fillColor(r: Double, g: Double, b: Double, a: Double): Unit = js.native
    
    /**
      * Fills the current path with the image within the specified layer. The
      * is implicitly closed. The current path can continue to be reused
      * for other operations (such as clip()) but a new path will be started
      * once a path drawing operation (path() or rect()) is used.
      * @param srcLayer The layer to use as a repeating pattern within the fill.
      */
    def fillLayer(srcLayer: Layer): Unit = js.native
    
    /**
      * Returns the canvas element backing this Layer. Note that the dimensions
      * of the canvas may not exactly match those of the Layer, as resizing a
      * canvas while maintaining its state is an expensive operation.
      * @returns The canvas element backing this Layer.
      */
    def getCanvas(): HTMLCanvasElement = js.native
    
    /**
      * The current height of this layer.
      */
    var height: Double = js.native
    
    /**
      * Add the specified line to the current path.
      * @param x The X coordinate of the endpoint of the line to draw.
      * @param y The Y coordinate of the endpoint of the line to draw.
      */
    def lineTo(x: Double, y: Double): Unit = js.native
    /**
      * Add the specified line to the current path.
      * @param x The X coordinate of the endpoint of the line to draw.
      * @param y The Y coordinate of the endpoint of the line to draw.
      */
    @JSName("lineTo")
    var lineTo_Original: js.Function2[/* x */ Double, /* y */ Double, Unit] = js.native
    
    /**
      * Starts a new path at the specified point.
      * @param x The X coordinate of the point to draw.
      * @param y The Y coordinate of the point to draw.
      */
    def moveTo(x: Double, y: Double): Unit = js.native
    /**
      * Starts a new path at the specified point.
      * @param x The X coordinate of the point to draw.
      * @param y The Y coordinate of the point to draw.
      */
    @JSName("moveTo")
    var moveTo_Original: js.Function2[/* x */ Double, /* y */ Double, Unit] = js.native
    
    /**
      * Pop layer state off stack.
      */
    def pop(): Unit = js.native
    
    /**
      * Push current layer state onto stack.
      */
    def push(): Unit = js.native
    
    /**
      * Put a rectangle of image data from one Layer to this Layer directly
      * without performing any alpha blending. Simply copy the data.
      * @param srcLayer The Layer to copy image data from.
      * @param srcx The X coordinate of the upper-left corner of the
      * rectangle within the source Layer's coordinate space to copy data from.
      * @param srcy The Y coordinate of the upper-left corner of the
      * rectangle within the source Layer's coordinate space to copy data from.
      * @param srcw The width of the rectangle within the source Layer's
      * coordinate space to copy data from.
      * @param srch The height of the rectangle within the source
      * coordinate space to copy data from.
      * @param x The destination X coordinate.
      * @param y The destination Y coordinate.
      */
    def put(srcLayer: Layer, srcx: Double, srcy: Double, srcw: Double, srch: Double, x: Double, y: Double): Unit = js.native
    
    /**
      * Add the specified rectangle to the current path.
      * @param x The X coordinate of the upper-left corner of the rectangle to draw.
      * @param y The Y coordinate of the upper-left corner of the rectangle to draw.
      * @param w The width of the rectangle to draw.
      * @param h The height of the rectangle to draw.
      */
    def rect(x: Double, y: Double, w: Double, h: Double): Unit = js.native
    /**
      * Add the specified rectangle to the current path.
      * @param x The X coordinate of the upper-left corner of the rectangle to draw.
      * @param y The Y coordinate of the upper-left corner of the rectangle to draw.
      * @param w The width of the rectangle to draw.
      * @param h The height of the rectangle to draw.
      */
    @JSName("rect")
    var rect_Original: js.Function4[/* x */ Double, /* y */ Double, /* w */ Double, /* h */ Double, Unit] = js.native
    
    /**
      * Reset the layer, clearing the stack, the current path, and any transform
      * matrix.
      */
    def reset(): Unit = js.native
    
    /**
      * Changes the size of this Layer to the given width and height. Resizing
      * is only attempted if the new size provided is actually different from
      * the current size.
      * @param newWidth The new width to assign to this Layer.
      * @param newHeight The new height to assign to this Layer.
      */
    def resize(newWidth: Double, newHeight: Double): Unit = js.native
    
    /**
      * Sets the channel mask for future operations on this Layer.
      * The channel mask is a Guacamole-specific compositing operation identifier
      * with a single bit representing each of four channels (in order): source
      * image where destination transparent, source where destination opaque,
      * destination where source transparent, and destination where source opaque.
      * @param mask The channel mask for future operations on this Layer.
      */
    def setChannelMask(mask: Double): Unit = js.native
    
    /**
      * Sets the miter limit for stroke operations using the miter join. This
      * limit is the maximum ratio of the size of the miter join to the stroke
      * width. If this ratio is exceeded, the miter will not be drawn for that
      * joint of the path.
      * @param limit The miter limit for stroke operations using the miter join.
      */
    def setMiterLimit(limit: Double): Unit = js.native
    
    /**
      * Sets the given affine transform (defined with six values from the
      * transform's matrix).
      * @param a The first value in the affine transform's matrix.
      * @param b The second value in the affine transform's matrix.
      * @param c The third value in the affine transform's matrix.
      * @param d The fourth value in the affine transform's matrix.
      * @param e The fifth value in the affine transform's matrix.
      * @param f The sixth value in the affine transform's matrix.
      */
    def setTransform(a: Double, b: Double, c: Double, d: Double, e: Double, f: Double): Unit = js.native
    
    /**
      * Stroke the current path with the specified color. The current path
      * is implicitly closed. The current path can continue to be reused
      * for other operations (such as clip()) but a new path will be started
      * once a path drawing operation (path() or rect()) is used.
      * @param cap The line cap style. Can be "round", "square", or "butt".
      * @param join The line join style. Can be "round", "bevel", miter".
      * @param thickness The line thickness in pixels.
      * @param r The red component of the color to fill.
      * @param g The green component of the color to fill.
      * @param b The blue component of the color to fill.
      * @param a The alpha component of the color to fill.
      */
    def strokeColor(cap: LineCap, join: LineJoin, thickness: Double, r: Double, g: Double, b: Double, a: Double): Unit = js.native
    
    /**
      * Stroke the current path with the specified color. The current path
      * is implicitly closed. The current path can continue to be reused
      * for other operations (such as clip()) but a new path will be started
      * once a path drawing operation (path() or rect()) is used.
      * @param cap The line cap style. Can be "round", "square", or "butt".
      * @param join The line join style. Can be "round", "bevel", or "miter".
      * @param thickness The line thickness in pixels.
      * @param r The red component of the color to fill.
      * @param g The green component of the color to fill.
      * @param b The blue component of the color to fill.
      * @param a The alpha component of the color to fill.
      */
    def strokeLayer(cap: LineCap, join: LineJoin, thickness: Double, layer: Layer): Unit = js.native
    
    /**
      * Returns a new canvas element containing the same image as this Layer.
      * Unlike getCanvas(), the canvas element returned is guaranteed to have
      * the exact same dimensions as the Layer.
      * @returns A new canvas element containing a copy of the image content this Layer.
      */
    def toCanvas(): HTMLCanvasElement = js.native
    
    /**
      * Transfer a rectangle of image data from one Layer to this Layer using the
      * specified transfer function.
      * @param srcLayer The Layer to copy image data from.
      * @param srcx The X coordinate of the upper-left corner of the
      *                      rectangle within the source Layer's coordinate
      *                      space to copy data from.
      * @param srcy The Y coordinate of the upper-left corner of the
      *                      rectangle within the source Layer's coordinate
      *                      space to copy data from.
      * @param srcw The width of the rectangle within the source Layer's
      *                      coordinate space to copy data from.
      * @param srch The height of the rectangle within the source
      *                      Layer's coordinate space to copy data from.
      * @param x The destination X coordinate.
      * @param y The destination Y coordinate.
      * @param transferFunction The transfer function to use to
      * transfer data from source to destination.
      */
    def transfer(
      srcLayer: Layer,
      srcx: Double,
      srcy: Double,
      srcw: Double,
      srch: Double,
      x: Double,
      y: Double,
      transferFunction: js.Function2[/* srcPixel */ Pixel, /* dstPixel */ Pixel, Unit]
    ): Unit = js.native
    
    /**
      * Applies the given affine transform (defined with six values from the
      * transform's matrix).
      * @param a The first value in the affine transform's matrix.
      * @param b The second value in the affine transform's matrix.
      * @param c The third value in the affine transform's matrix.
      * @param d The fourth value in the affine transform's matrix.
      * @param e The fifth value in the affine transform's matrix.
      * @param f The sixth value in the affine transform's matrix.
      */
    def transform(a: Double, b: Double, c: Double, d: Double, e: Double, f: Double): Unit = js.native
    
    /**
      * The current width of this layer.
      */
    var width: Double = js.native
  }
  /* static members */
  object Layer {
    
    /**
      * Channel mask for the composite operation "atop".
      */
    @JSImport("guacamole-client/lib/Layer", "Layer.ATOP")
    @js.native
    val ATOP: `0x6` = js.native
    
    /**
      * Channel mask for the composite operation "in".
      * Beware that WebKit-based browsers may leave the contents of the destionation
      * layer where the source layer is transparent, despite the definition of this
      * operation.
      */
    @JSImport("guacamole-client/lib/Layer", "Layer.IN")
    @js.native
    val IN: `0x4` = js.native
    
    /**
      * Channel mask for the composite operation "out".
      * Beware that WebKit-based browsers may leave the contents of the destionation
      * layer where the source layer is transparent, despite the definition of this
      * operation.
      */
    @JSImport("guacamole-client/lib/Layer", "Layer.OUT")
    @js.native
    val OUT: `0x8` = js.native
    
    /**
      * Channel mask for the composite operation "over".
      */
    @JSImport("guacamole-client/lib/Layer", "Layer.OVER")
    @js.native
    val OVER: `0xe` = js.native
    
    /**
      * Channel mask for the composite operation "plus".
      */
    @JSImport("guacamole-client/lib/Layer", "Layer.PLUS")
    @js.native
    val PLUS: `0xf` = js.native
    
    @JSImport("guacamole-client/lib/Layer", "Layer.Pixel")
    @js.native
    class Pixel protected () extends StObject {
      /**
        * @param r The red component of this pixel.
        * @param g The green component of this pixel.
        * @param b The blue component of this pixel.
        * @param a The alpha component of this pixel.
        */
      def this(r: Double, g: Double, b: Double, a: Double) = this()
      
      /**
        * The alpha component of this pixel, where 0 is the minimum value,
        * and 255 is the maximum.
        */
      var alpha: Double = js.native
      
      /**
        * The blue component of this pixel, where 0 is the minimum value,
        * and 255 is the maximum.
        */
      var blue: Double = js.native
      
      /**
        * The green component of this pixel, where 0 is the minimum value,
        * and 255 is the maximum.
        */
      var green: Double = js.native
      
      /**
        * The red component of this pixel, where 0 is the minimum value,
        * and 255 is the maximum.
        */
      var red: Double = js.native
    }
    
    /**
      * Channel mask for the composite operation "ratop".
      * Beware that WebKit-based browsers may leave the contents of the destionation
      * layer where the source layer is transparent, despite the definition of this
      * operation.
      */
    @JSImport("guacamole-client/lib/Layer", "Layer.RATOP")
    @js.native
    val RATOP: `0x9` = js.native
    
    /**
      * Channel mask for the composite operation "rin".
      * Beware that WebKit-based browsers may leave the contents of the destionation
      * layer where the source layer is transparent, despite the definition of this
      * operation.
      */
    @JSImport("guacamole-client/lib/Layer", "Layer.RIN")
    @js.native
    val RIN: `0x1` = js.native
    
    /**
      * Channel mask for the composite operation "rout".
      */
    @JSImport("guacamole-client/lib/Layer", "Layer.ROUT")
    @js.native
    val ROUT: `0x2` = js.native
    
    /**
      * Channel mask for the composite operation "rover".
      */
    @JSImport("guacamole-client/lib/Layer", "Layer.ROVER")
    @js.native
    val ROVER: `0xb` = js.native
    
    /**
      * Channel mask for the composite operation "src".
      * Beware that WebKit-based browsers may leave the contents of the destionation
      * layer where the source layer is transparent, despite the definition of this
      * operation.
      */
    @JSImport("guacamole-client/lib/Layer", "Layer.SRC")
    @js.native
    val SRC: `0xc` = js.native
    
    /**
      * Channel mask for the composite operation "xor".
      */
    @JSImport("guacamole-client/lib/Layer", "Layer.XOR")
    @js.native
    val XOR: `0xa` = js.native
    
    /* Rewritten from type alias, can be one of: 
      - typings.guacamoleClient.guacamoleClientStrings.round
      - typings.guacamoleClient.guacamoleClientStrings.square
      - typings.guacamoleClient.guacamoleClientStrings.butt
    */
    trait LineCap extends StObject
    object LineCap {
      
      @scala.inline
      def butt: typings.guacamoleClient.guacamoleClientStrings.butt = "butt".asInstanceOf[typings.guacamoleClient.guacamoleClientStrings.butt]
      
      @scala.inline
      def round: typings.guacamoleClient.guacamoleClientStrings.round = "round".asInstanceOf[typings.guacamoleClient.guacamoleClientStrings.round]
      
      @scala.inline
      def square: typings.guacamoleClient.guacamoleClientStrings.square = "square".asInstanceOf[typings.guacamoleClient.guacamoleClientStrings.square]
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.guacamoleClient.guacamoleClientStrings.round
      - typings.guacamoleClient.guacamoleClientStrings.bevel
      - typings.guacamoleClient.guacamoleClientStrings.mitter
    */
    trait LineJoin extends StObject
    object LineJoin {
      
      @scala.inline
      def bevel: typings.guacamoleClient.guacamoleClientStrings.bevel = "bevel".asInstanceOf[typings.guacamoleClient.guacamoleClientStrings.bevel]
      
      @scala.inline
      def mitter: typings.guacamoleClient.guacamoleClientStrings.mitter = "mitter".asInstanceOf[typings.guacamoleClient.guacamoleClientStrings.mitter]
      
      @scala.inline
      def round: typings.guacamoleClient.guacamoleClientStrings.round = "round".asInstanceOf[typings.guacamoleClient.guacamoleClientStrings.round]
    }
  }
}
