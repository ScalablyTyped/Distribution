package typings.kamailioKemi.mod.global.KSR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domain {
  
  @JSGlobal("KSR.domain.is_domain_local")
  @js.native
  def isDomainLocal(sdomain: String): Double = js.native
  
  @JSGlobal("KSR.domain.is_from_local")
  @js.native
  def isFromLocal(): Double = js.native
  
  @JSGlobal("KSR.domain.is_uri_host_local")
  @js.native
  def isUriHostLocal(): Double = js.native
  
  @JSGlobal("KSR.domain.lookup_domain")
  @js.native
  def lookupDomain(_sdomain: String): Double = js.native
  
  @JSGlobal("KSR.domain.lookup_domain_prefix")
  @js.native
  def lookupDomainPrefix(_sdomain: String, _sprefix: String): Double = js.native
}
