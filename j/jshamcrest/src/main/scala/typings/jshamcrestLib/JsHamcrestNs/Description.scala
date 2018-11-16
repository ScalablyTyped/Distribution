package typings
package jshamcrestLib.JsHamcrestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("JsHamcrest.Description")
@js.native
class Description () extends js.Object {
  /**
           * Appends text to this description.
           *
           * @param text Text to append to this description
           * @return {Description} Itself for method chaining
           */
  def append(text: js.Any): Description = js.native
  /**
           * Appends the description of a self describing object to this description.
           *
           * @param selfDescribingObject Any object that has a describeTo() function that accepts a JsHamcrest.Description object as argument
           * @return {Description} Itself for method chaining
           */
  def appendDescriptionOf(selfDescribingObject: SelfDescribing): Description = js.native
  /**
           * Appends the description of several self describing objects to this description.
           *
           * @param start Start string
           * @param separator Separator string
           * @param end End string
           * @param list Array of self describing objects. These objects must have a describeTo() function that accepts a JsHamcrest.Description object as argument
           * @return {Description} Itself for method chaining
           */
  def appendList(start: java.lang.String, separator: java.lang.String, end: java.lang.String, list: js.Array[_]): Description = js.native
  /**
           * Appends a JavaScript language’s literal to this description.
           *
           * @param literal Literal to append to this description
           * @return {Description} Itself for method chaining
           */
  def appendLiteral(literal: js.Any): Description = js.native
  /**
           * Appends an array of values to this description.
           *
           * @param start Start string
           * @param separator Separator string
           * @param end End string
           * @param list Array of values to be described to this description
           * @return {Description} Itself for method chaining
           */
  def appendValueList(
    start: java.lang.String,
    separator: java.lang.String,
    end: java.lang.String,
    list: js.Array[SelfDescribing]
  ): Description = js.native
  /**
           * Gets the current content of this description.
           *
           * @return {string} Current content of this description
           */
  def get(): java.lang.String = js.native
}

