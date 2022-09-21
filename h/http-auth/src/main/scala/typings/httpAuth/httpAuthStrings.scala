package typings.httpAuth

import typings.httpAuth.mod.Algorithm
import typings.httpAuth.mod.Qop
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object httpAuthStrings {
  
  @js.native
  sealed trait MD5
    extends StObject
       with Algorithm
  inline def MD5: MD5 = "MD5".asInstanceOf[MD5]
  
  @js.native
  sealed trait `MD5-sess`
    extends StObject
       with Algorithm
  inline def `MD5-sess`: `MD5-sess` = "MD5-sess".asInstanceOf[`MD5-sess`]
  
  @js.native
  sealed trait auth
    extends StObject
       with Qop
  inline def auth: auth = "auth".asInstanceOf[auth]
  
  @js.native
  sealed trait error extends StObject
  inline def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait fail extends StObject
  inline def fail: fail = "fail".asInstanceOf[fail]
  
  @js.native
  sealed trait none
    extends StObject
       with Qop
  inline def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait success extends StObject
  inline def success: success = "success".asInstanceOf[success]
}
