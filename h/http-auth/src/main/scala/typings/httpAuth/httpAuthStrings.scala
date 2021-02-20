package typings.httpAuth

import typings.httpAuth.mod.Algorithm
import typings.httpAuth.mod.Qop
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object httpAuthStrings {
  
  @js.native
  sealed trait MD5 extends Algorithm
  @scala.inline
  def MD5: MD5 = "MD5".asInstanceOf[MD5]
  
  @js.native
  sealed trait `MD5-sess` extends Algorithm
  @scala.inline
  def `MD5-sess`: `MD5-sess` = "MD5-sess".asInstanceOf[`MD5-sess`]
  
  @js.native
  sealed trait auth extends Qop
  @scala.inline
  def auth: auth = "auth".asInstanceOf[auth]
  
  @js.native
  sealed trait close extends StObject
  @scala.inline
  def close: close = "close".asInstanceOf[close]
  
  @js.native
  sealed trait data extends StObject
  @scala.inline
  def data: data = "data".asInstanceOf[data]
  
  @js.native
  sealed trait end extends StObject
  @scala.inline
  def end: end = "end".asInstanceOf[end]
  
  @js.native
  sealed trait error extends StObject
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait fail extends StObject
  @scala.inline
  def fail: fail = "fail".asInstanceOf[fail]
  
  @js.native
  sealed trait none extends Qop
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait pause extends StObject
  @scala.inline
  def pause: pause = "pause".asInstanceOf[pause]
  
  @js.native
  sealed trait readable extends StObject
  @scala.inline
  def readable: readable = "readable".asInstanceOf[readable]
  
  @js.native
  sealed trait resume extends StObject
  @scala.inline
  def resume: resume = "resume".asInstanceOf[resume]
  
  @js.native
  sealed trait success extends StObject
  @scala.inline
  def success: success = "success".asInstanceOf[success]
}
