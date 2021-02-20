package typings.jqueryAjaxfile

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IOption extends StObject {
  
  var data: js.UndefOr[js.Any] = js.native
  
  var desiredResponseDataType: js.UndefOr[DataType] = js.native
  
  var files: js.UndefOr[js.Array[IFileData]] = js.native
  
  var method: js.UndefOr[String] = js.native
  
  var timeoutInSeconds: js.UndefOr[Double] = js.native
  
  var url: js.UndefOr[String] = js.native
}
object IOption {
  
  @scala.inline
  def apply(): IOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOption]
  }
  
  @scala.inline
  implicit class IOptionMutableBuilder[Self <: IOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setDesiredResponseDataType(value: DataType): Self = StObject.set(x, "desiredResponseDataType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesiredResponseDataTypeUndefined: Self = StObject.set(x, "desiredResponseDataType", js.undefined)
    
    @scala.inline
    def setFiles(value: js.Array[IFileData]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
    
    @scala.inline
    def setFilesVarargs(value: IFileData*): Self = StObject.set(x, "files", js.Array(value :_*))
    
    @scala.inline
    def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    @scala.inline
    def setTimeoutInSeconds(value: Double): Self = StObject.set(x, "timeoutInSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutInSecondsUndefined: Self = StObject.set(x, "timeoutInSeconds", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
