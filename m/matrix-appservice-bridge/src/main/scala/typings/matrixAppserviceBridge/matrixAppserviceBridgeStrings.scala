package typings.matrixAppserviceBridge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object matrixAppserviceBridgeStrings {
  @js.native
  sealed trait offline extends js.Object
  
  @js.native
  sealed trait online extends js.Object
  
  @js.native
  sealed trait `private` extends js.Object
  
  @js.native
  sealed trait public extends js.Object
  
  @js.native
  sealed trait trusted_private_chat extends js.Object
  
  @js.native
  sealed trait unavailable extends js.Object
  
  @scala.inline
  def offline: offline = "offline".asInstanceOf[offline]
  @scala.inline
  def online: online = "online".asInstanceOf[online]
  @scala.inline
  def `private`: `private` = "private".asInstanceOf[`private`]
  @scala.inline
  def public: public = "public".asInstanceOf[public]
  @scala.inline
  def trusted_private_chat: trusted_private_chat = "trusted_private_chat".asInstanceOf[trusted_private_chat]
  @scala.inline
  def unavailable: unavailable = "unavailable".asInstanceOf[unavailable]
}

