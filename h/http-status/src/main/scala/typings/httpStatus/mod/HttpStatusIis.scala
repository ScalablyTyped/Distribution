package typings.httpStatus.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HttpStatusIis extends /* key */ StringDictionary[String | Double] {
  
  val `440`: String = js.native
  
  val `440_CLASS`: String = js.native
  
  val `440_MESSAGE`: String = js.native
  
  val `440_NAME`: String = js.native
  
  val `449`: String = js.native
  
  val `449_CLASS`: String = js.native
  
  val `449_MESSAGE`: String = js.native
  
  val `449_NAME`: String = js.native
  
  val `451`: String = js.native
  
  val `451_CLASS`: String = js.native
  
  val `451_MESSAGE`: String = js.native
  
  val `451_NAME`: String = js.native
  
  val LOGIN_TIME_OUT: Double = js.native
  
  val REDIRECT: Double = js.native
  
  val RETRY_WITH: Double = js.native
}
object HttpStatusIis {
  
  @scala.inline
  def apply(
    `440`: String,
    `440_CLASS`: String,
    `440_MESSAGE`: String,
    `440_NAME`: String,
    `449`: String,
    `449_CLASS`: String,
    `449_MESSAGE`: String,
    `449_NAME`: String,
    `451`: String,
    `451_CLASS`: String,
    `451_MESSAGE`: String,
    `451_NAME`: String,
    LOGIN_TIME_OUT: Double,
    REDIRECT: Double,
    RETRY_WITH: Double
  ): HttpStatusIis = {
    val __obj = js.Dynamic.literal(LOGIN_TIME_OUT = LOGIN_TIME_OUT.asInstanceOf[js.Any], REDIRECT = REDIRECT.asInstanceOf[js.Any], RETRY_WITH = RETRY_WITH.asInstanceOf[js.Any])
    __obj.updateDynamic("440")(`440`.asInstanceOf[js.Any])
    __obj.updateDynamic("440_CLASS")(`440_CLASS`.asInstanceOf[js.Any])
    __obj.updateDynamic("440_MESSAGE")(`440_MESSAGE`.asInstanceOf[js.Any])
    __obj.updateDynamic("440_NAME")(`440_NAME`.asInstanceOf[js.Any])
    __obj.updateDynamic("449")(`449`.asInstanceOf[js.Any])
    __obj.updateDynamic("449_CLASS")(`449_CLASS`.asInstanceOf[js.Any])
    __obj.updateDynamic("449_MESSAGE")(`449_MESSAGE`.asInstanceOf[js.Any])
    __obj.updateDynamic("449_NAME")(`449_NAME`.asInstanceOf[js.Any])
    __obj.updateDynamic("451")(`451`.asInstanceOf[js.Any])
    __obj.updateDynamic("451_CLASS")(`451_CLASS`.asInstanceOf[js.Any])
    __obj.updateDynamic("451_MESSAGE")(`451_MESSAGE`.asInstanceOf[js.Any])
    __obj.updateDynamic("451_NAME")(`451_NAME`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpStatusIis]
  }
  
  @scala.inline
  implicit class HttpStatusIisOps[Self <: HttpStatusIis] (val x: Self) extends AnyVal {
    
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
    def set440(value: String): Self = this.set("440", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set440_CLASS(value: String): Self = this.set("440_CLASS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set440_MESSAGE(value: String): Self = this.set("440_MESSAGE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set440_NAME(value: String): Self = this.set("440_NAME", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set449(value: String): Self = this.set("449", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set449_CLASS(value: String): Self = this.set("449_CLASS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set449_MESSAGE(value: String): Self = this.set("449_MESSAGE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set449_NAME(value: String): Self = this.set("449_NAME", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set451(value: String): Self = this.set("451", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set451_CLASS(value: String): Self = this.set("451_CLASS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set451_MESSAGE(value: String): Self = this.set("451_MESSAGE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set451_NAME(value: String): Self = this.set("451_NAME", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLOGIN_TIME_OUT(value: Double): Self = this.set("LOGIN_TIME_OUT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setREDIRECT(value: Double): Self = this.set("REDIRECT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRETRY_WITH(value: Double): Self = this.set("RETRY_WITH", value.asInstanceOf[js.Any])
  }
}
