package typings
package highchartsLib.highchartsMod.HighchartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Static extends js.Object {
  var Chart: Chart = js.native
  var Renderer: Renderer = js.native
  /**
           * Prototype used to extend tooltip behavior in a chart.
           *
           * @see {@link https://www.highcharts.com/docs/extending-highcharts/extending-highcharts}
           */
  var Tooltip: TooltipPrototype = js.native
  /**
           * An array containing the current chart objects in the page. A chart's position in the array is preserved
           * throughout the page's lifetime. When a chart is destroyed, the array item becomes undefined.
           * @since 2.3.4
           */
  var charts: js.Array[ChartObject] = js.native
  /**
           * A hook for defining additional date format specifiers. New specifiers are defined as key-value pairs by using the
           * specifier as key, and a function which takes the timestamp as value. This function returns the formatted portion
           * of the date.
           */
  var dateFormats: DateFormatSpecifiers = js.native
  def Color(color: Gradient): java.lang.String | Gradient = js.native
  def Color(color: java.lang.String): java.lang.String | Gradient = js.native
  /**
           * Add an event listener.
           *
           * @see {@link https://api.highcharts.com/class-reference/Highcharts#addEvent}
           * @see {@link https://www.highcharts.com/docs/extending-highcharts/extending-highcharts}
           *
           * @param element The element or object to add a listener to. It can be a HTMLDOMElement, an Highcharts.SVGElement or any other object.
           * @param type    The event type.
           * @param cb      The function callback to execute when the event is fired.
           * @returns A callback function to remove the added event.
           */
  def addEvent(
    element: ElementObject,
    `type`: java.lang.String,
    cb: js.Function1[/* evt */ stdLib.Event, scala.Unit]
  ): js.Function0[scala.Unit] = js.native
  /**
           * Add an event listener.
           *
           * @see {@link https://api.highcharts.com/class-reference/Highcharts#addEvent}
           * @see {@link https://www.highcharts.com/docs/extending-highcharts/extending-highcharts}
           *
           * @param element The element or object to add a listener to. It can be a HTMLDOMElement, an Highcharts.SVGElement or any other object.
           * @param type    The event type.
           * @param cb      The function callback to execute when the event is fired.
           * @returns A callback function to remove the added event.
           */
  def addEvent(element: js.Object, `type`: java.lang.String, cb: js.Function1[/* evt */ stdLib.Event, scala.Unit]): js.Function0[scala.Unit] = js.native
  /**
           * Add an event listener.
           *
           * @see {@link https://api.highcharts.com/class-reference/Highcharts#addEvent}
           * @see {@link https://www.highcharts.com/docs/extending-highcharts/extending-highcharts}
           *
           * @param element The element or object to add a listener to. It can be a HTMLDOMElement, an Highcharts.SVGElement or any other object.
           * @param type    The event type.
           * @param cb      The function callback to execute when the event is fired.
           * @returns A callback function to remove the added event.
           */
  def addEvent(
    element: stdLib.HTMLElement,
    `type`: java.lang.String,
    cb: js.Function1[/* evt */ stdLib.Event, scala.Unit]
  ): js.Function0[scala.Unit] = js.native
  /**
           * As Highcharts.Chart, but without need for the new keyword.
           * @since 4.2.0
           */
  def chart(options: Options): ChartObject = js.native
  /**
           * As Highcharts.Chart, but without need for the new keyword.
           * @since 4.2.0
           */
  def chart(options: Options, callback: js.Function1[/* chart */ ChartObject, scala.Unit]): ChartObject = js.native
  /**
           * As Highcharts.Chart, but without need for the new keyword.
           * @since 4.2.0
           */
  def chart(renderTo: java.lang.String, options: Options): ChartObject = js.native
  /**
           * As Highcharts.Chart, but without need for the new keyword.
           * @since 4.2.0
           */
  def chart(
    renderTo: java.lang.String,
    options: Options,
    callback: js.Function1[/* chart */ ChartObject, scala.Unit]
  ): ChartObject = js.native
  /**
           * As Highcharts.Chart, but without need for the new keyword.
           * @since 4.2.0
           */
  def chart(renderTo: stdLib.HTMLElement, options: Options): ChartObject = js.native
  /**
           * As Highcharts.Chart, but without need for the new keyword.
           * @since 4.2.0
           */
  def chart(
    renderTo: stdLib.HTMLElement,
    options: Options,
    callback: js.Function1[/* chart */ ChartObject, scala.Unit]
  ): ChartObject = js.native
  /**
           * Formats a JavaScript date timestamp (milliseconds since Jan 1st 1970) into a human readable date string. The
           * format is a subset of the formats for PHP's strftime function. Additional formats can be given in the
           * Highcharts.dateFormats hook, see below.
           * @param  format A string containing some of the formats.
           * @param  [number] time The JavaScript time to format.
           * @param  [boolean] capitalize Whether to capitalize words in the return string.
           */
  def dateFormat(format: java.lang.String): java.lang.String = js.native
  /**
           * Formats a JavaScript date timestamp (milliseconds since Jan 1st 1970) into a human readable date string. The
           * format is a subset of the formats for PHP's strftime function. Additional formats can be given in the
           * Highcharts.dateFormats hook, see below.
           * @param  format A string containing some of the formats.
           * @param  [number] time The JavaScript time to format.
           * @param  [boolean] capitalize Whether to capitalize words in the return string.
           */
  def dateFormat(format: java.lang.String, time: scala.Double): java.lang.String = js.native
  /**
           * Formats a JavaScript date timestamp (milliseconds since Jan 1st 1970) into a human readable date string. The
           * format is a subset of the formats for PHP's strftime function. Additional formats can be given in the
           * Highcharts.dateFormats hook, see below.
           * @param  format A string containing some of the formats.
           * @param  [number] time The JavaScript time to format.
           * @param  [boolean] capitalize Whether to capitalize words in the return string.
           */
  def dateFormat(format: java.lang.String, time: scala.Double, capitalize: scala.Boolean): java.lang.String = js.native
  def distribute(array: js.Array[_], value: scala.Double): scala.Unit = js.native
  /**
           * The error handler function. By default is provides error messages for debugging, with links to the descriptions on Highcharts website.
           * This function can be redefined to catch errors in client applications.
           * @param Number|String The error code. If this is a number, the default error function prints a link to a human readable error code
           * description according to error definition file. If it's a string, the description is printed in the console.
           * @param Whether the error should stop execution.
           * @since 5.0.6
           */
  def error(code: java.lang.String, fatal: scala.Boolean): js.Function = js.native
  /**
           * The error handler function. By default is provides error messages for debugging, with links to the descriptions on Highcharts website.
           * This function can be redefined to catch errors in client applications.
           * @param Number|String The error code. If this is a number, the default error function prints a link to a human readable error code
           * description according to error definition file. If it's a string, the description is printed in the console.
           * @param Whether the error should stop execution.
           * @since 5.0.6
           */
  def error(code: scala.Double, fatal: scala.Boolean): js.Function = js.native
  /**
           * Fire an event that was registered with
           *
           * @see {@link https://api.highcharts.com/class-reference/Highcharts#fireEvent}
           *
           * @param element         The element or object to add a listener to. It can be a HTMLDOMElement, an Highcharts.SVGElement or any other object.
           * @param type            The event type.
           * @param eventArguments  Custom event arguments that are passed on as an argument to the event handler.
           * @param defaultFunction The default function to execute if the other listeners haven't returned false.
           */
  def fireEvent(element: ElementObject, `type`: java.lang.String): scala.Unit = js.native
  /**
           * Fire an event that was registered with
           *
           * @see {@link https://api.highcharts.com/class-reference/Highcharts#fireEvent}
           *
           * @param element         The element or object to add a listener to. It can be a HTMLDOMElement, an Highcharts.SVGElement or any other object.
           * @param type            The event type.
           * @param eventArguments  Custom event arguments that are passed on as an argument to the event handler.
           * @param defaultFunction The default function to execute if the other listeners haven't returned false.
           */
  def fireEvent(element: ElementObject, `type`: java.lang.String, eventArguments: js.Any): scala.Unit = js.native
  /**
           * Fire an event that was registered with
           *
           * @see {@link https://api.highcharts.com/class-reference/Highcharts#fireEvent}
           *
           * @param element         The element or object to add a listener to. It can be a HTMLDOMElement, an Highcharts.SVGElement or any other object.
           * @param type            The event type.
           * @param eventArguments  Custom event arguments that are passed on as an argument to the event handler.
           * @param defaultFunction The default function to execute if the other listeners haven't returned false.
           */
  def fireEvent(
    element: ElementObject,
    `type`: java.lang.String,
    eventArguments: js.Any,
    defaultFunction: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  /**
           * Fire an event that was registered with
           *
           * @see {@link https://api.highcharts.com/class-reference/Highcharts#fireEvent}
           *
           * @param element         The element or object to add a listener to. It can be a HTMLDOMElement, an Highcharts.SVGElement or any other object.
           * @param type            The event type.
           * @param eventArguments  Custom event arguments that are passed on as an argument to the event handler.
           * @param defaultFunction The default function to execute if the other listeners haven't returned false.
           */
  def fireEvent(element: js.Object, `type`: java.lang.String): scala.Unit = js.native
  /**
           * Fire an event that was registered with
           *
           * @see {@link https://api.highcharts.com/class-reference/Highcharts#fireEvent}
           *
           * @param element         The element or object to add a listener to. It can be a HTMLDOMElement, an Highcharts.SVGElement or any other object.
           * @param type            The event type.
           * @param eventArguments  Custom event arguments that are passed on as an argument to the event handler.
           * @param defaultFunction The default function to execute if the other listeners haven't returned false.
           */
  def fireEvent(element: js.Object, `type`: java.lang.String, eventArguments: js.Any): scala.Unit = js.native
  /**
           * Fire an event that was registered with
           *
           * @see {@link https://api.highcharts.com/class-reference/Highcharts#fireEvent}
           *
           * @param element         The element or object to add a listener to. It can be a HTMLDOMElement, an Highcharts.SVGElement or any other object.
           * @param type            The event type.
           * @param eventArguments  Custom event arguments that are passed on as an argument to the event handler.
           * @param defaultFunction The default function to execute if the other listeners haven't returned false.
           */
  def fireEvent(
    element: js.Object,
    `type`: java.lang.String,
    eventArguments: js.Any,
    defaultFunction: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  /**
           * Fire an event that was registered with
           *
           * @see {@link https://api.highcharts.com/class-reference/Highcharts#fireEvent}
           *
           * @param element         The element or object to add a listener to. It can be a HTMLDOMElement, an Highcharts.SVGElement or any other object.
           * @param type            The event type.
           * @param eventArguments  Custom event arguments that are passed on as an argument to the event handler.
           * @param defaultFunction The default function to execute if the other listeners haven't returned false.
           */
  def fireEvent(element: stdLib.HTMLElement, `type`: java.lang.String): scala.Unit = js.native
  /**
           * Fire an event that was registered with
           *
           * @see {@link https://api.highcharts.com/class-reference/Highcharts#fireEvent}
           *
           * @param element         The element or object to add a listener to. It can be a HTMLDOMElement, an Highcharts.SVGElement or any other object.
           * @param type            The event type.
           * @param eventArguments  Custom event arguments that are passed on as an argument to the event handler.
           * @param defaultFunction The default function to execute if the other listeners haven't returned false.
           */
  def fireEvent(element: stdLib.HTMLElement, `type`: java.lang.String, eventArguments: js.Any): scala.Unit = js.native
  /**
           * Fire an event that was registered with
           *
           * @see {@link https://api.highcharts.com/class-reference/Highcharts#fireEvent}
           *
           * @param element         The element or object to add a listener to. It can be a HTMLDOMElement, an Highcharts.SVGElement or any other object.
           * @param type            The event type.
           * @param eventArguments  Custom event arguments that are passed on as an argument to the event handler.
           * @param defaultFunction The default function to execute if the other listeners haven't returned false.
           */
  def fireEvent(
    element: stdLib.HTMLElement,
    `type`: java.lang.String,
    eventArguments: js.Any,
    defaultFunction: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  /**
           * Get the updated default options. Until 3.0.7, merely exposing defaultOptions for outside modules
           * wasn't enough because the setOptions method created a new object.
           */
  def getOptions(): Options = js.native
  def map(array: js.Array[_], fn: js.Function): js.Array[_] = js.native
  def mapChart(renderTo: java.lang.String, options: MapOptions): ChartObject = js.native
  def mapChart(
    renderTo: java.lang.String,
    options: MapOptions,
    callback: js.Function1[/* chart */ ChartObject, scala.Unit]
  ): ChartObject = js.native
  def mapChart(renderTo: stdLib.HTMLElement, options: MapOptions): ChartObject = js.native
  def mapChart(
    renderTo: stdLib.HTMLElement,
    options: MapOptions,
    callback: js.Function1[/* chart */ ChartObject, scala.Unit]
  ): ChartObject = js.native
  /**
           * Formats a JavaScript number with grouped thousands, a fixed amount of decimals and an optional decimal point. It
           * is a port of PHP's function with the same name. See PHP number_format for a full explanation of the parameters.
           * @param  value        The raw number to format.
           * @param  decimals     The desired number of decimals.
           * @param  decimalPoint The decimal point. Defaults to '.' or to the string specified globally in options.lang.decimalPoint.
           * @param  thousandsSep The thousands separator. Defaults to ' ' or to the string specified globally in options.lang.thousandsSep.
           */
  def numberFormat(value: scala.Double): java.lang.String = js.native
  /**
           * Formats a JavaScript number with grouped thousands, a fixed amount of decimals and an optional decimal point. It
           * is a port of PHP's function with the same name. See PHP number_format for a full explanation of the parameters.
           * @param  value        The raw number to format.
           * @param  decimals     The desired number of decimals.
           * @param  decimalPoint The decimal point. Defaults to '.' or to the string specified globally in options.lang.decimalPoint.
           * @param  thousandsSep The thousands separator. Defaults to ' ' or to the string specified globally in options.lang.thousandsSep.
           */
  def numberFormat(value: scala.Double, decimals: scala.Double): java.lang.String = js.native
  /**
           * Formats a JavaScript number with grouped thousands, a fixed amount of decimals and an optional decimal point. It
           * is a port of PHP's function with the same name. See PHP number_format for a full explanation of the parameters.
           * @param  value        The raw number to format.
           * @param  decimals     The desired number of decimals.
           * @param  decimalPoint The decimal point. Defaults to '.' or to the string specified globally in options.lang.decimalPoint.
           * @param  thousandsSep The thousands separator. Defaults to ' ' or to the string specified globally in options.lang.thousandsSep.
           */
  def numberFormat(value: scala.Double, decimals: scala.Double, decimalPoint: java.lang.String): java.lang.String = js.native
  /**
           * Formats a JavaScript number with grouped thousands, a fixed amount of decimals and an optional decimal point. It
           * is a port of PHP's function with the same name. See PHP number_format for a full explanation of the parameters.
           * @param  value        The raw number to format.
           * @param  decimals     The desired number of decimals.
           * @param  decimalPoint The decimal point. Defaults to '.' or to the string specified globally in options.lang.decimalPoint.
           * @param  thousandsSep The thousands separator. Defaults to ' ' or to the string specified globally in options.lang.thousandsSep.
           */
  def numberFormat(
    value: scala.Double,
    decimals: scala.Double,
    decimalPoint: java.lang.String,
    thousandsSep: java.lang.String
  ): java.lang.String = js.native
  /**
           * Sets the options globally for all charts created after this has been called. Takes an options JavaScript object
           * structure as the argument. These options are merged with the default options and the result is returned.
           * @param options The chart configuration object.
           */
  def setOptions(options: GlobalOptions): Options = js.native
  /**
           * Wrap an existing behavior of a part of the chart to extend or replace it.
           * @since 2.3.0
           *
           * @see {@link https://www.highcharts.com/docs/extending-highcharts/extending-highcharts}
           *
           * @param prototype The prototype for the part of the chart to extend.
           * @param type The type of behavior you are extending.
           * @param cb The function that executes when the behavior occurs.
           */
  def wrap(
    prototype: js.Any,
    `type`: java.lang.String,
    cb: js.Function2[/* proceed */ js.Function, /* repeated */js.Any, scala.Unit]
  ): scala.Unit = js.native
}

