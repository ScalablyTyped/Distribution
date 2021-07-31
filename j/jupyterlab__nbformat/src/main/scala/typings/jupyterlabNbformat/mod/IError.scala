package typings.jupyterlabNbformat.mod

import typings.jupyterlabNbformat.jupyterlabNbformatStrings.error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IError
  extends StObject
     with IBaseOutput
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
  def apply(ename: String, evalue: String, traceback: js.Array[String]): IError = {
    val __obj = js.Dynamic.literal(ename = ename.asInstanceOf[js.Any], evalue = evalue.asInstanceOf[js.Any], output_type = "error", traceback = traceback.asInstanceOf[js.Any])
    __obj.asInstanceOf[IError]
  }
  
  @scala.inline
  implicit class IErrorMutableBuilder[Self <: IError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEname(value: String): Self = StObject.set(x, "ename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvalue(value: String): Self = StObject.set(x, "evalue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutput_type(value: error): Self = StObject.set(x, "output_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTraceback(value: js.Array[String]): Self = StObject.set(x, "traceback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTracebackVarargs(value: String*): Self = StObject.set(x, "traceback", js.Array(value :_*))
  }
}
