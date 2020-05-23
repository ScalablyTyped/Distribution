package typings.jshamcrest.JsHamcrest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Description extends js.Object {
  /**
    * Appends text to this description.
    *
    * @param text Text to append to this description
    * @return {Description} Itself for method chaining
    */
  def append(text: js.Any): Description
  /**
    * Appends the description of a self describing object to this description.
    *
    * @param selfDescribingObject Any object that has a describeTo() function that accepts a JsHamcrest.Description object as argument
    * @return {Description} Itself for method chaining
    */
  def appendDescriptionOf(selfDescribingObject: SelfDescribing): Description
  /**
    * Appends the description of several self describing objects to this description.
    *
    * @param start Start string
    * @param separator Separator string
    * @param end End string
    * @param list Array of self describing objects. These objects must have a describeTo() function that accepts a JsHamcrest.Description object as argument
    * @return {Description} Itself for method chaining
    */
  def appendList(start: String, separator: String, end: String, list: js.Array[_]): Description
  /**
    * Appends a JavaScript language’s literal to this description.
    *
    * @param literal Literal to append to this description
    * @return {Description} Itself for method chaining
    */
  def appendLiteral(literal: js.Any): Description
  /**
    * Appends an array of values to this description.
    *
    * @param start Start string
    * @param separator Separator string
    * @param end End string
    * @param list Array of values to be described to this description
    * @return {Description} Itself for method chaining
    */
  def appendValueList(start: String, separator: String, end: String, list: js.Array[SelfDescribing]): Description
  /**
    * Gets the current content of this description.
    *
    * @return {string} Current content of this description
    */
  def get(): String
}

object Description {
  @scala.inline
  def apply(
    append: js.Any => Description,
    appendDescriptionOf: SelfDescribing => Description,
    appendList: (String, String, String, js.Array[_]) => Description,
    appendLiteral: js.Any => Description,
    appendValueList: (String, String, String, js.Array[SelfDescribing]) => Description,
    get: () => String
  ): Description = {
    val __obj = js.Dynamic.literal(append = js.Any.fromFunction1(append), appendDescriptionOf = js.Any.fromFunction1(appendDescriptionOf), appendList = js.Any.fromFunction4(appendList), appendLiteral = js.Any.fromFunction1(appendLiteral), appendValueList = js.Any.fromFunction4(appendValueList), get = js.Any.fromFunction0(get))
    __obj.asInstanceOf[Description]
  }
}

