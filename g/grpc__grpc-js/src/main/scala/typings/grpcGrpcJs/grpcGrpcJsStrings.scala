package typings.grpcGrpcJs

import typings.grpcGrpcJs.serverCallMod.HandlerType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object grpcGrpcJsStrings {
  @js.native
  sealed trait bidi extends HandlerType
  
  @js.native
  sealed trait clientStream extends HandlerType
  
  @js.native
  sealed trait close extends js.Object
  
  @js.native
  sealed trait data extends js.Object
  
  @js.native
  sealed trait drain extends js.Object
  
  @js.native
  sealed trait end extends js.Object
  
  @js.native
  sealed trait error extends js.Object
  
  @js.native
  sealed trait finish extends js.Object
  
  @js.native
  sealed trait metadata extends js.Object
  
  @js.native
  sealed trait pause extends js.Object
  
  @js.native
  sealed trait pipe extends js.Object
  
  @js.native
  sealed trait readable extends js.Object
  
  @js.native
  sealed trait resume extends js.Object
  
  @js.native
  sealed trait serverStream extends HandlerType
  
  @js.native
  sealed trait status extends js.Object
  
  @js.native
  sealed trait unary extends HandlerType
  
  @js.native
  sealed trait unpipe extends js.Object
  
  @scala.inline
  def bidi: bidi = "bidi".asInstanceOf[bidi]
  @scala.inline
  def clientStream: clientStream = "clientStream".asInstanceOf[clientStream]
  @scala.inline
  def close: close = "close".asInstanceOf[close]
  @scala.inline
  def data: data = "data".asInstanceOf[data]
  @scala.inline
  def drain: drain = "drain".asInstanceOf[drain]
  @scala.inline
  def end: end = "end".asInstanceOf[end]
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def finish: finish = "finish".asInstanceOf[finish]
  @scala.inline
  def metadata: metadata = "metadata".asInstanceOf[metadata]
  @scala.inline
  def pause: pause = "pause".asInstanceOf[pause]
  @scala.inline
  def pipe: pipe = "pipe".asInstanceOf[pipe]
  @scala.inline
  def readable: readable = "readable".asInstanceOf[readable]
  @scala.inline
  def resume: resume = "resume".asInstanceOf[resume]
  @scala.inline
  def serverStream: serverStream = "serverStream".asInstanceOf[serverStream]
  @scala.inline
  def status: status = "status".asInstanceOf[status]
  @scala.inline
  def unary: unary = "unary".asInstanceOf[unary]
  @scala.inline
  def unpipe: unpipe = "unpipe".asInstanceOf[unpipe]
}

