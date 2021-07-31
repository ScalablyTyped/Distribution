package typings.kamailioKemi.mod.global.KSR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xcapServer {
  
  @JSGlobal("KSR.xcap_server")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def xcapsDel(uri: String, path: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("xcaps_del")(uri.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def xcapsGet(uri: String, path: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("xcaps_get")(uri.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def xcapsPut(uri: String, path: String, pbody: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("xcaps_put")(uri.asInstanceOf[js.Any], path.asInstanceOf[js.Any], pbody.asInstanceOf[js.Any])).asInstanceOf[Double]
}
