package typings.jshamcrest.JsHamcrest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Description extends js.Object {
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
  def appendList(start: String, separator: String, end: String, list: js.Array[_]): Description = js.native
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
  def appendValueList(start: String, separator: String, end: String, list: js.Array[SelfDescribing]): Description = js.native
  /**
    * Gets the current content of this description.
    *
    * @return {string} Current content of this description
    */
  def get(): String = js.native
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
  @scala.inline
  implicit class DescriptionOps[Self <: Description] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAppend(value: js.Any => Description): Self = this.set("append", js.Any.fromFunction1(value))
    @scala.inline
    def setAppendDescriptionOf(value: SelfDescribing => Description): Self = this.set("appendDescriptionOf", js.Any.fromFunction1(value))
    @scala.inline
    def setAppendList(value: (String, String, String, js.Array[_]) => Description): Self = this.set("appendList", js.Any.fromFunction4(value))
    @scala.inline
    def setAppendLiteral(value: js.Any => Description): Self = this.set("appendLiteral", js.Any.fromFunction1(value))
    @scala.inline
    def setAppendValueList(value: (String, String, String, js.Array[SelfDescribing]) => Description): Self = this.set("appendValueList", js.Any.fromFunction4(value))
    @scala.inline
    def setGet(value: () => String): Self = this.set("get", js.Any.fromFunction0(value))
  }
  
}

