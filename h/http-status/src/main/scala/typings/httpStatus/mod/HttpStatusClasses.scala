package typings.httpStatus.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HttpStatusClasses extends /* key */ StringDictionary[String | Double] {
  
  val `1xx`: String = js.native
  
  val `1xx_MESSAGE`: String = js.native
  
  val `1xx_NAME`: String = js.native
  
  val `2xx`: String = js.native
  
  val `2xx_MESSAGE`: String = js.native
  
  val `2xx_NAME`: String = js.native
  
  val `3xx`: String = js.native
  
  val `3xx_MESSAGE`: String = js.native
  
  val `3xx_NAME`: String = js.native
  
  val `4xx`: String = js.native
  
  val `4xx_MESSAGE`: String = js.native
  
  val `4xx_NAME`: String = js.native
  
  val `5xx`: String = js.native
  
  val `5xx_MESSAGE`: String = js.native
  
  val `5xx_NAME`: String = js.native
  
  val CLIENT_ERROR: String = js.native
  
  val INFORMATIONAL: String = js.native
  
  val REDIRECTION: String = js.native
  
  val SERVER_ERROR: String = js.native
  
  val SUCCESSFUL: String = js.native
}
object HttpStatusClasses {
  
  @scala.inline
  def apply(
    `1xx`: String,
    `1xx_MESSAGE`: String,
    `1xx_NAME`: String,
    `2xx`: String,
    `2xx_MESSAGE`: String,
    `2xx_NAME`: String,
    `3xx`: String,
    `3xx_MESSAGE`: String,
    `3xx_NAME`: String,
    `4xx`: String,
    `4xx_MESSAGE`: String,
    `4xx_NAME`: String,
    `5xx`: String,
    `5xx_MESSAGE`: String,
    `5xx_NAME`: String,
    CLIENT_ERROR: String,
    INFORMATIONAL: String,
    REDIRECTION: String,
    SERVER_ERROR: String,
    SUCCESSFUL: String
  ): HttpStatusClasses = {
    val __obj = js.Dynamic.literal(CLIENT_ERROR = CLIENT_ERROR.asInstanceOf[js.Any], INFORMATIONAL = INFORMATIONAL.asInstanceOf[js.Any], REDIRECTION = REDIRECTION.asInstanceOf[js.Any], SERVER_ERROR = SERVER_ERROR.asInstanceOf[js.Any], SUCCESSFUL = SUCCESSFUL.asInstanceOf[js.Any])
    __obj.updateDynamic("1xx")(`1xx`.asInstanceOf[js.Any])
    __obj.updateDynamic("1xx_MESSAGE")(`1xx_MESSAGE`.asInstanceOf[js.Any])
    __obj.updateDynamic("1xx_NAME")(`1xx_NAME`.asInstanceOf[js.Any])
    __obj.updateDynamic("2xx")(`2xx`.asInstanceOf[js.Any])
    __obj.updateDynamic("2xx_MESSAGE")(`2xx_MESSAGE`.asInstanceOf[js.Any])
    __obj.updateDynamic("2xx_NAME")(`2xx_NAME`.asInstanceOf[js.Any])
    __obj.updateDynamic("3xx")(`3xx`.asInstanceOf[js.Any])
    __obj.updateDynamic("3xx_MESSAGE")(`3xx_MESSAGE`.asInstanceOf[js.Any])
    __obj.updateDynamic("3xx_NAME")(`3xx_NAME`.asInstanceOf[js.Any])
    __obj.updateDynamic("4xx")(`4xx`.asInstanceOf[js.Any])
    __obj.updateDynamic("4xx_MESSAGE")(`4xx_MESSAGE`.asInstanceOf[js.Any])
    __obj.updateDynamic("4xx_NAME")(`4xx_NAME`.asInstanceOf[js.Any])
    __obj.updateDynamic("5xx")(`5xx`.asInstanceOf[js.Any])
    __obj.updateDynamic("5xx_MESSAGE")(`5xx_MESSAGE`.asInstanceOf[js.Any])
    __obj.updateDynamic("5xx_NAME")(`5xx_NAME`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpStatusClasses]
  }
  
  @scala.inline
  implicit class HttpStatusClassesOps[Self <: HttpStatusClasses] (val x: Self) extends AnyVal {
    
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
    def set1xx(value: String): Self = this.set("1xx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set1xx_MESSAGE(value: String): Self = this.set("1xx_MESSAGE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set1xx_NAME(value: String): Self = this.set("1xx_NAME", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set2xx(value: String): Self = this.set("2xx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set2xx_MESSAGE(value: String): Self = this.set("2xx_MESSAGE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set2xx_NAME(value: String): Self = this.set("2xx_NAME", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set3xx(value: String): Self = this.set("3xx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set3xx_MESSAGE(value: String): Self = this.set("3xx_MESSAGE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set3xx_NAME(value: String): Self = this.set("3xx_NAME", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set4xx(value: String): Self = this.set("4xx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set4xx_MESSAGE(value: String): Self = this.set("4xx_MESSAGE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set4xx_NAME(value: String): Self = this.set("4xx_NAME", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set5xx(value: String): Self = this.set("5xx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set5xx_MESSAGE(value: String): Self = this.set("5xx_MESSAGE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set5xx_NAME(value: String): Self = this.set("5xx_NAME", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCLIENT_ERROR(value: String): Self = this.set("CLIENT_ERROR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setINFORMATIONAL(value: String): Self = this.set("INFORMATIONAL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setREDIRECTION(value: String): Self = this.set("REDIRECTION", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSERVER_ERROR(value: String): Self = this.set("SERVER_ERROR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSUCCESSFUL(value: String): Self = this.set("SUCCESSFUL", value.asInstanceOf[js.Any])
  }
}
