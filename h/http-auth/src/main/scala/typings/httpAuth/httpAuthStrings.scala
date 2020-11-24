package typings.httpAuth

import typings.httpAuth.mod.Algorithm
import typings.httpAuth.mod.Qop
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object httpAuthStrings {
  
  @scala.inline
  def MD5: MD5 = "MD5".asInstanceOf[MD5]
  
  @scala.inline
  def `MD5-sess`: `MD5-sess` = "MD5-sess".asInstanceOf[`MD5-sess`]
  
  @scala.inline
  def auth: auth = "auth".asInstanceOf[auth]
  
  @scala.inline
  def close: close = "close".asInstanceOf[close]
  
  @scala.inline
  def data: data = "data".asInstanceOf[data]
  
  @scala.inline
  def end: end = "end".asInstanceOf[end]
  
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  
  @scala.inline
  def fail: fail = "fail".asInstanceOf[fail]
  
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  
  @scala.inline
  def pause: pause = "pause".asInstanceOf[pause]
  
  @scala.inline
  def readable: readable = "readable".asInstanceOf[readable]
  
  @scala.inline
  def resume: resume = "resume".asInstanceOf[resume]
  
  @scala.inline
  def success: success = "success".asInstanceOf[success]
  
  @js.native
  sealed trait MD5 extends Algorithm
  
  @js.native
  sealed trait `MD5-sess` extends Algorithm
  
  @js.native
  sealed trait auth extends Qop
  
  @js.native
  sealed trait close extends js.Object
  
  @js.native
  sealed trait data extends js.Object
  
  @js.native
  sealed trait end extends js.Object
  
  @js.native
  sealed trait error extends js.Object
  
  @js.native
  sealed trait fail extends js.Object
  
  @js.native
  sealed trait none extends Qop
  
  @js.native
  sealed trait pause extends js.Object
  
  @js.native
  sealed trait readable extends js.Object
  
  @js.native
  sealed trait resume extends js.Object
  
  @js.native
  sealed trait success extends js.Object
}
