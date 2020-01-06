package typings.koDotPlus

import typings.knockout.KnockoutObservable
import typings.koDotPlus.KoPlus.Command
import typings.koDotPlus.KoPlus.CommandOptions
import typings.koDotPlus.KoPlus.Editable
import typings.koDotPlus.KoPlus.EditableArray
import typings.koDotPlus.KoPlus.EditableArrayStatic
import typings.koDotPlus.KoPlus.EditableStatic
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
  var editableArray_Original: EditableArrayStatic = js.native
  @JSName("editable")
  var editable_Original: EditableStatic = js.native
  // create a command - two overloads
  def command(param: js.Function): Command = js.native
  def command(param: CommandOptions): Command = js.native
  def editable[T](): Editable[T] = js.native
  def editable[T](value: T): Editable[T] = js.native
  def editableArray[T](): typings.knockout.KnockoutObservableArray[T] = js.native
  def editableArray[T](value: js.Array[T]): typings.knockout.KnockoutObservableArray[T] = js.native
  @JSName("editableArray")
  def editableArray_T_EditableArray[T](): EditableArray[T] = js.native
  @JSName("editableArray")
  def editableArray_T_EditableArray[T](value: js.Array[T]): EditableArray[T] = js.native
  @JSName("editable")
  def editable_T_KnockoutObservable[T](): KnockoutObservable[T | Null] = js.native
  @JSName("editable")
  def editable_T_KnockoutObservable[T](value: T): KnockoutObservable[T] = js.native
}

