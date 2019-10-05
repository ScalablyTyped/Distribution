package typings.atJupyterlabCoreutils.libNbformatMod.nbformat

import typings.atJupyterlabCoreutils.atJupyterlabCoreutilsStrings.error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Output of an error that occurred during code cell execution.
  */
trait IError
  extends IBaseOutput
     with _IOutput {
  /**
    * The name of the error.
    */
  var ename: String
  /**
    * The value, or message, of the error.
    */
  var evalue: String
  /**
    * Type of cell output.
    */
  @JSName("output_type")
  var output_type_IError: error
  /**
    * The error's traceback.
    */
  var traceback: js.Array[String]
}

object IError {
  @scala.inline
  def apply(ename: String, evalue: String, output_type: error, traceback: js.Array[String]): IError = {
    val __obj = js.Dynamic.literal(ename = ename, evalue = evalue, output_type = output_type, traceback = traceback)
  
    __obj.asInstanceOf[IError]
  }
}

