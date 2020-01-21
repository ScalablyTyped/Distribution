package typings.knockout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAllBindings extends js.Object {
  var bindingRewriteValidators: js.Array[_] = js.native
  var twoWayBindings: js.Any = js.native
  def parseObjectLiteral(objectLiteralString: String): js.Array[_] = js.native
  def writeValueToProperty(property: js.Any, allBindings: KnockoutAllBindingsAccessor, key: String, value: js.Any): Unit = js.native
  def writeValueToProperty(
    property: js.Any,
    allBindings: KnockoutAllBindingsAccessor,
    key: String,
    value: js.Any,
    checkIfDifferent: Boolean
  ): Unit = js.native
  /**
    Internal, private KO utility for updating model properties from within bindings
    property:            If the property being updated is (or might be) an observable, pass it here
    If it turns out to be a writable observable, it will be written to directly
    allBindings:         An object with a get method to retrieve bindings in the current execution context.
    This will be searched for a '_ko_property_writers' property in case you're writing to a non-observable
    (See note below)
    key:                 The key identifying the property to be written. Example: for { hasFocus: myValue }, write to 'myValue' by specifying the key 'hasFocus'
    value:               The value to be written
    checkIfDifferent:    If true, and if the property being written is a writable observable, the value will only be written if
    it is !== existing value on that writable observable
    Note that if you need to write to the viewModel without an observable property,
    you need to set ko.expressionRewriting.twoWayBindings[key] = true; *before* the binding evaluation.
    */
  def writeValueToProperty(
    property: KnockoutObservable[_],
    allBindings: KnockoutAllBindingsAccessor,
    key: String,
    value: js.Any
  ): Unit = js.native
  def writeValueToProperty(
    property: KnockoutObservable[_],
    allBindings: KnockoutAllBindingsAccessor,
    key: String,
    value: js.Any,
    checkIfDifferent: Boolean
  ): Unit = js.native
}

