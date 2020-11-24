package typings.helmet.mod

import org.scalablytyped.runtime.TopLevel
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("helmet/dist", "xssFilter")
@js.native
object xssFilter
  extends TopLevel[
      js.Function0[
        js.Function3[
          /* _req */ IncomingMessage, 
          /* res */ ServerResponse, 
          /* next */ js.Function0[Unit], 
          Unit
        ]
      ]
    ]
