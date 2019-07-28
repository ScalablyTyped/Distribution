package typings.imap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object imapStrings {
  @js.native
  sealed trait attributes extends js.Object
  
  @js.native
  sealed trait body extends js.Object
  
  @js.native
  sealed trait end extends js.Object
  
  @js.native
  sealed trait error extends js.Object
  
  @js.native
  sealed trait message extends js.Object
  
  @scala.inline
  def attributes: attributes = "attributes".asInstanceOf[attributes]
  @scala.inline
  def body: body = "body".asInstanceOf[body]
  @scala.inline
  def end: end = "end".asInstanceOf[end]
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def message: message = "message".asInstanceOf[message]
}

