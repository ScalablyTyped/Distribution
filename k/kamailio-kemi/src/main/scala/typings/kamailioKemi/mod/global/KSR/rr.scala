package typings.kamailioKemi.mod.global.KSR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rr {
  
  @JSGlobal("KSR.rr")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def addRrParam(sparam: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("add_rr_param")(sparam.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def checkRouteParam(sre: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("check_route_param")(sre.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def isDirection(dir: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("is_direction")(dir.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def looseRoute(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("loose_route")().asInstanceOf[Double]
  
  @scala.inline
  def recordRoute(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("record_route")().asInstanceOf[Double]
  
  @scala.inline
  def recordRouteParams(params: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("record_route_params")(params.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def removeRecordRoute(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("remove_record_route")().asInstanceOf[Double]
}
