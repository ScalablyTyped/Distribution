package typings.hapiBoom.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@hapi/boom", "Boom")
@js.native
/**
  * Creates a new Boom object using the provided message
  */
class Boom[Data] () extends Error {
  def this(message: String) = this()
  def this(message: Error) = this()
  def this(message: js.UndefOr[scala.Nothing], options: Options[Data]) = this()
  def this(message: String, options: Options[Data]) = this()
  def this(message: Error, options: Options[Data]) = this()
  /**
    * Custom error data with additional information specific to the error type
    */
  var data: js.UndefOr[Data] = js.native
  /**
    * isBoom - if true, indicates this is a Boom object instance.
    */
  var isBoom: Boolean = js.native
  /**
    * Convenience boolean indicating status code >= 500
    */
  var isServer: Boolean = js.native
  /**
    * The formatted response
    */
  var output: Output = js.native
  /**
    * The constructor used to create the error
    */
  var typeof: js.Function = js.native
  /**
    * Specifies if an error object is a valid boom object
    *
    * @param debug - A boolean that, when true, does not hide the original 500 error message. Defaults to false.
    */
  def reformat(): String = js.native
  def reformat(debug: Boolean): String = js.native
}

