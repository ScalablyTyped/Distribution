package typings.helmet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object contentSecurityPolicyMod {
  
  type ContentSecurityPolicyDirectiveValue = java.lang.String | typings.helmet.contentSecurityPolicyMod.ContentSecurityPolicyDirectiveValueFunction
  
  type ContentSecurityPolicyDirectiveValueFunction = js.Function2[
    /* req */ typings.node.httpMod.IncomingMessage, 
    /* res */ typings.node.httpMod.ServerResponse, 
    java.lang.String
  ]
  
  type ContentSecurityPolicyDirectives = org.scalablytyped.runtime.StringDictionary[
    typings.std.Iterable[typings.helmet.contentSecurityPolicyMod.ContentSecurityPolicyDirectiveValue]
  ]
}
