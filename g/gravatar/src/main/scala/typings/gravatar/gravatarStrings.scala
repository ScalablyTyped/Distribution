package typings.gravatar

import typings.gravatar.mod.Protocol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gravatarStrings {
  
  @js.native
  sealed trait http
    extends StObject
       with Protocol
  inline def http: http = "http".asInstanceOf[http]
  
  @js.native
  sealed trait https
    extends StObject
       with Protocol
  inline def https: https = "https".asInstanceOf[https]
}
