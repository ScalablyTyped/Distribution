package typings.ionic

import typings.ionic.definitionsMod.IAilment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDoctorAilmentsUtilsMod {
  
  @JSImport("ionic/lib/doctor/ailments/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def formatAilmentMessage(ailment: IAilment): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("formatAilmentMessage")(ailment.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
}
