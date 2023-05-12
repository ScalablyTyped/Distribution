package typings.hapiJwt.mod

import typings.hapiHapi.libTypesPluginMod.Plugin
import typings.hapiJwt.mod.^
import typings.hapiJwt.mod.hapiJwt.Crypto
import typings.hapiJwt.mod.hapiJwt.Token
import typings.hapiJwt.mod.hapiJwt.Utils
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def crypto: Crypto = ^.asInstanceOf[js.Dynamic].selectDynamic("crypto").asInstanceOf[Crypto]
inline def crypto_=(x: Crypto): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("crypto")(x.asInstanceOf[js.Any])

inline def plugin: Plugin[Unit, Unit] = ^.asInstanceOf[js.Dynamic].selectDynamic("plugin").asInstanceOf[Plugin[Unit, Unit]]
inline def plugin_=(x: Plugin[Unit, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("plugin")(x.asInstanceOf[js.Any])

inline def token: Token = ^.asInstanceOf[js.Dynamic].selectDynamic("token").asInstanceOf[Token]
inline def token_=(x: Token): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("token")(x.asInstanceOf[js.Any])

inline def utils: Utils = ^.asInstanceOf[js.Dynamic].selectDynamic("utils").asInstanceOf[Utils]
inline def utils_=(x: Utils): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("utils")(x.asInstanceOf[js.Any])
