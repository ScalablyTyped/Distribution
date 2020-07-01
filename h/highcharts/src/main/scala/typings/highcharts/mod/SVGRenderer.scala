package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("highcharts", "SVGRenderer")
@js.native
class SVGRenderer protected () extends js.Object {
  /**
    * Allows direct access to the Highcharts rendering layer in order to draw
    * primitive shapes like circles, rectangles, paths or text directly on a
    * chart, or independent from any chart. The SVGRenderer represents a
    * wrapper object for SVG in modern browsers. Through the VMLRenderer, part
    * of the `oldie.js` module, it also brings vector graphics to IE <= 8.
    *
    * An existing chart's renderer can be accessed through Chart.renderer. The
    * renderer can also be used completely decoupled from a chart.
    *
    * @param container
    *        Where to put the SVG in the web page.
    *
    * @param width
    *        The width of the SVG.
    *
    * @param height
    *        The height of the SVG.
    *
    * @param style
    *        The box style, if not in styleMode
    *
    * @param forExport
    *        Whether the rendered content is intended for export.
    *
    * @param allowHTML
    *        Whether the renderer is allowed to include HTML text, which will
    *        be projected on top of the SVG.
    *
    * @param styledMode
    *        Whether the renderer belongs to a chart that is in styled mode. If
    *        it does, it will avoid setting presentational attributes in some
    *        cases, but not when set explicitly through `.attr` and `.css` etc.
    */
  def this(container: HTMLDOMElement, width: Double, height: Double) = this()
  def this(container: HTMLDOMElement, width: Double, height: Double, style: CSSObject) = this()
  def this(container: HTMLDOMElement, width: Double, height: Double, style: CSSObject, forExport: Boolean) = this()
  def this(
    container: HTMLDOMElement,
    width: Double,
    height: Double,
    style: CSSObject,
    forExport: Boolean,
    allowHTML: Boolean
  ) = this()
  def this(
    container: HTMLDOMElement,
    width: Double,
    height: Double,
    style: CSSObject,
    forExport: Boolean,
    allowHTML: Boolean,
    styledMode: Boolean
  ) = this()
  /**
    * A pointer to the renderer's associated Element class. The VMLRenderer
    * will have a pointer to VMLElement here.
    */
  var Element: SVGElement = js.native
  /**
    * The root `svg` node of the renderer.
    */
  var box: SVGDOMElement = js.native
  /**
    * The wrapper for the root `svg` node of the renderer.
    */
  var boxWrapper: SVGElement = js.native
  /**
    * A pointer to the `defs` node of the root SVG.
    */
  var defs: SVGElement = js.native
  /**
    * A collection of characters mapped to HTML entities. When `useHTML` on an
    * element is true, these entities will be rendered correctly by HTML. In
    * the SVG pseudo-HTML, they need to be unescaped back to simple characters,
    * so for example `&lt;` will render as `<`.
    */
  var escapes: Dictionary[String] = js.native
  /**
    * An extendable collection of functions for defining symbol paths.
    */
  var symbols: SymbolDictionary = js.native
  /**
    * Draw and return an arc. Overloaded function that takes arguments object.
    *
    * @param attribs
    *        Initial SVG attributes.
    *
    * @return The generated wrapper element.
    */
  def arc(attribs: SVGAttributes): SVGElement = js.native
  /**
    * Draw and return an arc.
    *
    * @param x
    *        Center X position.
    *
    * @param y
    *        Center Y position.
    *
    * @param r
    *        The outer radius' of the arc.
    *
    * @param innerR
    *        Inner radius like used in donut charts.
    *
    * @param start
    *        The starting angle of the arc in radians, where 0 is to the right
    *        and `-Math.PI/2` is up.
    *
    * @param end
    *        The ending angle of the arc in radians, where 0 is to the right
    *        and `-Math.PI/2` is up.
    *
    * @return The generated wrapper element.
    */
  def arc(
    x: js.UndefOr[Double],
    y: js.UndefOr[Double],
    r: js.UndefOr[Double],
    innerR: js.UndefOr[Double],
    start: js.UndefOr[Double],
    end: js.UndefOr[Double]
  ): SVGElement = js.native
  /**
    * Create a button with preset states.
    *
    * @param text
    *        The text or HTML to draw.
    *
    * @param x
    *        The x position of the button's left side.
    *
    * @param y
    *        The y position of the button's top side.
    *
    * @param callback
    *        The function to execute on button click or touch.
    *
    * @param normalState
    *        SVG attributes for the normal state.
    *
    * @param hoverState
    *        SVG attributes for the hover state.
    *
    * @param pressedState
    *        SVG attributes for the pressed state.
    *
    * @param disabledState
    *        SVG attributes for the disabled state.
    *
    * @param shape
    *        The shape type.
    *
    * @param useHTML
    *        Wether to use HTML to render the label.
    *
    * @return The button element.
    */
  def button(
    text: String,
    x: Double,
    y: Double,
    callback: EventCallbackFunction[SVGElement],
    normalState: js.UndefOr[SVGAttributes],
    hoverState: js.UndefOr[SVGAttributes],
    pressedState: js.UndefOr[SVGAttributes],
    disabledState: js.UndefOr[SVGAttributes],
    shape: js.UndefOr[SymbolKeyValue],
    useHTML: js.UndefOr[Boolean]
  ): SVGElement = js.native
  /**
    * Draw a circle, wraps the SVG `circle` element.
    *
    * @param attribs
    *        The initial attributes.
    *
    * @return The generated wrapper element.
    */
  def circle(): SVGElement = js.native
  def circle(attribs: SVGAttributes): SVGElement = js.native
  def circle(x: Double): SVGElement = js.native
  def circle(x: Double, y: Double): SVGElement = js.native
  def circle(x: Double, y: Double, r: Double): SVGElement = js.native
  /**
    * Define a clipping rectangle. The clipping rectangle is later applied to
    * SVGElement objects through the SVGElement#clip function.
    *
    * @return A clipping rectangle.
    */
  def clipRect(): ClipRectElement = js.native
  def clipRect(x: Double): ClipRectElement = js.native
  def clipRect(x: Double, y: Double): ClipRectElement = js.native
  def clipRect(x: Double, y: Double, width: Double): ClipRectElement = js.native
  def clipRect(x: Double, y: Double, width: Double, height: Double): ClipRectElement = js.native
  /**
    * Create a wrapper for an SVG element. Serves as a factory for SVGElement,
    * but this function is itself mostly called from primitive factories like
    * SVGRenderer#path, SVGRenderer#rect or SVGRenderer#text.
    *
    * @param nodeName
    *        The node name, for example `rect`, `g` etc.
    *
    * @return The generated SVGElement.
    */
  def createElement(nodeName: String): SVGElement = js.native
  /**
    * Make a straight line crisper by not spilling out to neighbour pixels.
    *
    * @param points
    *        The original points on the format `[['M', 0, 0], ['L', 100, 0]]`.
    *
    * @param width
    *        The width of the line.
    *
    * @param roundingFunction
    *        The rounding function name on the `Math` object, can be one of
    *        `round`, `floor` or `ceil`.
    *
    * @return The original points array, but modified to render crisply.
    */
  def crispLine(points: SVGPathArray, width: Double, roundingFunction: String): SVGPathArray = js.native
  /**
    * General method for adding a definition to the SVG `defs` tag. Can be used
    * for gradients, fills, filters etc. Styled mode only. A hook for adding
    * general definitions to the SVG's defs tag. Definitions can be referenced
    * from the CSS by its `id`. Read more in gradients, shadows and patterns.
    * Styled mode only.
    *
    * @param def
    *        A serialized form of an SVG definition, including children.
    *
    * @return The inserted node.
    */
  def definition(`def`: SVGDefinitionObject): SVGElement = js.native
  /**
    * Destroys the renderer and its allocated members.
    */
  def destroy(): Null = js.native
  /**
    * Dummy function for plugins, called every time the renderer is updated.
    * Prior to Highcharts 5, this was used for the canvg renderer.
    */
  def draw(): Unit = js.native
  /**
    * Utility to return the baseline offset and total line height from the font
    * size.
    *
    * @param fontSize
    *        The current font size to inspect. If not given, the font size will
    *        be found from the DOM element.
    *
    * @param elem
    *        The element to inspect for a current font size.
    *
    * @return The font metrics.
    */
  def fontMetrics(): FontMetricsObject = js.native
  def fontMetrics(fontSize: String): FontMetricsObject = js.native
  def fontMetrics(fontSize: String, elem: SVGDOMElement): FontMetricsObject = js.native
  def fontMetrics(fontSize: String, elem: SVGElement): FontMetricsObject = js.native
  def fontMetrics(fontSize: Double): FontMetricsObject = js.native
  def fontMetrics(fontSize: Double, elem: SVGDOMElement): FontMetricsObject = js.native
  def fontMetrics(fontSize: Double, elem: SVGElement): FontMetricsObject = js.native
  /**
    * Create and return an svg group element. Child Highcharts.SVGElement
    * objects are added to the group by using the group as the first parameter
    * in add().
    *
    * @param name
    *        The group will be given a class name of `highcharts-{name}`. This
    *        can be used for styling and scripting.
    *
    * @return The generated wrapper element.
    */
  def g(): SVGElement = js.native
  def g(name: String): SVGElement = js.native
  /**
    * Returns white for dark colors and black for bright colors.
    *
    * @param rgba
    *        The color to get the contrast for.
    *
    * @return The contrast color, either `#000000` or `#FFFFFF`.
    */
  def getContrast(rgba: ColorString): ColorString = js.native
  /**
    * Display an image.
    *
    * @param src
    *        The image source.
    *
    * @param x
    *        The X position.
    *
    * @param y
    *        The Y position.
    *
    * @param width
    *        The image width. If omitted, it defaults to the image file width.
    *
    * @param height
    *        The image height. If omitted it defaults to the image file height.
    *
    * @param onload
    *        Event handler for image load.
    *
    * @return The generated wrapper element.
    */
  def image(src: String): SVGElement = js.native
  def image(src: String, x: Double): SVGElement = js.native
  def image(src: String, x: Double, y: Double): SVGElement = js.native
  def image(src: String, x: Double, y: Double, width: Double): SVGElement = js.native
  def image(src: String, x: Double, y: Double, width: Double, height: Double): SVGElement = js.native
  def image(src: String, x: Double, y: Double, width: Double, height: Double, onload: js.Function): SVGElement = js.native
  /**
    * Initialize the SVGRenderer. Overridable initializer function that takes
    * the same parameters as the constructor.
    *
    * @param container
    *        Where to put the SVG in the web page.
    *
    * @param width
    *        The width of the SVG.
    *
    * @param height
    *        The height of the SVG.
    *
    * @param style
    *        The box style, if not in styleMode
    *
    * @param forExport
    *        Whether the rendered content is intended for export.
    *
    * @param allowHTML
    *        Whether the renderer is allowed to include HTML text, which will
    *        be projected on top of the SVG.
    *
    * @param styledMode
    *        Whether the renderer belongs to a chart that is in styled mode. If
    *        it does, it will avoid setting presentational attributes in some
    *        cases, but not when set explicitly through `.attr` and `.css` etc.
    */
  def init(container: HTMLDOMElement, width: Double, height: Double): Unit = js.native
  def init(container: HTMLDOMElement, width: Double, height: Double, style: CSSObject): Unit = js.native
  def init(container: HTMLDOMElement, width: Double, height: Double, style: CSSObject, forExport: Boolean): Unit = js.native
  def init(
    container: HTMLDOMElement,
    width: Double,
    height: Double,
    style: CSSObject,
    forExport: Boolean,
    allowHTML: Boolean
  ): Unit = js.native
  def init(
    container: HTMLDOMElement,
    width: Double,
    height: Double,
    style: CSSObject,
    forExport: Boolean,
    allowHTML: Boolean,
    styledMode: Boolean
  ): Unit = js.native
  /**
    * Detect whether the renderer is hidden. This happens when one of the
    * parent elements has `display: none`. Used internally to detect when we
    * needto render preliminarily in another div to get the text bounding boxes
    * right.
    *
    * @return True if it is hidden.
    */
  def isHidden(): Boolean = js.native
  /**
    * Draw a label, which is an extended text element with support for border
    * and background. Highcharts creates a `g` element with a text and a `path`
    * or `rect` inside, to make it behave somewhat like a HTML div. Border and
    * background are set through `stroke`, `stroke-width` and `fill` attributes
    * using the attr method. To update the text after render, run `label.attr({
    * text: 'New text' })`.
    *
    * @param str
    *        The initial text string or (subset) HTML to render.
    *
    * @param x
    *        The x position of the label's left side.
    *
    * @param y
    *        The y position of the label's top side or baseline, depending on
    *        the `baseline` parameter.
    *
    * @param shape
    *        The shape of the label's border/background, if any. Defaults to
    *        `rect`. Other possible values are `callout` or other shapes
    *        defined in Highcharts.SVGRenderer#symbols.
    *
    * @param anchorX
    *        In case the `shape` has a pointer, like a flag, this is the
    *        coordinates it should be pinned to.
    *
    * @param anchorY
    *        In case the `shape` has a pointer, like a flag, this is the
    *        coordinates it should be pinned to.
    *
    * @param useHTML
    *        Wether to use HTML to render the label.
    *
    * @param baseline
    *        Whether to position the label relative to the text baseline, like
    *        renderer.text, or to the upper border of the rectangle.
    *
    * @param className
    *        Class name for the group.
    *
    * @return The generated label.
    */
  def label(
    str: String,
    x: Double,
    y: js.UndefOr[Double],
    shape: js.UndefOr[String],
    anchorX: js.UndefOr[Double],
    anchorY: js.UndefOr[Double],
    useHTML: js.UndefOr[Boolean],
    baseline: js.UndefOr[Boolean],
    className: js.UndefOr[String]
  ): SVGElement = js.native
  /**
    * Draw a path, wraps the SVG `path` element.
    *
    * @param path
    *        An SVG path definition in array form.
    *
    * @return The generated wrapper element.
    */
  def path(): SVGElement = js.native
  def path(attribs: SVGAttributes): SVGElement = js.native
  def path(path: SVGPathArray): SVGElement = js.native
  /**
    * Draw and return a rectangle.
    *
    * @param attributes
    *        General SVG attributes for the rectangle.
    *
    * @return The generated wrapper element.
    */
  def rect(): SVGElement = js.native
  def rect(attributes: SVGAttributes): SVGElement = js.native
  /**
    * Draw and return a rectangle.
    *
    * @param x
    *        Left position.
    *
    * @param y
    *        Top position.
    *
    * @param width
    *        Width of the rectangle.
    *
    * @param height
    *        Height of the rectangle.
    *
    * @param r
    *        Border corner radius.
    *
    * @param strokeWidth
    *        A stroke width can be supplied to allow crisp drawing.
    *
    * @return The generated wrapper element.
    */
  def rect(
    x: js.UndefOr[Double],
    y: js.UndefOr[Double],
    width: js.UndefOr[Double],
    height: js.UndefOr[Double],
    r: js.UndefOr[Double],
    strokeWidth: js.UndefOr[Double]
  ): SVGElement = js.native
  /**
    * Resize the SVGRenderer#box and re-align all aligned child elements.
    *
    * @param width
    *        The new pixel width.
    *
    * @param height
    *        The new pixel height.
    *
    * @param animate
    *        Whether and how to animate.
    */
  def setSize(width: Double, height: Double): Unit = js.native
  def setSize(width: Double, height: Double, animate: Boolean): Unit = js.native
  def setSize(width: Double, height: Double, animate: AnimationOptionsObject): Unit = js.native
  /**
    * Apply the global style on the renderer, mixed with the default styles.
    *
    * @param style
    *        CSS to apply.
    */
  def setStyle(style: CSSObject): Unit = js.native
  /**
    * Draw a symbol out of pre-defined shape paths from SVGRenderer#symbols. It
    * is used in Highcharts for point makers, which cake a `symbol` option, and
    * label and button backgrounds like in the tooltip and stock flags.
    *
    * @param symbol
    *        The symbol name.
    *
    * @param x
    *        The X coordinate for the top left position.
    *
    * @param y
    *        The Y coordinate for the top left position.
    *
    * @param width
    *        The pixel width.
    *
    * @param height
    *        The pixel height.
    *
    * @param options
    *        Additional options, depending on the actual symbol drawn.
    */
  def symbol(symbol: String): SVGElement = js.native
  def symbol(symbol: String, x: Double): SVGElement = js.native
  def symbol(symbol: String, x: Double, y: Double): SVGElement = js.native
  def symbol(symbol: String, x: Double, y: Double, width: Double): SVGElement = js.native
  def symbol(symbol: String, x: Double, y: Double, width: Double, height: Double): SVGElement = js.native
  def symbol(symbol: String, x: Double, y: Double, width: Double, height: Double, options: SymbolOptionsObject): SVGElement = js.native
  /**
    * Draw text. The text can contain a subset of HTML, like spans and anchors
    * and some basic text styling of these. For more advanced features like
    * border and background, use Highcharts.SVGRenderer#label instead. To
    * update the text after render, run `text.attr({ text: 'New text' })`.
    *
    * @param str
    *        The text of (subset) HTML to draw.
    *
    * @param x
    *        The x position of the text's lower left corner.
    *
    * @param y
    *        The y position of the text's lower left corner.
    *
    * @param useHTML
    *        Use HTML to render the text.
    *
    * @return The text object.
    */
  def text(): SVGElement = js.native
  def text(str: String): SVGElement = js.native
  def text(str: String, x: Double): SVGElement = js.native
  def text(str: String, x: Double, y: Double): SVGElement = js.native
  def text(str: String, x: Double, y: Double, useHTML: Boolean): SVGElement = js.native
}

