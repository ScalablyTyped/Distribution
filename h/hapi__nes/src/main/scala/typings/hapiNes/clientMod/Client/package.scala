package typings.hapiNes.clientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object Client {
  
  type Handler = js.Function2[
    /* message */ js.Any, 
    /* flags */ typings.hapiNes.clientMod.Client.ClientSubscribeFlags, 
    scala.Unit
  ]
}
