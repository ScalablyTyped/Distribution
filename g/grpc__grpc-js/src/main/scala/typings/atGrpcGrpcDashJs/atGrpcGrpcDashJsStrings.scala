package typings.atGrpcGrpcDashJs

import typings.atGrpcGrpcDashJs.buildSrcServerDashCallMod.HandlerType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object atGrpcGrpcDashJsStrings {
  @js.native
  sealed trait bidi extends HandlerType
  
  @js.native
  sealed trait clientStream extends HandlerType
  
  @js.native
  sealed trait data extends js.Object
  
  @js.native
  sealed trait metadata extends js.Object
  
  @js.native
  sealed trait serverStream extends HandlerType
  
  @js.native
  sealed trait status extends js.Object
  
  @js.native
  sealed trait unary extends HandlerType
  
  @scala.inline
  def bidi: bidi = "bidi".asInstanceOf[bidi]
  @scala.inline
  def clientStream: clientStream = "clientStream".asInstanceOf[clientStream]
  @scala.inline
  def data: data = "data".asInstanceOf[data]
  @scala.inline
  def metadata: metadata = "metadata".asInstanceOf[metadata]
  @scala.inline
  def serverStream: serverStream = "serverStream".asInstanceOf[serverStream]
  @scala.inline
  def status: status = "status".asInstanceOf[status]
  @scala.inline
  def unary: unary = "unary".asInstanceOf[unary]
}

