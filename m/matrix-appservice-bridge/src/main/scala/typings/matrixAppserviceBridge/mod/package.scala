package typings.matrixAppserviceBridge.mod

import typings.matrixAppserviceBridge.libComponentsMembershipQueueMod.MembershipQueueOptsWithDefaults
import typings.matrixAppserviceBridge.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def APPSERVICE_LOGIN_TYPE: /* "m.login.application_service" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("APPSERVICE_LOGIN_TYPE").asInstanceOf[/* "m.login.application_service" */ String]

inline def BRIDGE_PING_EVENT_TYPE: /* "org.matrix.bridge.ping" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("BRIDGE_PING_EVENT_TYPE").asInstanceOf[/* "org.matrix.bridge.ping" */ String]

inline def BRIDGE_PING_TIMEOUT_MS: /* 60000 */ Double = ^.asInstanceOf[js.Dynamic].selectDynamic("BRIDGE_PING_TIMEOUT_MS").asInstanceOf[/* 60000 */ Double]

inline def DEFAULT_OPTS: MembershipQueueOptsWithDefaults = ^.asInstanceOf[js.Dynamic].selectDynamic("DEFAULT_OPTS").asInstanceOf[MembershipQueueOptsWithDefaults]

inline def DefaultCacheForMs: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("DefaultCacheForMs").asInstanceOf[Double]

inline def DefaultDisallowedIpRanges: js.Array[String] = ^.asInstanceOf[js.Dynamic].selectDynamic("DefaultDisallowedIpRanges").asInstanceOf[js.Array[String]]

inline def MaxCacheForMs: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("MaxCacheForMs").asInstanceOf[Double]

inline def MinCacheForMs: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("MinCacheForMs").asInstanceOf[Double]

inline def getBridgeVersion(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getBridgeVersion")().asInstanceOf[String]
inline def getBridgeVersion(packageJsonPath: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getBridgeVersion")(packageJsonPath.asInstanceOf[js.Any]).asInstanceOf[String]

inline def identifyPackageFile(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("identifyPackageFile")().asInstanceOf[js.UndefOr[String]]

inline def setBridgeVersion(version: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setBridgeVersion")(version.asInstanceOf[js.Any]).asInstanceOf[Unit]
