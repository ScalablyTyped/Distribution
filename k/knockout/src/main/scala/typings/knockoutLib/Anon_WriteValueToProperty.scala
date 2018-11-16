package typings
package knockoutLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_WriteValueToProperty extends js.Object {
  var bindingRewriteValidators: js.Array[_]
  var parseObjectLiteral: js.Function1[/* objectLiteralString */ java.lang.String, js.Array[_]]
  var twoWayBindings: js.Any
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
  var writeValueToProperty: js.Function5[
    /* property */ KnockoutObservable[_] | js.Any, 
    /* allBindings */ KnockoutAllBindingsAccessor, 
    /* key */ java.lang.String, 
    /* value */ js.Any, 
    /* checkIfDifferent */ js.UndefOr[scala.Boolean], 
    scala.Unit
  ]
}

