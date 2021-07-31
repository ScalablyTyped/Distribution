package typings.kamailioKemi.mod.global.KSR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object presenceXml {
  
  @JSGlobal("KSR.presence_xml")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def presCheckActivities(pres_uri: String, activity: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("pres_check_activities")(pres_uri.asInstanceOf[js.Any], activity.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def presCheckBasic(pres_uri: String, status: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("pres_check_basic")(pres_uri.asInstanceOf[js.Any], status.asInstanceOf[js.Any])).asInstanceOf[Double]
}
