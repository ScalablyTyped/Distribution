package typings.ltijs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object providerMod {
  
  type OnConnectCallback = js.Function4[
    /* connection */ typings.ltijs.idTokenMod.IdToken, 
    /* request */ typings.express.mod.Request_[
      typings.expressServeStaticCore.mod.ParamsDictionary, 
      js.Any, 
      js.Any, 
      typings.expressServeStaticCore.mod.Query
    ], 
    /* response */ typings.express.mod.Response_[js.Any], 
    /* next */ typings.express.mod.NextFunction, 
    typings.express.mod.Response_[js.Any] | scala.Unit
  ]
  
  type ServerAddonFunction = js.Function1[/* app */ typings.express.mod.Express, scala.Unit]
}
