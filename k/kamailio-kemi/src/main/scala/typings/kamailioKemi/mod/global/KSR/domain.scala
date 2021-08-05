package typings.kamailioKemi.mod.global.KSR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domain {
  
  @JSGlobal("KSR.domain")
  @js.native
  val ^ : js.Any = js.native
  
  inline def isDomainLocal(sdomain: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("is_domain_local")(sdomain.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def isFromLocal(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("is_from_local")().asInstanceOf[Double]
  
  inline def isUriHostLocal(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("is_uri_host_local")().asInstanceOf[Double]
  
  inline def lookupDomain(_sdomain: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("lookup_domain")(_sdomain.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def lookupDomainPrefix(_sdomain: String, _sprefix: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup_domain_prefix")(_sdomain.asInstanceOf[js.Any], _sprefix.asInstanceOf[js.Any])).asInstanceOf[Double]
}
