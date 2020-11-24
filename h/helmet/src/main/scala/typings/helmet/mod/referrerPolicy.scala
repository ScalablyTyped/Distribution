package typings.helmet.mod

import org.scalablytyped.runtime.TopLevel
import typings.helmet.anon.ReadonlyReferrerPolicyOpt
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("helmet/dist", "referrerPolicy")
@js.native
object referrerPolicy
  extends TopLevel[
      js.Function1[
        /* options */ js.UndefOr[ReadonlyReferrerPolicyOpt], 
        js.Function3[
          /* _req */ IncomingMessage, 
          /* res */ ServerResponse, 
          /* next */ js.Function0[Unit], 
          Unit
        ]
      ]
    ]
