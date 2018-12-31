package typings
package highchartsLib.highchartsMod.HighchartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Allows direct access to the Highcharts rendering layer in order to draw primitive shapes like circles,
  * rectangles,paths or text directly on a chart, or independent from any chart. The Renderer represents a wrapper object
  * for SVGin modern browsers and VML in IE < 8.
  *
  * An existing chart's renderer can be accessed through chart.renderer. To create a renderer independent from a chart,
  * use var renderer = new Highcharts.Renderer(parentNode, width, height); where parentNode is the HTML element where you
  * want to add it.
  *
  * The Renderer's methods are chained wherever possible, so you can initiate an element then call for example attr and
  * css and add on that element in one statement.
  */
@js.native
trait RendererObject extends js.Object {
  /**
    * Draw an arc on the renderer canvas.
    * @param  centerX The x position of the arc's center in the SVG element.
    * @param  centerY The y position of the arc's center in the SVG element.
    * @param  outerRadius The outer radius of the arc.
    * @param  innerRadius The inner radius of the arc.
    * @param  start The starting angle of the arc in radians, where 0 is to the right and -Math.PI/2 is up.
    * @param  end The ending angle of the arc in radians, where 0 is to the right and -Math.PI/2 is up.
    * @since 2.0
    */
  def arc(
    centerX: scala.Double,
    centerY: scala.Double,
    outerRadius: scala.Double,
    innerRadius: scala.Double,
    start: scala.Double,
    end: scala.Double
  ): ElementObject = js.native
  /**
    * Draw circle on the renderer canvas.
    * @param  centerX The x position of the circle's center in the SVG element.
    * @param  centerY The y position of the circle's center in the SVG element.
    * @param  radius  [description]
    * @since 2.0
    */
  def circle(centerX: scala.Double, centerY: scala.Double, radius: scala.Double): ElementObject = js.native
  /**
    * Styled mode only. A hook for adding general definitions to the SVG's defs tag. Definitions can be referenced from
    * the CSS by its id. Read more in Gradients, shadows and patterns.
    * The definitions can also be added as configuration options, see defs.
    * @param A serialized form of an SVG definition, including children.
    * @since 5.0.0
    */
  def definition(`def`: js.Object): ElementObject = js.native
  /**
    * Utility to return the baseline offset and total line height from the font size.
    *
    * @param fontSize The current font size to inspect. If not given, the font size will be found from the DOM element.
    * @param elem The element to inspect for a current font size.
    */
  def fontMetrics(fontSize: java.lang.String, elem: ElementObject): FontMetrics = js.native
  /**
    * Add an SVG/VML group.
    * @param [string] name The name of the group. This will be used in the class name, which will be 'highcharts-'+ name.
    * Other Element objects are added to the group by using the group as the first parameter in .add() for the wrappers
    * @since 2.0
    */
  def g(): ElementObject = js.native
  def g(name: java.lang.String): ElementObject = js.native
  /**
    * Add an image from an external resource.
    * @param  source The URL of the image.
    * @param  x      The x position of the image's upper left corner.
    * @param  y      The y position of the image's upper left corner.
    * @param  width  The width of the image.
    * @param  height The height of the image.
    * @since 2.0
    */
  def image(
    source: java.lang.String,
    x: scala.Double,
    y: scala.Double,
    width: scala.Double,
    height: scala.Double
  ): ElementObject = js.native
  /**
    * Draw a label, which is an extended text element with support for border and background. Highcharts creates a g
    * element with a text and a path or rect inside, to make it behave somewhat like a HTML div. Border and background
    * are set through stroke, stroke-width and fill attributes using the attr method. This must be done before calling
    * add.
    * @param  str The text or HTML to draw
    * @param  x The x position of the label's left side.
    * @param  y The y position of the label's top side or baseline, depending on the baseline parameter.
    * @param  [string] shape The shape of the label's border/background, if any. Defaults to rect.
    * @param  [number] anchorX If the shape has a pointer, like the chevron on a callout shape, anchorX is the x position to point to.
    * @param  [number] anchorY If the shape has a pointer, like the chevron on a callout shape, anchorY is the y position to point to.
    * @param  [boolean] useHTML Use HTML to render the text of the label.
    * @param  [boolean] baseline Whether the label should be vertically aligned by the text baseline, which makes it behave like the text element,
    * or by the top left side, which makes it behave like a HTML div.
    * @param  [string] className A class name for the g element surrounding the label.
    * @since 2.0
    */
  def label(
    str: java.lang.String,
    x: scala.Double,
    y: scala.Double,
    shape: js.UndefOr[java.lang.String],
    anchorX: js.UndefOr[scala.Double],
    anchorY: js.UndefOr[scala.Double],
    useHTML: js.UndefOr[scala.Boolean],
    baseline: js.UndefOr[scala.Boolean],
    className: js.UndefOr[java.lang.String]
  ): ElementObject = js.native
  /**
    * Add a path based on SVG's path commands. In SVG capable browsers all path commands are supported, but in VML only
    * a subset is supported: absolute moveTo (M), absolute lineTo (L), absolute curveTo (C) and close (Z).
    * @param  path An SVG path split up in array form.
    */
  def path(path: js.Array[java.lang.String | scala.Double]): ElementObject = js.native
  /**
    * Add a rectangle.
    * @param  x The x position of the rectangle's upper left corner.
    * @param  y The y position of the rectangle's upper left corner.
    * @param  width The width of the rectangle.
    * @param  height The height of the rectangle.
    * @param  cornerRadius The corner radius of all the rectangle's corners.
    * @since 2.0
    */
  def rect(
    x: scala.Double,
    y: scala.Double,
    width: scala.Double,
    height: scala.Double,
    cornerRadius: scala.Double
  ): ElementObject = js.native
  /**
    * Draw text. The text can contain a subset of HTML, like spans and anchors and some basic text styling of these.
    * For more advanced features like border and background, use label instead.
    * @param  str The text or HTML to draw
    * @param  x The x position of the text's lower left corner.
    * @param  y The y position of the text's lower left corner.
    * @since 2.0
    */
  def text(str: java.lang.String, x: scala.Double, y: scala.Double): ElementObject = js.native
}

