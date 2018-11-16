package typings
package koDotPlusLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 *
 * Extensions to KO to provide a command, editable and sortable patterns
 * - available at http://www.nuget.org/packages/ko.plus/
 *
 * (requires TypeScript version 1.4 or higher)
 *
 * Version 1.0 - initial commit
 *
 * Version 1.1 - fixed bug - makeEditable is now a function on .editable
 *               also refactored how the Editable classes inherit to simplify
 *
 * Version 1.2 - amended callback on commmand.fail() method - accepts response,
 *               status and message values
 * 
 * Version 1.3 - added module declaration so it be used with node, requirejs etc.
 *               removed jquery reference as it is not required
 * 
 */

//
// Add methods to the 'ko' Knockout object
//
@js.native
trait KnockoutStatic extends js.Object {
  @JSName("editableArray")
  var editableArray_Original: koDotPlusLib.KoPlusNs.EditableArrayStatic = js.native
  @JSName("editable")
  var editable_Original: koDotPlusLib.KoPlusNs.EditableStatic = js.native
  // create a command - two overloads
  def command(param: js.Function): koDotPlusLib.KoPlusNs.Command = js.native
  // create a command - two overloads
  def command(param: koDotPlusLib.KoPlusNs.CommandOptions): koDotPlusLib.KoPlusNs.Command = js.native
  def editable[T](): knockoutLib.KnockoutObservable[T | scala.Null] = js.native
  def editable[T](value: T): knockoutLib.KnockoutObservable[T] = js.native
  def editableArray[T](): koDotPlusLib.KoPlusNs.EditableArray[T] = js.native
  def editableArray[T](value: js.Array[T]): koDotPlusLib.KoPlusNs.EditableArray[T] = js.native
  @JSName("editableArray")
  def editableArray_TKnockoutObservableArray[T](): knockoutLib.KnockoutObservableArray[T] = js.native
  @JSName("editableArray")
  def editableArray_TKnockoutObservableArray[T](value: js.Array[T]): knockoutLib.KnockoutObservableArray[T] = js.native
  @JSName("editable")
  def editable_TEditable[T](): koDotPlusLib.KoPlusNs.Editable[T] = js.native
  @JSName("editable")
  def editable_TEditable[T](value: T): koDotPlusLib.KoPlusNs.Editable[T] = js.native
}

