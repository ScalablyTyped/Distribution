package typings.ldapjs.mod

import typings.ldapjs.mod.^
import typings.ldapjs.mod.dn.DN
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def createClient(): Client = ^.asInstanceOf[js.Dynamic].applyDynamic("createClient")().asInstanceOf[Client]
inline def createClient(options: ClientOptions): Client = ^.asInstanceOf[js.Dynamic].applyDynamic("createClient")(options.asInstanceOf[js.Any]).asInstanceOf[Client]

inline def createServer(): Server = ^.asInstanceOf[js.Dynamic].applyDynamic("createServer")().asInstanceOf[Server]
inline def createServer(options: ServerOptions): Server = ^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(options.asInstanceOf[js.Any]).asInstanceOf[Server]

inline def parseDN(dn: String): DN = ^.asInstanceOf[js.Dynamic].applyDynamic("parseDN")(dn.asInstanceOf[js.Any]).asInstanceOf[DN]

inline def parseFilter(filterString: String): Filter = ^.asInstanceOf[js.Dynamic].applyDynamic("parseFilter")(filterString.asInstanceOf[js.Any]).asInstanceOf[Filter]

type CallBack = js.Function2[/* error */ Error | Null, /* result */ js.UndefOr[Any], Unit]

type CompareCallback = js.Function2[/* error */ Error | Null, /* matched */ js.UndefOr[Boolean], Unit]

type Control = Any

type ErrorCallback = js.Function1[/* error */ Error, Unit]

type ExopCallback = js.Function3[/* error */ Error | Null, /* value */ String, /* result */ js.UndefOr[Any], Unit]

type SearchCallBack = js.Function2[/* error */ Error | Null, /* result */ SearchCallbackResponse, Unit]

type SearchReference = Any
