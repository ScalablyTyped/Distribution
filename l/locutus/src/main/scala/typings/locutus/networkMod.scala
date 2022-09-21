package typings.locutus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object networkMod {
  
  @JSImport("locutus/php/network", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def inetNtop(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("inet_ntop")().asInstanceOf[Any]
  inline def inetNtop(a: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("inet_ntop")(a.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def inetPton(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("inet_pton")().asInstanceOf[Any]
  inline def inetPton(a: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("inet_pton")(a.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def ip2long(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("ip2long")().asInstanceOf[Any]
  inline def ip2long(argIP: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("ip2long")(argIP.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def long2ip(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("long2ip")().asInstanceOf[Any]
  inline def long2ip(ip: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("long2ip")(ip.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def setcookie(
    name: js.UndefOr[Any],
    value: js.UndefOr[Any],
    expires: js.UndefOr[Any],
    path: js.UndefOr[Any],
    domain: js.UndefOr[Any],
    secure: js.UndefOr[Any]
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("setcookie")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any], expires.asInstanceOf[js.Any], path.asInstanceOf[js.Any], domain.asInstanceOf[js.Any], secure.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def setrawcookie(
    name: js.UndefOr[Any],
    value: js.UndefOr[Any],
    expires: js.UndefOr[Any],
    path: js.UndefOr[Any],
    domain: js.UndefOr[Any],
    secure: js.UndefOr[Any]
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("setrawcookie")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any], expires.asInstanceOf[js.Any], path.asInstanceOf[js.Any], domain.asInstanceOf[js.Any], secure.asInstanceOf[js.Any])).asInstanceOf[Any]
}
