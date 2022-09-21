package typings.kamailioKemi.mod.global.KSR

import typings.kamailioKemi.kamailioKemiStrings.crit
import typings.kamailioKemi.kamailioKemiStrings.warn
import typings.kamailioKemi.mod.KamailioKemi.Flag
import typings.kamailioKemi.mod.global.KSR.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def addLocalRport(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("add_local_rport")().asInstanceOf[Boolean]

inline def addTcpAlias(port: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("add_tcp_alias")(port.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def addTcpAliasVia(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("add_tcp_alias_via")().asInstanceOf[Double]

inline def dbg(logStr: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("dbg")(logStr.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def err(logStr: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("err")(logStr.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def forceRport(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("force_rport")().asInstanceOf[Boolean]

inline def forward(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("forward")().asInstanceOf[Double]

inline def forwardUri(uri: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("forward_uri")(uri.asInstanceOf[js.Any]).asInstanceOf[Double]

inline def info(logStr: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("info")(logStr.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def isACK(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is_ACK")().asInstanceOf[Boolean]

inline def isBYE(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is_BYE")().asInstanceOf[Boolean]

inline def isCANCEL(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is_CANCEL")().asInstanceOf[Boolean]

inline def isINFO(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is_INFO")().asInstanceOf[Boolean]

inline def isINVITE(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is_INVITE")().asInstanceOf[Boolean]

inline def isMESSAGE(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is_MESSAGE")().asInstanceOf[Boolean]

inline def isMethod(method: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is_method")(method.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isMethodIn(method: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is_method_in")(method.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isMyself(uri: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is_myself")(uri.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isMyselfFuri(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is_myself_furi")().asInstanceOf[Boolean]

inline def isMyselfRuri(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is_myself_ruri")().asInstanceOf[Boolean]

inline def isMyselfTuri(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is_myself_turi")().asInstanceOf[Boolean]

inline def isNOTIFY(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is_NOTIFY")().asInstanceOf[Boolean]

inline def isOPTIONS(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is_OPTIONS")().asInstanceOf[Boolean]

inline def isPRACK(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is_PRACK")().asInstanceOf[Boolean]

inline def isPUBLISH(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is_PUBLISH")().asInstanceOf[Boolean]

inline def isREGISTER(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is_REGISTER")().asInstanceOf[Boolean]

inline def isSUBSCRIBE(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is_SUBSCRIBE")().asInstanceOf[Boolean]

inline def isUPDATE(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is_UPDATE")().asInstanceOf[Boolean]

inline def isbflagset(flag: Flag): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isbflagset")(flag.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isbiflagset(flag: Flag, branch: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isbiflagset")(flag.asInstanceOf[js.Any], branch.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def isdsturiset(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isdsturiset")().asInstanceOf[Boolean]

inline def isflagset(flag: Flag): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isflagset")(flag.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def issflagset(flag: Flag): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("issflagset")(flag.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def log(
  level: typings.kamailioKemi.kamailioKemiStrings.dbg | typings.kamailioKemi.kamailioKemiStrings.info | warn | crit | typings.kamailioKemi.kamailioKemiStrings.err,
  msg: String
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("log")(level.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def resetbflag(flag: Flag): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("resetbflag")(flag.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def resetbiflag(flag: Flag, branch: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("resetbiflag")(flag.asInstanceOf[js.Any], branch.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def resetdsturi(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("resetdsturi")().asInstanceOf[Boolean]

inline def resetflag(flag: Flag): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("resetflag")(flag.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def resetsflag(flag: Flag): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("resetsflag")(flag.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def setAdvertisedAddress(addr: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("set_advertised_address")(addr.asInstanceOf[js.Any]).asInstanceOf[Double]

inline def setAdvertisedPort(port: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("set_advertised_port")(port.asInstanceOf[js.Any]).asInstanceOf[Double]

inline def setDrop(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("set_drop")().asInstanceOf[Unit]

inline def setForwardClose(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("set_forward_close")().asInstanceOf[Boolean]

inline def setForwardNoConnect(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("set_forward_no_connect")().asInstanceOf[Boolean]

inline def setReplyClose(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("set_reply_close")().asInstanceOf[Boolean]

inline def setReplyNoConnect(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("set_reply_no_connect")().asInstanceOf[Boolean]

inline def setbflag(flag: Flag): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("setbflag")(flag.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def setbiflag(flag: Flag, branch: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("setbiflag")(flag.asInstanceOf[js.Any], branch.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def setdsturi(uri: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("setdsturi")(uri.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def setflag(flag: Flag): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("setflag")(flag.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def sethost(host: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("sethost")(host.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def setsflag(flag: Flag): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("setsflag")(flag.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def seturi(uri: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("seturi")(uri.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def setuser(usr: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("setuser")(usr.asInstanceOf[js.Any]).asInstanceOf[Boolean]
