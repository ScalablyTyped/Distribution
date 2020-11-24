package typings.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofpresenceXml extends js.Object {
  
  def pres_check_activities(pres_uri: String, activity: String): Double = js.native
  
  def pres_check_basic(pres_uri: String, status: String): Double = js.native
}
object TypeofpresenceXml {
  
  @scala.inline
  def apply(pres_check_activities: (String, String) => Double, pres_check_basic: (String, String) => Double): TypeofpresenceXml = {
    val __obj = js.Dynamic.literal(pres_check_activities = js.Any.fromFunction2(pres_check_activities), pres_check_basic = js.Any.fromFunction2(pres_check_basic))
    __obj.asInstanceOf[TypeofpresenceXml]
  }
  
  @scala.inline
  implicit class TypeofpresenceXmlOps[Self <: TypeofpresenceXml] (val x: Self) extends AnyVal {
    
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
    def setPres_check_activities(value: (String, String) => Double): Self = this.set("pres_check_activities", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPres_check_basic(value: (String, String) => Double): Self = this.set("pres_check_basic", js.Any.fromFunction2(value))
  }
}
