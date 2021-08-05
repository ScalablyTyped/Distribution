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
  sealed trait close extends StObject
  inline def close: close = "close".asInstanceOf[close]
  
  @js.native
  sealed trait data extends StObject
  inline def data: data = "data".asInstanceOf[data]
  
  @js.native
  sealed trait end extends StObject
  inline def end: end = "end".asInstanceOf[end]
  
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
  sealed trait pause extends StObject
  inline def pause: pause = "pause".asInstanceOf[pause]
  
  @js.native
  sealed trait readable extends StObject
  inline def readable: readable = "readable".asInstanceOf[readable]
  
  @js.native
  sealed trait resume extends StObject
  inline def resume: resume = "resume".asInstanceOf[resume]
  
  @js.native
  sealed trait success extends StObject
  inline def success: success = "success".asInstanceOf[success]
}
