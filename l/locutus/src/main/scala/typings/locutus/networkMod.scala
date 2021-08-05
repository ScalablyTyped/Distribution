package typings.locutus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object networkMod {
  
  @JSImport("locutus/php/network", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def inetNtop(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("inet_ntop")().asInstanceOf[js.Any]
  inline def inetNtop(a: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("inet_ntop")(a.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  inline def inetPton(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("inet_pton")().asInstanceOf[js.Any]
  inline def inetPton(a: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("inet_pton")(a.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  inline def ip2long(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("ip2long")().asInstanceOf[js.Any]
  inline def ip2long(argIP: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("ip2long")(argIP.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  inline def long2ip(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("long2ip")().asInstanceOf[js.Any]
  inline def long2ip(ip: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("long2ip")(ip.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  inline def setcookie(
    name: js.UndefOr[js.Any],
    value: js.UndefOr[js.Any],
    expires: js.UndefOr[js.Any],
    path: js.UndefOr[js.Any],
    domain: js.UndefOr[js.Any],
    secure: js.UndefOr[js.Any]
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("setcookie")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any], expires.asInstanceOf[js.Any], path.asInstanceOf[js.Any], domain.asInstanceOf[js.Any], secure.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def setrawcookie(
    name: js.UndefOr[js.Any],
    value: js.UndefOr[js.Any],
    expires: js.UndefOr[js.Any],
    path: js.UndefOr[js.Any],
    domain: js.UndefOr[js.Any],
    secure: js.UndefOr[js.Any]
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("setrawcookie")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any], expires.asInstanceOf[js.Any], path.asInstanceOf[js.Any], domain.asInstanceOf[js.Any], secure.asInstanceOf[js.Any])).asInstanceOf[js.Any]
}
